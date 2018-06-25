package simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.impl;

import simpleexpressions.BooleanValue;
import simpleexpressions.IntegerComparisonExpression;
import simpleexpressions.IntegerComparisonOperator;
import simpleexpressions.IntegerValue;
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
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.impl.IntegerExpressionOperationImpl;

@SuppressWarnings("all")
public class IntegerComparisonExpressionOperationImpl extends IntegerExpressionOperationImpl implements IntegerComparisonExpressionOperation {
  private IntegerComparisonExpression obj;
  
  private SimpleexpressionsRevisitor<? extends BooleanBinaryExpressionOperation, ? extends BooleanExpressionOperation, ? extends BooleanUnaryExpressionOperation, ? extends BooleanValueOperation, ? extends BooleanVariableOperation, ? extends ExpressionOperation, ? extends IntegerCalculationExpressionOperation, ? extends IntegerComparisonExpressionOperation, ? extends IntegerExpressionOperation, ? extends IntegerValueOperation, ? extends IntegerVariableOperation, ? extends ValueOperation, ? extends VariableOperation> alg;
  
  public IntegerComparisonExpressionOperationImpl(final IntegerComparisonExpression obj, final SimpleexpressionsRevisitor<? extends BooleanBinaryExpressionOperation, ? extends BooleanExpressionOperation, ? extends BooleanUnaryExpressionOperation, ? extends BooleanValueOperation, ? extends BooleanVariableOperation, ? extends ExpressionOperation, ? extends IntegerCalculationExpressionOperation, ? extends IntegerComparisonExpressionOperation, ? extends IntegerExpressionOperation, ? extends IntegerValueOperation, ? extends IntegerVariableOperation, ? extends ValueOperation, ? extends VariableOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void execute() {
    int _value = this.obj.getOperator().getValue();
    boolean _equals = (_value == IntegerComparisonOperator.EQUALS_VALUE);
    if (_equals) {
      Value _currentValue = this.obj.getAssignee().getCurrentValue();
      Value _currentValue_1 = this.obj.getOperand1().getCurrentValue();
      int _value_1 = ((IntegerValue) _currentValue_1).getValue();
      Value _currentValue_2 = this.obj.getOperand2().getCurrentValue();
      int _value_2 = ((IntegerValue) _currentValue_2).getValue();
      boolean _equals_1 = (_value_1 == _value_2);
      ((BooleanValue) _currentValue).setValue(_equals_1);
    } else {
      int _value_3 = this.obj.getOperator().getValue();
      boolean _equals_2 = (_value_3 == IntegerComparisonOperator.GREATER_EQUALS_VALUE);
      if (_equals_2) {
        Value _currentValue_3 = this.obj.getAssignee().getCurrentValue();
        Value _currentValue_4 = this.obj.getOperand1().getCurrentValue();
        int _value_4 = ((IntegerValue) _currentValue_4).getValue();
        Value _currentValue_5 = this.obj.getOperand2().getCurrentValue();
        int _value_5 = ((IntegerValue) _currentValue_5).getValue();
        boolean _greaterEqualsThan = (_value_4 >= _value_5);
        ((BooleanValue) _currentValue_3).setValue(_greaterEqualsThan);
      } else {
        int _value_6 = this.obj.getOperator().getValue();
        boolean _equals_3 = (_value_6 == IntegerComparisonOperator.GREATER_VALUE);
        if (_equals_3) {
          Value _currentValue_6 = this.obj.getAssignee().getCurrentValue();
          Value _currentValue_7 = this.obj.getOperand1().getCurrentValue();
          int _value_7 = ((IntegerValue) _currentValue_7).getValue();
          Value _currentValue_8 = this.obj.getOperand2().getCurrentValue();
          int _value_8 = ((IntegerValue) _currentValue_8).getValue();
          boolean _greaterThan = (_value_7 > _value_8);
          ((BooleanValue) _currentValue_6).setValue(_greaterThan);
        } else {
          int _value_9 = this.obj.getOperator().getValue();
          boolean _equals_4 = (_value_9 == IntegerComparisonOperator.SMALLER_EQUALS_VALUE);
          if (_equals_4) {
            Value _currentValue_9 = this.obj.getAssignee().getCurrentValue();
            Value _currentValue_10 = this.obj.getOperand1().getCurrentValue();
            int _value_10 = ((IntegerValue) _currentValue_10).getValue();
            Value _currentValue_11 = this.obj.getOperand2().getCurrentValue();
            int _value_11 = ((IntegerValue) _currentValue_11).getValue();
            boolean _lessEqualsThan = (_value_10 <= _value_11);
            ((BooleanValue) _currentValue_9).setValue(_lessEqualsThan);
          } else {
            int _value_12 = this.obj.getOperator().getValue();
            boolean _equals_5 = (_value_12 == IntegerComparisonOperator.SMALLER_VALUE);
            if (_equals_5) {
              Value _currentValue_12 = this.obj.getAssignee().getCurrentValue();
              Value _currentValue_13 = this.obj.getOperand1().getCurrentValue();
              int _value_13 = ((IntegerValue) _currentValue_13).getValue();
              Value _currentValue_14 = this.obj.getOperand2().getCurrentValue();
              int _value_14 = ((IntegerValue) _currentValue_14).getValue();
              boolean _lessThan = (_value_13 < _value_14);
              ((BooleanValue) _currentValue_12).setValue(_lessThan);
            }
          }
        }
      }
    }
  }
}
