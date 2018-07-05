package simpleexpressions_exec.revisitor.operations.simpleexpressions_exec;

import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.SEExpressionOperation;

@SuppressWarnings("all")
public interface SEValueOperation extends SEExpressionOperation {
  public abstract Object execute();
}
