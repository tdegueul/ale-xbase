package simpleexpressions_exec.revisitor.operations.simpleexpressions_exec;

import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.SEExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.SEVariableOperation;

@SuppressWarnings("all")
public interface SEIntegerVariableOperation extends SEVariableOperation, SEExpressionOperation {
  public abstract void init();
  
  public abstract Object execute();
  
  public abstract String print();
}
