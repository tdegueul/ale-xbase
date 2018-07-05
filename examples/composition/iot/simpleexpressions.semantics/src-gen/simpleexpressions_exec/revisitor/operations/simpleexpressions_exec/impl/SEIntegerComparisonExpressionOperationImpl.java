package simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.impl;

import com.google.common.base.Objects;
import simpleexpressions.SEBooleanValue;
import simpleexpressions.SEIntegerComparisonExpression;
import simpleexpressions.SEIntegerComparisonOperator;
import simpleexpressions.SEValue;
import simpleexpressions.revisitor.SimpleexpressionsRevisitor;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.SEBooleanBinaryExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.SEBooleanExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.SEBooleanUnaryExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.SEBooleanValueOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.SEBooleanVariableOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.SEExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.SEIntegerCalculationExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.SEIntegerComparisonExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.SEIntegerExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.SEIntegerValueOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.SEIntegerVariableOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.SEValueOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.SEVariableOperation;

@SuppressWarnings("all")
public class SEIntegerComparisonExpressionOperationImpl implements SEIntegerComparisonExpressionOperation {
  private SEIntegerComparisonExpression obj;
  
  private SimpleexpressionsRevisitor<? extends SEBooleanBinaryExpressionOperation, ? extends SEBooleanExpressionOperation, ? extends SEBooleanUnaryExpressionOperation, ? extends SEBooleanValueOperation, ? extends SEBooleanVariableOperation, ? extends SEExpressionOperation, ? extends SEIntegerCalculationExpressionOperation, ? extends SEIntegerComparisonExpressionOperation, ? extends SEIntegerExpressionOperation, ? extends SEIntegerValueOperation, ? extends SEIntegerVariableOperation, ? extends SEValueOperation, ? extends SEVariableOperation> alg;
  
  public SEIntegerComparisonExpressionOperationImpl(final SEIntegerComparisonExpression obj, final SimpleexpressionsRevisitor<? extends SEBooleanBinaryExpressionOperation, ? extends SEBooleanExpressionOperation, ? extends SEBooleanUnaryExpressionOperation, ? extends SEBooleanValueOperation, ? extends SEBooleanVariableOperation, ? extends SEExpressionOperation, ? extends SEIntegerCalculationExpressionOperation, ? extends SEIntegerComparisonExpressionOperation, ? extends SEIntegerExpressionOperation, ? extends SEIntegerValueOperation, ? extends SEIntegerVariableOperation, ? extends SEValueOperation, ? extends SEVariableOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public Object execute() {
    int _xblockexpression = (int) 0;
    {
      int _value = this.obj.getOperator().getValue();
      boolean _equals = (_value == SEIntegerComparisonOperator.EQUALS_VALUE);
      if (_equals) {
        SEValue _currentValue = this.obj.getAssignee().getCurrentValue();
        final SEBooleanValue cv = ((SEBooleanValue) _currentValue);
        final Object o1 = this.alg.$(this.obj.getOperand1()).execute();
        final Object o2 = this.alg.$(this.obj.getOperand2()).execute();
        boolean _equals_1 = Objects.equal(o1, o2);
        cv.setValue(_equals_1);
      } else {
        int _value_1 = this.obj.getOperator().getValue();
        boolean _equals_2 = (_value_1 == SEIntegerComparisonOperator.GREATER_EQUALS_VALUE);
        if (_equals_2) {
          SEValue _currentValue_1 = this.obj.getAssignee().getCurrentValue();
          Object _execute = this.alg.$(this.obj.getOperand1()).execute();
          Object _execute_1 = this.alg.$(this.obj.getOperand2()).execute();
          boolean _greaterEqualsThan = (((Integer) _execute).compareTo(
            ((Integer) _execute_1)) >= 0);
          ((SEBooleanValue) _currentValue_1).setValue(_greaterEqualsThan);
        } else {
          int _value_2 = this.obj.getOperator().getValue();
          boolean _equals_3 = (_value_2 == SEIntegerComparisonOperator.GREATER_VALUE);
          if (_equals_3) {
            SEValue _currentValue_2 = this.obj.getAssignee().getCurrentValue();
            Object _execute_2 = this.alg.$(this.obj.getOperand1()).execute();
            Object _execute_3 = this.alg.$(this.obj.getOperand2()).execute();
            boolean _greaterThan = (((Integer) _execute_2).compareTo(
              ((Integer) _execute_3)) > 0);
            ((SEBooleanValue) _currentValue_2).setValue(_greaterThan);
          } else {
            int _value_3 = this.obj.getOperator().getValue();
            boolean _equals_4 = (_value_3 == SEIntegerComparisonOperator.SMALLER_EQUALS_VALUE);
            if (_equals_4) {
              SEValue _currentValue_3 = this.obj.getAssignee().getCurrentValue();
              Object _execute_4 = this.alg.$(this.obj.getOperand1()).execute();
              Object _execute_5 = this.alg.$(this.obj.getOperand2()).execute();
              boolean _lessEqualsThan = (((Integer) _execute_4).compareTo(((Integer) _execute_5)) <= 0);
              ((SEBooleanValue) _currentValue_3).setValue(_lessEqualsThan);
            } else {
              int _value_4 = this.obj.getOperator().getValue();
              boolean _equals_5 = (_value_4 == SEIntegerComparisonOperator.SMALLER_VALUE);
              if (_equals_5) {
                SEValue _currentValue_4 = this.obj.getAssignee().getCurrentValue();
                Object _execute_6 = this.alg.$(this.obj.getOperand1()).execute();
                Object _execute_7 = this.alg.$(this.obj.getOperand2()).execute();
                boolean _lessThan = (((Integer) _execute_6).compareTo(((Integer) _execute_7)) < 0);
                ((SEBooleanValue) _currentValue_4).setValue(_lessThan);
              }
            }
          }
        }
      }
      _xblockexpression = this.obj.getOperator().getValue();
    }
    return Integer.valueOf(_xblockexpression);
  }
}
