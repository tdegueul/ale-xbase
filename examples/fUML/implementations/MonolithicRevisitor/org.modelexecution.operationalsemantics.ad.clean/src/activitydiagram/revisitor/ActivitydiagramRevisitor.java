package activitydiagram.revisitor;

public interface ActivitydiagramRevisitor<Activitydiagram__ActionT extends Activitydiagram__ExecutableNodeT, Activitydiagram__ActivityT extends Activitydiagram__NamedElementT, Activitydiagram__ActivityEdgeT extends Activitydiagram__NamedElementT, Activitydiagram__ActivityFinalNodeT extends Activitydiagram__FinalNodeT, Activitydiagram__ActivityNodeT extends Activitydiagram__NamedElementT, Activitydiagram__BooleanBinaryExpressionT extends Activitydiagram__BooleanExpressionT, Activitydiagram__BooleanExpressionT extends Activitydiagram__ExpressionT, Activitydiagram__BooleanUnaryExpressionT extends Activitydiagram__BooleanExpressionT, Activitydiagram__BooleanValueT extends Activitydiagram__ValueT, Activitydiagram__BooleanVariableT extends Activitydiagram__VariableT, Activitydiagram__ControlFlowT extends Activitydiagram__ActivityEdgeT, Activitydiagram__ControlNodeT extends Activitydiagram__ActivityNodeT, Activitydiagram__ControlTokenT extends Activitydiagram__TokenT, Activitydiagram__DecisionNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__ExecutableNodeT extends Activitydiagram__ActivityNodeT, Activitydiagram__ExpressionT, Activitydiagram__FinalNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__ForkNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__ForkedTokenT extends Activitydiagram__TokenT, Activitydiagram__InitialNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__InputT, Activitydiagram__InputValueT, Activitydiagram__IntegerCalculationExpressionT extends Activitydiagram__IntegerExpressionT, Activitydiagram__IntegerComparisonExpressionT extends Activitydiagram__IntegerExpressionT, Activitydiagram__IntegerExpressionT extends Activitydiagram__ExpressionT, Activitydiagram__IntegerValueT extends Activitydiagram__ValueT, Activitydiagram__IntegerVariableT extends Activitydiagram__VariableT, Activitydiagram__JoinNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__MergeNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__NamedElementT, Activitydiagram__OfferT, Activitydiagram__OpaqueActionT extends Activitydiagram__ActionT, Activitydiagram__TokenT, Activitydiagram__TraceT, Activitydiagram__ValueT, Activitydiagram__VariableT> {
	Activitydiagram__ActivityT activity(final activitydiagram.Activity it);
	Activitydiagram__ActivityFinalNodeT activityFinalNode(final activitydiagram.ActivityFinalNode it);
	Activitydiagram__BooleanBinaryExpressionT booleanBinaryExpression(final activitydiagram.BooleanBinaryExpression it);
	Activitydiagram__BooleanUnaryExpressionT booleanUnaryExpression(final activitydiagram.BooleanUnaryExpression it);
	Activitydiagram__BooleanValueT booleanValue(final activitydiagram.BooleanValue it);
	Activitydiagram__BooleanVariableT booleanVariable(final activitydiagram.BooleanVariable it);
	Activitydiagram__ControlFlowT controlFlow(final activitydiagram.ControlFlow it);
	Activitydiagram__ControlTokenT controlToken(final activitydiagram.ControlToken it);
	Activitydiagram__DecisionNodeT decisionNode(final activitydiagram.DecisionNode it);
	Activitydiagram__ForkNodeT forkNode(final activitydiagram.ForkNode it);
	Activitydiagram__ForkedTokenT forkedToken(final activitydiagram.ForkedToken it);
	Activitydiagram__InitialNodeT initialNode(final activitydiagram.InitialNode it);
	Activitydiagram__InputT input(final activitydiagram.Input it);
	Activitydiagram__InputValueT inputValue(final activitydiagram.InputValue it);
	Activitydiagram__IntegerCalculationExpressionT integerCalculationExpression(final activitydiagram.IntegerCalculationExpression it);
	Activitydiagram__IntegerComparisonExpressionT integerComparisonExpression(final activitydiagram.IntegerComparisonExpression it);
	Activitydiagram__IntegerValueT integerValue(final activitydiagram.IntegerValue it);
	Activitydiagram__IntegerVariableT integerVariable(final activitydiagram.IntegerVariable it);
	Activitydiagram__JoinNodeT joinNode(final activitydiagram.JoinNode it);
	Activitydiagram__MergeNodeT mergeNode(final activitydiagram.MergeNode it);
	Activitydiagram__OfferT offer(final activitydiagram.Offer it);
	Activitydiagram__OpaqueActionT opaqueAction(final activitydiagram.OpaqueAction it);
	Activitydiagram__TraceT trace(final activitydiagram.Trace it);

	default Activitydiagram__ActionT $(final activitydiagram.Action it) {
		if (it.getClass() == activitydiagram.impl.OpaqueActionImpl.class)
			return opaqueAction((activitydiagram.OpaqueAction) it);
		return null;
	}
	default Activitydiagram__ActivityT $(final activitydiagram.Activity it) {
		return activity(it);
	}
	default Activitydiagram__ActivityEdgeT $(final activitydiagram.ActivityEdge it) {
		if (it.getClass() == activitydiagram.impl.ControlFlowImpl.class)
			return controlFlow((activitydiagram.ControlFlow) it);
		return null;
	}
	default Activitydiagram__ActivityFinalNodeT $(final activitydiagram.ActivityFinalNode it) {
		return activityFinalNode(it);
	}
	default Activitydiagram__ActivityNodeT $(final activitydiagram.ActivityNode it) {
		if (it.getClass() == activitydiagram.impl.ActivityFinalNodeImpl.class)
			return activityFinalNode((activitydiagram.ActivityFinalNode) it);
		if (it.getClass() == activitydiagram.impl.DecisionNodeImpl.class)
			return decisionNode((activitydiagram.DecisionNode) it);
		if (it.getClass() == activitydiagram.impl.ForkNodeImpl.class)
			return forkNode((activitydiagram.ForkNode) it);
		if (it.getClass() == activitydiagram.impl.InitialNodeImpl.class)
			return initialNode((activitydiagram.InitialNode) it);
		if (it.getClass() == activitydiagram.impl.JoinNodeImpl.class)
			return joinNode((activitydiagram.JoinNode) it);
		if (it.getClass() == activitydiagram.impl.MergeNodeImpl.class)
			return mergeNode((activitydiagram.MergeNode) it);
		if (it.getClass() == activitydiagram.impl.OpaqueActionImpl.class)
			return opaqueAction((activitydiagram.OpaqueAction) it);
		return null;
	}
	default Activitydiagram__BooleanBinaryExpressionT $(final activitydiagram.BooleanBinaryExpression it) {
		return booleanBinaryExpression(it);
	}
	default Activitydiagram__BooleanExpressionT $(final activitydiagram.BooleanExpression it) {
		if (it.getClass() == activitydiagram.impl.BooleanBinaryExpressionImpl.class)
			return booleanBinaryExpression((activitydiagram.BooleanBinaryExpression) it);
		if (it.getClass() == activitydiagram.impl.BooleanUnaryExpressionImpl.class)
			return booleanUnaryExpression((activitydiagram.BooleanUnaryExpression) it);
		return null;
	}
	default Activitydiagram__BooleanUnaryExpressionT $(final activitydiagram.BooleanUnaryExpression it) {
		return booleanUnaryExpression(it);
	}
	default Activitydiagram__BooleanValueT $(final activitydiagram.BooleanValue it) {
		return booleanValue(it);
	}
	default Activitydiagram__BooleanVariableT $(final activitydiagram.BooleanVariable it) {
		return booleanVariable(it);
	}
	default Activitydiagram__ControlFlowT $(final activitydiagram.ControlFlow it) {
		return controlFlow(it);
	}
	default Activitydiagram__ControlNodeT $(final activitydiagram.ControlNode it) {
		if (it.getClass() == activitydiagram.impl.ActivityFinalNodeImpl.class)
			return activityFinalNode((activitydiagram.ActivityFinalNode) it);
		if (it.getClass() == activitydiagram.impl.DecisionNodeImpl.class)
			return decisionNode((activitydiagram.DecisionNode) it);
		if (it.getClass() == activitydiagram.impl.ForkNodeImpl.class)
			return forkNode((activitydiagram.ForkNode) it);
		if (it.getClass() == activitydiagram.impl.InitialNodeImpl.class)
			return initialNode((activitydiagram.InitialNode) it);
		if (it.getClass() == activitydiagram.impl.JoinNodeImpl.class)
			return joinNode((activitydiagram.JoinNode) it);
		if (it.getClass() == activitydiagram.impl.MergeNodeImpl.class)
			return mergeNode((activitydiagram.MergeNode) it);
		return null;
	}
	default Activitydiagram__ControlTokenT $(final activitydiagram.ControlToken it) {
		return controlToken(it);
	}
	default Activitydiagram__DecisionNodeT $(final activitydiagram.DecisionNode it) {
		return decisionNode(it);
	}
	default Activitydiagram__ExecutableNodeT $(final activitydiagram.ExecutableNode it) {
		if (it.getClass() == activitydiagram.impl.OpaqueActionImpl.class)
			return opaqueAction((activitydiagram.OpaqueAction) it);
		return null;
	}
	default Activitydiagram__ExpressionT $(final activitydiagram.Expression it) {
		if (it.getClass() == activitydiagram.impl.BooleanBinaryExpressionImpl.class)
			return booleanBinaryExpression((activitydiagram.BooleanBinaryExpression) it);
		if (it.getClass() == activitydiagram.impl.BooleanUnaryExpressionImpl.class)
			return booleanUnaryExpression((activitydiagram.BooleanUnaryExpression) it);
		if (it.getClass() == activitydiagram.impl.IntegerCalculationExpressionImpl.class)
			return integerCalculationExpression((activitydiagram.IntegerCalculationExpression) it);
		if (it.getClass() == activitydiagram.impl.IntegerComparisonExpressionImpl.class)
			return integerComparisonExpression((activitydiagram.IntegerComparisonExpression) it);
		return null;
	}
	default Activitydiagram__FinalNodeT $(final activitydiagram.FinalNode it) {
		if (it.getClass() == activitydiagram.impl.ActivityFinalNodeImpl.class)
			return activityFinalNode((activitydiagram.ActivityFinalNode) it);
		return null;
	}
	default Activitydiagram__ForkNodeT $(final activitydiagram.ForkNode it) {
		return forkNode(it);
	}
	default Activitydiagram__ForkedTokenT $(final activitydiagram.ForkedToken it) {
		return forkedToken(it);
	}
	default Activitydiagram__InitialNodeT $(final activitydiagram.InitialNode it) {
		return initialNode(it);
	}
	default Activitydiagram__InputT $(final activitydiagram.Input it) {
		return input(it);
	}
	default Activitydiagram__InputValueT $(final activitydiagram.InputValue it) {
		return inputValue(it);
	}
	default Activitydiagram__IntegerCalculationExpressionT $(final activitydiagram.IntegerCalculationExpression it) {
		return integerCalculationExpression(it);
	}
	default Activitydiagram__IntegerComparisonExpressionT $(final activitydiagram.IntegerComparisonExpression it) {
		return integerComparisonExpression(it);
	}
	default Activitydiagram__IntegerExpressionT $(final activitydiagram.IntegerExpression it) {
		if (it.getClass() == activitydiagram.impl.IntegerCalculationExpressionImpl.class)
			return integerCalculationExpression((activitydiagram.IntegerCalculationExpression) it);
		if (it.getClass() == activitydiagram.impl.IntegerComparisonExpressionImpl.class)
			return integerComparisonExpression((activitydiagram.IntegerComparisonExpression) it);
		return null;
	}
	default Activitydiagram__IntegerValueT $(final activitydiagram.IntegerValue it) {
		return integerValue(it);
	}
	default Activitydiagram__IntegerVariableT $(final activitydiagram.IntegerVariable it) {
		return integerVariable(it);
	}
	default Activitydiagram__JoinNodeT $(final activitydiagram.JoinNode it) {
		return joinNode(it);
	}
	default Activitydiagram__MergeNodeT $(final activitydiagram.MergeNode it) {
		return mergeNode(it);
	}
	default Activitydiagram__NamedElementT $(final activitydiagram.NamedElement it) {
		if (it.getClass() == activitydiagram.impl.ActivityImpl.class)
			return activity((activitydiagram.Activity) it);
		if (it.getClass() == activitydiagram.impl.ActivityFinalNodeImpl.class)
			return activityFinalNode((activitydiagram.ActivityFinalNode) it);
		if (it.getClass() == activitydiagram.impl.ControlFlowImpl.class)
			return controlFlow((activitydiagram.ControlFlow) it);
		if (it.getClass() == activitydiagram.impl.DecisionNodeImpl.class)
			return decisionNode((activitydiagram.DecisionNode) it);
		if (it.getClass() == activitydiagram.impl.ForkNodeImpl.class)
			return forkNode((activitydiagram.ForkNode) it);
		if (it.getClass() == activitydiagram.impl.InitialNodeImpl.class)
			return initialNode((activitydiagram.InitialNode) it);
		if (it.getClass() == activitydiagram.impl.JoinNodeImpl.class)
			return joinNode((activitydiagram.JoinNode) it);
		if (it.getClass() == activitydiagram.impl.MergeNodeImpl.class)
			return mergeNode((activitydiagram.MergeNode) it);
		if (it.getClass() == activitydiagram.impl.OpaqueActionImpl.class)
			return opaqueAction((activitydiagram.OpaqueAction) it);
		return null;
	}
	default Activitydiagram__OfferT $(final activitydiagram.Offer it) {
		return offer(it);
	}
	default Activitydiagram__OpaqueActionT $(final activitydiagram.OpaqueAction it) {
		return opaqueAction(it);
	}
	default Activitydiagram__TokenT $(final activitydiagram.Token it) {
		if (it.getClass() == activitydiagram.impl.ControlTokenImpl.class)
			return controlToken((activitydiagram.ControlToken) it);
		if (it.getClass() == activitydiagram.impl.ForkedTokenImpl.class)
			return forkedToken((activitydiagram.ForkedToken) it);
		return null;
	}
	default Activitydiagram__TraceT $(final activitydiagram.Trace it) {
		return trace(it);
	}
	default Activitydiagram__ValueT $(final activitydiagram.Value it) {
		if (it.getClass() == activitydiagram.impl.BooleanValueImpl.class)
			return booleanValue((activitydiagram.BooleanValue) it);
		if (it.getClass() == activitydiagram.impl.IntegerValueImpl.class)
			return integerValue((activitydiagram.IntegerValue) it);
		return null;
	}
	default Activitydiagram__VariableT $(final activitydiagram.Variable it) {
		if (it.getClass() == activitydiagram.impl.BooleanVariableImpl.class)
			return booleanVariable((activitydiagram.BooleanVariable) it);
		if (it.getClass() == activitydiagram.impl.IntegerVariableImpl.class)
			return integerVariable((activitydiagram.IntegerVariable) it);
		return null;
	}
}
