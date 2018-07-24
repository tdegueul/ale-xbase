package ale.xtext.utils

import com.google.inject.Inject
import java.util.Collection
import java.util.Comparator
import java.util.List
import java.util.Map
import org.eclipse.emf.codegen.ecore.genmodel.GenClass
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.xbase.lib.Functions.Function1

class EcoreUtils {
	@Inject XtextResourceSet rs
	
	def void resetResourceSet() {
		rs = new XtextResourceSet
	}
	
	def buildExtendedFactoryNames(List<EClass> classes) {
		val List<Pair<EClass, Iterable<EClass>>> a = classes.map [
			val st = newArrayList()
			it.EAllSuperTypes.forEach[st.add(it)]
			st.add(it)
			(it -> st.map[it.ESuperTypes].filter[it.size > 1].flatten)
		]
		val List<Pair<EClass, Iterable<EClass>>> b = a.sortWith(
			Comparator.comparing([Pair<EClass, Iterable<EClass>> t|t.key.name]).
				thenComparing([ Pair<EClass, Iterable<EClass>> t |
					t.key.EPackage.name
				])
		)

		val List<List<Pair<EClass, EClass>>> c = b.map [ p |
			val List<Pair<EClass, EClass>> ret = newArrayList();
			val k = p.key
			ret.add((k -> null))
			val pv = p.value
			val List<Pair<EClass, EClass>> ll = pv.map[l|(k -> l)].toList
			ret.addAll(ll)
			ret
		]

		c.flatten.toList
	}

	def <R> getComplementaryFromEPackage(EPackage pkg,
		Function1<? super Map.Entry<String, String>, ? extends List<R>> transformation) {
		if (pkg !== null && pkg.EAnnotations.exists[it.source == "@BrewRequires"]) {
			pkg.EAnnotations.findFirst[it.source == "@BrewRequires"].details.filter[it.value == "ecoreUrl"].map [
				transformation.apply(it)
			].flatten
		} else
			#[]
	}

	def List<EClass> sortByName(Iterable<EClass> classes) {
		return classes.sortWith(Comparator.comparing([EClass t|t.name]).thenComparing([EClass t|t.EPackage.name]))
	}

	def List<Pair<EClass, EClass>> getSubClasses(EClass cls, List<Pair<EClass, EClass>> classes) {
		/**
		 * We fist look at pairs from classes where the key is a subclass of cls
		 * When two pairs are found with the same key, one with value null and one with the value cls, we keep the one with cls.  
		 */
		val tmp = classes.filter [ o |
			val isSuperType = o.key.EAllSuperTypes.exists [
				it.name == cls.name && it.EPackage.name == cls.EPackage.name
			]
			o.key != cls && isSuperType && (o.value == cls || o.value === null)
		]
		
		return tmp.map[key].toSet.map[k|
			val matched = tmp.filter[it.key == k]
			if(matched.size == 1) matched.head
			else matched.filter[it.value !== null].head
		].toList
				
	}

	def List<EClass> getAllClasses(EPackage pkg) {
		val ret = newArrayList

		if (pkg !== null) {
			ret += pkg.EClassifiers.filter(EClass)
			ret += pkg.allSubPkgs.allClasses
			ret += pkg.referencedPkgs.allClasses

		}

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
		pkg.ESubpackages.forEach [ p |
			getAllSubPkgsRec(p, ret)
			ret += p
		]
	}

	def List<EPackage> getDirectReferencedPkgs(EPackage pkg) {
		val ret = <EPackage>newArrayList

		EcoreUtil.ExternalCrossReferencer.find(pkg).filter[o, s|o instanceof EClass].forEach [ cls, s |
			var container = cls

			while (container !== null && !(container instanceof EPackage))
				container = container.eContainer

			val referenced = container as EPackage

			if (referenced !== null && !ret.exists[nsURI == referenced.nsURI] && !referenced.isEcore) {
				ret += referenced
			}
		]

		pkg.getComplementaryFromEPackage[#[it.key.loadEPackage]].forEach [ pp |
			if(!ret.exists[pp.name == it.name]) ret += pp
		]

		return ret
	}

	def List<EPackage> getReferencedPkgs(EPackage pkg) {
		val ret = newArrayList
		getReferencedPkgsRec(pkg, ret)
		return ret
	}

	private val Map<EPackage, Map<EObject, Collection<EStructuralFeature.Setting>>> cache = newHashMap()

	private def void getReferencedPkgsRec(EPackage pkg, List<EPackage> ret) {

		if (!cache.containsKey(pkg)) {
			cache.put(pkg, EcoreUtil.ExternalCrossReferencer.find(pkg))
		}

		cache.get(pkg).filter[o, s|o instanceof EClass].forEach [ cls, s |
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

	def boolean hasRequiredAnnotation(EClass cls) {
		return cls.EAnnotations.exists[source == "@Required"]
	}

	def boolean isEcore(EPackage pkg) {
		return pkg.nsURI == "http://www.eclipse.org/emf/2002/Ecore"
	}

	def GenClass getGenClass(EClass cls, GenModel gm) {

		val allPkgs = gm.allGenPkgs
		val fgm = allPkgs.findFirst [
//			println('''«getEcorePackage.nsURI» == «cls.EPackage.nsURI»''')
			getEcorePackage.nsURI == cls.EPackage.nsURI
		]

		val classes = fgm?.genClasses

		val ret = classes?.findFirst [
			name == cls.name
		]
		
		if(ret === null) {
			println('''Nothing found for «cls» in «gm»''')
		}
		
		ret

	}

	def List<GenPackage> getAllGenPkgs(List<GenModel> gms) {
		return gms.map[allGenPkgs].flatten.toList
	}

	def List<GenPackage> getAllGenPkgs(GenModel gm) {
		val ret = newArrayList
		getAllGenPkgsRec(gm, ret)
		return ret
	}

	private def void getAllGenPkgsRec(GenModel gm, List<GenPackage> ret) {
		gm.genPackages.filter[gp|!ret.exists[getEcorePackage.nsURI == gp.getEcorePackage.nsURI]].forEach [ gp |
			ret += gp
			getAllGenPkgsRec(gp, ret)
		]
		gm.usedGenPackages.filter [ gp |
			gp !== null && gp.getEcorePackage !== null && !ret.exists[getEcorePackage.nsURI == gp.getEcorePackage.nsURI]
		].forEach [ gp |
			ret += gp
			getAllGenPkgsRec(gp.genModel, ret)
			getAllGenPkgsRec(gp, ret)
		]
	}

	private def void getAllGenPkgsRec(GenPackage gp, List<GenPackage> ret) {
		gp.subGenPackages.filter[gpp|!ret.exists[getEcorePackage.nsURI == gpp.getEcorePackage.nsURI]].forEach [ gpp |
			ret += gp
			getAllGenPkgsRec(gpp, ret)
		]
	}

	def EPackage loadEPackage(String path) {
		if (rs === null) {
			rs = new XtextResourceSet
		}
		rs.resourceFactoryRegistry.extensionToFactoryMap.put("ecore", new XMIResourceFactoryImpl)
		try {
			
			if(rs.resources.exists[it.URI.toString == path]) {
				val r = rs.resources.findFirst[it.URI.toString == path]
				val ret = r.contents.head as EPackage
				return ret
			}
			
			val resource = if (path.startsWith("platform:/"))
					rs.getResource(URI.createURI(path), true)
				else if (path.startsWith("/"))
					rs.getResource(URI::createPlatformResourceURI(path, true), true)
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
			val resource = if (path.startsWith("platform:/"))
					rs.getResource(URI.createURI('''«path.substring(0, path.length() - 5)»genmodel'''), true)
				else if (path.startsWith("/"))
					rs.getResource(
						URI.createPlatformResourceURI('''«path.substring(0, path.length() - 5)»genmodel''', true), true)
				else
					rs.getResource(URI.createFileURI('''«path.substring(0, path.length() - 5)»genmodel'''), true)
			return resource.contents.head as GenModel
		} catch (Exception e) {
			return null
		}
	}
}
