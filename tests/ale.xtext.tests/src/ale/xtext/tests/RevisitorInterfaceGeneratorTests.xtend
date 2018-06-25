package ale.xtext.tests

import ale.xtext.generator.RevisitorInterfaceGenerator
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.junit.Assert
import org.junit.Test

class RevisitorInterfaceGeneratorTests {
	val rig = new RevisitorInterfaceGenerator

	private def String generate(String ecore, String genmodel) {
		val rs = new ResourceSetImpl

		rs.resourceFactoryRegistry.extensionToFactoryMap.put("genmodel", new XMIResourceFactoryImpl)
		rs.packageRegistry.put(GenModelPackage.eNS_URI, GenModelPackage.eINSTANCE)

		rs.resourceFactoryRegistry.extensionToFactoryMap.put("ecore", new XMIResourceFactoryImpl)
		rs.packageRegistry.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE)

		val genmodelRes = rs.getResource(URI.createURI(genmodel), true).contents.
			head as GenModel
		val ecoreRes = rs.getResource(URI.createURI(ecore), true).contents.
			head as EPackage

		rig.generateInterface(ecoreRes, genmodelRes)
	}

	@Test
	def void testBoolExp() {
		val res = generate('../testdata/boolexp/model/BoolExp.ecore', '../testdata/boolexp/model/BoolExp.genmodel')

		Assert.assertEquals('''
			package boolexp.revisitor;
			
			public interface BoolexpRevisitor<Boolexp__AndT extends Boolexp__BinaryExpT, Boolexp__BinaryExpT extends Boolexp__ExpT, Boolexp__ExpT, Boolexp__FalsT extends Boolexp__LitT, Boolexp__LitT extends Boolexp__ExpT, Boolexp__OrT extends Boolexp__BinaryExpT, Boolexp__TruT extends Boolexp__LitT> {
				Boolexp__AndT boolexp__And(final boolexp.And it);
				Boolexp__FalsT boolexp__Fals(final boolexp.Fals it);
				Boolexp__OrT boolexp__Or(final boolexp.Or it);
				Boolexp__TruT boolexp__Tru(final boolexp.Tru it);
			
				default Boolexp__AndT $(final boolexp.And it) {
					return boolexp__And(it);
				}
				default Boolexp__BinaryExpT $(final boolexp.BinaryExp it) {
					if (it.getClass() == boolexp.impl.AndImpl.class)
						return boolexp__And((boolexp.And) it);
					if (it.getClass() == boolexp.impl.OrImpl.class)
						return boolexp__Or((boolexp.Or) it);
					return null;
				}
				default Boolexp__ExpT $(final boolexp.Exp it) {
					if (it.getClass() == boolexp.impl.AndImpl.class)
						return boolexp__And((boolexp.And) it);
					if (it.getClass() == boolexp.impl.FalsImpl.class)
						return boolexp__Fals((boolexp.Fals) it);
					if (it.getClass() == boolexp.impl.OrImpl.class)
						return boolexp__Or((boolexp.Or) it);
					if (it.getClass() == boolexp.impl.TruImpl.class)
						return boolexp__Tru((boolexp.Tru) it);
					return null;
				}
				default Boolexp__FalsT $(final boolexp.Fals it) {
					return boolexp__Fals(it);
				}
				default Boolexp__LitT $(final boolexp.Lit it) {
					if (it.getClass() == boolexp.impl.FalsImpl.class)
						return boolexp__Fals((boolexp.Fals) it);
					if (it.getClass() == boolexp.impl.TruImpl.class)
						return boolexp__Tru((boolexp.Tru) it);
					return null;
				}
				default Boolexp__OrT $(final boolexp.Or it) {
					return boolexp__Or(it);
				}
				default Boolexp__TruT $(final boolexp.Tru it) {
					return boolexp__Tru(it);
				}
			}
		'''.toString, res)
	}
	
	@Test
	def void testMulti() {
		val res = generate('../testdata/multi/model/multi.ecore', '../testdata/multi/model/multi.genmodel')

		Assert.assertEquals('''
			package multi.revisitor;
			
			public interface MultiRevisitor<Multi__AT, Multi__BT, Multi__CT, Multi__CT_AS_Multi__AT, Multi__CT_AS_Multi__BT> {
				Multi__AT multi__A(final multi.A it);
				Multi__BT multi__B(final multi.B it);
				Multi__CT multi__C(final multi.C it);
				Multi__CT_AS_Multi__AT multi__C__as__multi__A(final multi.C it);
				Multi__CT_AS_Multi__BT multi__C__as__multi__B(final multi.C it);
			
				default Multi__AT $(final multi.A it) {
					if (it.getClass() == multi.impl.CImpl.class)
						return multi__C__as__multi__A((multi.C) it);
					return multi__A(it);
				}
				default Multi__BT $(final multi.B it) {
					if (it.getClass() == multi.impl.CImpl.class)
						return multi__C__as__multi__B((multi.C) it);
					return multi__B(it);
				}
				default Multi__CT $(final multi.C it) {
					return multi__C(it);
				}
			}
		'''.toString, res)
	}
}
