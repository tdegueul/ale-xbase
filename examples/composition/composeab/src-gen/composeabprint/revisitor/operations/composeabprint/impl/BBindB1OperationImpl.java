package composeabprint.revisitor.operations.composeabprint.impl;

import composeabprint.BBindB1;
import composeabprint.revisitor.ComposeabprintRevisitor;
import composeabprint.revisitor.operations.composeabprint.BBindB1Operation;
import printsimplea.revisitor.operations.printsimplea.AOperation;
import printsimplea.revisitor.operations.printsimplea.BOperation;
import printsimpleb.revisitor.operations.printsimpleb.B1Operation;

@SuppressWarnings("all")
public class BBindB1OperationImpl implements BBindB1Operation {
  private BBindB1 obj;
  
  private ComposeabprintRevisitor<AOperation, BOperation, B1Operation, BBindB1Operation> alg;
  
  public BBindB1OperationImpl(final BBindB1 obj, final ComposeabprintRevisitor<AOperation, BOperation, B1Operation, BBindB1Operation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void call() {
    alg.$(obj.getDelegate()).name2();
  }
  
  @Override
  public void callWithArg(final String value) {
    alg.$(obj.getDelegate()).receiverWithParam(value);
  }
}
