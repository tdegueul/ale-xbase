package gfsm.revisitor;

public interface GfsmRevisitor<Gfsm__FinalStateT extends Gfsm__StateT, Gfsm__GuardT, Gfsm__InitialStateT extends Gfsm__StateT, Gfsm__MachineT, Gfsm__StateT, Gfsm__TransitionT> {
	Gfsm__FinalStateT finalState(final gfsm.FinalState it);
	Gfsm__InitialStateT initialState(final gfsm.InitialState it);
	Gfsm__MachineT machine(final gfsm.Machine it);
	Gfsm__StateT state(final gfsm.State it);
	Gfsm__TransitionT transition(final gfsm.Transition it);

	default Gfsm__FinalStateT $(final gfsm.FinalState it) {
		return finalState(it);
	}
	Gfsm__GuardT $(final gfsm.Guard it);
	default Gfsm__InitialStateT $(final gfsm.InitialState it) {
		return initialState(it);
	}
	default Gfsm__MachineT $(final gfsm.Machine it) {
		return machine(it);
	}
	default Gfsm__StateT $(final gfsm.State it) {
		if (it.getClass() == gfsm.impl.FinalStateImpl.class)
			return finalState((gfsm.FinalState) it);
		if (it.getClass() == gfsm.impl.InitialStateImpl.class)
			return initialState((gfsm.InitialState) it);
		return state(it);
	}
	default Gfsm__TransitionT $(final gfsm.Transition it) {
		return transition(it);
	}
}
