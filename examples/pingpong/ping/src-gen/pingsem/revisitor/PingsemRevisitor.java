package pingsem.revisitor;

import ping.Ping;
import ping.revisitor.PingRevisitor;
import pingsem.revisitor.operations.PingOperation;
import pingsem.revisitor.operations.PongOperation;

@SuppressWarnings("all")
public interface PingsemRevisitor extends PingRevisitor<PingOperation, PongOperation> {
  @Override
  public default PingOperation ping(final Ping it) {
    return new pingsem.revisitor.operations.impl.PingOperationImpl(it, this);
  }
}
