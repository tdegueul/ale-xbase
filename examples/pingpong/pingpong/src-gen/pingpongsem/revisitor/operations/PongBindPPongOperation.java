package pingpongsem.revisitor.operations;

import pingsem.revisitor.operations.PongOperation;

@SuppressWarnings("all")
public interface PongBindPPongOperation extends PongOperation {
  public abstract void call(final Integer value);
}
