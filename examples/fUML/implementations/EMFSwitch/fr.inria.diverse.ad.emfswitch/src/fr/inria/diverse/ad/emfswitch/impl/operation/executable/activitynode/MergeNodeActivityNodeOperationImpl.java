package fr.inria.diverse.ad.emfswitch.impl.operation.executable.activitynode;

import activitydiagram.ActivityEdge;
import activitydiagram.MergeNode;
import fr.inria.diverse.ad.emfswitch.switches.ActivityEdgeVisitor;

public class MergeNodeActivityNodeOperationImpl extends ControlNodeActivityNodeImpl {

	private final MergeNode mergeNode;

	private final ActivityEdgeVisitor activityEdgeVisitor = ActivityEdgeVisitor.INSTANCE;

	public MergeNodeActivityNodeOperationImpl(final MergeNode mergeNode) {
		super(mergeNode);
		this.mergeNode = mergeNode;
	}

	@Override
	public boolean hasOffers() {
		for (final ActivityEdge edge : this.mergeNode.getIncoming()) {
			if (activityEdgeVisitor.doSwitch(edge).hasOffer()) {
				return true;
			}
		}
		return false;
	}

}
