package brew.xtext.util

import brew.xtext.brew.BrewRoot
import brew.xtext.brew.ClassBind
import brew.xtext.brew.MethodBind

import static extension org.eclipse.xtext.EcoreUtil2.*

class NamingUtils extends ale.xtext.utils.NamingUtils {
	def String getRevisitorPackageFqn(BrewRoot root) '''«root.name».revisitor.impl'''

	def String getRevisitorInterfaceName(BrewRoot root) '''«root.name.toFirstUpper»Revisitor'''

	def String getRevisitorInterfaceFqn(BrewRoot root) '''«root.revisitorPackageFqn».«root.revisitorInterfaceName»'''

	def String getBindClassName(ClassBind classBind) '''«classBind.requiredCls.name»Bind«classBind.providedCls.name»'''

	def String getConverterClassFqn(MethodBind mb) {
		val root = mb.getContainerOfType(BrewRoot)
		'''«root.name».converters.«mb.convertClassName»'''
	}

	def String getConvertClassName(MethodBind mb) {
		val classBind = mb.getContainerOfType(ClassBind)
		'''«classBind.requiredCls.name»To«classBind.providedCls.name»With«mb.abstractMethod.name»To«mb.concreteMethod.name»'''
	}
}
