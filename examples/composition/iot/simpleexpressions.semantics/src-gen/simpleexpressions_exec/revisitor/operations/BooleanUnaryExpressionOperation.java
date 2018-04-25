package simpleexpressions_exec.revisitor.operations;

import simpleexpressions.semantics.Context;
import simpleexpressions_exec.revisitor.operations.BooleanExpressionOperation;
import simpleexpressions_exec.revisitor.operations.ExpressionOperation;

@SuppressWarnings("all")
public interface BooleanUnaryExpressionOperation extends BooleanExpressionOperation, ExpressionOperation {
  public abstract void execute(final Context c);
}
