package iotlua.revisitor.operations.iotlua;

import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ExpressionOperation;
import activitydiagramruntime.Context;

@SuppressWarnings("all")
public interface ExpressionBindStatementOperation extends ExpressionOperation {
  public abstract void execute(final Context c);
}
