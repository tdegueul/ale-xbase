package modularactivitydiagram.revisitor.operations;

public interface ActivityNodeOperation extends modularactivitydiagram.revisitor.operations.NamedElementOperation {
	Boolean isReady();
	org.eclipse.emf.common.util.EList<adruntime.Token> takeOfferedTokens();
	void fire(org.eclipse.emf.common.util.EList<adruntime.Token> tokens);
	Boolean isInitialNode();
	adwithoutruntime.InitialNode asInitialNode();
	void run();
	void terminate();
	void removeToken(adruntime.Token token);
}
