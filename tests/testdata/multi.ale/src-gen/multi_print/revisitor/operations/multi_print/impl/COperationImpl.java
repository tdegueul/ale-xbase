package multi_print.revisitor.operations.multi_print.impl;

import multi.C;
import multi.revisitor.MultiRevisitor;
import multi_print.revisitor.operations.multi_print.AOperation;
import multi_print.revisitor.operations.multi_print.BOperation;
import multi_print.revisitor.operations.multi_print.COperation;
import multi_print.revisitor.operations.multi_print.impl.AOperationImpl;

@SuppressWarnings("all")
public class COperationImpl extends AOperationImpl implements COperation {
  private C obj;
  
  private MultiRevisitor<? extends AOperation, ? extends BOperation, ? extends COperation, ? extends COperation, ? extends COperation> alg;
  
  public COperationImpl(final C obj, final MultiRevisitor<? extends AOperation, ? extends BOperation, ? extends COperation, ? extends COperation, ? extends COperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public String fromA() {
    return "c";
  }
  
  @Override
  public Long fromB() {
    return Long.valueOf(55L);
  }
}
