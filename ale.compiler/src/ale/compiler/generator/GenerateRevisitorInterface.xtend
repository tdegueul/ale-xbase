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

class GenerateRevisitorInterface {

	private def Graph<EClass> buildGraph(EPackage ePackage) {
		val graph1 = new Graph<EClass>()
		val vp = newHashSet()
		visitPackages(vp, ePackage, graph1)
		graph1
	}

	private def List<EClass> allEClasses(EPackage ePackage) {
		ePackage.eAllContents.filter[it instanceof EClass].map[it as EClass].toList
	}

	private def List<EClass> getDirectlyRelatedTypes(EList<EReference> list) {
		list.map[f|f.EType].filter[z|z instanceof EClass].map[q|q as EClass].filter [ x |
			!x.EPackage.name.equals("ecore")
		].toList
	}

	private def void visitPackages(HashSet<EPackage> visitedpackage, EPackage ePackage, Graph<EClass> graph1) {
		if(ePackage != null) visitedpackage.add(ePackage)
		val allEClasses = ePackage.allEClasses
		allEClasses.forEach[e|addParents(graph1, e)]
		allEClasses.forEach[e|e.EReferences.directlyRelatedTypes.forEach[f|addParents(graph1, f)]]

		val notYetVisited = graph1.nodes.sortBy[e|e.elem.name].map[e|e.elem.EPackage].toSet.filter [ e |
			!visitedpackage.contains(e)
		]
		notYetVisited.forEach [ e |
			visitPackages(visitedpackage, e, graph1)
		]
	}

	private def void addParents(Graph<EClass> graph1, EClass e) {
		// println('''# Add class «e.name»''')
		val node = graph1.addNode(e)
		e.ESuperTypes.forEach [ f |
			val node2 = graph1.addNode(f)
			graph1.addEdge(node, node2)
			addParents(graph1, f)
		]
	}

	private def List<EPackage> allDirectPackages(Iterable<GraphNode<EClass>> nodes, EPackage ePackage) {
		val allDirectPackagesByInheritance = nodes.getDirectPackageByInheritance(ePackage)
		val allDirectPackageByReference = nodes.getAllDirectPackagesByReference(ePackage)
		allDirectPackagesByInheritance.addAll(allDirectPackageByReference)
		allDirectPackagesByInheritance.toSet.toList.sortBy[name]
	}

	private def Set<EPackage> getDirectPackageByInheritance(Iterable<GraphNode<EClass>> nodes, EPackage ePackage) {
		nodes.map[e|e.outgoing].flatten.map[e|e.elem.EPackage].filter [ e |
			!e.equals(ePackage)
		].toSet
	}

	private def Set<EPackage> getAllDirectPackagesByReference(Iterable<GraphNode<EClass>> nodes, EPackage ePackage) {
		nodes.map[e|e.elem.EReferences].map[e|e.directlyRelatedTypes].flatten.map[e|e.EPackage].filter [ e |
			!e.equals(ePackage)
		].toSet
	}
	
	def allClassesRec(EPackage e) {
		val graph = buildGraph(e)
		graph.nodes.map[elem].toList.sortBy[name]
	}
	
	
	public def List<EClass> getListAllClasses(EPackage ePackage) {
		val graph = ePackage.buildGraph
		graph.nodes.map[elem].toList
	}

	def String generate(EPackage ePackage) {

		// 1 - gather all classes
		val graph = ePackage.buildGraph
		// 2 - gather all directly referenced packages
		val allMethods = graph.nodes.filter[it.elem.EPackage == ePackage].filter[!it.elem.abstract].sortBy[it.elem.name]
		val allDirectPackages = allMethods.allDirectPackages(ePackage)
		val allClasses = ePackage.getListAllClasses
		val classPlusItsChildren = allClasses.map[currentParent | currentParent -> {
			val tmp = allClasses.filter[ac | currentParent.isSuperTypeOf(ac) ].toList
			new DollarGeneratorUtil().sortForDollars(tmp)
			tmp
		}]
		
		'''
				package «ePackage.name».algebra;
				
				public interface «ePackage.toPackageName»«FOR clazz : graph.nodes.sortBy[x|x.elem.name] BEFORE '<' SEPARATOR ',' AFTER '>'»«clazz.elem.genericType(true)»«ENDFOR»
					«FOR ePp : allDirectPackages.sortBy[name] BEFORE ' extends ' SEPARATOR ', '»«ePp.name».algebra.«ePp.toPackageName»«FOR x : ePp.allClassesRec BEFORE '<' SEPARATOR ', ' AFTER '>'»«x.genericType(false)»«ENDFOR»«ENDFOR» {
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

		def String genericType(EClass clazz,
			boolean extend) '''«clazz.EPackage.name.replaceAll("\\.","").toFirstUpper»__«clazz.name»T«IF clazz.ESuperTypes.size == 1 && extend» extends «clazz.ESuperTypes.head.genericType(false)»«ENDIF»'''

		private def static toPackageName(EPackage ePackage) '''«ePackage.name.toClassName»Algebra'''

		private def static String toClassName(String name) {
			name.split("\\.").map[e|e.toFirstUpper].join
		}

		private def static javaFullPath(EClass eClass) '''«eClass.EPackage.name».«eClass.name»'''

	}
	