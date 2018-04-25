package simpleexpressions_exec.revisitor.operations.impl;

import simpleexpressions.BooleanValue;
import simpleexpressions.BooleanVariable;
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
public class BooleanVariableOperationImpl extends VariableOperationImpl implements BooleanVariableOperation {
  private BooleanVariable obj;
  
  private SimpleexpressionsRevisitor<BooleanBinaryExpressionOperation, BooleanExpressionOperation, BooleanUnaryExpressionOperation, BooleanValueOperation, BooleanVariableOperation, ExpressionOperation, IntegerCalculationExpressionOperation, IntegerComparisonExpressionOperation, IntegerExpressionOperation, IntegerValueOperation, IntegerVariableOperation, ValueOperation, VariableOperation> alg;
  
  public BooleanVariableOperationImpl(final BooleanVariable obj, final SimpleexpressionsRevisitor<BooleanBinaryExpressionOperation, BooleanExpressionOperation, BooleanUnaryExpressionOperation, BooleanValueOperation, BooleanVariableOperation, ExpressionOperation, IntegerCalculationExpressionOperation, IntegerComparisonExpressionOperation, IntegerExpressionOperation, IntegerValueOperation, IntegerVariableOperation, ValueOperation, VariableOperation> alg) {
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
    text.append(((BooleanValue) _currentValue).isValue());
    return text.toString();
  }
}
