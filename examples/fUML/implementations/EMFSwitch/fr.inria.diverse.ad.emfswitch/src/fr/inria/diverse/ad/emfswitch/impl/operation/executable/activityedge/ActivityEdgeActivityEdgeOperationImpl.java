package fr.inria.diverse.ad.emfswitch.impl.operation.executable.activityedge;

import java.util.ArrayList;
import java.util.List;

import activitydiagram.ActivityEdge;
import activitydiagram.ActivitydiagramFactory;
import activitydiagram.Offer;
import activitydiagram.Token;
import fr.inria.diverse.ad.emfswitch.operation.ActivityEdgeOperation;
import fr.inria.diverse.ad.emfswitch.switches.OfferVisitor;

public abstract class ActivityEdgeActivityEdgeOperationImpl implements ActivityEdgeOperation {

	private final ActivityEdge activityEdge;

	private final OfferVisitor offerVisitor = OfferVisitor.INSTANCE;

	public ActivityEdgeActivityEdgeOperationImpl(final ActivityEdge activityEdge) {
		this.activityEdge = activityEdge;
	}

	@Override
	public void sendOffer(final List<Token> tokens) {
		final Offer offer = ActivitydiagramFactory.eINSTANCE.createOffer();
		for (final Token token : tokens) {
			offer.getOfferedTokens().add(token);
		}
		this.activityEdge.getOffers().add(offer);
	}

	@Override
	public List<Token> takeOfferedTokens() {
		final List<Token> tokens = new ArrayList<Token>();

		for (final Offer o : this.activityEdge.getOffers()) {
			tokens.addAll(o.getOfferedTokens());
		}
		this.activityEdge.getOffers().clear();

		return tokens;
	}

	@Override
	public boolean hasOffer() {
		for (final Offer o : this.activityEdge.getOffers()) {
			if (this.offerVisitor.doSwitch(o).hasTokens()) {
				return true;
			}
		}
		return false;
	}

}
