package boolexp.revisitor;

public interface BoolexpRevisitor<Boolexp__AndT extends Boolexp__BinaryExpT, Boolexp__BinaryExpT extends Boolexp__ExpT, Boolexp__ExpT, Boolexp__FalsT extends Boolexp__LitT, Boolexp__LitT extends Boolexp__ExpT, Boolexp__OrT extends Boolexp__BinaryExpT, Boolexp__TruT extends Boolexp__LitT> {
	Boolexp__AndT boolexp__And(final boolexp.And it);
	Boolexp__FalsT boolexp__Fals(final boolexp.Fals it);
	Boolexp__OrT boolexp__Or(final boolexp.Or it);
	Boolexp__TruT boolexp__Tru(final boolexp.Tru it);

	default Boolexp__AndT $(final boolexp.And it) {
		return boolexp__And(it);
	}
	default Boolexp__BinaryExpT $(final boolexp.BinaryExp it) {
		if (it.getClass() == boolexp.impl.AndImpl.class)
			return boolexp__And((boolexp.And) it);
		if (it.getClass() == boolexp.impl.OrImpl.class)
			return boolexp__Or((boolexp.Or) it);
		return null;
	}
	default Boolexp__ExpT $(final boolexp.Exp it) {
		if (it.getClass() == boolexp.impl.AndImpl.class)
			return boolexp__And((boolexp.And) it);
		if (it.getClass() == boolexp.impl.FalsImpl.class)
			return boolexp__Fals((boolexp.Fals) it);
		if (it.getClass() == boolexp.impl.OrImpl.class)
			return boolexp__Or((boolexp.Or) it);
		if (it.getClass() == boolexp.impl.TruImpl.class)
			return boolexp__Tru((boolexp.Tru) it);
		return null;
	}
	default Boolexp__FalsT $(final boolexp.Fals it) {
		return boolexp__Fals(it);
	}
	default Boolexp__LitT $(final boolexp.Lit it) {
		if (it.getClass() == boolexp.impl.FalsImpl.class)
			return boolexp__Fals((boolexp.Fals) it);
		if (it.getClass() == boolexp.impl.TruImpl.class)
			return boolexp__Tru((boolexp.Tru) it);
		return null;
	}
	default Boolexp__OrT $(final boolexp.Or it) {
		return boolexp__Or(it);
	}
	default Boolexp__TruT $(final boolexp.Tru it) {
		return boolexp__Tru(it);
	}
}
