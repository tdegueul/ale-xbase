package simpleALEnv.revisitor;

public interface SimpleALEnvRevisitor<SimpleALEnv__ALVarRefT extends SimpleALEnv__ArithT, SimpleALEnv__ArithT, SimpleALEnv__ArithLitT extends SimpleALEnv__ArithT, SimpleALEnv__ArithMinusT extends SimpleALEnv__ArithOpT, SimpleALEnv__ArithOpT extends SimpleALEnv__ArithT, SimpleALEnv__ArithPlusT extends SimpleALEnv__ArithOpT, SimpleALEnv__AssignT extends SimpleALEnv__StmtT, SimpleALEnv__BlockT, SimpleALEnv__PrintT extends SimpleALEnv__StmtT, SimpleALEnv__StmtT> {
	SimpleALEnv__ALVarRefT simpleALEnv__ALVarRef(final simpleALEnv.ALVarRef it);
	SimpleALEnv__ArithLitT simpleALEnv__ArithLit(final simpleALEnv.ArithLit it);
	SimpleALEnv__ArithMinusT simpleALEnv__ArithMinus(final simpleALEnv.ArithMinus it);
	SimpleALEnv__ArithPlusT simpleALEnv__ArithPlus(final simpleALEnv.ArithPlus it);
	SimpleALEnv__AssignT simpleALEnv__Assign(final simpleALEnv.Assign it);
	SimpleALEnv__BlockT simpleALEnv__Block(final simpleALEnv.Block it);
	SimpleALEnv__PrintT simpleALEnv__Print(final simpleALEnv.Print it);

	default SimpleALEnv__ALVarRefT $(final simpleALEnv.ALVarRef it) {
		return simpleALEnv__ALVarRef(it);
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
	default SimpleALEnv__BlockT $(final simpleALEnv.Block it) {
		return simpleALEnv__Block(it);
	}
	default SimpleALEnv__PrintT $(final simpleALEnv.Print it) {
		return simpleALEnv__Print(it);
	}
	default SimpleALEnv__StmtT $(final simpleALEnv.Stmt it) {
		if (it.getClass() == simpleALEnv.impl.AssignImpl.class)
			return simpleALEnv__Assign((simpleALEnv.Assign) it);
		if (it.getClass() == simpleALEnv.impl.PrintImpl.class)
			return simpleALEnv__Print((simpleALEnv.Print) it);
		return null;
	}
}
