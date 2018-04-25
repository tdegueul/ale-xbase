package simpleexpressions_exec.revisitor.operations;

import simpleexpressions.semantics.Context;
import simpleexpressions_exec.revisitor.operations.VariableOperation;

@SuppressWarnings("all")
public interface IntegerVariableOperation extends VariableOperation {
  public abstract void execute(final Context c);
  
  public abstract String print();
}
