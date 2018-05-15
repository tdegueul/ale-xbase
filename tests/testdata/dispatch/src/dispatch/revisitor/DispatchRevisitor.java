package dispatch.revisitor;

public interface DispatchRevisitor<Dispatch__AT, Dispatch__BT extends Dispatch__AT, Dispatch__CT extends Dispatch__AT, Dispatch__ContainerT, Dispatch__DT extends Dispatch__BT, Dispatch__ET extends Dispatch__BT, Dispatch__FT extends Dispatch__CT, Dispatch__GT extends Dispatch__CT> {
	Dispatch__AT dispatch__A(final dispatch.A it);
	Dispatch__BT dispatch__B(final dispatch.B it);
	Dispatch__CT dispatch__C(final dispatch.C it);
	Dispatch__ContainerT dispatch__Container(final dispatch.Container it);
	Dispatch__DT dispatch__D(final dispatch.D it);
	Dispatch__ET dispatch__E(final dispatch.E it);
	Dispatch__FT dispatch__F(final dispatch.F it);
	Dispatch__GT dispatch__G(final dispatch.G it);

	default Dispatch__AT $(final dispatch.A it) {
		if (it.getClass() == dispatch.impl.BImpl.class)
			return dispatch__B((dispatch.B) it);
		if (it.getClass() == dispatch.impl.CImpl.class)
			return dispatch__C((dispatch.C) it);
		if (it.getClass() == dispatch.impl.DImpl.class)
			return dispatch__D((dispatch.D) it);
		if (it.getClass() == dispatch.impl.EImpl.class)
			return dispatch__E((dispatch.E) it);
		if (it.getClass() == dispatch.impl.FImpl.class)
			return dispatch__F((dispatch.F) it);
		if (it.getClass() == dispatch.impl.GImpl.class)
			return dispatch__G((dispatch.G) it);
		return dispatch__A(it);
	}
	default Dispatch__BT $(final dispatch.B it) {
		if (it.getClass() == dispatch.impl.DImpl.class)
			return dispatch__D((dispatch.D) it);
		if (it.getClass() == dispatch.impl.EImpl.class)
			return dispatch__E((dispatch.E) it);
		return dispatch__B(it);
	}
	default Dispatch__CT $(final dispatch.C it) {
		if (it.getClass() == dispatch.impl.FImpl.class)
			return dispatch__F((dispatch.F) it);
		if (it.getClass() == dispatch.impl.GImpl.class)
			return dispatch__G((dispatch.G) it);
		return dispatch__C(it);
	}
	default Dispatch__ContainerT $(final dispatch.Container it) {
		return dispatch__Container(it);
	}
	default Dispatch__DT $(final dispatch.D it) {
		return dispatch__D(it);
	}
	default Dispatch__ET $(final dispatch.E it) {
		return dispatch__E(it);
	}
	default Dispatch__FT $(final dispatch.F it) {
		return dispatch__F(it);
	}
	default Dispatch__GT $(final dispatch.G it) {
		return dispatch__G(it);
	}
}
