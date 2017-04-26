package ale.compiler.filesave;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;

import ale.compiler.generator.GenerateRevisitorImplXtend;
import ale.utils.StringUtils;
import ale.xtext.ale.Root;

public class AleRevisitorImplFilesave {

	private final FilesaveUtils filesaveUtils = new FilesaveUtils();

	public void save(final Root root, final IProject project, final ResourceSet resSet,
			final List<EPackage> ePackages) {
		final String revisitorName = root.getName();
		final IPath targetFile = initRevisitorImplFile(project.getLocation(), revisitorName);
		final String fileContent = new GenerateRevisitorImplXtend(resSet).generate(root, ePackages);
		filesaveUtils.saveContent(targetFile, fileContent, project);
	}

	private IPath initRevisitorImplFile(final IPath location, final String name) {
		final IPath file = location.append("src").append(name).append("revisitor").append("impl");
		file.toFile().mkdirs();
		return file.append(StringUtils.toFirstUpper(name) + "RevisitorImpl").addFileExtension("java");
	}

}
