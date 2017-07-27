package execad.revisitor.operations;

import activitydiagram.Value;

@SuppressWarnings("all")
public interface VariableOperation {
  public abstract Value getCurrentValue();
  
  public abstract void setCurrentValue(final Value value);
}
