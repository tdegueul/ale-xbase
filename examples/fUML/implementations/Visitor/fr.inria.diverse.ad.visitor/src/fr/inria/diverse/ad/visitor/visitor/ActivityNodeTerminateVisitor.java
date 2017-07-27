package fr.inria.diverse.ad.visitor.visitor;

import activitydiagram.ActivityFinalNode;
import activitydiagram.DecisionNode;
import activitydiagram.ForkNode;
import activitydiagram.InitialNode;
import activitydiagram.JoinNode;
import activitydiagram.MergeNode;
import activitydiagram.OpaqueAction;
import activitydiagram.visitor.ActivityDiagramVisitorDefault;

public class ActivityNodeTerminateVisitor extends ActivityDiagramVisitorDefault<Void> {

	private ActivityNodeTerminateVisitor() {}
	
	public final static ActivityNodeTerminateVisitor INSTANCe = new ActivityNodeTerminateVisitor();
	
	@Override
	public Void visitInitialNode(InitialNode initialNode, Object ctx) {
		initialNode.setRunning(false);
		return null;
	}

	@Override
	public Void visitActivityFinalNode(ActivityFinalNode activityFinalNode, Object ctx) {
		activityFinalNode.setRunning(false);
		return null;
	}

	@Override
	public Void visitOpaqueAction(OpaqueAction opaqueAction, Object ctx) {
		opaqueAction.setRunning(false);
		return null;
	}

	@Override
	public Void visitForkNode(ForkNode forkNode, Object ctx) {
		forkNode.setRunning(false);
		return null;
	}

	@Override
	public Void visitJoinNode(JoinNode joinNode, Object ctx) {
		joinNode.setRunning(false);
		return null;
	}

	@Override
	public Void visitMergeNode(MergeNode mergeNode, Object ctx) {
		mergeNode.setRunning(false);
		return null;
	}

	@Override
	public Void visitDecisionNode(DecisionNode decisionNode, Object ctx) {
		decisionNode.setRunning(false);
		return null;
	}
	
	
	
	

}
