package fr.inria.diverse.ad.visitor.visitor;

import java.util.ArrayList;
import java.util.List;

import activitydiagram.Offer;
import activitydiagram.Token;
import activitydiagram.visitor.ActivityDiagramVisitorDefault;

public class OfferHasTokensVisitor extends ActivityDiagramVisitorDefault<Boolean> {

	private OfferHasTokensVisitor() {
		
	}
	
	public final static OfferHasTokensVisitor INSTANCE = new OfferHasTokensVisitor();
	
	private TokenIsWithdrawVisitor tokenIsWithdrawVisitor2;
	
	private TokenIsWithdrawVisitor tokenIsWithdrawVisitor() {
		if(tokenIsWithdrawVisitor2 == null) tokenIsWithdrawVisitor2 = TokenIsWithdrawVisitor.INSTANCE;
		return tokenIsWithdrawVisitor2;
	}

	@Override
	public Boolean visitOffer(Offer offer, Object ctx) {
		this.removeWithdrawnTokens(offer);
		return offer.getOfferedTokens().size() > 0;
	}

	private void removeWithdrawnTokens(Offer offer) {
		final List<Token> tokensToBeRemoved = new ArrayList<Token>();
		for (final Token token : offer.getOfferedTokens()) {
			if (token.accept(tokenIsWithdrawVisitor(), null)) {
				tokensToBeRemoved.add(token);
			}
		}
		offer.getOfferedTokens().removeAll(tokensToBeRemoved);

	}

}
