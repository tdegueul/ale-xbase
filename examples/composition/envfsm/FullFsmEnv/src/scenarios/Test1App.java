package scenarios;

import java.util.stream.Collectors;

import basicFsmEnv.Action;
import basicFsmEnv.BasicFsmEnvFactory;
import basicFsmEnv.Guard;
import basicFsmEnv.Machine;
import basicFsmEnv.State;
import basicFsmEnv.Trans;
import basicFsmEnv.VarDecl;
import basicFsmEnv.runtime.Context;
import boolExpEnv.BoolExpEnvFactory;
import boolExpEnv.Exp;
import boolExpEnv.Or;
import boolExpEnv.VarRef;
import evalbasicfsm.revisitor.operations.evalbasicfsm.ActionOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.GuardOperation;
import fullfsmeval.ActionBindBlock;
import fullfsmeval.FullfsmevalFactory;
import fullfsmeval.GuardBindExp;
import fullfsmeval.revisitor.impl.FullfsmevalRevisitor;
import simpleALEnv.ALVarRef;
import simpleALEnv.ArithLit;
import simpleALEnv.ArithPlus;
import simpleALEnv.Assign;
import simpleALEnv.Block;
import simpleALEnv.Print;
import simpleALEnv.SimpleALEnvFactory;

public class Test1App {
	public static void main(final String[] args) {
		final Machine m = createModel();
		// Machine m = loadArithModel();
//		 PrintFullFsm printSem = new PrintFullFsm(){};
		final FullfsmevalRevisitor evalSem = new FullfsmevalRevisitor() {

//			@Override
//			public ActionOperation $(Action it) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//
//			@Override
//			public GuardOperation $(Guard it) {
//				// TODO Auto-generated method stub
//				return null;
//			}
		};

		// System.out.println("Print:");
		// System.out.println(printSem.$(m).print());

		System.out.println("Eval:");
		final Context ctx = new Context();
		ctx.bind("x", true);
		ctx.bind("y", true);
		ctx.bind("i", 0);
		ctx.bind("j", 0);
		final String[] events = { "a", "b", "a", "b", "a", "b", "a", "b", "a", "c", "b", "a", "b" };
		evalSem.$(m).exec(events, ctx);
		System.out
				.println("Trace: " + ctx.getTrace().stream().map(s -> s.getName()).collect(Collectors.joining(" -> ")));
	}

	// public static Machine loadArithModel() {
	// Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
	// "fullfsm", new XMIResourceFactoryImpl());
	// EPackage.Registry.INSTANCE.put(
	// Fullfsmevalpackage.eNS_URI, FullfsmPackage.eINSTANCE);
	// ResourceSet rs = new ResourceSetImpl();
	// Resource res = rs.getResource(URI.createURI("../Models/Arith.fullfsm"),
	// true);
	// return (Machine) res.getContents().get(0);
	// }

	public static Machine createModel() {
		final FullfsmevalFactory ffsmFact = FullfsmevalFactory.eINSTANCE;
		final BasicFsmEnvFactory bfsmFact = BasicFsmEnvFactory.eINSTANCE;
		final BoolExpEnvFactory expFact = BoolExpEnvFactory.eINSTANCE;
		final SimpleALEnvFactory alFact = SimpleALEnvFactory.eINSTANCE;

		final Machine m = bfsmFact.createMachine();
		m.setName("Dummy");

		final State s1 = bfsmFact.createInitialState();
		s1.setName("s1");
		final State s2 = bfsmFact.createState();
		s2.setName("s2");

		final VarDecl v = bfsmFact.createVarDecl();
		v.setName("j");
		v.setValue(1);

		s1.getDecls().add(v);

		final Trans t1 = bfsmFact.createTrans();
		t1.setEvent("a");
		final Trans t2 = bfsmFact.createTrans();
		t2.setEvent("b");
		final Trans t3 = bfsmFact.createTrans();
		t3.setEvent("c");

		t1.setSrc(s1);
		t1.setTgt(s2);
		t2.setSrc(s2);
		t2.setTgt(s1);
		t3.setSrc(s2);
		t3.setTgt(s2);

		final Or e1 = expFact.createOr();
		final VarRef r1 = expFact.createVarRef();
		r1.setName("x");
		e1.setLhs(r1);
		e1.setRhs(expFact.createTru());

		final Or e2 = expFact.createOr();
		final VarRef r2 = expFact.createVarRef();
		r2.setName("y");
		e2.setLhs(r2);
		e2.setRhs(expFact.createFals());

		final Exp e3 = expFact.createTru();

		final GuardBindExp bg1 = ffsmFact.createGuardBindExp();
		bg1.setDelegate(e1);
		final GuardBindExp bg2 = ffsmFact.createGuardBindExp();
		bg2.setDelegate(e2);
		final GuardBindExp bg3 = ffsmFact.createGuardBindExp();
		bg3.setDelegate(e3);

		final Block b1 = alFact.createBlock();
		final Print p1 = alFact.createPrint();
		p1.setName("i");
		b1.getStmts().add(p1);

		final Block b2 = alFact.createBlock();
		final Print p2 = alFact.createPrint();
		p2.setName("j");
		b2.getStmts().add(p2);

		final Block b3 = alFact.createBlock();
		final Assign bi = alFact.createAssign();
		final ALVarRef vr = alFact.createALVarRef();
		vr.setName("i");
		final ArithPlus ap = alFact.createArithPlus();
		final ArithLit al = alFact.createArithLit();
		al.setVal(1);
		ap.setLhs(vr);
		ap.setRhs(al);
		bi.setName("i");
		bi.setVal(ap);
		b3.getStmts().add(bi);

		// composition details leaks at the model definition level...
		final ActionBindBlock ba1 = ffsmFact.createActionBindBlock();
		ba1.setDelegate(b1);
		final ActionBindBlock ba2 = ffsmFact.createActionBindBlock();
		ba2.setDelegate(b2);
		final ActionBindBlock ba3 = ffsmFact.createActionBindBlock();
		ba3.setDelegate(b3);

		t1.setGuard(bg1);
		t1.setAction(ba1);
		t2.setGuard(bg2);
		t2.setAction(ba2);
		t3.setGuard(bg3);
		t3.setAction(ba3);

		m.getStates().add(s1);
		m.getStates().add(s2);
		m.getTrans().add(t1);
		m.getTrans().add(t2);
		m.getTrans().add(t3);

		return m;
	}
}
