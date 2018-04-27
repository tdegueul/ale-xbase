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

@SuppressWarnings("all")
public interface Simpleexpressions_execRevisitor extends SimpleexpressionsRevisitor<BooleanBinaryExpressionOperation, BooleanExpressionOperation, BooleanUnaryExpressionOperation, BooleanValueOperation, BooleanVariableOperation, ExpressionOperation, IntegerCalculationExpressionOperation, IntegerComparisonExpressionOperation, IntegerExpressionOperation, IntegerValueOperation, IntegerVariableOperation, ValueOperation, VariableOperation> {
  @Override
  public default BooleanBinaryExpressionOperation simpleexpressions__BooleanBinaryExpression(final BooleanBinaryExpression it) {
    return new simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.impl.BooleanBinaryExpressionOperationImpl(it, this);
  }
  
  @Override
  public default BooleanUnaryExpressionOperation simpleexpressions__BooleanUnaryExpression(final BooleanUnaryExpression it) {
    return new simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.impl.BooleanUnaryExpressionOperationImpl(it, this);
  }
  
  @Override
  public default BooleanValueOperation simpleexpressions__BooleanValue(final BooleanValue it) {
    return new simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.impl.BooleanValueOperationImpl(it, this);
  }
  
  @Override
  public default BooleanVariableOperation simpleexpressions__BooleanVariable(final BooleanVariable it) {
    return new simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.impl.BooleanVariableOperationImpl(it, this);
  }
  
  @Override
  public default IntegerCalculationExpressionOperation simpleexpressions__IntegerCalculationExpression(final IntegerCalculationExpression it) {
    return new simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.impl.IntegerCalculationExpressionOperationImpl(it, this);
  }
  
  @Override
  public default IntegerComparisonExpressionOperation simpleexpressions__IntegerComparisonExpression(final IntegerComparisonExpression it) {
    return new simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.impl.IntegerComparisonExpressionOperationImpl(it, this);
  }
  
  @Override
  public default IntegerValueOperation simpleexpressions__IntegerValue(final IntegerValue it) {
    return new simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.impl.IntegerValueOperationImpl(it, this);
  }
  
  @Override
  public default IntegerVariableOperation simpleexpressions__IntegerVariable(final IntegerVariable it) {
    return new simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.impl.IntegerVariableOperationImpl(it, this);
  }
}
