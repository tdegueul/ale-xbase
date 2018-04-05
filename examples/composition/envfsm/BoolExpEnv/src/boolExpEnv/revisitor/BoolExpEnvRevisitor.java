package boolExpEnv.revisitor;

public interface BoolExpEnvRevisitor<BoolExpEnv__AndT extends BoolExpEnv__BinExpT, BoolExpEnv__BinExpT extends BoolExpEnv__ExpT, BoolExpEnv__ExpT, BoolExpEnv__FalsT extends BoolExpEnv__LitT, BoolExpEnv__LitT extends BoolExpEnv__ExpT, BoolExpEnv__NotT extends BoolExpEnv__ExpT, BoolExpEnv__OrT extends BoolExpEnv__BinExpT, BoolExpEnv__TruT extends BoolExpEnv__LitT, BoolExpEnv__VarRefT extends BoolExpEnv__ExpT> {
	BoolExpEnv__AndT and(final boolExpEnv.And it);
	BoolExpEnv__FalsT fals(final boolExpEnv.Fals it);
	BoolExpEnv__NotT not(final boolExpEnv.Not it);
	BoolExpEnv__OrT or(final boolExpEnv.Or it);
	BoolExpEnv__TruT tru(final boolExpEnv.Tru it);
	BoolExpEnv__VarRefT varRef(final boolExpEnv.VarRef it);

	default BoolExpEnv__AndT $(final boolExpEnv.And it) {
		return and(it);
	}
	default BoolExpEnv__BinExpT $(final boolExpEnv.BinExp it) {
		if (it.getClass() == boolExpEnv.impl.AndImpl.class)
			return and((boolExpEnv.And) it);
		if (it.getClass() == boolExpEnv.impl.OrImpl.class)
			return or((boolExpEnv.Or) it);
		return null;
	}
	default BoolExpEnv__ExpT $(final boolExpEnv.Exp it) {
		if (it.getClass() == boolExpEnv.impl.AndImpl.class)
			return and((boolExpEnv.And) it);
		if (it.getClass() == boolExpEnv.impl.FalsImpl.class)
			return fals((boolExpEnv.Fals) it);
		if (it.getClass() == boolExpEnv.impl.NotImpl.class)
			return not((boolExpEnv.Not) it);
		if (it.getClass() == boolExpEnv.impl.OrImpl.class)
			return or((boolExpEnv.Or) it);
		if (it.getClass() == boolExpEnv.impl.TruImpl.class)
			return tru((boolExpEnv.Tru) it);
		if (it.getClass() == boolExpEnv.impl.VarRefImpl.class)
			return varRef((boolExpEnv.VarRef) it);
		return null;
	}
	default BoolExpEnv__FalsT $(final boolExpEnv.Fals it) {
		return fals(it);
	}
	default BoolExpEnv__LitT $(final boolExpEnv.Lit it) {
		if (it.getClass() == boolExpEnv.impl.FalsImpl.class)
			return fals((boolExpEnv.Fals) it);
		if (it.getClass() == boolExpEnv.impl.TruImpl.class)
			return tru((boolExpEnv.Tru) it);
		return null;
	}
	default BoolExpEnv__NotT $(final boolExpEnv.Not it) {
		return not(it);
	}
	default BoolExpEnv__OrT $(final boolExpEnv.Or it) {
		return or(it);
	}
	default BoolExpEnv__TruT $(final boolExpEnv.Tru it) {
		return tru(it);
	}
	default BoolExpEnv__VarRefT $(final boolExpEnv.VarRef it) {
		return varRef(it);
	}
}
