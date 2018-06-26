package multi_print.revisitor.impl;

import multi.A;
import multi.B;
import multi.C;
import multi.revisitor.MultiRevisitor;
import multi_print.revisitor.operations.multi_print.AOperation;
import multi_print.revisitor.operations.multi_print.BOperation;
import multi_print.revisitor.operations.multi_print.COperation;

@SuppressWarnings("all")
public interface Multi_printRevisitor extends MultiRevisitor<AOperation, BOperation, COperation, COperation, COperation> {
  @Override
  public default AOperation multi__A(final A it) {
    return new multi_print.revisitor.operations.multi_print.impl.AOperationImpl(it, this);
  }
  
  @Override
  public default BOperation multi__B(final B it) {
    return new multi_print.revisitor.operations.multi_print.impl.BOperationImpl(it, this);
  }
  
  @Override
  public default COperation multi__C(final C it) {
    return new multi_print.revisitor.operations.multi_print.impl.COperationImpl(it, this);
  }
  
  @Override
  public default COperation multi__C__as__multi__A(final C it) {
    return new multi_print.revisitor.operations.multi_print.impl.COperationImpl(it, this);
  }
  
  @Override
  public default COperation multi__C__as__multi__B(final C it) {
    return new multi_print.revisitor.operations.multi_print.impl.COperationImpl(it, this);
  }
}
