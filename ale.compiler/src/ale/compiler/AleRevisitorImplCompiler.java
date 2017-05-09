package ale.compiler;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

import ale.compiler.filesave.AleOperationImplFilesave;
import ale.compiler.filesave.AleOperationInterfaceFilesave;
import ale.compiler.filesave.AleRevisitorImplFilesave;
import ale.compiler.filesave.AleRevisitorInterfaceFilesave;
import ale.compiler.generator.GraphUtil;
import ale.compiler.generator.TypeUtil;
import ale.utils.AleEcoreUtil;
import ale.utils.Pair;
import ale.xtext.AleRuntimeModule;
import ale.xtext.ale.AleClass;
import ale.xtext.ale.Root;

public class AleRevisitorImplCompiler {

	@Inject
	private XtextResourceSet xtextResourceSet;

	private final IFile file;

	private final AleEcoreUtil ecoreLoadUtil = new AleEcoreUtil();

	private final AleRevisitorInterfaceFilesave revisitorInterfaceFilesave = new AleRevisitorInterfaceFilesave();
	private final AleRevisitorImplFilesave revisitorImplFilesave = new AleRevisitorImplFilesave();
	private final AleOperationInterfaceFilesave operationInterfaceFilesave = new AleOperationInterfaceFilesave();
	private final AleOperationImplFilesave operationImplFilesave = new AleOperationImplFilesave();

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
		TypeUtil typeUtil = new TypeUtil(resourceSet);

		final List<EPackage> ePackages =
			root.getImportsEcore().stream()
			.map(ie -> ecoreLoadUtil.loadEPackageByEcorePath(ie.getRef(), resourceSet))
			.collect(Collectors.toList());

		final List<GenModel> genmodels =
			root.getImportsEcore().stream()
			.map(ie -> ecoreLoadUtil.loadGenmodelByEcorePath(ie.getRef(), resourceSet))
			.collect(Collectors.toList());

		final List<Root> parentRoots =
			root.getImportsAle().stream()
			.map(ale -> ale.getRef())
			.collect(Collectors.toList());

		// generation of the revisitor interface for the syntactic scope defined
		// in the ale file
		revisitorInterfaceFilesave.save(root, ePackages, genmodels, project, resourceSet, parentRoots);

		// generation of the concrete visitor from the syntactic scope defined
		// in the ale file
		revisitorImplFilesave.save(root, project, resourceSet, ePackages, genmodels);

		// generation of the abstract operations
		final List<EClass> listAllClasses = new GraphUtil(resourceSet).getListAllClasses(ePackages);
		final List<Pair<EClass, AleClass>> collect =
				listAllClasses.stream()
				.map(clazz -> new Pair<>(clazz, typeUtil.getAleClass(clazz.getName(), root)))
				.filter(p -> {
					return p.v == null || p.v.eContainer().equals(root);
				})
				.collect(Collectors.toList());

		collect.forEach(pair -> {
			operationInterfaceFilesave.save(project, pair.k, pair.v, resourceSet, ePackages, root);
			operationImplFilesave.save(project, pair.k, pair.v, resourceSet, ePackages, root);
		});
	}
}
