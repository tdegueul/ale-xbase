package modularactivitydiagram.revisitor.operations;

public interface InitialNode_AspectOperation extends modularactivitydiagram.revisitor.operations.InitialNodeOperation, modularactivitydiagram.revisitor.operations.ControlNode_AspectOperation {
	void fire(org.eclipse.emf.common.util.EList<adruntime.Token> tokens);
	Boolean isReady();
	Boolean isInitialNode();
	adwithoutruntime.InitialNode asInitialNode();
}
