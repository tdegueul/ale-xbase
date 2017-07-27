package modularactivitydiagram.revisitor.operations;

public interface ActivityEdge_AspectOperation extends modularactivitydiagram.revisitor.operations.ActivityEdgeOperation {
	Boolean isControlFlow();
	adwithoutruntime.ControlFlow asControlFlow();
	void sendOffer(org.eclipse.emf.common.util.EList<adruntime.Token> tokens);
	org.eclipse.emf.common.util.EList<adruntime.Token> takeOfferedTokens();
	Boolean hasOffer();
}
