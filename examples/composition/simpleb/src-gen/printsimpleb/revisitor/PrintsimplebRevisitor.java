package printsimpleb.revisitor;

import printsimpleb.revisitor.operations.B1Operation;
import simpleb.B1;
import simpleb.revisitor.SimplebRevisitor;

@SuppressWarnings("all")
public interface PrintsimplebRevisitor extends SimplebRevisitor<B1Operation> {
  @Override
  public default B1Operation b1(final B1 it) {
    return new printsimpleb.revisitor.operations.impl.B1OperationImpl(it, this);
  }
}
