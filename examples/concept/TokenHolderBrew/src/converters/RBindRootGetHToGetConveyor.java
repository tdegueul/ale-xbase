package converters;

import java.util.List;

import converters.lists.ListH;
import converters.lists.ListP;
import prodSys.Conveyor;
import tokenHolder.H;

public class RBindRootGetHToGetConveyor {
	public void doInit() {
		// TODO Auto-generated method stub

	}

	public List<H> convertReturn(List<Conveyor> conveyor) {
		return new ListH(conveyor);
	}
}
