package activitydiagram_simpleexpressions.revisitor;

public interface Activitydiagram_simpleexpressionsRevisitor<Activitydiagram__ActionT extends Activitydiagram__ExecutableNodeT, Activitydiagram__ActivityT extends Activitydiagram__NamedActivityT, Activitydiagram__ActivityEdgeT extends Activitydiagram__NamedActivityT, Activitydiagram__ActivityFinalNodeT extends Activitydiagram__FinalNodeT, Activitydiagram__ActivityNodeT extends Activitydiagram__NamedActivityT, Activitydiagram__BooleanValueT extends Activitydiagram__ValueT, Activitydiagram__BooleanVariableT extends Activitydiagram__VariableT, Activitydiagram_simpleexpressions__BooleanVariableBindSEBooleanVariableT extends Activitydiagram__BooleanVariableT, Activitydiagram__ContextT, Activitydiagram__ControlFlowT extends Activitydiagram__ActivityEdgeT, Activitydiagram__ControlNodeT extends Activitydiagram__ActivityNodeT, Activitydiagram__ControlTokenT extends Activitydiagram__TokenT, Activitydiagram__DecisionNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__ExecutableNodeT extends Activitydiagram__ActivityNodeT, Activitydiagram__ExpT, Activitydiagram_simpleexpressions__ExpBindSEExpressionT extends Activitydiagram__ExpT, Activitydiagram__FinalNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__ForkNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__ForkedTokenT extends Activitydiagram__TokenT, Activitydiagram__InitialNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__InputT, Activitydiagram__InputValueT, Activitydiagram__IntegerValueT extends Activitydiagram__ValueT, Activitydiagram__IntegerVariableT extends Activitydiagram__VariableT, Activitydiagram_simpleexpressions__IntegerVariableBindSEIntegerVariableT extends Activitydiagram__IntegerVariableT, Activitydiagram__JoinNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__MergeNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__NamedActivityT, Activitydiagram__OfferT, Activitydiagram__OpaqueActionT extends Activitydiagram__ActionT, Simpleexpressions__SEBooleanBinaryExpressionT extends Simpleexpressions__SEBooleanExpressionT, Simpleexpressions__SEBooleanExpressionT extends Simpleexpressions__SEExpressionT, Simpleexpressions__SEBooleanUnaryExpressionT extends Simpleexpressions__SEBooleanExpressionT, Simpleexpressions__SEBooleanValueT extends Simpleexpressions__SEValueT, Simpleexpressions__SEBooleanVariableT extends Simpleexpressions__SEVariableT, Simpleexpressions__SEExpressionT, Simpleexpressions__SEIntegerCalculationExpressionT extends Simpleexpressions__SEIntegerExpressionT, Simpleexpressions__SEIntegerComparisonExpressionT extends Simpleexpressions__SEIntegerExpressionT, Simpleexpressions__SEIntegerExpressionT extends Simpleexpressions__SEExpressionT, Simpleexpressions__SEIntegerValueT extends Simpleexpressions__SEValueT, Simpleexpressions__SEIntegerVariableT extends Simpleexpressions__SEVariableT, Simpleexpressions__SEValueT, Simpleexpressions__SEVariableT, Activitydiagram__TokenT, Activitydiagram__TraceT, Activitydiagram__ValueT, Activitydiagram__VariableT>
	extends simpleexpressions.revisitor.SimpleexpressionsRevisitor<Simpleexpressions__SEBooleanBinaryExpressionT, Simpleexpressions__SEBooleanExpressionT, Simpleexpressions__SEBooleanUnaryExpressionT, Simpleexpressions__SEBooleanValueT, Simpleexpressions__SEBooleanVariableT, Simpleexpressions__SEExpressionT, Simpleexpressions__SEIntegerCalculationExpressionT, Simpleexpressions__SEIntegerComparisonExpressionT, Simpleexpressions__SEIntegerExpressionT, Simpleexpressions__SEIntegerValueT, Simpleexpressions__SEIntegerVariableT, Simpleexpressions__SEValueT, Simpleexpressions__SEVariableT>,
		activitydiagram.revisitor.ActivitydiagramRevisitor<Activitydiagram__ActionT, Activitydiagram__ActivityT, Activitydiagram__ActivityEdgeT, Activitydiagram__ActivityFinalNodeT, Activitydiagram__ActivityNodeT, Activitydiagram__BooleanValueT, Activitydiagram__BooleanVariableT, Activitydiagram__ContextT, Activitydiagram__ControlFlowT, Activitydiagram__ControlNodeT, Activitydiagram__ControlTokenT, Activitydiagram__DecisionNodeT, Activitydiagram__ExecutableNodeT, Activitydiagram__ExpT, Activitydiagram__FinalNodeT, Activitydiagram__ForkNodeT, Activitydiagram__ForkedTokenT, Activitydiagram__InitialNodeT, Activitydiagram__InputT, Activitydiagram__InputValueT, Activitydiagram__IntegerValueT, Activitydiagram__IntegerVariableT, Activitydiagram__JoinNodeT, Activitydiagram__MergeNodeT, Activitydiagram__NamedActivityT, Activitydiagram__OfferT, Activitydiagram__OpaqueActionT, Activitydiagram__TokenT, Activitydiagram__TraceT, Activitydiagram__ValueT, Activitydiagram__VariableT> {
	Activitydiagram_simpleexpressions__BooleanVariableBindSEBooleanVariableT activitydiagram_simpleexpressions__BooleanVariableBindSEBooleanVariable(final activitydiagram_simpleexpressions.BooleanVariableBindSEBooleanVariable it);
	Activitydiagram_simpleexpressions__ExpBindSEExpressionT activitydiagram_simpleexpressions__ExpBindSEExpression(final activitydiagram_simpleexpressions.ExpBindSEExpression it);
	Activitydiagram_simpleexpressions__IntegerVariableBindSEIntegerVariableT activitydiagram_simpleexpressions__IntegerVariableBindSEIntegerVariable(final activitydiagram_simpleexpressions.IntegerVariableBindSEIntegerVariable it);

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
	default Activitydiagram__BooleanValueT $(final activitydiagram.BooleanValue it) {
		return activitydiagram__BooleanValue(it);
	}
	default Activitydiagram__BooleanVariableT $(final activitydiagram.BooleanVariable it) {
		if (it.getClass() == activitydiagram_simpleexpressions.impl.BooleanVariableBindSEBooleanVariableImpl.class)
			return activitydiagram_simpleexpressions__BooleanVariableBindSEBooleanVariable((activitydiagram_simpleexpressions.BooleanVariableBindSEBooleanVariable) it);
		return null;
	}
	default Activitydiagram_simpleexpressions__BooleanVariableBindSEBooleanVariableT $(final activitydiagram_simpleexpressions.BooleanVariableBindSEBooleanVariable it) {
		return activitydiagram_simpleexpressions__BooleanVariableBindSEBooleanVariable(it);
	}
	default Activitydiagram__ContextT $(final activitydiagram.Context it) {
		return activitydiagram__Context(it);
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
	default Activitydiagram__ControlTokenT $(final activitydiagram.ControlToken it) {
		return activitydiagram__ControlToken(it);
	}
	default Activitydiagram__DecisionNodeT $(final activitydiagram.DecisionNode it) {
		return activitydiagram__DecisionNode(it);
	}
	default Activitydiagram__ExecutableNodeT $(final activitydiagram.ExecutableNode it) {
		if (it.getClass() == activitydiagram.impl.OpaqueActionImpl.class)
			return activitydiagram__OpaqueAction((activitydiagram.OpaqueAction) it);
		return null;
	}
	default Activitydiagram__ExpT $(final activitydiagram.Exp it) {
		if (it.getClass() == activitydiagram_simpleexpressions.impl.ExpBindSEExpressionImpl.class)
			return activitydiagram_simpleexpressions__ExpBindSEExpression((activitydiagram_simpleexpressions.ExpBindSEExpression) it);
		return null;
	}
	default Activitydiagram_simpleexpressions__ExpBindSEExpressionT $(final activitydiagram_simpleexpressions.ExpBindSEExpression it) {
		return activitydiagram_simpleexpressions__ExpBindSEExpression(it);
	}
	default Activitydiagram__FinalNodeT $(final activitydiagram.FinalNode it) {
		if (it.getClass() == activitydiagram.impl.ActivityFinalNodeImpl.class)
			return activitydiagram__ActivityFinalNode((activitydiagram.ActivityFinalNode) it);
		return null;
	}
	default Activitydiagram__ForkNodeT $(final activitydiagram.ForkNode it) {
		return activitydiagram__ForkNode(it);
	}
	default Activitydiagram__ForkedTokenT $(final activitydiagram.ForkedToken it) {
		return activitydiagram__ForkedToken(it);
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
	default Activitydiagram__IntegerValueT $(final activitydiagram.IntegerValue it) {
		return activitydiagram__IntegerValue(it);
	}
	default Activitydiagram__IntegerVariableT $(final activitydiagram.IntegerVariable it) {
		if (it.getClass() == activitydiagram_simpleexpressions.impl.IntegerVariableBindSEIntegerVariableImpl.class)
			return activitydiagram_simpleexpressions__IntegerVariableBindSEIntegerVariable((activitydiagram_simpleexpressions.IntegerVariableBindSEIntegerVariable) it);
		return null;
	}
	default Activitydiagram_simpleexpressions__IntegerVariableBindSEIntegerVariableT $(final activitydiagram_simpleexpressions.IntegerVariableBindSEIntegerVariable it) {
		return activitydiagram_simpleexpressions__IntegerVariableBindSEIntegerVariable(it);
	}
	default Activitydiagram__JoinNodeT $(final activitydiagram.JoinNode it) {
		return activitydiagram__JoinNode(it);
	}
	default Activitydiagram__MergeNodeT $(final activitydiagram.MergeNode it) {
		return activitydiagram__MergeNode(it);
	}
	default Activitydiagram__NamedActivityT $(final activitydiagram.NamedActivity it) {
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
	default Activitydiagram__OfferT $(final activitydiagram.Offer it) {
		return activitydiagram__Offer(it);
	}
	default Activitydiagram__OpaqueActionT $(final activitydiagram.OpaqueAction it) {
		return activitydiagram__OpaqueAction(it);
	}
	default Simpleexpressions__SEBooleanBinaryExpressionT $(final simpleexpressions.SEBooleanBinaryExpression it) {
		return simpleexpressions__SEBooleanBinaryExpression(it);
	}
	default Simpleexpressions__SEBooleanExpressionT $(final simpleexpressions.SEBooleanExpression it) {
		if (it.getClass() == simpleexpressions.impl.SEBooleanBinaryExpressionImpl.class)
			return simpleexpressions__SEBooleanBinaryExpression((simpleexpressions.SEBooleanBinaryExpression) it);
		if (it.getClass() == simpleexpressions.impl.SEBooleanUnaryExpressionImpl.class)
			return simpleexpressions__SEBooleanUnaryExpression((simpleexpressions.SEBooleanUnaryExpression) it);
		return null;
	}
	default Simpleexpressions__SEBooleanUnaryExpressionT $(final simpleexpressions.SEBooleanUnaryExpression it) {
		return simpleexpressions__SEBooleanUnaryExpression(it);
	}
	default Simpleexpressions__SEBooleanValueT $(final simpleexpressions.SEBooleanValue it) {
		return simpleexpressions__SEBooleanValue(it);
	}
	default Simpleexpressions__SEBooleanVariableT $(final simpleexpressions.SEBooleanVariable it) {
		return simpleexpressions__SEBooleanVariable(it);
	}
	default Simpleexpressions__SEExpressionT $(final simpleexpressions.SEExpression it) {
		if (it.getClass() == simpleexpressions.impl.SEBooleanBinaryExpressionImpl.class)
			return simpleexpressions__SEBooleanBinaryExpression((simpleexpressions.SEBooleanBinaryExpression) it);
		if (it.getClass() == simpleexpressions.impl.SEBooleanUnaryExpressionImpl.class)
			return simpleexpressions__SEBooleanUnaryExpression((simpleexpressions.SEBooleanUnaryExpression) it);
		if (it.getClass() == simpleexpressions.impl.SEIntegerCalculationExpressionImpl.class)
			return simpleexpressions__SEIntegerCalculationExpression((simpleexpressions.SEIntegerCalculationExpression) it);
		if (it.getClass() == simpleexpressions.impl.SEIntegerComparisonExpressionImpl.class)
			return simpleexpressions__SEIntegerComparisonExpression((simpleexpressions.SEIntegerComparisonExpression) it);
		return null;
	}
	default Simpleexpressions__SEIntegerCalculationExpressionT $(final simpleexpressions.SEIntegerCalculationExpression it) {
		return simpleexpressions__SEIntegerCalculationExpression(it);
	}
	default Simpleexpressions__SEIntegerComparisonExpressionT $(final simpleexpressions.SEIntegerComparisonExpression it) {
		return simpleexpressions__SEIntegerComparisonExpression(it);
	}
	default Simpleexpressions__SEIntegerExpressionT $(final simpleexpressions.SEIntegerExpression it) {
		if (it.getClass() == simpleexpressions.impl.SEIntegerCalculationExpressionImpl.class)
			return simpleexpressions__SEIntegerCalculationExpression((simpleexpressions.SEIntegerCalculationExpression) it);
		if (it.getClass() == simpleexpressions.impl.SEIntegerComparisonExpressionImpl.class)
			return simpleexpressions__SEIntegerComparisonExpression((simpleexpressions.SEIntegerComparisonExpression) it);
		return null;
	}
	default Simpleexpressions__SEIntegerValueT $(final simpleexpressions.SEIntegerValue it) {
		return simpleexpressions__SEIntegerValue(it);
	}
	default Simpleexpressions__SEIntegerVariableT $(final simpleexpressions.SEIntegerVariable it) {
		return simpleexpressions__SEIntegerVariable(it);
	}
	default Simpleexpressions__SEValueT $(final simpleexpressions.SEValue it) {
		if (it.getClass() == simpleexpressions.impl.SEBooleanValueImpl.class)
			return simpleexpressions__SEBooleanValue((simpleexpressions.SEBooleanValue) it);
		if (it.getClass() == simpleexpressions.impl.SEIntegerValueImpl.class)
			return simpleexpressions__SEIntegerValue((simpleexpressions.SEIntegerValue) it);
		return null;
	}
	default Simpleexpressions__SEVariableT $(final simpleexpressions.SEVariable it) {
		if (it.getClass() == simpleexpressions.impl.SEBooleanVariableImpl.class)
			return simpleexpressions__SEBooleanVariable((simpleexpressions.SEBooleanVariable) it);
		if (it.getClass() == simpleexpressions.impl.SEIntegerVariableImpl.class)
			return simpleexpressions__SEIntegerVariable((simpleexpressions.SEIntegerVariable) it);
		return null;
	}
	default Activitydiagram__TokenT $(final activitydiagram.Token it) {
		if (it.getClass() == activitydiagram.impl.ControlTokenImpl.class)
			return activitydiagram__ControlToken((activitydiagram.ControlToken) it);
		if (it.getClass() == activitydiagram.impl.ForkedTokenImpl.class)
			return activitydiagram__ForkedToken((activitydiagram.ForkedToken) it);
		return activitydiagram__Token(it);
	}
	default Activitydiagram__TraceT $(final activitydiagram.Trace it) {
		return activitydiagram__Trace(it);
	}
	default Activitydiagram__ValueT $(final activitydiagram.Value it) {
		if (it.getClass() == activitydiagram.impl.BooleanValueImpl.class)
			return activitydiagram__BooleanValue((activitydiagram.BooleanValue) it);
		if (it.getClass() == activitydiagram.impl.IntegerValueImpl.class)
			return activitydiagram__IntegerValue((activitydiagram.IntegerValue) it);
		return null;
	}
	default Activitydiagram__VariableT $(final activitydiagram.Variable it) {
		if (it.getClass() == activitydiagram_simpleexpressions.impl.BooleanVariableBindSEBooleanVariableImpl.class)
			return activitydiagram_simpleexpressions__BooleanVariableBindSEBooleanVariable((activitydiagram_simpleexpressions.BooleanVariableBindSEBooleanVariable) it);
		if (it.getClass() == activitydiagram_simpleexpressions.impl.IntegerVariableBindSEIntegerVariableImpl.class)
			return activitydiagram_simpleexpressions__IntegerVariableBindSEIntegerVariable((activitydiagram_simpleexpressions.IntegerVariableBindSEIntegerVariable) it);
		return null;
	}
}
