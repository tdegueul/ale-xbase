package ale.compiler.generator.util

import ale.xtext.ale.AleClass
import ale.xtext.ale.Root
import org.eclipse.emf.ecore.EPackage

class NamingUtils {
	def String getRootName(AleClass cls)
		'''«(cls.eContainer as Root).name»'''

	def String toRevisitorPackageFqn(EPackage pkg)
		'''«pkg.name».revisitor'''

	def String toRevisitorInterfaceName(EPackage pkg)
		'''«pkg.name.toFirstUpper»Revisitor'''

	def String toRevisitorInterfaceFqn(EPackage pkg)
		'''«pkg.toRevisitorPackageFqn».«pkg.toRevisitorInterfaceName»'''

	def String toRevisitorInterfacePath(EPackage pkg)
		'''src/«pkg.name»/revisitor'''

	def String toRevisitorPackageFqn(Root root)
		'''«root.name».revisitor'''

	def String toRevisitorInterfaceName(Root root)
		'''«root.name.toFirstUpper»Revisitor'''

	def String toRevisitorInterfacePath(Root root)
		'''src/«root.name»/revisitor'''

	def String toOperationPackageFqn(AleClass cls)
		'''«cls.rootName».revisitor.operations'''

	def String toOperationInterfaceName(AleClass aleCls)
		'''«aleCls.rootName.toFirstUpper»«aleCls.name»Operation'''

	def String toOperationInterfaceFqn(AleClass aleCls)
		'''«aleCls.toOperationPackageFqn».«aleCls.toOperationInterfaceName»'''

	def String toOperationInterfacePath(AleClass cls)
		'''src/«cls.rootName»/revisitor/operations'''

	def String toOperationImplPackageFqn(AleClass cls)
		'''«cls.toOperationPackageFqn».impl'''

	def String toOperationImplName(AleClass aleCls)
		'''«aleCls.toOperationInterfaceName»Impl'''

	def String toOperationImplFqn(AleClass aleCls)
		'''«aleCls.toOperationImplPackageFqn».«aleCls.toOperationImplName»'''

	def String toOperationImplPath(AleClass cls)
		'''src/«cls.rootName»/revisitor/operations/impl'''
}
