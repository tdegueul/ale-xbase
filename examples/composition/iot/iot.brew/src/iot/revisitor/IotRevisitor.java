package iot.revisitor;

public interface IotRevisitor<Activitydiagram__ActionT extends Activitydiagram__ExecutableNodeT, Activitydiagram__ActivityT extends Activitydiagram__NamedElementT, Activitydiagram__ActivityEdgeT extends Activitydiagram__NamedElementT, Activitydiagram__ActivityFinalNodeT extends Activitydiagram__FinalNodeT, Activitydiagram__ActivityNodeT extends Activitydiagram__NamedElementT, Simpleexpressions__BooleanBinaryExpressionT extends Simpleexpressions__BooleanExpressionT, Simpleexpressions__BooleanExpressionT extends Simpleexpressions__ExpressionT, Simpleexpressions__BooleanUnaryExpressionT extends Simpleexpressions__BooleanExpressionT, Activitydiagram__BooleanValueT extends Activitydiagram__ValueT, Simpleexpressions__BooleanValueT extends Simpleexpressions__ValueT, Iot__BooleanValueBindBooleanValueT extends Activitydiagram__BooleanValueT, Activitydiagram__BooleanVariableT extends Activitydiagram__VariableT, Simpleexpressions__BooleanVariableT extends Simpleexpressions__VariableT, Iot__BooleanVariableBindBooleanVariableT extends Activitydiagram__BooleanVariableT, Activitydiagramruntime__ContextT, Activitydiagram__ControlFlowT extends Activitydiagram__ActivityEdgeT, Activitydiagram__ControlNodeT extends Activitydiagram__ActivityNodeT, Activitydiagramruntime__ControlTokenT extends Activitydiagramruntime__TokenT, Activitydiagram__DecisionNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__ExecutableNodeT extends Activitydiagram__ActivityNodeT, Activitydiagram__ExpressionT, Simpleexpressions__ExpressionT, Iot__ExpressionBindExpressionT extends Activitydiagram__ExpressionT, Activitydiagram__FinalNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__ForkNodeT extends Activitydiagram__ControlNodeT, Activitydiagramruntime__ForkedTokenT extends Activitydiagramruntime__TokenT, Activitydiagram__InitialNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__InputT, Activitydiagram__InputValueT, Simpleexpressions__IntegerCalculationExpressionT extends Simpleexpressions__IntegerExpressionT, Simpleexpressions__IntegerComparisonExpressionT extends Simpleexpressions__IntegerExpressionT, Simpleexpressions__IntegerExpressionT extends Simpleexpressions__ExpressionT, Activitydiagram__IntegerValueT extends Activitydiagram__ValueT, Simpleexpressions__IntegerValueT extends Simpleexpressions__ValueT, Iot__IntegerValueBindIntegerValueT extends Activitydiagram__IntegerValueT, Simpleexpressions__IntegerVariableT extends Simpleexpressions__VariableT, Activitydiagram__JoinNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__MergeNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__NamedElementT, Activitydiagramruntime__OfferT, Activitydiagram__OpaqueActionT extends Activitydiagram__ActionT, Activitydiagramruntime__TokenT, Activitydiagramruntime__TraceT, Activitydiagram__ValueT, Simpleexpressions__ValueT, Iot__ValueBindValueT extends Activitydiagram__ValueT, Activitydiagram__VariableT, Simpleexpressions__VariableT>
	extends simpleexpressions.revisitor.SimpleexpressionsRevisitor<Simpleexpressions__BooleanBinaryExpressionT, Simpleexpressions__BooleanExpressionT, Simpleexpressions__BooleanUnaryExpressionT, Simpleexpressions__BooleanValueT, Simpleexpressions__BooleanVariableT, Simpleexpressions__ExpressionT, Simpleexpressions__IntegerCalculationExpressionT, Simpleexpressions__IntegerComparisonExpressionT, Simpleexpressions__IntegerExpressionT, Simpleexpressions__IntegerValueT, Simpleexpressions__IntegerVariableT, Simpleexpressions__ValueT, Simpleexpressions__VariableT>,
		activitydiagram.revisitor.ActivitydiagramRevisitor<Activitydiagram__ActionT, Activitydiagram__ActivityT, Activitydiagram__ActivityEdgeT, Activitydiagram__ActivityFinalNodeT, Activitydiagram__ActivityNodeT, Activitydiagram__BooleanValueT, Activitydiagram__BooleanVariableT, Activitydiagram__ControlFlowT, Activitydiagram__ControlNodeT, Activitydiagram__DecisionNodeT, Activitydiagram__ExecutableNodeT, Activitydiagram__ExpressionT, Activitydiagram__FinalNodeT, Activitydiagram__ForkNodeT, Activitydiagram__InitialNodeT, Activitydiagram__InputT, Activitydiagram__InputValueT, Activitydiagram__IntegerValueT, Activitydiagram__JoinNodeT, Activitydiagram__MergeNodeT, Activitydiagram__NamedElementT, Activitydiagram__OpaqueActionT, Activitydiagram__ValueT, Activitydiagram__VariableT>,
		activitydiagramruntime.revisitor.ActivitydiagramruntimeRevisitor<Activitydiagram__ActionT, Activitydiagram__ActivityT, Activitydiagram__ActivityEdgeT, Activitydiagram__ActivityFinalNodeT, Activitydiagram__ActivityNodeT, Activitydiagram__BooleanValueT, Activitydiagram__BooleanVariableT, Activitydiagramruntime__ContextT, Activitydiagram__ControlFlowT, Activitydiagram__ControlNodeT, Activitydiagramruntime__ControlTokenT, Activitydiagram__DecisionNodeT, Activitydiagram__ExecutableNodeT, Activitydiagram__ExpressionT, Activitydiagram__FinalNodeT, Activitydiagram__ForkNodeT, Activitydiagramruntime__ForkedTokenT, Activitydiagram__InitialNodeT, Activitydiagram__InputT, Activitydiagram__InputValueT, Activitydiagram__IntegerValueT, Activitydiagram__JoinNodeT, Activitydiagram__MergeNodeT, Activitydiagram__NamedElementT, Activitydiagramruntime__OfferT, Activitydiagram__OpaqueActionT, Activitydiagramruntime__TokenT, Activitydiagramruntime__TraceT, Activitydiagram__ValueT, Activitydiagram__VariableT> {
	Simpleexpressions__BooleanBinaryExpressionT simpleexpressions__BooleanBinaryExpression(final simpleexpressions.BooleanBinaryExpression it);
	Simpleexpressions__BooleanUnaryExpressionT simpleexpressions__BooleanUnaryExpression(final simpleexpressions.BooleanUnaryExpression it);
	Simpleexpressions__BooleanValueT simpleexpressions__BooleanValue(final simpleexpressions.BooleanValue it);
	Iot__BooleanValueBindBooleanValueT iot__BooleanValueBindBooleanValue(final iot.BooleanValueBindBooleanValue it);
	Simpleexpressions__BooleanVariableT simpleexpressions__BooleanVariable(final simpleexpressions.BooleanVariable it);
	Iot__BooleanVariableBindBooleanVariableT iot__BooleanVariableBindBooleanVariable(final iot.BooleanVariableBindBooleanVariable it);
	Activitydiagramruntime__ContextT activitydiagramruntime__Context(final activitydiagramruntime.Context it);
	Activitydiagramruntime__ControlTokenT activitydiagramruntime__ControlToken(final activitydiagramruntime.ControlToken it);
	Iot__ExpressionBindExpressionT iot__ExpressionBindExpression(final iot.ExpressionBindExpression it);
	Activitydiagramruntime__ForkedTokenT activitydiagramruntime__ForkedToken(final activitydiagramruntime.ForkedToken it);
	Simpleexpressions__IntegerCalculationExpressionT simpleexpressions__IntegerCalculationExpression(final simpleexpressions.IntegerCalculationExpression it);
	Simpleexpressions__IntegerComparisonExpressionT simpleexpressions__IntegerComparisonExpression(final simpleexpressions.IntegerComparisonExpression it);
	Simpleexpressions__IntegerValueT simpleexpressions__IntegerValue(final simpleexpressions.IntegerValue it);
	Iot__IntegerValueBindIntegerValueT iot__IntegerValueBindIntegerValue(final iot.IntegerValueBindIntegerValue it);
	Simpleexpressions__IntegerVariableT simpleexpressions__IntegerVariable(final simpleexpressions.IntegerVariable it);
	Activitydiagramruntime__OfferT activitydiagramruntime__Offer(final activitydiagramruntime.Offer it);
	Activitydiagramruntime__TraceT activitydiagramruntime__Trace(final activitydiagramruntime.Trace it);
	Iot__ValueBindValueT iot__ValueBindValue(final iot.ValueBindValue it);

	default Activitydiagram__ActionT $(final activitydiagram.Action it) {
		if (it.getClass() == activitydiagram.impl.OpaqueActionImpl.class)
			return activitydiagram__OpaqueAction((activitydiagram.OpaqueAction) it);
		return null;
	}
	default Activitydiagram__ActivityT $(final activitydiagram.Activity it) {
		return activitydiagram__Activity(it);
	}
	default Activitydiagram__ActivityEdgeT $(final activitydiagram.ActivityEdge it) {
		if (it.getClass() == activitydiagram.impl.ControlFlowImpl.class)
			return activitydiagram__ControlFlow((activitydiagram.ControlFlow) it);
		return null;
	}
	default Activitydiagram__ActivityFinalNodeT $(final activitydiagram.ActivityFinalNode it) {
		return activitydiagram__ActivityFinalNode(it);
	}
	default Activitydiagram__ActivityNodeT $(final activitydiagram.ActivityNode it) {
		if (it.getClass() == activitydiagram.impl.ActivityFinalNodeImpl.class)
			return activitydiagram__ActivityFinalNode((activitydiagram.ActivityFinalNode) it);
		if (it.getClass() == activitydiagram.impl.DecisionNodeImpl.class)
			return activitydiagram__DecisionNode((activitydiagram.DecisionNode) it);
		if (it.getClass() == activitydiagram.impl.ForkNodeImpl.class)
			return activitydiagram__ForkNode((activitydiagram.ForkNode) it);
		if (it.getClass() == activitydiagram.impl.InitialNodeImpl.class)
			return activitydiagram__InitialNode((activitydiagram.InitialNode) it);
		if (it.getClass() == activitydiagram.impl.JoinNodeImpl.class)
			return activitydiagram__JoinNode((activitydiagram.JoinNode) it);
		if (it.getClass() == activitydiagram.impl.MergeNodeImpl.class)
			return activitydiagram__MergeNode((activitydiagram.MergeNode) it);
		if (it.getClass() == activitydiagram.impl.OpaqueActionImpl.class)
			return activitydiagram__OpaqueAction((activitydiagram.OpaqueAction) it);
		return null;
	}
	default Simpleexpressions__BooleanBinaryExpressionT $(final simpleexpressions.BooleanBinaryExpression it) {
		return simpleexpressions__BooleanBinaryExpression(it);
	}
	default Simpleexpressions__BooleanExpressionT $(final simpleexpressions.BooleanExpression it) {
		if (it.getClass() == simpleexpressions.impl.BooleanBinaryExpressionImpl.class)
			return simpleexpressions__BooleanBinaryExpression((simpleexpressions.BooleanBinaryExpression) it);
		if (it.getClass() == simpleexpressions.impl.BooleanUnaryExpressionImpl.class)
			return simpleexpressions__BooleanUnaryExpression((simpleexpressions.BooleanUnaryExpression) it);
		return null;
	}
	default Simpleexpressions__BooleanUnaryExpressionT $(final simpleexpressions.BooleanUnaryExpression it) {
		return simpleexpressions__BooleanUnaryExpression(it);
	}
	default Activitydiagram__BooleanValueT $(final activitydiagram.BooleanValue it) {
		if (it.getClass() == iot.impl.BooleanValueBindBooleanValueImpl.class)
			return iot__BooleanValueBindBooleanValue((iot.BooleanValueBindBooleanValue) it);
		return null;
	}
	default Simpleexpressions__BooleanValueT $(final simpleexpressions.BooleanValue it) {
		return simpleexpressions__BooleanValue(it);
	}
	default Iot__BooleanValueBindBooleanValueT $(final iot.BooleanValueBindBooleanValue it) {
		return iot__BooleanValueBindBooleanValue(it);
	}
	default Activitydiagram__BooleanVariableT $(final activitydiagram.BooleanVariable it) {
		if (it.getClass() == iot.impl.BooleanVariableBindBooleanVariableImpl.class)
			return iot__BooleanVariableBindBooleanVariable((iot.BooleanVariableBindBooleanVariable) it);
		return null;
	}
	default Simpleexpressions__BooleanVariableT $(final simpleexpressions.BooleanVariable it) {
		return simpleexpressions__BooleanVariable(it);
	}
	default Iot__BooleanVariableBindBooleanVariableT $(final iot.BooleanVariableBindBooleanVariable it) {
		return iot__BooleanVariableBindBooleanVariable(it);
	}
	default Activitydiagramruntime__ContextT $(final activitydiagramruntime.Context it) {
		return activitydiagramruntime__Context(it);
	}
	default Activitydiagram__ControlFlowT $(final activitydiagram.ControlFlow it) {
		return activitydiagram__ControlFlow(it);
	}
	default Activitydiagram__ControlNodeT $(final activitydiagram.ControlNode it) {
		if (it.getClass() == activitydiagram.impl.ActivityFinalNodeImpl.class)
			return activitydiagram__ActivityFinalNode((activitydiagram.ActivityFinalNode) it);
		if (it.getClass() == activitydiagram.impl.DecisionNodeImpl.class)
			return activitydiagram__DecisionNode((activitydiagram.DecisionNode) it);
		if (it.getClass() == activitydiagram.impl.ForkNodeImpl.class)
			return activitydiagram__ForkNode((activitydiagram.ForkNode) it);
		if (it.getClass() == activitydiagram.impl.InitialNodeImpl.class)
			return activitydiagram__InitialNode((activitydiagram.InitialNode) it);
		if (it.getClass() == activitydiagram.impl.JoinNodeImpl.class)
			return activitydiagram__JoinNode((activitydiagram.JoinNode) it);
		if (it.getClass() == activitydiagram.impl.MergeNodeImpl.class)
			return activitydiagram__MergeNode((activitydiagram.MergeNode) it);
		return null;
	}
	default Activitydiagramruntime__ControlTokenT $(final activitydiagramruntime.ControlToken it) {
		return activitydiagramruntime__ControlToken(it);
	}
	default Activitydiagram__DecisionNodeT $(final activitydiagram.DecisionNode it) {
		return activitydiagram__DecisionNode(it);
	}
	default Activitydiagram__ExecutableNodeT $(final activitydiagram.ExecutableNode it) {
		if (it.getClass() == activitydiagram.impl.OpaqueActionImpl.class)
			return activitydiagram__OpaqueAction((activitydiagram.OpaqueAction) it);
		return null;
	}
	default Activitydiagram__ExpressionT $(final activitydiagram.Expression it) {
		if (it.getClass() == iot.impl.ExpressionBindExpressionImpl.class)
			return iot__ExpressionBindExpression((iot.ExpressionBindExpression) it);
		return null;
	}
	default Simpleexpressions__ExpressionT $(final simpleexpressions.Expression it) {
		if (it.getClass() == simpleexpressions.impl.BooleanBinaryExpressionImpl.class)
			return simpleexpressions__BooleanBinaryExpression((simpleexpressions.BooleanBinaryExpression) it);
		if (it.getClass() == simpleexpressions.impl.BooleanUnaryExpressionImpl.class)
			return simpleexpressions__BooleanUnaryExpression((simpleexpressions.BooleanUnaryExpression) it);
		if (it.getClass() == simpleexpressions.impl.IntegerCalculationExpressionImpl.class)
			return simpleexpressions__IntegerCalculationExpression((simpleexpressions.IntegerCalculationExpression) it);
		if (it.getClass() == simpleexpressions.impl.IntegerComparisonExpressionImpl.class)
			return simpleexpressions__IntegerComparisonExpression((simpleexpressions.IntegerComparisonExpression) it);
		return null;
	}
	default Iot__ExpressionBindExpressionT $(final iot.ExpressionBindExpression it) {
		return iot__ExpressionBindExpression(it);
	}
	default Activitydiagram__FinalNodeT $(final activitydiagram.FinalNode it) {
		if (it.getClass() == activitydiagram.impl.ActivityFinalNodeImpl.class)
			return activitydiagram__ActivityFinalNode((activitydiagram.ActivityFinalNode) it);
		return null;
	}
	default Activitydiagram__ForkNodeT $(final activitydiagram.ForkNode it) {
		return activitydiagram__ForkNode(it);
	}
	default Activitydiagramruntime__ForkedTokenT $(final activitydiagramruntime.ForkedToken it) {
		return activitydiagramruntime__ForkedToken(it);
	}
	default Activitydiagram__InitialNodeT $(final activitydiagram.InitialNode it) {
		return activitydiagram__InitialNode(it);
	}
	default Activitydiagram__InputT $(final activitydiagram.Input it) {
		return activitydiagram__Input(it);
	}
	default Activitydiagram__InputValueT $(final activitydiagram.InputValue it) {
		return activitydiagram__InputValue(it);
	}
	default Simpleexpressions__IntegerCalculationExpressionT $(final simpleexpressions.IntegerCalculationExpression it) {
		return simpleexpressions__IntegerCalculationExpression(it);
	}
	default Simpleexpressions__IntegerComparisonExpressionT $(final simpleexpressions.IntegerComparisonExpression it) {
		return simpleexpressions__IntegerComparisonExpression(it);
	}
	default Simpleexpressions__IntegerExpressionT $(final simpleexpressions.IntegerExpression it) {
		if (it.getClass() == simpleexpressions.impl.IntegerCalculationExpressionImpl.class)
			return simpleexpressions__IntegerCalculationExpression((simpleexpressions.IntegerCalculationExpression) it);
		if (it.getClass() == simpleexpressions.impl.IntegerComparisonExpressionImpl.class)
			return simpleexpressions__IntegerComparisonExpression((simpleexpressions.IntegerComparisonExpression) it);
		return null;
	}
	default Activitydiagram__IntegerValueT $(final activitydiagram.IntegerValue it) {
		if (it.getClass() == iot.impl.IntegerValueBindIntegerValueImpl.class)
			return iot__IntegerValueBindIntegerValue((iot.IntegerValueBindIntegerValue) it);
		return null;
	}
	default Simpleexpressions__IntegerValueT $(final simpleexpressions.IntegerValue it) {
		return simpleexpressions__IntegerValue(it);
	}
	default Iot__IntegerValueBindIntegerValueT $(final iot.IntegerValueBindIntegerValue it) {
		return iot__IntegerValueBindIntegerValue(it);
	}
	default Simpleexpressions__IntegerVariableT $(final simpleexpressions.IntegerVariable it) {
		return simpleexpressions__IntegerVariable(it);
	}
	default Activitydiagram__JoinNodeT $(final activitydiagram.JoinNode it) {
		return activitydiagram__JoinNode(it);
	}
	default Activitydiagram__MergeNodeT $(final activitydiagram.MergeNode it) {
		return activitydiagram__MergeNode(it);
	}
	default Activitydiagram__NamedElementT $(final activitydiagram.NamedElement it) {
		if (it.getClass() == activitydiagram.impl.ActivityImpl.class)
			return activitydiagram__Activity((activitydiagram.Activity) it);
		if (it.getClass() == activitydiagram.impl.ActivityFinalNodeImpl.class)
			return activitydiagram__ActivityFinalNode((activitydiagram.ActivityFinalNode) it);
		if (it.getClass() == activitydiagram.impl.ControlFlowImpl.class)
			return activitydiagram__ControlFlow((activitydiagram.ControlFlow) it);
		if (it.getClass() == activitydiagram.impl.DecisionNodeImpl.class)
			return activitydiagram__DecisionNode((activitydiagram.DecisionNode) it);
		if (it.getClass() == activitydiagram.impl.ForkNodeImpl.class)
			return activitydiagram__ForkNode((activitydiagram.ForkNode) it);
		if (it.getClass() == activitydiagram.impl.InitialNodeImpl.class)
			return activitydiagram__InitialNode((activitydiagram.InitialNode) it);
		if (it.getClass() == activitydiagram.impl.JoinNodeImpl.class)
			return activitydiagram__JoinNode((activitydiagram.JoinNode) it);
		if (it.getClass() == activitydiagram.impl.MergeNodeImpl.class)
			return activitydiagram__MergeNode((activitydiagram.MergeNode) it);
		if (it.getClass() == activitydiagram.impl.OpaqueActionImpl.class)
			return activitydiagram__OpaqueAction((activitydiagram.OpaqueAction) it);
		return null;
	}
	default Activitydiagramruntime__OfferT $(final activitydiagramruntime.Offer it) {
		return activitydiagramruntime__Offer(it);
	}
	default Activitydiagram__OpaqueActionT $(final activitydiagram.OpaqueAction it) {
		return activitydiagram__OpaqueAction(it);
	}
	default Activitydiagramruntime__TokenT $(final activitydiagramruntime.Token it) {
		if (it.getClass() == activitydiagramruntime.impl.ControlTokenImpl.class)
			return activitydiagramruntime__ControlToken((activitydiagramruntime.ControlToken) it);
		if (it.getClass() == activitydiagramruntime.impl.ForkedTokenImpl.class)
			return activitydiagramruntime__ForkedToken((activitydiagramruntime.ForkedToken) it);
		return null;
	}
	default Activitydiagramruntime__TraceT $(final activitydiagramruntime.Trace it) {
		return activitydiagramruntime__Trace(it);
	}
	default Activitydiagram__ValueT $(final activitydiagram.Value it) {
		if (it.getClass() == iot.impl.BooleanValueBindBooleanValueImpl.class)
			return iot__BooleanValueBindBooleanValue((iot.BooleanValueBindBooleanValue) it);
		if (it.getClass() == iot.impl.IntegerValueBindIntegerValueImpl.class)
			return iot__IntegerValueBindIntegerValue((iot.IntegerValueBindIntegerValue) it);
		if (it.getClass() == iot.impl.ValueBindValueImpl.class)
			return iot__ValueBindValue((iot.ValueBindValue) it);
		return null;
	}
	default Simpleexpressions__ValueT $(final simpleexpressions.Value it) {
		if (it.getClass() == simpleexpressions.impl.BooleanValueImpl.class)
			return simpleexpressions__BooleanValue((simpleexpressions.BooleanValue) it);
		if (it.getClass() == simpleexpressions.impl.IntegerValueImpl.class)
			return simpleexpressions__IntegerValue((simpleexpressions.IntegerValue) it);
		return null;
	}
	default Iot__ValueBindValueT $(final iot.ValueBindValue it) {
		return iot__ValueBindValue(it);
	}
	default Activitydiagram__VariableT $(final activitydiagram.Variable it) {
		if (it.getClass() == iot.impl.BooleanVariableBindBooleanVariableImpl.class)
			return iot__BooleanVariableBindBooleanVariable((iot.BooleanVariableBindBooleanVariable) it);
		return null;
	}
	default Simpleexpressions__VariableT $(final simpleexpressions.Variable it) {
		if (it.getClass() == simpleexpressions.impl.BooleanVariableImpl.class)
			return simpleexpressions__BooleanVariable((simpleexpressions.BooleanVariable) it);
		if (it.getClass() == simpleexpressions.impl.IntegerVariableImpl.class)
			return simpleexpressions__IntegerVariable((simpleexpressions.IntegerVariable) it);
		return null;
	}
}
