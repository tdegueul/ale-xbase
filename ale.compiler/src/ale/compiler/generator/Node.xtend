package ale.compiler.generator

import java.util.List

class Node<T> {
	List<Node<T>> childen = newArrayList()
	T value
	Node<T> parent

	new(T t) {
		this.value = t
	}

	def boolean hasChilden() {
		return !childen.empty
	}

	def boolean isRoot() {
		return this.parent === null
	}

	def void addChild(Node<T> t) {
		childen.add(t)
		t.parent = this
	}

	def List<T> toList() {
		val ret = newArrayList()
		ret.addAll(childen.map[toList].flatten)
		ret.add(value)
		return ret
	}
}
