package modularactivitydiagram.revisitor.operations;

public interface Activity_AspectOperation extends modularactivitydiagram.revisitor.operations.ActivityOperation {
	void initialize(org.eclipse.emf.common.util.EList<adruntime.InputValue> inputValues);
	void main(org.eclipse.emf.common.util.EList<adruntime.InputValue> inputValues);
	void run();
	adwithoutruntime.ActivityNode selectNextNode(org.eclipse.emf.common.util.EList<adwithoutruntime.ActivityNode> activityNodes);
	org.eclipse.emf.common.util.EList<adwithoutruntime.ActivityNode> getEnabledNodes();
	void fireInitialNode();
	void fireNode(adwithoutruntime.ActivityNode node);
	adwithoutruntime.InitialNode getInitialNode();
	void runNodes();
	void initializeTrace();
	void terminate();
}
