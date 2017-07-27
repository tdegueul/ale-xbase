package execad.revisitor.operations;

import activitydiagram.Variable;
import execad.revisitor.operations.ExpressionOperation;

@SuppressWarnings("all")
public interface BooleanExpressionOperation extends ExpressionOperation {
  public abstract boolean getCurrentValue(final Variable variable);
  
  public abstract void assignValue(final boolean value);
}
