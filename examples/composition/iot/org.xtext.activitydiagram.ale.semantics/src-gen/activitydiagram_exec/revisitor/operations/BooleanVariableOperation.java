package activitydiagram_exec.revisitor.operations;

import activitydiagram_exec.revisitor.operations.VariableOperation;
import activitydiagramruntime.Context;

@SuppressWarnings("all")
public interface BooleanVariableOperation extends VariableOperation {
  public abstract void execute(final Context c);
  
  public abstract String print();
}
