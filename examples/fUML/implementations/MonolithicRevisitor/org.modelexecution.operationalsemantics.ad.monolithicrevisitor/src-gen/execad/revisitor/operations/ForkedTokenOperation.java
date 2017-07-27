package execad.revisitor.operations;

import execad.revisitor.operations.TokenOperation;

@SuppressWarnings("all")
public interface ForkedTokenOperation extends TokenOperation {
  public abstract void withdraw();
}
