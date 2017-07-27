package execad.revisitor.operations.impl;

import activitydiagram.ActivitydiagramFactory;
import activitydiagram.IntegerCalculationExpression;
import activitydiagram.IntegerCalculationOperator;
import activitydiagram.IntegerValue;
import activitydiagram.IntegerVariable;
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
public class IntegerCalculationExpressionOperationImpl extends IntegerExpressionOperationImpl implements IntegerCalculationExpressionOperation {
  private IntegerCalculationExpression obj;
  
  private ActivitydiagramRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, BooleanBinaryExpressionOperation, BooleanExpressionOperation, BooleanUnaryExpressionOperation, Object, BooleanVariableOperation, ActivityEdgeOperation, ControlNodeOperation, TokenOperation, DecisionNodeOperation, ActivityNodeOperation, ExpressionOperation, ControlNodeOperation, ForkNodeOperation, ForkedTokenOperation, InitialNodeOperation, Object, Object, IntegerCalculationExpressionOperation, IntegerComparisonExpressionOperation, IntegerExpressionOperation, Object, IntegerVariableOperation, JoinNodeOperation, MergeNodeOperation, Object, OfferOperation, OpaqueActionOperation, TokenOperation, Object, Object, VariableOperation> alg;
  
  public IntegerCalculationExpressionOperationImpl(final IntegerCalculationExpression obj, final ActivitydiagramRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, BooleanBinaryExpressionOperation, BooleanExpressionOperation, BooleanUnaryExpressionOperation, Object, BooleanVariableOperation, ActivityEdgeOperation, ControlNodeOperation, TokenOperation, DecisionNodeOperation, ActivityNodeOperation, ExpressionOperation, ControlNodeOperation, ForkNodeOperation, ForkedTokenOperation, InitialNodeOperation, Object, Object, IntegerCalculationExpressionOperation, IntegerComparisonExpressionOperation, IntegerExpressionOperation, Object, IntegerVariableOperation, JoinNodeOperation, MergeNodeOperation, Object, OfferOperation, OpaqueActionOperation, TokenOperation, Object, Object, VariableOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void execute() {
    final int opVal1 = this.alg.$(this.obj).getCurrentValue(this.obj.getOperand1());
    final int opVal2 = this.alg.$(this.obj).getCurrentValue(this.obj.getOperand2());
    int _switchResult = (int) 0;
    IntegerCalculationOperator _operator = this.obj.getOperator();
    if (_operator != null) {
      switch (_operator) {
        case ADD:
          _switchResult = (opVal1 + opVal2);
          break;
        case SUBRACT:
          _switchResult = (opVal1 - opVal2);
          break;
        default:
          break;
      }
    }
    final int result = _switchResult;
    IntegerVariable _assignee = this.obj.getAssignee();
    IntegerValue _createIntegerValue = ActivitydiagramFactory.eINSTANCE.createIntegerValue();
    final Procedure1<IntegerValue> _function = (IntegerValue iv) -> {
      iv.setValue(result);
    };
    IntegerValue _doubleArrow = ObjectExtensions.<IntegerValue>operator_doubleArrow(_createIntegerValue, _function);
    _assignee.setCurrentValue(_doubleArrow);
  }
}
