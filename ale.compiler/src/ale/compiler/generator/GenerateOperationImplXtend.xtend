package ale.compiler.generator

import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.EClass
import ale.xtext.ale.AleClass
import ale.xtext.ale.Root
import java.util.List
import org.eclipse.emf.ecore.EPackage
import ale.xtext.ale.Method

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
		val aleName = aleClass.aleRootName

		val clazzName = '''«aleName.toFirstUpper»«eClass.name»Operation'''
		'''
		package «aleName».revisitor.operation.impl;
		
		public class «clazzName»Impl implements «aleName».revisitor.operation.«clazzName»
		{
			
			private final «eClass.javaFullPath» self;
			private final «aleName».revisitor.«aleName.toFirstUpper»Revisitor alg;
			
			
			«FOR parent: aleClass.superClass»
			private final «parent.aleRootName».revisitor.operation.impl.«parent.aleRootName.toFirstUpper»«parent.name.toFirstUpper»OperationImpl «parent.aleRootName»delegate;
			«ENDFOR»
			
			public «clazzName»Impl(«eClass.javaFullPath» self, «aleName».revisitor.«aleName.toFirstUpper»Revisitor alg) {
				this.self = self;
				this.alg = alg;
				
				«FOR parent: aleClass.superClass»
				this.«parent.aleRootName»delegate = new «parent.aleRootName».revisitor.operation.impl.«parent.aleRootName.toFirstUpper»«parent.name.toFirstUpper»OperationImpl(self, alg);
				«ENDFOR»
			}
			«IF aleClass != null»
			«FOR method: aleClass.methodsRec»
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
	
	def List<Method> methodsRec(AleClass aleClass) {
		val List<Method> ret = newArrayList(aleClass.methods)
		for(AleClass parent: aleClass.superClass) {
			// getAll parents methods
			val tmp = parent.methodsRec
			for(Method tmpM: tmp) {
				
				// only add missing ones
				if(!ret.exists[it.name == tmpM.name && it.params.size == tmpM.params.size]) {
					ret.add(tmpM)
				}		
			}
		}
		ret
	}
	
	def String getAleRootName(AleClass aleClass) {
		if(aleClass != null) (aleClass.eContainer as Root).
				name else "void"
	}
}
