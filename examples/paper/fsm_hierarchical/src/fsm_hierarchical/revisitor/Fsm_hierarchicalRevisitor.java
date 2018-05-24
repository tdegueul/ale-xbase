package fsm_hierarchical.revisitor;

public interface Fsm_hierarchicalRevisitor<BasicFsmEnv__ActionT, HierarchicalFsmEnv__CompositeStateT extends BasicFsmEnv__StateT, BasicFsmEnv__GuardT, BasicFsmEnv__InitialStateT extends BasicFsmEnv__StateT, BasicFsmEnv__MachineT, HierarchicalFsmEnv__RegionT, BasicFsmEnv__StateT, BasicFsmEnv__TransT, BasicFsmEnv__VarDeclT>
	extends hierarchicalFsmEnv.revisitor.HierarchicalFsmEnvRevisitor<BasicFsmEnv__ActionT, HierarchicalFsmEnv__CompositeStateT, BasicFsmEnv__GuardT, BasicFsmEnv__InitialStateT, BasicFsmEnv__MachineT, HierarchicalFsmEnv__RegionT, BasicFsmEnv__StateT, BasicFsmEnv__TransT, BasicFsmEnv__VarDeclT> {
	HierarchicalFsmEnv__CompositeStateT hierarchicalFsmEnv__CompositeState(final hierarchicalFsmEnv.CompositeState it);
	HierarchicalFsmEnv__RegionT hierarchicalFsmEnv__Region(final hierarchicalFsmEnv.Region it);

	BasicFsmEnv__ActionT $(final basicFsmEnv.Action it);
	default HierarchicalFsmEnv__CompositeStateT $(final hierarchicalFsmEnv.CompositeState it) {
		return hierarchicalFsmEnv__CompositeState(it);
	}
	BasicFsmEnv__GuardT $(final basicFsmEnv.Guard it);
	default BasicFsmEnv__InitialStateT $(final basicFsmEnv.InitialState it) {
		return basicFsmEnv__InitialState(it);
	}
	default BasicFsmEnv__MachineT $(final basicFsmEnv.Machine it) {
		return basicFsmEnv__Machine(it);
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
	default BasicFsmEnv__TransT $(final basicFsmEnv.Trans it) {
		return basicFsmEnv__Trans(it);
	}
	default BasicFsmEnv__VarDeclT $(final basicFsmEnv.VarDecl it) {
		return basicFsmEnv__VarDecl(it);
	}
}
