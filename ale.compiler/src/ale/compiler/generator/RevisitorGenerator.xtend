package ale.compiler.generator

import ale.compiler.generator.util.NamingUtils
import ale.utils.EcoreUtils
import java.util.List
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage

class RevisitorGenerator {
	extension NamingUtils = new NamingUtils()
	extension EcoreUtils = new EcoreUtils()

	def String generateInterface(EPackage pkg, GenModel gm) {
		val localClasses = pkg.EClassifiers.filter(EClass).sortByName
		val allClasses = pkg.allClasses.sortByName
		
		return '''
		package «pkg.revisitorPackageFqn»;

		public interface «pkg.revisitorInterfaceName»«allClasses.getTypeParams(true)»«
		»«FOR ref : pkg.directReferencedPkgs BEFORE '\n\textends ' SEPARATOR ',\n\t\t'»«
			»«ref.revisitorInterfaceFqn»«ref.allClasses.getTypeParams(false)»«
		»«ENDFOR» {
			«FOR cls : localClasses.filter[!abstract]»
				«cls.getTypeParam(false)» «cls.denotationName»(final «cls.getGenClass(gm).qualifiedInterfaceName» «cls.varName»);
				«FOR parent : cls.EAllSuperTypes»
					«parent.getTypeParam(false)» «parent.getDenotationName(cls)»(final «cls.getGenClass(gm).qualifiedInterfaceName» «cls.varName»);
				«ENDFOR»
			«ENDFOR»

			«FOR cls : allClasses»
			«val genCls = cls.getGenClass(gm)»
			default «cls.getTypeParam(false)» $(final «genCls.qualifiedInterfaceName» self) {
				«FOR subClass : cls.getSubClasses(allClasses).filter[!abstract]»
					«val subGenCls = subClass.getGenClass(gm)»
					«val pkgFqn = subGenCls.genPackage.qualifiedPackageInterfaceName»
					«val clsID = pkgFqn + "." + subGenCls.classifierID»
					if (self.eClass().getClassifierID() == «clsID»
						&& self.eClass().getEPackage() == «pkgFqn».eINSTANCE)
						«IF subClass.ESuperTypes.size <= 1»
							return «subClass.denotationName»((«subGenCls.qualifiedInterfaceName») self);
						«ELSE»
							return «cls.getDenotationName(subClass)»((«subGenCls.qualifiedInterfaceName») self);
						«ENDIF»
				«ENDFOR»
				«IF cls.abstract»
					return null;
				«ELSE»
					return «cls.name.toFirstLower»(self);
				«ENDIF»	
			}
			«ENDFOR»
		}
		'''
	}

	def String getDenotationName(EClass cls)
		'''«cls.name.toFirstLower»'''

	def String getDenotationName(EClass parent, EClass child)
		'''«parent.name.toFirstLower»_«child.name.toFirstLower»'''

	def String getVarName(EClass cls)
		'''«cls.name.toFirstLower.charAt(0)»'''

	def String getTypeParams(List<EClass> classes, boolean withExtends)
		'''«FOR cls : classes.sortByName BEFORE '<' SEPARATOR ', ' AFTER '>'»«cls.getTypeParam(withExtends)»«ENDFOR»'''

	def String getTypeParam(EClass cls, boolean withExtends)
		'''«cls.EPackage.name.replaceAll("\\.","").toFirstUpper»«
			»__«cls.name»T«
			»«IF cls.ESuperTypes.size == 1 && withExtends» extends «cls.ESuperTypes.head.getTypeParam(false)»«
			»«ENDIF»'''
}
