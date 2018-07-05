package simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.impl;

import simpleexpressions.SEBooleanBinaryExpression;
import simpleexpressions.SEBooleanBinaryOperator;
import simpleexpressions.SEBooleanValue;
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
public class SEBooleanBinaryExpressionOperationImpl implements SEBooleanBinaryExpressionOperation {
  private SEBooleanBinaryExpression obj;
  
  private SimpleexpressionsRevisitor<? extends SEBooleanBinaryExpressionOperation, ? extends SEBooleanExpressionOperation, ? extends SEBooleanUnaryExpressionOperation, ? extends SEBooleanValueOperation, ? extends SEBooleanVariableOperation, ? extends SEExpressionOperation, ? extends SEIntegerCalculationExpressionOperation, ? extends SEIntegerComparisonExpressionOperation, ? extends SEIntegerExpressionOperation, ? extends SEIntegerValueOperation, ? extends SEIntegerVariableOperation, ? extends SEValueOperation, ? extends SEVariableOperation> alg;
  
  public SEBooleanBinaryExpressionOperationImpl(final SEBooleanBinaryExpression obj, final SimpleexpressionsRevisitor<? extends SEBooleanBinaryExpressionOperation, ? extends SEBooleanExpressionOperation, ? extends SEBooleanUnaryExpressionOperation, ? extends SEBooleanValueOperation, ? extends SEBooleanVariableOperation, ? extends SEExpressionOperation, ? extends SEIntegerCalculationExpressionOperation, ? extends SEIntegerComparisonExpressionOperation, ? extends SEIntegerExpressionOperation, ? extends SEIntegerValueOperation, ? extends SEIntegerVariableOperation, ? extends SEValueOperation, ? extends SEVariableOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public Object execute() {
    int _xblockexpression = (int) 0;
    {
      int _value = this.obj.getOperator().getValue();
      boolean _equals = (_value == SEBooleanBinaryOperator.AND_VALUE);
      if (_equals) {
        SEValue _currentValue = this.obj.getAssignee().getCurrentValue();
        final SEBooleanValue a = ((SEBooleanValue) _currentValue);
        final SEBooleanVariableOperation r1 = this.alg.$(this.obj.getOperand1());
        Object _execute = r1.execute();
        final Boolean o1 = ((Boolean) _execute);
        final SEBooleanVariableOperation r2 = this.alg.$(this.obj.getOperand2());
        Object _execute_1 = r2.execute();
        final Boolean o2 = ((Boolean) _execute_1);
        a.setValue(((o1).booleanValue() && (o2).booleanValue()));
      } else {
        int _value_1 = this.obj.getOperator().getValue();
        boolean _equals_1 = (_value_1 == SEBooleanBinaryOperator.OR_VALUE);
        if (_equals_1) {
          SEValue _currentValue_1 = this.obj.getAssignee().getCurrentValue();
          ((SEBooleanValue) _currentValue_1).setValue(((((Boolean) this.alg.$(this.obj.getOperand1()).execute())).booleanValue() || (((Boolean) this.alg.$(this.obj.getOperand2()).execute())).booleanValue()));
        }
      }
      _xblockexpression = this.obj.getOperator().getValue();
    }
    return Integer.valueOf(_xblockexpression);
  }
}
