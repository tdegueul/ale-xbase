package evalexp.revisitor.operations;

import evalexp.revisitor.operations.ExpOperation;

@SuppressWarnings("all")
public interface OrOperation extends ExpOperation {
  public abstract boolean eval();
}
