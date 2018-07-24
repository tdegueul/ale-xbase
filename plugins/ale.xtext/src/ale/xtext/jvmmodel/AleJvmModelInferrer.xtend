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
import java.util.Comparator
import java.util.List
import org.eclipse.emf.codegen.ecore.genmodel.GenClass
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtend.lib.annotations.Data
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import java.util.Map
import org.eclipse.xtext.util.IResourceScopeCache

class AleJvmModelInferrer extends AbstractModelInferrer {
	AleRoot root
	EPackage pkg
	GenModel gm
	List<Pair<ResolvedClass, ResolvedClass>> resolved = newArrayList
	private JvmTypeReference cachedRevSignature = null
	
	@Inject IResourceScopeCache cache
	
	@Inject extension JvmTypesBuilder
	@Inject extension EcoreUtils
	@Inject extension NamingUtils
	@Inject extension AleUtils

	@Data
	public static class ResolvedClass {
		AleClass aleCls
		public EClass eCls
		GenClass genCls
	}

	private def preProcess() {
		pkg = root.ecoreImport.uri.loadEPackage
		gm = root.ecoreImport.uri.loadCorrespondingGenmodel

		if (pkg === null || gm === null)
			return false

		// Create missing AleClasses
		pkg.allClasses.forEach[eCls |
			if (!root.classes.exists[name == eCls.name])
				root.classes += AleFactory::eINSTANCE.createAleClass => [
					name = eCls.name
					abstract = eCls.abstract
				]
		]


		val resolved = newArrayList()
		root.classes
			.sortBy[name]
			.forEach[aleCls |
				val eCls = pkg.allClasses.findFirst[name == aleCls.name]
				val genCls = if (eCls !== null) eCls.getGenClass(gm)
				if(aleCls !== null && eCls !== null && genCls !== null)
					resolved += new ResolvedClass(aleCls, eCls, genCls)
				else
					println('''Class «aleCls» has not been resolved''') 
			]
			
		this.resolved = resolved.buildExtendedFactoryNames
	}
	
	def List<Pair<ResolvedClass, ResolvedClass>> buildExtendedFactoryNames(List<ResolvedClass> classes) {

		val List<Pair<ResolvedClass, Iterable<ResolvedClass>>> a = classes.map [
			val List<ResolvedClass> st = newArrayList()
			it.eCls.EAllSuperTypes.forEach[stp|st.add(classes.findFirst[eCls == stp])]
			st.add(it)
			(it -> st.filter[it !== null && it.eCls !== null]
				.map[it.eCls.ESuperTypes].filter[it.size > 1].flatten.map[stp | classes.findFirst[eCls == stp]]
			)
		]

		val List<Pair<ResolvedClass, Iterable<ResolvedClass>>> b = a.sortWith(
			Comparator.comparing([Pair<ResolvedClass, Iterable<ResolvedClass>> t|t.key.eCls.name]).
				thenComparing([ Pair<ResolvedClass, Iterable<ResolvedClass>> t |
					t.key.eCls.EPackage.name
				])
		)

		val List<List<Pair<ResolvedClass, ResolvedClass>>> c = b.map [ p |
			val List<Pair<ResolvedClass, ResolvedClass>> ret = newArrayList();
			val k = p.key
			ret.add((k -> null))
			val pv = p.value
			val List<Pair<ResolvedClass, ResolvedClass>> ll = if (pv !== null) pv.map[l|(k -> l)].toList else newArrayList
			ret.addAll(ll)
			ret
		]

		c.flatten.toList
	}

	def dispatch void infer(AleRoot modelRoot, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		root = modelRoot

		preProcess()
		
		inferRevisitorImplementation(acceptor)

		resolved
			.forEach[
				inferOperationInterface(acceptor)

				// Don't infer implementation for @Required classes
				if (!key.eCls.hasRequiredAnnotation)
					inferOperationImplementation(acceptor)
			]
	}

	private def void inferRevisitorImplementation(IJvmDeclaredTypeAcceptor acceptor) {
		acceptor.accept(root.toClass(root.revisitorInterfaceFqn))[
			interface = true

			superTypes +=
				pkg.revisitorInterfaceFqn.typeRef(
					resolved.map[key.aleCls.toOperationInterfaceType]
				)

			resolved
				.filter[key.eCls !== null]
				.filter[!key.eCls.abstract]
				.forEach[r |
					val returnType = r.key.aleCls.toOperationInterfaceType

					members += r.key.aleCls.toMethod(r.denotationName, returnType)[
						annotations += Override.annotationRef
						parameters += r.key.aleCls.toParameter(r.key.eCls.varName, r.key.genCls.qualifiedInterfaceName.typeRef)
						body =
							if (r.key.aleCls.generated || r.key.aleCls.findNearestGeneratedParent !== null)
								'''return new «r.key.aleCls.toOperationImplType.qualifiedName»(«r.key.eCls.varName», this);'''
							else
								'''return null;'''
					]
			]
		]
	}
	
	def String getDenotationName(Pair<ResolvedClass,ResolvedClass> pcls) {
		val cls = pcls.key.eCls
		if(pcls.value === null)
			cls.denotationName
		else
			'''«cls.denotationName»__AS__«pcls.value.eCls.denotationName»'''
	}

	private def void inferOperationInterface(Pair<ResolvedClass, ResolvedClass> r, IJvmDeclaredTypeAcceptor acceptor) {
		acceptor.accept(r.key.aleCls.toClass(r.key.aleCls.operationInterfaceFqn))[
			interface = true

			superTypes +=
				r.key.eCls.getAllAleClasses(root)
				.filter[it != r.key.aleCls && generated]
				.map[operationInterfaceFqn.typeRef]

			members += r.key.aleCls.methods.map[m |
				m.toMethod(m.name, m.type)[
					abstract = true
					parameters += m.params.map[cloneWithProxies]
				]
			]
		]
	}

	private def void inferOperationImplementation(Pair<ResolvedClass, ResolvedClass> r, IJvmDeclaredTypeAcceptor acceptor) {
		acceptor.accept(r.key.aleCls.toClass(r.key.aleCls.operationImplFqn))[
			val superOp = r.key.aleCls.findNearestGeneratedParent

			abstract = r.key.aleCls.abstract

			superTypes += r.key.aleCls.operationInterfaceFqn.typeRef

			// In case of multiple-inheritance, we should
			// use some kind of delegate instead
			if (superOp !== null && !(superOp.abstract || r.key.eCls.ESuperTypes.exists[hasRequiredAnnotation]))
				superTypes += superOp.operationImplFqn.typeRef

			val asig = algSignature

			members += r.key.aleCls.toField("obj", r.key.genCls.qualifiedInterfaceName.typeRef)
			members += r.key.aleCls.toField("alg", asig)

			members += r.key.aleCls.toConstructor()[
				parameters += r.key.aleCls.toParameter("obj", r.key.genCls.qualifiedInterfaceName.typeRef)
				parameters += r.key.aleCls.toParameter("alg", asig)

				body = '''
«««					«IF superOp !== null»super(obj, alg);«ENDIF»
					«IF superOp !== null && !(superOp.abstract || r.key.eCls.ESuperTypes.exists[hasRequiredAnnotation])»super(obj, alg);«ENDIF»
					this.obj = obj;
					this.alg = alg;
				'''
			]


			val methods = r.key.aleCls.methods
			members += methods.filter[it instanceof ConcreteMethod].map [ m |
				m.toMethod(m.name, m.type) [
					abstract = m instanceof AbstractMethod
					annotations += Override.annotationRef
					parameters += m.params.map[cloneWithProxies]

					if (m instanceof ConcreteMethod)
						if (r.key.aleCls.methods.contains(m))
							body = m.block
				]
			]
		]
	}

	private def JvmTypeReference getAlgSignature() {
		if (cachedRevSignature === null)
			cachedRevSignature = typeRef(pkg.revisitorInterfaceFqn, resolved.map [
				key.aleCls.toOperationInterfaceType.wildcardExtends
			])
		return cachedRevSignature
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
	
//	def JvmTypeReference typeRef(Class<?> clazz, JvmTypeReference... typeArgs) {
//		val key = typeArgs + #[clazz]
//		if (!typecache.containsKey(key)) {
//			println('CACHE MISS ' + key)
//			return typecache.put(key, _typeReferenceBuilder.typeRef(clazz, typeArgs))
//		} else {
//			println('CACHE HIT')
//			return typecache.get(key)
//		}
//	}
//
//	def JvmTypeReference typeRef(String typeName, JvmTypeReference... typeArgs) {
//		val key = typeArgs + #[typeName]
//		if (!typecache.containsKey(key)) {
//			println('CACHE MISS ' + key)
//			return typecache.put(key, _typeReferenceBuilder.typeRef(typeName, typeArgs))
//		} else {
//			println('CACHE HIT')
//			return typecache.get(key)
//		}
//	}
//
//	def JvmTypeReference typeRef(JvmType type, JvmTypeReference... typeArgs) {
//		val key = typeArgs + #[type]
//		if (!typecache.containsKey(key)) {
//			println('CACHE MISS ' + key)
//			return typecache.put(key, _typeReferenceBuilder.typeRef(type, typeArgs))
//		} else {
//			println('CACHE HIT')
//			return typecache.get(key)
//		}
//	}
}
