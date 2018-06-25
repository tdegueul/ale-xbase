package simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.impl;

import simpleexpressions.IntegerValue;
import simpleexpressions.IntegerVariable;
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
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.impl.VariableOperationImpl;

@SuppressWarnings("all")
public class IntegerVariableOperationImpl extends VariableOperationImpl implements IntegerVariableOperation {
  private IntegerVariable obj;
  
  private SimpleexpressionsRevisitor<? extends BooleanBinaryExpressionOperation, ? extends BooleanExpressionOperation, ? extends BooleanUnaryExpressionOperation, ? extends BooleanValueOperation, ? extends BooleanVariableOperation, ? extends ExpressionOperation, ? extends IntegerCalculationExpressionOperation, ? extends IntegerComparisonExpressionOperation, ? extends IntegerExpressionOperation, ? extends IntegerValueOperation, ? extends IntegerVariableOperation, ? extends ValueOperation, ? extends VariableOperation> alg;
  
  public IntegerVariableOperationImpl(final IntegerVariable obj, final SimpleexpressionsRevisitor<? extends BooleanBinaryExpressionOperation, ? extends BooleanExpressionOperation, ? extends BooleanUnaryExpressionOperation, ? extends BooleanValueOperation, ? extends BooleanVariableOperation, ? extends ExpressionOperation, ? extends IntegerCalculationExpressionOperation, ? extends IntegerComparisonExpressionOperation, ? extends IntegerExpressionOperation, ? extends IntegerValueOperation, ? extends IntegerVariableOperation, ? extends ValueOperation, ? extends VariableOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void execute() {
  }
  
  @Override
  public String print() {
    StringBuffer text = new StringBuffer();
    text.append(this.obj.getName());
    text.append(" = ");
    Value _currentValue = this.obj.getCurrentValue();
    text.append(((IntegerValue) _currentValue).getValue());
    return text.toString();
  }
}
