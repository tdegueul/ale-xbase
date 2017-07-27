package modularactivitydiagram.revisitor.operations;

public interface ControlFlow_AspectOperation extends modularactivitydiagram.revisitor.operations.ControlFlowOperation, modularactivitydiagram.revisitor.operations.ActivityEdge_AspectOperation {
	Boolean isControlFlow();
	adwithoutruntime.ControlFlow asControlFlow();
}
