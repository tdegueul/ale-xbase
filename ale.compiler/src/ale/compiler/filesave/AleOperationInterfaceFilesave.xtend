package ale.compiler.filesave

import ale.compiler.generator.RevisitorGenerator
import ale.compiler.generator.util.NamingUtils
import ale.xtext.ale.AleClass
import ale.xtext.ale.Root
import java.util.List
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IPath
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.ResourceSet

class AleOperationInterfaceFilesave {
	FilesaveUtils filesaveUtils = new FilesaveUtils()
	extension NamingUtils = new NamingUtils()

	def void save(IProject project, EClass eClass, AleClass aleClass, ResourceSet rs, List<EPackage> ePackages,
		Root root) {
		val targetFile = initOperationInterfaceFile(project.location, eClass, aleClass)
		val fileContent = new RevisitorGenerator(rs).generateOperationInterface(eClass, aleClass, ePackages, root)

		filesaveUtils.saveContent(targetFile, fileContent, project)
	}

	def private IPath initOperationInterfaceFile(IPath location, EClass eClass, AleClass aleClass) {
		val aleName = aleClass.rootNameOrDefault
		val directoryAlgebra = location.append("src").append(aleName).append("revisitor").append("operation")
		val String fileName = '''«aleName.toFirstUpper»«eClass.name.toFirstUpper»Operation'''

		directoryAlgebra.toFile().mkdirs()

		return directoryAlgebra.append(fileName).addFileExtension("java")
	}
}
