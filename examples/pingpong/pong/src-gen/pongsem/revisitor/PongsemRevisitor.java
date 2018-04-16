package pongsem.revisitor;

import pong.PPong;
import pong.revisitor.PongRevisitor;
import pongsem.revisitor.operations.PPingOperation;
import pongsem.revisitor.operations.PPongOperation;

@SuppressWarnings("all")
public interface PongsemRevisitor extends PongRevisitor<PPingOperation, PPongOperation> {
  @Override
  public default PPongOperation pPong(final PPong it) {
    return new pongsem.revisitor.operations.impl.PPongOperationImpl(it, this);
  }
}
