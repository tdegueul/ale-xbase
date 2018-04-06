package brew.revisitor.impl;

import ale1.A1;
import ale1sem.revisitor.operations.A1Operation;
import ale1sem.revisitor.operations.RA1Operation;
import ale1sem.revisitor.operations.RA2Operation;
import ale2.B;
import ale2sem.revisitor.operations.BOperation;
import ale2sem.revisitor.operations.RBOperation;
import ale3.C1;
import ale3.C2;
import ale3sem.revisitor.operations.C1Operation;
import ale3sem.revisitor.operations.C2Operation;
import brew.RA1BindB;
import brew.RA2BindC1;
import brew.RBBindC1;
import brew.RBBindC2;
import brew.revisitor.operations.RA1BindBOperation;
import brew.revisitor.operations.RA2BindC1Operation;
import brew.revisitor.operations.RBBindC1Operation;
import brew.revisitor.operations.RBBindC2Operation;

@SuppressWarnings("all")
public interface BrewRevisitor extends brew.revisitor.BrewRevisitor<A1Operation, BOperation, C1Operation, C2Operation, RA1Operation, RA1BindBOperation, RA2Operation, RA2BindC1Operation, RBOperation, RBBindC1Operation, RBBindC2Operation> {
  @Override
  public default A1Operation a1(final A1 it) {
    return new ale1sem.revisitor.operations.impl.A1OperationImpl(it, this);
  }
  
  @Override
  public default BOperation b(final B it) {
    return new ale2sem.revisitor.operations.impl.BOperationImpl(it, this);
  }
  
  @Override
  public default C1Operation c1(final C1 it) {
    return new ale3sem.revisitor.operations.impl.C1OperationImpl(it, this);
  }
  
  @Override
  public default C2Operation c2(final C2 it) {
    return new ale3sem.revisitor.operations.impl.C2OperationImpl(it, this);
  }
  
  @Override
  public default RA1BindBOperation rA1BindB(final RA1BindB it) {
    return new brew.revisitor.operations.impl.RA1BindBOperationImpl(it, this);
  }
  
  @Override
  public default RA2BindC1Operation rA2BindC1(final RA2BindC1 it) {
    return new brew.revisitor.operations.impl.RA2BindC1OperationImpl(it, this);
  }
  
  @Override
  public default RBBindC1Operation rBBindC1(final RBBindC1 it) {
    return new brew.revisitor.operations.impl.RBBindC1OperationImpl(it, this);
  }
  
  @Override
  public default RBBindC2Operation rBBindC2(final RBBindC2 it) {
    return new brew.revisitor.operations.impl.RBBindC2OperationImpl(it, this);
  }
}
