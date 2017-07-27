package modularactivitydiagram.revisitor.operations;

public interface ActivityEdgeOperation extends modularactivitydiagram.revisitor.operations.NamedElementOperation {
	void sendOffer(org.eclipse.emf.common.util.EList<adruntime.Token> tokens);
	org.eclipse.emf.common.util.EList<adruntime.Token> takeOfferedTokens();
	Boolean hasOffer();
	Boolean isControlFlow();
	adwithoutruntime.ControlFlow asControlFlow();
}
