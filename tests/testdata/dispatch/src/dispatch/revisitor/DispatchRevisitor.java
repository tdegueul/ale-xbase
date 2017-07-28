package dispatch.revisitor;

public interface DispatchRevisitor<Dispatch__AT, Dispatch__BT extends Dispatch__AT, Dispatch__CT extends Dispatch__AT, Dispatch__ContainerT, Dispatch__DT extends Dispatch__BT, Dispatch__ET extends Dispatch__BT, Dispatch__FT extends Dispatch__CT, Dispatch__GT extends Dispatch__CT> {
	Dispatch__AT a(final dispatch.A it);
	Dispatch__BT b(final dispatch.B it);
	Dispatch__CT c(final dispatch.C it);
	Dispatch__ContainerT container(final dispatch.Container it);
	Dispatch__DT d(final dispatch.D it);
	Dispatch__ET e(final dispatch.E it);
	Dispatch__FT f(final dispatch.F it);
	Dispatch__GT g(final dispatch.G it);

	default Dispatch__AT $(final dispatch.A it) {
		if (it.getClass() == dispatch.impl.BImpl.class)
			return b((dispatch.B) it);
		if (it.getClass() == dispatch.impl.CImpl.class)
			return c((dispatch.C) it);
		if (it.getClass() == dispatch.impl.DImpl.class)
			return d((dispatch.D) it);
		if (it.getClass() == dispatch.impl.EImpl.class)
			return e((dispatch.E) it);
		if (it.getClass() == dispatch.impl.FImpl.class)
			return f((dispatch.F) it);
		if (it.getClass() == dispatch.impl.GImpl.class)
			return g((dispatch.G) it);
		return a(it);
	}
	default Dispatch__BT $(final dispatch.B it) {
		if (it.getClass() == dispatch.impl.DImpl.class)
			return d((dispatch.D) it);
		if (it.getClass() == dispatch.impl.EImpl.class)
			return e((dispatch.E) it);
		return b(it);
	}
	default Dispatch__CT $(final dispatch.C it) {
		if (it.getClass() == dispatch.impl.FImpl.class)
			return f((dispatch.F) it);
		if (it.getClass() == dispatch.impl.GImpl.class)
			return g((dispatch.G) it);
		return c(it);
	}
	default Dispatch__ContainerT $(final dispatch.Container it) {
		return container(it);
	}
	default Dispatch__DT $(final dispatch.D it) {
		return d(it);
	}
	default Dispatch__ET $(final dispatch.E it) {
		return e(it);
	}
	default Dispatch__FT $(final dispatch.F it) {
		return f(it);
	}
	default Dispatch__GT $(final dispatch.G it) {
		return g(it);
	}
}
