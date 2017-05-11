package ale.compiler.generator

import ale.compiler.generator.util.AleUtils
import ale.compiler.generator.util.NamingUtils
import ale.utils.EcoreUtils
import ale.xtext.ale.AleClass
import ale.xtext.ale.Root
import java.util.List
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.ResourceSet

class RevisitorGenerator {
	extension TypeUtil typeUtil = new TypeUtil()
	extension NamingUtils = new NamingUtils()
	extension JavaPathUtil = new JavaPathUtil()
	extension EcoreUtils = new EcoreUtils()
	extension AleUtils = new AleUtils()
	extension AleMethodBodyGenerator = new AleMethodBodyGenerator()
	ResourceSet rs

	new(ResourceSet rs) {
		this.rs = rs
	}

	def String generateInterface(EPackage pkg, GenModel gm) {
		val rootName = pkg.name
		val allClasses = pkg.allClasses
		val allMethods = allClasses.filter[!abstract].sortByName
		val classPlusItsChildren = allClasses.map[c | c -> allClasses.filter[other | c.isSuperTypeOf(other)]]
		val directPkgs = pkg.directReferencedPkgs
		
		return '''
		package «rootName».revisitor;

		public interface «rootName.toPackageName»«
		»«allClasses.generateTypeParams(true)»«
		»«FOR ePp : directPkgs BEFORE '\n\textends ' SEPARATOR ',\n\t\t'»«
			»«ePp.name.revisitorInterfaceJavaPath»«
			»«ePp.allClasses.generateTypeParams(false)»«
		»«ENDFOR» {

			«FOR cls : allMethods»
				«cls.genericType(false)» «cls.name.toFirstLower»(final «cls.javaFullPath» «cls.name.toFirstLower»);
				«FOR parent: cls.EAllSuperTypes»
					«parent.genericType(false)» «parent.name.toFirstLower»_«cls.name.toFirstLower»(final «cls.javaFullPath» «cls.name.toFirstLower»);
				«ENDFOR»
			«ENDFOR»

			«FOR dollarRoot : classPlusItsChildren»
			default «dollarRoot.key.genericType(false)» $(final «dollarRoot.key.javaFullPath» self) {
				«FOR subClass: dollarRoot.value.filter[it != dollarRoot.key].filter[!abstract]»
					«val genCls = subClass.getGenClass(gm)»
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

	def String generateImpl(Root root, List<EPackage> ePackages, List<GenModel> genmodels) {
		// TODO: définir la liste de toutes les méthodes à définir
		val allClasses = ePackages.allClasses
		val aleName = root.name
		// FIXME: Might not always be the first, this currently depends
		// on the order of declaration of Ecore metamodels in the ALE file.
		val pkgName = ePackages.head.name
		
		return '''
			package «aleName».revisitor.impl;
			
			public interface «aleName.toFirstUpper»RevisitorImpl extends «pkgName».revisitor.«pkgName.toPackageName»«
				»«FOR cls : allClasses.sortByName BEFORE '<' SEPARATOR ', ' AFTER '>'»«
					»«cls.getOperationInterfacePath(cls.getMatchingRoot(root).rootNameOrDefault)»«
				»«ENDFOR» {

				«FOR cls : allClasses.sortByName.filter[!abstract]»
					@Override
					default «cls.getOperationInterfacePath(cls.getMatchingRoot(root).rootNameOrDefault)» «cls.name.toFirstLower»(final «cls.javaFullPath» «cls.name.toFirstLower») {
						return new «cls.getMatchingRoot(root).rootNameOrDefault».revisitor.operation.impl.«cls.getMatchingRoot(root).rootNameOrDefault.toFirstUpper»«cls.name.toFirstUpper»OperationImpl(«cls.name.toFirstLower», this);
					}

					«FOR parent: cls.EAllSuperTypes»
						@Override
						default «cls.getOperationInterfacePath(cls.getMatchingRoot(root).rootNameOrDefault)» «parent.name.toFirstLower»_«cls.name.toFirstLower»(final «cls.javaFullPath» «cls.name.toFirstLower») {
							return new «cls.getMatchingRoot(root).rootNameOrDefault».revisitor.operation.impl.«cls.getMatchingRoot(root).rootNameOrDefault.toFirstUpper»«cls.name.toFirstUpper»OperationImpl(«cls.name.toFirstLower», this);
						}
					«ENDFOR»
				«ENDFOR»
			}
		'''
	}

	def String generateOperationInterface(EClass eClass, AleClass aleClass, List<EPackage> ePackages, Root root) {
		val aleName = aleClass.rootNameOrDefault
		val clazzName = '''«aleName.toFirstUpper»«eClass.name»Operation'''

		return '''
			package «aleName».revisitor.operation;

			public interface «clazzName»«
			»«FOR ext : eClass.ESuperTypes BEFORE ' extends ' SEPARATOR ', '»«
				»«ext.getOperationInterfacePath(ext.getMatchingRoot(root).rootNameOrDefault)»«
			»«ENDFOR» {
				«IF aleClass !== null»
					«FOR method: aleClass.methods»
						«method.type.solveStaticType(ePackages)» «method.name»(«FOR p: method.params»«p.type.solveStaticType(ePackages)» «p.name»«ENDFOR»);
					«ENDFOR»
				«ENDIF»
			}
		'''
	}

	def String generateOperationImpl(EClass eClass, AleClass aleClass, List<EPackage> ePackages, Root root) {
		val aleName = aleClass.rootNameOrDefault
		val pkgName = ePackages.head.name
		val clazzName = '''«aleName.toFirstUpper»«eClass.name»Operation'''
		val allClasses = ePackages.allClasses

		return '''
			package «aleName».revisitor.operation.impl;
			
			public class «clazzName»Impl implements «aleName».revisitor.operation.«clazzName» {
				private final «eClass.javaFullPath» self;
				«IF aleClass !== null»
				private final «pkgName».revisitor.«pkgName.toPackageName»«FOR clazzS: allClasses.sortByName BEFORE '<' SEPARATOR ', ' AFTER '>'»? extends «clazzS.getOperationInterfacePath(clazzS.getMatchingRoot(root).rootNameOrDefault)»«ENDFOR» alg;
				«ENDIF»
			
				«IF aleClass !== null»
					«FOR parent: aleClass.superClass»
						private final «parent.rootNameOrDefault».revisitor.operation.impl.«parent.rootNameOrDefault.toFirstUpper»«parent.name.toFirstUpper»OperationImpl «parent.rootNameOrDefault»delegate;
					«ENDFOR»
				«ENDIF»
			
				public «clazzName»Impl(«eClass.javaFullPath» self, «IF aleClass !== null»«pkgName».revisitor.«pkgName.toPackageName»«FOR clazzS: allClasses.sortByName BEFORE '<' SEPARATOR ', ' AFTER '>'»? extends «clazzS.getOperationInterfacePath(clazzS.getMatchingRoot(root).rootNameOrDefault)»«ENDFOR»«ELSE»Object«ENDIF» alg) {
					this.self = self;
					«IF aleClass !== null»
						this.alg = alg;
						«FOR parent: aleClass.superClass»
							this.«parent.rootNameOrDefault»delegate = new «parent.rootNameOrDefault».revisitor.operation.impl.«parent.rootNameOrDefault.toFirstUpper»«parent.name.toFirstUpper»OperationImpl(self, alg);
						«ENDFOR»
					«ENDIF»
				}

				«IF aleClass !== null»
					«FOR method: aleClass.getAllMethods(true)»
						@Override
						public «method.type.solveStaticType(ePackages)» «method.name»(«FOR p: method.params»«p.type.solveStaticType(ePackages)» «p.name»«ENDFOR») {
							«IF method.eContainer == aleClass»
								«aleClass.generate(method, ePackages, root)»
							«ELSE»
								«IF method.type.solveStaticType(ePackages) != 'void'»return «ENDIF»this.«(method.eContainer as AleClass).rootNameOrDefault»delegate.«method.name»(«FOR p: method.params»«p.name»«ENDFOR»);
							«ENDIF»
						}
					«ENDFOR»
				«ENDIF»
			}
		'''
	}

	def String generateTypeParams(List<EClass> classes, boolean withExtends)
		'''«FOR cls : classes.sortByName BEFORE '<' SEPARATOR ', ' AFTER '>'»«cls.genericType(withExtends)»«ENDFOR»'''

	private def revisitorInterfaceJavaPath(String name)
		'''«name».revisitor.«name.toPackageName»'''

	private def String genericType(EClass cls, boolean extend)
		'''«cls.EPackage.name.replaceAll("\\.","").toFirstUpper»__«cls.name»T«IF cls.ESuperTypes.size == 1 && extend» extends «cls.ESuperTypes.head.genericType(false)»«ENDIF»'''

	private def static toPackageName(String name) '''«name.toClassName»Revisitor'''

	private def static String toClassName(String name) {
		return name.split("\\.").map[toFirstUpper].join
	}
}