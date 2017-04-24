package ale.compiler.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.junit.Assert;
import org.junit.Test;

import ale.compiler.generator.util.DollarGeneratorUtil;

public class DollarGeneratorTest {

	private final DollarGeneratorUtil dollargenerator = new DollarGeneratorUtil();

	@Test
	public void testEmptyList() {
		final List<EClass> lst = new ArrayList<>();
		dollargenerator.sortForDollars(lst);
		Assert.assertTrue(lst.isEmpty());
	}

	@Test
	public void testSingleElemList() {
		final List<EClass> lst = new ArrayList<>();
		lst.add(createEClass("A"));
		dollargenerator.sortForDollars(lst);
		Assert.assertTrue(lst.get(0).getName().equals("A"));
	}

	@Test
	public void testSingleSimpleHierarchy() {
		final EClass clazzA = createEClass("A");
		final EClass clazzB = createEClass("B");
		clazzB.getESuperTypes().add(clazzA);

		final List<EClass> lst = new ArrayList<>();
		lst.add(clazzA);
		lst.add(clazzB);
		Collections.shuffle(lst);

		dollargenerator.sortForDollars(lst);
		Assert.assertTrue(lst.get(0).getName().equals("B"));
		Assert.assertTrue(lst.get(1).getName().equals("A"));
	}

	@Test
	public void test3LevelsHierarchy() {
		final EClass clazzA = createEClass("A");
		final EClass clazzB = createEClass("B");
		clazzB.getESuperTypes().add(clazzA);
		final EClass clazzC = createEClass("C");
		clazzC.getESuperTypes().add(clazzB);

		final List<EClass> lst = new ArrayList<>();
		lst.add(clazzA);
		lst.add(clazzB);
		lst.add(clazzC);
		Collections.shuffle(lst);

		dollargenerator.sortForDollars(lst);
		Assert.assertTrue(lst.get(0).getName().equals("C"));
		Assert.assertTrue(lst.get(1).getName().equals("B"));
		Assert.assertTrue(lst.get(2).getName().equals("A"));
	}

	@Test
	public void testSimpleDiamond() {
		final EClass clazzA = createEClass("A");
		final EClass clazzB = createEClass("B");
		final EClass clazzC = createEClass("C");
		final EClass clazzD = createEClass("D");
		clazzB.getESuperTypes().add(clazzA);
		clazzC.getESuperTypes().add(clazzA);
		clazzD.getESuperTypes().add(clazzB);
		clazzD.getESuperTypes().add(clazzC);

		final List<EClass> lst = new ArrayList<>();
		lst.add(clazzA);
		lst.add(clazzB);
		lst.add(clazzC);
		lst.add(clazzD);
		Collections.shuffle(lst);

		dollargenerator.sortForDollars(lst);
		Assert.assertTrue(lst.get(0).getName().equals("D"));
		Assert.assertTrue(lst.get(1).getName().equals("B") && lst.get(2).getName().equals("C")
				|| lst.get(1).getName().equals("C") && lst.get(2).getName().equals("B"));
		Assert.assertTrue(lst.get(3).getName().equals("A"));
	}

	@Test
	public void testUnbalancedDiamond() {
		final EClass clazzA = createEClass("A");
		final EClass clazzB = createEClass("B");
		final EClass clazzC = createEClass("C");
		final EClass clazzD = createEClass("D");
		final EClass clazzE = createEClass("E");
		clazzB.getESuperTypes().add(clazzA);
		clazzC.getESuperTypes().add(clazzA);
		clazzD.getESuperTypes().add(clazzB);
		clazzE.getESuperTypes().add(clazzC);
		clazzE.getESuperTypes().add(clazzD);

		final List<EClass> lst = new ArrayList<>();
		lst.add(clazzA);
		lst.add(clazzB);
		lst.add(clazzC);
		lst.add(clazzD);
		lst.add(clazzE);
		Collections.shuffle(lst);

		dollargenerator.sortForDollars(lst);
		Assert.assertTrue(lst.get(0).getName().equals("E"));
		Assert.assertTrue(lst.indexOf(clazzB) > lst.indexOf(clazzD));
		Assert.assertTrue(lst.get(4).getName().equals("A"));
	}

	private EClass createEClass(final String value) {
		final EClass createEClass = EcoreFactory.eINSTANCE.createEClass();
		createEClass.setName(value);
		return createEClass;
	}
}
