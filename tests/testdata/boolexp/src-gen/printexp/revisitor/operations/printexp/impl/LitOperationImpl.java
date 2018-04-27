package printexp.revisitor.operations.printexp.impl;

import boolexp.Lit;
import boolexp.revisitor.BoolexpRevisitor;
import printexp.revisitor.operations.printexp.AndOperation;
import printexp.revisitor.operations.printexp.BinaryExpOperation;
import printexp.revisitor.operations.printexp.ExpOperation;
import printexp.revisitor.operations.printexp.FalsOperation;
import printexp.revisitor.operations.printexp.LitOperation;
import printexp.revisitor.operations.printexp.OrOperation;
import printexp.revisitor.operations.printexp.TruOperation;
import printexp.revisitor.operations.printexp.impl.ExpOperationImpl;

@SuppressWarnings("all")
public abstract class LitOperationImpl extends ExpOperationImpl implements LitOperation {
  private Lit obj;
  
  private BoolexpRevisitor<AndOperation, BinaryExpOperation, ExpOperation, FalsOperation, LitOperation, OrOperation, TruOperation> alg;
  
  public LitOperationImpl(final Lit obj, final BoolexpRevisitor<AndOperation, BinaryExpOperation, ExpOperation, FalsOperation, LitOperation, OrOperation, TruOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
}
