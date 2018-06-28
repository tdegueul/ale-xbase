package exec_iot_lua.revisitor.operations.exec_iot_lua;

import activitydiagram.Value;
import activitydiagramruntime.Context;
import exec_iot_lua.revisitor.operations.exec_iot_lua.IntegerVariableOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.VariableOperation;

@SuppressWarnings("all")
public interface IntegerVariableBindStatement_AssignmentOperation extends IntegerVariableOperation, activitydiagram_exec.revisitor.operations.activitydiagram_exec.IntegerVariableOperation, VariableOperation, activitydiagram_exec.revisitor.operations.activitydiagram_exec.VariableOperation {
  public abstract Value execute(final Context c);
  
  public abstract void init(final Context c);
  
  public abstract String print();
  
  public abstract String name();
}
