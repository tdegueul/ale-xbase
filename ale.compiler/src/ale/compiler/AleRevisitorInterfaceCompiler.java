package ale.compiler;

import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import ale.compiler.generator.GenerateRevisitorInterface;

public class AleRevisitorInterfaceCompiler {

	private final IFile file;

	public AleRevisitorInterfaceCompiler(final IFile file) {
		this.file = file;
	}

	public void compile() {

		final EPackage ePackage = this.loadEPackage();

		final String name = ePackage.getName();
		final IPath directoryAlgebra = file.getProject().getLocation().append("src").append(name).append("algebra");
		directoryAlgebra.toFile().mkdirs();
		final IPath fileJavaAlgebra = directoryAlgebra.append(StringUtils.toFirstUpper(name) + "Algebra")
				.addFileExtension("java");

		final String fileContent = new GenerateRevisitorInterface().generate(ePackage);

		try {
			final FileWriter fileWriter = new FileWriter(fileJavaAlgebra.toFile());
			fileWriter.write(fileContent);
			fileWriter.close();
		} catch (final IOException e) {
			e.printStackTrace();
		}

	}

	private EPackage loadEPackage() {
		final URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);

		final ResourceSetImpl resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
		final Resource resource = resourceSet.getResource(uri, true);
		final EPackage ePackage = (EPackage) resource.getContents().get(0);
		return ePackage;
	}

}
