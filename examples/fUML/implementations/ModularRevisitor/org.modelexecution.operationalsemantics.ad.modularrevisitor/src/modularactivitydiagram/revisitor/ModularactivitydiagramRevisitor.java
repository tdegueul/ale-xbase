package modularactivitydiagram.revisitor;

public interface ModularactivitydiagramRevisitor extends adruntime.revisitor.AdruntimeRevisitor<modularactivitydiagram.revisitor.operations.ActionOperation, modularactivitydiagram.revisitor.operations.Action_AspectOperation, modularactivitydiagram.revisitor.operations.ActivityOperation, modularactivitydiagram.revisitor.operations.ActivityEdgeOperation, modularactivitydiagram.revisitor.operations.ActivityEdge_AspectOperation, modularactivitydiagram.revisitor.operations.ActivityFinalNodeOperation, modularactivitydiagram.revisitor.operations.ActivityFinalNode_AspectOperation, modularactivitydiagram.revisitor.operations.ActivityNodeOperation, modularactivitydiagram.revisitor.operations.ActivityNode_AspectOperation, modularactivitydiagram.revisitor.operations.Activity_AspectOperation, modularactivitydiagram.revisitor.operations.BooleanBinaryExpressionOperation, modularactivitydiagram.revisitor.operations.BooleanBinaryExpression_AspectOperation, modularactivitydiagram.revisitor.operations.BooleanExpressionOperation, modularactivitydiagram.revisitor.operations.BooleanExpression_AspectOperation, modularactivitydiagram.revisitor.operations.BooleanUnaryExpressionOperation, modularactivitydiagram.revisitor.operations.BooleanUnaryExpression_AspectOperation, modularactivitydiagram.revisitor.operations.BooleanValueOperation, modularactivitydiagram.revisitor.operations.BooleanVariableOperation, modularactivitydiagram.revisitor.operations.BooleanVariable_AspectOperation, modularactivitydiagram.revisitor.operations.ControlFlowOperation, modularactivitydiagram.revisitor.operations.ControlFlow_AspectOperation, modularactivitydiagram.revisitor.operations.ControlNodeOperation, modularactivitydiagram.revisitor.operations.ControlNode_AspectOperation, modularactivitydiagram.revisitor.operations.ControlTokenOperation, modularactivitydiagram.revisitor.operations.DecisionNodeOperation, modularactivitydiagram.revisitor.operations.DecisionNode_AspectOperation, modularactivitydiagram.revisitor.operations.ExecutableNodeOperation, modularactivitydiagram.revisitor.operations.ExecutableNode_AspectOperation, modularactivitydiagram.revisitor.operations.ExpressionOperation, modularactivitydiagram.revisitor.operations.FinalNodeOperation, modularactivitydiagram.revisitor.operations.FinalNode_AspectOperation, modularactivitydiagram.revisitor.operations.ForkNodeOperation, modularactivitydiagram.revisitor.operations.ForkNode_AspectOperation, modularactivitydiagram.revisitor.operations.ForkedTokenOperation, modularactivitydiagram.revisitor.operations.InitialNodeOperation, modularactivitydiagram.revisitor.operations.InitialNode_AspectOperation, modularactivitydiagram.revisitor.operations.InputOperation, modularactivitydiagram.revisitor.operations.InputValueOperation, modularactivitydiagram.revisitor.operations.IntegerCalculationExpressionOperation, modularactivitydiagram.revisitor.operations.IntegerCalculationExpression_AspectOperation, modularactivitydiagram.revisitor.operations.IntegerComparisonExpressionOperation, modularactivitydiagram.revisitor.operations.IntegerComparisonExpression_AspectOperation, modularactivitydiagram.revisitor.operations.IntegerExpressionOperation, modularactivitydiagram.revisitor.operations.IntegerExpression_AspectOperation, modularactivitydiagram.revisitor.operations.IntegerValueOperation, modularactivitydiagram.revisitor.operations.IntegerVariableOperation, modularactivitydiagram.revisitor.operations.IntegerVariable_AspectOperation, modularactivitydiagram.revisitor.operations.JoinNodeOperation, modularactivitydiagram.revisitor.operations.JoinNode_AspectOperation, modularactivitydiagram.revisitor.operations.MergeNodeOperation, modularactivitydiagram.revisitor.operations.MergeNode_AspectOperation, modularactivitydiagram.revisitor.operations.NamedElementOperation, modularactivitydiagram.revisitor.operations.OfferOperation, modularactivitydiagram.revisitor.operations.OpaqueActionOperation, modularactivitydiagram.revisitor.operations.OpaqueAction_AspectOperation, modularactivitydiagram.revisitor.operations.TokenOperation, modularactivitydiagram.revisitor.operations.TraceOperation, modularactivitydiagram.revisitor.operations.ValueOperation, modularactivitydiagram.revisitor.operations.VariableOperation, modularactivitydiagram.revisitor.operations.Variable_AspectOperation> {
	@Override
	default modularactivitydiagram.revisitor.operations.Action_AspectOperation action_Aspect(final adruntime.Action_Aspect a) {
		return new modularactivitydiagram.revisitor.operations.impl.Action_AspectOperationImpl(a, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.Action_AspectOperation namedElement_action_Aspect(final adruntime.Action_Aspect a) {
		return new modularactivitydiagram.revisitor.operations.impl.Action_AspectOperationImpl(a, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.Action_AspectOperation activityNode_action_Aspect(final adruntime.Action_Aspect a) {
		return new modularactivitydiagram.revisitor.operations.impl.Action_AspectOperationImpl(a, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.Action_AspectOperation executableNode_action_Aspect(final adruntime.Action_Aspect a) {
		return new modularactivitydiagram.revisitor.operations.impl.Action_AspectOperationImpl(a, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.Action_AspectOperation action_action_Aspect(final adruntime.Action_Aspect a) {
		return new modularactivitydiagram.revisitor.operations.impl.Action_AspectOperationImpl(a, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.Action_AspectOperation activityNode_Aspect_action_Aspect(final adruntime.Action_Aspect a) {
		return new modularactivitydiagram.revisitor.operations.impl.Action_AspectOperationImpl(a, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.Action_AspectOperation executableNode_Aspect_action_Aspect(final adruntime.Action_Aspect a) {
		return new modularactivitydiagram.revisitor.operations.impl.Action_AspectOperationImpl(a, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ActivityOperation activity(final adwithoutruntime.Activity a) {
		return new modularactivitydiagram.revisitor.operations.impl.ActivityOperationImpl(a, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ActivityOperation namedElement_activity(final adwithoutruntime.Activity a) {
		return new modularactivitydiagram.revisitor.operations.impl.ActivityOperationImpl(a, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ActivityEdge_AspectOperation activityEdge_Aspect(final adruntime.ActivityEdge_Aspect a) {
		return new modularactivitydiagram.revisitor.operations.impl.ActivityEdge_AspectOperationImpl(a, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ActivityEdge_AspectOperation namedElement_activityEdge_Aspect(final adruntime.ActivityEdge_Aspect a) {
		return new modularactivitydiagram.revisitor.operations.impl.ActivityEdge_AspectOperationImpl(a, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ActivityEdge_AspectOperation activityEdge_activityEdge_Aspect(final adruntime.ActivityEdge_Aspect a) {
		return new modularactivitydiagram.revisitor.operations.impl.ActivityEdge_AspectOperationImpl(a, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ActivityFinalNodeOperation activityFinalNode(final adwithoutruntime.ActivityFinalNode a) {
		return new modularactivitydiagram.revisitor.operations.impl.ActivityFinalNodeOperationImpl(a, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ActivityFinalNodeOperation namedElement_activityFinalNode(final adwithoutruntime.ActivityFinalNode a) {
		return new modularactivitydiagram.revisitor.operations.impl.ActivityFinalNodeOperationImpl(a, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ActivityFinalNodeOperation activityNode_activityFinalNode(final adwithoutruntime.ActivityFinalNode a) {
		return new modularactivitydiagram.revisitor.operations.impl.ActivityFinalNodeOperationImpl(a, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ActivityFinalNodeOperation controlNode_activityFinalNode(final adwithoutruntime.ActivityFinalNode a) {
		return new modularactivitydiagram.revisitor.operations.impl.ActivityFinalNodeOperationImpl(a, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ActivityFinalNodeOperation finalNode_activityFinalNode(final adwithoutruntime.ActivityFinalNode a) {
		return new modularactivitydiagram.revisitor.operations.impl.ActivityFinalNodeOperationImpl(a, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ActivityFinalNode_AspectOperation activityFinalNode_Aspect(final adruntime.ActivityFinalNode_Aspect a) {
		return new modularactivitydiagram.revisitor.operations.impl.ActivityFinalNode_AspectOperationImpl(a, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ActivityFinalNode_AspectOperation namedElement_activityFinalNode_Aspect(final adruntime.ActivityFinalNode_Aspect a) {
		return new modularactivitydiagram.revisitor.operations.impl.ActivityFinalNode_AspectOperationImpl(a, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ActivityFinalNode_AspectOperation activityNode_activityFinalNode_Aspect(final adruntime.ActivityFinalNode_Aspect a) {
		return new modularactivitydiagram.revisitor.operations.impl.ActivityFinalNode_AspectOperationImpl(a, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ActivityFinalNode_AspectOperation controlNode_activityFinalNode_Aspect(final adruntime.ActivityFinalNode_Aspect a) {
		return new modularactivitydiagram.revisitor.operations.impl.ActivityFinalNode_AspectOperationImpl(a, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ActivityFinalNode_AspectOperation finalNode_activityFinalNode_Aspect(final adruntime.ActivityFinalNode_Aspect a) {
		return new modularactivitydiagram.revisitor.operations.impl.ActivityFinalNode_AspectOperationImpl(a, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ActivityFinalNode_AspectOperation activityFinalNode_activityFinalNode_Aspect(final adruntime.ActivityFinalNode_Aspect a) {
		return new modularactivitydiagram.revisitor.operations.impl.ActivityFinalNode_AspectOperationImpl(a, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ActivityFinalNode_AspectOperation activityNode_Aspect_activityFinalNode_Aspect(final adruntime.ActivityFinalNode_Aspect a) {
		return new modularactivitydiagram.revisitor.operations.impl.ActivityFinalNode_AspectOperationImpl(a, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ActivityFinalNode_AspectOperation controlNode_Aspect_activityFinalNode_Aspect(final adruntime.ActivityFinalNode_Aspect a) {
		return new modularactivitydiagram.revisitor.operations.impl.ActivityFinalNode_AspectOperationImpl(a, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ActivityFinalNode_AspectOperation finalNode_Aspect_activityFinalNode_Aspect(final adruntime.ActivityFinalNode_Aspect a) {
		return new modularactivitydiagram.revisitor.operations.impl.ActivityFinalNode_AspectOperationImpl(a, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ActivityNode_AspectOperation activityNode_Aspect(final adruntime.ActivityNode_Aspect a) {
		return new modularactivitydiagram.revisitor.operations.impl.ActivityNode_AspectOperationImpl(a, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ActivityNode_AspectOperation namedElement_activityNode_Aspect(final adruntime.ActivityNode_Aspect a) {
		return new modularactivitydiagram.revisitor.operations.impl.ActivityNode_AspectOperationImpl(a, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ActivityNode_AspectOperation activityNode_activityNode_Aspect(final adruntime.ActivityNode_Aspect a) {
		return new modularactivitydiagram.revisitor.operations.impl.ActivityNode_AspectOperationImpl(a, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.Activity_AspectOperation activity_Aspect(final adruntime.Activity_Aspect a) {
		return new modularactivitydiagram.revisitor.operations.impl.Activity_AspectOperationImpl(a, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.Activity_AspectOperation namedElement_activity_Aspect(final adruntime.Activity_Aspect a) {
		return new modularactivitydiagram.revisitor.operations.impl.Activity_AspectOperationImpl(a, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.Activity_AspectOperation activity_activity_Aspect(final adruntime.Activity_Aspect a) {
		return new modularactivitydiagram.revisitor.operations.impl.Activity_AspectOperationImpl(a, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.BooleanBinaryExpressionOperation booleanBinaryExpression(final adwithoutruntime.BooleanBinaryExpression b) {
		return new modularactivitydiagram.revisitor.operations.impl.BooleanBinaryExpressionOperationImpl(b, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.BooleanBinaryExpressionOperation expression_booleanBinaryExpression(final adwithoutruntime.BooleanBinaryExpression b) {
		return new modularactivitydiagram.revisitor.operations.impl.BooleanBinaryExpressionOperationImpl(b, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.BooleanBinaryExpressionOperation booleanExpression_booleanBinaryExpression(final adwithoutruntime.BooleanBinaryExpression b) {
		return new modularactivitydiagram.revisitor.operations.impl.BooleanBinaryExpressionOperationImpl(b, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.BooleanBinaryExpression_AspectOperation booleanBinaryExpression_Aspect(final adruntime.BooleanBinaryExpression_Aspect b) {
		return new modularactivitydiagram.revisitor.operations.impl.BooleanBinaryExpression_AspectOperationImpl(b, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.BooleanBinaryExpression_AspectOperation expression_booleanBinaryExpression_Aspect(final adruntime.BooleanBinaryExpression_Aspect b) {
		return new modularactivitydiagram.revisitor.operations.impl.BooleanBinaryExpression_AspectOperationImpl(b, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.BooleanBinaryExpression_AspectOperation booleanExpression_booleanBinaryExpression_Aspect(final adruntime.BooleanBinaryExpression_Aspect b) {
		return new modularactivitydiagram.revisitor.operations.impl.BooleanBinaryExpression_AspectOperationImpl(b, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.BooleanBinaryExpression_AspectOperation booleanBinaryExpression_booleanBinaryExpression_Aspect(final adruntime.BooleanBinaryExpression_Aspect b) {
		return new modularactivitydiagram.revisitor.operations.impl.BooleanBinaryExpression_AspectOperationImpl(b, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.BooleanBinaryExpression_AspectOperation booleanExpression_Aspect_booleanBinaryExpression_Aspect(final adruntime.BooleanBinaryExpression_Aspect b) {
		return new modularactivitydiagram.revisitor.operations.impl.BooleanBinaryExpression_AspectOperationImpl(b, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.BooleanExpression_AspectOperation booleanExpression_Aspect(final adruntime.BooleanExpression_Aspect b) {
		return new modularactivitydiagram.revisitor.operations.impl.BooleanExpression_AspectOperationImpl(b, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.BooleanExpression_AspectOperation expression_booleanExpression_Aspect(final adruntime.BooleanExpression_Aspect b) {
		return new modularactivitydiagram.revisitor.operations.impl.BooleanExpression_AspectOperationImpl(b, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.BooleanExpression_AspectOperation booleanExpression_booleanExpression_Aspect(final adruntime.BooleanExpression_Aspect b) {
		return new modularactivitydiagram.revisitor.operations.impl.BooleanExpression_AspectOperationImpl(b, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.BooleanUnaryExpressionOperation booleanUnaryExpression(final adwithoutruntime.BooleanUnaryExpression b) {
		return new modularactivitydiagram.revisitor.operations.impl.BooleanUnaryExpressionOperationImpl(b, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.BooleanUnaryExpressionOperation expression_booleanUnaryExpression(final adwithoutruntime.BooleanUnaryExpression b) {
		return new modularactivitydiagram.revisitor.operations.impl.BooleanUnaryExpressionOperationImpl(b, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.BooleanUnaryExpressionOperation booleanExpression_booleanUnaryExpression(final adwithoutruntime.BooleanUnaryExpression b) {
		return new modularactivitydiagram.revisitor.operations.impl.BooleanUnaryExpressionOperationImpl(b, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.BooleanUnaryExpression_AspectOperation booleanUnaryExpression_Aspect(final adruntime.BooleanUnaryExpression_Aspect b) {
		return new modularactivitydiagram.revisitor.operations.impl.BooleanUnaryExpression_AspectOperationImpl(b, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.BooleanUnaryExpression_AspectOperation expression_booleanUnaryExpression_Aspect(final adruntime.BooleanUnaryExpression_Aspect b) {
		return new modularactivitydiagram.revisitor.operations.impl.BooleanUnaryExpression_AspectOperationImpl(b, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.BooleanUnaryExpression_AspectOperation booleanExpression_booleanUnaryExpression_Aspect(final adruntime.BooleanUnaryExpression_Aspect b) {
		return new modularactivitydiagram.revisitor.operations.impl.BooleanUnaryExpression_AspectOperationImpl(b, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.BooleanUnaryExpression_AspectOperation booleanUnaryExpression_booleanUnaryExpression_Aspect(final adruntime.BooleanUnaryExpression_Aspect b) {
		return new modularactivitydiagram.revisitor.operations.impl.BooleanUnaryExpression_AspectOperationImpl(b, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.BooleanUnaryExpression_AspectOperation booleanExpression_Aspect_booleanUnaryExpression_Aspect(final adruntime.BooleanUnaryExpression_Aspect b) {
		return new modularactivitydiagram.revisitor.operations.impl.BooleanUnaryExpression_AspectOperationImpl(b, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.BooleanValueOperation booleanValue(final adwithoutruntime.BooleanValue b) {
		return new modularactivitydiagram.revisitor.operations.impl.BooleanValueOperationImpl(b, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.BooleanValueOperation value_booleanValue(final adwithoutruntime.BooleanValue b) {
		return new modularactivitydiagram.revisitor.operations.impl.BooleanValueOperationImpl(b, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.BooleanVariableOperation booleanVariable(final adwithoutruntime.BooleanVariable b) {
		return new modularactivitydiagram.revisitor.operations.impl.BooleanVariableOperationImpl(b, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.BooleanVariableOperation variable_booleanVariable(final adwithoutruntime.BooleanVariable b) {
		return new modularactivitydiagram.revisitor.operations.impl.BooleanVariableOperationImpl(b, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.BooleanVariable_AspectOperation booleanVariable_Aspect(final adruntime.BooleanVariable_Aspect b) {
		return new modularactivitydiagram.revisitor.operations.impl.BooleanVariable_AspectOperationImpl(b, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.BooleanVariable_AspectOperation variable_booleanVariable_Aspect(final adruntime.BooleanVariable_Aspect b) {
		return new modularactivitydiagram.revisitor.operations.impl.BooleanVariable_AspectOperationImpl(b, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.BooleanVariable_AspectOperation booleanVariable_booleanVariable_Aspect(final adruntime.BooleanVariable_Aspect b) {
		return new modularactivitydiagram.revisitor.operations.impl.BooleanVariable_AspectOperationImpl(b, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.BooleanVariable_AspectOperation variable_Aspect_booleanVariable_Aspect(final adruntime.BooleanVariable_Aspect b) {
		return new modularactivitydiagram.revisitor.operations.impl.BooleanVariable_AspectOperationImpl(b, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ControlFlowOperation controlFlow(final adwithoutruntime.ControlFlow c) {
		return new modularactivitydiagram.revisitor.operations.impl.ControlFlowOperationImpl(c, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ControlFlowOperation namedElement_controlFlow(final adwithoutruntime.ControlFlow c) {
		return new modularactivitydiagram.revisitor.operations.impl.ControlFlowOperationImpl(c, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ControlFlowOperation activityEdge_controlFlow(final adwithoutruntime.ControlFlow c) {
		return new modularactivitydiagram.revisitor.operations.impl.ControlFlowOperationImpl(c, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ControlFlow_AspectOperation controlFlow_Aspect(final adruntime.ControlFlow_Aspect c) {
		return new modularactivitydiagram.revisitor.operations.impl.ControlFlow_AspectOperationImpl(c, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ControlFlow_AspectOperation namedElement_controlFlow_Aspect(final adruntime.ControlFlow_Aspect c) {
		return new modularactivitydiagram.revisitor.operations.impl.ControlFlow_AspectOperationImpl(c, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ControlFlow_AspectOperation activityEdge_controlFlow_Aspect(final adruntime.ControlFlow_Aspect c) {
		return new modularactivitydiagram.revisitor.operations.impl.ControlFlow_AspectOperationImpl(c, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ControlFlow_AspectOperation controlFlow_controlFlow_Aspect(final adruntime.ControlFlow_Aspect c) {
		return new modularactivitydiagram.revisitor.operations.impl.ControlFlow_AspectOperationImpl(c, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ControlFlow_AspectOperation activityEdge_Aspect_controlFlow_Aspect(final adruntime.ControlFlow_Aspect c) {
		return new modularactivitydiagram.revisitor.operations.impl.ControlFlow_AspectOperationImpl(c, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ControlNode_AspectOperation controlNode_Aspect(final adruntime.ControlNode_Aspect c) {
		return new modularactivitydiagram.revisitor.operations.impl.ControlNode_AspectOperationImpl(c, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ControlNode_AspectOperation namedElement_controlNode_Aspect(final adruntime.ControlNode_Aspect c) {
		return new modularactivitydiagram.revisitor.operations.impl.ControlNode_AspectOperationImpl(c, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ControlNode_AspectOperation activityNode_controlNode_Aspect(final adruntime.ControlNode_Aspect c) {
		return new modularactivitydiagram.revisitor.operations.impl.ControlNode_AspectOperationImpl(c, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ControlNode_AspectOperation controlNode_controlNode_Aspect(final adruntime.ControlNode_Aspect c) {
		return new modularactivitydiagram.revisitor.operations.impl.ControlNode_AspectOperationImpl(c, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ControlNode_AspectOperation activityNode_Aspect_controlNode_Aspect(final adruntime.ControlNode_Aspect c) {
		return new modularactivitydiagram.revisitor.operations.impl.ControlNode_AspectOperationImpl(c, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ControlTokenOperation controlToken(final adruntime.ControlToken c) {
		return new modularactivitydiagram.revisitor.operations.impl.ControlTokenOperationImpl(c, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ControlTokenOperation token_controlToken(final adruntime.ControlToken c) {
		return new modularactivitydiagram.revisitor.operations.impl.ControlTokenOperationImpl(c, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.DecisionNodeOperation decisionNode(final adwithoutruntime.DecisionNode d) {
		return new modularactivitydiagram.revisitor.operations.impl.DecisionNodeOperationImpl(d, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.DecisionNodeOperation namedElement_decisionNode(final adwithoutruntime.DecisionNode d) {
		return new modularactivitydiagram.revisitor.operations.impl.DecisionNodeOperationImpl(d, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.DecisionNodeOperation activityNode_decisionNode(final adwithoutruntime.DecisionNode d) {
		return new modularactivitydiagram.revisitor.operations.impl.DecisionNodeOperationImpl(d, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.DecisionNodeOperation controlNode_decisionNode(final adwithoutruntime.DecisionNode d) {
		return new modularactivitydiagram.revisitor.operations.impl.DecisionNodeOperationImpl(d, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.DecisionNode_AspectOperation decisionNode_Aspect(final adruntime.DecisionNode_Aspect d) {
		return new modularactivitydiagram.revisitor.operations.impl.DecisionNode_AspectOperationImpl(d, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.DecisionNode_AspectOperation namedElement_decisionNode_Aspect(final adruntime.DecisionNode_Aspect d) {
		return new modularactivitydiagram.revisitor.operations.impl.DecisionNode_AspectOperationImpl(d, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.DecisionNode_AspectOperation activityNode_decisionNode_Aspect(final adruntime.DecisionNode_Aspect d) {
		return new modularactivitydiagram.revisitor.operations.impl.DecisionNode_AspectOperationImpl(d, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.DecisionNode_AspectOperation controlNode_decisionNode_Aspect(final adruntime.DecisionNode_Aspect d) {
		return new modularactivitydiagram.revisitor.operations.impl.DecisionNode_AspectOperationImpl(d, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.DecisionNode_AspectOperation decisionNode_decisionNode_Aspect(final adruntime.DecisionNode_Aspect d) {
		return new modularactivitydiagram.revisitor.operations.impl.DecisionNode_AspectOperationImpl(d, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.DecisionNode_AspectOperation activityNode_Aspect_decisionNode_Aspect(final adruntime.DecisionNode_Aspect d) {
		return new modularactivitydiagram.revisitor.operations.impl.DecisionNode_AspectOperationImpl(d, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.DecisionNode_AspectOperation controlNode_Aspect_decisionNode_Aspect(final adruntime.DecisionNode_Aspect d) {
		return new modularactivitydiagram.revisitor.operations.impl.DecisionNode_AspectOperationImpl(d, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ExecutableNode_AspectOperation executableNode_Aspect(final adruntime.ExecutableNode_Aspect e) {
		return new modularactivitydiagram.revisitor.operations.impl.ExecutableNode_AspectOperationImpl(e, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ExecutableNode_AspectOperation namedElement_executableNode_Aspect(final adruntime.ExecutableNode_Aspect e) {
		return new modularactivitydiagram.revisitor.operations.impl.ExecutableNode_AspectOperationImpl(e, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ExecutableNode_AspectOperation activityNode_executableNode_Aspect(final adruntime.ExecutableNode_Aspect e) {
		return new modularactivitydiagram.revisitor.operations.impl.ExecutableNode_AspectOperationImpl(e, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ExecutableNode_AspectOperation executableNode_executableNode_Aspect(final adruntime.ExecutableNode_Aspect e) {
		return new modularactivitydiagram.revisitor.operations.impl.ExecutableNode_AspectOperationImpl(e, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ExecutableNode_AspectOperation activityNode_Aspect_executableNode_Aspect(final adruntime.ExecutableNode_Aspect e) {
		return new modularactivitydiagram.revisitor.operations.impl.ExecutableNode_AspectOperationImpl(e, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.FinalNode_AspectOperation finalNode_Aspect(final adruntime.FinalNode_Aspect f) {
		return new modularactivitydiagram.revisitor.operations.impl.FinalNode_AspectOperationImpl(f, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.FinalNode_AspectOperation namedElement_finalNode_Aspect(final adruntime.FinalNode_Aspect f) {
		return new modularactivitydiagram.revisitor.operations.impl.FinalNode_AspectOperationImpl(f, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.FinalNode_AspectOperation activityNode_finalNode_Aspect(final adruntime.FinalNode_Aspect f) {
		return new modularactivitydiagram.revisitor.operations.impl.FinalNode_AspectOperationImpl(f, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.FinalNode_AspectOperation controlNode_finalNode_Aspect(final adruntime.FinalNode_Aspect f) {
		return new modularactivitydiagram.revisitor.operations.impl.FinalNode_AspectOperationImpl(f, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.FinalNode_AspectOperation finalNode_finalNode_Aspect(final adruntime.FinalNode_Aspect f) {
		return new modularactivitydiagram.revisitor.operations.impl.FinalNode_AspectOperationImpl(f, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.FinalNode_AspectOperation activityNode_Aspect_finalNode_Aspect(final adruntime.FinalNode_Aspect f) {
		return new modularactivitydiagram.revisitor.operations.impl.FinalNode_AspectOperationImpl(f, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.FinalNode_AspectOperation controlNode_Aspect_finalNode_Aspect(final adruntime.FinalNode_Aspect f) {
		return new modularactivitydiagram.revisitor.operations.impl.FinalNode_AspectOperationImpl(f, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ForkNodeOperation forkNode(final adwithoutruntime.ForkNode f) {
		return new modularactivitydiagram.revisitor.operations.impl.ForkNodeOperationImpl(f, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ForkNodeOperation namedElement_forkNode(final adwithoutruntime.ForkNode f) {
		return new modularactivitydiagram.revisitor.operations.impl.ForkNodeOperationImpl(f, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ForkNodeOperation activityNode_forkNode(final adwithoutruntime.ForkNode f) {
		return new modularactivitydiagram.revisitor.operations.impl.ForkNodeOperationImpl(f, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ForkNodeOperation controlNode_forkNode(final adwithoutruntime.ForkNode f) {
		return new modularactivitydiagram.revisitor.operations.impl.ForkNodeOperationImpl(f, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ForkNode_AspectOperation forkNode_Aspect(final adruntime.ForkNode_Aspect f) {
		return new modularactivitydiagram.revisitor.operations.impl.ForkNode_AspectOperationImpl(f, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ForkNode_AspectOperation namedElement_forkNode_Aspect(final adruntime.ForkNode_Aspect f) {
		return new modularactivitydiagram.revisitor.operations.impl.ForkNode_AspectOperationImpl(f, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ForkNode_AspectOperation activityNode_forkNode_Aspect(final adruntime.ForkNode_Aspect f) {
		return new modularactivitydiagram.revisitor.operations.impl.ForkNode_AspectOperationImpl(f, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ForkNode_AspectOperation controlNode_forkNode_Aspect(final adruntime.ForkNode_Aspect f) {
		return new modularactivitydiagram.revisitor.operations.impl.ForkNode_AspectOperationImpl(f, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ForkNode_AspectOperation forkNode_forkNode_Aspect(final adruntime.ForkNode_Aspect f) {
		return new modularactivitydiagram.revisitor.operations.impl.ForkNode_AspectOperationImpl(f, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ForkNode_AspectOperation activityNode_Aspect_forkNode_Aspect(final adruntime.ForkNode_Aspect f) {
		return new modularactivitydiagram.revisitor.operations.impl.ForkNode_AspectOperationImpl(f, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ForkNode_AspectOperation controlNode_Aspect_forkNode_Aspect(final adruntime.ForkNode_Aspect f) {
		return new modularactivitydiagram.revisitor.operations.impl.ForkNode_AspectOperationImpl(f, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ForkedTokenOperation forkedToken(final adruntime.ForkedToken f) {
		return new modularactivitydiagram.revisitor.operations.impl.ForkedTokenOperationImpl(f, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.ForkedTokenOperation token_forkedToken(final adruntime.ForkedToken f) {
		return new modularactivitydiagram.revisitor.operations.impl.ForkedTokenOperationImpl(f, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.InitialNodeOperation initialNode(final adwithoutruntime.InitialNode i) {
		return new modularactivitydiagram.revisitor.operations.impl.InitialNodeOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.InitialNodeOperation namedElement_initialNode(final adwithoutruntime.InitialNode i) {
		return new modularactivitydiagram.revisitor.operations.impl.InitialNodeOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.InitialNodeOperation activityNode_initialNode(final adwithoutruntime.InitialNode i) {
		return new modularactivitydiagram.revisitor.operations.impl.InitialNodeOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.InitialNodeOperation controlNode_initialNode(final adwithoutruntime.InitialNode i) {
		return new modularactivitydiagram.revisitor.operations.impl.InitialNodeOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.InitialNode_AspectOperation initialNode_Aspect(final adruntime.InitialNode_Aspect i) {
		return new modularactivitydiagram.revisitor.operations.impl.InitialNode_AspectOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.InitialNode_AspectOperation namedElement_initialNode_Aspect(final adruntime.InitialNode_Aspect i) {
		return new modularactivitydiagram.revisitor.operations.impl.InitialNode_AspectOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.InitialNode_AspectOperation activityNode_initialNode_Aspect(final adruntime.InitialNode_Aspect i) {
		return new modularactivitydiagram.revisitor.operations.impl.InitialNode_AspectOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.InitialNode_AspectOperation controlNode_initialNode_Aspect(final adruntime.InitialNode_Aspect i) {
		return new modularactivitydiagram.revisitor.operations.impl.InitialNode_AspectOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.InitialNode_AspectOperation initialNode_initialNode_Aspect(final adruntime.InitialNode_Aspect i) {
		return new modularactivitydiagram.revisitor.operations.impl.InitialNode_AspectOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.InitialNode_AspectOperation activityNode_Aspect_initialNode_Aspect(final adruntime.InitialNode_Aspect i) {
		return new modularactivitydiagram.revisitor.operations.impl.InitialNode_AspectOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.InitialNode_AspectOperation controlNode_Aspect_initialNode_Aspect(final adruntime.InitialNode_Aspect i) {
		return new modularactivitydiagram.revisitor.operations.impl.InitialNode_AspectOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.InputOperation input(final adruntime.Input i) {
		return new modularactivitydiagram.revisitor.operations.impl.InputOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.InputValueOperation inputValue(final adruntime.InputValue i) {
		return new modularactivitydiagram.revisitor.operations.impl.InputValueOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.IntegerCalculationExpressionOperation integerCalculationExpression(final adwithoutruntime.IntegerCalculationExpression i) {
		return new modularactivitydiagram.revisitor.operations.impl.IntegerCalculationExpressionOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.IntegerCalculationExpressionOperation expression_integerCalculationExpression(final adwithoutruntime.IntegerCalculationExpression i) {
		return new modularactivitydiagram.revisitor.operations.impl.IntegerCalculationExpressionOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.IntegerCalculationExpressionOperation integerExpression_integerCalculationExpression(final adwithoutruntime.IntegerCalculationExpression i) {
		return new modularactivitydiagram.revisitor.operations.impl.IntegerCalculationExpressionOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.IntegerCalculationExpression_AspectOperation integerCalculationExpression_Aspect(final adruntime.IntegerCalculationExpression_Aspect i) {
		return new modularactivitydiagram.revisitor.operations.impl.IntegerCalculationExpression_AspectOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.IntegerCalculationExpression_AspectOperation expression_integerCalculationExpression_Aspect(final adruntime.IntegerCalculationExpression_Aspect i) {
		return new modularactivitydiagram.revisitor.operations.impl.IntegerCalculationExpression_AspectOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.IntegerCalculationExpression_AspectOperation integerExpression_integerCalculationExpression_Aspect(final adruntime.IntegerCalculationExpression_Aspect i) {
		return new modularactivitydiagram.revisitor.operations.impl.IntegerCalculationExpression_AspectOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.IntegerCalculationExpression_AspectOperation integerCalculationExpression_integerCalculationExpression_Aspect(final adruntime.IntegerCalculationExpression_Aspect i) {
		return new modularactivitydiagram.revisitor.operations.impl.IntegerCalculationExpression_AspectOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.IntegerCalculationExpression_AspectOperation integerExpression_Aspect_integerCalculationExpression_Aspect(final adruntime.IntegerCalculationExpression_Aspect i) {
		return new modularactivitydiagram.revisitor.operations.impl.IntegerCalculationExpression_AspectOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.IntegerComparisonExpressionOperation integerComparisonExpression(final adwithoutruntime.IntegerComparisonExpression i) {
		return new modularactivitydiagram.revisitor.operations.impl.IntegerComparisonExpressionOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.IntegerComparisonExpressionOperation expression_integerComparisonExpression(final adwithoutruntime.IntegerComparisonExpression i) {
		return new modularactivitydiagram.revisitor.operations.impl.IntegerComparisonExpressionOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.IntegerComparisonExpressionOperation integerExpression_integerComparisonExpression(final adwithoutruntime.IntegerComparisonExpression i) {
		return new modularactivitydiagram.revisitor.operations.impl.IntegerComparisonExpressionOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.IntegerComparisonExpression_AspectOperation integerComparisonExpression_Aspect(final adruntime.IntegerComparisonExpression_Aspect i) {
		return new modularactivitydiagram.revisitor.operations.impl.IntegerComparisonExpression_AspectOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.IntegerComparisonExpression_AspectOperation expression_integerComparisonExpression_Aspect(final adruntime.IntegerComparisonExpression_Aspect i) {
		return new modularactivitydiagram.revisitor.operations.impl.IntegerComparisonExpression_AspectOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.IntegerComparisonExpression_AspectOperation integerExpression_integerComparisonExpression_Aspect(final adruntime.IntegerComparisonExpression_Aspect i) {
		return new modularactivitydiagram.revisitor.operations.impl.IntegerComparisonExpression_AspectOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.IntegerComparisonExpression_AspectOperation integerComparisonExpression_integerComparisonExpression_Aspect(final adruntime.IntegerComparisonExpression_Aspect i) {
		return new modularactivitydiagram.revisitor.operations.impl.IntegerComparisonExpression_AspectOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.IntegerComparisonExpression_AspectOperation integerExpression_Aspect_integerComparisonExpression_Aspect(final adruntime.IntegerComparisonExpression_Aspect i) {
		return new modularactivitydiagram.revisitor.operations.impl.IntegerComparisonExpression_AspectOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.IntegerExpression_AspectOperation integerExpression_Aspect(final adruntime.IntegerExpression_Aspect i) {
		return new modularactivitydiagram.revisitor.operations.impl.IntegerExpression_AspectOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.IntegerExpression_AspectOperation expression_integerExpression_Aspect(final adruntime.IntegerExpression_Aspect i) {
		return new modularactivitydiagram.revisitor.operations.impl.IntegerExpression_AspectOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.IntegerExpression_AspectOperation integerExpression_integerExpression_Aspect(final adruntime.IntegerExpression_Aspect i) {
		return new modularactivitydiagram.revisitor.operations.impl.IntegerExpression_AspectOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.IntegerValueOperation integerValue(final adwithoutruntime.IntegerValue i) {
		return new modularactivitydiagram.revisitor.operations.impl.IntegerValueOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.IntegerValueOperation value_integerValue(final adwithoutruntime.IntegerValue i) {
		return new modularactivitydiagram.revisitor.operations.impl.IntegerValueOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.IntegerVariableOperation integerVariable(final adwithoutruntime.IntegerVariable i) {
		return new modularactivitydiagram.revisitor.operations.impl.IntegerVariableOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.IntegerVariableOperation variable_integerVariable(final adwithoutruntime.IntegerVariable i) {
		return new modularactivitydiagram.revisitor.operations.impl.IntegerVariableOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.IntegerVariable_AspectOperation integerVariable_Aspect(final adruntime.IntegerVariable_Aspect i) {
		return new modularactivitydiagram.revisitor.operations.impl.IntegerVariable_AspectOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.IntegerVariable_AspectOperation variable_integerVariable_Aspect(final adruntime.IntegerVariable_Aspect i) {
		return new modularactivitydiagram.revisitor.operations.impl.IntegerVariable_AspectOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.IntegerVariable_AspectOperation integerVariable_integerVariable_Aspect(final adruntime.IntegerVariable_Aspect i) {
		return new modularactivitydiagram.revisitor.operations.impl.IntegerVariable_AspectOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.IntegerVariable_AspectOperation variable_Aspect_integerVariable_Aspect(final adruntime.IntegerVariable_Aspect i) {
		return new modularactivitydiagram.revisitor.operations.impl.IntegerVariable_AspectOperationImpl(i, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.JoinNodeOperation joinNode(final adwithoutruntime.JoinNode j) {
		return new modularactivitydiagram.revisitor.operations.impl.JoinNodeOperationImpl(j, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.JoinNodeOperation namedElement_joinNode(final adwithoutruntime.JoinNode j) {
		return new modularactivitydiagram.revisitor.operations.impl.JoinNodeOperationImpl(j, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.JoinNodeOperation activityNode_joinNode(final adwithoutruntime.JoinNode j) {
		return new modularactivitydiagram.revisitor.operations.impl.JoinNodeOperationImpl(j, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.JoinNodeOperation controlNode_joinNode(final adwithoutruntime.JoinNode j) {
		return new modularactivitydiagram.revisitor.operations.impl.JoinNodeOperationImpl(j, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.JoinNode_AspectOperation joinNode_Aspect(final adruntime.JoinNode_Aspect j) {
		return new modularactivitydiagram.revisitor.operations.impl.JoinNode_AspectOperationImpl(j, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.JoinNode_AspectOperation namedElement_joinNode_Aspect(final adruntime.JoinNode_Aspect j) {
		return new modularactivitydiagram.revisitor.operations.impl.JoinNode_AspectOperationImpl(j, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.JoinNode_AspectOperation activityNode_joinNode_Aspect(final adruntime.JoinNode_Aspect j) {
		return new modularactivitydiagram.revisitor.operations.impl.JoinNode_AspectOperationImpl(j, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.JoinNode_AspectOperation controlNode_joinNode_Aspect(final adruntime.JoinNode_Aspect j) {
		return new modularactivitydiagram.revisitor.operations.impl.JoinNode_AspectOperationImpl(j, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.JoinNode_AspectOperation joinNode_joinNode_Aspect(final adruntime.JoinNode_Aspect j) {
		return new modularactivitydiagram.revisitor.operations.impl.JoinNode_AspectOperationImpl(j, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.JoinNode_AspectOperation activityNode_Aspect_joinNode_Aspect(final adruntime.JoinNode_Aspect j) {
		return new modularactivitydiagram.revisitor.operations.impl.JoinNode_AspectOperationImpl(j, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.JoinNode_AspectOperation controlNode_Aspect_joinNode_Aspect(final adruntime.JoinNode_Aspect j) {
		return new modularactivitydiagram.revisitor.operations.impl.JoinNode_AspectOperationImpl(j, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.MergeNodeOperation mergeNode(final adwithoutruntime.MergeNode m) {
		return new modularactivitydiagram.revisitor.operations.impl.MergeNodeOperationImpl(m, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.MergeNodeOperation namedElement_mergeNode(final adwithoutruntime.MergeNode m) {
		return new modularactivitydiagram.revisitor.operations.impl.MergeNodeOperationImpl(m, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.MergeNodeOperation activityNode_mergeNode(final adwithoutruntime.MergeNode m) {
		return new modularactivitydiagram.revisitor.operations.impl.MergeNodeOperationImpl(m, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.MergeNodeOperation controlNode_mergeNode(final adwithoutruntime.MergeNode m) {
		return new modularactivitydiagram.revisitor.operations.impl.MergeNodeOperationImpl(m, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.MergeNode_AspectOperation mergeNode_Aspect(final adruntime.MergeNode_Aspect m) {
		return new modularactivitydiagram.revisitor.operations.impl.MergeNode_AspectOperationImpl(m, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.MergeNode_AspectOperation namedElement_mergeNode_Aspect(final adruntime.MergeNode_Aspect m) {
		return new modularactivitydiagram.revisitor.operations.impl.MergeNode_AspectOperationImpl(m, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.MergeNode_AspectOperation activityNode_mergeNode_Aspect(final adruntime.MergeNode_Aspect m) {
		return new modularactivitydiagram.revisitor.operations.impl.MergeNode_AspectOperationImpl(m, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.MergeNode_AspectOperation controlNode_mergeNode_Aspect(final adruntime.MergeNode_Aspect m) {
		return new modularactivitydiagram.revisitor.operations.impl.MergeNode_AspectOperationImpl(m, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.MergeNode_AspectOperation mergeNode_mergeNode_Aspect(final adruntime.MergeNode_Aspect m) {
		return new modularactivitydiagram.revisitor.operations.impl.MergeNode_AspectOperationImpl(m, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.MergeNode_AspectOperation activityNode_Aspect_mergeNode_Aspect(final adruntime.MergeNode_Aspect m) {
		return new modularactivitydiagram.revisitor.operations.impl.MergeNode_AspectOperationImpl(m, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.MergeNode_AspectOperation controlNode_Aspect_mergeNode_Aspect(final adruntime.MergeNode_Aspect m) {
		return new modularactivitydiagram.revisitor.operations.impl.MergeNode_AspectOperationImpl(m, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.OfferOperation offer(final adruntime.Offer o) {
		return new modularactivitydiagram.revisitor.operations.impl.OfferOperationImpl(o, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.OpaqueActionOperation opaqueAction(final adwithoutruntime.OpaqueAction o) {
		return new modularactivitydiagram.revisitor.operations.impl.OpaqueActionOperationImpl(o, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.OpaqueActionOperation namedElement_opaqueAction(final adwithoutruntime.OpaqueAction o) {
		return new modularactivitydiagram.revisitor.operations.impl.OpaqueActionOperationImpl(o, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.OpaqueActionOperation activityNode_opaqueAction(final adwithoutruntime.OpaqueAction o) {
		return new modularactivitydiagram.revisitor.operations.impl.OpaqueActionOperationImpl(o, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.OpaqueActionOperation executableNode_opaqueAction(final adwithoutruntime.OpaqueAction o) {
		return new modularactivitydiagram.revisitor.operations.impl.OpaqueActionOperationImpl(o, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.OpaqueActionOperation action_opaqueAction(final adwithoutruntime.OpaqueAction o) {
		return new modularactivitydiagram.revisitor.operations.impl.OpaqueActionOperationImpl(o, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.OpaqueAction_AspectOperation opaqueAction_Aspect(final adruntime.OpaqueAction_Aspect o) {
		return new modularactivitydiagram.revisitor.operations.impl.OpaqueAction_AspectOperationImpl(o, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.OpaqueAction_AspectOperation namedElement_opaqueAction_Aspect(final adruntime.OpaqueAction_Aspect o) {
		return new modularactivitydiagram.revisitor.operations.impl.OpaqueAction_AspectOperationImpl(o, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.OpaqueAction_AspectOperation activityNode_opaqueAction_Aspect(final adruntime.OpaqueAction_Aspect o) {
		return new modularactivitydiagram.revisitor.operations.impl.OpaqueAction_AspectOperationImpl(o, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.OpaqueAction_AspectOperation executableNode_opaqueAction_Aspect(final adruntime.OpaqueAction_Aspect o) {
		return new modularactivitydiagram.revisitor.operations.impl.OpaqueAction_AspectOperationImpl(o, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.OpaqueAction_AspectOperation action_opaqueAction_Aspect(final adruntime.OpaqueAction_Aspect o) {
		return new modularactivitydiagram.revisitor.operations.impl.OpaqueAction_AspectOperationImpl(o, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.OpaqueAction_AspectOperation opaqueAction_opaqueAction_Aspect(final adruntime.OpaqueAction_Aspect o) {
		return new modularactivitydiagram.revisitor.operations.impl.OpaqueAction_AspectOperationImpl(o, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.OpaqueAction_AspectOperation activityNode_Aspect_opaqueAction_Aspect(final adruntime.OpaqueAction_Aspect o) {
		return new modularactivitydiagram.revisitor.operations.impl.OpaqueAction_AspectOperationImpl(o, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.OpaqueAction_AspectOperation executableNode_Aspect_opaqueAction_Aspect(final adruntime.OpaqueAction_Aspect o) {
		return new modularactivitydiagram.revisitor.operations.impl.OpaqueAction_AspectOperationImpl(o, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.OpaqueAction_AspectOperation action_Aspect_opaqueAction_Aspect(final adruntime.OpaqueAction_Aspect o) {
		return new modularactivitydiagram.revisitor.operations.impl.OpaqueAction_AspectOperationImpl(o, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.TokenOperation token(final adruntime.Token t) {
		return new modularactivitydiagram.revisitor.operations.impl.TokenOperationImpl(t, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.TraceOperation trace(final adruntime.Trace t) {
		return new modularactivitydiagram.revisitor.operations.impl.TraceOperationImpl(t, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.Variable_AspectOperation variable_Aspect(final adruntime.Variable_Aspect v) {
		return new modularactivitydiagram.revisitor.operations.impl.Variable_AspectOperationImpl(v, this);
	}
	@Override
	default modularactivitydiagram.revisitor.operations.Variable_AspectOperation variable_variable_Aspect(final adruntime.Variable_Aspect v) {
		return new modularactivitydiagram.revisitor.operations.impl.Variable_AspectOperationImpl(v, this);
	}
}
