package fr.inria.diverse.ad.emfswitch.impl.operation.executable.activitynode;

import java.util.ArrayList;
import java.util.List;

import activitydiagram.Action;
import activitydiagram.ActivityEdge;
import activitydiagram.ActivitydiagramFactory;
import activitydiagram.Token;
import fr.inria.diverse.ad.emfswitch.switches.ActivityEdgeVisitor;

public abstract class ActionActivityNodeOperationImpl extends ExecutableNodeActivityNodeImpl {

	 
	
	private final Action action;
	private final ActivityEdgeVisitor activityEdgeVisitor = ActivityEdgeVisitor.INSTANCE;

	public ActionActivityNodeOperationImpl(final Action action) {
		super(action);
		this.action = action;
	}

	@Override
	public void fire(final List<Token> tokens) {
		this.doAction();
		this.sendOffers();
	}

	abstract void doAction();

	public void sendOffers() {
		if (this.action.getOutgoing().size() > 0) {
			final List<Token> tokens = new ArrayList<Token>();
			tokens.add(ActivitydiagramFactory.eINSTANCE.createControlToken());
			this.addTokens(tokens);
			ActivityEdge activityEdge = this.action.getOutgoing().get(0);
			activityEdgeVisitor.doSwitch(activityEdge).sendOffer(tokens);
		}
	}

	@Override
	public boolean isReady() {
		return super.isReady() && this.hasOffers();
	}

}
