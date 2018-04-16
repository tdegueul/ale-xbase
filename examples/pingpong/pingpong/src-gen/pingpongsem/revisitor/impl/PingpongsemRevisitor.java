package pingpongsem.revisitor.impl;

import ping.Ping;
import pingpongsem.PPingBindPing;
import pingpongsem.PongBindPPong;
import pingpongsem.revisitor.operations.PPingBindPingOperation;
import pingpongsem.revisitor.operations.PongBindPPongOperation;
import pingsem.revisitor.operations.PingOperation;
import pingsem.revisitor.operations.PongOperation;
import pong.PPong;
import pongsem.revisitor.operations.PPingOperation;
import pongsem.revisitor.operations.PPongOperation;

@SuppressWarnings("all")
public interface PingpongsemRevisitor extends pingpongsem.revisitor.PingpongsemRevisitor<PPingOperation, PPingBindPingOperation, PPongOperation, PingOperation, PongOperation, PongBindPPongOperation> {
  @Override
  public default PPingBindPingOperation pPingBindPing(final PPingBindPing it) {
    return new pingpongsem.revisitor.operations.impl.PPingBindPingOperationImpl(it, this);
  }
  
  @Override
  public default PPongOperation pPong(final PPong it) {
    return new pongsem.revisitor.operations.impl.PPongOperationImpl(it, this);
  }
  
  @Override
  public default PingOperation ping(final Ping it) {
    return new pingsem.revisitor.operations.impl.PingOperationImpl(it, this);
  }
  
  @Override
  public default PongBindPPongOperation pongBindPPong(final PongBindPPong it) {
    return new pingpongsem.revisitor.operations.impl.PongBindPPongOperationImpl(it, this);
  }
}
