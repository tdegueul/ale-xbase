package simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.impl;

import simpleexpressions.BooleanUnaryExpression;
import simpleexpressions.BooleanUnaryOperator;
import simpleexpressions.BooleanValue;
import simpleexpressions.Value;
import simpleexpressions.revisitor.SimpleexpressionsRevisitor;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.BooleanBinaryExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.BooleanExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.BooleanUnaryExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.BooleanValueOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.BooleanVariableOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.ExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.IntegerCalculationExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.IntegerComparisonExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.IntegerExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.IntegerValueOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.IntegerVariableOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.ValueOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.VariableOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.impl.BooleanExpressionOperationImpl;

@SuppressWarnings("all")
public class BooleanUnaryExpressionOperationImpl extends BooleanExpressionOperationImpl implements BooleanUnaryExpressionOperation {
  private BooleanUnaryExpression obj;
  
  private SimpleexpressionsRevisitor<? extends BooleanBinaryExpressionOperation, ? extends BooleanExpressionOperation, ? extends BooleanUnaryExpressionOperation, ? extends BooleanValueOperation, ? extends BooleanVariableOperation, ? extends ExpressionOperation, ? extends IntegerCalculationExpressionOperation, ? extends IntegerComparisonExpressionOperation, ? extends IntegerExpressionOperation, ? extends IntegerValueOperation, ? extends IntegerVariableOperation, ? extends ValueOperation, ? extends VariableOperation> alg;
  
  public BooleanUnaryExpressionOperationImpl(final BooleanUnaryExpression obj, final SimpleexpressionsRevisitor<? extends BooleanBinaryExpressionOperation, ? extends BooleanExpressionOperation, ? extends BooleanUnaryExpressionOperation, ? extends BooleanValueOperation, ? extends BooleanVariableOperation, ? extends ExpressionOperation, ? extends IntegerCalculationExpressionOperation, ? extends IntegerComparisonExpressionOperation, ? extends IntegerExpressionOperation, ? extends IntegerValueOperation, ? extends IntegerVariableOperation, ? extends ValueOperation, ? extends VariableOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void execute() {
    int _value = this.obj.getOperator().getValue();
    boolean _equals = (_value == BooleanUnaryOperator.NOT_VALUE);
    if (_equals) {
      Value _currentValue = this.obj.getAssignee().getCurrentValue();
      Value _currentValue_1 = this.obj.getOperand().getCurrentValue();
      boolean _isValue = ((BooleanValue) _currentValue_1).isValue();
      boolean _not = (!_isValue);
      ((BooleanValue) _currentValue).setValue(_not);
    }
  }
}
