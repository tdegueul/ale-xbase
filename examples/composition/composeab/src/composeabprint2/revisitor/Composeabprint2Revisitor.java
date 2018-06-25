package composeabprint2.revisitor;

public interface Composeabprint2Revisitor<Simplea__AT, Simplea__BT, Simpleb__B1T, Composeabprint2__BBindB1T extends Simplea__BT>
	extends simpleb.revisitor.SimplebRevisitor<Simpleb__B1T>,
		simplea.revisitor.SimpleaRevisitor<Simplea__AT, Simplea__BT> {
	Composeabprint2__BBindB1T composeabprint2__BBindB1(final composeabprint2.BBindB1 it);

	default Simplea__AT $(final simplea.A it) {
		return simplea__A(it);
	}
	default Simplea__BT $(final simplea.B it) {
		if (it.getClass() == composeabprint2.impl.BBindB1Impl.class)
			return composeabprint2__BBindB1((composeabprint2.BBindB1) it);
		return null;
	}
	default Simpleb__B1T $(final simpleb.B1 it) {
		return simpleb__B1(it);
	}
	default Composeabprint2__BBindB1T $(final composeabprint2.BBindB1 it) {
		return composeabprint2__BBindB1(it);
	}
}
