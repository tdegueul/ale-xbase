package ale.compiler.filesave

import java.io.FileWriter
import java.io.IOException
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.NullProgressMonitor

class FilesaveUtils {
	def void saveContent(IPath target, String fileContent, IProject project) {
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
