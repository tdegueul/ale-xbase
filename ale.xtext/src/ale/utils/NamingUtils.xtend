package ale.utils

import ale.xtext.ale.AleClass
import ale.xtext.ale.Root
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage

class NamingUtils {
	def String getRootName(AleClass cls)
		'''«(cls.eContainer as Root).name»'''

	def String getRevisitorPackageFqn(EPackage pkg)
		'''«pkg.name».revisitor'''

	def String getRevisitorInterfaceName(EPackage pkg)
		'''«pkg.name.toFirstUpper»Revisitor'''

	def String getRevisitorInterfaceFqn(EPackage pkg)
		'''«pkg.revisitorPackageFqn».«pkg.revisitorInterfaceName»'''

	def String getRevisitorInterfacePath(EPackage pkg)
		'''src/«pkg.name»/revisitor'''

	def String getRevisitorPackageFqn(Root root)
		'''«root.name».revisitor'''

	def String getRevisitorInterfaceName(Root root)
		'''«root.name.toFirstUpper»Revisitor'''

	def String getRevisitorInterfaceFqn(Root root)
		'''«root.revisitorPackageFqn».«root.revisitorInterfaceName»'''

	def String getRevisitorInterfacePath(Root root)
		'''src/«root.name»/revisitor'''

	def String getOperationPackageFqn(AleClass cls)
		'''«cls.rootName».revisitor.operations'''

	def String getOperationInterfaceName(AleClass aleCls)
		'''«aleCls.name»Operation'''

	def String getOperationInterfaceFqn(AleClass aleCls)
		'''«aleCls.operationPackageFqn».«aleCls.operationInterfaceName»'''

	def String getOperationInterfacePath(AleClass cls)
		'''src/«cls.rootName»/revisitor/operations'''

	def String getOperationImplPackageFqn(AleClass cls)
		'''«cls.operationPackageFqn».impl'''

	def String getOperationImplName(AleClass aleCls)
		'''«aleCls.operationInterfaceName»Impl'''

	def String getOperationImplFqn(AleClass aleCls)
		'''«aleCls.operationImplPackageFqn».«aleCls.operationImplName»'''

	def String getOperationImplPath(AleClass cls)
		'''src/«cls.rootName»/revisitor/operations/impl'''

	def String getTypeParamName(EClass cls)
		'''«cls.EPackage.name.replaceAll("\\.", "").toFirstUpper»__«cls.name»T'''

	def String getDenotationName(EClass cls)
		'''«cls.name.toFirstLower»'''

	def String getDenotationName(EClass parent, EClass child)
		'''«parent.name.toFirstLower»_«child.name.toFirstLower»'''

	def String getVarName(EClass cls)
		'''«cls.name.toFirstLower.charAt(0)»'''
}
