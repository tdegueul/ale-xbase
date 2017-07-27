package fr.inria.diverse.ad.visitor.visitor;

import activitydiagram.ActivityNode;
import activitydiagram.ControlToken;
import activitydiagram.ForkedToken;
import activitydiagram.Token;
import activitydiagram.visitor.ActivityDiagramVisitorDefault;

public class TokenTransfertVisitor extends ActivityDiagramVisitorDefault<Token> {

	private TokenTransfertVisitor() {
	}

	public final static TokenTransfertVisitor INSTANCe = new TokenTransfertVisitor();

	private ActivityNodeRemoveTokenVisitor activityNodeRemoveTokenVisitor2;

	private ActivityNodeRemoveTokenVisitor activityNodeRemoveTokenVisitor() {
		if (activityNodeRemoveTokenVisitor2 == null)
			activityNodeRemoveTokenVisitor2 = ActivityNodeRemoveTokenVisitor.INSTANCE;
		return activityNodeRemoveTokenVisitor2;
	}

	@Override
	public Token visitControlToken(ControlToken controlToken, Object ctx) {

		ActivityNode activityNode = (ActivityNode) ctx;
		if (controlToken.getHolder() != null) {
			this.withdrawControlToken(controlToken);
		}
		controlToken.setHolder(activityNode);
		return controlToken;
	}

	private void withdrawControlToken(Token controlToken) {
		if (!this.isWithdrawnControlToken(controlToken)) {
			controlToken.getHolder().accept(activityNodeRemoveTokenVisitor(), controlToken);
			controlToken.setHolder(null);
		}

	}

	private boolean isWithdrawnControlToken(Token controlToken) {
		return controlToken.getHolder() == null;
	}

	@Override
	public Token visitForkedToken(ForkedToken forkedToken, Object ctx) {
		ActivityNode activityNode = (ActivityNode) ctx;
		if (forkedToken.getHolder() != null) {
			this.withdrawForkedToken(forkedToken);
		}
		forkedToken.setHolder(activityNode);
		return forkedToken;

	}

	private void withdrawForkedToken(ForkedToken forkedToken) {
		if (!this.isWithdrawnForkedToken(forkedToken)) {
			final ActivityNode holder = forkedToken.getHolder();
			holder.accept(activityNodeRemoveTokenVisitor(), forkedToken);
			forkedToken.setHolder(null);
		}

	}

	private boolean isWithdrawnForkedToken(ForkedToken forkedToken) {
		return forkedToken.getHolder() == null;
	}

}
