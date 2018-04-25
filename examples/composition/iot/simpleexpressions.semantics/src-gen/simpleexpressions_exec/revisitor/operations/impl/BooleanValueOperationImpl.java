package simpleexpressions_exec.revisitor.operations.impl;

import simpleexpressions.BooleanValue;
import simpleexpressions.revisitor.SimpleexpressionsRevisitor;
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
import simpleexpressions_exec.revisitor.operations.impl.ValueOperationImpl;

@SuppressWarnings("all")
public class BooleanValueOperationImpl extends ValueOperationImpl implements BooleanValueOperation {
  private BooleanValue obj;
  
  private SimpleexpressionsRevisitor<BooleanBinaryExpressionOperation, BooleanExpressionOperation, BooleanUnaryExpressionOperation, BooleanValueOperation, BooleanVariableOperation, ExpressionOperation, IntegerCalculationExpressionOperation, IntegerComparisonExpressionOperation, IntegerExpressionOperation, IntegerValueOperation, IntegerVariableOperation, ValueOperation, VariableOperation> alg;
  
  public BooleanValueOperationImpl(final BooleanValue obj, final SimpleexpressionsRevisitor<BooleanBinaryExpressionOperation, BooleanExpressionOperation, BooleanUnaryExpressionOperation, BooleanValueOperation, BooleanVariableOperation, ExpressionOperation, IntegerCalculationExpressionOperation, IntegerComparisonExpressionOperation, IntegerExpressionOperation, IntegerValueOperation, IntegerVariableOperation, ValueOperation, VariableOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
}
