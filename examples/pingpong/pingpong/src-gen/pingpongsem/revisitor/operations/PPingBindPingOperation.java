package pingpongsem.revisitor.operations;

import pongsem.revisitor.operations.PPingOperation;

@SuppressWarnings("all")
public interface PPingBindPingOperation extends PPingOperation {
  public abstract void decrement();
}
