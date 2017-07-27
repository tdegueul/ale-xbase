package modularactivitydiagram.revisitor.operations;

public interface Action_AspectOperation extends modularactivitydiagram.revisitor.operations.ActionOperation, modularactivitydiagram.revisitor.operations.ExecutableNode_AspectOperation {
	void fire(org.eclipse.emf.common.util.EList<adruntime.Token> tokens);
	void doAction();
	void sendOffers();
	Boolean isReady();
}
