package ale.compiler.generator

import org.eclipse.emf.ecore.EClass

class JavaPathUtil {
	public def String javaFullPath(EClass eClass)
		'''«eClass.EPackage.name».«eClass.name»'''

	public def String classifierFullPath(EClass eClass)
		'''«eClass.EPackage.name».«eClass.EPackage.name.toFirstUpper»Package.«eClass.name.toUpperSnake»'''
	
	private def String toUpperSnake(String input) {
		var String ret = "";
		var i = 0;
		for(char c: input.toCharArray) {
			if(i == 0) {
				ret += c
			} else {
				if(c.toString.toUpperCase == c.toString) {
					ret += "_" + c
				} else {
					ret += c
				}
			}
			i++;
		}

		return ret.toUpperCase.replaceAll("_+", "_");
	}
}
