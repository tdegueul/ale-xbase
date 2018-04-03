package simplea.revisitor;

public interface SimpleaRevisitor<Simplea__AT, Simplea__BT> {
	Simplea__AT a(final simplea.A it);

	default Simplea__AT $(final simplea.A it) {
		return a(it);
	}
	Simplea__BT $(final simplea.B it);
}
