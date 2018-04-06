package fullfsmeval.revisitor;

public interface FullfsmevalRevisitor<SimpleALEnv__ALVarRefT extends SimpleALEnv__ArithT, BasicFsmEnv__ActionT, Fullfsmeval__ActionBindT extends BasicFsmEnv__ActionT, BoolExpEnv__AndT extends BoolExpEnv__BinExpT, SimpleALEnv__ArithT, SimpleALEnv__ArithLitT extends SimpleALEnv__ArithT, SimpleALEnv__ArithMinusT extends SimpleALEnv__ArithOpT, SimpleALEnv__ArithOpT extends SimpleALEnv__ArithT, SimpleALEnv__ArithPlusT extends SimpleALEnv__ArithOpT, SimpleALEnv__AssignT extends SimpleALEnv__StmtT, BoolExpEnv__BinExpT extends BoolExpEnv__ExpT, SimpleALEnv__BlockT, BoolExpEnv__ExpT, BoolExpEnv__FalsT extends BoolExpEnv__LitT, BasicFsmEnv__GuardT, Fullfsmeval__GuardBindT extends BasicFsmEnv__GuardT, BasicFsmEnv__InitialStateT extends BasicFsmEnv__StateT, BoolExpEnv__LitT extends BoolExpEnv__ExpT, BasicFsmEnv__MachineT, BoolExpEnv__NotT extends BoolExpEnv__ExpT, BoolExpEnv__OrT extends BoolExpEnv__BinExpT, SimpleALEnv__PrintT extends SimpleALEnv__StmtT, BasicFsmEnv__StateT, SimpleALEnv__StmtT, BasicFsmEnv__TransT, BoolExpEnv__TruT extends BoolExpEnv__LitT, BasicFsmEnv__VarDeclT, BoolExpEnv__VarRefT extends BoolExpEnv__ExpT>
	extends basicFsmEnv.revisitor.BasicFsmEnvRevisitor<BasicFsmEnv__ActionT, BasicFsmEnv__GuardT, BasicFsmEnv__InitialStateT, BasicFsmEnv__MachineT, BasicFsmEnv__StateT, BasicFsmEnv__TransT, BasicFsmEnv__VarDeclT>,
		boolExpEnv.revisitor.BoolExpEnvRevisitor<BoolExpEnv__AndT, BoolExpEnv__BinExpT, BoolExpEnv__ExpT, BoolExpEnv__FalsT, BoolExpEnv__LitT, BoolExpEnv__NotT, BoolExpEnv__OrT, BoolExpEnv__TruT, BoolExpEnv__VarRefT>,
		simpleALEnv.revisitor.SimpleALEnvRevisitor<SimpleALEnv__ALVarRefT, SimpleALEnv__ArithT, SimpleALEnv__ArithLitT, SimpleALEnv__ArithMinusT, SimpleALEnv__ArithOpT, SimpleALEnv__ArithPlusT, SimpleALEnv__AssignT, SimpleALEnv__BlockT, SimpleALEnv__PrintT, SimpleALEnv__StmtT> {
	Fullfsmeval__ActionBindT actionBind(final fullfsmeval.ActionBind it);
	Fullfsmeval__GuardBindT guardBind(final fullfsmeval.GuardBind it);

	default SimpleALEnv__ALVarRefT $(final simpleALEnv.ALVarRef it) {
		return aLVarRef(it);
	}
	default BasicFsmEnv__ActionT $(final basicFsmEnv.Action it) {
		if (it.getClass() == fullfsmeval.impl.ActionBindImpl.class)
			return actionBind((fullfsmeval.ActionBind) it);
		return null;
	}
	default Fullfsmeval__ActionBindT $(final fullfsmeval.ActionBind it) {
		return actionBind(it);
	}
	default BoolExpEnv__AndT $(final boolExpEnv.And it) {
		return and(it);
	}
	default SimpleALEnv__ArithT $(final simpleALEnv.Arith it) {
		if (it.getClass() == simpleALEnv.impl.ALVarRefImpl.class)
			return aLVarRef((simpleALEnv.ALVarRef) it);
		if (it.getClass() == simpleALEnv.impl.ArithLitImpl.class)
			return arithLit((simpleALEnv.ArithLit) it);
		if (it.getClass() == simpleALEnv.impl.ArithMinusImpl.class)
			return arithMinus((simpleALEnv.ArithMinus) it);
		if (it.getClass() == simpleALEnv.impl.ArithPlusImpl.class)
			return arithPlus((simpleALEnv.ArithPlus) it);
		return null;
	}
	default SimpleALEnv__ArithLitT $(final simpleALEnv.ArithLit it) {
		return arithLit(it);
	}
	default SimpleALEnv__ArithMinusT $(final simpleALEnv.ArithMinus it) {
		return arithMinus(it);
	}
	default SimpleALEnv__ArithOpT $(final simpleALEnv.ArithOp it) {
		if (it.getClass() == simpleALEnv.impl.ArithMinusImpl.class)
			return arithMinus((simpleALEnv.ArithMinus) it);
		if (it.getClass() == simpleALEnv.impl.ArithPlusImpl.class)
			return arithPlus((simpleALEnv.ArithPlus) it);
		return null;
	}
	default SimpleALEnv__ArithPlusT $(final simpleALEnv.ArithPlus it) {
		return arithPlus(it);
	}
	default SimpleALEnv__AssignT $(final simpleALEnv.Assign it) {
		return assign(it);
	}
	default BoolExpEnv__BinExpT $(final boolExpEnv.BinExp it) {
		if (it.getClass() == boolExpEnv.impl.AndImpl.class)
			return and((boolExpEnv.And) it);
		if (it.getClass() == boolExpEnv.impl.OrImpl.class)
			return or((boolExpEnv.Or) it);
		return null;
	}
	default SimpleALEnv__BlockT $(final simpleALEnv.Block it) {
		return block(it);
	}
	default BoolExpEnv__ExpT $(final boolExpEnv.Exp it) {
		if (it.getClass() == boolExpEnv.impl.AndImpl.class)
			return and((boolExpEnv.And) it);
		if (it.getClass() == boolExpEnv.impl.FalsImpl.class)
			return fals((boolExpEnv.Fals) it);
		if (it.getClass() == boolExpEnv.impl.NotImpl.class)
			return not((boolExpEnv.Not) it);
		if (it.getClass() == boolExpEnv.impl.OrImpl.class)
			return or((boolExpEnv.Or) it);
		if (it.getClass() == boolExpEnv.impl.TruImpl.class)
			return tru((boolExpEnv.Tru) it);
		if (it.getClass() == boolExpEnv.impl.VarRefImpl.class)
			return varRef((boolExpEnv.VarRef) it);
		return null;
	}
	default BoolExpEnv__FalsT $(final boolExpEnv.Fals it) {
		return fals(it);
	}
	default BasicFsmEnv__GuardT $(final basicFsmEnv.Guard it) {
		if (it.getClass() == fullfsmeval.impl.GuardBindImpl.class)
			return guardBind((fullfsmeval.GuardBind) it);
		return null;
	}
	default Fullfsmeval__GuardBindT $(final fullfsmeval.GuardBind it) {
		return guardBind(it);
	}
	default BasicFsmEnv__InitialStateT $(final basicFsmEnv.InitialState it) {
		return initialState(it);
	}
	default BoolExpEnv__LitT $(final boolExpEnv.Lit it) {
		if (it.getClass() == boolExpEnv.impl.FalsImpl.class)
			return fals((boolExpEnv.Fals) it);
		if (it.getClass() == boolExpEnv.impl.TruImpl.class)
			return tru((boolExpEnv.Tru) it);
		return null;
	}
	default BasicFsmEnv__MachineT $(final basicFsmEnv.Machine it) {
		return machine(it);
	}
	default BoolExpEnv__NotT $(final boolExpEnv.Not it) {
		return not(it);
	}
	default BoolExpEnv__OrT $(final boolExpEnv.Or it) {
		return or(it);
	}
	default SimpleALEnv__PrintT $(final simpleALEnv.Print it) {
		return print(it);
	}
	default BasicFsmEnv__StateT $(final basicFsmEnv.State it) {
		if (it.getClass() == basicFsmEnv.impl.InitialStateImpl.class)
			return initialState((basicFsmEnv.InitialState) it);
		return state(it);
	}
	default SimpleALEnv__StmtT $(final simpleALEnv.Stmt it) {
		if (it.getClass() == simpleALEnv.impl.AssignImpl.class)
			return assign((simpleALEnv.Assign) it);
		if (it.getClass() == simpleALEnv.impl.PrintImpl.class)
			return print((simpleALEnv.Print) it);
		return null;
	}
	default BasicFsmEnv__TransT $(final basicFsmEnv.Trans it) {
		return trans(it);
	}
	default BoolExpEnv__TruT $(final boolExpEnv.Tru it) {
		return tru(it);
	}
	default BasicFsmEnv__VarDeclT $(final basicFsmEnv.VarDecl it) {
		return varDecl(it);
	}
	default BoolExpEnv__VarRefT $(final boolExpEnv.VarRef it) {
		return varRef(it);
	}
}
