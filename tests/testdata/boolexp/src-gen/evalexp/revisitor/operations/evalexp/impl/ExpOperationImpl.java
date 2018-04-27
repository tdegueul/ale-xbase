package evalexp.revisitor.operations.evalexp.impl;

import boolexp.Exp;
import boolexp.revisitor.BoolexpRevisitor;
import evalexp.revisitor.operations.evalexp.AndOperation;
import evalexp.revisitor.operations.evalexp.BinaryExpOperation;
import evalexp.revisitor.operations.evalexp.ExpOperation;
import evalexp.revisitor.operations.evalexp.FalsOperation;
import evalexp.revisitor.operations.evalexp.LitOperation;
import evalexp.revisitor.operations.evalexp.OrOperation;
import evalexp.revisitor.operations.evalexp.TruOperation;

@SuppressWarnings("all")
public abstract class ExpOperationImpl implements ExpOperation {
  private Exp obj;
  
  private BoolexpRevisitor<AndOperation, BinaryExpOperation, ExpOperation, FalsOperation, LitOperation, OrOperation, TruOperation> alg;
  
  public ExpOperationImpl(final Exp obj, final BoolexpRevisitor<AndOperation, BinaryExpOperation, ExpOperation, FalsOperation, LitOperation, OrOperation, TruOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
}
