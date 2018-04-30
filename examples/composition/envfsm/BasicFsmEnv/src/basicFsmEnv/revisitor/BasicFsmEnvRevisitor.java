package basicFsmEnv.revisitor;

public interface BasicFsmEnvRevisitor<BasicFsmEnv__ActionT, BasicFsmEnv__GuardT, BasicFsmEnv__InitialStateT extends BasicFsmEnv__StateT, BasicFsmEnv__MachineT, BasicFsmEnv__StateT, BasicFsmEnv__TransT, BasicFsmEnv__VarDeclT> {
	BasicFsmEnv__InitialStateT basicFsmEnv__InitialState(final basicFsmEnv.InitialState it);
	BasicFsmEnv__MachineT basicFsmEnv__Machine(final basicFsmEnv.Machine it);
	BasicFsmEnv__StateT basicFsmEnv__State(final basicFsmEnv.State it);
	BasicFsmEnv__TransT basicFsmEnv__Trans(final basicFsmEnv.Trans it);
	BasicFsmEnv__VarDeclT basicFsmEnv__VarDecl(final basicFsmEnv.VarDecl it);

	BasicFsmEnv__ActionT $(final basicFsmEnv.Action it);
	BasicFsmEnv__GuardT $(final basicFsmEnv.Guard it);
	default BasicFsmEnv__InitialStateT $(final basicFsmEnv.InitialState it) {
		return basicFsmEnv__InitialState(it);
	}
	default BasicFsmEnv__MachineT $(final basicFsmEnv.Machine it) {
		return basicFsmEnv__Machine(it);
	}
	default BasicFsmEnv__StateT $(final basicFsmEnv.State it) {
		if (it.getClass() == basicFsmEnv.impl.InitialStateImpl.class)
			return basicFsmEnv__InitialState((basicFsmEnv.InitialState) it);
		return basicFsmEnv__State(it);
	}
	default BasicFsmEnv__TransT $(final basicFsmEnv.Trans it) {
		return basicFsmEnv__Trans(it);
	}
	default BasicFsmEnv__VarDeclT $(final basicFsmEnv.VarDecl it) {
		return basicFsmEnv__VarDecl(it);
	}
}
