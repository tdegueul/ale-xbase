package execad.revisitor.operations;

import execad.revisitor.operations.BooleanExpressionOperation;
import execad.revisitor.operations.ExpressionOperation;

@SuppressWarnings("all")
public interface BooleanUnaryExpressionOperation extends BooleanExpressionOperation, ExpressionOperation {
  public abstract void execute();
}
