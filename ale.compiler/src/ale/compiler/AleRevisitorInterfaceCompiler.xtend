package ale.compiler

import ale.compiler.filesave.AleRevisitorInterfaceFilesave
import ale.utils.EcoreUtils
import ale.xtext.AleRuntimeModule
import com.google.inject.Guice
import com.google.inject.Inject
import org.eclipse.core.resources.IFile
import org.eclipse.xtext.resource.XtextResourceSet

class AleRevisitorInterfaceCompiler {
	IFile file
	AleRevisitorInterfaceFilesave filesave = new AleRevisitorInterfaceFilesave()
	extension EcoreUtils = new EcoreUtils()
	@Inject XtextResourceSet rs

	new(IFile file) {
		this.file = file
	}

	def void compile() {
		val injector = Guice::createInjector(new AleRuntimeModule())
		injector.injectMembers(this)
		val ePackage = rs.loadEPackage(file.fullPath.toString)
		val genmodel = rs.loadCorrespondingGenmodel(file.fullPath.toString)

		filesave.save(ePackage, genmodel, file.project, rs)
	}
}
