package fr.inria.diverse.ad.visitor.visitor;

import activitydiagram.ControlToken;
import activitydiagram.ForkedToken;
import activitydiagram.visitor.ActivityDiagramVisitorDefault;

public class TokenIsWithdrawVisitor extends ActivityDiagramVisitorDefault<Boolean> {

	
	private TokenIsWithdrawVisitor() {}
	public final static TokenIsWithdrawVisitor INSTANCE = new TokenIsWithdrawVisitor();
	
	@Override
	public Boolean visitControlToken(ControlToken controlToken, Object ctx) {
		return controlToken.getHolder() == null;
	}

	@Override
	public Boolean visitForkedToken(ForkedToken forkedToken, Object ctx) {
		return forkedToken.getHolder() == null;
	}
	
	

}
