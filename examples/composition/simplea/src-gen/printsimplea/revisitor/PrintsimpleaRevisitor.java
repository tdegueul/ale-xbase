package printsimplea.revisitor;

import printsimplea.revisitor.operations.printsimplea.AOperation;
import printsimplea.revisitor.operations.printsimplea.BOperation;
import simplea.A;
import simplea.revisitor.SimpleaRevisitor;

@SuppressWarnings("all")
public interface PrintsimpleaRevisitor extends SimpleaRevisitor<AOperation, BOperation> {
  @Override
  public default AOperation simplea__A(final A it) {
    return new printsimplea.revisitor.operations.printsimplea.impl.AOperationImpl(it, this);
  }
}
