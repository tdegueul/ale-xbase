package ale.compiler.generator

import ale.xtext.ale.AleClass
import ale.xtext.ale.ImportAle
import ale.xtext.ale.LiteralType
import ale.xtext.ale.OrderedSetType
import ale.xtext.ale.OutOfScopeType
import ale.xtext.ale.Root
import ale.xtext.ale.SequenceType
import ale.xtext.ale.Type
import java.util.List
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.ResourceSet

class TypeUtil {
	extension GraphUtil graphUtil
	extension JavaPathUtil javaPathUtil = new JavaPathUtil()
	ResourceSet resSet

	new(ResourceSet resSet) {
		this.resSet = resSet
		this.graphUtil = new GraphUtil(resSet)
	}

	public def String solveStaticType(Type type, List<EPackage> ePackages) {
		return
			switch (type) {
				case null: 'void'
				LiteralType: type.lit
				OrderedSetType: '''org.eclipse.emf.common.util.EList<«type.subType.solveStaticType(ePackages)»>'''
				SequenceType: '''org.eclipse.emf.common.util.EList<«type.subType.solveStaticType(ePackages)»>'''
				OutOfScopeType: {
					val allClasses = ePackages.buildGraph.nodes.map[elem];
					val foundClazz = allClasses.filter[name == type.externalClass].head
					foundClazz?.javaFullPath.toString
				}
			}
	}

	/*
	 * TODO: if not found in ale first ale clazz, try the parents
	 */
	public def AleClass getAleClass(String name, Root root) {
		var AleClass ret = null
		val AleClass findFirst = root.getClasses().filter[aleClass | aleClass.getName() == name].head

		if (findFirst !== null)
			ret = findFirst
		else {
			/**
			 * Lookup for matching aleClass in hierarchy
			 * Flatten left first
			 */
			for(ImportAle parentRoot: root.getImportsAle()) {
				// FIXME: suboptimal
				if (ret === null) {
					val AleClass aleClass = this.getAleClass(name, parentRoot.getRef());
					if (aleClass !== null)
						ret = aleClass;
				}
			}
		}

		return ret;
	}

	def Root getMatchingRoot(EClass eClass, Root root) {
		val newRoot = eClass.name.getAleClass(root)

		return
			if (newRoot !== null)
				newRoot.eContainer as Root
			else null
	}
}
