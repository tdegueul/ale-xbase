package pongsem.revisitor;

import pong.PPong;
import pong.revisitor.PongRevisitor;
import pongsem.revisitor.operations.pongsem.PPingOperation;
import pongsem.revisitor.operations.pongsem.PPongOperation;

@SuppressWarnings("all")
public interface PongsemRevisitor extends PongRevisitor<PPingOperation, PPongOperation> {
  @Override
  public default PPongOperation pong__PPong(final PPong it) {
    return new pongsem.revisitor.operations.pongsem.impl.PPongOperationImpl(it, this);
  }
}
