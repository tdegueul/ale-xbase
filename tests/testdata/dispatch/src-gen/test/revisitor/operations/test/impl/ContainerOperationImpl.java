package test.revisitor.operations.test.impl;

import dispatch.Container;
import dispatch.revisitor.DispatchRevisitor;
import test.revisitor.operations.test.AOperation;
import test.revisitor.operations.test.BOperation;
import test.revisitor.operations.test.COperation;
import test.revisitor.operations.test.ContainerOperation;
import test.revisitor.operations.test.DOperation;
import test.revisitor.operations.test.EOperation;
import test.revisitor.operations.test.FOperation;
import test.revisitor.operations.test.GOperation;

@SuppressWarnings("all")
public class ContainerOperationImpl implements ContainerOperation {
  private Container obj;
  
  private DispatchRevisitor<AOperation, BOperation, COperation, ContainerOperation, DOperation, EOperation, FOperation, GOperation> alg;
  
  public ContainerOperationImpl(final Container obj, final DispatchRevisitor<AOperation, BOperation, COperation, ContainerOperation, DOperation, EOperation, FOperation, GOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
}
