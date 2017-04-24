package ale.compiler;

import java.net.URI;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class AleRevisitorImplCompiler {

	private final IFile file;

	public AleRevisitorImplCompiler(final IFile file) {
		this.file = file;
	}

	public void compile() {

		final EPackage ePackage = this.loadEPackage();

		final String name = ePackage.getName();
		final IPath directoryAlgebra = file.getProject().getLocation().append("src").append(name).append("algebra");
		directoryAlgebra.toFile().mkdirs();
		final IPath fileJavaAlgebra = directoryAlgebra.append(StringUtils.toFirstUpper(name) + "Algebra")
				.addFileExtension("java");

		// generates code only if directly specified in the specification or if
		// needed and does not exists
		// if (isRootPackage || !isRootPackage &&
		// !fileJavaAlgebra.toFile().exists()) {
		// final String fileContent = new
		// GenerateAlgebra().generateAlgebraInterface(ePackage, otherPackages);
		//
		// try {
		// final FileWriter fileWriter = new
		// FileWriter(fileJavaAlgebra.toFile());
		// fileWriter.write(fileContent);
		// fileWriter.close();
		// } catch (final IOException e) {
		// e.printStackTrace();
		// }
		// }

	}

	private EPackage loadEPackage() {
		final URI locationURI = this.file.getLocationURI();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
		final ResourceSetImpl resourceSetImpl = new ResourceSetImpl();
		return (EPackage) resourceSetImpl
				.getResource(org.eclipse.emf.common.util.URI.createURI(locationURI.toString()), false).getContents()
				.get(0);
	}

}
