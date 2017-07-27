package fr.inria.diverse.ad.visitor.visitor;

import activitydiagram.ControlFlow;
import activitydiagram.Offer;
import activitydiagram.visitor.ActivityDiagramVisitorDefault;

public class ActivityEdgeHasOfferVisitor extends ActivityDiagramVisitorDefault<Boolean> {

	private ActivityEdgeHasOfferVisitor() {
		
	}
	
	public final static ActivityEdgeHasOfferVisitor INSTANCE = new ActivityEdgeHasOfferVisitor();
	
	private OfferHasTokensVisitor offerHasTokensVisitor;

	@Override
	public Boolean visitControlFlow(ControlFlow controlFlow, Object ctx) {
		for (final Offer o : controlFlow.getOffers()) {
			if (o.accept(getOfferHasTokensVisitor(), null)) {
				return true;
			}
		}
		return false;
	}

	private OfferHasTokensVisitor getOfferHasTokensVisitor() {
		if(this.offerHasTokensVisitor == null) offerHasTokensVisitor = OfferHasTokensVisitor.INSTANCE;
		return offerHasTokensVisitor;
	}

}
