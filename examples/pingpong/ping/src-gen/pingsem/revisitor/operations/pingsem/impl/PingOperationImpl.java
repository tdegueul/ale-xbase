package pingsem.revisitor.operations.pingsem.impl;

import org.eclipse.xtext.xbase.lib.InputOutput;
import ping.Ping;
import ping.revisitor.PingRevisitor;
import pingsem.revisitor.operations.pingsem.PingOperation;
import pingsem.revisitor.operations.pingsem.PongOperation;

@SuppressWarnings("all")
public class PingOperationImpl implements PingOperation {
  private Ping obj;
  
  private PingRevisitor<PingOperation, PongOperation> alg;
  
  public PingOperationImpl(final Ping obj, final PingRevisitor<PingOperation, PongOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void call() {
    InputOutput.<String>println("Ping");
    int _cptr = this.obj.getCptr();
    boolean _greaterThan = (_cptr > 0);
    if (_greaterThan) {
      int _cptr_1 = this.obj.getCptr();
      int _minus = (_cptr_1 - 1);
      this.obj.setCptr(_minus);
      this.alg.$(this.obj.getPong()).call(Integer.valueOf(this.obj.getCptr()));
    }
  }
}
