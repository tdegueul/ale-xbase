package evalexp.revisitor.operations.evalexp.impl;

import boolexp.Lit;
import boolexp.revisitor.BoolexpRevisitor;
import evalexp.revisitor.operations.evalexp.AndOperation;
import evalexp.revisitor.operations.evalexp.BinaryExpOperation;
import evalexp.revisitor.operations.evalexp.ExpOperation;
import evalexp.revisitor.operations.evalexp.FalsOperation;
import evalexp.revisitor.operations.evalexp.LitOperation;
import evalexp.revisitor.operations.evalexp.OrOperation;
import evalexp.revisitor.operations.evalexp.TruOperation;
import evalexp.revisitor.operations.evalexp.impl.ExpOperationImpl;

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
