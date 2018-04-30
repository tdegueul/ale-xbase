package pingpongsem.revisitor.impl;

import ping.Ping;
import pingpongsem.PPingBindPing;
import pingpongsem.PongBindPPong;
import pingpongsem.revisitor.operations.pingpongsem.PPingBindPingOperation;
import pingpongsem.revisitor.operations.pingpongsem.PongBindPPongOperation;
import pingsem.revisitor.operations.pingsem.PingOperation;
import pingsem.revisitor.operations.pingsem.PongOperation;
import pong.PPong;
import pongsem.revisitor.operations.pongsem.PPingOperation;
import pongsem.revisitor.operations.pongsem.PPongOperation;

@SuppressWarnings("all")
public interface PingpongsemRevisitor extends pingpongsem.revisitor.PingpongsemRevisitor<PPingOperation, PPingBindPingOperation, PPongOperation, PingOperation, PongOperation, PongBindPPongOperation> {
  @Override
  public default PongBindPPongOperation pingpongsem__PongBindPPong(final PongBindPPong it) {
    return new pingpongsem.revisitor.operations.pingpongsem.impl.PongBindPPongOperationImpl(it, this);
  }
  
  @Override
  public default PPingBindPingOperation pingpongsem__PPingBindPing(final PPingBindPing it) {
    return new pingpongsem.revisitor.operations.pingpongsem.impl.PPingBindPingOperationImpl(it, this);
  }
  
  @Override
  public default PPongOperation pong__PPong(final PPong it) {
    return new pongsem.revisitor.operations.pongsem.impl.PPongOperationImpl(it, this);
  }
  
  @Override
  public default PingOperation ping__Ping(final Ping it) {
    return new pingsem.revisitor.operations.pingsem.impl.PingOperationImpl(it, this);
  }
}
