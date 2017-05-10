package ale.compiler

import ale.compiler.filesave.AleOperationImplFilesave
import ale.compiler.filesave.AleOperationInterfaceFilesave
import ale.compiler.filesave.AleRevisitorImplFilesave
import ale.compiler.filesave.AleRevisitorInterfaceFilesave
import ale.compiler.generator.GraphUtil
import ale.compiler.generator.TypeUtil
import ale.utils.AleEcoreUtil
import ale.utils.Pair
import ale.xtext.AleRuntimeModule
import ale.xtext.ale.Root
import com.google.inject.Guice
import com.google.inject.Inject
import org.eclipse.core.resources.IFile
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet

class AleRevisitorImplCompiler {
	IFile file
	AleEcoreUtil aleEcoreUtil = new AleEcoreUtil()

	@Inject XtextResourceSet xtextResourceSet
	AleRevisitorInterfaceFilesave revisitorInterfaceFilesave = new AleRevisitorInterfaceFilesave()
	AleRevisitorImplFilesave revisitorImplFilesave = new AleRevisitorImplFilesave()
	AleOperationInterfaceFilesave operationInterfaceFilesave = new AleOperationInterfaceFilesave()
	AleOperationImplFilesave operationImplFilesave = new AleOperationImplFilesave()

	new(IFile file) {
		this.file = file
	}

	def void compile() {
		val injector = Guice::createInjector(new AleRuntimeModule())
		injector.injectMembers(this)

		xtextResourceSet.addLoadOption(XtextResource::OPTION_RESOLVE_ALL, Boolean::TRUE)

		val resource = xtextResourceSet.getResource(
			URI::createPlatformResourceURI(file.fullPath.toString(), true), true)
		val root = (resource.contents.head as Root)
		val rs = new ResourceSetImpl()
		val TypeUtil typeUtil = new TypeUtil(rs)
		
		val ePackages = root.importsEcore.map[aleEcoreUtil.loadEPackageByEcorePath(ref, rs)]
		val genmodels = root.importsEcore.map[aleEcoreUtil.loadGenmodelByEcorePath(ref, rs)]
		val parentRoots = root.importsAle.map[ref]

		// generation of the revisitor interface for the syntactic scope defined
		// in the ale file
		revisitorInterfaceFilesave.save(root, ePackages, genmodels, file.project, rs, parentRoots)

		// generation of the concrete visitor from the syntactic scope defined
		// in the ale file
		revisitorImplFilesave.save(root, file.project, rs, ePackages, genmodels)

		// generation of the abstract operations
		val listAllClasses = new GraphUtil(rs).getListAllClasses(ePackages)
		val collect =
			listAllClasses
			.map[clazz | new Pair(clazz, typeUtil.getAleClass(clazz.name, root))]
			.filter[p | p.v === null || p.v.eContainer() == root]

		collect.forEach[pair |
			operationInterfaceFilesave.save(file.project, pair.k, pair.v, rs, ePackages, root)
			operationImplFilesave.save(file.project, pair.k, pair.v, rs, ePackages, root)
		]
	}
}
