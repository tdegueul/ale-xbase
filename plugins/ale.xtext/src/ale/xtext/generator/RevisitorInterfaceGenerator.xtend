package ale.xtext.generator

import ale.xtext.utils.EcoreUtils
import ale.xtext.utils.NamingUtils
import com.google.inject.Inject
import java.util.List
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage

class RevisitorInterfaceGenerator {
	@Inject extension NamingUtils
	@Inject extension EcoreUtils

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
				«FOR parent : cls.ESuperTypes.drop(1)»
					«parent.getTypeParam(false)» «parent.getDenotationName(cls)»(final «cls.getGenClass(gm).qualifiedInterfaceName» «cls.varName»);
				«ENDFOR»
			«ENDFOR»

			«FOR cls : allClasses»
			«val genCls = cls.getGenClass(gm)»
			«IF cls.hasRequiredAnnotation && cls.getSubClasses(allClasses).empty»
			«cls.getTypeParam(false)» $(final «genCls.qualifiedInterfaceName» it);
			«ELSE»
			default «cls.getTypeParam(false)» $(final «genCls.qualifiedInterfaceName» it) {
				«FOR subClass : cls.getSubClasses(allClasses).filter[!abstract]»
					«val subGenCls = subClass.getGenClass(gm)»
					if (it.getClass() == «subGenCls.qualifiedClassName».class)
						«IF subClass.ESuperTypes.size <= 1»
							return «subClass.denotationName»((«subGenCls.qualifiedInterfaceName») it);
						«ELSE»
							return «cls.getDenotationName(subClass)»((«subGenCls.qualifiedInterfaceName») it);
						«ENDIF»
				«ENDFOR»
				«IF cls.abstract»
					return null;
				«ELSE»
					return «cls.name.toFirstLower»(it);
				«ENDIF»
			}
			«ENDIF»
			«ENDFOR»
		}
		'''
	}

	def String getTypeParams(List<EClass> classes, boolean withExtends)
		'''«FOR cls : classes.sortByName BEFORE '<' SEPARATOR ', ' AFTER '>'»«cls.getTypeParam(withExtends)»«ENDFOR»'''

	def String getTypeParam(EClass cls, boolean withExtends)
		'''«cls.EPackage.name.replaceAll("\\.","").toFirstUpper»«
			»__«cls.name»T«
			»«IF cls.ESuperTypes.size == 1 && withExtends» extends «cls.ESuperTypes.head.getTypeParam(false)»«
			»«ENDIF»'''
}
