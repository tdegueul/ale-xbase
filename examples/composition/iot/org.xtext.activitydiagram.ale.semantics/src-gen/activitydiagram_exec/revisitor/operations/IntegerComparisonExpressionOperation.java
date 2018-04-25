package activitydiagram_exec.revisitor.operations;

import activitydiagram_exec.revisitor.operations.ExpressionOperation;
import activitydiagram_exec.revisitor.operations.IntegerExpressionOperation;
import activitydiagramruntime.Context;

@SuppressWarnings("all")
public interface IntegerComparisonExpressionOperation extends IntegerExpressionOperation, ExpressionOperation {
  public abstract void execute(final Context c);
}
