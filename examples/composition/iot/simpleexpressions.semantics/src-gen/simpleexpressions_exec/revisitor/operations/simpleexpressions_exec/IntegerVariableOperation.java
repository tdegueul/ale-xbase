package simpleexpressions_exec.revisitor.operations.simpleexpressions_exec;

import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.VariableOperation;

@SuppressWarnings("all")
public interface IntegerVariableOperation extends VariableOperation {
  public abstract void execute();
  
  public abstract String print();
}
