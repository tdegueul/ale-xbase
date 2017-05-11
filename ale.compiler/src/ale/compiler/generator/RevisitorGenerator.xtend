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
	extension EcoreUtils = new EcoreUtils()
	extension AleUtils = new AleUtils()
	extension AleMethodBodyGenerator = new AleMethodBodyGenerator()

	def String generateInterface(EPackage pkg, GenModel gm) {
		val allClasses = pkg.allClasses.sortByName

		return '''
		package «pkg.revisitorPackageFqn»;
		
		«FOR genCls : allClasses.map[getGenClass(gm)]»
		import «genCls.qualifiedInterfaceName»;
		«ENDFOR»

		public interface «pkg.revisitorInterfaceName»«allClasses.getTypeParams(true)»«
		»«FOR ref : pkg.directReferencedPkgs BEFORE '\n\textends ' SEPARATOR ',\n\t\t'»«
			»«ref.revisitorInterfaceFqn»«ref.allClasses.getTypeParams(false)»«
		»«ENDFOR» {
			«FOR cls : allClasses.filter[!abstract]»
				«val genCls = cls.getGenClass(gm)»
				«cls.getTypeParam(false)» «cls.denotationName»(final «genCls.interfaceName» «cls.varName»);
				«FOR parent : cls.EAllSuperTypes»
					«parent.getTypeParam(false)» «parent.getDenotationName(cls)»(final «genCls.interfaceName» «cls.varName»);
				«ENDFOR»
			«ENDFOR»

			«FOR cls : allClasses»
			«val genCls = cls.getGenClass(gm)»
			default «cls.getTypeParam(false)» $(final «genCls.interfaceName» self) {
				«FOR subClass : cls.getSubClasses(allClasses).filter[!abstract]»
					«val subGenCls = subClass.getGenClass(gm)»
					«val pkgFqn = subGenCls.genPackage.qualifiedPackageInterfaceName»
					«val clsID = pkgFqn + "." + subGenCls.classifierID»
					«IF subClass.ESuperTypes.size <= 1»
						if(self.eClass().getClassifierID() == «clsID»
							&& self.eClass().getEPackage() == «pkgFqn».eINSTANCE)
							return «subClass.denotationName»((«subGenCls.interfaceName») self);
					«ELSE»
						if(self.eClass().getClassifierID() == «clsID»
							&& self.eClass().getEPackage() == «pkgFqn».eINSTANCE)
							return «cls.getDenotationName(subClass)»((«subGenCls.interfaceName») self);
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
		val allClasses = pkgs.allClasses.sortByName
		val pkg = pkgs.head // FIXME: Might not always be the first
		
		return '''
			package «root.revisitorPackageFqn»;
			
			«FOR genCls : allClasses.filter[!abstract].map[getGenClass(gms)]»
			import «genCls.qualifiedInterfaceName»;
			«ENDFOR»
			
			«FOR cls : allClasses»
				import «cls.getMatchingAleClass(root).operationInterfaceFqn»;
				«IF !cls.abstract»
				import «cls.getMatchingAleClass(root).operationImplFqn»;
				«ENDIF»
			«ENDFOR»
			
			public interface «root.revisitorInterfaceName» extends «pkg.revisitorInterfaceFqn»«
				»«FOR cls : allClasses BEFORE '<' SEPARATOR ', ' AFTER '>'»«
					»«cls.getMatchingAleClass(root).operationInterfaceName»«
				»«ENDFOR» {
				«FOR cls : allClasses.filter[!abstract]»
					«val aleCls = cls.getMatchingAleClass(root)»
					«val genCls = cls.getGenClass(gms)»
					@Override
					default «aleCls.operationInterfaceName» «cls.denotationName»(final «genCls.interfaceName» «cls.varName») {
						return new «aleCls.operationImplName»(«cls.varName», this);
					}
					«FOR parent : cls.EAllSuperTypes»
						@Override
						default «aleCls.operationInterfaceName» «parent.getDenotationName(cls)»(final «genCls.interfaceName» «cls.varName») {
							return new «aleCls.operationImplName»(«cls.varName», this);
						}
					«ENDFOR»
				«ENDFOR»
			}
		'''
	}

	def String generateOperationInterface(EClass eCls, AleClass aleCls, List<EPackage> pkgs, List<GenModel> gms) {
		val root = aleCls.eContainer as Root

		return '''
			package «aleCls.operationPackageFqn»;

			public interface «aleCls.operationInterfaceName»«
			»«FOR ext : eCls.ESuperTypes BEFORE ' extends ' SEPARATOR ', '»«
				»«ext.getMatchingAleClass(root).operationInterfaceFqn»«
			»«ENDFOR» {
				«FOR method : aleCls?.methods»
					«method.type.solveStaticType(pkgs)» «method.name»(«
						»«FOR p : method.params»«
							»«p.type.solveStaticType(pkgs)» «p.name»«
						»«ENDFOR»«
					»);
				«ENDFOR»
			}
		'''
	}

	def String generateOperationImpl(EClass eCls, AleClass aleCls, List<EPackage> pkgs, List<GenModel> gms) {
		val pkg = pkgs.head // FIXME: Might not always be the first
		val root = aleCls.eContainer as Root
		val genCls = eCls.getGenClass(gms)

		return '''
			package «aleCls.operationImplPackageFqn»;
			
			import «genCls.qualifiedInterfaceName»;
			«FOR cls : pkg.allClasses.sortByName»
			import «cls.getMatchingAleClass(root).operationInterfaceFqn»;
			«ENDFOR»
			
			public class «aleCls.operationImplName» implements «aleCls.operationInterfaceFqn» {
				private final «genCls.interfaceName» self;
				private final «pkg.getAlgSignature(root)» alg;
			
				«FOR parent : aleCls.superClass»
					private final «parent.operationInterfaceFqn» «parent.rootName»delegate;
				«ENDFOR»
			
				public «aleCls.operationImplName»(«genCls.interfaceName» self, «pkg.getAlgSignature(root)» alg) {
					this.self = self;
					this.alg = alg;
					«FOR parent : aleCls.superClass»
						this.«parent.rootName»delegate = new «parent.operationImplFqn»(self, alg);
					«ENDFOR»
				}

				«FOR method : aleCls.getAllMethods(true)»
					@Override
					public «method.type.solveStaticType(pkgs)» «method.name»(«FOR p : method.params»«p.type.solveStaticType(pkgs)» «p.name»«ENDFOR») {
						«IF method.eContainer == aleCls»
							«aleCls.generate(method, pkgs, root)»
						«ELSE»
							«IF method.type.solveStaticType(pkgs) != "void"»return «ENDIF»«
							»this.«(method.eContainer as AleClass).rootName»delegate.«method.name»(«FOR p : method.params»«p.name»«ENDFOR»);
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

	def String getAlgSignature(EPackage pkg, Root root)
		'''«pkg.revisitorInterfaceFqn»«
			»«FOR cls : pkg.allClasses.sortByName BEFORE '<' SEPARATOR ', ' AFTER '>'»«
				»? extends «cls.getMatchingAleClass(root).operationInterfaceName»«
			»«ENDFOR»'''
}
