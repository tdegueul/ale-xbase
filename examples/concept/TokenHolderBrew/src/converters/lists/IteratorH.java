package converters.lists;

import java.util.Iterator;

import prodSys.Conveyor;
import prodSysTokenHolder.HBindConveyor;
import prodSysTokenHolder.ProdSysTokenHolderFactory;
import tokenHolder.H;

public class IteratorH implements Iterator<H> {
	/**
	 * 
	 */
	private final Iterator<Conveyor> itt;

	IteratorH(Iterator<Conveyor> itt) {
		this.itt = itt;
	}

	@Override
	public boolean hasNext() {
		return itt.hasNext();
	}

	@Override
	public H next() {
		HBindConveyor createHBindConveyor = ProdSysTokenHolderFactory.eINSTANCE.createHBindConveyor();
		createHBindConveyor.setDelegate(itt.next());
		return createHBindConveyor;
	}
}