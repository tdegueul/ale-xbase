package printsimplea.revisitor.operations.impl;

import java.util.function.Consumer;
import printsimplea.revisitor.operations.AOperation;
import printsimplea.revisitor.operations.BOperation;
import simplea.A;
import simplea.B;
import simplea.revisitor.SimpleaRevisitor;

@SuppressWarnings("all")
public class AOperationImpl implements AOperation {
  private A self;
  
  private SimpleaRevisitor<AOperation, BOperation> alg;
  
  public AOperationImpl(final A self, final SimpleaRevisitor<AOperation, BOperation> alg) {
    this.self = self;
    this.alg = alg;
  }
  
  @Override
  public void main() {
    final Consumer<B> _function = (B it) -> {
      this.alg.$(it).call();
    };
    this.self.getBs().forEach(_function);
  }
}
