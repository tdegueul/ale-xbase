package fr.inria.diverse.ad.emfswitch.operation;

import activitydiagram.ActivityNode;
import activitydiagram.Token;

public interface TokenOperation {

	void withdraw();

	Token transfer(ActivityNode activityNode);

	boolean isWithdrawn();

}
