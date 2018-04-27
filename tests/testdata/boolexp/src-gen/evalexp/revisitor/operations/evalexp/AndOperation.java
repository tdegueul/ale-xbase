package evalexp.revisitor.operations.evalexp;

import evalexp.revisitor.operations.evalexp.BinaryExpOperation;
import evalexp.revisitor.operations.evalexp.ExpOperation;

@SuppressWarnings("all")
public interface AndOperation extends BinaryExpOperation, ExpOperation {
  public abstract boolean eval();
}
