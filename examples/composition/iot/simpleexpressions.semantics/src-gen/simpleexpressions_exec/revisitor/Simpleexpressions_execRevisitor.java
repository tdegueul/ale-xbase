package simpleexpressions_exec.revisitor;

import simpleexpressions.BooleanBinaryExpression;
import simpleexpressions.BooleanUnaryExpression;
import simpleexpressions.BooleanValue;
import simpleexpressions.BooleanVariable;
import simpleexpressions.IntegerCalculationExpression;
import simpleexpressions.IntegerComparisonExpression;
import simpleexpressions.IntegerValue;
import simpleexpressions.IntegerVariable;
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

@SuppressWarnings("all")
public interface Simpleexpressions_execRevisitor extends SimpleexpressionsRevisitor<BooleanBinaryExpressionOperation, BooleanExpressionOperation, BooleanUnaryExpressionOperation, BooleanValueOperation, BooleanVariableOperation, ExpressionOperation, IntegerCalculationExpressionOperation, IntegerComparisonExpressionOperation, IntegerExpressionOperation, IntegerValueOperation, IntegerVariableOperation, ValueOperation, VariableOperation> {
  @Override
  public default BooleanBinaryExpressionOperation booleanBinaryExpression(final BooleanBinaryExpression it) {
    return new simpleexpressions_exec.revisitor.operations.impl.BooleanBinaryExpressionOperationImpl(it, this);
  }
  
  @Override
  public default BooleanUnaryExpressionOperation booleanUnaryExpression(final BooleanUnaryExpression it) {
    return new simpleexpressions_exec.revisitor.operations.impl.BooleanUnaryExpressionOperationImpl(it, this);
  }
  
  @Override
  public default BooleanValueOperation booleanValue(final BooleanValue it) {
    return new simpleexpressions_exec.revisitor.operations.impl.BooleanValueOperationImpl(it, this);
  }
  
  @Override
  public default BooleanVariableOperation booleanVariable(final BooleanVariable it) {
    return new simpleexpressions_exec.revisitor.operations.impl.BooleanVariableOperationImpl(it, this);
  }
  
  @Override
  public default IntegerCalculationExpressionOperation integerCalculationExpression(final IntegerCalculationExpression it) {
    return new simpleexpressions_exec.revisitor.operations.impl.IntegerCalculationExpressionOperationImpl(it, this);
  }
  
  @Override
  public default IntegerComparisonExpressionOperation integerComparisonExpression(final IntegerComparisonExpression it) {
    return new simpleexpressions_exec.revisitor.operations.impl.IntegerComparisonExpressionOperationImpl(it, this);
  }
  
  @Override
  public default IntegerValueOperation integerValue(final IntegerValue it) {
    return new simpleexpressions_exec.revisitor.operations.impl.IntegerValueOperationImpl(it, this);
  }
  
  @Override
  public default IntegerVariableOperation integerVariable(final IntegerVariable it) {
    return new simpleexpressions_exec.revisitor.operations.impl.IntegerVariableOperationImpl(it, this);
  }
}
