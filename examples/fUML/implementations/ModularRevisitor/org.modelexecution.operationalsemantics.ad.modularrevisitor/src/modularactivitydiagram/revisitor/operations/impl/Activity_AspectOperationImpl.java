package modularactivitydiagram.revisitor.operations.impl;

public class Activity_AspectOperationImpl implements modularactivitydiagram.revisitor.operations.Activity_AspectOperation {
	private final adruntime.Activity_Aspect self;
	private final adruntime.revisitor.AdruntimeRevisitor<? extends modularactivitydiagram.revisitor.operations.ActionOperation, ? extends modularactivitydiagram.revisitor.operations.Action_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ActivityOperation, ? extends modularactivitydiagram.revisitor.operations.ActivityEdgeOperation, ? extends modularactivitydiagram.revisitor.operations.ActivityEdge_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ActivityFinalNodeOperation, ? extends modularactivitydiagram.revisitor.operations.ActivityFinalNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ActivityNodeOperation, ? extends modularactivitydiagram.revisitor.operations.ActivityNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.Activity_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.BooleanBinaryExpressionOperation, ? extends modularactivitydiagram.revisitor.operations.BooleanBinaryExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.BooleanExpressionOperation, ? extends modularactivitydiagram.revisitor.operations.BooleanExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.BooleanUnaryExpressionOperation, ? extends modularactivitydiagram.revisitor.operations.BooleanUnaryExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.BooleanValueOperation, ? extends modularactivitydiagram.revisitor.operations.BooleanVariableOperation, ? extends modularactivitydiagram.revisitor.operations.BooleanVariable_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ControlFlowOperation, ? extends modularactivitydiagram.revisitor.operations.ControlFlow_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ControlNodeOperation, ? extends modularactivitydiagram.revisitor.operations.ControlNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ControlTokenOperation, ? extends modularactivitydiagram.revisitor.operations.DecisionNodeOperation, ? extends modularactivitydiagram.revisitor.operations.DecisionNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ExecutableNodeOperation, ? extends modularactivitydiagram.revisitor.operations.ExecutableNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ExpressionOperation, ? extends modularactivitydiagram.revisitor.operations.FinalNodeOperation, ? extends modularactivitydiagram.revisitor.operations.FinalNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ForkNodeOperation, ? extends modularactivitydiagram.revisitor.operations.ForkNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ForkedTokenOperation, ? extends modularactivitydiagram.revisitor.operations.InitialNodeOperation, ? extends modularactivitydiagram.revisitor.operations.InitialNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.InputOperation, ? extends modularactivitydiagram.revisitor.operations.InputValueOperation, ? extends modularactivitydiagram.revisitor.operations.IntegerCalculationExpressionOperation, ? extends modularactivitydiagram.revisitor.operations.IntegerCalculationExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.IntegerComparisonExpressionOperation, ? extends modularactivitydiagram.revisitor.operations.IntegerComparisonExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.IntegerExpressionOperation, ? extends modularactivitydiagram.revisitor.operations.IntegerExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.IntegerValueOperation, ? extends modularactivitydiagram.revisitor.operations.IntegerVariableOperation, ? extends modularactivitydiagram.revisitor.operations.IntegerVariable_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.JoinNodeOperation, ? extends modularactivitydiagram.revisitor.operations.JoinNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.MergeNodeOperation, ? extends modularactivitydiagram.revisitor.operations.MergeNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.NamedElementOperation, ? extends modularactivitydiagram.revisitor.operations.OfferOperation, ? extends modularactivitydiagram.revisitor.operations.OpaqueActionOperation, ? extends modularactivitydiagram.revisitor.operations.OpaqueAction_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.TokenOperation, ? extends modularactivitydiagram.revisitor.operations.TraceOperation, ? extends modularactivitydiagram.revisitor.operations.ValueOperation, ? extends modularactivitydiagram.revisitor.operations.VariableOperation, ? extends modularactivitydiagram.revisitor.operations.Variable_AspectOperation> alg;


	public Activity_AspectOperationImpl(adruntime.Activity_Aspect self, adruntime.revisitor.AdruntimeRevisitor<? extends modularactivitydiagram.revisitor.operations.ActionOperation, ? extends modularactivitydiagram.revisitor.operations.Action_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ActivityOperation, ? extends modularactivitydiagram.revisitor.operations.ActivityEdgeOperation, ? extends modularactivitydiagram.revisitor.operations.ActivityEdge_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ActivityFinalNodeOperation, ? extends modularactivitydiagram.revisitor.operations.ActivityFinalNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ActivityNodeOperation, ? extends modularactivitydiagram.revisitor.operations.ActivityNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.Activity_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.BooleanBinaryExpressionOperation, ? extends modularactivitydiagram.revisitor.operations.BooleanBinaryExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.BooleanExpressionOperation, ? extends modularactivitydiagram.revisitor.operations.BooleanExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.BooleanUnaryExpressionOperation, ? extends modularactivitydiagram.revisitor.operations.BooleanUnaryExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.BooleanValueOperation, ? extends modularactivitydiagram.revisitor.operations.BooleanVariableOperation, ? extends modularactivitydiagram.revisitor.operations.BooleanVariable_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ControlFlowOperation, ? extends modularactivitydiagram.revisitor.operations.ControlFlow_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ControlNodeOperation, ? extends modularactivitydiagram.revisitor.operations.ControlNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ControlTokenOperation, ? extends modularactivitydiagram.revisitor.operations.DecisionNodeOperation, ? extends modularactivitydiagram.revisitor.operations.DecisionNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ExecutableNodeOperation, ? extends modularactivitydiagram.revisitor.operations.ExecutableNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ExpressionOperation, ? extends modularactivitydiagram.revisitor.operations.FinalNodeOperation, ? extends modularactivitydiagram.revisitor.operations.FinalNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ForkNodeOperation, ? extends modularactivitydiagram.revisitor.operations.ForkNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ForkedTokenOperation, ? extends modularactivitydiagram.revisitor.operations.InitialNodeOperation, ? extends modularactivitydiagram.revisitor.operations.InitialNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.InputOperation, ? extends modularactivitydiagram.revisitor.operations.InputValueOperation, ? extends modularactivitydiagram.revisitor.operations.IntegerCalculationExpressionOperation, ? extends modularactivitydiagram.revisitor.operations.IntegerCalculationExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.IntegerComparisonExpressionOperation, ? extends modularactivitydiagram.revisitor.operations.IntegerComparisonExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.IntegerExpressionOperation, ? extends modularactivitydiagram.revisitor.operations.IntegerExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.IntegerValueOperation, ? extends modularactivitydiagram.revisitor.operations.IntegerVariableOperation, ? extends modularactivitydiagram.revisitor.operations.IntegerVariable_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.JoinNodeOperation, ? extends modularactivitydiagram.revisitor.operations.JoinNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.MergeNodeOperation, ? extends modularactivitydiagram.revisitor.operations.MergeNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.NamedElementOperation, ? extends modularactivitydiagram.revisitor.operations.OfferOperation, ? extends modularactivitydiagram.revisitor.operations.OpaqueActionOperation, ? extends modularactivitydiagram.revisitor.operations.OpaqueAction_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.TokenOperation, ? extends modularactivitydiagram.revisitor.operations.TraceOperation, ? extends modularactivitydiagram.revisitor.operations.ValueOperation, ? extends modularactivitydiagram.revisitor.operations.VariableOperation, ? extends modularactivitydiagram.revisitor.operations.Variable_AspectOperation> alg) {
		this.self = self;
		this.alg = alg;
	}

	@Override
	public void initialize(org.eclipse.emf.common.util.EList<adruntime.InputValue> inputValues) {
		for (adwithoutruntime.Variable v: self.getLocals()) {
			v.setCurrentValue(v.getInitialValue());
		}
		if (inputValues != null) {
			for (adruntime.InputValue v: inputValues) {
				v.getVariable().setCurrentValue(v.getValue());
			}
		} 
	}
	@Override
	public void main(org.eclipse.emf.common.util.EList<adruntime.InputValue> inputValues) {
		alg.$(self).initialize(inputValues);
		alg.$(self).initializeTrace();
		alg.$(self).run();
	}
	@Override
	public void run() {
		alg.$(self).runNodes();
		alg.$(self).fireInitialNode();
		org.eclipse.emf.common.util.EList<adwithoutruntime.ActivityNode> enabledNodes = alg.$(self).getEnabledNodes();
		while (enabledNodes.size() > 0) {
			adwithoutruntime.ActivityNode nextNode = alg.$(self).selectNextNode(enabledNodes);
			alg.$(self).fireNode(nextNode);
			enabledNodes = alg.$(self).getEnabledNodes();
		}
	}
	@Override
	public adwithoutruntime.ActivityNode selectNextNode(org.eclipse.emf.common.util.EList<adwithoutruntime.ActivityNode> activityNodes) {
		return activityNodes.get(0);
	}
	@Override
	public org.eclipse.emf.common.util.EList<adwithoutruntime.ActivityNode> getEnabledNodes() {
		org.eclipse.emf.common.util.EList<adwithoutruntime.ActivityNode> enabledNodes = new org.eclipse.emf.common.util.BasicEList<>();
		for (adwithoutruntime.ActivityNode node: self.getNodes()) {
			if (alg.$(node).isReady()) {
				enabledNodes.add(node);
			} 
		}
		return enabledNodes;
	}
	@Override
	public void fireInitialNode() {
		adwithoutruntime.InitialNode initialNode = alg.$(self).getInitialNode();
		alg.$(self).fireNode(initialNode);
	}
	@Override
	public void fireNode(adwithoutruntime.ActivityNode node) {
		org.eclipse.emf.common.util.EList<adruntime.Token> tokens = alg.$(node).takeOfferedTokens();
		alg.$(node).fire(tokens);
		self.getTrace().getExecutedNodes().add(node);
	}
	@Override
	public adwithoutruntime.InitialNode getInitialNode() {
		for (adwithoutruntime.ActivityNode node: self.getNodes()) {
			if (alg.$(node).isInitialNode()) {
				return alg.$(node).asInitialNode();
			} 
		}
		return null;
	}
	@Override
	public void runNodes() {
		for (adwithoutruntime.ActivityNode node: self.getNodes()) {
			alg.$(node).run();
		}
	}
	@Override
	public void initializeTrace() {
		adruntime.Trace trace = adruntime.AdruntimeFactory.eINSTANCE.createTrace();
		self.setTrace(trace);
	}
	@Override
	public void terminate() {
		for (adwithoutruntime.ActivityNode node: self.getNodes()) {
			alg.$(node).terminate();
		}
	}
}
