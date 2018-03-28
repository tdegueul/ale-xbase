package printexp.revisitor.operations.impl;

import boolexp.Exp;
import boolexp.revisitor.BoolexpRevisitor;
import printexp.revisitor.operations.AndOperation;
import printexp.revisitor.operations.ExpOperation;
import printexp.revisitor.operations.FalsOperation;
import printexp.revisitor.operations.OrOperation;
import printexp.revisitor.operations.TruOperation;

@SuppressWarnings("all")
public abstract class ExpOperationImpl implements ExpOperation {
  private Exp self;
  
  private BoolexpRevisitor<AndOperation, ExpOperation, ExpOperation, FalsOperation, ExpOperation, OrOperation, TruOperation> alg;
  
  public ExpOperationImpl(final Exp self, final BoolexpRevisitor<AndOperation, ExpOperation, ExpOperation, FalsOperation, ExpOperation, OrOperation, TruOperation> alg) {
    this.self = self;
    this.alg = alg;
  }
  
  @Override
  public abstract String print();
}
