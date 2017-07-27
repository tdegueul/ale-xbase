package fr.inria.diverse.ad.visitor.visitor;

import activitydiagram.Activity;
import activitydiagram.ActivityNode;
import activitydiagram.visitor.ActivityDiagramVisitorDefault;

public class ActivityTerminalVisitor extends ActivityDiagramVisitorDefault<Void> {

	ActivityNodeTerminateVisitor activityNodeTerminateVisitor2;
	
	private ActivityNodeTerminateVisitor activityNodeTerminateVisitor() {
		if(activityNodeTerminateVisitor2 == null) activityNodeTerminateVisitor2 = ActivityNodeTerminateVisitor.INSTANCe;
		return activityNodeTerminateVisitor2;
	}
	
	
	private ActivityTerminalVisitor() {}
	
	public final static ActivityTerminalVisitor INSTANCE = new ActivityTerminalVisitor();
	

	@Override
	public Void visitActivity(Activity activity, Object ctx) {
		for (final ActivityNode node : activity.getNodes()) {
			node.accept(activityNodeTerminateVisitor(), null);
		}
		return null;
	}

}
