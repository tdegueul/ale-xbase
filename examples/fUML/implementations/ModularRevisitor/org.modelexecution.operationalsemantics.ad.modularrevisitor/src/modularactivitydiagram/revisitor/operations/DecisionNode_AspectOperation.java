package modularactivitydiagram.revisitor.operations;

public interface DecisionNode_AspectOperation extends modularactivitydiagram.revisitor.operations.DecisionNodeOperation, modularactivitydiagram.revisitor.operations.ControlNode_AspectOperation {
	void fire(org.eclipse.emf.common.util.EList<adruntime.Token> tokens);
	Boolean isReady();
}
