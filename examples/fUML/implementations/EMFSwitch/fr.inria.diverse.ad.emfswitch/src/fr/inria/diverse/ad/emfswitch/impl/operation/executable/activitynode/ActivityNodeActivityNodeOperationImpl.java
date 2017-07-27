package fr.inria.diverse.ad.emfswitch.impl.operation.executable.activitynode;

import java.util.ArrayList;
import java.util.List;

import activitydiagram.ActivityEdge;
import activitydiagram.ActivityNode;
import activitydiagram.Token;
import fr.inria.diverse.ad.emfswitch.operation.ActivityEdgeOperation;
import fr.inria.diverse.ad.emfswitch.operation.ActivityNodeOperation;
import fr.inria.diverse.ad.emfswitch.operation.TokenOperation;
import fr.inria.diverse.ad.emfswitch.switches.ActivityEdgeVisitor;
import fr.inria.diverse.ad.emfswitch.switches.TokenVisitor;

public abstract class ActivityNodeActivityNodeOperationImpl implements ActivityNodeOperation {

	private final ActivityNode activityNode;

	private final ActivityEdgeVisitor activityEdgeVisitor = ActivityEdgeVisitor.INSTANCE;
	private final TokenVisitor tokenVisitor = TokenVisitor.INSTANCE;

	public ActivityNodeActivityNodeOperationImpl(final ActivityNode activityNode) {
		this.activityNode = activityNode;
	}

	@Override
	public void run() {
		this.activityNode.setRunning(true);
	}

	@Override
	public boolean isRunning() {
		return this.activityNode.isRunning();
	}

	@Override
	public void terminate() {
		this.activityNode.setRunning(false);
	}

	@Override
	public boolean isReady() {
		return this.isRunning();
	}

	@Override
	public void sendOffers(final List<Token> tokens) {
		for (final ActivityEdge edge : this.activityNode.getOutgoing()) {
			activityEdgeVisitor.doSwitch(edge).sendOffer(tokens);
		}
	}

	@Override
	public List<Token> takeOfferdTokens() {
		final List<Token> allTokens = new ArrayList<Token>();
		for (final ActivityEdge edge : this.activityNode.getIncoming()) {
			final ActivityEdgeOperation activityEdgeOperation = activityEdgeVisitor.doSwitch(edge);
			final List<Token> tokens = activityEdgeOperation.takeOfferedTokens();
			for (final Token token : tokens) {
				tokenVisitor.doSwitch(token).withdraw();
			}
			allTokens.addAll(tokens);
		}
		return allTokens;
	}

	@Override
	public void addTokens(final List<Token> tokens) {
		for (final Token token : tokens) {
			final TokenOperation nodeOperation = tokenVisitor.doSwitch(token);
			final Token transferredToken = nodeOperation.transfer(this.activityNode);
			this.activityNode.getHeldTokens().add(transferredToken);
		}
	}

	@Override
	public boolean hasOffers() {
		boolean hasOffer = true;
		for (final ActivityEdge edge : this.activityNode.getIncoming()) {
			if (!activityEdgeVisitor.doSwitch(edge).hasOffer()) {
				hasOffer = false;
			}
		}
		return hasOffer;
	}

	@Override
	public void removeToken(final Token token) {
		this.activityNode.getHeldTokens().remove(token);
	}

}
