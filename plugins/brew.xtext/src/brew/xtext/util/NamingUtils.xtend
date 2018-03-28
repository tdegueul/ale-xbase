package brew.xtext.util

import brew.xtext.brew.BrewRoot

class NamingUtils extends ale.xtext.utils.NamingUtils {
	def String getRevisitorPackageFqn(BrewRoot root) '''«root.name».revisitor.impl'''
	
	def String getRevisitorInterfaceName(BrewRoot root)
		'''«root.name.toFirstUpper»Revisitor'''
	
	def String getRevisitorInterfaceFqn(BrewRoot root)
		'''«root.revisitorPackageFqn».«root.revisitorInterfaceName»'''
}
