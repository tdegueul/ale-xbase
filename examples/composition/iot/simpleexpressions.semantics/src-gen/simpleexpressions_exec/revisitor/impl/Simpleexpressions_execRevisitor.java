package simpleexpressions_exec.revisitor.impl;

import simpleexpressions.SEBooleanBinaryExpression;
import simpleexpressions.SEBooleanUnaryExpression;
import simpleexpressions.SEBooleanValue;
import simpleexpressions.SEBooleanVariable;
import simpleexpressions.SEIntegerCalculationExpression;
import simpleexpressions.SEIntegerComparisonExpression;
import simpleexpressions.SEIntegerValue;
import simpleexpressions.SEIntegerVariable;
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
public interface Simpleexpressions_execRevisitor extends SimpleexpressionsRevisitor<SEBooleanBinaryExpressionOperation, SEBooleanExpressionOperation, SEBooleanUnaryExpressionOperation, SEBooleanValueOperation, SEBooleanVariableOperation, SEExpressionOperation, SEIntegerCalculationExpressionOperation, SEIntegerComparisonExpressionOperation, SEIntegerExpressionOperation, SEIntegerValueOperation, SEIntegerVariableOperation, SEValueOperation, SEVariableOperation> {
  @Override
  public default SEBooleanBinaryExpressionOperation simpleexpressions__SEBooleanBinaryExpression(final SEBooleanBinaryExpression it) {
    return new simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.impl.SEBooleanBinaryExpressionOperationImpl(it, this);
  }
  
  @Override
  public default SEBooleanUnaryExpressionOperation simpleexpressions__SEBooleanUnaryExpression(final SEBooleanUnaryExpression it) {
    return new simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.impl.SEBooleanUnaryExpressionOperationImpl(it, this);
  }
  
  @Override
  public default SEBooleanValueOperation simpleexpressions__SEBooleanValue(final SEBooleanValue it) {
    return new simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.impl.SEBooleanValueOperationImpl(it, this);
  }
  
  @Override
  public default SEBooleanVariableOperation simpleexpressions__SEBooleanVariable(final SEBooleanVariable it) {
    return new simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.impl.SEBooleanVariableOperationImpl(it, this);
  }
  
  @Override
  public default SEIntegerCalculationExpressionOperation simpleexpressions__SEIntegerCalculationExpression(final SEIntegerCalculationExpression it) {
    return new simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.impl.SEIntegerCalculationExpressionOperationImpl(it, this);
  }
  
  @Override
  public default SEIntegerComparisonExpressionOperation simpleexpressions__SEIntegerComparisonExpression(final SEIntegerComparisonExpression it) {
    return new simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.impl.SEIntegerComparisonExpressionOperationImpl(it, this);
  }
  
  @Override
  public default SEIntegerValueOperation simpleexpressions__SEIntegerValue(final SEIntegerValue it) {
    return new simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.impl.SEIntegerValueOperationImpl(it, this);
  }
  
  @Override
  public default SEIntegerVariableOperation simpleexpressions__SEIntegerVariable(final SEIntegerVariable it) {
    return new simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.impl.SEIntegerVariableOperationImpl(it, this);
  }
}
