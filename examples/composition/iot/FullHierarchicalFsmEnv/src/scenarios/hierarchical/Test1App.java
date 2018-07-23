package scenarios.hierarchical;

import java.util.stream.Collectors;

import basicFsmEnv.BasicFsmEnvFactory;
import basicFsmEnv.Machine;
import basicFsmEnv.State;
import basicFsmEnv.Trans;
import basicFsmEnv.VarDecl;
import basicFsmEnv.runtime.Context;
import boolExpEnv.BoolExpEnvFactory;
import boolExpEnv.Exp;
import boolExpEnv.Or;
import boolExpEnv.VarRef;
import fullhierarchicalfsmeval.ActionBindBlock;
import fullhierarchicalfsmeval.FullhierarchicalfsmevalFactory;
import fullhierarchicalfsmeval.GuardBindExp;
import fullhierarchicalfsmeval.revisitor.impl.FullhierarchicalfsmevalRevisitor;
import hierarchicalFsmEnv.CompositeState;
import hierarchicalFsmEnv.HierarchicalFsmEnvFactory;
import hierarchicalFsmEnv.Region;
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
		final FullhierarchicalfsmevalRevisitor evalSem = new FullhierarchicalfsmevalRevisitor() {
		};

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

	public static Machine createModel() {
		final FullhierarchicalfsmevalFactory ffsmFact = FullhierarchicalfsmevalFactory.eINSTANCE;
		final HierarchicalFsmEnvFactory hfeFact = HierarchicalFsmEnvFactory.eINSTANCE;
		final BasicFsmEnvFactory bfsmFact = BasicFsmEnvFactory.eINSTANCE;
		final BoolExpEnvFactory expFact = BoolExpEnvFactory.eINSTANCE;
		final SimpleALEnvFactory alFact = SimpleALEnvFactory.eINSTANCE;

		final Machine m = bfsmFact.createMachine();
		m.setName("Dummy");

		final State s1 = bfsmFact.createInitialState();
		s1.setName("s1");
		final CompositeState sc = hfeFact.createCompositeState();
		final Region csr1 = hfeFact.createRegion();
		final State css0 = bfsmFact.createInitialState();
		css0.setName("css0");
		csr1.getStates().add(css0);
		final State css1 = bfsmFact.createState();
		css1.setName("css1");
		csr1.getStates().add(css1);
		sc.getRegions().add(csr1);
		final State s2 = css0;
		s2.setName("s2");

		final VarDecl v = bfsmFact.createVarDecl();
		v.setName("j");
		v.setValue(1);

		s1.getDecls().add(v);

		final Trans t1 = bfsmFact.createTrans();
		t1.setEvent("a");
		t1.setSrc(s1);
		t1.setTgt(sc);

		final Trans t2 = bfsmFact.createTrans();
		t2.setEvent("b");
		t2.setSrc(css0);
		t2.setTgt(css0);

		final Trans t3 = bfsmFact.createTrans();
		t3.setEvent("a");
		t3.setSrc(css0);
		t3.setTgt(css1);
		
		final Trans t4 = bfsmFact.createTrans();
		t4.setEvent("b");
		t4.setSrc(css1);
		t4.setTgt(s2);

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
//		t2.setGuard(bg2);
//		t2.setAction(ba2);
//		t3.setGuard(bg3);
//		t3.setAction(ba3);

		m.getStates().add(s1);
		m.getStates().add(s2);
		m.getStates().add(sc);
		m.getTrans().add(t1);
		m.getTrans().add(t2);
		m.getTrans().add(t3);
		m.getTrans().add(t4);

		return m;
	}
}
