package ale.compiler.filesave;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;

import ale.compiler.StringUtils;
import ale.compiler.generator.GenerateRevisitorInterfaceXtend;
import ale.xtext.ale.Root;

public class AleRevisitorInterfaceFilesave {
	public void save(final EPackage ePackage, final IProject project, ResourceSet resSet) {
		final String revisitorName = ePackage.getName();
		final IPath fileJavaAlgebra = initRevisitorInterfaceFile(project.getLocation(), revisitorName);
		final String fileContent = new GenerateRevisitorInterfaceXtend(resSet).generate(ePackage);
		saveContent(fileJavaAlgebra, fileContent, project);
	}

	public void save(final Root root, final List<EPackage> ePackages, final IProject project, ResourceSet resSet) {
		final String revisitorName = root.getName();
		final IPath fileJavaAlgebra = initRevisitorInterfaceFile(project.getLocation(), revisitorName);
		final String fileContent = new GenerateRevisitorInterfaceXtend(resSet).generate(revisitorName, ePackages);
		saveContent(fileJavaAlgebra, fileContent, project);
	}

	private void saveContent(final IPath fileJavaAlgebra, final String fileContent, IProject project) {
		try {
			final FileWriter fileWriter = new FileWriter(fileJavaAlgebra.toFile());
			fileWriter.write(fileContent);
			fileWriter.close();
			project.refreshLocal(IResource.DEPTH_INFINITE, new org.eclipse.core.runtime.NullProgressMonitor());
		} catch (final IOException e) {
			e.printStackTrace();
		} catch (CoreException e) {
			e.printStackTrace();
		}

	}

	private IPath initRevisitorInterfaceFile(final IPath projectLocation, final String name) {
		final IPath directoryAlgebra = projectLocation.append("src").append(name).append("revisitor");
		directoryAlgebra.toFile().mkdirs();
		return directoryAlgebra.append(StringUtils.toFirstUpper(name) + "Revisitor").addFileExtension("java");
	}

}
