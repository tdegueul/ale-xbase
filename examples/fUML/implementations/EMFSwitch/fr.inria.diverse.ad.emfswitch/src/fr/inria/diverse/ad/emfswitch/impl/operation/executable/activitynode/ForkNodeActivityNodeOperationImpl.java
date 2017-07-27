package fr.inria.diverse.ad.emfswitch.impl.operation.executable.activitynode;

import java.util.ArrayList;
import java.util.List;

import activitydiagram.ActivitydiagramFactory;
import activitydiagram.ForkNode;
import activitydiagram.ForkedToken;
import activitydiagram.Token;

public class ForkNodeActivityNodeOperationImpl extends ControlNodeActivityNodeImpl {
	private final ForkNode forkNode;

	public ForkNodeActivityNodeOperationImpl(final ForkNode forkNode) {
		super(forkNode);
		this.forkNode = forkNode;
	}

	@Override
	public void fire(final List<Token> tokens) {
		final List<Token> forkedTokens = new ArrayList<Token>();
		for (final Token token : tokens) {
			final ForkedToken forkedToken = ActivitydiagramFactory.eINSTANCE.createForkedToken();
			forkedToken.setBaseToken(token);
			forkedToken.setRemainingOffersCount(this.forkNode.getOutgoing().size());
			forkedTokens.add(forkedToken);
		}
		this.addTokens(forkedTokens);
		this.sendOffers(forkedTokens);

	}
}