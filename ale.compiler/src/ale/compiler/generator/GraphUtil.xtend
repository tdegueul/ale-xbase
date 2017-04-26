package ale.compiler.generator

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import java.util.List
import java.util.HashSet
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.ResourceSet
import java.util.Set
import ale.compiler.generator.Graph.GraphNode
import java.util.Collection
import ale.xtext.ale.Root
import ale.utils.AleEcoreUtil

class GraphUtil {

	private ResourceSet resSet
	private AleEcoreUtil aleEcoreUtil;

	new(ResourceSet resSet) {
		this.resSet = resSet;
		aleEcoreUtil = new AleEcoreUtil
	}

	public def Graph<EClass> buildGraph(EPackage ePackage) {
		this.buildGraph(newArrayList(ePackage))
	}

	public def Graph<EClass> buildGraph(List<EPackage> ePackages) {
		val graph1 = new Graph<EClass>()
		val visitedPackages = newHashSet()
		ePackages.forEach[it.visitPackages(visitedPackages, graph1)]
		graph1
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

	private def List<EClass> allEClasses(EPackage ePackage) {
		val allContent = ePackage.eAllContents.toList
		allContent.filter[it instanceof EClass].map[EcoreUtil.resolve(it, resSet)].map[it as EClass].toList
	}

	private def void addParents(Graph<EClass> graph1, EClass e) {
		val node = graph1.addNode(e)
		e.ESuperTypes.forEach [ f |
			val node2 = graph1.addNode(f)
			graph1.addEdge(node, node2)
			addParents(graph1, f)
		]
	}

	private def List<EClass> getDirectlyRelatedTypes(EList<EReference> list) {
		list.map[f|f.EType].filter[z|z instanceof EClass].map[q|q as EClass].filter [ x |
			!x.EPackage.name.equals("ecore")
		].toList
	}

	private def Set<EPackage> getAllDirectPackagesByReference(Iterable<GraphNode> nodes, List<EPackage> ePackages) {
		nodes.map[e|e.elem.EReferences].map[e|e.directlyRelatedTypes].flatten.map[e|e.EPackage].filter [ e |
			!ePackages.contains(e)
		].toSet
	}

	private def Set<EPackage> getAllDirectPackagesByReference(Iterable<GraphNode> nodes, EPackage ePackage) {
		nodes.getAllDirectPackagesByReference(newArrayList(ePackage))
	}

	public def List<EPackage> allDirectPackages(Iterable<GraphNode> nodes, EPackage ePackage) {
		this.allDirectPackages(nodes, newArrayList(ePackage))
	}

	public def List<EPackage> allDirectPackages(Iterable<GraphNode> nodes, List<EPackage> ePackages) {
		val allDirectPackagesByInheritance = nodes.getDirectPackageByInheritance(ePackages)
		val allDirectPackageByReference = nodes.getAllDirectPackagesByReference(ePackages)
		allDirectPackagesByInheritance.addAll(allDirectPackageByReference)
		allDirectPackagesByInheritance.toSet.toList.sortBy[name]
	}

	private def Set<EPackage> getDirectPackageByInheritance(Iterable<GraphNode> nodes, List<EPackage> ePackages) {
		nodes.map[e|e.outgoing].flatten.map[e|e.elem.EPackage].filter[!ePackages.contains(it)].toSet
	}

	private def Set<EPackage> getDirectPackageByInheritance(Iterable<GraphNode> nodes, EPackage ePackage) {
		nodes.getDirectPackageByInheritance(newArrayList(ePackage))
	}

	public def List<EClass> getListAllClasses(List<EPackage> ePackages) {
		val graph = ePackages.buildGraph
		graph.nodes.map[elem].toList
	}

	private def List<EClass> getListAllClasses(EPackage ePackage) {
		this.getListAllClasses(newArrayList(ePackage))
	}

	public def allClassesRec(EPackage e) {
		val graph = e.buildGraph
		graph.nodes.map[elem].toList.sortBy[name]
	}
	
	public def allClassesRec(Root root) {
		val List<EPackage> ePackages = root.importsEcore.map[aleEcoreUtil.loadEPackageByEcorePath(it.ref, resSet)].toList
		val graph = ePackages.buildGraph
		graph.nodes.map[elem].toList.sortBy[name]
	}

	public def Collection<EClass> ancestors(EClass clazz) {
		val ret = newHashSet()
		if (!clazz.ESuperTypes.empty) {
			clazz.ESuperTypes.forEach [ st |
				ret.add(st)
				ret.addAll(st.ancestors)
			]
		}

		ret
	}
}
