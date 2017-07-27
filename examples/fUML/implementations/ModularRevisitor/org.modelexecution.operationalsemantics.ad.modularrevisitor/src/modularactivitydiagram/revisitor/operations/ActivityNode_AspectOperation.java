package modularactivitydiagram.revisitor.operations;

public interface ActivityNode_AspectOperation extends modularactivitydiagram.revisitor.operations.ActivityNodeOperation {
	Boolean isInitialNode();
	adwithoutruntime.InitialNode asInitialNode();
	void run();
	Boolean isRunning();
	void terminate();
	Boolean isReady();
	void sendOffers(org.eclipse.emf.common.util.EList<adruntime.Token> tokens);
	org.eclipse.emf.common.util.EList<adruntime.Token> takeOfferedTokens();
	void addTokens(org.eclipse.emf.common.util.EList<adruntime.Token> tokens);
	Boolean hasOffers();
	void removeToken(adruntime.Token token);
	void fire(org.eclipse.emf.common.util.EList<adruntime.Token> tokens);
}
