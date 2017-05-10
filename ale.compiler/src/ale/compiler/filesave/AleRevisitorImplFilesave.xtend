package ale.compiler.filesave

import ale.compiler.generator.RevisitorGenerator
import ale.xtext.ale.Root
import java.util.List
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IPath
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.ResourceSet

class AleRevisitorImplFilesave {
	FilesaveUtils filesaveUtils = new FilesaveUtils()

	def void save(Root root, IProject project, ResourceSet rs, List<EPackage> ePackages, List<GenModel> genmodels) {
		val revisitorName = root.name
		val targetFile = initRevisitorImplFile(project.location, revisitorName)
		val fileContent = new RevisitorGenerator(rs).generateImpl(root, ePackages, genmodels)

		filesaveUtils.saveContent(targetFile, fileContent, project)
	}

	def private IPath initRevisitorImplFile(IPath location, String name) {
		val file = location.append("src").append(name).append("revisitor").append("impl")

		file.toFile().mkdirs()

		return file.append(name.toFirstUpper + "RevisitorImpl").addFileExtension("java")
	}
}
