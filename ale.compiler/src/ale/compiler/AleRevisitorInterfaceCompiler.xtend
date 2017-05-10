package ale.compiler

import ale.compiler.generator.AleGenerator
import ale.utils.EcoreUtils
import ale.xtext.AleRuntimeModule
import com.google.inject.Guice
import com.google.inject.Inject
import org.eclipse.core.resources.IFile
import org.eclipse.xtext.resource.XtextResourceSet

class AleRevisitorInterfaceCompiler {
	IFile file
	extension EcoreUtils = new EcoreUtils()
	@Inject XtextResourceSet rs

	new(IFile file) {
		this.file = file
	}

	def void compile() {
		val injector = Guice::createInjector(new AleRuntimeModule())
		injector.injectMembers(this)
		val pkg = rs.loadEPackage(file.fullPath.toString)
		val gm = rs.loadCorrespondingGenmodel(file.fullPath.toString)

		new AleGenerator(file.project, rs).saveRevisitorInterface(pkg, gm, rs)
	}
}
