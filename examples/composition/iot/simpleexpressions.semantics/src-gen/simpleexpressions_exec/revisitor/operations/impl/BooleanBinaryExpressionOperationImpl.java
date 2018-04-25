package simpleexpressions_exec.revisitor.operations.impl;

import simpleexpressions.BooleanBinaryExpression;
import simpleexpressions.BooleanBinaryOperator;
import simpleexpressions.BooleanValue;
import simpleexpressions.Value;
import simpleexpressions.revisitor.SimpleexpressionsRevisitor;
import simpleexpressions.semantics.Context;
import simpleexpressions_exec.revisitor.operations.BooleanBinaryExpressionOperation;
import simpleexpressions_exec.revisitor.operations.BooleanExpressionOperation;
import simpleexpressions_exec.revisitor.operations.BooleanUnaryExpressionOperation;
import simpleexpressions_exec.revisitor.operations.BooleanValueOperation;
import simpleexpressions_exec.revisitor.operations.BooleanVariableOperation;
import simpleexpressions_exec.revisitor.operations.ExpressionOperation;
import simpleexpressions_exec.revisitor.operations.IntegerCalculationExpressionOperation;
import simpleexpressions_exec.revisitor.operations.IntegerComparisonExpressionOperation;
import simpleexpressions_exec.revisitor.operations.IntegerExpressionOperation;
import simpleexpressions_exec.revisitor.operations.IntegerValueOperation;
import simpleexpressions_exec.revisitor.operations.IntegerVariableOperation;
import simpleexpressions_exec.revisitor.operations.ValueOperation;
import simpleexpressions_exec.revisitor.operations.VariableOperation;
import simpleexpressions_exec.revisitor.operations.impl.BooleanExpressionOperationImpl;

@SuppressWarnings("all")
public class BooleanBinaryExpressionOperationImpl extends BooleanExpressionOperationImpl implements BooleanBinaryExpressionOperation {
  private BooleanBinaryExpression obj;
  
  private SimpleexpressionsRevisitor<BooleanBinaryExpressionOperation, BooleanExpressionOperation, BooleanUnaryExpressionOperation, BooleanValueOperation, BooleanVariableOperation, ExpressionOperation, IntegerCalculationExpressionOperation, IntegerComparisonExpressionOperation, IntegerExpressionOperation, IntegerValueOperation, IntegerVariableOperation, ValueOperation, VariableOperation> alg;
  
  public BooleanBinaryExpressionOperationImpl(final BooleanBinaryExpression obj, final SimpleexpressionsRevisitor<BooleanBinaryExpressionOperation, BooleanExpressionOperation, BooleanUnaryExpressionOperation, BooleanValueOperation, BooleanVariableOperation, ExpressionOperation, IntegerCalculationExpressionOperation, IntegerComparisonExpressionOperation, IntegerExpressionOperation, IntegerValueOperation, IntegerVariableOperation, ValueOperation, VariableOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void execute(final Context c) {
    int _value = this.obj.getOperator().getValue();
    boolean _equals = (_value == BooleanBinaryOperator.AND_VALUE);
    if (_equals) {
      Value _currentValue = this.obj.getAssignee().getCurrentValue();
      ((BooleanValue) _currentValue).setValue((((BooleanValue) this.obj.getOperand1().getCurrentValue()).isValue() && 
        ((BooleanValue) this.obj.getOperand2().getCurrentValue()).isValue()));
    } else {
      int _value_1 = this.obj.getOperator().getValue();
      boolean _equals_1 = (_value_1 == BooleanBinaryOperator.OR_VALUE);
      if (_equals_1) {
        Value _currentValue_1 = this.obj.getAssignee().getCurrentValue();
        ((BooleanValue) _currentValue_1).setValue((((BooleanValue) this.obj.getOperand1().getCurrentValue()).isValue() || 
          ((BooleanValue) this.obj.getOperand2().getCurrentValue()).isValue()));
      }
    }
  }
}
