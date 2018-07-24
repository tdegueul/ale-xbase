package iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec;

import activitydiagram.Context;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ExpOperation;

@SuppressWarnings("all")
public interface ExpressionBindSEExpressionOperation extends ExpOperation, activitydiagram_exec.revisitor.operations.activitydiagram_exec.ExpOperation {
  public abstract void execute(final Context c);
}
