import composeabprint.BBindB1;
import composeabprint.ComposeabprintFactory;
import composeabprint.revisitor.impl.ComposeabprintRevisitor;
import simplea.A;
import simplea.SimpleaFactory;
import simpleb.B1;
import simpleb.SimplebFactory;

public class TestComposeAB {
	public static void main(final String[] args) {
		final ComposeabprintRevisitor rev = new ComposeabprintRevisitor() {

		};

		final A createA = SimpleaFactory.eINSTANCE.createA();
		final BBindB1 createBBind = ComposeabprintFactory.eINSTANCE.createBBindB1();
		B1 createB1 = SimplebFactory.eINSTANCE.createB1();
		createB1.setName("B1");
		createBBind.setDelegate(createB1);
		createA.getBs().add(createBBind);
		rev.$(createA).main();
	}
}
