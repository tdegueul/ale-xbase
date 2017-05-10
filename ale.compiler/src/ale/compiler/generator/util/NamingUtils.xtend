package ale.compiler.generator.util

import ale.xtext.ale.AleClass
import ale.xtext.ale.Root

class NamingUtils {
	def String rootNameOrDefault(Root root) {
		return
			if (root === null) "common"
			else root.name
	}

	def String rootNameOrDefault(AleClass root) {
		return
			if (root === null) return "common"
			else (root.eContainer() as Root).name
	}
}
