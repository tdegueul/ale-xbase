package fsm.revisitor;

public interface FsmRevisitor<Fsm__FinalStateT extends Fsm__StateT, Fsm__InitialStateT extends Fsm__StateT, Fsm__MachineT, Fsm__StateT, Fsm__TransitionT> {
	Fsm__FinalStateT fsm__FinalState(final fsm.FinalState it);
	Fsm__InitialStateT fsm__InitialState(final fsm.InitialState it);
	Fsm__MachineT fsm__Machine(final fsm.Machine it);
	Fsm__StateT fsm__State(final fsm.State it);
	Fsm__TransitionT fsm__Transition(final fsm.Transition it);

	default Fsm__FinalStateT $(final fsm.FinalState it) {
		return fsm__FinalState(it);
	}
	default Fsm__InitialStateT $(final fsm.InitialState it) {
		return fsm__InitialState(it);
	}
	default Fsm__MachineT $(final fsm.Machine it) {
		return fsm__Machine(it);
	}
	default Fsm__StateT $(final fsm.State it) {
		if (it.getClass() == fsm.impl.FinalStateImpl.class)
			return fsm__FinalState((fsm.FinalState) it);
		if (it.getClass() == fsm.impl.InitialStateImpl.class)
			return fsm__InitialState((fsm.InitialState) it);
		return fsm__State(it);
	}
	default Fsm__TransitionT $(final fsm.Transition it) {
		return fsm__Transition(it);
	}
}
