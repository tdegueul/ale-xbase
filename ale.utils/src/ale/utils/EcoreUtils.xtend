package ale.utils

import java.util.List
import org.eclipse.emf.codegen.ecore.genmodel.GenClass
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

class EcoreUtils {
	def List<EClass> sortByName(Iterable<EClass> classes) {
		return classes.sortWith[c1, c2 |
			if (c1.name < c2.name) -1
			else if (c1.name > c2.name) 1
			else 0
		]
	}

	def List<EClass> getAllClasses(EPackage pkg) {
		val ret = newArrayList

		ret += pkg.EClassifiers.filter(EClass)
		ret += pkg.allSubPkgs.allClasses
		ret += pkg.referencedPkgs.allClasses
		
		return ret.toSet.toList
	}

	def List<EClass> getAllClasses(List<EPackage> pkgs) {
		return pkgs.map[allClasses].flatten.toSet.toList
	}

	def List<EPackage> getAllSubPkgs(EPackage pkg) {
		val ret = newArrayList
		getAllSubPkgsRec(pkg, ret)
		return ret
	}

	private def void getAllSubPkgsRec(EPackage pkg, List<EPackage> ret) {
		pkg.ESubpackages.forEach[p |
			getAllSubPkgsRec(p, ret)
			ret += p
		]
	}

	def List<EPackage> getDirectReferencedPkgs(List<EPackage> pkgs) {
		return pkgs.map[directReferencedPkgs].flatten.toList
	}

	def List<EPackage> getDirectReferencedPkgs(EPackage pkg) {
		val ret = <EPackage>newArrayList

		EcoreUtil.ExternalCrossReferencer.find(pkg).filter[o, s | o instanceof EClass].forEach[cls, s|
			var container = cls

			while (container !== null && !(container instanceof EPackage))
				container = container.eContainer

			val referenced = container as EPackage

			if (referenced !== null && !ret.exists[nsURI == referenced.nsURI] && !referenced.isEcore) {
				ret += referenced
			}
		]

		return ret
	}

	def List<EPackage> getReferencedPkgs(EPackage pkg) {
		val ret = newArrayList
		getReferencedPkgsRec(pkg, ret)
		return ret
	}

	private def void getReferencedPkgsRec(EPackage pkg, List<EPackage> ret) {
		EcoreUtil.ExternalCrossReferencer.find(pkg).filter[o, s | o instanceof EClass].forEach[cls, s|
			var container = cls

			while (container !== null && !(container instanceof EPackage))
				container = container.eContainer

			val referenced = container as EPackage

			if (referenced !== null && !ret.exists[nsURI == referenced.nsURI] && !referenced.isEcore) {
				ret += referenced
				referenced.getReferencedPkgsRec(ret)
			}
		]
	}

	def boolean isEcore(EPackage pkg) {
		return pkg.nsURI == "http://www.eclipse.org/emf/2002/Ecore"
	}

	def GenClass getGenClass(EClass cls, List<GenModel> gms) {
		return
			gms.allGenPkgs
			.filter[getEcorePackage.nsURI == cls.EPackage.nsURI]
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
			ret += gp
			getAllGenPkgsRec(gp, ret)
		]
		gm.usedGenPackages
		.filter[gp | gp !== null && gp.getEcorePackage !== null && !ret.exists[getEcorePackage.nsURI == gp.getEcorePackage.nsURI]]
		.forEach[gp |
			ret += gp
			getAllGenPkgsRec(gp.genModel, ret)
			getAllGenPkgsRec(gp, ret)
		]
	}

	private def void getAllGenPkgsRec(GenPackage gp, List<GenPackage> ret) {
		gp.subGenPackages
		.filter[gpp | !ret.exists[getEcorePackage.nsURI == gpp.getEcorePackage.nsURI]]
		.forEach[gpp |
			ret += gp
			getAllGenPkgsRec(gpp, ret)
		]
	}

	def EPackage loadEPackage(ResourceSet rs, String path) {
		rs.resourceFactoryRegistry.extensionToFactoryMap.put("ecore", new XMIResourceFactoryImpl)
		val resource = rs.getResource(URI.createPlatformResourceURI(path, true), true)
		return resource.contents.head as EPackage
	}

	def GenModel loadCorrespondingGenmodel(ResourceSet rs, String path) {
		rs.resourceFactoryRegistry.extensionToFactoryMap.put("genmodel", new XMIResourceFactoryImpl)
		// FIXME: jajaja, ugly af
		val resource = rs.getResource(URI.createPlatformResourceURI('''«path.substring(0, path.length() - 5)»genmodel''', true), true)
		return resource.contents.head as GenModel
	}
}
