package fr.inria.diverse.ad.emfswitch.switches;

import activitydiagram.ControlToken;
import activitydiagram.ForkedToken;
import activitydiagram.util.ActivitydiagramSwitch;
import fr.inria.diverse.ad.emfswitch.impl.operation.executable.token.ControlTokenNodeOperationImpl;
import fr.inria.diverse.ad.emfswitch.impl.operation.executable.token.ForkedTokenNodeOperationImpl;
import fr.inria.diverse.ad.emfswitch.operation.TokenOperation;

public class TokenVisitor extends ActivitydiagramSwitch<TokenOperation> {
	
	private TokenVisitor() {}
	
	public final static TokenVisitor INSTANCE = new TokenVisitor();

	@Override
	public TokenOperation caseControlToken(ControlToken object) {
		return new ControlTokenNodeOperationImpl(object);
	}

	@Override
	public TokenOperation caseForkedToken(ForkedToken object) {
		return new ForkedTokenNodeOperationImpl(object);
	}

}
