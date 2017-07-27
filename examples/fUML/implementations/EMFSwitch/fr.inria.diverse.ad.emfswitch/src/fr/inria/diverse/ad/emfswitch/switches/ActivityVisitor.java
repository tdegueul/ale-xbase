package fr.inria.diverse.ad.emfswitch.switches;

import activitydiagram.Activity;
import activitydiagram.util.ActivitydiagramSwitch;
import fr.inria.diverse.ad.emfswitch.impl.operation.executable.activity.ActivityActivityOperationImpl;
import fr.inria.diverse.ad.emfswitch.operation.ActivityOperation;

public class ActivityVisitor extends ActivitydiagramSwitch<ActivityOperation> {
	
	private ActivityVisitor() {}
	
	public final static ActivityVisitor INSTANCE = new ActivityVisitor();

	@Override
	public ActivityOperation caseActivity(final Activity activity) {
		return new ActivityActivityOperationImpl(activity);
	}

}
