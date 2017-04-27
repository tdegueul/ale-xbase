package ale.compiler.generator

import ale.xtext.ale.AleClass
import ale.xtext.ale.Root
import java.util.List
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.ResourceSet
import ale.compiler.generator.util.NameUtil

class GenerateOperationImplXtend {

	extension GraphUtil graphUtil
	extension TypeUtil typeUtil
	extension JavaPathUtil javaPathUtil= new JavaPathUtil
	GenerateMethodBodyXtend generateMethod 
	ResourceSet resSet
	extension NameUtil nameUtil = new NameUtil

	new(ResourceSet resSet) {
		this.resSet = resSet;
		this.graphUtil = new GraphUtil(resSet)
		this.typeUtil = new TypeUtil(resSet)
		this.generateMethod = new GenerateMethodBodyXtend(resSet)
	}

	def String generate(EClass eClass, AleClass aleClass, List<EPackage> ePackages, Root root) {
		val aleName = aleClass.rootNameOrDefault

		val clazzName = '''«aleName.toFirstUpper»«eClass.name»Operation'''
		val graph = ePackages.buildGraph
		
		'''
		package «aleName».revisitor.operation.impl;
		
		public class «clazzName»Impl implements «aleName».revisitor.operation.«clazzName»
		{
			
			private final «eClass.javaFullPath» self;
			«IF aleClass != null»
			private final «aleName».revisitor.«aleName.toFirstUpper»Revisitor«FOR clazzS: graph.nodes.map[elem].sortBy[it.name] BEFORE '<' SEPARATOR ', ' AFTER '>'»? extends «clazzS.operationInterfacePath(clazzS.getMatchingRoot(root).rootNameOrDefault)»«ENDFOR» alg;
			«ENDIF»
			
			«IF aleClass != null»
			«FOR parent: aleClass.superClass»
			private final «parent.rootNameOrDefault».revisitor.operation.impl.«parent.rootNameOrDefault.toFirstUpper»«parent.name.toFirstUpper»OperationImpl «parent.rootNameOrDefault»delegate;
			«ENDFOR»
			«ENDIF»
			
			public «clazzName»Impl(«eClass.javaFullPath» self, «IF aleClass != null»«aleName».revisitor.«aleName.toFirstUpper»Revisitor«FOR clazzS: graph.nodes.map[elem].sortBy[it.name] BEFORE '<' SEPARATOR ', ' AFTER '>'»? extends «clazzS.operationInterfacePath(clazzS.getMatchingRoot(root).rootNameOrDefault)»«ENDFOR»«ELSE»Object«ENDIF»  alg) {
				this.self = self;
				
				«IF aleClass != null»
				this.alg = alg;
				«FOR parent: aleClass.superClass»
				this.«parent.rootNameOrDefault»delegate = new «parent.rootNameOrDefault».revisitor.operation.impl.«parent.rootNameOrDefault.toFirstUpper»«parent.name.toFirstUpper»OperationImpl(self, alg);
				«ENDFOR»
				«ENDIF»
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
}
