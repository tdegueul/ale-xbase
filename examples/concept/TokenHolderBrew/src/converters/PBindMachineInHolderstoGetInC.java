package converters;

import java.util.List;

import converters.lists.ListH;
import converters.lists.ListP;
import prodSys.Conveyor;
import tokenHolder.H;

public class PBindMachineInHolderstoGetInC {
	public void doInit() {

	}

	public List<H> convertReturn(List<Conveyor> inC) {
		return new ListH(inC);
	}
}
