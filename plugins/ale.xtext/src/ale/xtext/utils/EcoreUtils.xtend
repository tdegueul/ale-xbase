package ale.xtext.utils

import com.google.inject.Inject
import java.util.List
import org.eclipse.emf.codegen.ecore.genmodel.GenClass
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.xtext.resource.XtextResourceSet

class EcoreUtils {
	@Inject XtextResourceSet rs

	def List<EClass> sortByName(Iterable<EClass> classes) {
		return classes.sortWith[c1, c2 |
			if (c1.name < c2.name) -1
			else if (c1.name > c2.name) 1
			else 0
		]
	}

	def List<EClass> getSubClasses(EClass cls, List<EClass> classes) {
		return
			classes
			.filter[o | o != cls && cls.isSuperTypeOf(o)]
			.toList
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

	def GenClass getGenClass(EClass cls, GenModel gm) {
		return
			gm.allGenPkgs
			.findFirst[getEcorePackage.nsURI == cls.EPackage.nsURI]
			.genClasses
			.findFirst[name == cls.name]
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

	def EPackage loadEPackage(String path) {
		if (rs === null)
			rs = new XtextResourceSet
		rs.resourceFactoryRegistry.extensionToFactoryMap.put("ecore", new XMIResourceFactoryImpl)
		try {
			val resource =
				if (path.startsWith("platform:/"))
					rs.getResource(URI.createURI(path), true)
				else
					rs.getResource(URI::createFileURI(path), true)
			return resource.contents.head as EPackage
		} catch (Exception e) {
			return null
		}
	}

	def GenModel loadCorrespondingGenmodel(String path) {
		if (rs === null)
			rs = new XtextResourceSet
		rs.resourceFactoryRegistry.extensionToFactoryMap.put("genmodel", new XMIResourceFactoryImpl)
		// FIXME: jajaja, ugly af
		try {
			val resource =
				if (path.startsWith("platform:/"))
					rs.getResource(URI.createURI('''«path.substring(0, path.length() - 5)»genmodel'''), true)
				else
					rs.getResource(URI.createFileURI('''«path.substring(0, path.length() - 5)»genmodel'''), true)
			return resource.contents.head as GenModel
		} catch (Exception e) {
			return null
		}
	}
}
