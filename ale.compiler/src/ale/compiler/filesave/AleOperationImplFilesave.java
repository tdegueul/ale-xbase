package ale.compiler.filesave;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;

import ale.compiler.generator.GenerateOperationImplXtend;
import ale.utils.StringUtils;
import ale.xtext.ale.AleClass;
import ale.xtext.ale.Root;

public class AleOperationImplFilesave {

	private final FilesaveUtils filesaveUtils = new FilesaveUtils();

	public void save(final IProject project, final EClass eClass, final AleClass aleClass, final ResourceSet resSet, List<EPackage> ePackages, Root root) {
		final IPath targetFile = initOperationInterfaceFile(project.getLocation(), eClass, aleClass);
		final String fileContent = new GenerateOperationImplXtend(resSet).generate(eClass, aleClass, ePackages, root);
		filesaveUtils.saveContent(targetFile, fileContent, project);
	}

	private IPath initOperationInterfaceFile(final IPath location, final EClass eClass, final AleClass aleClass) {
		final String aleName;
		if (aleClass != null) {
			aleName = ((Root) aleClass.eContainer()).getName();
		} else {
			aleName = "void";
		}
		final IPath directoryAlgebra = location.append("src").append(aleName).append("revisitor")
				.append("operation").append("impl");
		directoryAlgebra.toFile().mkdirs();

		final String fileName = StringUtils.toFirstUpper(aleName)
				+ StringUtils.toFirstUpper(eClass.getName()) + "OperationImpl";
		return directoryAlgebra.append(fileName).addFileExtension("java");
	}

}
