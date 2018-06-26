package multi_print.revisitor.operations.multi_print.impl;

import multi.B;
import multi.revisitor.MultiRevisitor;
import multi_print.revisitor.operations.multi_print.AOperation;
import multi_print.revisitor.operations.multi_print.BOperation;
import multi_print.revisitor.operations.multi_print.COperation;

@SuppressWarnings("all")
public class BOperationImpl implements BOperation {
  private B obj;
  
  private MultiRevisitor<? extends AOperation, ? extends BOperation, ? extends COperation, ? extends COperation, ? extends COperation> alg;
  
  public BOperationImpl(final B obj, final MultiRevisitor<? extends AOperation, ? extends BOperation, ? extends COperation, ? extends COperation, ? extends COperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public Long fromB() {
    return Long.valueOf(42L);
  }
}
