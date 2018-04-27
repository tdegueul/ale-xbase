package simpleexpressions_exec.revisitor.operations.simpleexpressions_exec;

import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.BooleanExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.ExpressionOperation;

@SuppressWarnings("all")
public interface BooleanBinaryExpressionOperation extends BooleanExpressionOperation, ExpressionOperation {
  public abstract void execute();
}
