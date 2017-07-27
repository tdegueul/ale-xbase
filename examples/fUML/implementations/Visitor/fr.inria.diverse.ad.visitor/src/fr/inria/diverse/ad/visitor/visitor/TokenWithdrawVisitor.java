package fr.inria.diverse.ad.visitor.visitor;

import org.eclipse.emf.ecore.InternalEObject;

import activitydiagram.ActivityNode;
import activitydiagram.ControlToken;
import activitydiagram.ForkedToken;
import activitydiagram.Token;
import activitydiagram.visitor.ActivityDiagramVisitorDefault;

public class TokenWithdrawVisitor extends ActivityDiagramVisitorDefault<Void> {

	private TokenWithdrawVisitor() {}
	
	public final static TokenWithdrawVisitor INSTANCe = new TokenWithdrawVisitor();
	
	ActivityNodeRemoveTokenVisitor activityNodeRemoveTokenVisitor2;
	
	private ActivityNodeRemoveTokenVisitor activityNodeRemoveTokenVisitor() {
		if(activityNodeRemoveTokenVisitor2 == null) activityNodeRemoveTokenVisitor2 = ActivityNodeRemoveTokenVisitor.INSTANCE;
		return activityNodeRemoveTokenVisitor2;
	}
	TokenIsWithdrawVisitor tokenIsWithdrawVisitor2;
	
	public TokenIsWithdrawVisitor tokenIsWithdrawVisitor() {
		if(tokenIsWithdrawVisitor2 == null) tokenIsWithdrawVisitor2 = TokenIsWithdrawVisitor.INSTANCE;
		return tokenIsWithdrawVisitor2;
	}
	TokenWithdrawVisitor tokenWithdrawVisitor2;
	
	private TokenWithdrawVisitor tokenWithdrawVisitor() {
		if(tokenWithdrawVisitor2 == null) tokenWithdrawVisitor2 = TokenWithdrawVisitor.INSTANCe;
		return tokenWithdrawVisitor2;
	}

	@Override
	public Void visitControlToken(final ControlToken controlToken, Object ctx) {
		if (!this.isWithdrawn(controlToken)) {
			final ActivityNode holder = controlToken.getHolder();
			holder.accept(this.activityNodeRemoveTokenVisitor(), controlToken);
			controlToken.setHolder(null);
		}

		return null;
	}

	private boolean isWithdrawn(final Token controlToken) {
		return controlToken.getHolder() == null;
	}

	@Override
	public Void visitForkedToken(final ForkedToken forkedToken, Object ctx) {
		final Token baseToken = this.getBaseToken(forkedToken);
		if (!baseToken.accept(this.tokenIsWithdrawVisitor(), null)) {
			baseToken.accept(this.tokenWithdrawVisitor(), null);
		}
		if (forkedToken.getRemainingOffersCount() > 0) {
			forkedToken.setRemainingOffersCount(forkedToken.getRemainingOffersCount() - 1);
		}
		if (forkedToken.getRemainingOffersCount() == 0) {
			if (!this.isWithdrawn(forkedToken)) {

				forkedToken.getHolder().accept(this.activityNodeRemoveTokenVisitor(), null);
				forkedToken.setHolder(null);
			}
		}

		return null;
	}

	private Token getBaseToken(final ForkedToken forkedToken) {
		if (forkedToken.getBaseToken() != null && forkedToken.getBaseToken().eIsProxy()) {
			final InternalEObject oldBaseToken = (InternalEObject) forkedToken.getBaseToken();

			// FIXME : differs from standard implementation
			if (forkedToken.getBaseToken() != oldBaseToken) {

			}
		}
		return forkedToken.getBaseToken();
	}
	
	

}
