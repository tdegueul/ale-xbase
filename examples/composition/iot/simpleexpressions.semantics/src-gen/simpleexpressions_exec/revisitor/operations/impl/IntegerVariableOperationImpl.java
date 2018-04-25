package simpleexpressions_exec.revisitor.operations.impl;

import simpleexpressions.IntegerValue;
import simpleexpressions.IntegerVariable;
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
import simpleexpressions_exec.revisitor.operations.impl.VariableOperationImpl;

@SuppressWarnings("all")
public class IntegerVariableOperationImpl extends VariableOperationImpl implements IntegerVariableOperation {
  private IntegerVariable obj;
  
  private SimpleexpressionsRevisitor<BooleanBinaryExpressionOperation, BooleanExpressionOperation, BooleanUnaryExpressionOperation, BooleanValueOperation, BooleanVariableOperation, ExpressionOperation, IntegerCalculationExpressionOperation, IntegerComparisonExpressionOperation, IntegerExpressionOperation, IntegerValueOperation, IntegerVariableOperation, ValueOperation, VariableOperation> alg;
  
  public IntegerVariableOperationImpl(final IntegerVariable obj, final SimpleexpressionsRevisitor<BooleanBinaryExpressionOperation, BooleanExpressionOperation, BooleanUnaryExpressionOperation, BooleanValueOperation, BooleanVariableOperation, ExpressionOperation, IntegerCalculationExpressionOperation, IntegerComparisonExpressionOperation, IntegerExpressionOperation, IntegerValueOperation, IntegerVariableOperation, ValueOperation, VariableOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void execute(final Context c) {
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
