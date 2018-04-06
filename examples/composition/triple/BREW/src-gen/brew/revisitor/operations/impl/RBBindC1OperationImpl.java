package brew.revisitor.operations.impl;

import ale1sem.revisitor.operations.A1Operation;
import ale1sem.revisitor.operations.RA1Operation;
import ale1sem.revisitor.operations.RA2Operation;
import ale2sem.revisitor.operations.BOperation;
import ale2sem.revisitor.operations.RBOperation;
import ale3sem.revisitor.operations.C1Operation;
import ale3sem.revisitor.operations.C2Operation;
import brew.RBBindC1;
import brew.revisitor.BrewRevisitor;
import brew.revisitor.operations.RA1BindBOperation;
import brew.revisitor.operations.RA2BindC1Operation;
import brew.revisitor.operations.RBBindC1Operation;
import brew.revisitor.operations.RBBindC2Operation;

@SuppressWarnings("all")
public class RBBindC1OperationImpl implements RBBindC1Operation {
  private RBBindC1 obj;
  
  private BrewRevisitor<A1Operation, BOperation, C1Operation, C2Operation, RA1Operation, RA1BindBOperation, RA2Operation, RA2BindC1Operation, RBOperation, RBBindC1Operation, RBBindC2Operation> alg;
  
  public RBBindC1OperationImpl(final RBBindC1 obj, final BrewRevisitor<A1Operation, BOperation, C1Operation, C2Operation, RA1Operation, RA1BindBOperation, RA2Operation, RA2BindC1Operation, RBOperation, RBBindC1Operation, RBBindC2Operation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void rbPrint() {
    alg.$(obj.getDelegate()).printC();
  }
}
