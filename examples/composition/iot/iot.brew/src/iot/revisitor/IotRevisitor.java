package iot.revisitor;

public interface IotRevisitor<Activitydiagram__ActionT extends Activitydiagram__ExecutableNodeT, Activitydiagram__ActivityT extends Activitydiagram__NamedElementT, Activitydiagram__ActivityEdgeT extends Activitydiagram__NamedElementT, Activitydiagram__ActivityFinalNodeT extends Activitydiagram__FinalNodeT, Activitydiagram__ActivityNodeT extends Activitydiagram__NamedElementT, Simpleexpressions__BooleanBinaryExpressionT extends Simpleexpressions__BooleanExpressionT, Simpleexpressions__BooleanExpressionT extends Simpleexpressions__ExpressionT, Simpleexpressions__BooleanUnaryExpressionT extends Simpleexpressions__BooleanExpressionT, Activitydiagram__BooleanValueT extends Activitydiagram__ValueT, Simpleexpressions__BooleanValueT extends Simpleexpressions__ValueT, Iot__BooleanValueBindBooleanValueT extends Activitydiagram__BooleanValueT, Activitydiagram__BooleanVariableT extends Activitydiagram__VariableT, Simpleexpressions__BooleanVariableT extends Simpleexpressions__VariableT, Iot__BooleanVariableBindBooleanVariableT extends Activitydiagram__BooleanVariableT, Activitydiagram__ControlFlowT extends Activitydiagram__ActivityEdgeT, Activitydiagram__ControlNodeT extends Activitydiagram__ActivityNodeT, Activitydiagram__DecisionNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__ExecutableNodeT extends Activitydiagram__ActivityNodeT, Activitydiagram__ExpressionT, Simpleexpressions__ExpressionT, Iot__ExpressionBindExpressionT extends Activitydiagram__ExpressionT, Activitydiagram__FinalNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__ForkNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__InitialNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__InputT, Activitydiagram__InputValueT, Simpleexpressions__IntegerCalculationExpressionT extends Simpleexpressions__IntegerExpressionT, Simpleexpressions__IntegerComparisonExpressionT extends Simpleexpressions__IntegerExpressionT, Simpleexpressions__IntegerExpressionT extends Simpleexpressions__ExpressionT, Activitydiagram__IntegerValueT extends Activitydiagram__ValueT, Simpleexpressions__IntegerValueT extends Simpleexpressions__ValueT, Iot__IntegerValueBindIntegerValueT extends Activitydiagram__IntegerValueT, Simpleexpressions__IntegerVariableT extends Simpleexpressions__VariableT, Activitydiagram__JoinNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__MergeNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__NamedElementT, Activitydiagram__OpaqueActionT extends Activitydiagram__ActionT, Activitydiagram__ValueT, Simpleexpressions__ValueT, Iot__ValueBindValueT extends Activitydiagram__ValueT, Activitydiagram__VariableT, Simpleexpressions__VariableT>
	extends activitydiagram.revisitor.ActivitydiagramRevisitor<Activitydiagram__ActionT, Activitydiagram__ActivityT, Activitydiagram__ActivityEdgeT, Activitydiagram__ActivityFinalNodeT, Activitydiagram__ActivityNodeT, Activitydiagram__BooleanValueT, Activitydiagram__BooleanVariableT, Activitydiagram__ControlFlowT, Activitydiagram__ControlNodeT, Activitydiagram__DecisionNodeT, Activitydiagram__ExecutableNodeT, Activitydiagram__ExpressionT, Activitydiagram__FinalNodeT, Activitydiagram__ForkNodeT, Activitydiagram__InitialNodeT, Activitydiagram__InputT, Activitydiagram__InputValueT, Activitydiagram__IntegerValueT, Activitydiagram__JoinNodeT, Activitydiagram__MergeNodeT, Activitydiagram__NamedElementT, Activitydiagram__OpaqueActionT, Activitydiagram__ValueT, Activitydiagram__VariableT>,
		simpleexpressions.revisitor.SimpleexpressionsRevisitor<Simpleexpressions__BooleanBinaryExpressionT, Simpleexpressions__BooleanExpressionT, Simpleexpressions__BooleanUnaryExpressionT, Simpleexpressions__BooleanValueT, Simpleexpressions__BooleanVariableT, Simpleexpressions__ExpressionT, Simpleexpressions__IntegerCalculationExpressionT, Simpleexpressions__IntegerComparisonExpressionT, Simpleexpressions__IntegerExpressionT, Simpleexpressions__IntegerValueT, Simpleexpressions__IntegerVariableT, Simpleexpressions__ValueT, Simpleexpressions__VariableT> {
	Iot__BooleanValueBindBooleanValueT booleanValueBindBooleanValue(final iot.BooleanValueBindBooleanValue it);
	Iot__BooleanVariableBindBooleanVariableT booleanVariableBindBooleanVariable(final iot.BooleanVariableBindBooleanVariable it);
	Iot__ExpressionBindExpressionT expressionBindExpression(final iot.ExpressionBindExpression it);
	Iot__IntegerValueBindIntegerValueT integerValueBindIntegerValue(final iot.IntegerValueBindIntegerValue it);
	Iot__ValueBindValueT valueBindValue(final iot.ValueBindValue it);

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
	default Simpleexpressions__BooleanBinaryExpressionT $(final simpleexpressions.BooleanBinaryExpression it) {
		return booleanBinaryExpression(it);
	}
	default Simpleexpressions__BooleanExpressionT $(final simpleexpressions.BooleanExpression it) {
		if (it.getClass() == simpleexpressions.impl.BooleanBinaryExpressionImpl.class)
			return booleanBinaryExpression((simpleexpressions.BooleanBinaryExpression) it);
		if (it.getClass() == simpleexpressions.impl.BooleanUnaryExpressionImpl.class)
			return booleanUnaryExpression((simpleexpressions.BooleanUnaryExpression) it);
		return null;
	}
	default Simpleexpressions__BooleanUnaryExpressionT $(final simpleexpressions.BooleanUnaryExpression it) {
		return booleanUnaryExpression(it);
	}
	default Activitydiagram__BooleanValueT $(final activitydiagram.BooleanValue it) {
		if (it.getClass() == iot.impl.BooleanValueBindBooleanValueImpl.class)
			return booleanValueBindBooleanValue((iot.BooleanValueBindBooleanValue) it);
		return null;
	}
	default Simpleexpressions__BooleanValueT $(final simpleexpressions.BooleanValue it) {
		return booleanValue(it);
	}
	default Iot__BooleanValueBindBooleanValueT $(final iot.BooleanValueBindBooleanValue it) {
		return booleanValueBindBooleanValue(it);
	}
	default Activitydiagram__BooleanVariableT $(final activitydiagram.BooleanVariable it) {
		if (it.getClass() == iot.impl.BooleanVariableBindBooleanVariableImpl.class)
			return booleanVariableBindBooleanVariable((iot.BooleanVariableBindBooleanVariable) it);
		return null;
	}
	default Simpleexpressions__BooleanVariableT $(final simpleexpressions.BooleanVariable it) {
		return booleanVariable(it);
	}
	default Iot__BooleanVariableBindBooleanVariableT $(final iot.BooleanVariableBindBooleanVariable it) {
		return booleanVariableBindBooleanVariable(it);
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
	default Activitydiagram__DecisionNodeT $(final activitydiagram.DecisionNode it) {
		return decisionNode(it);
	}
	default Activitydiagram__ExecutableNodeT $(final activitydiagram.ExecutableNode it) {
		if (it.getClass() == activitydiagram.impl.OpaqueActionImpl.class)
			return opaqueAction((activitydiagram.OpaqueAction) it);
		return null;
	}
	default Activitydiagram__ExpressionT $(final activitydiagram.Expression it) {
		if (it.getClass() == iot.impl.ExpressionBindExpressionImpl.class)
			return expressionBindExpression((iot.ExpressionBindExpression) it);
		return null;
	}
	default Simpleexpressions__ExpressionT $(final simpleexpressions.Expression it) {
		if (it.getClass() == simpleexpressions.impl.BooleanBinaryExpressionImpl.class)
			return booleanBinaryExpression((simpleexpressions.BooleanBinaryExpression) it);
		if (it.getClass() == simpleexpressions.impl.BooleanUnaryExpressionImpl.class)
			return booleanUnaryExpression((simpleexpressions.BooleanUnaryExpression) it);
		if (it.getClass() == simpleexpressions.impl.IntegerCalculationExpressionImpl.class)
			return integerCalculationExpression((simpleexpressions.IntegerCalculationExpression) it);
		if (it.getClass() == simpleexpressions.impl.IntegerComparisonExpressionImpl.class)
			return integerComparisonExpression((simpleexpressions.IntegerComparisonExpression) it);
		return null;
	}
	default Iot__ExpressionBindExpressionT $(final iot.ExpressionBindExpression it) {
		return expressionBindExpression(it);
	}
	default Activitydiagram__FinalNodeT $(final activitydiagram.FinalNode it) {
		if (it.getClass() == activitydiagram.impl.ActivityFinalNodeImpl.class)
			return activityFinalNode((activitydiagram.ActivityFinalNode) it);
		return null;
	}
	default Activitydiagram__ForkNodeT $(final activitydiagram.ForkNode it) {
		return forkNode(it);
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
	default Simpleexpressions__IntegerCalculationExpressionT $(final simpleexpressions.IntegerCalculationExpression it) {
		return integerCalculationExpression(it);
	}
	default Simpleexpressions__IntegerComparisonExpressionT $(final simpleexpressions.IntegerComparisonExpression it) {
		return integerComparisonExpression(it);
	}
	default Simpleexpressions__IntegerExpressionT $(final simpleexpressions.IntegerExpression it) {
		if (it.getClass() == simpleexpressions.impl.IntegerCalculationExpressionImpl.class)
			return integerCalculationExpression((simpleexpressions.IntegerCalculationExpression) it);
		if (it.getClass() == simpleexpressions.impl.IntegerComparisonExpressionImpl.class)
			return integerComparisonExpression((simpleexpressions.IntegerComparisonExpression) it);
		return null;
	}
	default Activitydiagram__IntegerValueT $(final activitydiagram.IntegerValue it) {
		if (it.getClass() == iot.impl.IntegerValueBindIntegerValueImpl.class)
			return integerValueBindIntegerValue((iot.IntegerValueBindIntegerValue) it);
		return null;
	}
	default Simpleexpressions__IntegerValueT $(final simpleexpressions.IntegerValue it) {
		return integerValue(it);
	}
	default Iot__IntegerValueBindIntegerValueT $(final iot.IntegerValueBindIntegerValue it) {
		return integerValueBindIntegerValue(it);
	}
	default Simpleexpressions__IntegerVariableT $(final simpleexpressions.IntegerVariable it) {
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
	default Activitydiagram__OpaqueActionT $(final activitydiagram.OpaqueAction it) {
		return opaqueAction(it);
	}
	default Activitydiagram__ValueT $(final activitydiagram.Value it) {
		if (it.getClass() == iot.impl.BooleanValueBindBooleanValueImpl.class)
			return booleanValueBindBooleanValue((iot.BooleanValueBindBooleanValue) it);
		if (it.getClass() == iot.impl.IntegerValueBindIntegerValueImpl.class)
			return integerValueBindIntegerValue((iot.IntegerValueBindIntegerValue) it);
		if (it.getClass() == iot.impl.ValueBindValueImpl.class)
			return valueBindValue((iot.ValueBindValue) it);
		return null;
	}
	default Simpleexpressions__ValueT $(final simpleexpressions.Value it) {
		if (it.getClass() == simpleexpressions.impl.BooleanValueImpl.class)
			return booleanValue((simpleexpressions.BooleanValue) it);
		if (it.getClass() == simpleexpressions.impl.IntegerValueImpl.class)
			return integerValue((simpleexpressions.IntegerValue) it);
		return null;
	}
	default Iot__ValueBindValueT $(final iot.ValueBindValue it) {
		return valueBindValue(it);
	}
	default Activitydiagram__VariableT $(final activitydiagram.Variable it) {
		if (it.getClass() == iot.impl.BooleanVariableBindBooleanVariableImpl.class)
			return booleanVariableBindBooleanVariable((iot.BooleanVariableBindBooleanVariable) it);
		return null;
	}
	default Simpleexpressions__VariableT $(final simpleexpressions.Variable it) {
		if (it.getClass() == simpleexpressions.impl.BooleanVariableImpl.class)
			return booleanVariable((simpleexpressions.BooleanVariable) it);
		if (it.getClass() == simpleexpressions.impl.IntegerVariableImpl.class)
			return integerVariable((simpleexpressions.IntegerVariable) it);
		return null;
	}
}
