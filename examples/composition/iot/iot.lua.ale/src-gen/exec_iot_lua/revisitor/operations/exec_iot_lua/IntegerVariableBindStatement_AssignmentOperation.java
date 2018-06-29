package exec_iot_lua.revisitor.operations.exec_iot_lua;

import activitydiagram.Value;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.IntegerVariableOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.VariableOperation;
import activitydiagramruntime.Context;

@SuppressWarnings("all")
public interface IntegerVariableBindStatement_AssignmentOperation extends IntegerVariableOperation, exec_iot_lua.revisitor.operations.exec_iot_lua.IntegerVariableOperation, VariableOperation, exec_iot_lua.revisitor.operations.exec_iot_lua.VariableOperation {
  public abstract Value execute(final Context c);
  
  public abstract void init(final Context c);
  
  public abstract String print();
  
  public abstract String name();
}
