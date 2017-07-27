package ale.xtext.tests

import ale.xtext.ale.AlePackage
import ale.xtext.ale.AleRoot
import ale.xtext.validation.AleValidator
import com.google.inject.Inject
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage
import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.eclipse.xtext.util.JavaVersion
import org.eclipse.xtext.xbase.testing.CompilationTestHelper
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(AleInjectorProvider)
class AleEditorTests {
	@Inject extension ParseHelper<AleRoot>
	@Inject extension CompilationTestHelper compilationHelper
	@Inject extension ValidationTestHelper

	private static final String header =
		'''
			behavior test
			import ecore "../testdata/boolexp/model/BoolExp.ecore"
		'''
	
	@Before
	def void setUp() {
		EPackage.Registry.INSTANCE.put(GenModelPackage.eNS_URI, GenModelPackage.eINSTANCE)
		compilationHelper.javaVersion = JavaVersion::JAVA8
	}

	@Test
	def void testInvalidEcore() {
		'''
			behavior test
			import ecore "data/metamodels/404.ecore"
		'''.parse.ecoreImport.assertError(
			AlePackage.Literals::ECORE_IMPORT,
			AleValidator::SYNTAX_NOT_FOUND
		)
	}

	@Test
	def void testOpenExistingClass() {
		'''
			«header»
			open class Exp {}
			open class BinaryExp {}
			open class Lit {}
			open class And {}
			open class Or {}
			open class Tru {}
			open class Fals {}
		'''.parse.assertNoIssues
	}

	@Test
	def void testOpenUnknownClass() {
		'''
			«header»
			open class A {}
		'''.parse.assertError(
			AlePackage.Literals::ALE_CLASS,
			AleValidator::UNKNOWN_OPENCLASS
		)
	}

	@Test
	def void testAbstractMethodsAreImplemented() {
		'''
			«header»
			open class Exp {
				abstract def void foo()
			}
			open class Lit {
				def void foo() {}
			}
		'''.parse.assertError(
			AlePackage.Literals::ALE_CLASS,
			AleValidator::ABSTRACT_METHOD_NOT_IMPL
		)
	}

	@Test
	def void testOverrideIsHere() {
		'''
			«header»
			open class Exp {
				abstract def void foo()
			}
			open class And { def void foo() {} }
			open class Or { override void foo() {} }
			open class Tru { override void foo() {} }
			open class Fals { override void foo() {} }
		'''.parse.assertError(
			AlePackage.Literals::ALE_METHOD,
			AleValidator::OVERRIDE_MISSING
		)
	}

	@Test
	def void testOverrideIsHere2() {
		'''
			«header»
			open class Exp {
				def void foo() {}
			}
			open class And { def void foo() {} }
		'''.parse.assertError(
			AlePackage.Literals::ALE_METHOD,
			AleValidator::OVERRIDE_MISSING
		)
	}

	@Test
	def void testNoSuperfluousOverride() {
		'''
			«header»
			open class Exp {
				abstract def void foo()
			}
			open class And { override void foo() {} }
			open class Or { override void foo() {} }
			open class Tru { override void foo() {} }
			open class Fals {
				override void foo() {}
				override void bar() {}
			}
		'''.parse.assertError(
			AlePackage.Literals::ALE_METHOD,
			AleValidator::SUPERFLUOUS_OVERRIDE
		)
	}
}
