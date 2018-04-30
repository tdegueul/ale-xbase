package pingpongsem.revisitor.operations.impl;

import pingpongsem.PPingBindPing;
import pingpongsem.revisitor.PingpongsemRevisitor;
import pingpongsem.revisitor.operations.PPingBindPingOperation;
import pingpongsem.revisitor.operations.PongBindPPongOperation;
import pingsem.revisitor.operations.PingOperation;
import pingsem.revisitor.operations.PongOperation;
import pongsem.revisitor.operations.PPingOperation;
import pongsem.revisitor.operations.PPongOperation;

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
