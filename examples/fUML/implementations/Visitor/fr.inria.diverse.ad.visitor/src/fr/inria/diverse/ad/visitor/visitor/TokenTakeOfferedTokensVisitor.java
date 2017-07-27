package fr.inria.diverse.ad.visitor.visitor;

import java.util.ArrayList;
import java.util.List;

import activitydiagram.ControlFlow;
import activitydiagram.Offer;
import activitydiagram.Token;
import activitydiagram.visitor.ActivityDiagramVisitorDefault;

public class TokenTakeOfferedTokensVisitor extends ActivityDiagramVisitorDefault<List<Token>> {

	private TokenTakeOfferedTokensVisitor() {}
	
	public final static TokenTakeOfferedTokensVisitor INSTANCe = new TokenTakeOfferedTokensVisitor();
	
	@Override
	public List<Token> visitControlFlow(ControlFlow controlFlow, Object ctx) {
		final List<Token> tokens = new ArrayList<Token>();

		for (final Offer o : controlFlow.getOffers()) {
			tokens.addAll(o.getOfferedTokens());
		}
		controlFlow.getOffers().clear();

		return tokens;
	}

}
