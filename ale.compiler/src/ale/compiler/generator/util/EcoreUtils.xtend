package ale.compiler.generator.util

import java.util.List
import org.eclipse.emf.codegen.ecore.genmodel.GenClass
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage
import org.eclipse.emf.ecore.EClass

class EcoreUtils {
	def GenClass getGenClass(EClass cls, List<GenModel> gms) {
		return
			gms.allGenPkgs
			.filter[getEcorePackage == cls.EPackage]
			.head
			.genClasses
			.filter[name == cls.name]
			.head
	}

	def List<GenPackage> getAllGenPkgs(List<GenModel> gms) {
		return
			gms
			.map[allGenPkgs]
			.flatten
			.toList
	}

	def List<GenPackage> getAllGenPkgs(GenModel gm) {
		val ret = newArrayList
		getAllGenPkgsRec(gm, ret)
		return ret
	}

	private def void getAllGenPkgsRec(GenModel gm, List<GenPackage> ret) {
		gm.genPackages
		.filter[gp | !ret.exists[getEcorePackage.nsURI == gp.getEcorePackage.nsURI]]
		.forEach[gp |
			ret.add(gp)
			getAllGenPkgsRec(gp, ret)
		]
		gm.usedGenPackages
		.filter[gp | gp !== null && gp.getEcorePackage !== null && !ret.exists[getEcorePackage.nsURI == gp.getEcorePackage.nsURI]]
		.forEach[gp |
			ret.add(gp)
			getAllGenPkgsRec(gp.genModel, ret)
			getAllGenPkgsRec(gp, ret)
		]
	}

	private def void getAllGenPkgsRec(GenPackage gp, List<GenPackage> ret) {
		gp.subGenPackages
		.filter[gpp | !ret.exists[getEcorePackage.nsURI == gpp.getEcorePackage.nsURI]]
		.forEach[gpp |
			ret.add(gpp)
			getAllGenPkgsRec(gpp, ret)
		]
	}
}
