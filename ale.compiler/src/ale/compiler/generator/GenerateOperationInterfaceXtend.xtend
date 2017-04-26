package ale.compiler.generator

import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.EClass
import ale.xtext.ale.AleClass
import ale.xtext.ale.Root
import java.util.List
import org.eclipse.emf.ecore.EPackage

class GenerateOperationInterfaceXtend {

	extension GraphUtil graphUtil
	extension TypeUtil typeUtil
	ResourceSet resSet

	new(ResourceSet resSet) {
		this.resSet = resSet;
		this.graphUtil = new GraphUtil(resSet)
		this.typeUtil = new TypeUtil(resSet)
	}

	def String generate(EClass eClass, AleClass aleClass, List<EPackage> ePackages, Root root) {
		val aleName = if(aleClass != null) (aleClass.eContainer as Root).
				name else "void"

		val clazzName = '''«aleName.toFirstUpper»«eClass.name»Operation'''
		'''
		package «aleName».revisitor.operation;
		
		public interface «clazzName»
		«FOR ext : eClass.ESuperTypes BEFORE 'extends ' SEPARATOR ', '»«ext.operationInterfacePath(ext.getMatchingRoot(root).name)»«ENDFOR» 
		{
			«IF aleClass != null»
			«FOR method: aleClass.methods»
			«method.type.solveStaticType(ePackages)» «method.name»(«FOR p: method.params»«p.type.solveStaticType(ePackages)» «p.name»«ENDFOR»);
			«ENDFOR»
			«ENDIF»
		}'''
	}
}
