package ale.compiler.generator

import ale.compiler.generator.Graph.GraphNode
import ale.utils.AleEcoreUtil
import ale.xtext.ale.AleClass
import ale.xtext.ale.Method
import ale.xtext.ale.Root
import com.google.inject.Inject
import java.util.Collection
import java.util.HashSet
import java.util.List
import java.util.Set
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.util.EcoreUtil

class GraphUtil {
	private ResourceSet resSet
	AleEcoreUtil aleEcoreUtil = new AleEcoreUtil()

	new(ResourceSet resSet) {
		this.resSet = resSet
	}

	public def Graph<EClass> buildGraph(EPackage ePackage) {
		return this.buildGraph(newArrayList(ePackage))
	}

	public def Graph<EClass> buildGraph(List<EPackage> ePackages) {
		val graph1 = new Graph<EClass>()
		val visitedPackages = newHashSet()
		ePackages.forEach[visitPackages(visitedPackages, graph1)]
		return graph1
	}

	private def void visitPackages(EPackage ePackage, HashSet<EPackage> visitedpackage, Graph<EClass> graph1) {
		if (ePackage !== null)
			visitedpackage.add(ePackage)

		val allEClasses = ePackage.allEClasses
		allEClasses.forEach[e | addParents(graph1, e)]
		allEClasses.forEach[e | e.EReferences.directlyRelatedTypes.forEach[f | addParents(graph1, f)]]

		val notYetVisited = graph1.nodes.sortBy[elem.name].map[elem.EPackage].toSet.filter[e | !visitedpackage.contains(e)]
		notYetVisited.forEach[visitPackages(visitedpackage, graph1)]
	}

	private def List<EClass> allEClasses(EPackage ePackage) {
		val allContent = ePackage.eAllContents.toList
		return allContent.filter(EClass).map[EcoreUtil.resolve(it, resSet) as EClass].toList
	}

	private def void addParents(Graph<EClass> graph1, EClass e) {
		val node = graph1.addNode(e)

		e.ESuperTypes.forEach[f |
			val node2 = graph1.addNode(f)
			graph1.addEdge(node, node2)
			addParents(graph1, f)
		]
	}

	private def List<EClass> getDirectlyRelatedTypes(EList<EReference> list) {
		return list.map[EType].filter(EClass).filter[!EPackage.name.equals("ecore")].toList
	}

	private def Set<EPackage> getAllDirectPackagesByReference(Iterable<GraphNode> nodes, List<EPackage> ePackages) {
		return nodes.map[elem.EReferences].map[directlyRelatedTypes].flatten.map[EPackage].toSet
		//.filter [ e | !ePackages.contains(e)]
	}

	private def Set<EPackage> getAllDirectPackagesByReference(Iterable<GraphNode> nodes, EPackage ePackage) {
		return nodes.getAllDirectPackagesByReference(newArrayList(ePackage))
	}

	public def List<EPackage> allDirectPackages(Iterable<GraphNode> nodes, EPackage ePackage) {
		return this.allDirectPackages(nodes, newArrayList(ePackage))
	}

	public def List<EPackage> allDirectPackages(Iterable<GraphNode> nodes, List<EPackage> ePackages) {
		val allDirectPackagesByInheritance = nodes.getDirectPackageByInheritance(ePackages)
		val allDirectPackageByReference = nodes.getAllDirectPackagesByReference(ePackages)

		allDirectPackagesByInheritance.addAll(allDirectPackageByReference)
		allDirectPackagesByInheritance.addAll(ePackages)
		return allDirectPackagesByInheritance.toSet.toList.sortBy[name]
	}

	private def Set<EPackage> getDirectPackageByInheritance(Iterable<GraphNode> nodes, List<EPackage> ePackages) {
		return nodes.map[outgoing].flatten.map[elem.EPackage].toSet
		//.filter[!ePackages.contains(it)]
	}

	private def Set<EPackage> getDirectPackageByInheritance(Iterable<GraphNode> nodes, EPackage ePackage) {
		return nodes.getDirectPackageByInheritance(newArrayList(ePackage))
	}

	public def List<EClass> getListAllClasses(List<EPackage> ePackages) {
		val graph = ePackages.buildGraph
		return graph.nodes.map[elem].toList
	}

	private def List<EClass> getListAllClasses(EPackage ePackage) {
		return this.getListAllClasses(newArrayList(ePackage))
	}

	public def List<EClass> allClassesRec(EPackage e) {
		val graph = e.buildGraph
		return graph.nodes.map[elem].toList.sortBy[name]
	}
	
	public def List<EClass> allClassesRec(Root root) {
		val List<EPackage> ePackages = root.importsEcore.map[aleEcoreUtil.loadEPackageByEcorePath(it.ref, resSet)].toList
		val graph = ePackages.buildGraph
		return graph.nodes.map[elem].toList.sortBy[name]
	}

	public def Collection<EClass> ancestors(EClass clazz) {
		val ret = newHashSet()

		if (!clazz.ESuperTypes.empty)
			clazz.ESuperTypes.forEach[st |
				ret.add(st)
				ret.addAll(st.ancestors)
			]

		return ret
	}

	public def String operationInterfacePath(EClass clazz, String aleName)
		'''«aleName».revisitor.operation.«aleName.toFirstUpper»«clazz.name.toFirstUpper»Operation'''

	def EClass getEClass(AleClass aleClass, List<EPackage> ePackages) {
		val classes = ePackages.listAllClasses
		return classes.filter[name == aleClass.name].head
	}

	public def List<Method> methodsRec(AleClass aleClass, boolean includeSelf) {
		val List<Method> ret = if(includeSelf) newArrayList(aleClass.methods) else newArrayList()

		aleClass.superClass.forEach[parent |
			// getAll parents methods
			val tmp = parent.methodsRec(true)
			tmp.forEach[tmpM |
				// only add missing ones
				if (!ret.exists[name == tmpM.name && params.size == tmpM.params.size])
					ret.add(tmpM)
			]
		]

		// find syntactic hierarchy for implicit import of parents
//		val EClass eClass = aleClass.getEClass(ePackages)
		
//		for(EClass parent: eClass.ESuperTypes) {
//			parent.
//		}

		return ret
	}
}
