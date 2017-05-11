package ale.utils

import ale.xtext.ale.AleClass
import ale.xtext.ale.Method
import ale.xtext.ale.Root
import java.util.List
import java.util.Set

class AleUtils {
	def List<Method> getAllMethods(AleClass cls, boolean includeSelf) {
		val ret = newArrayList

		if (includeSelf)
			ret += cls.methods

		// FIXME: Incorrect check for duplicates
		cls.superClass.forEach[sup |
			ret +=
				sup.getAllMethods(true)
				.filter[m | !ret.exists[name == m.name && params.size == m.params.size]]
		]

		return ret
	}

	def List<Root> getAllParents(Root root, boolean includeSelf) {
		val ret = newHashSet
		if (includeSelf)
			ret += root
		root.importsAle.forEach[getAllParentsRec(ref, ret)]
		return ret.toList
	}

	private def void getAllParentsRec(Root root, Set<Root> ret) {
		ret += root
		root.importsAle.forEach[getAllParentsRec(ref, ret)]
	}
}
