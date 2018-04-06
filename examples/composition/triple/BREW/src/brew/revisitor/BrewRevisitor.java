package brew.revisitor;

public interface BrewRevisitor<Ale1__A1T, Ale2__BT, Ale3__C1T, Ale3__C2T, Ale1__RA1T, Brew__RA1BindBT extends Ale1__RA1T, Ale1__RA2T, Brew__RA2BindC1T extends Ale1__RA2T, Ale2__RBT, Brew__RBBindC1T extends Ale2__RBT, Brew__RBBindC2T extends Ale2__RBT>
	extends ale3.revisitor.Ale3Revisitor<Ale3__C1T, Ale3__C2T>,
		ale2.revisitor.Ale2Revisitor<Ale2__BT, Ale2__RBT>,
		ale1.revisitor.Ale1Revisitor<Ale1__A1T, Ale1__RA1T, Ale1__RA2T> {
	Brew__RA1BindBT rA1BindB(final brew.RA1BindB it);
	Brew__RA2BindC1T rA2BindC1(final brew.RA2BindC1 it);
	Brew__RBBindC1T rBBindC1(final brew.RBBindC1 it);
	Brew__RBBindC2T rBBindC2(final brew.RBBindC2 it);

	default Ale1__A1T $(final ale1.A1 it) {
		return a1(it);
	}
	default Ale2__BT $(final ale2.B it) {
		return b(it);
	}
	default Ale3__C1T $(final ale3.C1 it) {
		return c1(it);
	}
	default Ale3__C2T $(final ale3.C2 it) {
		return c2(it);
	}
	default Ale1__RA1T $(final ale1.RA1 it) {
		if (it.getClass() == brew.impl.RA1BindBImpl.class)
			return rA1BindB((brew.RA1BindB) it);
		return null;
	}
	default Brew__RA1BindBT $(final brew.RA1BindB it) {
		return rA1BindB(it);
	}
	default Ale1__RA2T $(final ale1.RA2 it) {
		if (it.getClass() == brew.impl.RA2BindC1Impl.class)
			return rA2BindC1((brew.RA2BindC1) it);
		return null;
	}
	default Brew__RA2BindC1T $(final brew.RA2BindC1 it) {
		return rA2BindC1(it);
	}
	default Ale2__RBT $(final ale2.RB it) {
		if (it.getClass() == brew.impl.RBBindC1Impl.class)
			return rBBindC1((brew.RBBindC1) it);
		if (it.getClass() == brew.impl.RBBindC2Impl.class)
			return rBBindC2((brew.RBBindC2) it);
		return null;
	}
	default Brew__RBBindC1T $(final brew.RBBindC1 it) {
		return rBBindC1(it);
	}
	default Brew__RBBindC2T $(final brew.RBBindC2 it) {
		return rBBindC2(it);
	}
}
