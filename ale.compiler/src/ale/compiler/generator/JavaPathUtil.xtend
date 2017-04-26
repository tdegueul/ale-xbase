package ale.compiler.generator

import org.eclipse.emf.ecore.EClass

class JavaPathUtil {
	public def javaFullPath(EClass eClass) '''«eClass.EPackage.name».«eClass.name»'''
}
