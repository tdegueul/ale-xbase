package iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec;

import activitydiagram.Context;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ExpOperation;

@SuppressWarnings("all")
public interface ExpressionBindOperationDefOperation extends ExpOperation, iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ExpOperation {
  public abstract void execute(final Context c);
}
