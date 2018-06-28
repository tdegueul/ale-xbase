package activitydiagram_exec.revisitor.operations.activitydiagram_exec;

import activitydiagram.Value;
import activitydiagramruntime.Context;

@SuppressWarnings("all")
public interface VariableOperation {
  public abstract Value execute(final Context c);
  
  public abstract void init(final Context c);
  
  public abstract String print();
  
  public abstract String name();
}
