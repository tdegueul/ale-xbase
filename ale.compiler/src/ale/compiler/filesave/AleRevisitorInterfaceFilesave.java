package ale.compiler.filesave;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;

import ale.compiler.StringUtils;
import ale.compiler.generator.GenerateRevisitorInterfaceXtend;
import ale.xtext.ale.Root;

public class AleRevisitorInterfaceFilesave {

	private final FilesaveUtils filesaveUtils = new FilesaveUtils();

	public void save(final EPackage ePackage, final IProject project, ResourceSet resSet) {
		final String revisitorName = ePackage.getName();
		final IPath target = initRevisitorInterfaceFile(project.getLocation(), revisitorName);
		final String fileContent = new GenerateRevisitorInterfaceXtend(resSet).generate(ePackage);
		filesaveUtils.saveContent(target, fileContent, project);
	}

	public void save(final Root root, final List<EPackage> ePackages, final IProject project, ResourceSet resSet, List<Root> parentRoots) {
		final String revisitorName = root.getName();
		final IPath target = initRevisitorInterfaceFile(project.getLocation(), revisitorName);
		final String fileContent = new GenerateRevisitorInterfaceXtend(resSet).generate(revisitorName, ePackages, parentRoots);
		filesaveUtils.saveContent(target, fileContent, project);
	}

	private IPath initRevisitorInterfaceFile(final IPath projectLocation, final String name) {
		final IPath file = projectLocation.append("src").append(name).append("revisitor");
		file.toFile().mkdirs();
		return file.append(StringUtils.toFirstUpper(name) + "Revisitor").addFileExtension("java");
	}

}
