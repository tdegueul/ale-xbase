package composeabprint.revisitor;

public interface ComposeabprintRevisitor<Simplea__AT, Simplea__BT, Simpleb__B1T, Composeabprint__BBindT extends Simplea__BT>
	extends simplea.revisitor.SimpleaRevisitor<Simplea__AT, Simplea__BT>,
		simpleb.revisitor.SimplebRevisitor<Simpleb__B1T> {
	Composeabprint__BBindT bBind(final composeabprint.BBind it);

	default Simplea__AT $(final simplea.A it) {
		return a(it);
	}
	Simplea__BT $(final simplea.B it);
	default Simpleb__B1T $(final simpleb.B1 it) {
		return b1(it);
	}
	default Composeabprint__BBindT $(final composeabprint.BBind it) {
		return bBind(it);
	}
}
