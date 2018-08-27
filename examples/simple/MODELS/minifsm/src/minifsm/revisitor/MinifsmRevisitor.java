package minifsm.revisitor;

public interface MinifsmRevisitor<Minifsm__FinalStateT extends Minifsm__StateT, Minifsm__MachineT, Minifsm__StateT, Minifsm__TransitionT> {
	Minifsm__FinalStateT minifsm__FinalState(final minifsm.FinalState it);
	Minifsm__MachineT minifsm__Machine(final minifsm.Machine it);
	Minifsm__StateT minifsm__State(final minifsm.State it);
	Minifsm__TransitionT minifsm__Transition(final minifsm.Transition it);

	default Minifsm__FinalStateT $(final minifsm.FinalState it) {
		return minifsm__FinalState(it);
	}
	default Minifsm__MachineT $(final minifsm.Machine it) {
		return minifsm__Machine(it);
	}
	default Minifsm__StateT $(final minifsm.State it) {
		if (it.getClass() == minifsm.impl.FinalStateImpl.class)
			return minifsm__FinalState((minifsm.FinalState) it);
		return minifsm__State(it);
	}
	default Minifsm__TransitionT $(final minifsm.Transition it) {
		return minifsm__Transition(it);
	}
}
