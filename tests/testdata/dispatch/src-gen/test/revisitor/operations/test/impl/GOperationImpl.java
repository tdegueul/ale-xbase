package test.revisitor.operations.test.impl;

import dispatch.G;
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
public class GOperationImpl extends COperationImpl implements GOperation {
  private G obj;
  
  private DispatchRevisitor<AOperation, BOperation, COperation, ContainerOperation, DOperation, EOperation, FOperation, GOperation> alg;
  
  public GOperationImpl(final G obj, final DispatchRevisitor<AOperation, BOperation, COperation, ContainerOperation, DOperation, EOperation, FOperation, GOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
}
