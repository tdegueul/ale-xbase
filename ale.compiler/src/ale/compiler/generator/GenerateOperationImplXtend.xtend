package ale.compiler.generator

import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.EClass
import ale.xtext.ale.AleClass
import ale.xtext.ale.Root
import java.util.List
import org.eclipse.emf.ecore.EPackage

class GenerateOperationImplXtend {

	extension GraphUtil graphUtil
	extension TypeUtil typeUtil
	extension JavaPathUtil javaPathUtil= new JavaPathUtil
	ResourceSet resSet

	new(ResourceSet resSet) {
		this.resSet = resSet;
		this.graphUtil = new GraphUtil(resSet)
		this.typeUtil = new TypeUtil(resSet)
	}

	def String generate(EClass eClass, AleClass aleClass, List<EPackage> ePackages, Root root) {
		val packageName = eClass.EPackage.name
		val aleName = if(aleClass != null) (aleClass.eContainer as Root).
				name else "void"

		val clazzName = '''«packageName.toFirstUpper»«aleName.toFirstUpper»«eClass.name»Operation'''
		'''
		package «packageName».«aleName».revisitor.operation.impl;
		
		public class «clazzName»Impl implements «packageName».«aleName».revisitor.operation.«clazzName»
		{
			
			private final «eClass.javaFullPath» self;
			private final «aleName».revisitor.«aleName.toFirstUpper»Revisitor alg;
			public «clazzName»Impl(«eClass.javaFullPath» self, «aleName».revisitor.«aleName.toFirstUpper»Revisitor alg) {
				this.self = self;
				this.alg = alg;
			}
«««			TODO: Dealing with inherited methods !!!
			«IF aleClass != null»
			«FOR method: aleClass.methods»
			@Override
			public «method.type.solveStaticType(ePackages)» «method.name»(«FOR p: method.params»«p.type.solveStaticType(ePackages)» «p.name»«ENDFOR») {
				«IF method.type != null»
				return null;
				«ENDIF»
			}
			«ENDFOR»
			«ENDIF»
		}'''
	}
}
