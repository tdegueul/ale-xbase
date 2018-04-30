package pingpongsem.revisitor.operations.pingpongsem.impl;

import pingpongsem.PongBindPPong;
import pingpongsem.revisitor.PingpongsemRevisitor;
import pingpongsem.revisitor.operations.pingpongsem.PPingBindPingOperation;
import pingpongsem.revisitor.operations.pingpongsem.PongBindPPongOperation;
import pingsem.revisitor.operations.pingsem.PingOperation;
import pingsem.revisitor.operations.pingsem.PongOperation;
import pongsem.revisitor.operations.pongsem.PPingOperation;
import pongsem.revisitor.operations.pongsem.PPongOperation;

@SuppressWarnings("all")
public class PongBindPPongOperationImpl implements PongBindPPongOperation {
  private PongBindPPong obj;
  
  private PingpongsemRevisitor<PPingOperation, PPingBindPingOperation, PPongOperation, PingOperation, PongOperation, PongBindPPongOperation> alg;
  
  public PongBindPPongOperationImpl(final PongBindPPong obj, final PingpongsemRevisitor<PPingOperation, PPingBindPingOperation, PPongOperation, PingOperation, PongOperation, PongBindPPongOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void call(final Integer value) {
    alg.$(obj.getDelegate()).exec();
  }
}
