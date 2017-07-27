package execad.revisitor.operations.impl;

import activitydiagram.ActivitydiagramFactory;
import activitydiagram.BooleanExpression;
import activitydiagram.BooleanValue;
import activitydiagram.BooleanVariable;
import activitydiagram.Value;
import activitydiagram.Variable;
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
import execad.revisitor.operations.impl.ExpressionOperationImpl;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public abstract class BooleanExpressionOperationImpl extends ExpressionOperationImpl implements BooleanExpressionOperation {
  private BooleanExpression obj;
  
  private ActivitydiagramRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, BooleanBinaryExpressionOperation, BooleanExpressionOperation, BooleanUnaryExpressionOperation, Object, BooleanVariableOperation, ActivityEdgeOperation, ControlNodeOperation, TokenOperation, DecisionNodeOperation, ActivityNodeOperation, ExpressionOperation, ControlNodeOperation, ForkNodeOperation, ForkedTokenOperation, InitialNodeOperation, Object, Object, IntegerCalculationExpressionOperation, IntegerComparisonExpressionOperation, IntegerExpressionOperation, Object, IntegerVariableOperation, JoinNodeOperation, MergeNodeOperation, Object, OfferOperation, OpaqueActionOperation, TokenOperation, Object, Object, VariableOperation> alg;
  
  public BooleanExpressionOperationImpl(final BooleanExpression obj, final ActivitydiagramRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, BooleanBinaryExpressionOperation, BooleanExpressionOperation, BooleanUnaryExpressionOperation, Object, BooleanVariableOperation, ActivityEdgeOperation, ControlNodeOperation, TokenOperation, DecisionNodeOperation, ActivityNodeOperation, ExpressionOperation, ControlNodeOperation, ForkNodeOperation, ForkedTokenOperation, InitialNodeOperation, Object, Object, IntegerCalculationExpressionOperation, IntegerComparisonExpressionOperation, IntegerExpressionOperation, Object, IntegerVariableOperation, JoinNodeOperation, MergeNodeOperation, Object, OfferOperation, OpaqueActionOperation, TokenOperation, Object, Object, VariableOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public boolean getCurrentValue(final Variable variable) {
    boolean currentValue = false;
    final Value value = variable.getCurrentValue();
    if ((value instanceof BooleanValue)) {
      currentValue = ((BooleanValue)value).isValue();
    }
    return currentValue;
  }
  
  @Override
  public void assignValue(final boolean value) {
    BooleanVariable _assignee = this.obj.getAssignee();
    BooleanValue _createBooleanValue = ActivitydiagramFactory.eINSTANCE.createBooleanValue();
    final Procedure1<BooleanValue> _function = (BooleanValue bv) -> {
      bv.setValue(value);
    };
    BooleanValue _doubleArrow = ObjectExtensions.<BooleanValue>operator_doubleArrow(_createBooleanValue, _function);
    _assignee.setCurrentValue(_doubleArrow);
  }
}
