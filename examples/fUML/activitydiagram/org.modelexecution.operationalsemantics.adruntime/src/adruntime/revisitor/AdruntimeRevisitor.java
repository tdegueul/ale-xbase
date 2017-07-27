package adruntime.revisitor;

public interface AdruntimeRevisitor<Adwithoutruntime__ActionT extends Adwithoutruntime__ExecutableNodeT, Adruntime__Action_AspectT, Adwithoutruntime__ActivityT extends Adwithoutruntime__NamedElementT, Adwithoutruntime__ActivityEdgeT extends Adwithoutruntime__NamedElementT, Adruntime__ActivityEdge_AspectT extends Adwithoutruntime__ActivityEdgeT, Adwithoutruntime__ActivityFinalNodeT extends Adwithoutruntime__FinalNodeT, Adruntime__ActivityFinalNode_AspectT, Adwithoutruntime__ActivityNodeT extends Adwithoutruntime__NamedElementT, Adruntime__ActivityNode_AspectT extends Adwithoutruntime__ActivityNodeT, Adruntime__Activity_AspectT extends Adwithoutruntime__ActivityT, Adwithoutruntime__BooleanBinaryExpressionT extends Adwithoutruntime__BooleanExpressionT, Adruntime__BooleanBinaryExpression_AspectT, Adwithoutruntime__BooleanExpressionT extends Adwithoutruntime__ExpressionT, Adruntime__BooleanExpression_AspectT extends Adwithoutruntime__BooleanExpressionT, Adwithoutruntime__BooleanUnaryExpressionT extends Adwithoutruntime__BooleanExpressionT, Adruntime__BooleanUnaryExpression_AspectT, Adwithoutruntime__BooleanValueT extends Adwithoutruntime__ValueT, Adwithoutruntime__BooleanVariableT extends Adwithoutruntime__VariableT, Adruntime__BooleanVariable_AspectT, Adwithoutruntime__ControlFlowT extends Adwithoutruntime__ActivityEdgeT, Adruntime__ControlFlow_AspectT, Adwithoutruntime__ControlNodeT extends Adwithoutruntime__ActivityNodeT, Adruntime__ControlNode_AspectT, Adruntime__ControlTokenT extends Adruntime__TokenT, Adwithoutruntime__DecisionNodeT extends Adwithoutruntime__ControlNodeT, Adruntime__DecisionNode_AspectT, Adwithoutruntime__ExecutableNodeT extends Adwithoutruntime__ActivityNodeT, Adruntime__ExecutableNode_AspectT, Adwithoutruntime__ExpressionT, Adwithoutruntime__FinalNodeT extends Adwithoutruntime__ControlNodeT, Adruntime__FinalNode_AspectT, Adwithoutruntime__ForkNodeT extends Adwithoutruntime__ControlNodeT, Adruntime__ForkNode_AspectT, Adruntime__ForkedTokenT extends Adruntime__TokenT, Adwithoutruntime__InitialNodeT extends Adwithoutruntime__ControlNodeT, Adruntime__InitialNode_AspectT, Adruntime__InputT, Adruntime__InputValueT, Adwithoutruntime__IntegerCalculationExpressionT extends Adwithoutruntime__IntegerExpressionT, Adruntime__IntegerCalculationExpression_AspectT, Adwithoutruntime__IntegerComparisonExpressionT extends Adwithoutruntime__IntegerExpressionT, Adruntime__IntegerComparisonExpression_AspectT, Adwithoutruntime__IntegerExpressionT extends Adwithoutruntime__ExpressionT, Adruntime__IntegerExpression_AspectT extends Adwithoutruntime__IntegerExpressionT, Adwithoutruntime__IntegerValueT extends Adwithoutruntime__ValueT, Adwithoutruntime__IntegerVariableT extends Adwithoutruntime__VariableT, Adruntime__IntegerVariable_AspectT, Adwithoutruntime__JoinNodeT extends Adwithoutruntime__ControlNodeT, Adruntime__JoinNode_AspectT, Adwithoutruntime__MergeNodeT extends Adwithoutruntime__ControlNodeT, Adruntime__MergeNode_AspectT, Adwithoutruntime__NamedElementT, Adruntime__OfferT, Adwithoutruntime__OpaqueActionT extends Adwithoutruntime__ActionT, Adruntime__OpaqueAction_AspectT, Adruntime__TokenT, Adruntime__TraceT, Adwithoutruntime__ValueT, Adwithoutruntime__VariableT, Adruntime__Variable_AspectT extends Adwithoutruntime__VariableT>
	extends adwithoutruntime.revisitor.AdwithoutruntimeRevisitor<Adwithoutruntime__ActionT, Adwithoutruntime__ActivityT, Adwithoutruntime__ActivityEdgeT, Adwithoutruntime__ActivityFinalNodeT, Adwithoutruntime__ActivityNodeT, Adwithoutruntime__BooleanBinaryExpressionT, Adwithoutruntime__BooleanExpressionT, Adwithoutruntime__BooleanUnaryExpressionT, Adwithoutruntime__BooleanValueT, Adwithoutruntime__BooleanVariableT, Adwithoutruntime__ControlFlowT, Adwithoutruntime__ControlNodeT, Adwithoutruntime__DecisionNodeT, Adwithoutruntime__ExecutableNodeT, Adwithoutruntime__ExpressionT, Adwithoutruntime__FinalNodeT, Adwithoutruntime__ForkNodeT, Adwithoutruntime__InitialNodeT, Adwithoutruntime__IntegerCalculationExpressionT, Adwithoutruntime__IntegerComparisonExpressionT, Adwithoutruntime__IntegerExpressionT, Adwithoutruntime__IntegerValueT, Adwithoutruntime__IntegerVariableT, Adwithoutruntime__JoinNodeT, Adwithoutruntime__MergeNodeT, Adwithoutruntime__NamedElementT, Adwithoutruntime__OpaqueActionT, Adwithoutruntime__ValueT, Adwithoutruntime__VariableT> {
	Adruntime__Action_AspectT action_Aspect(final adruntime.Action_Aspect a);
	Adwithoutruntime__NamedElementT namedElement_action_Aspect(final adruntime.Action_Aspect a);
	Adwithoutruntime__ActivityNodeT activityNode_action_Aspect(final adruntime.Action_Aspect a);
	Adwithoutruntime__ExecutableNodeT executableNode_action_Aspect(final adruntime.Action_Aspect a);
	Adwithoutruntime__ActionT action_action_Aspect(final adruntime.Action_Aspect a);
	Adruntime__ActivityNode_AspectT activityNode_Aspect_action_Aspect(final adruntime.Action_Aspect a);
	Adruntime__ExecutableNode_AspectT executableNode_Aspect_action_Aspect(final adruntime.Action_Aspect a);
	Adruntime__ActivityEdge_AspectT activityEdge_Aspect(final adruntime.ActivityEdge_Aspect a);
	Adwithoutruntime__NamedElementT namedElement_activityEdge_Aspect(final adruntime.ActivityEdge_Aspect a);
	Adwithoutruntime__ActivityEdgeT activityEdge_activityEdge_Aspect(final adruntime.ActivityEdge_Aspect a);
	Adruntime__ActivityFinalNode_AspectT activityFinalNode_Aspect(final adruntime.ActivityFinalNode_Aspect a);
	Adwithoutruntime__NamedElementT namedElement_activityFinalNode_Aspect(final adruntime.ActivityFinalNode_Aspect a);
	Adwithoutruntime__ActivityNodeT activityNode_activityFinalNode_Aspect(final adruntime.ActivityFinalNode_Aspect a);
	Adwithoutruntime__ControlNodeT controlNode_activityFinalNode_Aspect(final adruntime.ActivityFinalNode_Aspect a);
	Adwithoutruntime__FinalNodeT finalNode_activityFinalNode_Aspect(final adruntime.ActivityFinalNode_Aspect a);
	Adwithoutruntime__ActivityFinalNodeT activityFinalNode_activityFinalNode_Aspect(final adruntime.ActivityFinalNode_Aspect a);
	Adruntime__ActivityNode_AspectT activityNode_Aspect_activityFinalNode_Aspect(final adruntime.ActivityFinalNode_Aspect a);
	Adruntime__ControlNode_AspectT controlNode_Aspect_activityFinalNode_Aspect(final adruntime.ActivityFinalNode_Aspect a);
	Adruntime__FinalNode_AspectT finalNode_Aspect_activityFinalNode_Aspect(final adruntime.ActivityFinalNode_Aspect a);
	Adruntime__ActivityNode_AspectT activityNode_Aspect(final adruntime.ActivityNode_Aspect a);
	Adwithoutruntime__NamedElementT namedElement_activityNode_Aspect(final adruntime.ActivityNode_Aspect a);
	Adwithoutruntime__ActivityNodeT activityNode_activityNode_Aspect(final adruntime.ActivityNode_Aspect a);
	Adruntime__Activity_AspectT activity_Aspect(final adruntime.Activity_Aspect a);
	Adwithoutruntime__NamedElementT namedElement_activity_Aspect(final adruntime.Activity_Aspect a);
	Adwithoutruntime__ActivityT activity_activity_Aspect(final adruntime.Activity_Aspect a);
	Adruntime__BooleanBinaryExpression_AspectT booleanBinaryExpression_Aspect(final adruntime.BooleanBinaryExpression_Aspect b);
	Adwithoutruntime__ExpressionT expression_booleanBinaryExpression_Aspect(final adruntime.BooleanBinaryExpression_Aspect b);
	Adwithoutruntime__BooleanExpressionT booleanExpression_booleanBinaryExpression_Aspect(final adruntime.BooleanBinaryExpression_Aspect b);
	Adwithoutruntime__BooleanBinaryExpressionT booleanBinaryExpression_booleanBinaryExpression_Aspect(final adruntime.BooleanBinaryExpression_Aspect b);
	Adruntime__BooleanExpression_AspectT booleanExpression_Aspect_booleanBinaryExpression_Aspect(final adruntime.BooleanBinaryExpression_Aspect b);
	Adruntime__BooleanExpression_AspectT booleanExpression_Aspect(final adruntime.BooleanExpression_Aspect b);
	Adwithoutruntime__ExpressionT expression_booleanExpression_Aspect(final adruntime.BooleanExpression_Aspect b);
	Adwithoutruntime__BooleanExpressionT booleanExpression_booleanExpression_Aspect(final adruntime.BooleanExpression_Aspect b);
	Adruntime__BooleanUnaryExpression_AspectT booleanUnaryExpression_Aspect(final adruntime.BooleanUnaryExpression_Aspect b);
	Adwithoutruntime__ExpressionT expression_booleanUnaryExpression_Aspect(final adruntime.BooleanUnaryExpression_Aspect b);
	Adwithoutruntime__BooleanExpressionT booleanExpression_booleanUnaryExpression_Aspect(final adruntime.BooleanUnaryExpression_Aspect b);
	Adwithoutruntime__BooleanUnaryExpressionT booleanUnaryExpression_booleanUnaryExpression_Aspect(final adruntime.BooleanUnaryExpression_Aspect b);
	Adruntime__BooleanExpression_AspectT booleanExpression_Aspect_booleanUnaryExpression_Aspect(final adruntime.BooleanUnaryExpression_Aspect b);
	Adruntime__BooleanVariable_AspectT booleanVariable_Aspect(final adruntime.BooleanVariable_Aspect b);
	Adwithoutruntime__VariableT variable_booleanVariable_Aspect(final adruntime.BooleanVariable_Aspect b);
	Adwithoutruntime__BooleanVariableT booleanVariable_booleanVariable_Aspect(final adruntime.BooleanVariable_Aspect b);
	Adruntime__Variable_AspectT variable_Aspect_booleanVariable_Aspect(final adruntime.BooleanVariable_Aspect b);
	Adruntime__ControlFlow_AspectT controlFlow_Aspect(final adruntime.ControlFlow_Aspect c);
	Adwithoutruntime__NamedElementT namedElement_controlFlow_Aspect(final adruntime.ControlFlow_Aspect c);
	Adwithoutruntime__ActivityEdgeT activityEdge_controlFlow_Aspect(final adruntime.ControlFlow_Aspect c);
	Adwithoutruntime__ControlFlowT controlFlow_controlFlow_Aspect(final adruntime.ControlFlow_Aspect c);
	Adruntime__ActivityEdge_AspectT activityEdge_Aspect_controlFlow_Aspect(final adruntime.ControlFlow_Aspect c);
	Adruntime__ControlNode_AspectT controlNode_Aspect(final adruntime.ControlNode_Aspect c);
	Adwithoutruntime__NamedElementT namedElement_controlNode_Aspect(final adruntime.ControlNode_Aspect c);
	Adwithoutruntime__ActivityNodeT activityNode_controlNode_Aspect(final adruntime.ControlNode_Aspect c);
	Adwithoutruntime__ControlNodeT controlNode_controlNode_Aspect(final adruntime.ControlNode_Aspect c);
	Adruntime__ActivityNode_AspectT activityNode_Aspect_controlNode_Aspect(final adruntime.ControlNode_Aspect c);
	Adruntime__ControlTokenT controlToken(final adruntime.ControlToken c);
	Adruntime__TokenT token_controlToken(final adruntime.ControlToken c);
	Adruntime__DecisionNode_AspectT decisionNode_Aspect(final adruntime.DecisionNode_Aspect d);
	Adwithoutruntime__NamedElementT namedElement_decisionNode_Aspect(final adruntime.DecisionNode_Aspect d);
	Adwithoutruntime__ActivityNodeT activityNode_decisionNode_Aspect(final adruntime.DecisionNode_Aspect d);
	Adwithoutruntime__ControlNodeT controlNode_decisionNode_Aspect(final adruntime.DecisionNode_Aspect d);
	Adwithoutruntime__DecisionNodeT decisionNode_decisionNode_Aspect(final adruntime.DecisionNode_Aspect d);
	Adruntime__ActivityNode_AspectT activityNode_Aspect_decisionNode_Aspect(final adruntime.DecisionNode_Aspect d);
	Adruntime__ControlNode_AspectT controlNode_Aspect_decisionNode_Aspect(final adruntime.DecisionNode_Aspect d);
	Adruntime__ExecutableNode_AspectT executableNode_Aspect(final adruntime.ExecutableNode_Aspect e);
	Adwithoutruntime__NamedElementT namedElement_executableNode_Aspect(final adruntime.ExecutableNode_Aspect e);
	Adwithoutruntime__ActivityNodeT activityNode_executableNode_Aspect(final adruntime.ExecutableNode_Aspect e);
	Adwithoutruntime__ExecutableNodeT executableNode_executableNode_Aspect(final adruntime.ExecutableNode_Aspect e);
	Adruntime__ActivityNode_AspectT activityNode_Aspect_executableNode_Aspect(final adruntime.ExecutableNode_Aspect e);
	Adruntime__FinalNode_AspectT finalNode_Aspect(final adruntime.FinalNode_Aspect f);
	Adwithoutruntime__NamedElementT namedElement_finalNode_Aspect(final adruntime.FinalNode_Aspect f);
	Adwithoutruntime__ActivityNodeT activityNode_finalNode_Aspect(final adruntime.FinalNode_Aspect f);
	Adwithoutruntime__ControlNodeT controlNode_finalNode_Aspect(final adruntime.FinalNode_Aspect f);
	Adwithoutruntime__FinalNodeT finalNode_finalNode_Aspect(final adruntime.FinalNode_Aspect f);
	Adruntime__ActivityNode_AspectT activityNode_Aspect_finalNode_Aspect(final adruntime.FinalNode_Aspect f);
	Adruntime__ControlNode_AspectT controlNode_Aspect_finalNode_Aspect(final adruntime.FinalNode_Aspect f);
	Adruntime__ForkNode_AspectT forkNode_Aspect(final adruntime.ForkNode_Aspect f);
	Adwithoutruntime__NamedElementT namedElement_forkNode_Aspect(final adruntime.ForkNode_Aspect f);
	Adwithoutruntime__ActivityNodeT activityNode_forkNode_Aspect(final adruntime.ForkNode_Aspect f);
	Adwithoutruntime__ControlNodeT controlNode_forkNode_Aspect(final adruntime.ForkNode_Aspect f);
	Adwithoutruntime__ForkNodeT forkNode_forkNode_Aspect(final adruntime.ForkNode_Aspect f);
	Adruntime__ActivityNode_AspectT activityNode_Aspect_forkNode_Aspect(final adruntime.ForkNode_Aspect f);
	Adruntime__ControlNode_AspectT controlNode_Aspect_forkNode_Aspect(final adruntime.ForkNode_Aspect f);
	Adruntime__ForkedTokenT forkedToken(final adruntime.ForkedToken f);
	Adruntime__TokenT token_forkedToken(final adruntime.ForkedToken f);
	Adruntime__InitialNode_AspectT initialNode_Aspect(final adruntime.InitialNode_Aspect i);
	Adwithoutruntime__NamedElementT namedElement_initialNode_Aspect(final adruntime.InitialNode_Aspect i);
	Adwithoutruntime__ActivityNodeT activityNode_initialNode_Aspect(final adruntime.InitialNode_Aspect i);
	Adwithoutruntime__ControlNodeT controlNode_initialNode_Aspect(final adruntime.InitialNode_Aspect i);
	Adwithoutruntime__InitialNodeT initialNode_initialNode_Aspect(final adruntime.InitialNode_Aspect i);
	Adruntime__ActivityNode_AspectT activityNode_Aspect_initialNode_Aspect(final adruntime.InitialNode_Aspect i);
	Adruntime__ControlNode_AspectT controlNode_Aspect_initialNode_Aspect(final adruntime.InitialNode_Aspect i);
	Adruntime__InputT input(final adruntime.Input i);
	Adruntime__InputValueT inputValue(final adruntime.InputValue i);
	Adruntime__IntegerCalculationExpression_AspectT integerCalculationExpression_Aspect(final adruntime.IntegerCalculationExpression_Aspect i);
	Adwithoutruntime__ExpressionT expression_integerCalculationExpression_Aspect(final adruntime.IntegerCalculationExpression_Aspect i);
	Adwithoutruntime__IntegerExpressionT integerExpression_integerCalculationExpression_Aspect(final adruntime.IntegerCalculationExpression_Aspect i);
	Adwithoutruntime__IntegerCalculationExpressionT integerCalculationExpression_integerCalculationExpression_Aspect(final adruntime.IntegerCalculationExpression_Aspect i);
	Adruntime__IntegerExpression_AspectT integerExpression_Aspect_integerCalculationExpression_Aspect(final adruntime.IntegerCalculationExpression_Aspect i);
	Adruntime__IntegerComparisonExpression_AspectT integerComparisonExpression_Aspect(final adruntime.IntegerComparisonExpression_Aspect i);
	Adwithoutruntime__ExpressionT expression_integerComparisonExpression_Aspect(final adruntime.IntegerComparisonExpression_Aspect i);
	Adwithoutruntime__IntegerExpressionT integerExpression_integerComparisonExpression_Aspect(final adruntime.IntegerComparisonExpression_Aspect i);
	Adwithoutruntime__IntegerComparisonExpressionT integerComparisonExpression_integerComparisonExpression_Aspect(final adruntime.IntegerComparisonExpression_Aspect i);
	Adruntime__IntegerExpression_AspectT integerExpression_Aspect_integerComparisonExpression_Aspect(final adruntime.IntegerComparisonExpression_Aspect i);
	Adruntime__IntegerExpression_AspectT integerExpression_Aspect(final adruntime.IntegerExpression_Aspect i);
	Adwithoutruntime__ExpressionT expression_integerExpression_Aspect(final adruntime.IntegerExpression_Aspect i);
	Adwithoutruntime__IntegerExpressionT integerExpression_integerExpression_Aspect(final adruntime.IntegerExpression_Aspect i);
	Adruntime__IntegerVariable_AspectT integerVariable_Aspect(final adruntime.IntegerVariable_Aspect i);
	Adwithoutruntime__VariableT variable_integerVariable_Aspect(final adruntime.IntegerVariable_Aspect i);
	Adwithoutruntime__IntegerVariableT integerVariable_integerVariable_Aspect(final adruntime.IntegerVariable_Aspect i);
	Adruntime__Variable_AspectT variable_Aspect_integerVariable_Aspect(final adruntime.IntegerVariable_Aspect i);
	Adruntime__JoinNode_AspectT joinNode_Aspect(final adruntime.JoinNode_Aspect j);
	Adwithoutruntime__NamedElementT namedElement_joinNode_Aspect(final adruntime.JoinNode_Aspect j);
	Adwithoutruntime__ActivityNodeT activityNode_joinNode_Aspect(final adruntime.JoinNode_Aspect j);
	Adwithoutruntime__ControlNodeT controlNode_joinNode_Aspect(final adruntime.JoinNode_Aspect j);
	Adwithoutruntime__JoinNodeT joinNode_joinNode_Aspect(final adruntime.JoinNode_Aspect j);
	Adruntime__ActivityNode_AspectT activityNode_Aspect_joinNode_Aspect(final adruntime.JoinNode_Aspect j);
	Adruntime__ControlNode_AspectT controlNode_Aspect_joinNode_Aspect(final adruntime.JoinNode_Aspect j);
	Adruntime__MergeNode_AspectT mergeNode_Aspect(final adruntime.MergeNode_Aspect m);
	Adwithoutruntime__NamedElementT namedElement_mergeNode_Aspect(final adruntime.MergeNode_Aspect m);
	Adwithoutruntime__ActivityNodeT activityNode_mergeNode_Aspect(final adruntime.MergeNode_Aspect m);
	Adwithoutruntime__ControlNodeT controlNode_mergeNode_Aspect(final adruntime.MergeNode_Aspect m);
	Adwithoutruntime__MergeNodeT mergeNode_mergeNode_Aspect(final adruntime.MergeNode_Aspect m);
	Adruntime__ActivityNode_AspectT activityNode_Aspect_mergeNode_Aspect(final adruntime.MergeNode_Aspect m);
	Adruntime__ControlNode_AspectT controlNode_Aspect_mergeNode_Aspect(final adruntime.MergeNode_Aspect m);
	Adruntime__OfferT offer(final adruntime.Offer o);
	Adruntime__OpaqueAction_AspectT opaqueAction_Aspect(final adruntime.OpaqueAction_Aspect o);
	Adwithoutruntime__NamedElementT namedElement_opaqueAction_Aspect(final adruntime.OpaqueAction_Aspect o);
	Adwithoutruntime__ActivityNodeT activityNode_opaqueAction_Aspect(final adruntime.OpaqueAction_Aspect o);
	Adwithoutruntime__ExecutableNodeT executableNode_opaqueAction_Aspect(final adruntime.OpaqueAction_Aspect o);
	Adwithoutruntime__ActionT action_opaqueAction_Aspect(final adruntime.OpaqueAction_Aspect o);
	Adwithoutruntime__OpaqueActionT opaqueAction_opaqueAction_Aspect(final adruntime.OpaqueAction_Aspect o);
	Adruntime__ActivityNode_AspectT activityNode_Aspect_opaqueAction_Aspect(final adruntime.OpaqueAction_Aspect o);
	Adruntime__ExecutableNode_AspectT executableNode_Aspect_opaqueAction_Aspect(final adruntime.OpaqueAction_Aspect o);
	Adruntime__Action_AspectT action_Aspect_opaqueAction_Aspect(final adruntime.OpaqueAction_Aspect o);
	Adruntime__TokenT token(final adruntime.Token t);
	Adruntime__TraceT trace(final adruntime.Trace t);
	Adruntime__Variable_AspectT variable_Aspect(final adruntime.Variable_Aspect v);
	Adwithoutruntime__VariableT variable_variable_Aspect(final adruntime.Variable_Aspect v);

	default Adwithoutruntime__ActionT $(final adwithoutruntime.Action self) {
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTION_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return action_action_Aspect((adruntime.Action_Aspect) self);
		if (self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.OPAQUE_ACTION
			&& self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE)
			return opaqueAction((adwithoutruntime.OpaqueAction) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.OPAQUE_ACTION_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return action_opaqueAction_Aspect((adruntime.OpaqueAction_Aspect) self);
		return null;
	}
	default Adruntime__Action_AspectT $(final adruntime.Action_Aspect self) {
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.OPAQUE_ACTION_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return action_Aspect_opaqueAction_Aspect((adruntime.OpaqueAction_Aspect) self);
		return action_Aspect(self);
	}
	default Adwithoutruntime__ActivityT $(final adwithoutruntime.Activity self) {
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTIVITY_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return activity_Aspect((adruntime.Activity_Aspect) self);
		return activity(self);
	}
	default Adwithoutruntime__ActivityEdgeT $(final adwithoutruntime.ActivityEdge self) {
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTIVITY_EDGE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return activityEdge_Aspect((adruntime.ActivityEdge_Aspect) self);
		if (self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.CONTROL_FLOW
			&& self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE)
			return controlFlow((adwithoutruntime.ControlFlow) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.CONTROL_FLOW_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return activityEdge_controlFlow_Aspect((adruntime.ControlFlow_Aspect) self);
		return null;
	}
	default Adruntime__ActivityEdge_AspectT $(final adruntime.ActivityEdge_Aspect self) {
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.CONTROL_FLOW_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return activityEdge_Aspect_controlFlow_Aspect((adruntime.ControlFlow_Aspect) self);
		return activityEdge_Aspect(self);
	}
	default Adwithoutruntime__ActivityFinalNodeT $(final adwithoutruntime.ActivityFinalNode self) {
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTIVITY_FINAL_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return activityFinalNode_activityFinalNode_Aspect((adruntime.ActivityFinalNode_Aspect) self);
		return activityFinalNode(self);
	}
	default Adruntime__ActivityFinalNode_AspectT $(final adruntime.ActivityFinalNode_Aspect self) {
		return activityFinalNode_Aspect(self);
	}
	default Adwithoutruntime__ActivityNodeT $(final adwithoutruntime.ActivityNode self) {
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTION_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return activityNode_action_Aspect((adruntime.Action_Aspect) self);
		if (self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.ACTIVITY_FINAL_NODE
			&& self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE)
			return activityFinalNode((adwithoutruntime.ActivityFinalNode) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTIVITY_FINAL_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return activityNode_activityFinalNode_Aspect((adruntime.ActivityFinalNode_Aspect) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTIVITY_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return activityNode_Aspect((adruntime.ActivityNode_Aspect) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.CONTROL_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return activityNode_controlNode_Aspect((adruntime.ControlNode_Aspect) self);
		if (self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.DECISION_NODE
			&& self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE)
			return decisionNode((adwithoutruntime.DecisionNode) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.DECISION_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return activityNode_decisionNode_Aspect((adruntime.DecisionNode_Aspect) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.EXECUTABLE_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return activityNode_executableNode_Aspect((adruntime.ExecutableNode_Aspect) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.FINAL_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return activityNode_finalNode_Aspect((adruntime.FinalNode_Aspect) self);
		if (self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.FORK_NODE
			&& self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE)
			return forkNode((adwithoutruntime.ForkNode) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.FORK_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return activityNode_forkNode_Aspect((adruntime.ForkNode_Aspect) self);
		if (self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.INITIAL_NODE
			&& self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE)
			return initialNode((adwithoutruntime.InitialNode) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.INITIAL_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return activityNode_initialNode_Aspect((adruntime.InitialNode_Aspect) self);
		if (self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.JOIN_NODE
			&& self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE)
			return joinNode((adwithoutruntime.JoinNode) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.JOIN_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return activityNode_joinNode_Aspect((adruntime.JoinNode_Aspect) self);
		if (self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.MERGE_NODE
			&& self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE)
			return mergeNode((adwithoutruntime.MergeNode) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.MERGE_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return activityNode_mergeNode_Aspect((adruntime.MergeNode_Aspect) self);
		if (self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.OPAQUE_ACTION
			&& self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE)
			return opaqueAction((adwithoutruntime.OpaqueAction) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.OPAQUE_ACTION_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return activityNode_opaqueAction_Aspect((adruntime.OpaqueAction_Aspect) self);
		return null;
	}
	default Adruntime__ActivityNode_AspectT $(final adruntime.ActivityNode_Aspect self) {
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTION_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return activityNode_Aspect_action_Aspect((adruntime.Action_Aspect) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTIVITY_FINAL_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return activityNode_Aspect_activityFinalNode_Aspect((adruntime.ActivityFinalNode_Aspect) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.CONTROL_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return activityNode_Aspect_controlNode_Aspect((adruntime.ControlNode_Aspect) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.DECISION_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return activityNode_Aspect_decisionNode_Aspect((adruntime.DecisionNode_Aspect) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.EXECUTABLE_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return activityNode_Aspect_executableNode_Aspect((adruntime.ExecutableNode_Aspect) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.FINAL_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return activityNode_Aspect_finalNode_Aspect((adruntime.FinalNode_Aspect) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.FORK_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return activityNode_Aspect_forkNode_Aspect((adruntime.ForkNode_Aspect) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.INITIAL_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return activityNode_Aspect_initialNode_Aspect((adruntime.InitialNode_Aspect) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.JOIN_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return activityNode_Aspect_joinNode_Aspect((adruntime.JoinNode_Aspect) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.MERGE_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return activityNode_Aspect_mergeNode_Aspect((adruntime.MergeNode_Aspect) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.OPAQUE_ACTION_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return activityNode_Aspect_opaqueAction_Aspect((adruntime.OpaqueAction_Aspect) self);
		return activityNode_Aspect(self);
	}
	default Adruntime__Activity_AspectT $(final adruntime.Activity_Aspect self) {
		return activity_Aspect(self);
	}
	default Adwithoutruntime__BooleanBinaryExpressionT $(final adwithoutruntime.BooleanBinaryExpression self) {
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.BOOLEAN_BINARY_EXPRESSION_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return booleanBinaryExpression_booleanBinaryExpression_Aspect((adruntime.BooleanBinaryExpression_Aspect) self);
		return booleanBinaryExpression(self);
	}
	default Adruntime__BooleanBinaryExpression_AspectT $(final adruntime.BooleanBinaryExpression_Aspect self) {
		return booleanBinaryExpression_Aspect(self);
	}
	default Adwithoutruntime__BooleanExpressionT $(final adwithoutruntime.BooleanExpression self) {
		if (self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.BOOLEAN_BINARY_EXPRESSION
			&& self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE)
			return booleanBinaryExpression((adwithoutruntime.BooleanBinaryExpression) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.BOOLEAN_BINARY_EXPRESSION_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return booleanExpression_booleanBinaryExpression_Aspect((adruntime.BooleanBinaryExpression_Aspect) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.BOOLEAN_EXPRESSION_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return booleanExpression_Aspect((adruntime.BooleanExpression_Aspect) self);
		if (self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.BOOLEAN_UNARY_EXPRESSION
			&& self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE)
			return booleanUnaryExpression((adwithoutruntime.BooleanUnaryExpression) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.BOOLEAN_UNARY_EXPRESSION_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return booleanExpression_booleanUnaryExpression_Aspect((adruntime.BooleanUnaryExpression_Aspect) self);
		return null;
	}
	default Adruntime__BooleanExpression_AspectT $(final adruntime.BooleanExpression_Aspect self) {
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.BOOLEAN_BINARY_EXPRESSION_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return booleanExpression_Aspect_booleanBinaryExpression_Aspect((adruntime.BooleanBinaryExpression_Aspect) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.BOOLEAN_UNARY_EXPRESSION_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return booleanExpression_Aspect_booleanUnaryExpression_Aspect((adruntime.BooleanUnaryExpression_Aspect) self);
		return booleanExpression_Aspect(self);
	}
	default Adwithoutruntime__BooleanUnaryExpressionT $(final adwithoutruntime.BooleanUnaryExpression self) {
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.BOOLEAN_UNARY_EXPRESSION_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return booleanUnaryExpression_booleanUnaryExpression_Aspect((adruntime.BooleanUnaryExpression_Aspect) self);
		return booleanUnaryExpression(self);
	}
	default Adruntime__BooleanUnaryExpression_AspectT $(final adruntime.BooleanUnaryExpression_Aspect self) {
		return booleanUnaryExpression_Aspect(self);
	}
	default Adwithoutruntime__BooleanValueT $(final adwithoutruntime.BooleanValue self) {
		return booleanValue(self);
	}
	default Adwithoutruntime__BooleanVariableT $(final adwithoutruntime.BooleanVariable self) {
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.BOOLEAN_VARIABLE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return booleanVariable_booleanVariable_Aspect((adruntime.BooleanVariable_Aspect) self);
		return booleanVariable(self);
	}
	default Adruntime__BooleanVariable_AspectT $(final adruntime.BooleanVariable_Aspect self) {
		return booleanVariable_Aspect(self);
	}
	default Adwithoutruntime__ControlFlowT $(final adwithoutruntime.ControlFlow self) {
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.CONTROL_FLOW_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return controlFlow_controlFlow_Aspect((adruntime.ControlFlow_Aspect) self);
		return controlFlow(self);
	}
	default Adruntime__ControlFlow_AspectT $(final adruntime.ControlFlow_Aspect self) {
		return controlFlow_Aspect(self);
	}
	default Adwithoutruntime__ControlNodeT $(final adwithoutruntime.ControlNode self) {
		if (self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.ACTIVITY_FINAL_NODE
			&& self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE)
			return activityFinalNode((adwithoutruntime.ActivityFinalNode) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTIVITY_FINAL_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return controlNode_activityFinalNode_Aspect((adruntime.ActivityFinalNode_Aspect) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.CONTROL_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return controlNode_controlNode_Aspect((adruntime.ControlNode_Aspect) self);
		if (self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.DECISION_NODE
			&& self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE)
			return decisionNode((adwithoutruntime.DecisionNode) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.DECISION_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return controlNode_decisionNode_Aspect((adruntime.DecisionNode_Aspect) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.FINAL_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return controlNode_finalNode_Aspect((adruntime.FinalNode_Aspect) self);
		if (self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.FORK_NODE
			&& self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE)
			return forkNode((adwithoutruntime.ForkNode) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.FORK_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return controlNode_forkNode_Aspect((adruntime.ForkNode_Aspect) self);
		if (self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.INITIAL_NODE
			&& self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE)
			return initialNode((adwithoutruntime.InitialNode) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.INITIAL_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return controlNode_initialNode_Aspect((adruntime.InitialNode_Aspect) self);
		if (self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.JOIN_NODE
			&& self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE)
			return joinNode((adwithoutruntime.JoinNode) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.JOIN_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return controlNode_joinNode_Aspect((adruntime.JoinNode_Aspect) self);
		if (self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.MERGE_NODE
			&& self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE)
			return mergeNode((adwithoutruntime.MergeNode) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.MERGE_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return controlNode_mergeNode_Aspect((adruntime.MergeNode_Aspect) self);
		return null;
	}
	default Adruntime__ControlNode_AspectT $(final adruntime.ControlNode_Aspect self) {
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTIVITY_FINAL_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return controlNode_Aspect_activityFinalNode_Aspect((adruntime.ActivityFinalNode_Aspect) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.DECISION_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return controlNode_Aspect_decisionNode_Aspect((adruntime.DecisionNode_Aspect) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.FINAL_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return controlNode_Aspect_finalNode_Aspect((adruntime.FinalNode_Aspect) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.FORK_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return controlNode_Aspect_forkNode_Aspect((adruntime.ForkNode_Aspect) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.INITIAL_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return controlNode_Aspect_initialNode_Aspect((adruntime.InitialNode_Aspect) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.JOIN_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return controlNode_Aspect_joinNode_Aspect((adruntime.JoinNode_Aspect) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.MERGE_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return controlNode_Aspect_mergeNode_Aspect((adruntime.MergeNode_Aspect) self);
		return controlNode_Aspect(self);
	}
	default Adruntime__ControlTokenT $(final adruntime.ControlToken self) {
		return controlToken(self);
	}
	default Adwithoutruntime__DecisionNodeT $(final adwithoutruntime.DecisionNode self) {
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.DECISION_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return decisionNode_decisionNode_Aspect((adruntime.DecisionNode_Aspect) self);
		return decisionNode(self);
	}
	default Adruntime__DecisionNode_AspectT $(final adruntime.DecisionNode_Aspect self) {
		return decisionNode_Aspect(self);
	}
	default Adwithoutruntime__ExecutableNodeT $(final adwithoutruntime.ExecutableNode self) {
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTION_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return executableNode_action_Aspect((adruntime.Action_Aspect) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.EXECUTABLE_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return executableNode_executableNode_Aspect((adruntime.ExecutableNode_Aspect) self);
		if (self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.OPAQUE_ACTION
			&& self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE)
			return opaqueAction((adwithoutruntime.OpaqueAction) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.OPAQUE_ACTION_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return executableNode_opaqueAction_Aspect((adruntime.OpaqueAction_Aspect) self);
		return null;
	}
	default Adruntime__ExecutableNode_AspectT $(final adruntime.ExecutableNode_Aspect self) {
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTION_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return executableNode_Aspect_action_Aspect((adruntime.Action_Aspect) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.OPAQUE_ACTION_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return executableNode_Aspect_opaqueAction_Aspect((adruntime.OpaqueAction_Aspect) self);
		return executableNode_Aspect(self);
	}
	default Adwithoutruntime__ExpressionT $(final adwithoutruntime.Expression self) {
		if (self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.BOOLEAN_BINARY_EXPRESSION
			&& self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE)
			return booleanBinaryExpression((adwithoutruntime.BooleanBinaryExpression) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.BOOLEAN_BINARY_EXPRESSION_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return expression_booleanBinaryExpression_Aspect((adruntime.BooleanBinaryExpression_Aspect) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.BOOLEAN_EXPRESSION_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return booleanExpression_Aspect((adruntime.BooleanExpression_Aspect) self);
		if (self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.BOOLEAN_UNARY_EXPRESSION
			&& self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE)
			return booleanUnaryExpression((adwithoutruntime.BooleanUnaryExpression) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.BOOLEAN_UNARY_EXPRESSION_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return expression_booleanUnaryExpression_Aspect((adruntime.BooleanUnaryExpression_Aspect) self);
		if (self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.INTEGER_CALCULATION_EXPRESSION
			&& self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE)
			return integerCalculationExpression((adwithoutruntime.IntegerCalculationExpression) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.INTEGER_CALCULATION_EXPRESSION_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return expression_integerCalculationExpression_Aspect((adruntime.IntegerCalculationExpression_Aspect) self);
		if (self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.INTEGER_COMPARISON_EXPRESSION
			&& self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE)
			return integerComparisonExpression((adwithoutruntime.IntegerComparisonExpression) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.INTEGER_COMPARISON_EXPRESSION_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return expression_integerComparisonExpression_Aspect((adruntime.IntegerComparisonExpression_Aspect) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.INTEGER_EXPRESSION_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return integerExpression_Aspect((adruntime.IntegerExpression_Aspect) self);
		return null;
	}
	default Adwithoutruntime__FinalNodeT $(final adwithoutruntime.FinalNode self) {
		if (self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.ACTIVITY_FINAL_NODE
			&& self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE)
			return activityFinalNode((adwithoutruntime.ActivityFinalNode) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTIVITY_FINAL_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return finalNode_activityFinalNode_Aspect((adruntime.ActivityFinalNode_Aspect) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.FINAL_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return finalNode_finalNode_Aspect((adruntime.FinalNode_Aspect) self);
		return null;
	}
	default Adruntime__FinalNode_AspectT $(final adruntime.FinalNode_Aspect self) {
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTIVITY_FINAL_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return finalNode_Aspect_activityFinalNode_Aspect((adruntime.ActivityFinalNode_Aspect) self);
		return finalNode_Aspect(self);
	}
	default Adwithoutruntime__ForkNodeT $(final adwithoutruntime.ForkNode self) {
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.FORK_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return forkNode_forkNode_Aspect((adruntime.ForkNode_Aspect) self);
		return forkNode(self);
	}
	default Adruntime__ForkNode_AspectT $(final adruntime.ForkNode_Aspect self) {
		return forkNode_Aspect(self);
	}
	default Adruntime__ForkedTokenT $(final adruntime.ForkedToken self) {
		return forkedToken(self);
	}
	default Adwithoutruntime__InitialNodeT $(final adwithoutruntime.InitialNode self) {
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.INITIAL_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return initialNode_initialNode_Aspect((adruntime.InitialNode_Aspect) self);
		return initialNode(self);
	}
	default Adruntime__InitialNode_AspectT $(final adruntime.InitialNode_Aspect self) {
		return initialNode_Aspect(self);
	}
	default Adruntime__InputT $(final adruntime.Input self) {
		return input(self);
	}
	default Adruntime__InputValueT $(final adruntime.InputValue self) {
		return inputValue(self);
	}
	default Adwithoutruntime__IntegerCalculationExpressionT $(final adwithoutruntime.IntegerCalculationExpression self) {
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.INTEGER_CALCULATION_EXPRESSION_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return integerCalculationExpression_integerCalculationExpression_Aspect((adruntime.IntegerCalculationExpression_Aspect) self);
		return integerCalculationExpression(self);
	}
	default Adruntime__IntegerCalculationExpression_AspectT $(final adruntime.IntegerCalculationExpression_Aspect self) {
		return integerCalculationExpression_Aspect(self);
	}
	default Adwithoutruntime__IntegerComparisonExpressionT $(final adwithoutruntime.IntegerComparisonExpression self) {
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.INTEGER_COMPARISON_EXPRESSION_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return integerComparisonExpression_integerComparisonExpression_Aspect((adruntime.IntegerComparisonExpression_Aspect) self);
		return integerComparisonExpression(self);
	}
	default Adruntime__IntegerComparisonExpression_AspectT $(final adruntime.IntegerComparisonExpression_Aspect self) {
		return integerComparisonExpression_Aspect(self);
	}
	default Adwithoutruntime__IntegerExpressionT $(final adwithoutruntime.IntegerExpression self) {
		if (self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.INTEGER_CALCULATION_EXPRESSION
			&& self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE)
			return integerCalculationExpression((adwithoutruntime.IntegerCalculationExpression) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.INTEGER_CALCULATION_EXPRESSION_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return integerExpression_integerCalculationExpression_Aspect((adruntime.IntegerCalculationExpression_Aspect) self);
		if (self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.INTEGER_COMPARISON_EXPRESSION
			&& self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE)
			return integerComparisonExpression((adwithoutruntime.IntegerComparisonExpression) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.INTEGER_COMPARISON_EXPRESSION_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return integerExpression_integerComparisonExpression_Aspect((adruntime.IntegerComparisonExpression_Aspect) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.INTEGER_EXPRESSION_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return integerExpression_Aspect((adruntime.IntegerExpression_Aspect) self);
		return null;
	}
	default Adruntime__IntegerExpression_AspectT $(final adruntime.IntegerExpression_Aspect self) {
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.INTEGER_CALCULATION_EXPRESSION_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return integerExpression_Aspect_integerCalculationExpression_Aspect((adruntime.IntegerCalculationExpression_Aspect) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.INTEGER_COMPARISON_EXPRESSION_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return integerExpression_Aspect_integerComparisonExpression_Aspect((adruntime.IntegerComparisonExpression_Aspect) self);
		return integerExpression_Aspect(self);
	}
	default Adwithoutruntime__IntegerValueT $(final adwithoutruntime.IntegerValue self) {
		return integerValue(self);
	}
	default Adwithoutruntime__IntegerVariableT $(final adwithoutruntime.IntegerVariable self) {
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.INTEGER_VARIABLE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return integerVariable_integerVariable_Aspect((adruntime.IntegerVariable_Aspect) self);
		return integerVariable(self);
	}
	default Adruntime__IntegerVariable_AspectT $(final adruntime.IntegerVariable_Aspect self) {
		return integerVariable_Aspect(self);
	}
	default Adwithoutruntime__JoinNodeT $(final adwithoutruntime.JoinNode self) {
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.JOIN_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return joinNode_joinNode_Aspect((adruntime.JoinNode_Aspect) self);
		return joinNode(self);
	}
	default Adruntime__JoinNode_AspectT $(final adruntime.JoinNode_Aspect self) {
		return joinNode_Aspect(self);
	}
	default Adwithoutruntime__MergeNodeT $(final adwithoutruntime.MergeNode self) {
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.MERGE_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return mergeNode_mergeNode_Aspect((adruntime.MergeNode_Aspect) self);
		return mergeNode(self);
	}
	default Adruntime__MergeNode_AspectT $(final adruntime.MergeNode_Aspect self) {
		return mergeNode_Aspect(self);
	}
	default Adwithoutruntime__NamedElementT $(final adwithoutruntime.NamedElement self) {
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTION_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return namedElement_action_Aspect((adruntime.Action_Aspect) self);
		if (self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.ACTIVITY
			&& self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE)
			return activity((adwithoutruntime.Activity) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTIVITY_EDGE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return activityEdge_Aspect((adruntime.ActivityEdge_Aspect) self);
		if (self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.ACTIVITY_FINAL_NODE
			&& self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE)
			return activityFinalNode((adwithoutruntime.ActivityFinalNode) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTIVITY_FINAL_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return namedElement_activityFinalNode_Aspect((adruntime.ActivityFinalNode_Aspect) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTIVITY_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return activityNode_Aspect((adruntime.ActivityNode_Aspect) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTIVITY_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return activity_Aspect((adruntime.Activity_Aspect) self);
		if (self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.CONTROL_FLOW
			&& self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE)
			return controlFlow((adwithoutruntime.ControlFlow) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.CONTROL_FLOW_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return namedElement_controlFlow_Aspect((adruntime.ControlFlow_Aspect) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.CONTROL_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return namedElement_controlNode_Aspect((adruntime.ControlNode_Aspect) self);
		if (self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.DECISION_NODE
			&& self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE)
			return decisionNode((adwithoutruntime.DecisionNode) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.DECISION_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return namedElement_decisionNode_Aspect((adruntime.DecisionNode_Aspect) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.EXECUTABLE_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return namedElement_executableNode_Aspect((adruntime.ExecutableNode_Aspect) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.FINAL_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return namedElement_finalNode_Aspect((adruntime.FinalNode_Aspect) self);
		if (self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.FORK_NODE
			&& self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE)
			return forkNode((adwithoutruntime.ForkNode) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.FORK_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return namedElement_forkNode_Aspect((adruntime.ForkNode_Aspect) self);
		if (self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.INITIAL_NODE
			&& self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE)
			return initialNode((adwithoutruntime.InitialNode) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.INITIAL_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return namedElement_initialNode_Aspect((adruntime.InitialNode_Aspect) self);
		if (self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.JOIN_NODE
			&& self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE)
			return joinNode((adwithoutruntime.JoinNode) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.JOIN_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return namedElement_joinNode_Aspect((adruntime.JoinNode_Aspect) self);
		if (self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.MERGE_NODE
			&& self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE)
			return mergeNode((adwithoutruntime.MergeNode) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.MERGE_NODE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return namedElement_mergeNode_Aspect((adruntime.MergeNode_Aspect) self);
		if (self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.OPAQUE_ACTION
			&& self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE)
			return opaqueAction((adwithoutruntime.OpaqueAction) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.OPAQUE_ACTION_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return namedElement_opaqueAction_Aspect((adruntime.OpaqueAction_Aspect) self);
		return null;
	}
	default Adruntime__OfferT $(final adruntime.Offer self) {
		return offer(self);
	}
	default Adwithoutruntime__OpaqueActionT $(final adwithoutruntime.OpaqueAction self) {
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.OPAQUE_ACTION_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return opaqueAction_opaqueAction_Aspect((adruntime.OpaqueAction_Aspect) self);
		return opaqueAction(self);
	}
	default Adruntime__OpaqueAction_AspectT $(final adruntime.OpaqueAction_Aspect self) {
		return opaqueAction_Aspect(self);
	}
	default Adruntime__TokenT $(final adruntime.Token self) {
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.CONTROL_TOKEN
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return controlToken((adruntime.ControlToken) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.FORKED_TOKEN
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return forkedToken((adruntime.ForkedToken) self);
		return token(self);
	}
	default Adruntime__TraceT $(final adruntime.Trace self) {
		return trace(self);
	}
	default Adwithoutruntime__ValueT $(final adwithoutruntime.Value self) {
		if (self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.BOOLEAN_VALUE
			&& self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE)
			return booleanValue((adwithoutruntime.BooleanValue) self);
		if (self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.INTEGER_VALUE
			&& self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE)
			return integerValue((adwithoutruntime.IntegerValue) self);
		return null;
	}
	default Adwithoutruntime__VariableT $(final adwithoutruntime.Variable self) {
		if (self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.BOOLEAN_VARIABLE
			&& self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE)
			return booleanVariable((adwithoutruntime.BooleanVariable) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.BOOLEAN_VARIABLE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return variable_booleanVariable_Aspect((adruntime.BooleanVariable_Aspect) self);
		if (self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.INTEGER_VARIABLE
			&& self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE)
			return integerVariable((adwithoutruntime.IntegerVariable) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.INTEGER_VARIABLE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return variable_integerVariable_Aspect((adruntime.IntegerVariable_Aspect) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.VARIABLE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return variable_Aspect((adruntime.Variable_Aspect) self);
		return null;
	}
	default Adruntime__Variable_AspectT $(final adruntime.Variable_Aspect self) {
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.BOOLEAN_VARIABLE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return variable_Aspect_booleanVariable_Aspect((adruntime.BooleanVariable_Aspect) self);
		if (self.eClass().getClassifierID() == adruntime.AdruntimePackage.INTEGER_VARIABLE_ASPECT
			&& self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE)
			return variable_Aspect_integerVariable_Aspect((adruntime.IntegerVariable_Aspect) self);
		return variable_Aspect(self);
	}
}
