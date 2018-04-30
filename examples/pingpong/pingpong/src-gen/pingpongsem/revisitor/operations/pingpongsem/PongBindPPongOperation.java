package pingpongsem.revisitor.operations.pingpongsem;

import pingsem.revisitor.operations.pingsem.PongOperation;

@SuppressWarnings("all")
public interface PongBindPPongOperation extends PongOperation {
  public abstract void call(final Integer value);
}
