package activitydiagram_exec.revisitor.operations.activitydiagram_exec;

import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ValueOperation;

@SuppressWarnings("all")
public interface BooleanValueOperation extends ValueOperation {
  public abstract Object value();
  
  public abstract void setValue(final Object value);
}
