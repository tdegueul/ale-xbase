package fr.inria.diverse.ad.visitor.visitor;

import activitydiagram.ActivityFinalNode;
import activitydiagram.DecisionNode;
import activitydiagram.ForkNode;
import activitydiagram.InitialNode;
import activitydiagram.JoinNode;
import activitydiagram.MergeNode;
import activitydiagram.OpaqueAction;
import activitydiagram.visitor.ActivityDiagramVisitorDefault;

public class ActivityNodeRunVisitor extends ActivityDiagramVisitorDefault<Void> {

	private ActivityNodeRunVisitor() {
		
	}
	
	public final static ActivityNodeRunVisitor INSTANCE = new ActivityNodeRunVisitor();
	
	@Override
	public Void visitInitialNode(InitialNode initialNode, Object ctx) {
		initialNode.setRunning(true);
		return null;
	}

	@Override
	public Void visitActivityFinalNode(ActivityFinalNode activityFinalNode, Object ctx) {
		activityFinalNode.setRunning(true);
		return null;
	}

	@Override
	public Void visitOpaqueAction(OpaqueAction opaqueAction, Object ctx) {
		opaqueAction.setRunning(true);
		return null;
	}

	@Override
	public Void visitForkNode(ForkNode forkNode, Object ctx) {
		forkNode.setRunning(true);
		return null;
	}

	@Override
	public Void visitJoinNode(JoinNode joinNode, Object ctx) {
		joinNode.setRunning(true);
		return null;
	}

	@Override
	public Void visitMergeNode(MergeNode mergeNode, Object ctx) {
		mergeNode.setRunning(true);
		return null;
	}

	@Override
	public Void visitDecisionNode(DecisionNode decisionNode, Object ctx) {
		decisionNode.setRunning(true);
		return null;
	}

}
