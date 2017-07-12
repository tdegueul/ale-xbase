package ale.compiler.generator

import ale.compiler.generator.util.NamingUtils
import java.io.FileWriter
import java.io.IOException
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.core.runtime.Path
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.ecore.EPackage

class AleGenerator {
	IProject project
	RevisitorGenerator generator = new RevisitorGenerator()
	extension NamingUtils = new NamingUtils()

	new(IProject project) {
		this.project = project
	}
	
	def void saveRevisitorInterface(EPackage pkg, GenModel gm) {
		val f = prepareFile(
			new Path(pkg.revisitorInterfacePath),
			new Path(pkg.revisitorInterfaceName)
		)
		val content = generator.generateInterface(pkg, gm)

		saveContent(f, content)
	}

	private def IPath prepareFile(IPath path, IPath filename) {
		val file = project.location.append(path)
		file.toFile().mkdirs()
		return file.append(filename).addFileExtension("java")
	}

	private def void saveContent(IPath target, String fileContent) {
		try {
			val fileWriter = new FileWriter(target.toFile())
			fileWriter.write(fileContent)
			fileWriter.close()
			project.refreshLocal(IResource::DEPTH_INFINITE, new NullProgressMonitor())
		} catch (IOException e) {
			e.printStackTrace()
		} catch (CoreException e) {
			e.printStackTrace()
		}
	}
}
