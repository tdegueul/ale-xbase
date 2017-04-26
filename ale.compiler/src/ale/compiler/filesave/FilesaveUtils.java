package ale.compiler.filesave;

import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;

public class FilesaveUtils {
	public void saveContent(final IPath target, final String fileContent, IProject project) {
		try {
			final FileWriter fileWriter = new FileWriter(target.toFile());
			fileWriter.write(fileContent);
			fileWriter.close();
			project.refreshLocal(IResource.DEPTH_INFINITE, new org.eclipse.core.runtime.NullProgressMonitor());
		} catch (final IOException e) {
			e.printStackTrace();
		} catch (CoreException e) {
			e.printStackTrace();
		}

	}
}
