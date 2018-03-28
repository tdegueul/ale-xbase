package ale.xtext.tests

import boolexp.BoolexpFactory
import com.google.inject.Inject
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage
import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(AleInjectorProvider)
class BoolExpTests {
	@Inject extension AleTestHelper
	val fact = BoolexpFactory::eINSTANCE

	@Before
	def void setUp() {
		EPackage.Registry.INSTANCE.put(GenModelPackage::eNS_URI, GenModelPackage::eINSTANCE)
	}

	@Test
	def void testPrintRevisitor() {
		'''
			behavior test
			import ecore "../testdata/boolexp/model/BoolExp.ecore"
			open class Exp {
				abstract def String print()
			}
			open class Tru {
				def String print() {
					return "T"
				}
			}
			open class Fals {
				def String print() {
					return "F"
				}
			}
			open class And {
				def String print() {
					return alg.$(self.lhs).print() + " && " + alg.$(self.rhs).print()
				}
			}
			open class Or {
				def String print() {
					return alg.$(self.lhs).print() + " || " + alg.$(self.rhs).print()
				}
			}
		'''
			.with(
				fact.createOr => [
					lhs = fact.createAnd => [
						lhs = fact.createTru
						rhs = fact.createFals
					]
					rhs = fact.createTru
				]
			)
			.call("print")
			.assertEvaluatesTo("T && F || T")
	}

	@Test
	def void testEvalRevisitor() {
		'''
			behavior test
			import ecore "../testdata/boolexp/model/BoolExp.ecore"
			open class Exp {
				abstract def boolean eval()
			}
			open class Tru {
				def boolean eval() {
					return true
				}
			}
			open class Fals {
				def boolean eval() {
					return false
				}
			}
			open class And {
				def boolean eval() {
					return alg.$(self.lhs).eval() && alg.$(self.rhs).eval()
				}
			}
			open class Or {
				def boolean eval() {
					return alg.$(self.lhs).eval() || alg.$(self.rhs).eval()
				}
			}
		'''
			.with(
				fact.createOr => [
					lhs = fact.createAnd => [
						lhs = fact.createTru
						rhs = fact.createFals
					]
					rhs = fact.createTru
				]
			)
			.call("eval")
			.assertEvaluatesTo(true)
	}
}
