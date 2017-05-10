package ale.compiler.generator

import ale.compiler.generator.util.NamingUtils
import ale.utils.EcoreUtils
import ale.xtext.ale.Root
import java.util.List
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.ResourceSet

class GenerateRevisitorImplXtend {
	extension TypeUtil typeUtil
	extension NamingUtils = new NamingUtils()
	extension JavaPathUtil = new JavaPathUtil()
	extension EcoreUtils = new EcoreUtils()

	new(ResourceSet rs) {
		this.typeUtil = new TypeUtil(rs)
	}

	def String generate(Root root, List<EPackage> ePackages, List<GenModel> genmodels) {
		// TODO: définir la liste de toutes les méthodes à définir
		val allClasses = ePackages.allClasses
		val aleName = root.name

		return '''
			package «aleName».revisitor.impl;
			
			public interface «aleName.toFirstUpper»RevisitorImpl extends «aleName».revisitor.«aleName.toFirstUpper»Revisitor«
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
}
