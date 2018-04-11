package converters;

import prodSys.Part;
import prodSysTokenHolder.ProdSysTokenHolderFactory;
import prodSysTokenHolder.TBindPart;
import tokenHolder.T;

public class PBindMachineCreateTokenToCreateToken {
	public void doInit() {
		// TODO Auto-generated method stub

	}

	public T convertReturn(final Part createToken) {
		final TBindPart createTBindPart = ProdSysTokenHolderFactory.eINSTANCE.createTBindPart();
		createTBindPart.setDelegate(createToken);
		return createTBindPart;
	}
}
