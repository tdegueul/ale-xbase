package simpleexpressions_exec.revisitor.operations;

import simpleexpressions.semantics.Context;

@SuppressWarnings("all")
public interface ExpressionOperation {
  public abstract void execute(final Context c);
}
