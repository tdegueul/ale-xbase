
import boolexp.BoolexpFactory;
import boolexp.Or;
import evalgfsmboolexp.revisitor.impl.EvalgfsmboolexpRevisitor;
import gfsm.GfsmFactory;
import gfsm.Machine;
import gfsm.State;
import gfsm.Transition;
import gfsm.dyn.Context;
import printgfsmboolexp.GuardBind;
import printgfsmboolexp.PrintgfsmboolexpFactory;

public class GFSMBoolExpMain {
	public static void main(final String[] args) {
		final printgfsmboolexp.revisitor.impl.PrintgfsmboolexpRevisitor r = new printgfsmboolexp.revisitor.impl.PrintgfsmboolexpRevisitor() {
		};
		final evalgfsmboolexp.revisitor.impl.EvalgfsmboolexpRevisitor evalr = new EvalgfsmboolexpRevisitor() {
		};

		final GfsmFactory gfsmFactory = GfsmFactory.eINSTANCE;
		final PrintgfsmboolexpFactory printGFSMExpBoolFactory = PrintgfsmboolexpFactory.eINSTANCE;
		final BoolexpFactory boolexpFactory = BoolexpFactory.eINSTANCE;

		final Machine machine = gfsmFactory.createMachine();
		machine.setName("DOOR");
		final State stateOpened = gfsmFactory.createState();
		stateOpened.setName("OPENED");
		final State stateClosed = gfsmFactory.createInitialState();
		stateClosed.setName("CLOSED");
		machine.getStates().add(stateOpened);
		machine.getStates().add(stateClosed);

		final Transition transitionOpen = gfsmFactory.createTransition();
		transitionOpen.setEvent("open");
		transitionOpen.setSource(stateClosed);
		transitionOpen.setTarget(stateOpened);
		final GuardBind guardBindOpen = printGFSMExpBoolFactory.createGuardBind();

		final Or or = boolexpFactory.createOr();
		or.setLhs(boolexpFactory.createFals());
		or.setRhs(boolexpFactory.createTru());

		guardBindOpen.setDelegate(or);
		transitionOpen.setGuard(guardBindOpen);

		final Transition transitionClose = gfsmFactory.createTransition();
		transitionClose.setEvent("close");
		transitionClose.setSource(stateOpened);
		transitionClose.setTarget(stateClosed);

		machine.getTransitions().add(transitionOpen);
		machine.getTransitions().add(transitionClose);
		System.out.println(r.$(machine).print());
		final Context ctx = new Context();
		evalr.$(machine).execute(new String[] { "open", "close", "open" }, ctx);
	}
}
