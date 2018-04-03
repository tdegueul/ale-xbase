import gfsm.Guard;
import gfsmprint.revisitor.GfsmprintRevisitor;
import gfsmprint.revisitor.operations.GuardOperation;

public class GFSMMain {
	public static void main(String[] args) {
		GfsmprintRevisitor printrev = new GfsmprintRevisitor() {

			@Override
			public GuardOperation $(Guard it) {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}
}
