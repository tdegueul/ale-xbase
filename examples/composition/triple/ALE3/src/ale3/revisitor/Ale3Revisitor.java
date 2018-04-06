package ale3.revisitor;

public interface Ale3Revisitor<Ale3__C1T, Ale3__C2T> {
	Ale3__C1T c1(final ale3.C1 it);
	Ale3__C2T c2(final ale3.C2 it);

	default Ale3__C1T $(final ale3.C1 it) {
		return c1(it);
	}
	default Ale3__C2T $(final ale3.C2 it) {
		return c2(it);
	}
}
