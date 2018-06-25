package composeabprint.revisitor;

public interface ComposeabprintRevisitor<Simplea__AT, Simplea__BT, Simpleb__B1T, Composeabprint__BBindB1T extends Simplea__BT>
	extends simpleb.revisitor.SimplebRevisitor<Simpleb__B1T>,
		simplea.revisitor.SimpleaRevisitor<Simplea__AT, Simplea__BT> {
	Simplea__AT simplea__A(final simplea.A it);
	Simpleb__B1T simpleb__B1(final simpleb.B1 it);
	Composeabprint__BBindB1T composeabprint__BBindB1(final composeabprint.BBindB1 it);

	default Simplea__AT $(final simplea.A it) {
		return simplea__A(it);
	}
	default Simplea__BT $(final simplea.B it) {
		if (it.getClass() == composeabprint.impl.BBindB1Impl.class)
			return composeabprint__BBindB1((composeabprint.BBindB1) it);
		return null;
	}
	default Simpleb__B1T $(final simpleb.B1 it) {
		return simpleb__B1(it);
	}
	default Composeabprint__BBindB1T $(final composeabprint.BBindB1 it) {
		return composeabprint__BBindB1(it);
	}
}
