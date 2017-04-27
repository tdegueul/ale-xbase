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
	GenerateMethodBodyXtend generateMethod 
	ResourceSet resSet

	new(ResourceSet resSet) {
		this.resSet = resSet;
		this.graphUtil = new GraphUtil(resSet)
		this.typeUtil = new TypeUtil(resSet)
		this.generateMethod = new GenerateMethodBodyXtend(resSet)
	}

	def String generate(EClass eClass, AleClass aleClass, List<EPackage> ePackages, Root root) {
		val aleName = aleClass.aleRootName

		val clazzName = '''«aleName.toFirstUpper»«eClass.name»Operation'''
		val graph = ePackages.buildGraph
		
		'''
		package «aleName».revisitor.operation.impl;
		
		public class «clazzName»Impl implements «aleName».revisitor.operation.«clazzName»
		{
			
			private final «eClass.javaFullPath» self;
			private final «aleName».revisitor.«aleName.toFirstUpper»Revisitor«FOR clazzS: graph.nodes.map[elem].sortBy[it.name] BEFORE '<' SEPARATOR ', ' AFTER '>'»? extends «clazzS.operationInterfacePath(clazzS.getMatchingRoot(root).name)»«ENDFOR» alg;
			
			
			«FOR parent: aleClass.superClass»
			private final «parent.aleRootName».revisitor.operation.impl.«parent.aleRootName.toFirstUpper»«parent.name.toFirstUpper»OperationImpl «parent.aleRootName»delegate;
			«ENDFOR»
			
			public «clazzName»Impl(«eClass.javaFullPath» self, «aleName».revisitor.«aleName.toFirstUpper»Revisitor«FOR clazzS: graph.nodes.map[elem].sortBy[it.name] BEFORE '<' SEPARATOR ', ' AFTER '>'»? extends «clazzS.operationInterfacePath(clazzS.getMatchingRoot(root).name)»«ENDFOR» alg) {
				this.self = self;
				this.alg = alg;
				
				«FOR parent: aleClass.superClass»
				this.«parent.aleRootName»delegate = new «parent.aleRootName».revisitor.operation.impl.«parent.aleRootName.toFirstUpper»«parent.name.toFirstUpper»OperationImpl(self, alg);
				«ENDFOR»
			}
			«IF aleClass != null»
			«FOR method: aleClass.methodsRec(true)»
			@Override
			public «method.type.solveStaticType(ePackages)» «method.name»(«FOR p: method.params»«p.type.solveStaticType(ePackages)» «p.name»«ENDFOR») {
				«generateMethod.generate(aleClass, method, ePackages, root)»
			}
			«ENDFOR»
			«ENDIF»
		}'''
	}
	
	
	
	def String getAleRootName(AleClass aleClass) {
		if(aleClass != null) (aleClass.eContainer as Root).
				name else "void"
	}
}
