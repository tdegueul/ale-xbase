package multi.revisitor;

public interface MultiRevisitor<Multi__AT, Multi__BT, Multi__CT, Multi__CT_AS_Multi__AT extends Multi__AT, Multi__CT_AS_Multi__BT extends Multi__BT> {
	Multi__AT multi__A(final multi.A it);
	Multi__BT multi__B(final multi.B it);
	Multi__CT multi__C(final multi.C it);
	Multi__CT_AS_Multi__AT multi__C__as__multi__A(final multi.C it);
	Multi__CT_AS_Multi__BT multi__C__as__multi__B(final multi.C it);

	default Multi__AT $(final multi.A it) {
		if (it.getClass() == multi.impl.CImpl.class)
			return multi__C__as__multi__A((multi.C) it);
		return multi__A(it);
	}
	default Multi__BT $(final multi.B it) {
		if (it.getClass() == multi.impl.CImpl.class)
			return multi__C__as__multi__B((multi.C) it);
		return multi__B(it);
	}
	default Multi__CT $(final multi.C it) {
		return multi__C(it);
	}
}
