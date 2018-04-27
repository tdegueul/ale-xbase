package evalexp.revisitor.operations.evalexp.impl;

import boolexp.And;
import boolexp.revisitor.BoolexpRevisitor;
import evalexp.revisitor.operations.evalexp.AndOperation;
import evalexp.revisitor.operations.evalexp.BinaryExpOperation;
import evalexp.revisitor.operations.evalexp.ExpOperation;
import evalexp.revisitor.operations.evalexp.FalsOperation;
import evalexp.revisitor.operations.evalexp.LitOperation;
import evalexp.revisitor.operations.evalexp.OrOperation;
import evalexp.revisitor.operations.evalexp.TruOperation;
import evalexp.revisitor.operations.evalexp.impl.BinaryExpOperationImpl;

@SuppressWarnings("all")
public class AndOperationImpl extends BinaryExpOperationImpl implements AndOperation {
  private And obj;
  
  private BoolexpRevisitor<AndOperation, BinaryExpOperation, ExpOperation, FalsOperation, LitOperation, OrOperation, TruOperation> alg;
  
  public AndOperationImpl(final And obj, final BoolexpRevisitor<AndOperation, BinaryExpOperation, ExpOperation, FalsOperation, LitOperation, OrOperation, TruOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public boolean eval() {
    return (this.alg.$(this.obj.getLhs()).eval() && this.alg.$(this.obj.getRhs()).eval());
  }
}
