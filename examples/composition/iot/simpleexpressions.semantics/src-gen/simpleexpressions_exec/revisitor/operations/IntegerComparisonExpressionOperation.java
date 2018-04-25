package simpleexpressions_exec.revisitor.operations;

import simpleexpressions.semantics.Context;
import simpleexpressions_exec.revisitor.operations.ExpressionOperation;
import simpleexpressions_exec.revisitor.operations.IntegerExpressionOperation;

@SuppressWarnings("all")
public interface IntegerComparisonExpressionOperation extends IntegerExpressionOperation, ExpressionOperation {
  public abstract void execute(final Context c);
}
