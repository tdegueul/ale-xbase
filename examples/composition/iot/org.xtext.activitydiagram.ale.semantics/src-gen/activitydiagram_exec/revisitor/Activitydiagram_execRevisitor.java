package activitydiagram_exec.revisitor;

import activitydiagram.Activity;
import activitydiagram.ActivityFinalNode;
import activitydiagram.BooleanBinaryExpression;
import activitydiagram.BooleanUnaryExpression;
import activitydiagram.BooleanValue;
import activitydiagram.BooleanVariable;
import activitydiagram.ControlFlow;
import activitydiagram.DecisionNode;
import activitydiagram.ForkNode;
import activitydiagram.InitialNode;
import activitydiagram.Input;
import activitydiagram.InputValue;
import activitydiagram.IntegerCalculationExpression;
import activitydiagram.IntegerComparisonExpression;
import activitydiagram.IntegerValue;
import activitydiagram.IntegerVariable;
import activitydiagram.JoinNode;
import activitydiagram.MergeNode;
import activitydiagram.OpaqueAction;
import activitydiagram_exec.revisitor.operations.ActionOperation;
import activitydiagram_exec.revisitor.operations.ActivityEdgeOperation;
import activitydiagram_exec.revisitor.operations.ActivityFinalNodeOperation;
import activitydiagram_exec.revisitor.operations.ActivityNodeOperation;
import activitydiagram_exec.revisitor.operations.ActivityOperation;
import activitydiagram_exec.revisitor.operations.BooleanBinaryExpressionOperation;
import activitydiagram_exec.revisitor.operations.BooleanExpressionOperation;
import activitydiagram_exec.revisitor.operations.BooleanUnaryExpressionOperation;
import activitydiagram_exec.revisitor.operations.BooleanValueOperation;
import activitydiagram_exec.revisitor.operations.BooleanVariableOperation;
import activitydiagram_exec.revisitor.operations.ContextOperation;
import activitydiagram_exec.revisitor.operations.ControlFlowOperation;
import activitydiagram_exec.revisitor.operations.ControlNodeOperation;
import activitydiagram_exec.revisitor.operations.ControlTokenOperation;
import activitydiagram_exec.revisitor.operations.DecisionNodeOperation;
import activitydiagram_exec.revisitor.operations.ExecutableNodeOperation;
import activitydiagram_exec.revisitor.operations.ExpressionOperation;
import activitydiagram_exec.revisitor.operations.FinalNodeOperation;
import activitydiagram_exec.revisitor.operations.ForkNodeOperation;
import activitydiagram_exec.revisitor.operations.ForkedTokenOperation;
import activitydiagram_exec.revisitor.operations.InitialNodeOperation;
import activitydiagram_exec.revisitor.operations.InputOperation;
import activitydiagram_exec.revisitor.operations.InputValueOperation;
import activitydiagram_exec.revisitor.operations.IntegerCalculationExpressionOperation;
import activitydiagram_exec.revisitor.operations.IntegerComparisonExpressionOperation;
import activitydiagram_exec.revisitor.operations.IntegerExpressionOperation;
import activitydiagram_exec.revisitor.operations.IntegerValueOperation;
import activitydiagram_exec.revisitor.operations.IntegerVariableOperation;
import activitydiagram_exec.revisitor.operations.JoinNodeOperation;
import activitydiagram_exec.revisitor.operations.MergeNodeOperation;
import activitydiagram_exec.revisitor.operations.NamedElementOperation;
import activitydiagram_exec.revisitor.operations.OfferOperation;
import activitydiagram_exec.revisitor.operations.OpaqueActionOperation;
import activitydiagram_exec.revisitor.operations.TokenOperation;
import activitydiagram_exec.revisitor.operations.TraceOperation;
import activitydiagram_exec.revisitor.operations.ValueOperation;
import activitydiagram_exec.revisitor.operations.VariableOperation;
import activitydiagramruntime.Context;
import activitydiagramruntime.ControlToken;
import activitydiagramruntime.ForkedToken;
import activitydiagramruntime.Offer;
import activitydiagramruntime.Trace;
import activitydiagramruntime.revisitor.ActivitydiagramruntimeRevisitor;

@SuppressWarnings("all")
public interface Activitydiagram_execRevisitor extends ActivitydiagramruntimeRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, BooleanBinaryExpressionOperation, BooleanExpressionOperation, BooleanUnaryExpressionOperation, BooleanValueOperation, BooleanVariableOperation, ContextOperation, ControlFlowOperation, ControlNodeOperation, ControlTokenOperation, DecisionNodeOperation, ExecutableNodeOperation, ExpressionOperation, FinalNodeOperation, ForkNodeOperation, ForkedTokenOperation, InitialNodeOperation, InputOperation, InputValueOperation, IntegerCalculationExpressionOperation, IntegerComparisonExpressionOperation, IntegerExpressionOperation, IntegerValueOperation, IntegerVariableOperation, JoinNodeOperation, MergeNodeOperation, NamedElementOperation, OfferOperation, OpaqueActionOperation, TokenOperation, TraceOperation, ValueOperation, VariableOperation> {
  @Override
  public default ActivityOperation activity(final Activity it) {
    return new activitydiagram_exec.revisitor.operations.impl.ActivityOperationImpl(it, this);
  }
  
  @Override
  public default ActivityFinalNodeOperation activityFinalNode(final ActivityFinalNode it) {
    return new activitydiagram_exec.revisitor.operations.impl.ActivityFinalNodeOperationImpl(it, this);
  }
  
  @Override
  public default BooleanBinaryExpressionOperation booleanBinaryExpression(final BooleanBinaryExpression it) {
    return new activitydiagram_exec.revisitor.operations.impl.BooleanBinaryExpressionOperationImpl(it, this);
  }
  
  @Override
  public default BooleanUnaryExpressionOperation booleanUnaryExpression(final BooleanUnaryExpression it) {
    return new activitydiagram_exec.revisitor.operations.impl.BooleanUnaryExpressionOperationImpl(it, this);
  }
  
  @Override
  public default BooleanValueOperation booleanValue(final BooleanValue it) {
    return new activitydiagram_exec.revisitor.operations.impl.BooleanValueOperationImpl(it, this);
  }
  
  @Override
  public default BooleanVariableOperation booleanVariable(final BooleanVariable it) {
    return new activitydiagram_exec.revisitor.operations.impl.BooleanVariableOperationImpl(it, this);
  }
  
  @Override
  public default ContextOperation context(final Context it) {
    return new activitydiagram_exec.revisitor.operations.impl.ContextOperationImpl(it, this);
  }
  
  @Override
  public default ControlFlowOperation controlFlow(final ControlFlow it) {
    return new activitydiagram_exec.revisitor.operations.impl.ControlFlowOperationImpl(it, this);
  }
  
  @Override
  public default ControlTokenOperation controlToken(final ControlToken it) {
    return new activitydiagram_exec.revisitor.operations.impl.ControlTokenOperationImpl(it, this);
  }
  
  @Override
  public default DecisionNodeOperation decisionNode(final DecisionNode it) {
    return new activitydiagram_exec.revisitor.operations.impl.DecisionNodeOperationImpl(it, this);
  }
  
  @Override
  public default ForkNodeOperation forkNode(final ForkNode it) {
    return new activitydiagram_exec.revisitor.operations.impl.ForkNodeOperationImpl(it, this);
  }
  
  @Override
  public default ForkedTokenOperation forkedToken(final ForkedToken it) {
    return new activitydiagram_exec.revisitor.operations.impl.ForkedTokenOperationImpl(it, this);
  }
  
  @Override
  public default InitialNodeOperation initialNode(final InitialNode it) {
    return new activitydiagram_exec.revisitor.operations.impl.InitialNodeOperationImpl(it, this);
  }
  
  @Override
  public default InputOperation input(final Input it) {
    return new activitydiagram_exec.revisitor.operations.impl.InputOperationImpl(it, this);
  }
  
  @Override
  public default InputValueOperation inputValue(final InputValue it) {
    return new activitydiagram_exec.revisitor.operations.impl.InputValueOperationImpl(it, this);
  }
  
  @Override
  public default IntegerCalculationExpressionOperation integerCalculationExpression(final IntegerCalculationExpression it) {
    return new activitydiagram_exec.revisitor.operations.impl.IntegerCalculationExpressionOperationImpl(it, this);
  }
  
  @Override
  public default IntegerComparisonExpressionOperation integerComparisonExpression(final IntegerComparisonExpression it) {
    return new activitydiagram_exec.revisitor.operations.impl.IntegerComparisonExpressionOperationImpl(it, this);
  }
  
  @Override
  public default IntegerValueOperation integerValue(final IntegerValue it) {
    return new activitydiagram_exec.revisitor.operations.impl.IntegerValueOperationImpl(it, this);
  }
  
  @Override
  public default IntegerVariableOperation integerVariable(final IntegerVariable it) {
    return new activitydiagram_exec.revisitor.operations.impl.IntegerVariableOperationImpl(it, this);
  }
  
  @Override
  public default JoinNodeOperation joinNode(final JoinNode it) {
    return new activitydiagram_exec.revisitor.operations.impl.JoinNodeOperationImpl(it, this);
  }
  
  @Override
  public default MergeNodeOperation mergeNode(final MergeNode it) {
    return new activitydiagram_exec.revisitor.operations.impl.MergeNodeOperationImpl(it, this);
  }
  
  @Override
  public default OfferOperation offer(final Offer it) {
    return new activitydiagram_exec.revisitor.operations.impl.OfferOperationImpl(it, this);
  }
  
  @Override
  public default OpaqueActionOperation opaqueAction(final OpaqueAction it) {
    return new activitydiagram_exec.revisitor.operations.impl.OpaqueActionOperationImpl(it, this);
  }
  
  @Override
  public default TraceOperation trace(final Trace it) {
    return new activitydiagram_exec.revisitor.operations.impl.TraceOperationImpl(it, this);
  }
}
