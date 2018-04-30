package composeabprint.revisitor.operations.impl;

import composeabprint.BBind;
import composeabprint.revisitor.ComposeabprintRevisitor;
import composeabprint.revisitor.operations.BBindOperation;
import printsimplea.revisitor.operations.AOperation;
import printsimplea.revisitor.operations.BOperation;
import printsimpleb.revisitor.operations.B1Operation;

@SuppressWarnings("all")
public class BBindOperationImpl implements BBindOperation {
  private BBind obj;
  
  private ComposeabprintRevisitor<AOperation, BOperation, B1Operation, BBindOperation> alg;
  
  public BBindOperationImpl(final BBind obj, final ComposeabprintRevisitor<AOperation, BOperation, B1Operation, BBindOperation> alg) {
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
