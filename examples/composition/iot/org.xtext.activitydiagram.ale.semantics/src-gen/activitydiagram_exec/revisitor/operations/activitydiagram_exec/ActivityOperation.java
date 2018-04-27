package activitydiagram_exec.revisitor.operations.activitydiagram_exec;

import activitydiagram.InputValue;
import activitydiagram.Value;
import activitydiagram.Variable;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.NamedElementOperation;
import activitydiagramruntime.Context;
import activitydiagramruntime.Trace;
import java.util.List;

@SuppressWarnings("all")
public interface ActivityOperation extends NamedElementOperation {
  public abstract Trace trace();
  
  public abstract void main(final List<InputValue> value);
  
  public abstract void execute(final Context c);
  
  public abstract void reset(final Context c);
  
  public abstract void writeToFile(final Context c);
  
  public abstract String printTrace(final Context c);
  
  public abstract int getIntegerVariableValue(final String variableName);
  
  public abstract boolean getBooleanVariableValue(final String variableName);
  
  public abstract Value getVariableValue(final String variableName);
  
  public abstract Variable getVariable(final String variableName);
  
  public abstract void writeTrace(final Context c);
}
