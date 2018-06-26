package exec_iot_lua.revisitor.operations.exec_iot_lua;

import activitydiagramruntime.Context;
import exec_iot_lua.revisitor.operations.exec_iot_lua.ExpOperation;

@SuppressWarnings("all")
public interface ExpressionBindStatementOperation extends ExpOperation, activitydiagram_exec.revisitor.operations.activitydiagram_exec.ExpOperation {
  public abstract void execute(final Context c);
}
