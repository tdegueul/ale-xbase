package ale2sem.revisitor;

import ale2.B;
import ale2.revisitor.Ale2Revisitor;
import ale2sem.revisitor.operations.BOperation;
import ale2sem.revisitor.operations.RBOperation;

@SuppressWarnings("all")
public interface Ale2semRevisitor extends Ale2Revisitor<BOperation, RBOperation> {
  @Override
  public default BOperation b(final B it) {
    return new ale2sem.revisitor.operations.impl.BOperationImpl(it, this);
  }
}
