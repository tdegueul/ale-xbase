package ale1.revisitor;

public interface Ale1Revisitor<Ale1__A1T, Ale1__RA1T, Ale1__RA2T> {
	Ale1__A1T a1(final ale1.A1 it);

	default Ale1__A1T $(final ale1.A1 it) {
		return a1(it);
	}
	Ale1__RA1T $(final ale1.RA1 it);
	Ale1__RA2T $(final ale1.RA2 it);
}
