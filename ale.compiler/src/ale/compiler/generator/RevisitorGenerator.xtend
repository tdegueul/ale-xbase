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

class RevisitorGenerator {
	extension TypeUtil typeUtil = new TypeUtil()
	extension NamingUtils = new NamingUtils()
	extension JavaPathUtil = new JavaPathUtil()
	extension EcoreUtils = new EcoreUtils()
	extension AleUtils = new AleUtils()
	extension AleMethodBodyGenerator = new AleMethodBodyGenerator()

	def String generateInterface(EPackage pkg, GenModel gm) {
		val allClasses = pkg.allClasses
		val allMethods = allClasses.filter[!abstract].sortByName
		val directPkgs = pkg.directReferencedPkgs
		
		return '''
		package «pkg.toRevisitorPackageFqn»;

		public interface «pkg.toRevisitorInterfaceName»«allClasses.generateTypeParams(true)»«
		»«FOR ePp : directPkgs BEFORE '\n\textends ' SEPARATOR ',\n\t\t'»«
			»«ePp.toRevisitorInterfaceFqn»«ePp.allClasses.generateTypeParams(false)»«
		»«ENDFOR» {
			«FOR cls : allMethods»
				«cls.genericType(false)» «cls.name.toFirstLower»(final «cls.javaFullPath» «cls.name.toFirstLower»);
				«FOR parent: cls.EAllSuperTypes»
					«parent.genericType(false)» «parent.name.toFirstLower»_«cls.name.toFirstLower»(final «cls.javaFullPath» «cls.name.toFirstLower»);
				«ENDFOR»
			«ENDFOR»

			«FOR cls : allClasses»
			default «cls.genericType(false)» $(final «cls.javaFullPath» self) {
				«FOR subClass: cls.getSubClasses(allClasses).filter[!abstract]»
					«val genCls = subClass.getGenClass(gm)»
					«val genClsID = genCls.genPackage.qualifiedPackageInterfaceName + "." + genCls.classifierID»
					«IF subClass.ESuperTypes.size <= 1»
						if(self.eClass().getClassifierID() == «genClsID»
							&& self.eClass().getEPackage() == «subClass.EPackage.name».«subClass.EPackage.name.toFirstUpper»Package.eINSTANCE)
							return «subClass.name.toFirstLower»((«subClass.javaFullPath») self);
					«ELSE»
						if(self.eClass().getClassifierID() == «genClsID»
							&& self.eClass().getEPackage() == «subClass.EPackage.name».«subClass.EPackage.name.toFirstUpper»Package.eINSTANCE)
							return «cls.name.toFirstLower»_«subClass.name.toFirstLower»((«subClass.javaFullPath») self);
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

	def String generateImpl(Root root, List<EPackage> pkgs, List<GenModel> gms) {
		val allClasses = pkgs.allClasses
		// FIXME: Might not always be the first, this currently depends
		// on the order of declaration of Ecore metamodels in the ALE file.
		val pkg = pkgs.head
		
		return '''
			package «root.toRevisitorPackageFqn»;
			
			public interface «root.toRevisitorInterfaceName» extends «pkg.toRevisitorInterfaceFqn»«
				»«FOR cls : allClasses.sortByName BEFORE '<' SEPARATOR ', ' AFTER '>'»«
					»«cls.getMatchingAleClass(root).toOperationInterfaceFqn»«
				»«ENDFOR» {

				«FOR cls : allClasses.sortByName.filter[!abstract]»
					«val aleCls = cls.getMatchingAleClass(root)»
					@Override
					default «aleCls.toOperationInterfaceFqn» «cls.name.toFirstLower»(final «cls.javaFullPath» «cls.name.toFirstLower») {
						return new «aleCls.toOperationImplFqn»(«cls.name.toFirstLower», this);
					}

					«FOR parent: cls.EAllSuperTypes»
						@Override
						default «aleCls.toOperationInterfaceFqn» «parent.name.toFirstLower»_«cls.name.toFirstLower»(final «cls.javaFullPath» «cls.name.toFirstLower») {
							return new «aleCls.toOperationImplFqn»(«cls.name.toFirstLower», this);
						}
					«ENDFOR»
				«ENDFOR»
			}
		'''
	}

	def String generateOperationInterface(EClass eClass, AleClass aleClass, List<EPackage> ePackages, Root root) {

		return '''
			package «aleClass.toOperationPackageFqn»;

			public interface «aleClass.toOperationInterfaceName»«
			»«FOR ext : eClass.ESuperTypes BEFORE ' extends ' SEPARATOR ', '»«
				»«ext.getMatchingAleClass(root).toOperationInterfaceFqn»«
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
		val allClasses = ePackages.allClasses
		val pkg = ePackages.head // FIXME: Might not always be the first

		return '''
			package «aleClass.toOperationImplPackageFqn»;
			
			public class «aleClass.toOperationImplName» implements «aleClass.toOperationInterfaceFqn» {
				private final «eClass.javaFullPath» self;
				«IF aleClass !== null»
				private final «pkg.toRevisitorInterfaceFqn»«FOR clazzS: allClasses.sortByName BEFORE '<' SEPARATOR ', ' AFTER '>'»? extends «clazzS.getMatchingAleClass(root).toOperationInterfaceFqn»«ENDFOR» alg;
				«ENDIF»
			
				«IF aleClass !== null»
					«FOR parent: aleClass.superClass»
						private final «parent.toOperationInterfaceFqn» «parent.rootName»delegate;
					«ENDFOR»
				«ENDIF»
			
				public «aleClass.toOperationImplName»(«eClass.javaFullPath» self, «IF aleClass !== null»«pkg.toRevisitorInterfaceFqn»«FOR clazzS: allClasses.sortByName BEFORE '<' SEPARATOR ', ' AFTER '>'»? extends «clazzS.getMatchingAleClass(root).toOperationInterfaceFqn»«ENDFOR»«ELSE»Object«ENDIF» alg) {
					this.self = self;
					«IF aleClass !== null»
						this.alg = alg;
						«FOR parent: aleClass.superClass»
							this.«parent.rootName»delegate = new «parent.toOperationImplFqn»(self, alg);
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
								«IF method.type.solveStaticType(ePackages) != 'void'»return «ENDIF»this.«(method.eContainer as AleClass).rootName»delegate.«method.name»(«FOR p: method.params»«p.name»«ENDFOR»);
							«ENDIF»
						}
					«ENDFOR»
				«ENDIF»
			}
		'''
	}

	def String generateTypeParams(List<EClass> classes, boolean withExtends)
		'''«FOR cls : classes.sortByName BEFORE '<' SEPARATOR ', ' AFTER '>'»«cls.genericType(withExtends)»«ENDFOR»'''

	private def String genericType(EClass cls, boolean extend)
		'''«cls.EPackage.name.replaceAll("\\.","").toFirstUpper»__«cls.name»T«IF cls.ESuperTypes.size == 1 && extend» extends «cls.ESuperTypes.head.genericType(false)»«ENDIF»'''
}
