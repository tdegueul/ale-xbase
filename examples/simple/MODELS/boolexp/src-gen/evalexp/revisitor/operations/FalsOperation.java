package evalexp.revisitor.operations;

import evalexp.revisitor.operations.ExpOperation;

@SuppressWarnings("all")
public interface FalsOperation extends ExpOperation {
  public abstract boolean eval();
}
