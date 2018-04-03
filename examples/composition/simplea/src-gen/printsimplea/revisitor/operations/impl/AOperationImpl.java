package printsimplea.revisitor.operations.impl;

import java.util.function.Consumer;
import printsimplea.revisitor.operations.AOperation;
import printsimplea.revisitor.operations.BOperation;
import simplea.A;
import simplea.B;
import simplea.revisitor.SimpleaRevisitor;

@SuppressWarnings("all")
public class AOperationImpl implements AOperation {
  private A obj;
  
  private SimpleaRevisitor<AOperation, BOperation> alg;
  
  public AOperationImpl(final A obj, final SimpleaRevisitor<AOperation, BOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void main() {
    final String n = this.obj.getName();
    final Consumer<B> _function = (B it) -> {
      this.alg.$(it).call();
      this.alg.$(it).callWithArg(n);
    };
    this.obj.getBs().forEach(_function);
  }
}
