package iot.revisitor.impl;

import activitydiagram.Activity;
import activitydiagram.ActivityFinalNode;
import activitydiagram.ControlFlow;
import activitydiagram.DecisionNode;
import activitydiagram.ForkNode;
import activitydiagram.InitialNode;
import activitydiagram.Input;
import activitydiagram.InputValue;
import activitydiagram.JoinNode;
import activitydiagram.MergeNode;
import activitydiagram.OpaqueAction;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ActionOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ActivityEdgeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ActivityFinalNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ActivityNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ActivityOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.BooleanValueOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.BooleanVariableOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ContextOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ControlFlowOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ControlNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ControlTokenOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.DecisionNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ExecutableNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ExpressionOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.FinalNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ForkNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ForkedTokenOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.InitialNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.InputOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.InputValueOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.IntegerValueOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.IntegerVariableOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.JoinNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.MergeNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.NamedElementOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.OfferOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.OpaqueActionOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.TokenOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.TraceOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ValueOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.VariableOperation;
import activitydiagramruntime.Context;
import activitydiagramruntime.ControlToken;
import activitydiagramruntime.ForkedToken;
import activitydiagramruntime.Offer;
import activitydiagramruntime.Trace;
import iot.BooleanValueBindBooleanValue;
import iot.BooleanVariableBindBooleanVariable;
import iot.ExpressionBindExpression;
import iot.IntegerValueBindIntegerValue;
import iot.IntegerVariableBindIntegerVariable;
import iot.ValueBindValue;
import iot.revisitor.operations.iot.BooleanValueBindBooleanValueOperation;
import iot.revisitor.operations.iot.BooleanVariableBindBooleanVariableOperation;
import iot.revisitor.operations.iot.ExpressionBindExpressionOperation;
import iot.revisitor.operations.iot.IntegerValueBindIntegerValueOperation;
import iot.revisitor.operations.iot.IntegerVariableBindIntegerVariableOperation;
import iot.revisitor.operations.iot.ValueBindValueOperation;
import simpleexpressions.BooleanBinaryExpression;
import simpleexpressions.BooleanUnaryExpression;
import simpleexpressions.BooleanValue;
import simpleexpressions.BooleanVariable;
import simpleexpressions.IntegerCalculationExpression;
import simpleexpressions.IntegerComparisonExpression;
import simpleexpressions.IntegerValue;
import simpleexpressions.IntegerVariable;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.BooleanBinaryExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.BooleanExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.BooleanUnaryExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.IntegerCalculationExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.IntegerComparisonExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.IntegerExpressionOperation;

@SuppressWarnings("all")
public interface IotRevisitor extends iot.revisitor.IotRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, BooleanBinaryExpressionOperation, BooleanExpressionOperation, BooleanUnaryExpressionOperation, BooleanValueOperation, simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.BooleanValueOperation, BooleanValueBindBooleanValueOperation, BooleanVariableOperation, simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.BooleanVariableOperation, BooleanVariableBindBooleanVariableOperation, ContextOperation, ControlFlowOperation, ControlNodeOperation, ControlTokenOperation, DecisionNodeOperation, ExecutableNodeOperation, ExpressionOperation, simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.ExpressionOperation, ExpressionBindExpressionOperation, FinalNodeOperation, ForkNodeOperation, ForkedTokenOperation, InitialNodeOperation, InputOperation, InputValueOperation, IntegerCalculationExpressionOperation, IntegerComparisonExpressionOperation, IntegerExpressionOperation, IntegerValueOperation, simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.IntegerValueOperation, IntegerValueBindIntegerValueOperation, IntegerVariableOperation, simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.IntegerVariableOperation, IntegerVariableBindIntegerVariableOperation, JoinNodeOperation, MergeNodeOperation, NamedElementOperation, OfferOperation, OpaqueActionOperation, TokenOperation, TraceOperation, ValueOperation, simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.ValueOperation, ValueBindValueOperation, VariableOperation, simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.VariableOperation> {
  @Override
  public default ExpressionBindExpressionOperation iot__ExpressionBindExpression(final ExpressionBindExpression it) {
    return new iot.revisitor.operations.iot.impl.ExpressionBindExpressionOperationImpl(it, this);
  }
  
  @Override
  public default ValueBindValueOperation iot__ValueBindValue(final ValueBindValue it) {
    return new iot.revisitor.operations.iot.impl.ValueBindValueOperationImpl(it, this);
  }
  
  @Override
  public default BooleanValueBindBooleanValueOperation iot__BooleanValueBindBooleanValue(final BooleanValueBindBooleanValue it) {
    return new iot.revisitor.operations.iot.impl.BooleanValueBindBooleanValueOperationImpl(it, this);
  }
  
  @Override
  public default BooleanVariableBindBooleanVariableOperation iot__BooleanVariableBindBooleanVariable(final BooleanVariableBindBooleanVariable it) {
    return new iot.revisitor.operations.iot.impl.BooleanVariableBindBooleanVariableOperationImpl(it, this);
  }
  
  @Override
  public default IntegerVariableBindIntegerVariableOperation iot__IntegerVariableBindIntegerVariable(final IntegerVariableBindIntegerVariable it) {
    return new iot.revisitor.operations.iot.impl.IntegerVariableBindIntegerVariableOperationImpl(it, this);
  }
  
  @Override
  public default IntegerValueBindIntegerValueOperation iot__IntegerValueBindIntegerValue(final IntegerValueBindIntegerValue it) {
    return new iot.revisitor.operations.iot.impl.IntegerValueBindIntegerValueOperationImpl(it, this);
  }
  
  @Override
  public default IntegerCalculationExpressionOperation simpleexpressions__IntegerCalculationExpression(final IntegerCalculationExpression it) {
    return new simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.impl.IntegerCalculationExpressionOperationImpl(it, this);
  }
  
  @Override
  public default IntegerComparisonExpressionOperation simpleexpressions__IntegerComparisonExpression(final IntegerComparisonExpression it) {
    return new simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.impl.IntegerComparisonExpressionOperationImpl(it, this);
  }
  
  @Override
  public default simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.BooleanValueOperation simpleexpressions__BooleanValue(final BooleanValue it) {
    return new simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.impl.BooleanValueOperationImpl(it, this);
  }
  
  @Override
  public default simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.IntegerValueOperation simpleexpressions__IntegerValue(final IntegerValue it) {
    return new simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.impl.IntegerValueOperationImpl(it, this);
  }
  
  @Override
  public default BooleanBinaryExpressionOperation simpleexpressions__BooleanBinaryExpression(final BooleanBinaryExpression it) {
    return new simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.impl.BooleanBinaryExpressionOperationImpl(it, this);
  }
  
  @Override
  public default simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.BooleanVariableOperation simpleexpressions__BooleanVariable(final BooleanVariable it) {
    return new simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.impl.BooleanVariableOperationImpl(it, this);
  }
  
  @Override
  public default simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.IntegerVariableOperation simpleexpressions__IntegerVariable(final IntegerVariable it) {
    return new simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.impl.IntegerVariableOperationImpl(it, this);
  }
  
  @Override
  public default BooleanUnaryExpressionOperation simpleexpressions__BooleanUnaryExpression(final BooleanUnaryExpression it) {
    return new simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.impl.BooleanUnaryExpressionOperationImpl(it, this);
  }
  
  @Override
  public default ActivityOperation activitydiagram__Activity(final Activity it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.ActivityOperationImpl(it, this);
  }
  
  @Override
  public default ControlFlowOperation activitydiagram__ControlFlow(final ControlFlow it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.ControlFlowOperationImpl(it, this);
  }
  
  @Override
  public default OpaqueActionOperation activitydiagram__OpaqueAction(final OpaqueAction it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.OpaqueActionOperationImpl(it, this);
  }
  
  @Override
  public default InitialNodeOperation activitydiagram__InitialNode(final InitialNode it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.InitialNodeOperationImpl(it, this);
  }
  
  @Override
  public default ActivityFinalNodeOperation activitydiagram__ActivityFinalNode(final ActivityFinalNode it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.ActivityFinalNodeOperationImpl(it, this);
  }
  
  @Override
  public default ForkNodeOperation activitydiagram__ForkNode(final ForkNode it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.ForkNodeOperationImpl(it, this);
  }
  
  @Override
  public default JoinNodeOperation activitydiagram__JoinNode(final JoinNode it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.JoinNodeOperationImpl(it, this);
  }
  
  @Override
  public default MergeNodeOperation activitydiagram__MergeNode(final MergeNode it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.MergeNodeOperationImpl(it, this);
  }
  
  @Override
  public default DecisionNodeOperation activitydiagram__DecisionNode(final DecisionNode it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.DecisionNodeOperationImpl(it, this);
  }
  
  @Override
  public default InputValueOperation activitydiagram__InputValue(final InputValue it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.InputValueOperationImpl(it, this);
  }
  
  @Override
  public default InputOperation activitydiagram__Input(final Input it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.InputOperationImpl(it, this);
  }
  
  @Override
  public default OfferOperation activitydiagramruntime__Offer(final Offer it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.OfferOperationImpl(it, this);
  }
  
  @Override
  public default ContextOperation activitydiagramruntime__Context(final Context it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.ContextOperationImpl(it, this);
  }
  
  @Override
  public default TraceOperation activitydiagramruntime__Trace(final Trace it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.TraceOperationImpl(it, this);
  }
  
  @Override
  public default ControlTokenOperation activitydiagramruntime__ControlToken(final ControlToken it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.ControlTokenOperationImpl(it, this);
  }
  
  @Override
  public default ForkedTokenOperation activitydiagramruntime__ForkedToken(final ForkedToken it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.ForkedTokenOperationImpl(it, this);
  }
}
