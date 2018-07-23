package fullhierarchicalfsmeval.revisitor;

public interface FullhierarchicalfsmevalRevisitor<SimpleALEnv__ALVarRefT extends SimpleALEnv__ArithT, BasicFsmEnv__ActionT, Fullhierarchicalfsmeval__ActionBindBlockT extends BasicFsmEnv__ActionT, BoolExpEnv__AndT extends BoolExpEnv__BinExpT, SimpleALEnv__ArithT, SimpleALEnv__ArithLitT extends SimpleALEnv__ArithT, SimpleALEnv__ArithMinusT extends SimpleALEnv__ArithOpT, SimpleALEnv__ArithOpT extends SimpleALEnv__ArithT, SimpleALEnv__ArithPlusT extends SimpleALEnv__ArithOpT, SimpleALEnv__AssignT extends SimpleALEnv__StmtT, BoolExpEnv__BinExpT extends BoolExpEnv__ExpT, SimpleALEnv__BlockT, HierarchicalFsmEnv__CompositeStateT extends BasicFsmEnv__StateT, BoolExpEnv__ExpT, BoolExpEnv__FalsT extends BoolExpEnv__LitT, BasicFsmEnv__GuardT, Fullhierarchicalfsmeval__GuardBindExpT extends BasicFsmEnv__GuardT, BasicFsmEnv__InitialStateT extends BasicFsmEnv__StateT, BoolExpEnv__LitT extends BoolExpEnv__ExpT, BasicFsmEnv__MachineT, BoolExpEnv__NotT extends BoolExpEnv__ExpT, BoolExpEnv__OrT extends BoolExpEnv__BinExpT, SimpleALEnv__PrintT extends SimpleALEnv__StmtT, HierarchicalFsmEnv__RegionT, BasicFsmEnv__StateT, SimpleALEnv__StmtT, BasicFsmEnv__TransT, BoolExpEnv__TruT extends BoolExpEnv__LitT, BasicFsmEnv__VarDeclT, BoolExpEnv__VarRefT extends BoolExpEnv__ExpT>
	extends boolExpEnv.revisitor.BoolExpEnvRevisitor<BoolExpEnv__AndT, BoolExpEnv__BinExpT, BoolExpEnv__ExpT, BoolExpEnv__FalsT, BoolExpEnv__LitT, BoolExpEnv__NotT, BoolExpEnv__OrT, BoolExpEnv__TruT, BoolExpEnv__VarRefT>,
		simpleALEnv.revisitor.SimpleALEnvRevisitor<SimpleALEnv__ALVarRefT, SimpleALEnv__ArithT, SimpleALEnv__ArithLitT, SimpleALEnv__ArithMinusT, SimpleALEnv__ArithOpT, SimpleALEnv__ArithPlusT, SimpleALEnv__AssignT, SimpleALEnv__BlockT, SimpleALEnv__PrintT, SimpleALEnv__StmtT>,
		basicFsmEnv.revisitor.BasicFsmEnvRevisitor<BasicFsmEnv__ActionT, BasicFsmEnv__GuardT, BasicFsmEnv__InitialStateT, BasicFsmEnv__MachineT, BasicFsmEnv__StateT, BasicFsmEnv__TransT, BasicFsmEnv__VarDeclT>,
		hierarchicalFsmEnv.revisitor.HierarchicalFsmEnvRevisitor<BasicFsmEnv__ActionT, HierarchicalFsmEnv__CompositeStateT, BasicFsmEnv__GuardT, BasicFsmEnv__InitialStateT, BasicFsmEnv__MachineT, HierarchicalFsmEnv__RegionT, BasicFsmEnv__StateT, BasicFsmEnv__TransT, BasicFsmEnv__VarDeclT> {
	SimpleALEnv__ALVarRefT simpleALEnv__ALVarRef(final simpleALEnv.ALVarRef it);
	Fullhierarchicalfsmeval__ActionBindBlockT fullhierarchicalfsmeval__ActionBindBlock(final fullhierarchicalfsmeval.ActionBindBlock it);
	BoolExpEnv__AndT boolExpEnv__And(final boolExpEnv.And it);
	SimpleALEnv__ArithLitT simpleALEnv__ArithLit(final simpleALEnv.ArithLit it);
	SimpleALEnv__ArithMinusT simpleALEnv__ArithMinus(final simpleALEnv.ArithMinus it);
	SimpleALEnv__ArithPlusT simpleALEnv__ArithPlus(final simpleALEnv.ArithPlus it);
	SimpleALEnv__AssignT simpleALEnv__Assign(final simpleALEnv.Assign it);
	SimpleALEnv__BlockT simpleALEnv__Block(final simpleALEnv.Block it);
	HierarchicalFsmEnv__CompositeStateT hierarchicalFsmEnv__CompositeState(final hierarchicalFsmEnv.CompositeState it);
	BoolExpEnv__FalsT boolExpEnv__Fals(final boolExpEnv.Fals it);
	Fullhierarchicalfsmeval__GuardBindExpT fullhierarchicalfsmeval__GuardBindExp(final fullhierarchicalfsmeval.GuardBindExp it);
	BoolExpEnv__NotT boolExpEnv__Not(final boolExpEnv.Not it);
	BoolExpEnv__OrT boolExpEnv__Or(final boolExpEnv.Or it);
	SimpleALEnv__PrintT simpleALEnv__Print(final simpleALEnv.Print it);
	HierarchicalFsmEnv__RegionT hierarchicalFsmEnv__Region(final hierarchicalFsmEnv.Region it);
	BoolExpEnv__TruT boolExpEnv__Tru(final boolExpEnv.Tru it);
	BoolExpEnv__VarRefT boolExpEnv__VarRef(final boolExpEnv.VarRef it);

	default SimpleALEnv__ALVarRefT $(final simpleALEnv.ALVarRef it) {
		return simpleALEnv__ALVarRef(it);
	}
	default BasicFsmEnv__ActionT $(final basicFsmEnv.Action it) {
		if (it.getClass() == fullhierarchicalfsmeval.impl.ActionBindBlockImpl.class)
			return fullhierarchicalfsmeval__ActionBindBlock((fullhierarchicalfsmeval.ActionBindBlock) it);
		return null;
	}
	default Fullhierarchicalfsmeval__ActionBindBlockT $(final fullhierarchicalfsmeval.ActionBindBlock it) {
		return fullhierarchicalfsmeval__ActionBindBlock(it);
	}
	default BoolExpEnv__AndT $(final boolExpEnv.And it) {
		return boolExpEnv__And(it);
	}
	default SimpleALEnv__ArithT $(final simpleALEnv.Arith it) {
		if (it.getClass() == simpleALEnv.impl.ALVarRefImpl.class)
			return simpleALEnv__ALVarRef((simpleALEnv.ALVarRef) it);
		if (it.getClass() == simpleALEnv.impl.ArithLitImpl.class)
			return simpleALEnv__ArithLit((simpleALEnv.ArithLit) it);
		if (it.getClass() == simpleALEnv.impl.ArithMinusImpl.class)
			return simpleALEnv__ArithMinus((simpleALEnv.ArithMinus) it);
		if (it.getClass() == simpleALEnv.impl.ArithPlusImpl.class)
			return simpleALEnv__ArithPlus((simpleALEnv.ArithPlus) it);
		return null;
	}
	default SimpleALEnv__ArithLitT $(final simpleALEnv.ArithLit it) {
		return simpleALEnv__ArithLit(it);
	}
	default SimpleALEnv__ArithMinusT $(final simpleALEnv.ArithMinus it) {
		return simpleALEnv__ArithMinus(it);
	}
	default SimpleALEnv__ArithOpT $(final simpleALEnv.ArithOp it) {
		if (it.getClass() == simpleALEnv.impl.ArithMinusImpl.class)
			return simpleALEnv__ArithMinus((simpleALEnv.ArithMinus) it);
		if (it.getClass() == simpleALEnv.impl.ArithPlusImpl.class)
			return simpleALEnv__ArithPlus((simpleALEnv.ArithPlus) it);
		return null;
	}
	default SimpleALEnv__ArithPlusT $(final simpleALEnv.ArithPlus it) {
		return simpleALEnv__ArithPlus(it);
	}
	default SimpleALEnv__AssignT $(final simpleALEnv.Assign it) {
		return simpleALEnv__Assign(it);
	}
	default BoolExpEnv__BinExpT $(final boolExpEnv.BinExp it) {
		if (it.getClass() == boolExpEnv.impl.AndImpl.class)
			return boolExpEnv__And((boolExpEnv.And) it);
		if (it.getClass() == boolExpEnv.impl.OrImpl.class)
			return boolExpEnv__Or((boolExpEnv.Or) it);
		return null;
	}
	default SimpleALEnv__BlockT $(final simpleALEnv.Block it) {
		return simpleALEnv__Block(it);
	}
	default HierarchicalFsmEnv__CompositeStateT $(final hierarchicalFsmEnv.CompositeState it) {
		return hierarchicalFsmEnv__CompositeState(it);
	}
	default BoolExpEnv__ExpT $(final boolExpEnv.Exp it) {
		if (it.getClass() == boolExpEnv.impl.AndImpl.class)
			return boolExpEnv__And((boolExpEnv.And) it);
		if (it.getClass() == boolExpEnv.impl.FalsImpl.class)
			return boolExpEnv__Fals((boolExpEnv.Fals) it);
		if (it.getClass() == boolExpEnv.impl.NotImpl.class)
			return boolExpEnv__Not((boolExpEnv.Not) it);
		if (it.getClass() == boolExpEnv.impl.OrImpl.class)
			return boolExpEnv__Or((boolExpEnv.Or) it);
		if (it.getClass() == boolExpEnv.impl.TruImpl.class)
			return boolExpEnv__Tru((boolExpEnv.Tru) it);
		if (it.getClass() == boolExpEnv.impl.VarRefImpl.class)
			return boolExpEnv__VarRef((boolExpEnv.VarRef) it);
		return null;
	}
	default BoolExpEnv__FalsT $(final boolExpEnv.Fals it) {
		return boolExpEnv__Fals(it);
	}
	default BasicFsmEnv__GuardT $(final basicFsmEnv.Guard it) {
		if (it.getClass() == fullhierarchicalfsmeval.impl.GuardBindExpImpl.class)
			return fullhierarchicalfsmeval__GuardBindExp((fullhierarchicalfsmeval.GuardBindExp) it);
		return null;
	}
	default Fullhierarchicalfsmeval__GuardBindExpT $(final fullhierarchicalfsmeval.GuardBindExp it) {
		return fullhierarchicalfsmeval__GuardBindExp(it);
	}
	default BasicFsmEnv__InitialStateT $(final basicFsmEnv.InitialState it) {
		return basicFsmEnv__InitialState(it);
	}
	default BoolExpEnv__LitT $(final boolExpEnv.Lit it) {
		if (it.getClass() == boolExpEnv.impl.FalsImpl.class)
			return boolExpEnv__Fals((boolExpEnv.Fals) it);
		if (it.getClass() == boolExpEnv.impl.TruImpl.class)
			return boolExpEnv__Tru((boolExpEnv.Tru) it);
		return null;
	}
	default BasicFsmEnv__MachineT $(final basicFsmEnv.Machine it) {
		return basicFsmEnv__Machine(it);
	}
	default BoolExpEnv__NotT $(final boolExpEnv.Not it) {
		return boolExpEnv__Not(it);
	}
	default BoolExpEnv__OrT $(final boolExpEnv.Or it) {
		return boolExpEnv__Or(it);
	}
	default SimpleALEnv__PrintT $(final simpleALEnv.Print it) {
		return simpleALEnv__Print(it);
	}
	default HierarchicalFsmEnv__RegionT $(final hierarchicalFsmEnv.Region it) {
		return hierarchicalFsmEnv__Region(it);
	}
	default BasicFsmEnv__StateT $(final basicFsmEnv.State it) {
		if (it.getClass() == hierarchicalFsmEnv.impl.CompositeStateImpl.class)
			return hierarchicalFsmEnv__CompositeState((hierarchicalFsmEnv.CompositeState) it);
		if (it.getClass() == basicFsmEnv.impl.InitialStateImpl.class)
			return basicFsmEnv__InitialState((basicFsmEnv.InitialState) it);
		return basicFsmEnv__State(it);
	}
	default SimpleALEnv__StmtT $(final simpleALEnv.Stmt it) {
		if (it.getClass() == simpleALEnv.impl.AssignImpl.class)
			return simpleALEnv__Assign((simpleALEnv.Assign) it);
		if (it.getClass() == simpleALEnv.impl.PrintImpl.class)
			return simpleALEnv__Print((simpleALEnv.Print) it);
		return null;
	}
	default BasicFsmEnv__TransT $(final basicFsmEnv.Trans it) {
		return basicFsmEnv__Trans(it);
	}
	default BoolExpEnv__TruT $(final boolExpEnv.Tru it) {
		return boolExpEnv__Tru(it);
	}
	default BasicFsmEnv__VarDeclT $(final basicFsmEnv.VarDecl it) {
		return basicFsmEnv__VarDecl(it);
	}
	default BoolExpEnv__VarRefT $(final boolExpEnv.VarRef it) {
		return boolExpEnv__VarRef(it);
	}
}
