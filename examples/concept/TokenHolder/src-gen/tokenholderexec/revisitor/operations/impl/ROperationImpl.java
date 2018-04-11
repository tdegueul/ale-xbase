package tokenholderexec.revisitor.operations.impl;

import java.util.List;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import tokenHolder.H;
import tokenHolder.P;
import tokenHolder.R;
import tokenHolder.revisitor.TokenHolderRevisitor;
import tokenholderexec.revisitor.operations.HOperation;
import tokenholderexec.revisitor.operations.POperation;
import tokenholderexec.revisitor.operations.ROperation;

@SuppressWarnings("all")
public class ROperationImpl implements ROperation {
  private R obj;
  
  private TokenHolderRevisitor<HOperation, POperation, ROperation, Object> alg;
  
  public ROperationImpl(final R obj, final TokenHolderRevisitor<HOperation, POperation, ROperation, Object> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public List<H> getH() {
    return this.obj.getH();
  }
  
  @Override
  public List<P> getP() {
    return this.obj.getP();
  }
  
  @Override
  public void main() {
    InputOutput.<String>println("start");
    while (IterableExtensions.<P>exists(this.alg.$(this.obj).getP(), ((Function1<P, Boolean>) (P it) -> {
      return Boolean.valueOf((this.alg.$(it).enabled() && this.alg.$(it).fire()));
    }))) {
    }
  }
}
