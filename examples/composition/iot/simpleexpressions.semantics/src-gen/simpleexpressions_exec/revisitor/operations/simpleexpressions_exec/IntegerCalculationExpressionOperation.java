package simpleexpressions_exec.revisitor.operations.simpleexpressions_exec;

import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.ExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.IntegerExpressionOperation;

@SuppressWarnings("all")
public interface IntegerCalculationExpressionOperation extends IntegerExpressionOperation, ExpressionOperation {
  public abstract void execute();
}
