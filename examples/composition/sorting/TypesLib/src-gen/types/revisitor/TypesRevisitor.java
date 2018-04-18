package types.revisitor;

import types.revisitor.operations.IntWrapperOperation;
import typesLib.IntWrapper;
import typesLib.revisitor.TypesLibRevisitor;

@SuppressWarnings("all")
public interface TypesRevisitor extends TypesLibRevisitor<IntWrapperOperation> {
  @Override
  public default IntWrapperOperation intWrapper(final IntWrapper it) {
    return new types.revisitor.operations.impl.IntWrapperOperationImpl(it, this);
  }
}
