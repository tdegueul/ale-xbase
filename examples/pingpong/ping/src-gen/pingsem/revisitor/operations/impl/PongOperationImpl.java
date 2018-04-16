package pingsem.revisitor.operations.impl;

import ping.Pong;
import ping.revisitor.PingRevisitor;
import pingsem.revisitor.operations.PingOperation;
import pingsem.revisitor.operations.PongOperation;

@SuppressWarnings("all")
public abstract class PongOperationImpl implements PongOperation {
  private Pong obj;
  
  private PingRevisitor<PingOperation, PongOperation> alg;
  
  public PongOperationImpl(final Pong obj, final PingRevisitor<PingOperation, PongOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
}
