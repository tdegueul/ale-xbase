package tokenholderexec.revisitor.operations.impl;

import java.util.List;
import tokenHolder.H;
import tokenHolder.T;
import tokenHolder.revisitor.TokenHolderRevisitor;
import tokenholderexec.revisitor.operations.HOperation;
import tokenholderexec.revisitor.operations.POperation;
import tokenholderexec.revisitor.operations.ROperation;

@SuppressWarnings("all")
public class HOperationImpl implements HOperation {
  private H obj;
  
  private TokenHolderRevisitor<HOperation, POperation, ROperation, Object> alg;
  
  public HOperationImpl(final H obj, final TokenHolderRevisitor<HOperation, POperation, ROperation, Object> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public List<T> getTokens() {
    return this.obj.getTokens();
  }
}
