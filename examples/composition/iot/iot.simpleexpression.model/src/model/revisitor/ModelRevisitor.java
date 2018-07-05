package model.revisitor;

public interface ModelRevisitor<SimpleALEnv__ALVarRefT extends SimpleALEnv__ArithT, Activitydiagram__ActionT extends Activitydiagram__ExecutableNodeT, Activitydiagram__ActivityT extends Activitydiagram__NamedActivityT, Activitydiagram__ActivityEdgeT extends Activitydiagram__NamedActivityT, Activitydiagram__ActivityFinalNodeT extends Activitydiagram__FinalNodeT, Activitydiagram__ActivityNodeT extends Activitydiagram__NamedActivityT, Iot__ActuatorT extends Iot__HWCompT, SimpleALEnv__ArithT, SimpleALEnv__ArithLitT extends SimpleALEnv__ArithT, SimpleALEnv__ArithMinusT extends SimpleALEnv__ArithOpT, SimpleALEnv__ArithOpT extends SimpleALEnv__ArithT, SimpleALEnv__ArithPlusT extends SimpleALEnv__ArithOpT, SimpleALEnv__AssignT extends SimpleALEnv__StmtT, SimpleALEnv__BlockT, Iot__BoardT, Activitydiagram__BooleanValueT extends Activitydiagram__ValueT, Activitydiagram__BooleanVariableT extends Activitydiagram__VariableT, Model__BooleanVariableBindSEBooleanVariableT extends Activitydiagram__BooleanVariableT, Idlmm__ContainedT extends Idlmm__NamedElementT, Idlmm__ContainerT extends Idlmm__ContainedT, Activitydiagram__ContextT, Activitydiagram__ControlFlowT extends Activitydiagram__ActivityEdgeT, Activitydiagram__ControlNodeT extends Activitydiagram__ActivityNodeT, Activitydiagram__ControlTokenT extends Activitydiagram__TokenT, Activitydiagram__DecisionNodeT extends Activitydiagram__ControlNodeT, SimpleALEnv__EqualityTestT, Idlmm__ExceptionDefT extends Idlmm__ContainedT, Activitydiagram__ExecutableNodeT extends Activitydiagram__ActivityNodeT, Activitydiagram__ExpT, Model__ExpressionBindOperationDefT extends Activitydiagram__ExpT, Model__ExpressionBindSEExpressionT extends Activitydiagram__ExpT, Idlmm__FieldIT, Activitydiagram__FinalNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__ForkNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__ForkedTokenT extends Activitydiagram__TokenT, Iot__HWCompT, Idlmm__IDLTypeT, Idlmm__IdlStmtT, Model__IdlStmtBindBlockT extends Idlmm__IdlStmtT, SimpleALEnv__IfStmtT extends SimpleALEnv__StmtT, Activitydiagram__InitialNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__InputT, Activitydiagram__InputValueT, Activitydiagram__IntegerValueT extends Activitydiagram__ValueT, Activitydiagram__IntegerVariableT extends Activitydiagram__VariableT, Model__IntegerVariableBindSEIntegerVariableT extends Activitydiagram__IntegerVariableT, Model__IoTActivityBindActivityT extends Iot__IotActivityT, Iot__IotActivityT, Iot__IotOperationDefT, Model__IotOperationDefBindOperationDefT extends Iot__IotOperationDefT, Activitydiagram__JoinNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__MergeNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__NamedActivityT, Idlmm__NamedElementT, Activitydiagram__OfferT, Activitydiagram__OpaqueActionT extends Activitydiagram__ActionT, Idlmm__OperationDefT extends Idlmm__ContainedT, Idlmm__ParameterDefT, Idlmm__PrimitiveDefT extends Idlmm__IDLTypeT, SimpleALEnv__PrintT extends SimpleALEnv__StmtT, SimpleALEnv__RandRangeT extends SimpleALEnv__ArithT, Simpleexpressions__SEBooleanBinaryExpressionT extends Simpleexpressions__SEBooleanExpressionT, Simpleexpressions__SEBooleanExpressionT extends Simpleexpressions__SEExpressionT, Simpleexpressions__SEBooleanUnaryExpressionT extends Simpleexpressions__SEBooleanExpressionT, Simpleexpressions__SEBooleanValueT extends Simpleexpressions__SEValueT, Simpleexpressions__SEBooleanVariableT extends Simpleexpressions__SEVariableT, Simpleexpressions__SEExpressionT, Simpleexpressions__SEIntegerCalculationExpressionT extends Simpleexpressions__SEIntegerExpressionT, Simpleexpressions__SEIntegerComparisonExpressionT extends Simpleexpressions__SEIntegerExpressionT, Simpleexpressions__SEIntegerExpressionT extends Simpleexpressions__SEExpressionT, Simpleexpressions__SEIntegerValueT extends Simpleexpressions__SEValueT, Simpleexpressions__SEIntegerVariableT extends Simpleexpressions__SEVariableT, Simpleexpressions__SEValueT extends Simpleexpressions__SEExpressionT, Simpleexpressions__SEVariableT extends Simpleexpressions__SEExpressionT, Iot__SensorT extends Iot__HWCompT, Iot__SketchT, SimpleALEnv__StmtT, Iot__SystemT, Activitydiagram__TokenT, Activitydiagram__TraceT, Activitydiagram__ValueT, Activitydiagram__VariableT>
	extends idlmm.revisitor.IdlmmRevisitor<Idlmm__ContainedT, Idlmm__ContainerT, Idlmm__ExceptionDefT, Idlmm__FieldIT, Idlmm__IDLTypeT, Idlmm__IdlStmtT, Idlmm__NamedElementT, Idlmm__OperationDefT, Idlmm__ParameterDefT, Idlmm__PrimitiveDefT>,
		activitydiagram.revisitor.ActivitydiagramRevisitor<Activitydiagram__ActionT, Activitydiagram__ActivityT, Activitydiagram__ActivityEdgeT, Activitydiagram__ActivityFinalNodeT, Activitydiagram__ActivityNodeT, Activitydiagram__BooleanValueT, Activitydiagram__BooleanVariableT, Activitydiagram__ContextT, Activitydiagram__ControlFlowT, Activitydiagram__ControlNodeT, Activitydiagram__ControlTokenT, Activitydiagram__DecisionNodeT, Activitydiagram__ExecutableNodeT, Activitydiagram__ExpT, Activitydiagram__FinalNodeT, Activitydiagram__ForkNodeT, Activitydiagram__ForkedTokenT, Activitydiagram__InitialNodeT, Activitydiagram__InputT, Activitydiagram__InputValueT, Activitydiagram__IntegerValueT, Activitydiagram__IntegerVariableT, Activitydiagram__JoinNodeT, Activitydiagram__MergeNodeT, Activitydiagram__NamedActivityT, Activitydiagram__OfferT, Activitydiagram__OpaqueActionT, Activitydiagram__TokenT, Activitydiagram__TraceT, Activitydiagram__ValueT, Activitydiagram__VariableT>,
		iot.revisitor.IotRevisitor<Iot__ActuatorT, Iot__BoardT, Iot__HWCompT, Iot__IotActivityT, Iot__IotOperationDefT, Iot__SensorT, Iot__SketchT, Iot__SystemT>,
		simpleALEnv.revisitor.SimpleALEnvRevisitor<SimpleALEnv__ALVarRefT, SimpleALEnv__ArithT, SimpleALEnv__ArithLitT, SimpleALEnv__ArithMinusT, SimpleALEnv__ArithOpT, SimpleALEnv__ArithPlusT, SimpleALEnv__AssignT, SimpleALEnv__BlockT, SimpleALEnv__EqualityTestT, SimpleALEnv__IfStmtT, SimpleALEnv__PrintT, SimpleALEnv__RandRangeT, SimpleALEnv__StmtT>,
		simpleexpressions.revisitor.SimpleexpressionsRevisitor<Simpleexpressions__SEBooleanBinaryExpressionT, Simpleexpressions__SEBooleanExpressionT, Simpleexpressions__SEBooleanUnaryExpressionT, Simpleexpressions__SEBooleanValueT, Simpleexpressions__SEBooleanVariableT, Simpleexpressions__SEExpressionT, Simpleexpressions__SEIntegerCalculationExpressionT, Simpleexpressions__SEIntegerComparisonExpressionT, Simpleexpressions__SEIntegerExpressionT, Simpleexpressions__SEIntegerValueT, Simpleexpressions__SEIntegerVariableT, Simpleexpressions__SEValueT, Simpleexpressions__SEVariableT> {
	Model__BooleanVariableBindSEBooleanVariableT model__BooleanVariableBindSEBooleanVariable(final model.BooleanVariableBindSEBooleanVariable it);
	Model__ExpressionBindOperationDefT model__ExpressionBindOperationDef(final model.ExpressionBindOperationDef it);
	Model__ExpressionBindSEExpressionT model__ExpressionBindSEExpression(final model.ExpressionBindSEExpression it);
	Model__IdlStmtBindBlockT model__IdlStmtBindBlock(final model.IdlStmtBindBlock it);
	Model__IntegerVariableBindSEIntegerVariableT model__IntegerVariableBindSEIntegerVariable(final model.IntegerVariableBindSEIntegerVariable it);
	Model__IoTActivityBindActivityT model__IoTActivityBindActivity(final model.IoTActivityBindActivity it);
	Model__IotOperationDefBindOperationDefT model__IotOperationDefBindOperationDef(final model.IotOperationDefBindOperationDef it);

	default SimpleALEnv__ALVarRefT $(final simpleALEnv.ALVarRef it) {
		return simpleALEnv__ALVarRef(it);
	}
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
	default Iot__ActuatorT $(final iot.Actuator it) {
		return iot__Actuator(it);
	}
	default SimpleALEnv__ArithT $(final simpleALEnv.Arith it) {
		if (it.getClass() == simpleALEnv.impl.ALVarRefImpl.class)
			return simpleALEnv__ALVarRef((simpleALEnv.ALVarRef) it);
		if (it.getClass() == simpleALEnv.impl.ArithLitImpl.class)
			return simpleALEnv__ArithLit((simpleALEnv.ArithLit) it);
		if (it.getClass() == simpleALEnv.impl.ArithMinusImpl.class)
			return simpleALEnv__ArithMinus((simpleALEnv.ArithMinus) it);
		if (it.getClass() == simpleALEnv.impl.ArithPlusImpl.class)
			return simpleALEnv__ArithPlus((simpleALEnv.ArithPlus) it);
		if (it.getClass() == simpleALEnv.impl.RandRangeImpl.class)
			return simpleALEnv__RandRange((simpleALEnv.RandRange) it);
		return null;
	}
	default SimpleALEnv__ArithLitT $(final simpleALEnv.ArithLit it) {
		return simpleALEnv__ArithLit(it);
	}
	default SimpleALEnv__ArithMinusT $(final simpleALEnv.ArithMinus it) {
		return simpleALEnv__ArithMinus(it);
	}
	default SimpleALEnv__ArithOpT $(final simpleALEnv.ArithOp it) {
		if (it.getClass() == simpleALEnv.impl.ArithMinusImpl.class)
			return simpleALEnv__ArithMinus((simpleALEnv.ArithMinus) it);
		if (it.getClass() == simpleALEnv.impl.ArithPlusImpl.class)
			return simpleALEnv__ArithPlus((simpleALEnv.ArithPlus) it);
		return null;
	}
	default SimpleALEnv__ArithPlusT $(final simpleALEnv.ArithPlus it) {
		return simpleALEnv__ArithPlus(it);
	}
	default SimpleALEnv__AssignT $(final simpleALEnv.Assign it) {
		return simpleALEnv__Assign(it);
	}
	default SimpleALEnv__BlockT $(final simpleALEnv.Block it) {
		return simpleALEnv__Block(it);
	}
	default Iot__BoardT $(final iot.Board it) {
		return iot__Board(it);
	}
	default Activitydiagram__BooleanValueT $(final activitydiagram.BooleanValue it) {
		return activitydiagram__BooleanValue(it);
	}
	default Activitydiagram__BooleanVariableT $(final activitydiagram.BooleanVariable it) {
		if (it.getClass() == model.impl.BooleanVariableBindSEBooleanVariableImpl.class)
			return model__BooleanVariableBindSEBooleanVariable((model.BooleanVariableBindSEBooleanVariable) it);
		return null;
	}
	default Model__BooleanVariableBindSEBooleanVariableT $(final model.BooleanVariableBindSEBooleanVariable it) {
		return model__BooleanVariableBindSEBooleanVariable(it);
	}
	default Idlmm__ContainedT $(final idlmm.Contained it) {
		if (it.getClass() == idlmm.impl.ExceptionDefImpl.class)
			return idlmm__ExceptionDef((idlmm.ExceptionDef) it);
		if (it.getClass() == idlmm.impl.OperationDefImpl.class)
			return idlmm__OperationDef((idlmm.OperationDef) it);
		return null;
	}
	default Idlmm__ContainerT $(final idlmm.Container it) {
		return null;
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
	default SimpleALEnv__EqualityTestT $(final simpleALEnv.EqualityTest it) {
		return simpleALEnv__EqualityTest(it);
	}
	default Idlmm__ExceptionDefT $(final idlmm.ExceptionDef it) {
		return idlmm__ExceptionDef(it);
	}
	default Activitydiagram__ExecutableNodeT $(final activitydiagram.ExecutableNode it) {
		if (it.getClass() == activitydiagram.impl.OpaqueActionImpl.class)
			return activitydiagram__OpaqueAction((activitydiagram.OpaqueAction) it);
		return null;
	}
	default Activitydiagram__ExpT $(final activitydiagram.Exp it) {
		if (it.getClass() == model.impl.ExpressionBindOperationDefImpl.class)
			return model__ExpressionBindOperationDef((model.ExpressionBindOperationDef) it);
		if (it.getClass() == model.impl.ExpressionBindSEExpressionImpl.class)
			return model__ExpressionBindSEExpression((model.ExpressionBindSEExpression) it);
		return null;
	}
	default Model__ExpressionBindOperationDefT $(final model.ExpressionBindOperationDef it) {
		return model__ExpressionBindOperationDef(it);
	}
	default Model__ExpressionBindSEExpressionT $(final model.ExpressionBindSEExpression it) {
		return model__ExpressionBindSEExpression(it);
	}
	default Idlmm__FieldIT $(final idlmm.FieldI it) {
		return idlmm__FieldI(it);
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
	default Iot__HWCompT $(final iot.HWComp it) {
		if (it.getClass() == iot.impl.ActuatorImpl.class)
			return iot__Actuator((iot.Actuator) it);
		if (it.getClass() == iot.impl.SensorImpl.class)
			return iot__Sensor((iot.Sensor) it);
		return null;
	}
	default Idlmm__IDLTypeT $(final idlmm.IDLType it) {
		if (it.getClass() == idlmm.impl.PrimitiveDefImpl.class)
			return idlmm__PrimitiveDef((idlmm.PrimitiveDef) it);
		return null;
	}
	default Idlmm__IdlStmtT $(final idlmm.IdlStmt it) {
		if (it.getClass() == model.impl.IdlStmtBindBlockImpl.class)
			return model__IdlStmtBindBlock((model.IdlStmtBindBlock) it);
		return null;
	}
	default Model__IdlStmtBindBlockT $(final model.IdlStmtBindBlock it) {
		return model__IdlStmtBindBlock(it);
	}
	default SimpleALEnv__IfStmtT $(final simpleALEnv.IfStmt it) {
		return simpleALEnv__IfStmt(it);
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
		if (it.getClass() == model.impl.IntegerVariableBindSEIntegerVariableImpl.class)
			return model__IntegerVariableBindSEIntegerVariable((model.IntegerVariableBindSEIntegerVariable) it);
		return null;
	}
	default Model__IntegerVariableBindSEIntegerVariableT $(final model.IntegerVariableBindSEIntegerVariable it) {
		return model__IntegerVariableBindSEIntegerVariable(it);
	}
	default Model__IoTActivityBindActivityT $(final model.IoTActivityBindActivity it) {
		return model__IoTActivityBindActivity(it);
	}
	default Iot__IotActivityT $(final iot.IotActivity it) {
		if (it.getClass() == model.impl.IoTActivityBindActivityImpl.class)
			return model__IoTActivityBindActivity((model.IoTActivityBindActivity) it);
		return null;
	}
	default Iot__IotOperationDefT $(final iot.IotOperationDef it) {
		if (it.getClass() == model.impl.IotOperationDefBindOperationDefImpl.class)
			return model__IotOperationDefBindOperationDef((model.IotOperationDefBindOperationDef) it);
		return null;
	}
	default Model__IotOperationDefBindOperationDefT $(final model.IotOperationDefBindOperationDef it) {
		return model__IotOperationDefBindOperationDef(it);
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
	default Idlmm__NamedElementT $(final idlmm.NamedElement it) {
		if (it.getClass() == idlmm.impl.ExceptionDefImpl.class)
			return idlmm__ExceptionDef((idlmm.ExceptionDef) it);
		if (it.getClass() == idlmm.impl.OperationDefImpl.class)
			return idlmm__OperationDef((idlmm.OperationDef) it);
		return null;
	}
	default Activitydiagram__OfferT $(final activitydiagram.Offer it) {
		return activitydiagram__Offer(it);
	}
	default Activitydiagram__OpaqueActionT $(final activitydiagram.OpaqueAction it) {
		return activitydiagram__OpaqueAction(it);
	}
	default Idlmm__OperationDefT $(final idlmm.OperationDef it) {
		return idlmm__OperationDef(it);
	}
	default Idlmm__ParameterDefT $(final idlmm.ParameterDef it) {
		return idlmm__ParameterDef(it);
	}
	default Idlmm__PrimitiveDefT $(final idlmm.PrimitiveDef it) {
		return idlmm__PrimitiveDef(it);
	}
	default SimpleALEnv__PrintT $(final simpleALEnv.Print it) {
		return simpleALEnv__Print(it);
	}
	default SimpleALEnv__RandRangeT $(final simpleALEnv.RandRange it) {
		return simpleALEnv__RandRange(it);
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
		if (it.getClass() == simpleexpressions.impl.SEBooleanValueImpl.class)
			return simpleexpressions__SEBooleanValue((simpleexpressions.SEBooleanValue) it);
		if (it.getClass() == simpleexpressions.impl.SEBooleanVariableImpl.class)
			return simpleexpressions__SEBooleanVariable((simpleexpressions.SEBooleanVariable) it);
		if (it.getClass() == simpleexpressions.impl.SEIntegerCalculationExpressionImpl.class)
			return simpleexpressions__SEIntegerCalculationExpression((simpleexpressions.SEIntegerCalculationExpression) it);
		if (it.getClass() == simpleexpressions.impl.SEIntegerComparisonExpressionImpl.class)
			return simpleexpressions__SEIntegerComparisonExpression((simpleexpressions.SEIntegerComparisonExpression) it);
		if (it.getClass() == simpleexpressions.impl.SEIntegerValueImpl.class)
			return simpleexpressions__SEIntegerValue((simpleexpressions.SEIntegerValue) it);
		if (it.getClass() == simpleexpressions.impl.SEIntegerVariableImpl.class)
			return simpleexpressions__SEIntegerVariable((simpleexpressions.SEIntegerVariable) it);
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
	default Iot__SensorT $(final iot.Sensor it) {
		return iot__Sensor(it);
	}
	default Iot__SketchT $(final iot.Sketch it) {
		return iot__Sketch(it);
	}
	default SimpleALEnv__StmtT $(final simpleALEnv.Stmt it) {
		if (it.getClass() == simpleALEnv.impl.AssignImpl.class)
			return simpleALEnv__Assign((simpleALEnv.Assign) it);
		if (it.getClass() == simpleALEnv.impl.IfStmtImpl.class)
			return simpleALEnv__IfStmt((simpleALEnv.IfStmt) it);
		if (it.getClass() == simpleALEnv.impl.PrintImpl.class)
			return simpleALEnv__Print((simpleALEnv.Print) it);
		return null;
	}
	default Iot__SystemT $(final iot.System it) {
		return iot__System(it);
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
		if (it.getClass() == model.impl.BooleanVariableBindSEBooleanVariableImpl.class)
			return model__BooleanVariableBindSEBooleanVariable((model.BooleanVariableBindSEBooleanVariable) it);
		if (it.getClass() == model.impl.IntegerVariableBindSEIntegerVariableImpl.class)
			return model__IntegerVariableBindSEIntegerVariable((model.IntegerVariableBindSEIntegerVariable) it);
		return null;
	}
}
