package boolexp.revisitor;

public interface BoolexpRevisitor<Boolexp__AndT extends Boolexp__BinaryExpT, Boolexp__BinaryExpT extends Boolexp__ExpT, Boolexp__ExpT, Boolexp__FalsT extends Boolexp__LitT, Boolexp__LitT extends Boolexp__ExpT, Boolexp__OrT extends Boolexp__BinaryExpT, Boolexp__TruT extends Boolexp__LitT> {
	Boolexp__AndT and(final boolexp.And it);
	Boolexp__FalsT fals(final boolexp.Fals it);
	Boolexp__OrT or(final boolexp.Or it);
	Boolexp__TruT tru(final boolexp.Tru it);

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
	default Boolexp__LitT $(final boolexp.Lit it) {
		if (it.getClass() == boolexp.impl.FalsImpl.class)
			return fals((boolexp.Fals) it);
		if (it.getClass() == boolexp.impl.TruImpl.class)
			return tru((boolexp.Tru) it);
		return null;
	}
	default Boolexp__OrT $(final boolexp.Or it) {
		return or(it);
	}
	default Boolexp__TruT $(final boolexp.Tru it) {
		return tru(it);
	}
}
