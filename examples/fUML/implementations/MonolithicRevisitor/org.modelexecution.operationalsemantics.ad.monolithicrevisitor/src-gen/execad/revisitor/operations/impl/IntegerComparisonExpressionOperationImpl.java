package execad.revisitor.operations.impl;

import activitydiagram.ActivitydiagramFactory;
import activitydiagram.BooleanValue;
import activitydiagram.BooleanVariable;
import activitydiagram.IntegerComparisonExpression;
import activitydiagram.IntegerComparisonOperator;
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
import execad.revisitor.operations.impl.IntegerExpressionOperationImpl;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class IntegerComparisonExpressionOperationImpl extends IntegerExpressionOperationImpl implements IntegerComparisonExpressionOperation {
  private IntegerComparisonExpression obj;
  
  private ActivitydiagramRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, BooleanBinaryExpressionOperation, BooleanExpressionOperation, BooleanUnaryExpressionOperation, Object, BooleanVariableOperation, ActivityEdgeOperation, ControlNodeOperation, TokenOperation, DecisionNodeOperation, ActivityNodeOperation, ExpressionOperation, ControlNodeOperation, ForkNodeOperation, ForkedTokenOperation, InitialNodeOperation, Object, Object, IntegerCalculationExpressionOperation, IntegerComparisonExpressionOperation, IntegerExpressionOperation, Object, IntegerVariableOperation, JoinNodeOperation, MergeNodeOperation, Object, OfferOperation, OpaqueActionOperation, TokenOperation, Object, Object, VariableOperation> alg;
  
  public IntegerComparisonExpressionOperationImpl(final IntegerComparisonExpression obj, final ActivitydiagramRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, BooleanBinaryExpressionOperation, BooleanExpressionOperation, BooleanUnaryExpressionOperation, Object, BooleanVariableOperation, ActivityEdgeOperation, ControlNodeOperation, TokenOperation, DecisionNodeOperation, ActivityNodeOperation, ExpressionOperation, ControlNodeOperation, ForkNodeOperation, ForkedTokenOperation, InitialNodeOperation, Object, Object, IntegerCalculationExpressionOperation, IntegerComparisonExpressionOperation, IntegerExpressionOperation, Object, IntegerVariableOperation, JoinNodeOperation, MergeNodeOperation, Object, OfferOperation, OpaqueActionOperation, TokenOperation, Object, Object, VariableOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void execute() {
    final int opVal1 = this.alg.$(this.obj).getCurrentValue(this.obj.getOperand1());
    final int opVal2 = this.alg.$(this.obj).getCurrentValue(this.obj.getOperand2());
    boolean _switchResult = false;
    IntegerComparisonOperator _operator = this.obj.getOperator();
    if (_operator != null) {
      switch (_operator) {
        case EQUALS:
          _switchResult = (opVal1 == opVal2);
          break;
        case GREATER:
          _switchResult = (opVal1 > opVal2);
          break;
        case GREATER_EQUALS:
          _switchResult = (opVal1 >= opVal2);
          break;
        case SMALLER:
          _switchResult = (opVal1 < opVal2);
          break;
        case SMALLER_EQUALS:
          _switchResult = (opVal1 <= opVal2);
          break;
        default:
          break;
      }
    }
    final boolean result = _switchResult;
    BooleanVariable _assignee = this.obj.getAssignee();
    BooleanValue _createBooleanValue = ActivitydiagramFactory.eINSTANCE.createBooleanValue();
    final Procedure1<BooleanValue> _function = (BooleanValue bv) -> {
      bv.setValue(result);
    };
    BooleanValue _doubleArrow = ObjectExtensions.<BooleanValue>operator_doubleArrow(_createBooleanValue, _function);
    _assignee.setCurrentValue(_doubleArrow);
  }
}
