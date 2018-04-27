package test.revisitor;

import dispatch.A;
import dispatch.B;
import dispatch.C;
import dispatch.Container;
import dispatch.D;
import dispatch.E;
import dispatch.F;
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

@SuppressWarnings("all")
public interface TestRevisitor extends DispatchRevisitor<AOperation, BOperation, COperation, ContainerOperation, DOperation, EOperation, FOperation, GOperation> {
  @Override
  public default AOperation dispatch__A(final A it) {
    return new test.revisitor.operations.test.impl.AOperationImpl(it, this);
  }
  
  @Override
  public default BOperation dispatch__B(final B it) {
    return new test.revisitor.operations.test.impl.BOperationImpl(it, this);
  }
  
  @Override
  public default COperation dispatch__C(final C it) {
    return new test.revisitor.operations.test.impl.COperationImpl(it, this);
  }
  
  @Override
  public default ContainerOperation dispatch__Container(final Container it) {
    return new test.revisitor.operations.test.impl.ContainerOperationImpl(it, this);
  }
  
  @Override
  public default DOperation dispatch__D(final D it) {
    return new test.revisitor.operations.test.impl.DOperationImpl(it, this);
  }
  
  @Override
  public default EOperation dispatch__E(final E it) {
    return new test.revisitor.operations.test.impl.EOperationImpl(it, this);
  }
  
  @Override
  public default FOperation dispatch__F(final F it) {
    return new test.revisitor.operations.test.impl.FOperationImpl(it, this);
  }
  
  @Override
  public default GOperation dispatch__G(final G it) {
    return new test.revisitor.operations.test.impl.GOperationImpl(it, this);
  }
}
