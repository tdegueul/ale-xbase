package brew.xtext.util

import brew.xtext.brew.BrewRoot
import brew.xtext.brew.ClassBind

class NamingUtils extends ale.xtext.utils.NamingUtils {
	def String getRevisitorPackageFqn(BrewRoot root) '''«root.name».revisitor.impl'''

	def String getRevisitorInterfaceName(BrewRoot root) '''«root.name.toFirstUpper»Revisitor'''

	def String getRevisitorInterfaceFqn(BrewRoot root) '''«root.revisitorPackageFqn».«root.revisitorInterfaceName»'''
	
	def String getBindClassName(ClassBind classBind ) '''«classBind.requiredCls.name»Bind«classBind.providedCls.name»'''

}
