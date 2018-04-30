package pingpongsem.revisitor.operations.pingpongsem.impl;

import pingpongsem.PPingBindPing;
import pingpongsem.revisitor.PingpongsemRevisitor;
import pingpongsem.revisitor.operations.pingpongsem.PPingBindPingOperation;
import pingpongsem.revisitor.operations.pingpongsem.PongBindPPongOperation;
import pingsem.revisitor.operations.pingsem.PingOperation;
import pingsem.revisitor.operations.pingsem.PongOperation;
import pongsem.revisitor.operations.pongsem.PPingOperation;
import pongsem.revisitor.operations.pongsem.PPongOperation;

@SuppressWarnings("all")
public class PPingBindPingOperationImpl implements PPingBindPingOperation {
  private PPingBindPing obj;
  
  private PingpongsemRevisitor<PPingOperation, PPingBindPingOperation, PPongOperation, PingOperation, PongOperation, PongBindPPongOperation> alg;
  
  public PPingBindPingOperationImpl(final PPingBindPing obj, final PingpongsemRevisitor<PPingOperation, PPingBindPingOperation, PPongOperation, PingOperation, PongOperation, PongBindPPongOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void decrement() {
    alg.$(obj.getDelegate()).call();
  }
}
