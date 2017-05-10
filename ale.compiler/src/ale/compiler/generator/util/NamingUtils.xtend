package ale.compiler.generator.util

import ale.xtext.ale.AleClass
import ale.xtext.ale.Root
import org.eclipse.emf.ecore.EClass

class NamingUtils {
	def String getRootNameOrDefault(Root root) {
		return
			if (root === null) "common"
			else root.name
	}

	def String getRootNameOrDefault(AleClass root) {
		return
			if (root === null) return "common"
			else (root.eContainer() as Root).name
	}

	public def String getOperationInterfacePath(EClass clazz, String aleName)
		'''«aleName».revisitor.operation.«aleName.toFirstUpper»«clazz.name.toFirstUpper»Operation'''
}
