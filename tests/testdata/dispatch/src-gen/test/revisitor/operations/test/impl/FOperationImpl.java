package test.revisitor.operations.test.impl;

import dispatch.F;
import dispatch.revisitor.DispatchRevisitor;
import test.revisitor.operations.test.AOperation;
import test.revisitor.operations.test.BOperation;
import test.revisitor.operations.test.COperation;
import test.revisitor.operations.test.ContainerOperation;
import test.revisitor.operations.test.DOperation;
import test.revisitor.operations.test.EOperation;
import test.revisitor.operations.test.FOperation;
import test.revisitor.operations.test.GOperation;
import test.revisitor.operations.test.impl.COperationImpl;

@SuppressWarnings("all")
public class FOperationImpl extends COperationImpl implements FOperation {
  private F obj;
  
  private DispatchRevisitor<AOperation, BOperation, COperation, ContainerOperation, DOperation, EOperation, FOperation, GOperation> alg;
  
  public FOperationImpl(final F obj, final DispatchRevisitor<AOperation, BOperation, COperation, ContainerOperation, DOperation, EOperation, FOperation, GOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
}
