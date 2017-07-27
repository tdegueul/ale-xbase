package modularactivitydiagram.revisitor.operations;

public interface ControlNode_AspectOperation extends modularactivitydiagram.revisitor.operations.ControlNodeOperation, modularactivitydiagram.revisitor.operations.ActivityNode_AspectOperation {
	void fire(org.eclipse.emf.common.util.EList<adruntime.Token> tokens);
	Boolean isReady();
}
