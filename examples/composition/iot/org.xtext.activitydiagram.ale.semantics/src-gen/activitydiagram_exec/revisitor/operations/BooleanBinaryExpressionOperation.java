package activitydiagram_exec.revisitor.operations;

import activitydiagram_exec.revisitor.operations.BooleanExpressionOperation;
import activitydiagram_exec.revisitor.operations.ExpressionOperation;
import activitydiagramruntime.Context;

@SuppressWarnings("all")
public interface BooleanBinaryExpressionOperation extends BooleanExpressionOperation, ExpressionOperation {
  public abstract void execute(final Context c);
}
