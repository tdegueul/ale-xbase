package ale2.revisitor;

public interface Ale2Revisitor<Ale2__BT, Ale2__RBT> {
	Ale2__BT b(final ale2.B it);

	default Ale2__BT $(final ale2.B it) {
		return b(it);
	}
	Ale2__RBT $(final ale2.RB it);
}
