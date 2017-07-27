package fr.inria.diverse.ad.emfswitch.switches;

import activitydiagram.Offer;
import activitydiagram.util.ActivitydiagramSwitch;
import fr.inria.diverse.ad.emfswitch.impl.operation.executable.offer.OfferOfferOperationImpl;
import fr.inria.diverse.ad.emfswitch.operation.OfferOperation;

public class OfferVisitor extends ActivitydiagramSwitch<OfferOperation> {
	
	private OfferVisitor() {}
	
	public final static OfferVisitor INSTANCE = new OfferVisitor();

	@Override
	public OfferOperation caseOffer(Offer object) {
		return new OfferOfferOperationImpl(object);
	}

}
