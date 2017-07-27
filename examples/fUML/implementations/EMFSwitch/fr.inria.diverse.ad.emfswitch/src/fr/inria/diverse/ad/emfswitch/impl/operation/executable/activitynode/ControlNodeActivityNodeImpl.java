package fr.inria.diverse.ad.emfswitch.impl.operation.executable.activitynode;

import java.util.List;

import activitydiagram.ControlNode;
import activitydiagram.Token;

public abstract class ControlNodeActivityNodeImpl extends ActivityNodeActivityNodeOperationImpl {

	public ControlNodeActivityNodeImpl(final ControlNode joinNode) {
		super(joinNode);
	}

	@Override
	public void fire(final List<Token> tokens) {
		this.addTokens(tokens);
		this.sendOffers(tokens);
	}

	@Override
	public boolean isReady() {
		return super.isReady() && this.hasOffers();
	}

}
