package guardedfsm.revisitor;

public interface GuardedfsmRevisitor<Boolexp__AndT extends Boolexp__BinaryExpT, Boolexp__BinaryExpT extends Boolexp__ExpT, Boolexp__ExpT, Boolexp__FalsT extends Boolexp__LitT, Minifsm__FinalStateT extends Minifsm__StateT, Guardedfsm__GuardedT extends Minifsm__TransitionT, Boolexp__LitT extends Boolexp__ExpT, Minifsm__MachineT, Boolexp__OrT extends Boolexp__BinaryExpT, Minifsm__StateT, Minifsm__TransitionT, Boolexp__TruT extends Boolexp__LitT>
	extends boolexp.revisitor.BoolexpRevisitor<Boolexp__AndT, Boolexp__BinaryExpT, Boolexp__ExpT, Boolexp__FalsT, Boolexp__LitT, Boolexp__OrT, Boolexp__TruT>,
		minifsm.revisitor.MinifsmRevisitor<Minifsm__FinalStateT, Minifsm__MachineT, Minifsm__StateT, Minifsm__TransitionT> {
	Guardedfsm__GuardedT guarded(final guardedfsm.Guarded it);

	default Boolexp__AndT $(final boolexp.And it) {
		return and(it);
	}
	default Boolexp__BinaryExpT $(final boolexp.BinaryExp it) {
		if (it.getClass() == boolexp.impl.AndImpl.class)
			return and((boolexp.And) it);
		if (it.getClass() == boolexp.impl.OrImpl.class)
			return or((boolexp.Or) it);
		return null;
	}
	default Boolexp__ExpT $(final boolexp.Exp it) {
		if (it.getClass() == boolexp.impl.AndImpl.class)
			return and((boolexp.And) it);
		if (it.getClass() == boolexp.impl.FalsImpl.class)
			return fals((boolexp.Fals) it);
		if (it.getClass() == boolexp.impl.OrImpl.class)
			return or((boolexp.Or) it);
		if (it.getClass() == boolexp.impl.TruImpl.class)
			return tru((boolexp.Tru) it);
		return null;
	}
	default Boolexp__FalsT $(final boolexp.Fals it) {
		return fals(it);
	}
	default Minifsm__FinalStateT $(final minifsm.FinalState it) {
		return finalState(it);
	}
	default Guardedfsm__GuardedT $(final guardedfsm.Guarded it) {
		return guarded(it);
	}
	default Boolexp__LitT $(final boolexp.Lit it) {
		if (it.getClass() == boolexp.impl.FalsImpl.class)
			return fals((boolexp.Fals) it);
		if (it.getClass() == boolexp.impl.TruImpl.class)
			return tru((boolexp.Tru) it);
		return null;
	}
	default Minifsm__MachineT $(final minifsm.Machine it) {
		return machine(it);
	}
	default Boolexp__OrT $(final boolexp.Or it) {
		return or(it);
	}
	default Minifsm__StateT $(final minifsm.State it) {
		if (it.getClass() == minifsm.impl.FinalStateImpl.class)
			return finalState((minifsm.FinalState) it);
		return state(it);
	}
	default Minifsm__TransitionT $(final minifsm.Transition it) {
		if (it.getClass() == guardedfsm.impl.GuardedImpl.class)
			return guarded((guardedfsm.Guarded) it);
		return transition(it);
	}
	default Boolexp__TruT $(final boolexp.Tru it) {
		return tru(it);
	}
}
