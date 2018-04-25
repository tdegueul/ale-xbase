package activitydiagram_exec.revisitor.operations;

import activitydiagramruntime.Context;

@SuppressWarnings("all")
public interface ExpressionOperation {
  public abstract void execute(final Context c);
}
