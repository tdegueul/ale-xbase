package ale.compiler.generator

import ale.compiler.generator.util.AleUtils
import ale.compiler.generator.util.NamingUtils
import ale.utils.EcoreUtils
import ale.xtext.ale.AleClass
import ale.xtext.ale.Root
import java.util.List
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.ResourceSet

class GenerateOperationImplXtend {
	GenerateMethodBodyXtend generateMethod 
	ResourceSet rs

	extension NamingUtils = new NamingUtils()
	extension JavaPathUtil = new JavaPathUtil()
	extension AleUtils = new AleUtils()
	extension EcoreUtils = new EcoreUtils()
	extension TypeUtil typeUtil

	new(ResourceSet rs) {
		this.rs = rs
		this.typeUtil = new TypeUtil(rs)
		this.generateMethod = new GenerateMethodBodyXtend(rs)
	}

	def String generate(EClass eClass, AleClass aleClass, List<EPackage> ePackages, Root root) {
		val aleName = aleClass.rootNameOrDefault
		val clazzName = '''«aleName.toFirstUpper»«eClass.name»Operation'''
		val allClasses = ePackages.allClasses

		return '''
			package «aleName».revisitor.operation.impl;
			
			public class «clazzName»Impl implements «aleName».revisitor.operation.«clazzName» {
				private final «eClass.javaFullPath» self;
				«IF aleClass !== null»
				private final «aleName».revisitor.«aleName.toFirstUpper»Revisitor«FOR clazzS: allClasses.sortByName BEFORE '<' SEPARATOR ', ' AFTER '>'»? extends «clazzS.getOperationInterfacePath(clazzS.getMatchingRoot(root).rootNameOrDefault)»«ENDFOR» alg;
				«ENDIF»
			
				«IF aleClass !== null»
					«FOR parent: aleClass.superClass»
						private final «parent.rootNameOrDefault».revisitor.operation.impl.«parent.rootNameOrDefault.toFirstUpper»«parent.name.toFirstUpper»OperationImpl «parent.rootNameOrDefault»delegate;
					«ENDFOR»
				«ENDIF»
			
				public «clazzName»Impl(«eClass.javaFullPath» self, «IF aleClass !== null»«aleName».revisitor.«aleName.toFirstUpper»Revisitor«FOR clazzS: allClasses.sortByName BEFORE '<' SEPARATOR ', ' AFTER '>'»? extends «clazzS.getOperationInterfacePath(clazzS.getMatchingRoot(root).rootNameOrDefault)»«ENDFOR»«ELSE»Object«ENDIF» alg) {
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
								«generateMethod.generate(aleClass, method, ePackages, root)»
							«ELSE»
								«IF method.type.solveStaticType(ePackages) != 'void'»return «ENDIF»this.«(method.eContainer as AleClass).rootNameOrDefault»delegate.«method.name»(«FOR p: method.params»«p.name»«ENDFOR»);
							«ENDIF»
						}
					«ENDFOR»
				«ENDIF»
			}
		'''
	}
}
