package execad.revisitor.operations;

import activitydiagram.Variable;
import execad.revisitor.operations.ExpressionOperation;

@SuppressWarnings("all")
public interface IntegerExpressionOperation extends ExpressionOperation {
  public abstract int getCurrentValue(final Variable variable);
}
