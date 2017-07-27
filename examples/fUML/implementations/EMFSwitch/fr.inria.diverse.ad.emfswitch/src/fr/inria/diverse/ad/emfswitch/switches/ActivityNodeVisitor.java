package fr.inria.diverse.ad.emfswitch.switches;

import activitydiagram.ActivityFinalNode;
import activitydiagram.DecisionNode;
import activitydiagram.ForkNode;
import activitydiagram.InitialNode;
import activitydiagram.JoinNode;
import activitydiagram.MergeNode;
import activitydiagram.OpaqueAction;
import activitydiagram.util.ActivitydiagramSwitch;
import fr.inria.diverse.ad.emfswitch.impl.operation.executable.activitynode.ActivityFinalNodeActivityNodeOperationImpl;
import fr.inria.diverse.ad.emfswitch.impl.operation.executable.activitynode.DecisionNodeActivityNodeOperationImpl;
import fr.inria.diverse.ad.emfswitch.impl.operation.executable.activitynode.ForkNodeActivityNodeOperationImpl;
import fr.inria.diverse.ad.emfswitch.impl.operation.executable.activitynode.InitialNodeActivityNodeOperationImpl;
import fr.inria.diverse.ad.emfswitch.impl.operation.executable.activitynode.JoinNodeActivityNodeOperationImpl;
import fr.inria.diverse.ad.emfswitch.impl.operation.executable.activitynode.MergeNodeActivityNodeOperationImpl;
import fr.inria.diverse.ad.emfswitch.impl.operation.executable.activitynode.OpageActionActivityNodeOperationImpl;
import fr.inria.diverse.ad.emfswitch.operation.ActivityNodeOperation;

public class ActivityNodeVisitor extends ActivitydiagramSwitch<ActivityNodeOperation> {

	
	private ActivityNodeVisitor() {}
	
	public final static ActivityNodeVisitor INSTANCE = new ActivityNodeVisitor();
	
	@Override
	public ActivityNodeOperation caseActivityFinalNode(ActivityFinalNode activityFinalNode) {
		return new ActivityFinalNodeActivityNodeOperationImpl(activityFinalNode);
	}

	@Override
	public ActivityNodeOperation caseDecisionNode(DecisionNode object) {
		return new DecisionNodeActivityNodeOperationImpl(object);
	}

	@Override
	public ActivityNodeOperation caseForkNode(ForkNode object) {
		return new ForkNodeActivityNodeOperationImpl(object);
	}

	@Override
	public ActivityNodeOperation caseInitialNode(InitialNode object) {
		return new InitialNodeActivityNodeOperationImpl(object);
	}

	@Override
	public ActivityNodeOperation caseJoinNode(JoinNode object) {
		return new JoinNodeActivityNodeOperationImpl(object);
	}

	@Override
	public ActivityNodeOperation caseMergeNode(MergeNode object) {
		return new MergeNodeActivityNodeOperationImpl(object);
	}

	@Override
	public ActivityNodeOperation caseOpaqueAction(OpaqueAction object) {
		return new OpageActionActivityNodeOperationImpl(object);
	}

}
