package ale.xtext.utils

import ale.xtext.ale.AleClass
import ale.xtext.ale.AleRoot
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtext.EcoreUtil2

class NamingUtils {
	def String getRootName(AleClass cls)
		'''«(cls.eContainer as AleRoot).name»'''

	def String getRevisitorPackageFqn(EPackage pkg)
		'''«pkg.name».revisitor'''

	def String getRevisitorInterfaceName(EPackage pkg)
		'''«pkg.name.toFirstUpper»Revisitor'''

	def String getRevisitorInterfaceFqn(EPackage pkg)
		'''«pkg.revisitorPackageFqn».«pkg.revisitorInterfaceName»'''

	def String getRevisitorInterfacePath(EPackage pkg)
		'''src/«pkg.name»/revisitor'''

	def String getRevisitorPackageFqn(AleRoot root)
		'''«root.name».revisitor'''

	def String getRevisitorInterfaceName(AleRoot root)
		'''«root.name.toFirstUpper»Revisitor'''

	def String getRevisitorInterfaceFqn(AleRoot root)
		'''«root.revisitorPackageFqn».«root.revisitorInterfaceName»'''

	def String getRevisitorInterfacePath(AleRoot root)
		'''src/«root.name»/revisitor'''

	def String getOperationPackageFqn(AleClass cls)
		'''«cls.rootName».revisitor.operations.«EcoreUtil2.getContainerOfType(cls, AleRoot).name»'''

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
		'''«cls.EPackage.name.toFirstLower»__«cls.name»'''

	def String getDenotationName(EClass parent, EClass child)
		'''«parent.denotationName»_«child.denotationName»'''

	def String getVarName(EClass cls)
		'''it'''
}
