package simpleexpressions_exec.revisitor.operations;

import simpleexpressions.semantics.Context;

@SuppressWarnings("all")
public interface VariableOperation {
  public abstract void execute(final Context c);
  
  public abstract String print();
}