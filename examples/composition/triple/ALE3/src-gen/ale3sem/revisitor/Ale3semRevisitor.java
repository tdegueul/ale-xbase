package ale3sem.revisitor;

import ale3.C1;
import ale3.C2;
import ale3.revisitor.Ale3Revisitor;
import ale3sem.revisitor.operations.C1Operation;
import ale3sem.revisitor.operations.C2Operation;

@SuppressWarnings("all")
public interface Ale3semRevisitor extends Ale3Revisitor<C1Operation, C2Operation> {
  @Override
  public default C1Operation c1(final C1 it) {
    return new ale3sem.revisitor.operations.impl.C1OperationImpl(it, this);
  }
  
  @Override
  public default C2Operation c2(final C2 it) {
    return new ale3sem.revisitor.operations.impl.C2OperationImpl(it, this);
  }
}
