package dispatch.revisitor;

import dispatch.*;

public interface DispatchRevisitor<Dispatch__AT, Dispatch__BT extends Dispatch__AT, Dispatch__CT extends Dispatch__AT, Dispatch__ContainerT, Dispatch__DT extends Dispatch__BT, Dispatch__ET extends Dispatch__BT, Dispatch__FT extends Dispatch__CT, Dispatch__GT extends Dispatch__CT> {
	Dispatch__AT dispatch__A(final A it);
	Dispatch__BT dispatch__B(final B it);
	Dispatch__CT dispatch__C(final C it);
	Dispatch__ContainerT dispatch__Container(final Container it);
	Dispatch__DT dispatch__D(final D it);
	Dispatch__ET dispatch__E(final E it);
	Dispatch__FT dispatch__F(final F it);
	Dispatch__GT dispatch__G(final G it);

	default Dispatch__AT $(final A it) {
		if (it.getClass() == B.class)
			return dispatch__B((B) it);
		if (it.getClass() == C.class)
			return dispatch__C((C) it);
		if (it.getClass() == D.class)
			return dispatch__D((D) it);
		if (it.getClass() == E.class)
			return dispatch__E((E) it);
		if (it.getClass() == F.class)
			return dispatch__F((F) it);
		if (it.getClass() == G.class)
			return dispatch__G((G) it);
		return dispatch__A(it);
	}
	default Dispatch__BT $(final B  it) {
		if (it.getClass() == D.class)
			return dispatch__D((D) it);
		if (it.getClass() == E.class)
			return dispatch__E((E) it);
		return dispatch__B(it);
	}
	default Dispatch__CT $(final C  it) {
		if (it.getClass() == F.class)
			return dispatch__F((F) it);
		if (it.getClass() == G.class)
			return dispatch__G((G) it);
		return dispatch__C(it);
	}
	default Dispatch__ContainerT $(final Container it) {
		return dispatch__Container(it);
	}
	default Dispatch__DT $(final D it) {
		return dispatch__D(it);
	}
	default Dispatch__ET $(final E it) {
		return dispatch__E(it);
	}
	default Dispatch__FT $(final F it) {
		return dispatch__F(it);
	}
	default Dispatch__GT $(final G it) {
		return dispatch__G(it);
	}
}
