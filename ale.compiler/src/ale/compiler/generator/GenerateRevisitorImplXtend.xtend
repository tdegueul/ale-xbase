package ale.compiler.generator

import ale.xtext.ale.Root

class GenerateRevisitorImplXtend {
	def String generate(Root root) {
		'''
			package «root.name».algebra.impl;
			
«««			public interface «root.name.toFirstUpper»AlgebraImpl extends «ePackage.name».algebra.«ePackage.name.toFirstUpper»Algebra
«««				«FOR clazz : graph.nodes.sortBy[x|x.elem.name].map[elem] BEFORE '<' SEPARATOR ',' AFTER '>'»«clazz.operationInterfacePath(clazz.findAleClass(aleScope, ePackage, dependencies))»«ENDFOR» {
«««				«FOR clazz : graph.nodes.sortBy[elem.name].filter[c|!c.elem.abstract].map[elem]»
«««					@Override
«««					default «clazz.operationInterfacePath(clazz.findAleClass(aleScope, ePackage, dependencies))» «clazz.name.toFirstLower»(final «clazz.javaFullPath» «clazz.name.toFirstLower») {
«««						return new «clazz.EPackage.name».«clazz.findAleClass(aleScope, ePackage, dependencies).findNameOrDefault».algebra.impl.operation.«clazz.EPackage.name.toFirstUpper»«clazz.findAleClass(aleScope, ePackage, dependencies).findNameOrDefault.toFirstUpper»«clazz.name.toFirstUpper»OperationImpl(«clazz.name.toFirstLower», this);
«««					} 
«««					«FOR parent: clazz.ancestors»
«««					@Override
«««					default «clazz.operationInterfacePath(clazz.findAleClass(aleScope, ePackage, dependencies))» «parent.name.toFirstLower»_«clazz.name.toFirstLower»(final «clazz.javaFullPath» «clazz.name.toFirstLower») {
«««						return new «clazz.EPackage.name».«clazz.findAleClass(aleScope, ePackage, dependencies).findNameOrDefault».algebra.impl.operation.«clazz.EPackage.name.toFirstUpper»«clazz.findAleClass(aleScope, ePackage, dependencies).findNameOrDefault.toFirstUpper»«clazz.name.toFirstUpper»OperationImpl(«clazz.name.toFirstLower», this);
«««					} 
«««					«ENDFOR»
«««				«ENDFOR»
«««			}
		'''
	}
}