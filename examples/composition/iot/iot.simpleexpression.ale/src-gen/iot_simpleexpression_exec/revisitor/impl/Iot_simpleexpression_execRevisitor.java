package iot_simpleexpression_exec.revisitor.impl;

import activitydiagram.Activity;
import activitydiagram.ActivityFinalNode;
import activitydiagram.BooleanValue;
import activitydiagram.Context;
import activitydiagram.ControlFlow;
import activitydiagram.ControlToken;
import activitydiagram.DecisionNode;
import activitydiagram.ForkNode;
import activitydiagram.ForkedToken;
import activitydiagram.InitialNode;
import activitydiagram.Input;
import activitydiagram.InputValue;
import activitydiagram.IntegerValue;
import activitydiagram.JoinNode;
import activitydiagram.MergeNode;
import activitydiagram.Offer;
import activitydiagram.OpaqueAction;
import activitydiagram.Token;
import activitydiagram.Trace;
import idlmm.ExceptionDef;
import idlmm.FieldI;
import idlmm.OperationDef;
import idlmm.ParameterDef;
import idlmm.PrimitiveDef;
import iot.Actuator;
import iot.Board;
import iot.Sensor;
import iot.Sketch;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ALVarRefOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ActionOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ActivityEdgeOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ActivityFinalNodeOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ActivityNodeOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ActivityOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ActuatorOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ArithLitOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ArithMinusOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ArithOpOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ArithOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ArithPlusOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.AssignOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.BlockOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.BoardOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.BooleanValueOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.BooleanVariableBindSEBooleanVariableOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.BooleanVariableOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ContainedOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ContainerOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ContextOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ControlFlowOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ControlNodeOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ControlTokenOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.DecisionNodeOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.EqualityTestOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ExceptionDefOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ExecutableNodeOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ExpOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ExpressionBindOperationDefOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ExpressionBindSEExpressionOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.FieldIOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.FinalNodeOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ForkNodeOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ForkedTokenOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.HWCompOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.IDLTypeOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.IdlStmtBindBlockOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.IdlStmtOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.IfStmtOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.InitialNodeOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.InputOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.InputValueOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.IntegerValueOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.IntegerVariableBindSEIntegerVariableOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.IntegerVariableOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.IoTActivityBindActivityOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.IotActivityOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.IotOperationDefBindOperationDefOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.IotOperationDefOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.JoinNodeOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.MergeNodeOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.NamedActivityOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.NamedElementOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.OfferOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.OpaqueActionOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.OperationDefOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ParameterDefOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.PrimitiveDefOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.PrintOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.RandRangeOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.SEBooleanBinaryExpressionOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.SEBooleanExpressionOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.SEBooleanUnaryExpressionOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.SEBooleanValueOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.SEBooleanVariableOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.SEExpressionOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.SEIntegerCalculationExpressionOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.SEIntegerComparisonExpressionOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.SEIntegerExpressionOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.SEIntegerValueOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.SEIntegerVariableOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.SEValueOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.SEVariableOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.SensorOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.SketchOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.StmtOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.SystemOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.TokenOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.TraceOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ValueOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.VariableOperation;
import model.BooleanVariableBindSEBooleanVariable;
import model.ExpressionBindOperationDef;
import model.ExpressionBindSEExpression;
import model.IdlStmtBindBlock;
import model.IntegerVariableBindSEIntegerVariable;
import model.IoTActivityBindActivity;
import model.IotOperationDefBindOperationDef;
import model.revisitor.ModelRevisitor;
import simpleALEnv.ALVarRef;
import simpleALEnv.ArithLit;
import simpleALEnv.ArithMinus;
import simpleALEnv.ArithPlus;
import simpleALEnv.Assign;
import simpleALEnv.Block;
import simpleALEnv.EqualityTest;
import simpleALEnv.IfStmt;
import simpleALEnv.Print;
import simpleALEnv.RandRange;
import simpleexpressions.SEBooleanBinaryExpression;
import simpleexpressions.SEBooleanUnaryExpression;
import simpleexpressions.SEBooleanValue;
import simpleexpressions.SEBooleanVariable;
import simpleexpressions.SEIntegerCalculationExpression;
import simpleexpressions.SEIntegerComparisonExpression;
import simpleexpressions.SEIntegerValue;
import simpleexpressions.SEIntegerVariable;

@SuppressWarnings("all")
public interface Iot_simpleexpression_execRevisitor extends ModelRevisitor<ALVarRefOperation, ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, ActuatorOperation, ArithOperation, ArithLitOperation, ArithMinusOperation, ArithOpOperation, ArithPlusOperation, AssignOperation, BlockOperation, BoardOperation, BooleanValueOperation, BooleanVariableOperation, BooleanVariableBindSEBooleanVariableOperation, ContainedOperation, ContainerOperation, ContextOperation, ControlFlowOperation, ControlNodeOperation, ControlTokenOperation, DecisionNodeOperation, EqualityTestOperation, ExceptionDefOperation, ExecutableNodeOperation, ExpOperation, ExpressionBindOperationDefOperation, ExpressionBindSEExpressionOperation, FieldIOperation, FinalNodeOperation, ForkNodeOperation, ForkedTokenOperation, HWCompOperation, IDLTypeOperation, IdlStmtOperation, IdlStmtBindBlockOperation, IfStmtOperation, InitialNodeOperation, InputOperation, InputValueOperation, IntegerValueOperation, IntegerVariableOperation, IntegerVariableBindSEIntegerVariableOperation, IoTActivityBindActivityOperation, IotActivityOperation, IotOperationDefOperation, IotOperationDefBindOperationDefOperation, JoinNodeOperation, MergeNodeOperation, NamedActivityOperation, NamedElementOperation, OfferOperation, OpaqueActionOperation, OperationDefOperation, ParameterDefOperation, PrimitiveDefOperation, PrintOperation, RandRangeOperation, SEBooleanBinaryExpressionOperation, SEBooleanExpressionOperation, SEBooleanUnaryExpressionOperation, SEBooleanValueOperation, SEBooleanVariableOperation, SEExpressionOperation, SEIntegerCalculationExpressionOperation, SEIntegerComparisonExpressionOperation, SEIntegerExpressionOperation, SEIntegerValueOperation, SEIntegerVariableOperation, SEValueOperation, SEVariableOperation, SensorOperation, SketchOperation, StmtOperation, SystemOperation, TokenOperation, TraceOperation, ValueOperation, VariableOperation> {
  @Override
  public default ALVarRefOperation simpleALEnv__ALVarRef(final ALVarRef it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.ALVarRefOperationImpl(it, this);
  }
  
  @Override
  public default ActivityOperation activitydiagram__Activity(final Activity it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.ActivityOperationImpl(it, this);
  }
  
  @Override
  public default ActivityFinalNodeOperation activitydiagram__ActivityFinalNode(final ActivityFinalNode it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.ActivityFinalNodeOperationImpl(it, this);
  }
  
  @Override
  public default ActuatorOperation iot__Actuator(final Actuator it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.ActuatorOperationImpl(it, this);
  }
  
  @Override
  public default ArithLitOperation simpleALEnv__ArithLit(final ArithLit it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.ArithLitOperationImpl(it, this);
  }
  
  @Override
  public default ArithMinusOperation simpleALEnv__ArithMinus(final ArithMinus it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.ArithMinusOperationImpl(it, this);
  }
  
  @Override
  public default ArithPlusOperation simpleALEnv__ArithPlus(final ArithPlus it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.ArithPlusOperationImpl(it, this);
  }
  
  @Override
  public default AssignOperation simpleALEnv__Assign(final Assign it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.AssignOperationImpl(it, this);
  }
  
  @Override
  public default BlockOperation simpleALEnv__Block(final Block it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.BlockOperationImpl(it, this);
  }
  
  @Override
  public default BoardOperation iot__Board(final Board it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.BoardOperationImpl(it, this);
  }
  
  @Override
  public default BooleanValueOperation activitydiagram__BooleanValue(final BooleanValue it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.BooleanValueOperationImpl(it, this);
  }
  
  @Override
  public default BooleanVariableBindSEBooleanVariableOperation model__BooleanVariableBindSEBooleanVariable(final BooleanVariableBindSEBooleanVariable it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.BooleanVariableBindSEBooleanVariableOperationImpl(it, this);
  }
  
  @Override
  public default ContextOperation activitydiagram__Context(final Context it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.ContextOperationImpl(it, this);
  }
  
  @Override
  public default ControlFlowOperation activitydiagram__ControlFlow(final ControlFlow it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.ControlFlowOperationImpl(it, this);
  }
  
  @Override
  public default ControlTokenOperation activitydiagram__ControlToken(final ControlToken it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.ControlTokenOperationImpl(it, this);
  }
  
  @Override
  public default DecisionNodeOperation activitydiagram__DecisionNode(final DecisionNode it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.DecisionNodeOperationImpl(it, this);
  }
  
  @Override
  public default EqualityTestOperation simpleALEnv__EqualityTest(final EqualityTest it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.EqualityTestOperationImpl(it, this);
  }
  
  @Override
  public default ExceptionDefOperation idlmm__ExceptionDef(final ExceptionDef it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.ExceptionDefOperationImpl(it, this);
  }
  
  @Override
  public default ExpressionBindOperationDefOperation model__ExpressionBindOperationDef(final ExpressionBindOperationDef it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.ExpressionBindOperationDefOperationImpl(it, this);
  }
  
  @Override
  public default ExpressionBindSEExpressionOperation model__ExpressionBindSEExpression(final ExpressionBindSEExpression it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.ExpressionBindSEExpressionOperationImpl(it, this);
  }
  
  @Override
  public default FieldIOperation idlmm__FieldI(final FieldI it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.FieldIOperationImpl(it, this);
  }
  
  @Override
  public default ForkNodeOperation activitydiagram__ForkNode(final ForkNode it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.ForkNodeOperationImpl(it, this);
  }
  
  @Override
  public default ForkedTokenOperation activitydiagram__ForkedToken(final ForkedToken it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.ForkedTokenOperationImpl(it, this);
  }
  
  @Override
  public default IdlStmtBindBlockOperation model__IdlStmtBindBlock(final IdlStmtBindBlock it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.IdlStmtBindBlockOperationImpl(it, this);
  }
  
  @Override
  public default IfStmtOperation simpleALEnv__IfStmt(final IfStmt it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.IfStmtOperationImpl(it, this);
  }
  
  @Override
  public default InitialNodeOperation activitydiagram__InitialNode(final InitialNode it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.InitialNodeOperationImpl(it, this);
  }
  
  @Override
  public default InputOperation activitydiagram__Input(final Input it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.InputOperationImpl(it, this);
  }
  
  @Override
  public default InputValueOperation activitydiagram__InputValue(final InputValue it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.InputValueOperationImpl(it, this);
  }
  
  @Override
  public default IntegerValueOperation activitydiagram__IntegerValue(final IntegerValue it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.IntegerValueOperationImpl(it, this);
  }
  
  @Override
  public default IntegerVariableBindSEIntegerVariableOperation model__IntegerVariableBindSEIntegerVariable(final IntegerVariableBindSEIntegerVariable it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.IntegerVariableBindSEIntegerVariableOperationImpl(it, this);
  }
  
  @Override
  public default IoTActivityBindActivityOperation model__IoTActivityBindActivity(final IoTActivityBindActivity it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.IoTActivityBindActivityOperationImpl(it, this);
  }
  
  @Override
  public default IotOperationDefBindOperationDefOperation model__IotOperationDefBindOperationDef(final IotOperationDefBindOperationDef it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.IotOperationDefBindOperationDefOperationImpl(it, this);
  }
  
  @Override
  public default JoinNodeOperation activitydiagram__JoinNode(final JoinNode it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.JoinNodeOperationImpl(it, this);
  }
  
  @Override
  public default MergeNodeOperation activitydiagram__MergeNode(final MergeNode it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.MergeNodeOperationImpl(it, this);
  }
  
  @Override
  public default OfferOperation activitydiagram__Offer(final Offer it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.OfferOperationImpl(it, this);
  }
  
  @Override
  public default OpaqueActionOperation activitydiagram__OpaqueAction(final OpaqueAction it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.OpaqueActionOperationImpl(it, this);
  }
  
  @Override
  public default OperationDefOperation idlmm__OperationDef(final OperationDef it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.OperationDefOperationImpl(it, this);
  }
  
  @Override
  public default ParameterDefOperation idlmm__ParameterDef(final ParameterDef it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.ParameterDefOperationImpl(it, this);
  }
  
  @Override
  public default PrimitiveDefOperation idlmm__PrimitiveDef(final PrimitiveDef it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.PrimitiveDefOperationImpl(it, this);
  }
  
  @Override
  public default PrintOperation simpleALEnv__Print(final Print it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.PrintOperationImpl(it, this);
  }
  
  @Override
  public default RandRangeOperation simpleALEnv__RandRange(final RandRange it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.RandRangeOperationImpl(it, this);
  }
  
  @Override
  public default SEBooleanBinaryExpressionOperation simpleexpressions__SEBooleanBinaryExpression(final SEBooleanBinaryExpression it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.SEBooleanBinaryExpressionOperationImpl(it, this);
  }
  
  @Override
  public default SEBooleanUnaryExpressionOperation simpleexpressions__SEBooleanUnaryExpression(final SEBooleanUnaryExpression it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.SEBooleanUnaryExpressionOperationImpl(it, this);
  }
  
  @Override
  public default SEBooleanValueOperation simpleexpressions__SEBooleanValue(final SEBooleanValue it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.SEBooleanValueOperationImpl(it, this);
  }
  
  @Override
  public default SEBooleanVariableOperation simpleexpressions__SEBooleanVariable(final SEBooleanVariable it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.SEBooleanVariableOperationImpl(it, this);
  }
  
  @Override
  public default SEIntegerCalculationExpressionOperation simpleexpressions__SEIntegerCalculationExpression(final SEIntegerCalculationExpression it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.SEIntegerCalculationExpressionOperationImpl(it, this);
  }
  
  @Override
  public default SEIntegerComparisonExpressionOperation simpleexpressions__SEIntegerComparisonExpression(final SEIntegerComparisonExpression it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.SEIntegerComparisonExpressionOperationImpl(it, this);
  }
  
  @Override
  public default SEIntegerValueOperation simpleexpressions__SEIntegerValue(final SEIntegerValue it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.SEIntegerValueOperationImpl(it, this);
  }
  
  @Override
  public default SEIntegerVariableOperation simpleexpressions__SEIntegerVariable(final SEIntegerVariable it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.SEIntegerVariableOperationImpl(it, this);
  }
  
  @Override
  public default SensorOperation iot__Sensor(final Sensor it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.SensorOperationImpl(it, this);
  }
  
  @Override
  public default SketchOperation iot__Sketch(final Sketch it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.SketchOperationImpl(it, this);
  }
  
  @Override
  public default SystemOperation iot__System(final iot.System it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.SystemOperationImpl(it, this);
  }
  
  @Override
  public default TokenOperation activitydiagram__Token(final Token it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.TokenOperationImpl(it, this);
  }
  
  @Override
  public default TraceOperation activitydiagram__Trace(final Trace it) {
    return new iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl.TraceOperationImpl(it, this);
  }
}
