package multi_print.revisitor.operations.multi_print.impl;

import multi.A;
import multi.revisitor.MultiRevisitor;
import multi_print.revisitor.operations.multi_print.AOperation;
import multi_print.revisitor.operations.multi_print.BOperation;
import multi_print.revisitor.operations.multi_print.COperation;

@SuppressWarnings("all")
public class AOperationImpl implements AOperation {
  private A obj;
  
  private MultiRevisitor<? extends AOperation, ? extends BOperation, ? extends COperation, ? extends COperation, ? extends COperation> alg;
  
  public AOperationImpl(final A obj, final MultiRevisitor<? extends AOperation, ? extends BOperation, ? extends COperation, ? extends COperation, ? extends COperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public String fromA() {
    return "a";
  }
}
