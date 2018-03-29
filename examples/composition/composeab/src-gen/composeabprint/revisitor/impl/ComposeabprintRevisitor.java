package composeabprint.revisitor.impl;

import composeabprint.BBind;
import composeabprint.revisitor.operations.BBindOperation;
import printsimplea.revisitor.operations.AOperation;
import printsimplea.revisitor.operations.BOperation;
import printsimpleb.revisitor.operations.B1Operation;
import simplea.A;
import simpleb.B1;

@SuppressWarnings("all")
public interface ComposeabprintRevisitor extends composeabprint.revisitor.ComposeabprintRevisitor<AOperation, BOperation, B1Operation, BBindOperation> {
  @Override
  public default AOperation a(final A it) {
    return new printsimplea.revisitor.operations.impl.AOperationImpl(it, this);
  }
  
  @Override
  public default B1Operation b1(final B1 it) {
    return new printsimpleb.revisitor.operations.impl.B1OperationImpl(it, this);
  }
  
  @Override
  public default BBindOperation bBind(final BBind it) {
    return new composeabprint.revisitor.operations.impl.BBindOperationImpl(it, this);
  }
}
