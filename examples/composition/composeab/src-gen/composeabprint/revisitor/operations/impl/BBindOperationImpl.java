package composeabprint.revisitor.operations.impl;

import composeabprint.BBind;
import composeabprint.revisitor.ComposeabprintRevisitor;
import composeabprint.revisitor.operations.BBindOperation;
import printsimplea.revisitor.operations.AOperation;
import printsimplea.revisitor.operations.BOperation;
import printsimpleb.revisitor.operations.B1Operation;

@SuppressWarnings("all")
public class BBindOperationImpl implements BBindOperation {
  private BBind self;
  
  private ComposeabprintRevisitor<AOperation, BOperation, B1Operation, BBindOperation> alg;
  
  public BBindOperationImpl(final BBind self, final ComposeabprintRevisitor<AOperation, BOperation, B1Operation, BBindOperation> alg) {
    this.self = self;
    this.alg = alg;
  }
  
  @Override
  public void call() {
    alg.$(self.getDelegate()).name();
  }
}
