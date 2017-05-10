package ale.compiler

import ale.compiler.filesave.AleRevisitorInterfaceFilesave
import ale.utils.AleEcoreUtil
import ale.xtext.AleRuntimeModule
import com.google.inject.Guice
import com.google.inject.Inject
import org.eclipse.core.resources.IFile
import org.eclipse.xtext.resource.XtextResourceSet

class AleRevisitorInterfaceCompiler {
	IFile file
	AleRevisitorInterfaceFilesave filesave = new AleRevisitorInterfaceFilesave()
	AleEcoreUtil ecoreLoadUtil = new AleEcoreUtil()
	@Inject XtextResourceSet rs

	new(IFile file) {
		this.file = file
	}

	def void compile() {
		val injector = Guice::createInjector(new AleRuntimeModule())
		injector.injectMembers(this)
		val ePackage = ecoreLoadUtil.loadEPackage(file, rs)
		val genmodel = ecoreLoadUtil.loadGenmodel(file, rs)

		filesave.save(ePackage, genmodel, file.project, rs)
	}
}
