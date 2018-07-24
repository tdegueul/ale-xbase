package exec_iot_lua.revisitor.operations.exec_iot_lua;

import activitydiagram.Context;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ExpOperation;

@SuppressWarnings("all")
public interface ExpressionBindOperationDefOperation extends ExpOperation, exec_iot_lua.revisitor.operations.exec_iot_lua.ExpOperation {
  public abstract void execute(final Context c);
}
