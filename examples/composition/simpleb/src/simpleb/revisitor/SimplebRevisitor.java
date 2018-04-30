package simpleb.revisitor;

public interface SimplebRevisitor<Simpleb__B1T> {
	Simpleb__B1T simpleb__B1(final simpleb.B1 it);

	default Simpleb__B1T $(final simpleb.B1 it) {
		return simpleb__B1(it);
	}
}
