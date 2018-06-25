import java.lang.reflect.Proxy;
import java.util.Arrays;

import org.eclipse.emf.ecore.InternalEObject;

import composeabprint.BBindB1;
import composeabprint.ComposeabprintFactory;
import composeabprint.revisitor.impl.ComposeabprintRevisitor;
import composeabprint2.revisitor.impl.Composeabprint2Revisitor;
import simplea.A;
import simplea.B;
import simplea.SimpleaFactory;
import simpleb.B1;
import simpleb.SimplebFactory;

public class TestComposeAB {
	public static void main(final String[] args) {
		case1();
		case2();
	}

	private static void case2() {
		// final ComposeabprintRevisitorWithProxyRevisitor revp = new
		// ComposeabprintRevisitorWithProxyRevisitor() {
		//
		// };

		final Composeabprint2Revisitor rev = new Composeabprint2Revisitor() {
		};

		final A createA2 = SimpleaFactory.eINSTANCE.createA();
		final B1 createB1 = SimplebFactory.eINSTANCE.createB1();
		createA2.getBs().add((B) Proxy.newProxyInstance(TestComposeAB.class.getClassLoader(),
				new Class[] { B.class, InternalEObject.class }, (proxy, method, args) -> {
					System.out.println("Proxy call " + method.getName() + "(" + Arrays.toString(args) + "):"
							+ method.getReturnType());
					if (method.getName().equals("$$$$")) {
						return createB1;
					}
					return null;
				}));
		System.out.println("with proxy");
		rev.$(createA2).main();
	}

	private static void case1() {
		final ComposeabprintRevisitor rev = new ComposeabprintRevisitor() {

		};
		final A createA = SimpleaFactory.eINSTANCE.createA();
		final BBindB1 createBBind = ComposeabprintFactory.eINSTANCE.createBBindB1();
		final B1 createB1 = SimplebFactory.eINSTANCE.createB1();
		createB1.setName("B1");
		createBBind.setDelegate(createB1);
		createA.getBs().add(createBBind);
		createA.setName("A1");
		rev.$(createA).main();
	}
}
