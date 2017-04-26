package ale.compiler;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import ale.compiler.filesave.AleRevisitorInterfaceFilesave;
import ale.utils.AleEcoreUtil;

public class AleRevisitorInterfaceCompiler {

	private final IFile file;
	private final AleRevisitorInterfaceFilesave filesave = new AleRevisitorInterfaceFilesave();

	private final AleEcoreUtil ecoreLoadUtil = new AleEcoreUtil();

	public AleRevisitorInterfaceCompiler(final IFile file) {
		this.file = file;
	}

	public void compile() {
		ResourceSet resSet = new ResourceSetImpl();
		final EPackage ePackage = ecoreLoadUtil.loadEPackage(file, resSet);
		filesave.save(ePackage, file.getProject(), resSet);
	}
}
