package fr.inria.diverse.ad.emfswitch.impl.operation.executable.activitynode;

import java.util.List;

import activitydiagram.ActivityEdge;
import activitydiagram.BooleanValue;
import activitydiagram.ControlFlow;
import activitydiagram.DecisionNode;
import activitydiagram.Token;
import activitydiagram.Value;
import fr.inria.diverse.ad.emfswitch.switches.ActivityEdgeVisitor;

public class DecisionNodeActivityNodeOperationImpl extends ControlNodeActivityNodeImpl {
	private final DecisionNode decisionNode;

	private final ActivityEdgeVisitor activityEdgeVisitor = ActivityEdgeVisitor.INSTANCE;

	public DecisionNodeActivityNodeOperationImpl(final DecisionNode decisionNode) {
		super(decisionNode);
		this.decisionNode = decisionNode;
	}

	@Override
	public void fire(final List<Token> tokens) {
		ActivityEdge selectedEdge = null;
		for (final ActivityEdge edge : this.decisionNode.getOutgoing()) {
			if (edge instanceof ControlFlow) {
				final ControlFlow controlFlow = (ControlFlow) edge;
				final Value guardValue = controlFlow.getGuard().getCurrentValue();
				if (guardValue instanceof BooleanValue) {
					final BooleanValue booleanValue = (BooleanValue) guardValue;
					if (booleanValue.isValue()) {
						selectedEdge = edge;
						break;
					}
				}
			}
		}

		if (selectedEdge != null) {
			this.addTokens(tokens);
			activityEdgeVisitor.doSwitch(selectedEdge).sendOffer(tokens);
		}

	}

	@Override
	public boolean isReady() {
		boolean ready = true;
		for (final ActivityEdge edge : this.decisionNode.getIncoming()) {
			if (!activityEdgeVisitor.doSwitch(edge).hasOffer()) {
				ready = false;
			}
		}
		return ready;
	}

}