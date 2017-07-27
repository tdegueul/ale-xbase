package timedminifsm.revisitor;

public interface TimedminifsmRevisitor<Minifsm__FinalStateT extends Minifsm__StateT, Minifsm__MachineT, Minifsm__StateT, Timedminifsm__TimedTransitionT extends Minifsm__TransitionT, Minifsm__TransitionT>
	extends minifsm.revisitor.MinifsmRevisitor<Minifsm__FinalStateT, Minifsm__MachineT, Minifsm__StateT, Minifsm__TransitionT> {
	Timedminifsm__TimedTransitionT timedTransition(final timedminifsm.TimedTransition it);

	default Minifsm__FinalStateT $(final minifsm.FinalState it) {
		return finalState(it);
	}
	default Minifsm__MachineT $(final minifsm.Machine it) {
		return machine(it);
	}
	default Minifsm__StateT $(final minifsm.State it) {
		if (it.getClass() == minifsm.impl.FinalStateImpl.class)
			return finalState((minifsm.FinalState) it);
		return state(it);
	}
	default Timedminifsm__TimedTransitionT $(final timedminifsm.TimedTransition it) {
		return timedTransition(it);
	}
	default Minifsm__TransitionT $(final minifsm.Transition it) {
		if (it.getClass() == timedminifsm.impl.TimedTransitionImpl.class)
			return timedTransition((timedminifsm.TimedTransition) it);
		return transition(it);
	}
}
