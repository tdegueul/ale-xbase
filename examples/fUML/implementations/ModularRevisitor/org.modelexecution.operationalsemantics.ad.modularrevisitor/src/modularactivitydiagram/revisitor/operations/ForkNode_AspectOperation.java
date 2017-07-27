package modularactivitydiagram.revisitor.operations;

public interface ForkNode_AspectOperation extends modularactivitydiagram.revisitor.operations.ForkNodeOperation, modularactivitydiagram.revisitor.operations.ControlNode_AspectOperation {
	void fire(org.eclipse.emf.common.util.EList<adruntime.Token> tokens);
}
