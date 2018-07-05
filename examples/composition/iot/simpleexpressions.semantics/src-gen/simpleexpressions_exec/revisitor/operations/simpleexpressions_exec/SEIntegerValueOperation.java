package simpleexpressions_exec.revisitor.operations.simpleexpressions_exec;

import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.SEExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.SEValueOperation;

@SuppressWarnings("all")
public interface SEIntegerValueOperation extends SEValueOperation, SEExpressionOperation {
  public abstract Object execute();
}
