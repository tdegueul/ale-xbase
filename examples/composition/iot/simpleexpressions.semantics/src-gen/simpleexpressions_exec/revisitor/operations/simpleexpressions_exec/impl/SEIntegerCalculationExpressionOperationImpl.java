package simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.impl;

import simpleexpressions.SEIntegerCalculationExpression;
import simpleexpressions.SEIntegerCalculationOperator;
import simpleexpressions.SEIntegerValue;
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
public class SEIntegerCalculationExpressionOperationImpl implements SEIntegerCalculationExpressionOperation {
  private SEIntegerCalculationExpression obj;
  
  private SimpleexpressionsRevisitor<? extends SEBooleanBinaryExpressionOperation, ? extends SEBooleanExpressionOperation, ? extends SEBooleanUnaryExpressionOperation, ? extends SEBooleanValueOperation, ? extends SEBooleanVariableOperation, ? extends SEExpressionOperation, ? extends SEIntegerCalculationExpressionOperation, ? extends SEIntegerComparisonExpressionOperation, ? extends SEIntegerExpressionOperation, ? extends SEIntegerValueOperation, ? extends SEIntegerVariableOperation, ? extends SEValueOperation, ? extends SEVariableOperation> alg;
  
  public SEIntegerCalculationExpressionOperationImpl(final SEIntegerCalculationExpression obj, final SimpleexpressionsRevisitor<? extends SEBooleanBinaryExpressionOperation, ? extends SEBooleanExpressionOperation, ? extends SEBooleanUnaryExpressionOperation, ? extends SEBooleanValueOperation, ? extends SEBooleanVariableOperation, ? extends SEExpressionOperation, ? extends SEIntegerCalculationExpressionOperation, ? extends SEIntegerComparisonExpressionOperation, ? extends SEIntegerExpressionOperation, ? extends SEIntegerValueOperation, ? extends SEIntegerVariableOperation, ? extends SEValueOperation, ? extends SEVariableOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public Object execute() {
    int _xblockexpression = (int) 0;
    {
      int _value = this.obj.getOperator().getValue();
      boolean _equals = (_value == SEIntegerCalculationOperator.ADD_VALUE);
      if (_equals) {
        SEValue _currentValue = this.obj.getAssignee().getCurrentValue();
        Object _execute = this.alg.$(this.obj.getOperand1()).execute();
        Object _execute_1 = this.alg.$(this.obj.getOperand2()).execute();
        int _plus = ((((Integer) _execute)).intValue() + (((Integer) _execute_1)).intValue());
        ((SEIntegerValue) _currentValue).setValue(_plus);
      } else {
        int _value_1 = this.obj.getOperator().getValue();
        boolean _equals_1 = (_value_1 == SEIntegerCalculationOperator.SUBRACT_VALUE);
        if (_equals_1) {
          SEValue _currentValue_1 = this.obj.getAssignee().getCurrentValue();
          Object _execute_2 = this.alg.$(this.obj.getOperand1()).execute();
          Object _execute_3 = this.alg.$(this.obj.getOperand2()).execute();
          int _minus = ((((Integer) _execute_2)).intValue() - (((Integer) _execute_3)).intValue());
          ((SEIntegerValue) _currentValue_1).setValue(_minus);
        }
      }
      _xblockexpression = this.obj.getOperator().getValue();
    }
    return Integer.valueOf(_xblockexpression);
  }
}
