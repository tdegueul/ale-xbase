package printgfsmboolexp.revisitor;

public interface PrintgfsmboolexpRevisitor<Boolexp__AndT extends Boolexp__BinaryExpT, Boolexp__BinaryExpT extends Boolexp__ExpT, Boolexp__ExpT, Boolexp__FalsT extends Boolexp__LitT, Gfsm__FinalStateT extends Gfsm__StateT, Gfsm__GuardT, Printgfsmboolexp__GuardBindT extends Gfsm__GuardT, Gfsm__InitialStateT extends Gfsm__StateT, Boolexp__LitT extends Boolexp__ExpT, Gfsm__MachineT, Boolexp__OrT extends Boolexp__BinaryExpT, Gfsm__StateT, Gfsm__TransitionT, Boolexp__TruT extends Boolexp__LitT>
	extends gfsm.revisitor.GfsmRevisitor<Gfsm__FinalStateT, Gfsm__GuardT, Gfsm__InitialStateT, Gfsm__MachineT, Gfsm__StateT, Gfsm__TransitionT>,
		boolexp.revisitor.BoolexpRevisitor<Boolexp__AndT, Boolexp__BinaryExpT, Boolexp__ExpT, Boolexp__FalsT, Boolexp__LitT, Boolexp__OrT, Boolexp__TruT> {
	Printgfsmboolexp__GuardBindT guardBind(final printgfsmboolexp.GuardBind it);

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
	default Gfsm__FinalStateT $(final gfsm.FinalState it) {
		return finalState(it);
	}
	default Gfsm__GuardT $(final gfsm.Guard it) {
		if (it.getClass() == printgfsmboolexp.impl.GuardBindImpl.class)
			return guardBind((printgfsmboolexp.GuardBind) it);
		return null;
	}
	default Printgfsmboolexp__GuardBindT $(final printgfsmboolexp.GuardBind it) {
		return guardBind(it);
	}
	default Gfsm__InitialStateT $(final gfsm.InitialState it) {
		return initialState(it);
	}
	default Boolexp__LitT $(final boolexp.Lit it) {
		if (it.getClass() == boolexp.impl.FalsImpl.class)
			return fals((boolexp.Fals) it);
		if (it.getClass() == boolexp.impl.TruImpl.class)
			return tru((boolexp.Tru) it);
		return null;
	}
	default Gfsm__MachineT $(final gfsm.Machine it) {
		return machine(it);
	}
	default Boolexp__OrT $(final boolexp.Or it) {
		return or(it);
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
	default Boolexp__TruT $(final boolexp.Tru it) {
		return tru(it);
	}
}
