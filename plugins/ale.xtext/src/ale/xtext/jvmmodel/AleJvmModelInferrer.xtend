package ale.xtext.jvmmodel

import ale.xtext.ale.AbstractMethod
import ale.xtext.ale.AleClass
import ale.xtext.ale.AleFactory
import ale.xtext.ale.AleRoot
import ale.xtext.ale.ConcreteMethod
import ale.xtext.utils.AleUtils
import ale.xtext.utils.EcoreUtils
import ale.xtext.utils.NamingUtils
import com.google.inject.Inject
import java.util.List
import org.eclipse.emf.codegen.ecore.genmodel.GenClass
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtend.lib.annotations.Data
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

class AleJvmModelInferrer extends AbstractModelInferrer {
	AleRoot root
	EPackage pkg
	GenModel gm
	List<ResolvedClass> resolved = newArrayList
	@Inject extension JvmTypesBuilder
	@Inject extension EcoreUtils
	@Inject extension NamingUtils
	@Inject extension AleUtils

	@Data
	public static class ResolvedClass {
		AleClass aleCls
		EClass eCls
		GenClass genCls
	}

	private def boolean preProcess() {
		pkg = root.ecoreImport.uri.loadEPackage
		gm = root.ecoreImport.uri.loadCorrespondingGenmodel

		if (pkg === null || gm === null)
			return false

		// Create missing AleClasses
		pkg.allClasses.forEach[eCls |
			if (!root.classes.exists[name == eCls.name])
				root.classes += AleFactory::eINSTANCE.createAleClass => [
					name = eCls.name
				]
		]

		root.classes
			.sortBy[name]
			.forEach[aleCls |
				val eCls = pkg.allClasses.findFirst[name == aleCls.name]
				val genCls = if (eCls !== null) eCls.getGenClass(gm)
				resolved += new ResolvedClass(aleCls, eCls, genCls)
			]

		return resolved.forall[aleCls !== null && eCls !== null && genCls !== null]
	}

	def dispatch void infer(AleRoot modelRoot, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		root = modelRoot

		if (!preProcess())
			return;

		inferRevisitorImplementation(acceptor)

		resolved
			.filter[aleCls.generated]
			.forEach[
				inferOperationInterface(acceptor)

				// Don't infer implementation for @Required classes
				if (!eCls.hasRequiredAnnotation)
					inferOperationImplementation(acceptor)
			]
	}

	private def void inferRevisitorImplementation(IJvmDeclaredTypeAcceptor acceptor) {
		acceptor.accept(root.toClass(root.revisitorInterfaceFqn))[
			interface = true

			superTypes +=
				pkg.revisitorInterfaceFqn.typeRef(
					resolved.map[aleCls.toOperationInterfaceType]
				)

			superTypes += root.aleImports.map[ref].map[revisitorInterfaceFqn.typeRef]

			resolved
				.filter[!eCls.abstract]
				.forEach[r |
					val returnType = r.aleCls.toOperationInterfaceType

					members += r.aleCls.toMethod(r.eCls.denotationName, returnType)[
						annotations += Override.annotationRef
						parameters += r.aleCls.toParameter(r.eCls.varName, r.genCls.qualifiedInterfaceName.typeRef)
						body =
							if (r.aleCls.generated || r.aleCls.findNearestGeneratedParent !== null)
								'''return new «r.aleCls.toOperationImplType.qualifiedName»(«r.eCls.varName», this);'''
							else
								'''return null;'''
					]

					r.eCls.ESuperTypes
						.drop(1)
						.forEach[cls |
							members += r.aleCls.toMethod(cls.getDenotationName(r.eCls), returnType)[
								annotations += Override.annotationRef
								parameters += r.aleCls.toParameter(r.eCls.varName, r.genCls.qualifiedInterfaceName.typeRef)
								body =
									if (r.aleCls.generated || r.aleCls.findNearestGeneratedParent !== null)
										'''return new «r.aleCls.toOperationImplType.qualifiedName»(«r.eCls.varName», this);'''
									else
										'''return null;'''
						]
					]
			]
		]
	}

	private def void inferOperationInterface(ResolvedClass r, IJvmDeclaredTypeAcceptor acceptor) {
		acceptor.accept(r.aleCls.toClass(r.aleCls.operationInterfaceFqn))[
			interface = true

			superTypes +=
				r.eCls.getAllAleClasses(root)
				.filter[it != r.aleCls && generated]
				.map[operationInterfaceFqn.typeRef]

			members += r.aleCls.methods.map[m |
				m.toMethod(m.name, m.type)[
					abstract = true
					parameters += m.params.map[cloneWithProxies]
				]
			]
		]
	}

	private def void inferOperationImplementation(ResolvedClass r, IJvmDeclaredTypeAcceptor acceptor) {
		acceptor.accept(r.aleCls.toClass(r.aleCls.operationImplFqn))[
			val superOp = r.aleCls.findNearestGeneratedParent

			abstract = r.aleCls.abstract

			superTypes += r.aleCls.operationInterfaceFqn.typeRef

			// In case of multiple-inheritance, we should
			// use some kind of delegate instead
			if (superOp !== null)
				superTypes += superOp.operationImplFqn.typeRef

			members += r.aleCls.toField("self", r.genCls.qualifiedInterfaceName.typeRef)
			members += r.aleCls.toField("alg", algSignature)

			members += r.aleCls.toConstructor()[
				parameters += r.aleCls.toParameter("self", r.genCls.qualifiedInterfaceName.typeRef)
				parameters += r.aleCls.toParameter("alg", algSignature)

				body = '''
					«IF superOp !== null»super(self, alg);«ENDIF»
					this.self = self;
					this.alg = alg;
				'''
			]

			members +=
				r.aleCls.methods.map[m |
					m.toMethod(m.name, m.type)[
						abstract = m instanceof AbstractMethod
						annotations += Override.annotationRef
						parameters += m.params.map[cloneWithProxies]

						if (m instanceof ConcreteMethod)
							if (r.aleCls.methods.contains(m))
								body = m.block
					]
				]
		]
	}

	private def JvmTypeReference getAlgSignature() {
		return typeRef(
			pkg.revisitorInterfaceFqn,
			resolved.map[aleCls.toOperationInterfaceType]
		)
	}

	private def JvmTypeReference toOperationInterfaceType(AleClass aleCls) {
		return
			if (aleCls.generated)
				aleCls.operationInterfaceFqn.typeRef
			else if (aleCls.findNearestGeneratedParent !== null)
				aleCls.findNearestGeneratedParent.operationInterfaceFqn.typeRef
			else
				Object.typeRef
	}

	private def JvmTypeReference toOperationImplType(AleClass aleCls) {
		return
			if (aleCls.generated)
				aleCls.operationImplFqn.typeRef
			else if (aleCls.findNearestGeneratedParent !== null)
				aleCls.findNearestGeneratedParent.operationImplFqn.typeRef
			else
				Object.typeRef
	}
}
