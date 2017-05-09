package ale.compiler.generator

import ale.compiler.generator.util.NameUtil
import ale.xtext.ale.Root
import java.util.List
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.ResourceSet

class GenerateRevisitorImplXtend {
	extension GraphUtil graphUtil
	extension JavaPathUtil javaPathUtil = new JavaPathUtil()
	extension TypeUtil typeUtil
	extension NameUtil nameUtil = new NameUtil()

	new(ResourceSet resSet) {
		this.graphUtil = new GraphUtil(resSet)
		this.typeUtil = new TypeUtil(resSet)
	}

	def String generate(Root root, List<EPackage> ePackages) {
		// TODO: définir la liste de toutes les méthodes à définir
		val graph = ePackages.buildGraph
		val aleName = root.name

		return '''
			package «aleName».revisitor.impl;
			
			public interface «aleName.toFirstUpper»RevisitorImpl extends «aleName».revisitor.«aleName.toFirstUpper»Revisitor
				«FOR clazz : graph.nodes.sortBy[elem.name].map[elem] BEFORE '<' SEPARATOR ',' AFTER '>'»«clazz.operationInterfacePath(clazz.getMatchingRoot(root).rootNameOrDefault)»«ENDFOR» {
				«FOR clazz : graph.nodes.sortBy[elem.name].filter[!elem.abstract].map[elem]»
				@Override
				default «clazz.operationInterfacePath(clazz.getMatchingRoot(root).rootNameOrDefault)» «clazz.name.toFirstLower»(final «clazz.javaFullPath» «clazz.name.toFirstLower») {
					return new «clazz.getMatchingRoot(root).rootNameOrDefault».revisitor.operation.impl.«clazz.getMatchingRoot(root).rootNameOrDefault.toFirstUpper»«clazz.name.toFirstUpper»OperationImpl(«clazz.name.toFirstLower», this);
				} 
				«FOR parent: clazz.ancestors»
				@Override
				default «clazz.operationInterfacePath(clazz.getMatchingRoot(root).rootNameOrDefault)» «parent.name.toFirstLower»_«clazz.name.toFirstLower»(final «clazz.javaFullPath» «clazz.name.toFirstLower») {
					return new «clazz.getMatchingRoot(root).rootNameOrDefault».revisitor.operation.impl.«clazz.getMatchingRoot(root).rootNameOrDefault.toFirstUpper»«clazz.name.toFirstUpper»OperationImpl(«clazz.name.toFirstLower», this);
				} 
				«ENDFOR»
				«ENDFOR»
			}
		'''
	}
}
