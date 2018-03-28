package ale.xtext.validation

import ale.xtext.ale.AbstractMethod
import ale.xtext.ale.AleClass
import ale.xtext.ale.AlePackage
import ale.xtext.ale.AleRoot
import ale.xtext.ale.ConcreteMethod
import ale.xtext.ale.DefMethod
import ale.xtext.ale.EcoreImport
import ale.xtext.ale.OverrideMethod
import ale.xtext.utils.AleUtils
import ale.xtext.utils.EcoreUtils
import com.google.inject.Inject
import java.util.List
import org.eclipse.xtext.validation.Check

class AleValidator extends AbstractAleValidator {
	@Inject extension EcoreUtils
	@Inject extension AleUtils

	public static final String SYNTAX_NOT_FOUND = "SYNTAX_NOT_FOUND"
	public static final String SEMANTICS_IMPORT_LOOP = "SEMANTICS_IMPORT_LOOP"
	public static final String UNKNOWN_OPENCLASS = "UNKNOWN_OPENCLASS"
	public static final String ABSTRACT_METHOD_NOT_IMPL = "ABSTRACT_METHOD_NOT_IMPL"
	public static final String NO_ABSTRACT_METHOD_IF_NO_SUBCLASS = "NO_ABSTRACT_METHOD_IF_NO_SUBCLASS"
	public static final String ALECLASS_NAME_UNIQUENESS = "ALECLASS_NAME_UNIQUENESS"
	public static final String OVERRIDE_MISSING = "OVERRIDE_MISSING"
	public static final String SUPERFLUOUS_OVERRIDE = "SUPERFLUOUS_OVERRIDE"
	public static final String NO_CONCRETE_IN_REQUIRED = "NO_CONCRETE_IN_REQUIRED"

	@Check
	def void checkValidSyntax(EcoreImport syntax) {
		if (syntax.uri.loadEPackage === null) {
			error(
				"Couldn't not find an EPackage at the URI " + syntax.uri,
				syntax,
				AlePackage.Literals.ECORE_IMPORT__URI,
				SYNTAX_NOT_FOUND
			)
		}
	}

	private def void loadAllSemantics(AleRoot root, List<AleRoot> sems) {
		val List<AleRoot> ales = root.aleImports.map[ref]
		for (ale : ales) {
			if (!sems.contains(ale)) {
				sems.add(ale)
				ale.loadAllSemantics(sems)
			}
		}
	}

	@Check
	def void checkImportSemanticNonCyclic(AleRoot root) {
		val recDeps = newArrayList()
		root.loadAllSemantics(recDeps)
		if (recDeps.contains(root)) {
			error("Ale dependencies loop", root, AlePackage.Literals.ALE_ROOT__NAME, SEMANTICS_IMPORT_LOOP)
		}
	}

	@Check
	def void checkIsOpenClassImported(AleClass aleClass) {
		if (!aleClass.root.allEClasses.exists[name == aleClass.name])
			error(
				"Cannot find corresponding concept " + aleClass.name,
				aleClass,
				AlePackage.Literals.ALE_CLASS__NAME, 
				UNKNOWN_OPENCLASS
			)
	}

	@Check
	def void checkNoAbstractMethodsIfNoSubclasses(AleClass aleCls) {
		val root = aleCls.root
		val eCls = aleCls.getMatchingEClass

		if (!eCls.hasRequiredAnnotation && !root.allEClasses.exists[ESuperTypes.contains(eCls)]) {
			aleCls.methods.filter(AbstractMethod).forEach[m |
				error("The method " + m.name + " cannot be abstract as there are no subclasses to implement it.",
					m,
					AlePackage.Literals.ALE_METHOD__NAME,
					NO_ABSTRACT_METHOD_IF_NO_SUBCLASS
				)
			]
		}
	}

	@Check
	def void checkAleClassUniqueness(AleClass aleCls) {
		if (aleCls.root.classes.exists[aleCls != it && name == aleCls.name])
			error("Duplicate open-class " + aleCls.name + " in " + aleCls.root.name,
				aleCls,
				AlePackage.Literals.ALE_CLASS__NAME,
				ALECLASS_NAME_UNIQUENESS
			)
	}

	@Check
	def void checkAbstractMethodsAreImplemented(AleClass aleCls) {
		val root = aleCls.root
		val eCls = aleCls.getMatchingEClass

		if (!eCls.hasRequiredAnnotation && !root.allEClasses.exists[ESuperTypes.contains(eCls)]) {
			val abst = aleCls.getAllMethods(true).filter(AbstractMethod)

			val notImpl =
				abst.filter[am |
					!aleCls.getAllMethods(true)
					.filter(ConcreteMethod)
					.exists[cm | cm != am && cm.overrides(am)]
				]

			if (!notImpl.empty)
				error(aleCls.name + " must implement the following inherited abstract methods: " + notImpl.map[name].join(", "),
					aleCls,
					AlePackage.Literals.ALE_CLASS__NAME,
					ABSTRACT_METHOD_NOT_IMPL
				)
		}
	}

	@Check
	def void checkNoMissingOverride(DefMethod m) {
		if (!m.overridenMethods.empty)
			error(
				"Method " + m.name + " must use the 'override' keyword as it overrides a supertype method.",
				m,
				AlePackage.Literals::ALE_METHOD__NAME,
				OVERRIDE_MISSING
			)
	}

	@Check
	def void checkSuperfluousOverride(OverrideMethod m) {
		if (m.overridenMethods.empty)
			error(
				"Method " + m.name + " does not override a supertype method.",
				m,
				AlePackage.Literals::ALE_METHOD__NAME,
				SUPERFLUOUS_OVERRIDE
			)
	}

	@Check
	def void checkNoConcreteMethodsForRequired(AleClass cls) {
		val eCls = cls.matchingEClass
		val cMethods = cls.methods.filter(ConcreteMethod)

		if (eCls !== null && eCls.hasRequiredAnnotation && !cMethods.empty)
			error(
				"Cannot insert concrete methods in @Required concepts.",
				cls,
				AlePackage.Literals::ALE_CLASS__NAME,
				NO_CONCRETE_IN_REQUIRED
			)
	}
}
