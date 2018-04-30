package pingsem.revisitor;

import ping.Ping;
import ping.revisitor.PingRevisitor;
import pingsem.revisitor.operations.pingsem.PingOperation;
import pingsem.revisitor.operations.pingsem.PongOperation;

@SuppressWarnings("all")
public interface PingsemRevisitor extends PingRevisitor<PingOperation, PongOperation> {
  @Override
  public default PingOperation ping__Ping(final Ping it) {
    return new pingsem.revisitor.operations.pingsem.impl.PingOperationImpl(it, this);
  }
}
