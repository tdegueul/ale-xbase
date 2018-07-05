package simpleexpressions_exec.revisitor.operations.simpleexpressions_exec;

import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.SEBooleanExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.SEExpressionOperation;

@SuppressWarnings("all")
public interface SEBooleanUnaryExpressionOperation extends SEBooleanExpressionOperation, SEExpressionOperation {
  public abstract Object execute();
}
