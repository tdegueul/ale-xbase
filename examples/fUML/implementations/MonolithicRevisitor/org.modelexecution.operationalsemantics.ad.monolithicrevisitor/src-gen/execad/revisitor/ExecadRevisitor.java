package execad.revisitor;

import activitydiagram.Activity;
import activitydiagram.ActivityFinalNode;
import activitydiagram.BooleanBinaryExpression;
import activitydiagram.BooleanUnaryExpression;
import activitydiagram.BooleanValue;
import activitydiagram.BooleanVariable;
import activitydiagram.ControlFlow;
import activitydiagram.ControlToken;
import activitydiagram.DecisionNode;
import activitydiagram.ForkNode;
import activitydiagram.ForkedToken;
import activitydiagram.InitialNode;
import activitydiagram.Input;
import activitydiagram.InputValue;
import activitydiagram.IntegerCalculationExpression;
import activitydiagram.IntegerComparisonExpression;
import activitydiagram.IntegerValue;
import activitydiagram.IntegerVariable;
import activitydiagram.JoinNode;
import activitydiagram.MergeNode;
import activitydiagram.Offer;
import activitydiagram.OpaqueAction;
import activitydiagram.Trace;
import activitydiagram.revisitor.ActivitydiagramRevisitor;
import execad.revisitor.operations.ActionOperation;
import execad.revisitor.operations.ActivityEdgeOperation;
import execad.revisitor.operations.ActivityFinalNodeOperation;
import execad.revisitor.operations.ActivityNodeOperation;
import execad.revisitor.operations.ActivityOperation;
import execad.revisitor.operations.BooleanBinaryExpressionOperation;
import execad.revisitor.operations.BooleanExpressionOperation;
import execad.revisitor.operations.BooleanUnaryExpressionOperation;
import execad.revisitor.operations.BooleanVariableOperation;
import execad.revisitor.operations.ControlNodeOperation;
import execad.revisitor.operations.DecisionNodeOperation;
import execad.revisitor.operations.ExpressionOperation;
import execad.revisitor.operations.ForkNodeOperation;
import execad.revisitor.operations.ForkedTokenOperation;
import execad.revisitor.operations.InitialNodeOperation;
import execad.revisitor.operations.IntegerCalculationExpressionOperation;
import execad.revisitor.operations.IntegerComparisonExpressionOperation;
import execad.revisitor.operations.IntegerExpressionOperation;
import execad.revisitor.operations.IntegerVariableOperation;
import execad.revisitor.operations.JoinNodeOperation;
import execad.revisitor.operations.MergeNodeOperation;
import execad.revisitor.operations.OfferOperation;
import execad.revisitor.operations.OpaqueActionOperation;
import execad.revisitor.operations.TokenOperation;
import execad.revisitor.operations.VariableOperation;

@SuppressWarnings("all")
public interface ExecadRevisitor extends ActivitydiagramRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, BooleanBinaryExpressionOperation, BooleanExpressionOperation, BooleanUnaryExpressionOperation, Object, BooleanVariableOperation, ActivityEdgeOperation, ControlNodeOperation, TokenOperation, DecisionNodeOperation, ActivityNodeOperation, ExpressionOperation, ControlNodeOperation, ForkNodeOperation, ForkedTokenOperation, InitialNodeOperation, Object, Object, IntegerCalculationExpressionOperation, IntegerComparisonExpressionOperation, IntegerExpressionOperation, Object, IntegerVariableOperation, JoinNodeOperation, MergeNodeOperation, Object, OfferOperation, OpaqueActionOperation, TokenOperation, Object, Object, VariableOperation> {
  @Override
  public default ActivityOperation activity(final Activity it) {
    return new execad.revisitor.operations.impl.ActivityOperationImpl(it, this);
  }
  
  @Override
  public default ActivityFinalNodeOperation activityFinalNode(final ActivityFinalNode it) {
    return new execad.revisitor.operations.impl.ActivityFinalNodeOperationImpl(it, this);
  }
  
  @Override
  public default BooleanBinaryExpressionOperation booleanBinaryExpression(final BooleanBinaryExpression it) {
    return new execad.revisitor.operations.impl.BooleanBinaryExpressionOperationImpl(it, this);
  }
  
  @Override
  public default BooleanUnaryExpressionOperation booleanUnaryExpression(final BooleanUnaryExpression it) {
    return new execad.revisitor.operations.impl.BooleanUnaryExpressionOperationImpl(it, this);
  }
  
  @Override
  public default Object booleanValue(final BooleanValue it) {
    return null;
  }
  
  @Override
  public default BooleanVariableOperation booleanVariable(final BooleanVariable it) {
    return new execad.revisitor.operations.impl.BooleanVariableOperationImpl(it, this);
  }
  
  @Override
  public default ActivityEdgeOperation controlFlow(final ControlFlow it) {
    return new execad.revisitor.operations.impl.ActivityEdgeOperationImpl(it, this);
  }
  
  @Override
  public default TokenOperation controlToken(final ControlToken it) {
    return new execad.revisitor.operations.impl.TokenOperationImpl(it, this);
  }
  
  @Override
  public default DecisionNodeOperation decisionNode(final DecisionNode it) {
    return new execad.revisitor.operations.impl.DecisionNodeOperationImpl(it, this);
  }
  
  @Override
  public default ForkNodeOperation forkNode(final ForkNode it) {
    return new execad.revisitor.operations.impl.ForkNodeOperationImpl(it, this);
  }
  
  @Override
  public default ForkedTokenOperation forkedToken(final ForkedToken it) {
    return new execad.revisitor.operations.impl.ForkedTokenOperationImpl(it, this);
  }
  
  @Override
  public default InitialNodeOperation initialNode(final InitialNode it) {
    return new execad.revisitor.operations.impl.InitialNodeOperationImpl(it, this);
  }
  
  @Override
  public default Object input(final Input it) {
    return null;
  }
  
  @Override
  public default Object inputValue(final InputValue it) {
    return null;
  }
  
  @Override
  public default IntegerCalculationExpressionOperation integerCalculationExpression(final IntegerCalculationExpression it) {
    return new execad.revisitor.operations.impl.IntegerCalculationExpressionOperationImpl(it, this);
  }
  
  @Override
  public default IntegerComparisonExpressionOperation integerComparisonExpression(final IntegerComparisonExpression it) {
    return new execad.revisitor.operations.impl.IntegerComparisonExpressionOperationImpl(it, this);
  }
  
  @Override
  public default Object integerValue(final IntegerValue it) {
    return null;
  }
  
  @Override
  public default IntegerVariableOperation integerVariable(final IntegerVariable it) {
    return new execad.revisitor.operations.impl.IntegerVariableOperationImpl(it, this);
  }
  
  @Override
  public default JoinNodeOperation joinNode(final JoinNode it) {
    return new execad.revisitor.operations.impl.JoinNodeOperationImpl(it, this);
  }
  
  @Override
  public default MergeNodeOperation mergeNode(final MergeNode it) {
    return new execad.revisitor.operations.impl.MergeNodeOperationImpl(it, this);
  }
  
  @Override
  public default OfferOperation offer(final Offer it) {
    return new execad.revisitor.operations.impl.OfferOperationImpl(it, this);
  }
  
  @Override
  public default OpaqueActionOperation opaqueAction(final OpaqueAction it) {
    return new execad.revisitor.operations.impl.OpaqueActionOperationImpl(it, this);
  }
  
  @Override
  public default Object trace(final Trace it) {
    return null;
  }
}
