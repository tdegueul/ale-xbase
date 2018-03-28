package ale.xtext.tests

import com.google.inject.Inject
import ^dispatch.DispatchFactory
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage
import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(AleInjectorProvider)
class DispatchTests {
	@Inject extension AleTestHelper
	val fact = DispatchFactory::eINSTANCE

	@Before
	def void setUp() {
		EPackage.Registry.INSTANCE.put(GenModelPackage::eNS_URI, GenModelPackage::eINSTANCE)
	}

	@Test
	def void testNoOverride() {
		'''
			behavior test
			import ecore "../testdata/dispatch/model/Dispatch.ecore"
			open class A {
				def String foo() { return "A::foo()" }
			}
			open class Container {
				def List<String> collect() {
					return self.objs
						.map[alg.$(it).foo()]
				}
			}
		'''
			.with(fact.createContainer => [
				objs += fact.createA
				objs += fact.createB
				objs += fact.createC
				objs += fact.createD
				objs += fact.createE
				objs += fact.createF
				objs += fact.createG
			])
			.call("collect")
			.assertEvaluatesTo(#[
				"A::foo()",
				"A::foo()",
				"A::foo()",
				"A::foo()",
				"A::foo()",
				"A::foo()",
				"A::foo()"
			])
	}

	@Test
	def void testAllOverride() {
		'''
			behavior test
			import ecore "../testdata/dispatch/model/Dispatch.ecore"
			open class A { def String foo() { return "A::foo()" } }
			open class B { override String foo() { return "B::foo()" } }
			open class C { override String foo() { return "C::foo()" } }
			open class D { override String foo() { return "D::foo()" } }
			open class E { override String foo() { return "E::foo()" } }
			open class F { override String foo() { return "F::foo()" } }
			open class G { override String foo() { return "G::foo()" } }
			open class Container {
				def List<String> collect() {
					return self.objs
						.map[alg.$(it).foo()]
				}
			}
		'''
			.with(fact.createContainer => [
				objs += fact.createA
				objs += fact.createB
				objs += fact.createC
				objs += fact.createD
				objs += fact.createE
				objs += fact.createF
				objs += fact.createG
			])
			.call("collect")
			.assertEvaluatesTo(#[
				"A::foo()",
				"B::foo()",
				"C::foo()",
				"D::foo()",
				"E::foo()",
				"F::foo()",
				"G::foo()"
			])
	}

	@Test
	def void testImplicitSuperCall1() {
		'''
			behavior test
			import ecore "../testdata/dispatch/model/Dispatch.ecore"
			open class A {
				def String foo() { return "A::foo()" }
			}
			open class B {
				override String foo() { return "B::foo()" }
			}
			open class D {
				override String foo() {
					return super.foo();
				}
			}
		'''
			.with(fact.createD)
			.call("foo")
			.assertEvaluatesTo("B::foo()")
	}

	@Test
	def void testImplicitSuperCall2() {
		'''
			behavior test
			import ecore "../testdata/dispatch/model/Dispatch.ecore"
			open class A {
				def String foo() { return "A::foo()" }
			}
			open class D {
				override String foo() {
					return super.foo();
				}
			}
		'''
			.with(fact.createD)
			.call("foo")
			.assertEvaluatesTo("A::foo()")
	}

	@Test
	def void testExplicitSuperCall() {
		'''
			behavior test
			import ecore "../testdata/dispatch/model/Dispatch.ecore"
			open class A {
				def String foo() { return "A::foo()" }
			}
			open class B {
				override String foo() { return "B::foo()" }
			}
			open class D {
				override String foo() {
					return alg.a(self).foo() + " -- " + alg.b(self).foo()
				}
			}
		'''
			.with(fact.createD)
			.call("foo")
			.assertEvaluatesTo("A::foo() -- B::foo()")
	}
}
