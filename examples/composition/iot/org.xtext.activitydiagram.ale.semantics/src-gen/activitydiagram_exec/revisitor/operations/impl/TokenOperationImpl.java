package activitydiagram_exec.revisitor.operations.impl;

import activitydiagram.ActivityNode;
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
import activitydiagramruntime.Token;
import activitydiagramruntime.revisitor.ActivitydiagramruntimeRevisitor;

@SuppressWarnings("all")
public abstract class TokenOperationImpl implements TokenOperation {
  private Token obj;
  
  private ActivitydiagramruntimeRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, BooleanBinaryExpressionOperation, BooleanExpressionOperation, BooleanUnaryExpressionOperation, BooleanValueOperation, BooleanVariableOperation, ContextOperation, ControlFlowOperation, ControlNodeOperation, ControlTokenOperation, DecisionNodeOperation, ExecutableNodeOperation, ExpressionOperation, FinalNodeOperation, ForkNodeOperation, ForkedTokenOperation, InitialNodeOperation, InputOperation, InputValueOperation, IntegerCalculationExpressionOperation, IntegerComparisonExpressionOperation, IntegerExpressionOperation, IntegerValueOperation, IntegerVariableOperation, JoinNodeOperation, MergeNodeOperation, NamedElementOperation, OfferOperation, OpaqueActionOperation, TokenOperation, TraceOperation, ValueOperation, VariableOperation> alg;
  
  public TokenOperationImpl(final Token obj, final ActivitydiagramruntimeRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, BooleanBinaryExpressionOperation, BooleanExpressionOperation, BooleanUnaryExpressionOperation, BooleanValueOperation, BooleanVariableOperation, ContextOperation, ControlFlowOperation, ControlNodeOperation, ControlTokenOperation, DecisionNodeOperation, ExecutableNodeOperation, ExpressionOperation, FinalNodeOperation, ForkNodeOperation, ForkedTokenOperation, InitialNodeOperation, InputOperation, InputValueOperation, IntegerCalculationExpressionOperation, IntegerComparisonExpressionOperation, IntegerExpressionOperation, IntegerValueOperation, IntegerVariableOperation, JoinNodeOperation, MergeNodeOperation, NamedElementOperation, OfferOperation, OpaqueActionOperation, TokenOperation, TraceOperation, ValueOperation, VariableOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public Token transfer(final ActivityNode holder) {
    ActivityNode _holder = this.obj.getHolder();
    boolean _tripleNotEquals = (_holder != null);
    if (_tripleNotEquals) {
      this.alg.$(this.obj).withdraw();
    }
    this.obj.setHolder(holder);
    return this.obj;
  }
  
  @Override
  public void withdraw() {
    boolean _isWithdrawn = this.alg.$(this.obj).isWithdrawn();
    boolean _not = (!_isWithdrawn);
    if (_not) {
      this.alg.$(this.obj.getHolder()).removeToken(this.obj);
      this.obj.setHolder(null);
    }
  }
  
  @Override
  public boolean isWithdrawn() {
    ActivityNode _holder = this.obj.getHolder();
    return (_holder == null);
  }
}
