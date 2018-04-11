package converters;

import java.util.List;

import converters.lists.ListT;
import prodSys.Part;
import tokenHolder.T;

public class HBindConveyorGetTokensToParts {

	public void doInit() {

	}

	public List<T> convertReturn(final List<Part> parts) {
		//// if(parts.stream().filter(x -> x instanceof Pa))
		// return parts.stream().map(m -> {
		// final TBindPart delegator =
		//// ProdSysTokenHolderFactory.eINSTANCE.createTBindPart();
		// delegator.setDelegate(m);
		// return delegator;
		// }).collect(Collectors.toList());

		return new ListT(parts);
	}

}
