package pingpongsem.revisitor.operations.impl;

import pingpongsem.PongBindPPong;
import pingpongsem.revisitor.PingpongsemRevisitor;
import pingpongsem.revisitor.operations.PPingBindPingOperation;
import pingpongsem.revisitor.operations.PongBindPPongOperation;
import pingsem.revisitor.operations.PingOperation;
import pingsem.revisitor.operations.PongOperation;
import pingsem.revisitor.operations.impl.PongOperationImpl;
import pongsem.revisitor.operations.PPingOperation;
import pongsem.revisitor.operations.PPongOperation;

@SuppressWarnings("all")
public class PongBindPPongOperationImpl extends PongOperationImpl implements PongBindPPongOperation {
  private PongBindPPong obj;
  
  private PingpongsemRevisitor<PPingOperation, PPingBindPingOperation, PPongOperation, PingOperation, PongOperation, PongBindPPongOperation> alg;
  
  public PongBindPPongOperationImpl(final PongBindPPong obj, final PingpongsemRevisitor<PPingOperation, PPingBindPingOperation, PPongOperation, PingOperation, PongOperation, PongBindPPongOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void call(final Integer value) {
    convert.PongToPPong convert =  new convert.PongToPPong();
    convert.setInputvalue(value);
    
    convert.doInit();
    
    alg.$(obj.getDelegate()).exec();
    
    convert.doInverse(convert.conversionvalue());
    
  }
}
