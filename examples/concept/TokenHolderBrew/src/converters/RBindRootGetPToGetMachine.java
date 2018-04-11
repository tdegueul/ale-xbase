package converters;

import java.util.List;
import java.util.stream.Collectors;

import converters.lists.ListP;
import prodSys.Machine;
import tokenHolder.H;
import tokenHolder.P;

public class RBindRootGetPToGetMachine {
	public void doInit() {
	}

	public List<P> convertReturn(final List<Machine> machine) {
		return new ListP(machine);
	}
}
