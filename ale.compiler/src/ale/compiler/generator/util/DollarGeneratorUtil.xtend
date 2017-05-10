package ale.compiler.generator.util

import java.util.List
import org.eclipse.emf.ecore.EClass

class DollarGeneratorUtil {
	def void sortForDollars(List<EClass> eclasses) {
		eclasses.sort([c1, c2 |
			if (c1.isSuperTypeOf(c2)) 1 
			else if (c2.isSuperTypeOf(c1)) -1 
			else 0]) 
	}
}
