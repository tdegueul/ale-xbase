package printexp.revisitor.operations.printexp.impl;

import boolexp.Fals;
import boolexp.revisitor.BoolexpRevisitor;
import printexp.revisitor.operations.printexp.AndOperation;
import printexp.revisitor.operations.printexp.BinaryExpOperation;
import printexp.revisitor.operations.printexp.ExpOperation;
import printexp.revisitor.operations.printexp.FalsOperation;
import printexp.revisitor.operations.printexp.LitOperation;
import printexp.revisitor.operations.printexp.OrOperation;
import printexp.revisitor.operations.printexp.TruOperation;

@SuppressWarnings("all")
public class FalsOperationImpl implements FalsOperation {
  private Fals obj;
  
  private BoolexpRevisitor<? extends AndOperation, ? extends BinaryExpOperation, ? extends ExpOperation, ? extends FalsOperation, ? extends LitOperation, ? extends OrOperation, ? extends TruOperation> alg;
  
  public FalsOperationImpl(final Fals obj, final BoolexpRevisitor<? extends AndOperation, ? extends BinaryExpOperation, ? extends ExpOperation, ? extends FalsOperation, ? extends LitOperation, ? extends OrOperation, ? extends TruOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public String print() {
    return "F";
  }
}
