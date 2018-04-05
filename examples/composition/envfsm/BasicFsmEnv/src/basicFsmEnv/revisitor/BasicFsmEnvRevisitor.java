package basicFsmEnv.revisitor;

public interface BasicFsmEnvRevisitor<BasicFsmEnv__ActionT, BasicFsmEnv__GuardT, BasicFsmEnv__InitialStateT extends BasicFsmEnv__StateT, BasicFsmEnv__MachineT, BasicFsmEnv__StateT, BasicFsmEnv__TransT, BasicFsmEnv__VarDeclT> {
	BasicFsmEnv__InitialStateT initialState(final basicFsmEnv.InitialState it);
	BasicFsmEnv__MachineT machine(final basicFsmEnv.Machine it);
	BasicFsmEnv__StateT state(final basicFsmEnv.State it);
	BasicFsmEnv__TransT trans(final basicFsmEnv.Trans it);
	BasicFsmEnv__VarDeclT varDecl(final basicFsmEnv.VarDecl it);

	BasicFsmEnv__ActionT $(final basicFsmEnv.Action it);
	BasicFsmEnv__GuardT $(final basicFsmEnv.Guard it);
	default BasicFsmEnv__InitialStateT $(final basicFsmEnv.InitialState it) {
		return initialState(it);
	}
	default BasicFsmEnv__MachineT $(final basicFsmEnv.Machine it) {
		return machine(it);
	}
	default BasicFsmEnv__StateT $(final basicFsmEnv.State it) {
		if (it.getClass() == basicFsmEnv.impl.InitialStateImpl.class)
			return initialState((basicFsmEnv.InitialState) it);
		return state(it);
	}
	default BasicFsmEnv__TransT $(final basicFsmEnv.Trans it) {
		return trans(it);
	}
	default BasicFsmEnv__VarDeclT $(final basicFsmEnv.VarDecl it) {
		return varDecl(it);
	}
}
