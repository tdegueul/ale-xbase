package printsimplea.revisitor;

import printsimplea.revisitor.operations.AOperation;
import printsimplea.revisitor.operations.BOperation;
import simplea.A;
import simplea.revisitor.SimpleaRevisitor;

@SuppressWarnings("all")
public interface PrintsimpleaRevisitor extends SimpleaRevisitor<AOperation, BOperation> {
  @Override
  public default AOperation a(final A it) {
    return new printsimplea.revisitor.operations.impl.AOperationImpl(it, this);
  }
}
