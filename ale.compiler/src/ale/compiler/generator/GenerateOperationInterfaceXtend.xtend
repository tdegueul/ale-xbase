package ale.compiler.generator

import ale.compiler.generator.util.NameUtil
import ale.xtext.ale.AleClass
import ale.xtext.ale.Root
import java.util.List
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.ResourceSet

class GenerateOperationInterfaceXtend {
	extension NameUtil nameUtil = new NameUtil()
	extension GraphUtil graphUtil
	extension TypeUtil typeUtil
	ResourceSet resSet

	new(ResourceSet resSet) {
		this.resSet = resSet
		this.graphUtil = new GraphUtil(resSet)
		this.typeUtil = new TypeUtil(resSet)
	}

	def String generate(EClass eClass, AleClass aleClass, List<EPackage> ePackages, Root root) {
		val aleName = aleClass.rootNameOrDefault
		val clazzName = '''«aleName.toFirstUpper»«eClass.name»Operation'''

		return '''
			package «aleName».revisitor.operation;

			public interface «clazzName»«
			»«FOR ext : eClass.ESuperTypes BEFORE ' extends ' SEPARATOR ', '»«
				»«ext.operationInterfacePath(ext.getMatchingRoot(root).rootNameOrDefault)»«
			»«ENDFOR» {
				«IF aleClass !== null»
					«FOR method: aleClass.methods»
						«method.type.solveStaticType(ePackages)» «method.name»(«FOR p: method.params»«p.type.solveStaticType(ePackages)» «p.name»«ENDFOR»);
					«ENDFOR»
				«ENDIF»
			}
		'''
	}
}
