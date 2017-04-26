package ale.compiler;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import ale.compiler.filesave.AleRevisitorInterfaceFilesave;
import ale.compiler.generator.GenerateRevisitorImplXtend;
import ale.utils.AleEcoreUtil;
import ale.xtext.AleStandaloneSetup;
import ale.xtext.ale.Root;

public class AleRevisitorImplCompiler {

	private final IFile file;

	private final AleEcoreUtil ecoreLoadUtil = new AleEcoreUtil();

	private final AleRevisitorInterfaceFilesave filesave = new AleRevisitorInterfaceFilesave();

	public AleRevisitorImplCompiler(final IFile file) {
		this.file = file;
	}

	public void compile() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ale", new XMIResourceFactoryImpl());

		final Injector injector = new AleStandaloneSetup().createInjectorAndDoEMFRegistration();
		final XtextResourceSet resourceSetXText = injector.getInstance(XtextResourceSet.class);
		resourceSetXText.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		final Resource resource = resourceSetXText.getResource(URI.createURI(this.file.getRawLocationURI().toString()),
				true);
		final Root root = (Root) resource.getContents().get(0);

		final ResourceSetImpl resourceSet = new ResourceSetImpl();
		final List<EPackage> ePackages = root.getImportsEcore().stream()
				.map(ie -> ecoreLoadUtil.loadEPackageByEcorePath(ie.getRef(), resourceSet))
				.collect(Collectors.toList());

		final IProject project = file.getProject();

		filesave.save(root, ePackages, project, resourceSet);
		new GenerateRevisitorImplXtend().generate(root);

	}
}
