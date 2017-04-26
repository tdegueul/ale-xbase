package ale.compiler.generator

import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EClass
import java.util.List
import java.util.HashSet
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EReference
import ale.compiler.generator.Graph.GraphNode
import java.util.Set
import java.util.Collection
import ale.compiler.generator.util.DollarGeneratorUtil
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.util.EcoreUtil

class GenerateRevisitorInterfaceXtend {

	private ResourceSet resSet;
	new(ResourceSet resSet) {
		this.resSet = resSet;
	}

	private def Graph<EClass> buildGraph(EPackage ePackage) {
		this.buildGraph(newArrayList(ePackage))
	}

	private def Graph<EClass> buildGraph(List<EPackage> ePackages) {
		val graph1 = new Graph<EClass>()
		val visitedPackages = newHashSet()
		ePackages.forEach[it.visitPackages(visitedPackages, graph1)]
		graph1
	}

	private def List<EClass> allEClasses(EPackage ePackage) {
		val allContent = ePackage.eAllContents.toList
		allContent.filter[it instanceof EClass].map[EcoreUtil.resolve(it, resSet)].map[it as EClass].toList
	}

	private def List<EClass> getDirectlyRelatedTypes(EList<EReference> list) {
		list.map[f|f.EType].filter[z|z instanceof EClass].map[q|q as EClass].filter [ x |
			!x.EPackage.name.equals("ecore")
		].toList
	}

	private def void visitPackages(EPackage ePackage, HashSet<EPackage> visitedpackage, Graph<EClass> graph1) {
		if(ePackage != null) visitedpackage.add(ePackage)
		val allEClasses = ePackage.allEClasses
		allEClasses.forEach[e|addParents(graph1, e)]
		allEClasses.forEach[e|e.EReferences.directlyRelatedTypes.forEach[f|addParents(graph1, f)]]

		val notYetVisited = graph1.nodes.sortBy[e|e.elem.name].map[e|e.elem.EPackage].toSet.filter [ e |
			!visitedpackage.contains(e)
		]
		notYetVisited.forEach[it.visitPackages(visitedpackage, graph1)]
	}

	private def void addParents(Graph<EClass> graph1, EClass e) {
		val node = graph1.addNode(e)
		e.ESuperTypes.forEach [ f |
			val node2 = graph1.addNode(f)
			graph1.addEdge(node, node2)
			addParents(graph1, f)
		]
	}

	private def List<EPackage> allDirectPackages(Iterable<GraphNode> nodes, List<EPackage> ePackages) {
		val allDirectPackagesByInheritance = nodes.getDirectPackageByInheritance(ePackages)
		val allDirectPackageByReference = nodes.getAllDirectPackagesByReference(ePackages)
		allDirectPackagesByInheritance.addAll(allDirectPackageByReference)
		allDirectPackagesByInheritance.toSet.toList.sortBy[name]
	}

	private def List<EPackage> allDirectPackages(Iterable<GraphNode> nodes, EPackage ePackage) {
		this.allDirectPackages(nodes, newArrayList(ePackage))
	}

	private def Set<EPackage> getDirectPackageByInheritance(Iterable<GraphNode> nodes, List<EPackage> ePackages) {
		nodes.map[e|e.outgoing].flatten.map[e|e.elem.EPackage].filter[!ePackages.contains(it)].toSet
	}

	private def Set<EPackage> getDirectPackageByInheritance(Iterable<GraphNode> nodes, EPackage ePackage) {
		nodes.getDirectPackageByInheritance(newArrayList(ePackage))
	}

	private def Set<EPackage> getAllDirectPackagesByReference(Iterable<GraphNode> nodes, List<EPackage> ePackages) {
		nodes.map[e|e.elem.EReferences].map[e|e.directlyRelatedTypes].flatten.map[e|e.EPackage].filter [ e |
			!ePackages.contains(e)
		].toSet
	}

	private def Set<EPackage> getAllDirectPackagesByReference(Iterable<GraphNode> nodes, EPackage ePackage) {
		nodes.getAllDirectPackagesByReference(newArrayList)
	}

	private def allClassesRec(EPackage e) {
		val graph = e.buildGraph
		graph.nodes.map[elem].toList.sortBy[name]
	}

	private def List<EClass> getListAllClasses(EPackage ePackage) {
		this.getListAllClasses(newArrayList(ePackage))
	}

	private def List<EClass> getListAllClasses(List<EPackage> ePackages) {
		val graph = ePackages.buildGraph
		graph.nodes.map[elem].toList
	}

	def String generate(String name, List<EPackage> ePackages) {
		// 1 - gather all classes
		val graph = ePackages.buildGraph
		// 2 - gather all directly referenced packages
		val allMethods = graph.nodes.filter[ePackages.contains(it.elem.EPackage)].filter[!it.elem.abstract].sortBy [
			it.elem.name
		]
		val allDirectPackages = allMethods.allDirectPackages(ePackages)
		val allClasses = ePackages.getListAllClasses
		val classPlusItsChildren = allClasses.
			map [ currentParent |
				currentParent -> {
					val tmp = allClasses.filter[ac|currentParent.isSuperTypeOf(ac)].toList
					new DollarGeneratorUtil().sortForDollars(tmp)
					tmp
				}
			]

		'''
			package «name».revisitor;
			
			public interface «name.toPackageName»«FOR clazz : graph.nodes.sortBy[x|x.elem.name] BEFORE '<' SEPARATOR ',' AFTER '>'»«clazz.elem.genericType(true)»«ENDFOR»
				«FOR ePp : allDirectPackages.sortBy[name] BEFORE ' extends ' SEPARATOR ', '»«ePp.name».revisitor.«ePp.name.toPackageName»«FOR x : ePp.allClassesRec BEFORE '<' SEPARATOR ', ' AFTER '>'»«x.genericType(false)»«ENDFOR»«ENDFOR» {
				«FOR clazzNode : allMethods»
				«clazzNode.elem.genericType(false)» «clazzNode.elem.name.toFirstLower»(final «clazzNode.elem.javaFullPath» «clazzNode.elem.name.toFirstLower»);
				«FOR parent: clazzNode.elem.ancestors»
					«parent.genericType(false)» «parent.name.toFirstLower»_«clazzNode.elem.name.toFirstLower»(final «clazzNode.elem.javaFullPath» «clazzNode.elem.name.toFirstLower»);
				«ENDFOR»
				
				«ENDFOR»
				
				«FOR dollarRoot : classPlusItsChildren»
				default «dollarRoot.key.genericType(false)» $(final «dollarRoot.key.javaFullPath» self) {
					«FOR subClass: dollarRoot.value.filter[it != dollarRoot.key]»
						«IF subClass.ESuperTypes.size <= 1»
							if(self instanceof «subClass.javaFullPath») return «subClass.name.toFirstLower»((«subClass.javaFullPath») self);
						«ELSE»
							if(self instanceof «subClass.javaFullPath») return «dollarRoot.key.name.toFirstLower»_«subClass.name.toFirstLower»((«subClass.javaFullPath») self);
						«ENDIF»
					«ENDFOR»
					«IF dollarRoot.key.abstract»
						return null;
					«ELSE»
						return «dollarRoot.key.name.toFirstLower»(self);
					«ENDIF»	
				}
				«ENDFOR»
			}
		'''
	}

	def String generate(EPackage ePackage) {
		this.generate(ePackage.name, newArrayList(ePackage))
	}

	private def Collection<EClass> ancestors(EClass clazz) {
		val ret = newHashSet()
		if (!clazz.ESuperTypes.empty) {
			clazz.ESuperTypes.forEach [ st |
				ret.add(st)
				ret.addAll(st.ancestors)
			]
		}

		ret
	}

	private def String genericType(EClass clazz,
		boolean extend) '''«clazz.EPackage.name.replaceAll("\\.","").toFirstUpper»__«clazz.name»T«IF clazz.ESuperTypes.size == 1 && extend» extends «clazz.ESuperTypes.head.genericType(false)»«ENDIF»'''

	private def static toPackageName(String name) '''«name.toClassName»Revisitor'''

	private def static String toClassName(String name) {
		name.split("\\.").map[e|e.toFirstUpper].join
	}

	private def static javaFullPath(EClass eClass) '''«eClass.EPackage.name».«eClass.name»'''

}
