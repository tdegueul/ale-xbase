package simplea.revisitor;

public interface SimpleaRevisitor<Simplea__AT, Simplea__BT> {
	Simplea__AT simplea__A(final simplea.A it);

	default Simplea__AT $(final simplea.A it) {
		return simplea__A(it);
	}
	Simplea__BT $(final simplea.B it);
}
