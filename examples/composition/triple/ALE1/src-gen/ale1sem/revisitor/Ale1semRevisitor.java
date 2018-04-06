package ale1sem.revisitor;

import ale1.A1;
import ale1.revisitor.Ale1Revisitor;
import ale1sem.revisitor.operations.A1Operation;
import ale1sem.revisitor.operations.RA1Operation;
import ale1sem.revisitor.operations.RA2Operation;

@SuppressWarnings("all")
public interface Ale1semRevisitor extends Ale1Revisitor<A1Operation, RA1Operation, RA2Operation> {
  @Override
  public default A1Operation a1(final A1 it) {
    return new ale1sem.revisitor.operations.impl.A1OperationImpl(it, this);
  }
}
