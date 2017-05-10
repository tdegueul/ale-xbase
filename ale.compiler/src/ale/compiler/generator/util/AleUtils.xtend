package ale.compiler.generator.util

import ale.utils.EcoreUtils
import ale.xtext.ale.AleClass
import ale.xtext.ale.Method
import ale.xtext.ale.Root
import java.util.List
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.resource.ResourceSet

class AleUtils {
	extension EcoreUtils = new EcoreUtils()

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

	def List<EClass> allClasses(Root root, ResourceSet rs) {
		val ePackages = root.importsEcore.map[rs.loadEPackage(ref)]
		return ePackages.allClasses
	}
}
