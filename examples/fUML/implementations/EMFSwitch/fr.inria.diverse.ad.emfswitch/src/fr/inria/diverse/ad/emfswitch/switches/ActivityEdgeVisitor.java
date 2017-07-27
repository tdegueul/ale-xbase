package fr.inria.diverse.ad.emfswitch.switches;

import activitydiagram.ControlFlow;
import activitydiagram.util.ActivitydiagramSwitch;
import fr.inria.diverse.ad.emfswitch.impl.operation.executable.activityedge.ControlFlowActivityEdgeOperationImpl;
import fr.inria.diverse.ad.emfswitch.operation.ActivityEdgeOperation;

public class ActivityEdgeVisitor extends ActivitydiagramSwitch<ActivityEdgeOperation> {
	
	private ActivityEdgeVisitor() {
		
	}
	
	public final static ActivityEdgeVisitor INSTANCE = new ActivityEdgeVisitor();

	@Override
	public ActivityEdgeOperation caseControlFlow(ControlFlow object) {
		return new ControlFlowActivityEdgeOperationImpl(object);
	}

}
