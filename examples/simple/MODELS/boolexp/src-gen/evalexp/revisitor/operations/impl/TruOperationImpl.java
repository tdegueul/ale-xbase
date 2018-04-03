package evalexp.revisitor.operations.impl;

import boolexp.Tru;
import boolexp.revisitor.BoolexpRevisitor;
import evalexp.revisitor.operations.AndOperation;
import evalexp.revisitor.operations.ExpOperation;
import evalexp.revisitor.operations.FalsOperation;
import evalexp.revisitor.operations.OrOperation;
import evalexp.revisitor.operations.TruOperation;
import evalexp.revisitor.operations.impl.ExpOperationImpl;

@SuppressWarnings("all")
public class TruOperationImpl extends ExpOperationImpl implements TruOperation {
  private Tru obj;
  
  private BoolexpRevisitor<AndOperation, ExpOperation, ExpOperation, FalsOperation, ExpOperation, OrOperation, TruOperation> alg;
  
  public TruOperationImpl(final Tru obj, final BoolexpRevisitor<AndOperation, ExpOperation, ExpOperation, FalsOperation, ExpOperation, OrOperation, TruOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public boolean eval() {
    return true;
  }
}
