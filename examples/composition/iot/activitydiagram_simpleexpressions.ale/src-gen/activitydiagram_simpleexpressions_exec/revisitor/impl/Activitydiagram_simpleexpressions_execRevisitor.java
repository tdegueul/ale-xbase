package activitydiagram_simpleexpressions_exec.revisitor.impl;

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
import activitydiagram_simpleexpressions.BooleanVariableBindSEBooleanVariable;
import activitydiagram_simpleexpressions.ExpBindSEExpression;
import activitydiagram_simpleexpressions.IntegerVariableBindSEIntegerVariable;
import activitydiagram_simpleexpressions.revisitor.Activitydiagram_simpleexpressionsRevisitor;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.ActionOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.ActivityEdgeOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.ActivityFinalNodeOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.ActivityNodeOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.ActivityOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.BooleanValueOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.BooleanVariableBindSEBooleanVariableOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.BooleanVariableOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.ContextOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.ControlFlowOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.ControlNodeOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.ControlTokenOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.DecisionNodeOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.ExecutableNodeOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.ExpBindSEExpressionOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.ExpOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.FinalNodeOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.ForkNodeOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.ForkedTokenOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.InitialNodeOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.InputOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.InputValueOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.IntegerValueOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.IntegerVariableBindSEIntegerVariableOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.IntegerVariableOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.JoinNodeOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.MergeNodeOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.NamedActivityOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.OfferOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.OpaqueActionOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.SEBooleanBinaryExpressionOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.SEBooleanExpressionOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.SEBooleanUnaryExpressionOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.SEBooleanValueOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.SEBooleanVariableOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.SEExpressionOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.SEIntegerCalculationExpressionOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.SEIntegerComparisonExpressionOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.SEIntegerExpressionOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.SEIntegerValueOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.SEIntegerVariableOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.SEValueOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.SEVariableOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.TokenOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.TraceOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.ValueOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.VariableOperation;
import simpleexpressions.SEBooleanBinaryExpression;
import simpleexpressions.SEBooleanUnaryExpression;
import simpleexpressions.SEBooleanValue;
import simpleexpressions.SEBooleanVariable;
import simpleexpressions.SEIntegerCalculationExpression;
import simpleexpressions.SEIntegerComparisonExpression;
import simpleexpressions.SEIntegerValue;
import simpleexpressions.SEIntegerVariable;

@SuppressWarnings("all")
public interface Activitydiagram_simpleexpressions_execRevisitor extends Activitydiagram_simpleexpressionsRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, BooleanValueOperation, BooleanVariableOperation, BooleanVariableBindSEBooleanVariableOperation, ContextOperation, ControlFlowOperation, ControlNodeOperation, ControlTokenOperation, DecisionNodeOperation, ExecutableNodeOperation, ExpOperation, ExpBindSEExpressionOperation, FinalNodeOperation, ForkNodeOperation, ForkedTokenOperation, InitialNodeOperation, InputOperation, InputValueOperation, IntegerValueOperation, IntegerVariableOperation, IntegerVariableBindSEIntegerVariableOperation, JoinNodeOperation, MergeNodeOperation, NamedActivityOperation, OfferOperation, OpaqueActionOperation, SEBooleanBinaryExpressionOperation, SEBooleanExpressionOperation, SEBooleanUnaryExpressionOperation, SEBooleanValueOperation, SEBooleanVariableOperation, SEExpressionOperation, SEIntegerCalculationExpressionOperation, SEIntegerComparisonExpressionOperation, SEIntegerExpressionOperation, SEIntegerValueOperation, SEIntegerVariableOperation, SEValueOperation, SEVariableOperation, TokenOperation, TraceOperation, ValueOperation, VariableOperation> {
  @Override
  public default ActivityOperation activitydiagram__Activity(final Activity it) {
    return new activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.impl.ActivityOperationImpl(it, this);
  }
  
  @Override
  public default ActivityFinalNodeOperation activitydiagram__ActivityFinalNode(final ActivityFinalNode it) {
    return new activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.impl.ActivityFinalNodeOperationImpl(it, this);
  }
  
  @Override
  public default BooleanValueOperation activitydiagram__BooleanValue(final BooleanValue it) {
    return new activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.impl.BooleanValueOperationImpl(it, this);
  }
  
  @Override
  public default BooleanVariableBindSEBooleanVariableOperation activitydiagram_simpleexpressions__BooleanVariableBindSEBooleanVariable(final BooleanVariableBindSEBooleanVariable it) {
    return new activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.impl.BooleanVariableBindSEBooleanVariableOperationImpl(it, this);
  }
  
  @Override
  public default ContextOperation activitydiagram__Context(final Context it) {
    return new activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.impl.ContextOperationImpl(it, this);
  }
  
  @Override
  public default ControlFlowOperation activitydiagram__ControlFlow(final ControlFlow it) {
    return new activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.impl.ControlFlowOperationImpl(it, this);
  }
  
  @Override
  public default ControlTokenOperation activitydiagram__ControlToken(final ControlToken it) {
    return new activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.impl.ControlTokenOperationImpl(it, this);
  }
  
  @Override
  public default DecisionNodeOperation activitydiagram__DecisionNode(final DecisionNode it) {
    return new activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.impl.DecisionNodeOperationImpl(it, this);
  }
  
  @Override
  public default ExpBindSEExpressionOperation activitydiagram_simpleexpressions__ExpBindSEExpression(final ExpBindSEExpression it) {
    return new activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.impl.ExpBindSEExpressionOperationImpl(it, this);
  }
  
  @Override
  public default ForkNodeOperation activitydiagram__ForkNode(final ForkNode it) {
    return new activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.impl.ForkNodeOperationImpl(it, this);
  }
  
  @Override
  public default ForkedTokenOperation activitydiagram__ForkedToken(final ForkedToken it) {
    return new activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.impl.ForkedTokenOperationImpl(it, this);
  }
  
  @Override
  public default InitialNodeOperation activitydiagram__InitialNode(final InitialNode it) {
    return new activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.impl.InitialNodeOperationImpl(it, this);
  }
  
  @Override
  public default InputOperation activitydiagram__Input(final Input it) {
    return new activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.impl.InputOperationImpl(it, this);
  }
  
  @Override
  public default InputValueOperation activitydiagram__InputValue(final InputValue it) {
    return new activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.impl.InputValueOperationImpl(it, this);
  }
  
  @Override
  public default IntegerValueOperation activitydiagram__IntegerValue(final IntegerValue it) {
    return new activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.impl.IntegerValueOperationImpl(it, this);
  }
  
  @Override
  public default IntegerVariableBindSEIntegerVariableOperation activitydiagram_simpleexpressions__IntegerVariableBindSEIntegerVariable(final IntegerVariableBindSEIntegerVariable it) {
    return new activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.impl.IntegerVariableBindSEIntegerVariableOperationImpl(it, this);
  }
  
  @Override
  public default JoinNodeOperation activitydiagram__JoinNode(final JoinNode it) {
    return new activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.impl.JoinNodeOperationImpl(it, this);
  }
  
  @Override
  public default MergeNodeOperation activitydiagram__MergeNode(final MergeNode it) {
    return new activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.impl.MergeNodeOperationImpl(it, this);
  }
  
  @Override
  public default OfferOperation activitydiagram__Offer(final Offer it) {
    return new activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.impl.OfferOperationImpl(it, this);
  }
  
  @Override
  public default OpaqueActionOperation activitydiagram__OpaqueAction(final OpaqueAction it) {
    return new activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.impl.OpaqueActionOperationImpl(it, this);
  }
  
  @Override
  public default SEBooleanBinaryExpressionOperation simpleexpressions__SEBooleanBinaryExpression(final SEBooleanBinaryExpression it) {
    return new activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.impl.SEBooleanBinaryExpressionOperationImpl(it, this);
  }
  
  @Override
  public default SEBooleanUnaryExpressionOperation simpleexpressions__SEBooleanUnaryExpression(final SEBooleanUnaryExpression it) {
    return new activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.impl.SEBooleanUnaryExpressionOperationImpl(it, this);
  }
  
  @Override
  public default SEBooleanValueOperation simpleexpressions__SEBooleanValue(final SEBooleanValue it) {
    return new activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.impl.SEBooleanValueOperationImpl(it, this);
  }
  
  @Override
  public default SEBooleanVariableOperation simpleexpressions__SEBooleanVariable(final SEBooleanVariable it) {
    return new activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.impl.SEBooleanVariableOperationImpl(it, this);
  }
  
  @Override
  public default SEIntegerCalculationExpressionOperation simpleexpressions__SEIntegerCalculationExpression(final SEIntegerCalculationExpression it) {
    return new activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.impl.SEIntegerCalculationExpressionOperationImpl(it, this);
  }
  
  @Override
  public default SEIntegerComparisonExpressionOperation simpleexpressions__SEIntegerComparisonExpression(final SEIntegerComparisonExpression it) {
    return new activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.impl.SEIntegerComparisonExpressionOperationImpl(it, this);
  }
  
  @Override
  public default SEIntegerValueOperation simpleexpressions__SEIntegerValue(final SEIntegerValue it) {
    return new activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.impl.SEIntegerValueOperationImpl(it, this);
  }
  
  @Override
  public default SEIntegerVariableOperation simpleexpressions__SEIntegerVariable(final SEIntegerVariable it) {
    return new activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.impl.SEIntegerVariableOperationImpl(it, this);
  }
  
  @Override
  public default TokenOperation activitydiagram__Token(final Token it) {
    return new activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.impl.TokenOperationImpl(it, this);
  }
  
  @Override
  public default TraceOperation activitydiagram__Trace(final Trace it) {
    return new activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.impl.TraceOperationImpl(it, this);
  }
}
