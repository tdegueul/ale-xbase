package converters;

import java.util.List;

import converters.lists.ListH;
import prodSys.Conveyor;
import tokenHolder.H;

public class PBindMachineOutHolderToGetOutC {

	public void doInit() {
		// TODO Auto-generated method stub

	}

	public List<H> convertReturn(List<Conveyor> outC) {
		return new ListH(outC);
	}

}
