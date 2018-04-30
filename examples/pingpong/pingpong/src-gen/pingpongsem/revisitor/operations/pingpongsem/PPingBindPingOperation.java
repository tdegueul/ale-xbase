package pingpongsem.revisitor.operations.pingpongsem;

import pongsem.revisitor.operations.pongsem.PPingOperation;

@SuppressWarnings("all")
public interface PPingBindPingOperation extends PPingOperation {
  public abstract void decrement();
}
