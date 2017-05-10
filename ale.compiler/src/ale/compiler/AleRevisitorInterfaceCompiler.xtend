package ale.compiler

import ale.compiler.filesave.AleRevisitorInterfaceFilesave
import ale.utils.AleEcoreUtil
import org.eclipse.core.resources.IFile
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

class AleRevisitorInterfaceCompiler {
	IFile file
	AleRevisitorInterfaceFilesave filesave = new AleRevisitorInterfaceFilesave()
	AleEcoreUtil ecoreLoadUtil = new AleEcoreUtil()

	new(IFile file) {
		this.file = file
	}

	def void compile() {
		val rs = new ResourceSetImpl()
		val ePackage = ecoreLoadUtil.loadEPackage(file, rs)
		val genmodel = ecoreLoadUtil.loadGenmodel(file, rs)

		filesave.save(ePackage, genmodel, file.project, rs)
	}
}
