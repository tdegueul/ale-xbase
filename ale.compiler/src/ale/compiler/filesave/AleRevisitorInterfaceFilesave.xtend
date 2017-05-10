package ale.compiler.filesave

import ale.compiler.generator.RevisitorGenerator
import ale.xtext.ale.Root
import java.util.List
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IPath
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.ResourceSet

class AleRevisitorInterfaceFilesave {
	FilesaveUtils filesaveUtils = new FilesaveUtils()

	def void save(EPackage ePackage, GenModel genmodel, IProject project, ResourceSet rs) {
		val revisitorName = ePackage.name
		val target = initRevisitorInterfaceFile(project.location, revisitorName)
		val fileContent = new RevisitorGenerator(rs).generateInterface(ePackage, genmodel)

		filesaveUtils.saveContent(target, fileContent, project)
	}

	def void save(Root root, List<EPackage> ePackages, List<GenModel> genmodels, IProject project, ResourceSet rs,
		List<Root> parentRoots) {
		val revisitorName = root.name
		val target = initRevisitorInterfaceFile(project.location, revisitorName)
		val fileContent = new RevisitorGenerator(rs).generateInterface(revisitorName, ePackages,
			genmodels, parentRoots, false)

		filesaveUtils.saveContent(target, fileContent, project)
	}

	def private IPath initRevisitorInterfaceFile(IPath projectLocation, String name) {
		val file = projectLocation.append("src").append(name).append("revisitor")

		file.toFile().mkdirs()

		return file.append(name.toFirstUpper + "Revisitor").addFileExtension("java")
	}
}
