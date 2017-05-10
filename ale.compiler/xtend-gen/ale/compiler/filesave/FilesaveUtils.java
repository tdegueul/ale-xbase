package ale.compiler.filesave;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class FilesaveUtils {
  public void saveContent(final IPath target, final String fileContent, final IProject project) {
    try {
      File _file = target.toFile();
      final FileWriter fileWriter = new FileWriter(_file);
      fileWriter.write(fileContent);
      fileWriter.close();
      NullProgressMonitor _nullProgressMonitor = new NullProgressMonitor();
      project.refreshLocal(IResource.DEPTH_INFINITE, _nullProgressMonitor);
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        e.printStackTrace();
      } else if (_t instanceof CoreException) {
        final CoreException e_1 = (CoreException)_t;
        e_1.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
