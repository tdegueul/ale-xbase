package fr.inria.diverse.ad.visitor.visitor;

import activitydiagram.ActivityEdge;
import activitydiagram.ActivityFinalNode;
import activitydiagram.ActivityNode;
import activitydiagram.DecisionNode;
import activitydiagram.ForkNode;
import activitydiagram.InitialNode;
import activitydiagram.JoinNode;
import activitydiagram.MergeNode;
import activitydiagram.OpaqueAction;
import activitydiagram.visitor.ActivityDiagramVisitorDefault;

public class ActivityNodeIsReadyVisitor extends ActivityDiagramVisitorDefault<Boolean> {


	
	ActivityEdgeHasOfferVisitor activityEdgeHasOfferVisitor2;
	
	private ActivityEdgeHasOfferVisitor getVisitor() {
		if(activityEdgeHasOfferVisitor2 == null) activityEdgeHasOfferVisitor2 = ActivityEdgeHasOfferVisitor.INSTANCE;
		return activityEdgeHasOfferVisitor2;
	}

	@Override
	public Boolean visitInitialNode(InitialNode initialNode, Object ctx) {
		return false;
	}

	@Override
	public Boolean visitActivityFinalNode(ActivityFinalNode activityFinalNode, Object ctx) {
		return activityFinalNode.isRunning() && this.hasOffers(activityFinalNode);
	}

	private boolean hasOffers(ActivityNode activityNode) {
		boolean hasOffer = true;
		for (final ActivityEdge edge : activityNode.getIncoming()) {
			if (!edge.accept(getVisitor(), null)) {
				hasOffer = false;
			}
		}
		return hasOffer;
	}

	@Override
	public Boolean visitOpaqueAction(OpaqueAction opaqueAction, Object ctx) {
		return opaqueAction.isRunning() && this.hasOffers(opaqueAction);
	}

	@Override
	public Boolean visitForkNode(ForkNode forkNode, Object ctx) {
		return forkNode.isRunning() && this.hasOffers(forkNode);
	}

	@Override
	public Boolean visitJoinNode(JoinNode joinNode, Object ctx) {
		boolean ready = true;
		for (final ActivityEdge edge : joinNode.getIncoming()) {
			if (!edge.accept(getVisitor(), null)) {
				ready = false;
			}
		}
		return ready;
	}

	@Override
	public Boolean visitMergeNode(MergeNode mergeNode, Object ctx) {
		return mergeNode.isRunning() && this.hasOffersMergeNode(mergeNode);
	}

	private boolean hasOffersMergeNode(MergeNode mergeNode) {
		for (final ActivityEdge edge : mergeNode.getIncoming()) {
			if (edge.accept(getVisitor(), null)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Boolean visitDecisionNode(DecisionNode decisionNode, Object ctx) {
		boolean ready = true;
		for (final ActivityEdge edge : decisionNode.getIncoming()) {
			if (!edge.accept(getVisitor(), null)) {
				ready = false;
			}
		}
		return ready;
	}

}
