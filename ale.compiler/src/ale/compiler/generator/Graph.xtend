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

		private def void addOutgoing(GraphNode x) {
			outgoing.add(x)
		}

		private def void addIncoming(GraphNode x) {
			incoming.add(x)
		}

		def Set<GraphNode> getOutgoing() {
			return outgoing
		}

		def Set<GraphNode> getIncoming() {
			return incoming
		}

		// returns all incoming nodes, recursively
		def Set<GraphNode> getIncomings() {
			val elems = newHashSet()
			getIncomingsRec(this, elems)
			return elems
		}

		private def void getIncomingsRec(GraphNode current, Set<GraphNode> e) {
			current.incoming.forEach[ci |
				if (!e.contains(ci)) {
					getIncomingsRec(ci, e)
					e.add(ci)
				}
			]
		}

		def boolean isRoot() {
			return outgoing.empty
		}

		def Set<GraphNode> getRoots() {
			return
				if (isRoot)
					newHashSet(this)
				else
					outgoing.map[roots].flatten.toSet
		}

		override boolean equals(Object obj) {
			return
				if (obj instanceof GraphNode)
					obj.elem == elem
				else
					false
		}

		override String toString()
			'''Node («elem»)'''

		override int hashCode() {
			return elem.hashCode()
		}

		private def Set<GraphNode> getParents() {
			val ret = newHashSet()
			ret.addAll(this.outgoing)
			outgoing.forEach[ret.addAll(parents)]
			return ret
		}

		def Set<GraphNode> getChildren() {
			val ret = newHashSet()
			ret.addAll(this.incoming)
			incoming.forEach[ret.addAll(children)]
			return ret
		}

		def Integer distanceFromRoot(EClass class1) {
			return
				if (class1.equals(elem))
					0
				else
					outgoing.map[distanceFromRoot(class1) + 1].min
		}
	}

	public Set<GraphNode> nodes = newHashSet()

	def GraphNode addNode(EClass elem) {
		val nE = new GraphNode(elem)
		nodes.add(nE)
		return nodes.findFirst[it == nE]
	}

	def void addEdge(GraphNode elem1, GraphNode elem2) {
		elem1.addOutgoing(elem2)
		elem2.addIncoming(elem1)
	}

	def Iterable<GraphNode> getRoots() {
		return nodes.filter[isRoot]
	}

	override String toString()
		'''Graph («FOR n : nodes SEPARATOR ', '»«n»«ENDFOR»)'''

	def Set<Set<GraphNode>> clusters() {
		val ret = newHashSet()

		nodes.forEach[x |
			if (!ret.exists[Set<GraphNode> y |
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
				val set = ret.filter[y | y.contains(x) || y.containsSome(x.parents) || y.containsSome(x.children)].toList

				ret.removeAll(set);

				val newSet = newHashSet()
				set.forEach[u | newSet.addAll(u)]

				newSet.addAll(x.parents)
				newSet.addAll(x.children)
				ret.add(newSet)
			}
		]

		return ret
	}

	private def boolean containsSome(Set<?> nodes, Set<?> nodes2) {
		return nodes.exists[nodes2.contains(it)]
	}
}
