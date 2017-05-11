package ale.compiler.generator.util

import ale.xtext.ale.AleClass
import ale.xtext.ale.Method
import java.util.List

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
}
