package simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.impl;

import simpleexpressions.SEBooleanValue;
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
public class SEBooleanValueOperationImpl implements SEBooleanValueOperation {
  private SEBooleanValue obj;
  
  private SimpleexpressionsRevisitor<? extends SEBooleanBinaryExpressionOperation, ? extends SEBooleanExpressionOperation, ? extends SEBooleanUnaryExpressionOperation, ? extends SEBooleanValueOperation, ? extends SEBooleanVariableOperation, ? extends SEExpressionOperation, ? extends SEIntegerCalculationExpressionOperation, ? extends SEIntegerComparisonExpressionOperation, ? extends SEIntegerExpressionOperation, ? extends SEIntegerValueOperation, ? extends SEIntegerVariableOperation, ? extends SEValueOperation, ? extends SEVariableOperation> alg;
  
  public SEBooleanValueOperationImpl(final SEBooleanValue obj, final SimpleexpressionsRevisitor<? extends SEBooleanBinaryExpressionOperation, ? extends SEBooleanExpressionOperation, ? extends SEBooleanUnaryExpressionOperation, ? extends SEBooleanValueOperation, ? extends SEBooleanVariableOperation, ? extends SEExpressionOperation, ? extends SEIntegerCalculationExpressionOperation, ? extends SEIntegerComparisonExpressionOperation, ? extends SEIntegerExpressionOperation, ? extends SEIntegerValueOperation, ? extends SEIntegerVariableOperation, ? extends SEValueOperation, ? extends SEVariableOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public Object execute() {
    return Boolean.valueOf(this.obj.isValue());
  }
}
