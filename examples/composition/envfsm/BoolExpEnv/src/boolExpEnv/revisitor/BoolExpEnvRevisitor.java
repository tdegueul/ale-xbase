package boolExpEnv.revisitor;

public interface BoolExpEnvRevisitor<BoolExpEnv__AndT extends BoolExpEnv__BinExpT, BoolExpEnv__BinExpT extends BoolExpEnv__ExpT, BoolExpEnv__ExpT, BoolExpEnv__FalsT extends BoolExpEnv__LitT, BoolExpEnv__LitT extends BoolExpEnv__ExpT, BoolExpEnv__NotT extends BoolExpEnv__ExpT, BoolExpEnv__OrT extends BoolExpEnv__BinExpT, BoolExpEnv__TruT extends BoolExpEnv__LitT, BoolExpEnv__VarRefT extends BoolExpEnv__ExpT> {
	BoolExpEnv__AndT boolExpEnv__And(final boolExpEnv.And it);
	BoolExpEnv__FalsT boolExpEnv__Fals(final boolExpEnv.Fals it);
	BoolExpEnv__NotT boolExpEnv__Not(final boolExpEnv.Not it);
	BoolExpEnv__OrT boolExpEnv__Or(final boolExpEnv.Or it);
	BoolExpEnv__TruT boolExpEnv__Tru(final boolExpEnv.Tru it);
	BoolExpEnv__VarRefT boolExpEnv__VarRef(final boolExpEnv.VarRef it);

	default BoolExpEnv__AndT $(final boolExpEnv.And it) {
		return boolExpEnv__And(it);
	}
	default BoolExpEnv__BinExpT $(final boolExpEnv.BinExp it) {
		if (it.getClass() == boolExpEnv.impl.AndImpl.class)
			return boolExpEnv__And((boolExpEnv.And) it);
		if (it.getClass() == boolExpEnv.impl.OrImpl.class)
			return boolExpEnv__Or((boolExpEnv.Or) it);
		return null;
	}
	default BoolExpEnv__ExpT $(final boolExpEnv.Exp it) {
		if (it.getClass() == boolExpEnv.impl.AndImpl.class)
			return boolExpEnv__And((boolExpEnv.And) it);
		if (it.getClass() == boolExpEnv.impl.FalsImpl.class)
			return boolExpEnv__Fals((boolExpEnv.Fals) it);
		if (it.getClass() == boolExpEnv.impl.NotImpl.class)
			return boolExpEnv__Not((boolExpEnv.Not) it);
		if (it.getClass() == boolExpEnv.impl.OrImpl.class)
			return boolExpEnv__Or((boolExpEnv.Or) it);
		if (it.getClass() == boolExpEnv.impl.TruImpl.class)
			return boolExpEnv__Tru((boolExpEnv.Tru) it);
		if (it.getClass() == boolExpEnv.impl.VarRefImpl.class)
			return boolExpEnv__VarRef((boolExpEnv.VarRef) it);
		return null;
	}
	default BoolExpEnv__FalsT $(final boolExpEnv.Fals it) {
		return boolExpEnv__Fals(it);
	}
	default BoolExpEnv__LitT $(final boolExpEnv.Lit it) {
		if (it.getClass() == boolExpEnv.impl.FalsImpl.class)
			return boolExpEnv__Fals((boolExpEnv.Fals) it);
		if (it.getClass() == boolExpEnv.impl.TruImpl.class)
			return boolExpEnv__Tru((boolExpEnv.Tru) it);
		return null;
	}
	default BoolExpEnv__NotT $(final boolExpEnv.Not it) {
		return boolExpEnv__Not(it);
	}
	default BoolExpEnv__OrT $(final boolExpEnv.Or it) {
		return boolExpEnv__Or(it);
	}
	default BoolExpEnv__TruT $(final boolExpEnv.Tru it) {
		return boolExpEnv__Tru(it);
	}
	default BoolExpEnv__VarRefT $(final boolExpEnv.VarRef it) {
		return boolExpEnv__VarRef(it);
	}
}
