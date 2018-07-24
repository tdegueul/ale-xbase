package exec_iot_lua.revisitor.operations.exec_iot_lua;

import activitydiagram.Context;
import activitydiagram.Value;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.BooleanVariableOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.VariableOperation;

@SuppressWarnings("all")
public interface BooleanVariableBindStatement_AssignmentOperation extends BooleanVariableOperation, exec_iot_lua.revisitor.operations.exec_iot_lua.BooleanVariableOperation, VariableOperation, exec_iot_lua.revisitor.operations.exec_iot_lua.VariableOperation {
  public abstract Value execute(final Context c);
  
  public abstract void init(final Context c);
  
  public abstract String print();
  
  public abstract String name();
}
