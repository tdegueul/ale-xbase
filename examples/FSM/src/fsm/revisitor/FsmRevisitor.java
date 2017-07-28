package fsm.revisitor;

public interface FsmRevisitor<Fsm__FinalStateT extends Fsm__StateT, Fsm__InitialStateT extends Fsm__StateT, Fsm__MachineT, Fsm__StateT, Fsm__TransitionT> {
	Fsm__FinalStateT finalState(final fsm.FinalState it);
	Fsm__InitialStateT initialState(final fsm.InitialState it);
	Fsm__MachineT machine(final fsm.Machine it);
	Fsm__StateT state(final fsm.State it);
	Fsm__TransitionT transition(final fsm.Transition it);

	default Fsm__FinalStateT $(final fsm.FinalState it) {
		return finalState(it);
	}
	default Fsm__InitialStateT $(final fsm.InitialState it) {
		return initialState(it);
	}
	default Fsm__MachineT $(final fsm.Machine it) {
		return machine(it);
	}
	default Fsm__StateT $(final fsm.State it) {
		if (it.getClass() == fsm.impl.FinalStateImpl.class)
			return finalState((fsm.FinalState) it);
		if (it.getClass() == fsm.impl.InitialStateImpl.class)
			return initialState((fsm.InitialState) it);
		return state(it);
	}
	default Fsm__TransitionT $(final fsm.Transition it) {
		return transition(it);
	}
}
