package activitydiagram_exec.revisitor.impl;

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
import activitydiagram.revisitor.ActivitydiagramRevisitor;
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
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ExpOperation;
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
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.NamedActivityOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.OfferOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.OpaqueActionOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.TokenOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.TraceOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ValueOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.VariableOperation;

@SuppressWarnings("all")
public interface Activitydiagram_execRevisitor extends ActivitydiagramRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, BooleanValueOperation, BooleanVariableOperation, ContextOperation, ControlFlowOperation, ControlNodeOperation, ControlTokenOperation, DecisionNodeOperation, ExecutableNodeOperation, ExpOperation, FinalNodeOperation, ForkNodeOperation, ForkedTokenOperation, InitialNodeOperation, InputOperation, InputValueOperation, IntegerValueOperation, IntegerVariableOperation, JoinNodeOperation, MergeNodeOperation, NamedActivityOperation, OfferOperation, OpaqueActionOperation, TokenOperation, TraceOperation, ValueOperation, VariableOperation> {
  @Override
  public default ActivityOperation activitydiagram__Activity(final Activity it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.ActivityOperationImpl(it, this);
  }
  
  @Override
  public default ActivityFinalNodeOperation activitydiagram__ActivityFinalNode(final ActivityFinalNode it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.ActivityFinalNodeOperationImpl(it, this);
  }
  
  @Override
  public default BooleanValueOperation activitydiagram__BooleanValue(final BooleanValue it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.BooleanValueOperationImpl(it, this);
  }
  
  @Override
  public default ContextOperation activitydiagram__Context(final Context it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.ContextOperationImpl(it, this);
  }
  
  @Override
  public default ControlFlowOperation activitydiagram__ControlFlow(final ControlFlow it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.ControlFlowOperationImpl(it, this);
  }
  
  @Override
  public default ControlTokenOperation activitydiagram__ControlToken(final ControlToken it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.ControlTokenOperationImpl(it, this);
  }
  
  @Override
  public default DecisionNodeOperation activitydiagram__DecisionNode(final DecisionNode it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.DecisionNodeOperationImpl(it, this);
  }
  
  @Override
  public default ForkNodeOperation activitydiagram__ForkNode(final ForkNode it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.ForkNodeOperationImpl(it, this);
  }
  
  @Override
  public default ForkedTokenOperation activitydiagram__ForkedToken(final ForkedToken it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.ForkedTokenOperationImpl(it, this);
  }
  
  @Override
  public default InitialNodeOperation activitydiagram__InitialNode(final InitialNode it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.InitialNodeOperationImpl(it, this);
  }
  
  @Override
  public default InputOperation activitydiagram__Input(final Input it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.InputOperationImpl(it, this);
  }
  
  @Override
  public default InputValueOperation activitydiagram__InputValue(final InputValue it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.InputValueOperationImpl(it, this);
  }
  
  @Override
  public default IntegerValueOperation activitydiagram__IntegerValue(final IntegerValue it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.IntegerValueOperationImpl(it, this);
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
  public default OfferOperation activitydiagram__Offer(final Offer it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.OfferOperationImpl(it, this);
  }
  
  @Override
  public default OpaqueActionOperation activitydiagram__OpaqueAction(final OpaqueAction it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.OpaqueActionOperationImpl(it, this);
  }
  
  @Override
  public default TokenOperation activitydiagram__Token(final Token it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.TokenOperationImpl(it, this);
  }
  
  @Override
  public default TraceOperation activitydiagram__Trace(final Trace it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.TraceOperationImpl(it, this);
  }
}
