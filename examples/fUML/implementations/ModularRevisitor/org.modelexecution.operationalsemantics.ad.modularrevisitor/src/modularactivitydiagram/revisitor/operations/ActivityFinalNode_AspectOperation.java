package modularactivitydiagram.revisitor.operations;

public interface ActivityFinalNode_AspectOperation extends modularactivitydiagram.revisitor.operations.FinalNode_AspectOperation, modularactivitydiagram.revisitor.operations.ActivityFinalNodeOperation {
	void fire(org.eclipse.emf.common.util.EList<adruntime.Token> tokens);
}
