package types.revisitor.operations.impl;

import sortingAlgorithm.Sortable;
import types.revisitor.operations.IntWrapperOperation;
import typesLib.IntWrapper;
import typesLib.revisitor.TypesLibRevisitor;

@SuppressWarnings("all")
public class IntWrapperOperationImpl implements IntWrapperOperation {
  private IntWrapper obj;
  
  private TypesLibRevisitor<IntWrapperOperation> alg;
  
  public IntWrapperOperationImpl(final IntWrapper obj, final TypesLibRevisitor<IntWrapperOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public int comparateTo(final Sortable a, final Sortable b) {
    return 0;
  }
}
