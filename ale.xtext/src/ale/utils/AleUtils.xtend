package ale.utils

import ale.xtext.ale.AbstractMethod
import ale.xtext.ale.AleClass
import ale.xtext.ale.ConcreteMethod
import ale.xtext.ale.Method
import ale.xtext.ale.Root
import com.google.inject.Inject
import java.util.List
import java.util.Set
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.common.types.JvmFormalParameter
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference
import org.eclipse.xtext.xbase.typesystem.references.StandardTypeReferenceOwner
import org.eclipse.xtext.xbase.typesystem.util.CommonTypeComputationServices

class AleUtils {
	@Inject extension EcoreUtils
	@Inject CommonTypeComputationServices services

	def AleClass findNearestGeneratedParent(AleClass cls) {
		return
			cls.matchingEClass
			.getAllAleClasses(cls.root)
			.filter[it != cls]
			.findFirst[generated]
	}

	def List<Root> getAllParents(Root root, boolean includeSelf) {
		val ret = newHashSet
		if (includeSelf)
			ret += root
		root.importsAle.forEach[getAllParentsRec(ref, ret)]
		return ret.toList
	}

	def List<AleClass> getAllAleClasses(Root root) {
		return root.getAllParents(true).map[classes].flatten.toList
	}

	def Root getRoot(AleClass cls) {
		return cls.eContainer as Root
	}
	
	def EClass getMatchingEClass(AleClass cls) {
		return cls.root.allEClasses.findFirst[name == cls.name]
	}

	def boolean isAbstract(AleClass cls) {
		return !cls.getAllMethods(false).filter(AbstractMethod).empty
	}

	def EPackage getImportedEPackage(Root root) {
		return root.importEcore.ref.loadEPackage
	}

	def List<EPackage> getAllEPackages(Root root) {
		val roots = root.getAllParents(true)
		return roots.map[importEcore?.ref].filterNull.map[loadEPackage].toList
	}

	def List<EClass> getAllEClasses(Root root) {
		return root.getAllEPackages.allClasses
	}

	def List<AleClass> getAleClasses(EClass eCls, Root root) {
		return root.allAleClasses.filter[name == eCls.name].toList
	}

	def List<AleClass> getAllAleClasses(EClass eCls, Root root) {
		val ret = newArrayList
		
		ret += eCls.getAleClasses(root)
		ret +=
			eCls.EAllSuperTypes
			.sortWith[a, b |
				if (a.EAllSuperTypes.contains(b)) -1
				else if (b.EAllSuperTypes.contains(a)) 1
				else 0
			]
			.map[getAleClasses(root)]
			.flatten

		return ret
	}

	def List<Method> getAllMethods(AleClass aleCls, boolean withOverride) {
		val ret = newArrayList
		val correspondingEClass = aleCls.matchingEClass

		correspondingEClass
			.getAllAleClasses(aleCls.root)
			.map[methods]
			.flatten
			.sortWith[a, b |
				if (a instanceof ConcreteMethod) -1
				else if (b instanceof ConcreteMethod) 1
				else 0
			]
			.sortWith[a, b |
				if (a.overrides(b)) -1
				else if (b.overrides(a)) 1
				else 0
			]
			.sortWith[a, b |
				if ((a.eContainer as AleClass).matchingEClass.EAllSuperTypes.contains((b.eContainer as AleClass).matchingEClass)) -1
				else if ((b.eContainer as AleClass).matchingEClass.EAllSuperTypes.contains((a.eContainer as AleClass).matchingEClass)) 1
				else 0
			]
			.forEach[m1 |
				if (withOverride || !ret.exists[m2 | m2.overrides(m1)])
					ret += m1
			]

		return ret
	}

	def boolean isGenerated(AleClass aleCls) {
		return !aleCls.methods.empty
	}

//	def List<Method> getAllUniqueMethods(AleClass aleCls, boolean includeSelf) {
//		val allMethods = aleCls.getAllMethods(includeSelf)
//		allMethods.removeIf[m1 |
//			allMethods.exists[m2 |
//				m1 != m2 && m2.overrides(m1)
//			]
//		]
//		return allMethods
//	}

	def boolean overrides(Method m1, Method m2) {
		return
			   m1.name == m2.name
			&& ((m1.type === null && m2.type === null)
				|| m1.type.isSubtypeOf(m2.type))
			&& parametersEqual(m1.params, m2.params)
	}

	private def boolean parametersEqual(List<JvmFormalParameter> p1, List<JvmFormalParameter> p2) {
		if (p1.size != p2.size)
			return false

		for (i : 0 ..< p1.size)
			if (p1.get(i).parameterType.qualifiedName !=
				p2.get(i).parameterType.qualifiedName)
				return false

		return true
	}

	def boolean isSubtypeOf(JvmTypeReference r1, JvmTypeReference r2) {
		return
			if (r1 !== null && r2 !== null)
				r1.toLightweightTypeReference(r1.eResource).isSubtypeOf(r2.type)
			else
				false
	}
	
	def LightweightTypeReference toLightweightTypeReference(JvmTypeReference typeRef, Resource context) {
		return
			if (typeRef !== null && context !== null)
				new StandardTypeReferenceOwner(services, context).toLightweightTypeReference(typeRef)
			else
				null
	}

	private def void getAllParentsRec(Root root, Set<Root> ret) {
		ret += root
		root.importsAle.forEach[getAllParentsRec(ref, ret)]
	}
}
