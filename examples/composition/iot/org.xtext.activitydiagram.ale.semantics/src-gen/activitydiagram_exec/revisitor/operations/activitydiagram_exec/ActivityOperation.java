package activitydiagram_exec.revisitor.operations.activitydiagram_exec;

import activitydiagram.Context;
import activitydiagram.InputValue;
import activitydiagram.Value;
import activitydiagram.Variable;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.NamedActivityOperation;
import java.util.List;

@SuppressWarnings("all")
public interface ActivityOperation extends NamedActivityOperation {
  public abstract void main(final List<InputValue> value);
  
  public abstract void execute(final Context c);
  
  public abstract void reset(final Context c);
  
  public abstract void writeToFile(final Context c);
  
  public abstract String printTrace(final Context c);
  
  public abstract double getIntegerVariableValue(final String variableName);
  
  public abstract boolean getBooleanVariableValue(final String variableName);
  
  public abstract Value getVariableValue(final String variableName);
  
  public abstract Variable getVariable(final String variableName);
  
  public abstract void writeTrace(final Context c);
}
