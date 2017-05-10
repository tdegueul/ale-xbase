package ale.compiler

import ale.compiler.filesave.AleOperationImplFilesave
import ale.compiler.filesave.AleOperationInterfaceFilesave
import ale.compiler.filesave.AleRevisitorImplFilesave
import ale.compiler.generator.TypeUtil
import ale.utils.EcoreUtils
import ale.xtext.AleRuntimeModule
import ale.xtext.ale.Root
import com.google.inject.Guice
import com.google.inject.Inject
import org.eclipse.core.resources.IFile
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet

class AleRevisitorImplCompiler {
	IFile file

	@Inject XtextResourceSet rs
	extension EcoreUtils = new EcoreUtils()
	AleRevisitorImplFilesave revisitorImplFilesave = new AleRevisitorImplFilesave()
	AleOperationInterfaceFilesave operationInterfaceFilesave = new AleOperationInterfaceFilesave()
	AleOperationImplFilesave operationImplFilesave = new AleOperationImplFilesave()

	new(IFile file) {
		this.file = file
	}

	def void compile() {
		val injector = Guice::createInjector(new AleRuntimeModule())
		injector.injectMembers(this)

		rs.addLoadOption(XtextResource::OPTION_RESOLVE_ALL, Boolean::TRUE)

		val resource = rs.getResource(
			URI::createPlatformResourceURI(file.fullPath.toString(), true), true)
		val root = (resource.contents.head as Root)
		val TypeUtil typeUtil = new TypeUtil(rs)
		
		// FIXME: jaja, ugly af
		val ePackages = root.importsEcore.map[rs.loadEPackage(ref)]
		val genmodels = root.importsEcore.map[rs.loadCorrespondingGenmodel(ref)]

		// generation of the concrete visitor from the syntactic scope defined
		// in the ale file
		revisitorImplFilesave.save(root, file.project, rs, ePackages, genmodels)

		// generation of the abstract operations
		val collect =
			ePackages
			.map[allClasses]
			.flatten
			.map[c | c -> typeUtil.getAleClass(c.name, root)]
			.filter[value === null || value.eContainer == root]

		collect.forEach[pair |
			operationInterfaceFilesave.save(file.project, pair.key, pair.value, rs, ePackages, root)
			operationImplFilesave.save(file.project, pair.key, pair.value, rs, ePackages, root)
		]
	}
}
