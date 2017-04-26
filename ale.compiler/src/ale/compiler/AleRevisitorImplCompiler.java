package ale.compiler;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

import ale.compiler.filesave.AleRevisitorImplFilesave;
import ale.compiler.filesave.AleRevisitorInterfaceFilesave;
import ale.utils.AleEcoreUtil;
import ale.xtext.AleRuntimeModule;
import ale.xtext.ale.Root;

public class AleRevisitorImplCompiler {

	@Inject
	private XtextResourceSet xtextResourceSet;

	private final IFile file;

	private final AleEcoreUtil ecoreLoadUtil = new AleEcoreUtil();

	private final AleRevisitorInterfaceFilesave revisitorInterfaceFilesave = new AleRevisitorInterfaceFilesave();
	private final AleRevisitorImplFilesave revisitorImplFilesave = new AleRevisitorImplFilesave();

	public AleRevisitorImplCompiler(final IFile file) {
		this.file = file;
	}

	public void compile() {
		final IProject project = file.getProject();

		final Injector injector = Guice.createInjector(new AleRuntimeModule());
		injector.injectMembers(this);
		xtextResourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);

		final Resource resource = xtextResourceSet
				.getResource(URI.createPlatformResourceURI(this.file.getFullPath().toString(), true), true);

		final Root root = (Root) resource.getContents().get(0);

		final ResourceSetImpl resourceSet = new ResourceSetImpl();
		final List<EPackage> ePackages = root.getImportsEcore().stream()
				.map(ie -> ecoreLoadUtil.loadEPackageByEcorePath(ie.getRef(), resourceSet))
				.collect(Collectors.toList());

		final List<Root> parentRoots = root.getImportsAle().stream().map(ale -> ale.getRef())
				.collect(Collectors.toList());

		// generation of the revisitor interface for the syntactic scope defined
		// in the ale file
		revisitorInterfaceFilesave.save(root, ePackages, project, resourceSet, parentRoots);

		// generation of the concrete visitor from the syntactic scope defined
		// in the ale file
		revisitorImplFilesave.save(root, project, resourceSet, ePackages);

	}
}
