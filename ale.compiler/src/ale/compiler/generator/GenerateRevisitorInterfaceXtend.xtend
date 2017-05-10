package ale.compiler.generator

import ale.compiler.generator.util.AleUtils
import ale.utils.EcoreUtils
import ale.xtext.ale.Root
import java.util.List
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.ResourceSet

class GenerateRevisitorInterfaceXtend {
	extension JavaPathUtil = new JavaPathUtil()
	extension EcoreUtils = new EcoreUtils()
	extension AleUtils = new AleUtils()
	ResourceSet rs

	new(ResourceSet rs) {
		this.rs = rs
	}

	def String generate(String rootName, List<EPackage> ePackages, List<GenModel> genmodels, List<Root> parentRoots, Boolean generateMethods) {
		val allClasses = ePackages.allClasses
		val allMethods = allClasses.filter[!abstract].sortByName
		val classPlusItsChildren = allClasses.map[c | c -> allClasses.filter[other | c.isSuperTypeOf(other)]]
		val directPkgs = newArrayList
		
		if (generateMethods)
			directPkgs += ePackages.directReferencedPkgs
		else
			directPkgs += ePackages
		
		val sep = if (directPkgs.empty) ' extends ' else ', \n\t\t'

		return '''
		package «rootName».revisitor;

		public interface «rootName.toPackageName»«
		»«FOR cls : allClasses.sortByName BEFORE '<' SEPARATOR ', ' AFTER '>'»«cls.genericType(true)»«ENDFOR»«
		»«FOR ePp : directPkgs BEFORE '\n\textends ' SEPARATOR ',\n\t\t'»«
			»«ePp.name.revisitorInterfaceJavaPath»«
			»«FOR x : ePp.allClasses.sortByName BEFORE '<' SEPARATOR ', ' AFTER '>'»«
				»«x.genericType(false)»«
			»«ENDFOR»«
		»«ENDFOR»«
		»«FOR ePp : parentRoots BEFORE sep SEPARATOR ',\n\t\t'»
			«ePp.name.revisitorInterfaceJavaPath»«FOR x : ePp.allClasses(rs).sortByName BEFORE '<' SEPARATOR ', ' AFTER '>'»«
				»«x.genericType(false)»«
			»«ENDFOR»«
		»«ENDFOR» {

			«IF generateMethods»
			// Concrete factory methods to be implemented in revisitor implementations
			«FOR cls : allMethods»
				«cls.genericType(false)» «cls.name.toFirstLower»(final «cls.javaFullPath» «cls.name.toFirstLower»);
				«FOR parent: cls.EAllSuperTypes»
					«parent.genericType(false)» «parent.name.toFirstLower»_«cls.name.toFirstLower»(final «cls.javaFullPath» «cls.name.toFirstLower»);
				«ENDFOR»
			«ENDFOR»
			«ENDIF»

			// Default dispatch methods
			«FOR dollarRoot : classPlusItsChildren»
			default «dollarRoot.key.genericType(false)» $(final «dollarRoot.key.javaFullPath» self) {
				«FOR subClass: dollarRoot.value.filter[it != dollarRoot.key].filter[!abstract]»
					«val genCls = subClass.getGenClass(genmodels)»
					«val genClsID = genCls.genPackage.qualifiedPackageInterfaceName + "." + genCls.classifierID»
					«IF subClass.ESuperTypes.size <= 1»
						if(self.eClass().getClassifierID() == «genClsID»
							&& self.eClass().getEPackage() == «subClass.EPackage.name».«subClass.EPackage.name.toFirstUpper»Package.eINSTANCE)
							return «subClass.name.toFirstLower»((«subClass.javaFullPath») self);
					«ELSE»
						if(self.eClass().getClassifierID() == «genClsID»
							&& self.eClass().getEPackage() == «subClass.EPackage.name».«subClass.EPackage.name.toFirstUpper»Package.eINSTANCE)
							return «dollarRoot.key.name.toFirstLower»_«subClass.name.toFirstLower»((«subClass.javaFullPath») self);
					«ENDIF»
				«ENDFOR»
				«IF dollarRoot.key.abstract»
					return null;
				«ELSE»
					return «dollarRoot.key.name.toFirstLower»(self);
				«ENDIF»	
			}

			«ENDFOR»
		}
		'''
	}

	def String generate(EPackage ePackage, GenModel gm) {
		return this.generate(ePackage.name, newArrayList(ePackage), newArrayList(gm), newArrayList(), true)
	}

	private def revisitorInterfaceJavaPath(String name)
		'''«name».revisitor.«name.toPackageName»'''

	private def String genericType(EClass cls, boolean extend)
		'''«cls.EPackage.name.replaceAll("\\.","").toFirstUpper»__«cls.name»T«IF cls.ESuperTypes.size == 1 && extend» extends «cls.ESuperTypes.head.genericType(false)»«ENDIF»'''

	private def static toPackageName(String name) '''«name.toClassName»Revisitor'''

	private def static String toClassName(String name) {
		return name.split("\\.").map[toFirstUpper].join
	}
}
