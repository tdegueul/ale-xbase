package simpleexpressions_exec.revisitor.operations.simpleexpressions_exec;

import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.SEExpressionOperation;

@SuppressWarnings("all")
public interface SEVariableOperation extends SEExpressionOperation {
  public abstract String print();
  
  public abstract void init();
  
  public abstract Object execute();
}
