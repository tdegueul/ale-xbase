package ale.compiler.generator

import java.util.Set
import org.eclipse.emf.ecore.EClass

class Graph<E> {
	static class GraphNode {
		public EClass elem
		private Set<GraphNode> incoming = newHashSet()
		private Set<GraphNode> outgoing = newHashSet()

		new(EClass elem) {
			this.elem = elem
		}
		
		private def addOutgoing(GraphNode x) {
			outgoing.add(x)
		}

		private def addIncoming(GraphNode x) {
			incoming.add(x)
		}

		def getOutgoing() {
			outgoing
		}
		
		def getIncoming() {
			incoming
		}
		
		
		// returns all incoming nodes, recursivelly
		def getIncomings() {
			val elems = newHashSet()
			getIncomings(this, elems)
			elems
		}
		
		private def getIncomings(GraphNode current, Set<GraphNode> e) {
			current.incoming.forEach[ci |
				if(!e.contains(ci)) {
					getIncomings(ci, e)
					e.add(ci)
				}
			]
		}

		def isRoot() {
			outgoing.empty
		}

		def Set<GraphNode> getRoots() {
			if (isRoot) {
				newHashSet(this)
			} else {
				outgoing.map[roots].flatten.toSet
			}
		}

		override boolean equals(Object obj) {
			if (obj instanceof GraphNode) {
				obj.elem == elem
			} else {
				false
			}
		}

		override String toString() {
			'''Node («elem»)'''
		}

		override int hashCode() {
			elem.hashCode()
		}

		private def Set<GraphNode> getParents() {
			val ret = newHashSet();
			ret.addAll(this.outgoing)
			outgoing.forEach[x|ret.addAll(x.parents)]
			ret
		}

		def Set<GraphNode> getChildren() {
			val ret = newHashSet();
			ret.addAll(this.incoming)
			incoming.forEach[x|ret.addAll(x.children)]
			ret
		}

		def Integer distanceFromRoot(EClass class1) {
			if (class1.equals(elem)) {
				0
			} else {
				outgoing.map[distanceFromRoot(class1) + 1].min
			}
		}

	}

	public Set<GraphNode> nodes = newHashSet()

	def addNode(EClass elem) {
		val nE = new GraphNode(elem)
		nodes.add(nE)
		nodes.findFirst[it == nE]
	}

	def addEdge(GraphNode elem1, GraphNode elem2) {
		elem1.addOutgoing(elem2)
		elem2.addIncoming(elem1)

	}

	def getRoots() {
		nodes.filter[isRoot]
	}

	override String toString() {
		'''Graph («FOR n : nodes SEPARATOR ', '»«n»«ENDFOR»)'''
	}

	def Set<Set<GraphNode>> clusters() {
		val ret = newHashSet()
		nodes.forEach [ GraphNode x |
			if (!ret.exists [ Set<GraphNode> y |
				y.contains(x) || y.containsSome(x.parents) || y.containsSome(x.children)
			]) {
				val nhs = newHashSet()
				nhs.add(x)
				nhs.addAll(x.parents)
				nhs.addAll(x.children)
				ret.add(nhs)
			} else {

				/*
				 * If some sets exists with elements common to the current elem (itself of its parents/childen) they are merge into a single set  
				 */
				val set = ret.filter[y|y.contains(x) || y.containsSome(x.parents) || y.containsSome(x.children)].toList
				
				ret.removeAll(set);

				val newSet = newHashSet()
				set.forEach[u|newSet.addAll(u)]

				newSet.addAll(x.parents)
				newSet.addAll(x.children)
				ret.add(newSet)
			}
		]
		ret
	}

	private def boolean containsSome(Set<?> nodes, Set<?> nodes2) {
		nodes.exists[e|nodes2.contains(e)]
	}

}
