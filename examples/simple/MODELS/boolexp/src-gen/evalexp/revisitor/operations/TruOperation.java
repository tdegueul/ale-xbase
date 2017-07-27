package evalexp.revisitor.operations;

import evalexp.revisitor.operations.ExpOperation;

@SuppressWarnings("all")
public interface TruOperation extends ExpOperation {
  public abstract boolean eval();
}
