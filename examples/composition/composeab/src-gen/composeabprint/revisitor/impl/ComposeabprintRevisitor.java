package composeabprint.revisitor.impl;

import composeabprint.BBindB1;
import composeabprint.revisitor.operations.composeabprint.BBindB1Operation;
import printsimplea.revisitor.operations.printsimplea.AOperation;
import printsimplea.revisitor.operations.printsimplea.BOperation;
import printsimpleb.revisitor.operations.printsimpleb.B1Operation;
import simplea.A;
import simpleb.B1;

@SuppressWarnings("all")
public interface ComposeabprintRevisitor extends composeabprint.revisitor.ComposeabprintRevisitor<AOperation, BOperation, B1Operation, BBindB1Operation> {
  @Override
  public default BBindB1Operation composeabprint__BBindB1(final BBindB1 it) {
    return new composeabprint.revisitor.operations.composeabprint.impl.BBindB1OperationImpl(it, this);
  }
  
  @Override
  public default AOperation simplea__A(final A it) {
    return new printsimplea.revisitor.operations.printsimplea.impl.AOperationImpl(it, this);
  }
  
  @Override
  public default B1Operation simpleb__B1(final B1 it) {
    return new printsimpleb.revisitor.operations.printsimpleb.impl.B1OperationImpl(it, this);
  }
}
