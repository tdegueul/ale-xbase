package simpleALEnv.revisitor;

public interface SimpleALEnvRevisitor<SimpleALEnv__ALVarRefT extends SimpleALEnv__ArithT, SimpleALEnv__ArithT, SimpleALEnv__ArithLitT extends SimpleALEnv__ArithT, SimpleALEnv__ArithMinusT extends SimpleALEnv__ArithOpT, SimpleALEnv__ArithOpT extends SimpleALEnv__ArithT, SimpleALEnv__ArithPlusT extends SimpleALEnv__ArithOpT, SimpleALEnv__AssignT extends SimpleALEnv__StmtT, SimpleALEnv__BlockT, SimpleALEnv__PrintT extends SimpleALEnv__StmtT, SimpleALEnv__StmtT> {
	SimpleALEnv__ALVarRefT aLVarRef(final simpleALEnv.ALVarRef it);
	SimpleALEnv__ArithLitT arithLit(final simpleALEnv.ArithLit it);
	SimpleALEnv__ArithMinusT arithMinus(final simpleALEnv.ArithMinus it);
	SimpleALEnv__ArithPlusT arithPlus(final simpleALEnv.ArithPlus it);
	SimpleALEnv__AssignT assign(final simpleALEnv.Assign it);
	SimpleALEnv__BlockT block(final simpleALEnv.Block it);
	SimpleALEnv__PrintT print(final simpleALEnv.Print it);

	default SimpleALEnv__ALVarRefT $(final simpleALEnv.ALVarRef it) {
		return aLVarRef(it);
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
	default SimpleALEnv__BlockT $(final simpleALEnv.Block it) {
		return block(it);
	}
	default SimpleALEnv__PrintT $(final simpleALEnv.Print it) {
		return print(it);
	}
	default SimpleALEnv__StmtT $(final simpleALEnv.Stmt it) {
		if (it.getClass() == simpleALEnv.impl.AssignImpl.class)
			return assign((simpleALEnv.Assign) it);
		if (it.getClass() == simpleALEnv.impl.PrintImpl.class)
			return print((simpleALEnv.Print) it);
		return null;
	}
}
