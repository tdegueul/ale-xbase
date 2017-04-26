package ale.compiler.generator

import ale.xtext.ale.Root
import java.util.List
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.ResourceSet

class GenerateRevisitorImplXtend {

	extension GraphUtil graphUtil
	extension JavaPathUtil javaPathUtil = new JavaPathUtil
	extension TypeUtil typeUtil

	new(ResourceSet resSet) {
		this.graphUtil = new GraphUtil(resSet)
		this.typeUtil = new TypeUtil(resSet)
	}

	def String generate(Root root, List<EPackage> ePackages) {

		// TODO: définir la liste de toutes les méthodes à définir
		val graph = ePackages.buildGraph
		val aleName = root.
			name

		'''
			package «aleName».revisitor.impl;
			
			public interface «aleName.toFirstUpper»RevisitorImpl extends «aleName».revisitor.«aleName.toFirstUpper»Revisitor
				«FOR clazz : graph.nodes.sortBy[x|x.elem.name].map[elem] BEFORE '<' SEPARATOR ',' AFTER '>'»«clazz.operationInterfacePath(clazz.getMatchingRoot(root).name)»«ENDFOR» {
				«FOR clazz : graph.nodes.sortBy[elem.name].filter[c|!c.elem.abstract].map[elem]»
				@Override
				default «clazz.operationInterfacePath(clazz.getMatchingRoot(root).name)» «clazz.name.toFirstLower»(final «clazz.javaFullPath» «clazz.name.toFirstLower») {
					return new «clazz.getMatchingRoot(root).name».revisitor.operation.impl.«clazz.getMatchingRoot(root).name.toFirstUpper»«clazz.name.toFirstUpper»OperationImpl(«clazz.name.toFirstLower», this);
				} 
				«FOR parent: clazz.ancestors»
				@Override
				default «clazz.operationInterfacePath(clazz.getMatchingRoot(root).name)» «parent.name.toFirstLower»_«clazz.name.toFirstLower»(final «clazz.javaFullPath» «clazz.name.toFirstLower») {
					return new «clazz.getMatchingRoot(root).name».revisitor.operation.impl.«clazz.getMatchingRoot(root).name.toFirstUpper»«clazz.name.toFirstUpper»OperationImpl(«clazz.name.toFirstLower», this);
				} 
				«ENDFOR»
				«ENDFOR»
			}
		'''
	}
}
