package ale.compiler

import ale.compiler.generator.AleGenerator
import ale.utils.EcoreUtils
import org.eclipse.core.resources.IFile

class AleRevisitorInterfaceCompiler {
	IFile file
	extension EcoreUtils = new EcoreUtils()

	new(IFile file) {
		this.file = file
	}

	def void compile() {
		val pkg = loadEPackage(file.fullPath.toString)
		val gm = loadCorrespondingGenmodel(file.fullPath.toString)

		new AleGenerator(file.project).saveRevisitorInterface(pkg, gm)
	}
}
