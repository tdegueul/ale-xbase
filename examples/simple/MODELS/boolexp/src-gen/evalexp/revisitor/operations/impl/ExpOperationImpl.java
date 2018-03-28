package evalexp.revisitor.operations.impl;

import boolexp.Exp;
import boolexp.revisitor.BoolexpRevisitor;
import evalexp.revisitor.operations.AndOperation;
import evalexp.revisitor.operations.ExpOperation;
import evalexp.revisitor.operations.FalsOperation;
import evalexp.revisitor.operations.OrOperation;
import evalexp.revisitor.operations.TruOperation;

@SuppressWarnings("all")
public abstract class ExpOperationImpl implements ExpOperation {
  private Exp self;
  
  private BoolexpRevisitor<AndOperation, ExpOperation, ExpOperation, FalsOperation, ExpOperation, OrOperation, TruOperation> alg;
  
  public ExpOperationImpl(final Exp self, final BoolexpRevisitor<AndOperation, ExpOperation, ExpOperation, FalsOperation, ExpOperation, OrOperation, TruOperation> alg) {
    this.self = self;
    this.alg = alg;
  }
  
  @Override
  public abstract boolean eval();
}
