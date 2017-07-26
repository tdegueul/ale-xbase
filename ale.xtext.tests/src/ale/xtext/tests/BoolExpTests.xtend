package ale.xtext.tests

import boolexp.BoolexpPackage
import boolexp.Exp
import com.google.inject.Inject
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.util.JavaVersion
import org.eclipse.xtext.xbase.testing.CompilationTestHelper
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(AleInjectorProvider)
class BoolExpTests {
	@Inject extension CompilationTestHelper compilationHelper
	@Inject extension AleTestHelper

	@Before
	def void setUp() {
		EPackage.Registry.INSTANCE.put(GenModelPackage::eNS_URI, GenModelPackage::eINSTANCE)
		compilationHelper.javaVersion = JavaVersion::JAVA8
	}

	@Test
	def void testPrintRevisitor() {
		'''
			behavior test
			import ecore "data/metamodels/BoolExp.ecore"
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
					return alg.$(obj.lhs).print() + " && " + alg.$(obj.rhs).print()
				}
			}
			open class Or {
				def String print() {
					return alg.$(obj.lhs).print() + " || " + alg.$(obj.rhs).print()
				}
			}
		'''.compile[res |
			val testModel = loadModel("data/models/Simple.boolexp") 
			assertEquals("T && F || T", res.invokeRevisitorMethod(testModel, "test.revisitor.TestRevisitor", "print"))
		]
	}

	@Test
	def void testEvalRevisitor() {
		'''
			behavior test
			import ecore "data/metamodels/BoolExp.ecore"
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
					return alg.$(obj.lhs).eval() && alg.$(obj.rhs).eval()
				}
			}
			open class Or {
				def boolean eval() {
					return alg.$(obj.lhs).eval() || alg.$(obj.rhs).eval()
				}
			}
		'''.compile[res |
			val testModel = loadModel("data/models/Simple.boolexp") 
			assertEquals(true, res.invokeRevisitorMethod(testModel, "test.revisitor.TestRevisitor", "eval"))
		]
	}

	private def Exp loadModel(String filename) {
		EPackage.Registry.INSTANCE.put(BoolexpPackage::eNS_URI, BoolexpPackage::eINSTANCE)
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("boolexp", new XMIResourceFactoryImpl)
		val rs = new ResourceSetImpl
		val res = rs.getResource(URI::createURI(filename), true)
		return res.contents.head as Exp
	}
}