package printexp.revisitor.operations.impl;

import boolexp.Fals;
import boolexp.revisitor.BoolexpRevisitor;
import printexp.revisitor.operations.AndOperation;
import printexp.revisitor.operations.ExpOperation;
import printexp.revisitor.operations.FalsOperation;
import printexp.revisitor.operations.OrOperation;
import printexp.revisitor.operations.TruOperation;
import printexp.revisitor.operations.impl.ExpOperationImpl;

@SuppressWarnings("all")
public class FalsOperationImpl extends ExpOperationImpl implements FalsOperation {
  private Fals obj;
  
  private BoolexpRevisitor<AndOperation, ExpOperation, ExpOperation, FalsOperation, ExpOperation, OrOperation, TruOperation> alg;
  
  public FalsOperationImpl(final Fals obj, final BoolexpRevisitor<AndOperation, ExpOperation, ExpOperation, FalsOperation, ExpOperation, OrOperation, TruOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public String print() {
    return "F";
  }
}
