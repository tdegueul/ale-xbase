package execad.revisitor.operations;

import execad.revisitor.operations.ExpressionOperation;
import execad.revisitor.operations.IntegerExpressionOperation;

@SuppressWarnings("all")
public interface IntegerCalculationExpressionOperation extends IntegerExpressionOperation, ExpressionOperation {
  public abstract void execute();
}
