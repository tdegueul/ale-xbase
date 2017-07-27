package fr.inria.diverse.ad.visitor.visitor;

import activitydiagram.DecisionNode;
import activitydiagram.ForkNode;
import activitydiagram.InitialNode;
import activitydiagram.JoinNode;
import activitydiagram.MergeNode;
import activitydiagram.OpaqueAction;
import activitydiagram.visitor.ActivityDiagramVisitorDefault;

public class ActivityNodeRemoveTokenVisitor extends ActivityDiagramVisitorDefault<Void> {
	
	private ActivityNodeRemoveTokenVisitor() {
		
	}
	
	
	public final static ActivityNodeRemoveTokenVisitor INSTANCE = new ActivityNodeRemoveTokenVisitor();

	@Override
	public Void visitInitialNode(final InitialNode initialNode, Object ctx) {
		initialNode.getHeldTokens().remove(ctx);
		return null;
	}

	@Override
	public Void visitOpaqueAction(final OpaqueAction opaqueAction, Object ctx) {
		opaqueAction.getHeldTokens().remove(ctx);
		return null;
	}

	@Override
	public Void visitForkNode(final ForkNode forkNode, Object ctx) {
		forkNode.getHeldTokens().remove(ctx);
		return null;
	}

	@Override
	public Void visitJoinNode(final JoinNode joinNode, Object ctx) {
		joinNode.getHeldTokens().remove(ctx);
		return null;
	}

	@Override
	public Void visitDecisionNode(final DecisionNode decisionNode, Object ctx) {
		decisionNode.getHeldTokens().remove(ctx);
		return null;
	}

	@Override
	public Void visitMergeNode(MergeNode mergeNode, Object ctx) {
		mergeNode.getHeldTokens().remove(ctx);
		return null;
	}

}
