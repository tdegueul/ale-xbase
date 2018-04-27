package evalexp.revisitor.operations.evalexp.impl;

import boolexp.Tru;
import boolexp.revisitor.BoolexpRevisitor;
import evalexp.revisitor.operations.evalexp.AndOperation;
import evalexp.revisitor.operations.evalexp.BinaryExpOperation;
import evalexp.revisitor.operations.evalexp.ExpOperation;
import evalexp.revisitor.operations.evalexp.FalsOperation;
import evalexp.revisitor.operations.evalexp.LitOperation;
import evalexp.revisitor.operations.evalexp.OrOperation;
import evalexp.revisitor.operations.evalexp.TruOperation;
import evalexp.revisitor.operations.evalexp.impl.LitOperationImpl;

@SuppressWarnings("all")
public class TruOperationImpl extends LitOperationImpl implements TruOperation {
  private Tru obj;
  
  private BoolexpRevisitor<AndOperation, BinaryExpOperation, ExpOperation, FalsOperation, LitOperation, OrOperation, TruOperation> alg;
  
  public TruOperationImpl(final Tru obj, final BoolexpRevisitor<AndOperation, BinaryExpOperation, ExpOperation, FalsOperation, LitOperation, OrOperation, TruOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public boolean eval() {
    return true;
  }
}
