package typesSort.revisitor.impl;

import sorting.revisitor.operations.SortableOperation;
import types.revisitor.operations.IntWrapperOperation;
import typesLib.IntWrapper;
import typesSort.SortableBindIntWrapper;
import typesSort.revisitor.operations.SortableBindIntWrapperOperation;

@SuppressWarnings("all")
public interface TypesSortRevisitor extends typesSort.revisitor.TypesSortRevisitor<IntWrapperOperation, SortableOperation, SortableBindIntWrapperOperation> {
  @Override
  public default IntWrapperOperation intWrapper(final IntWrapper it) {
    return new types.revisitor.operations.impl.IntWrapperOperationImpl(it, this);
  }
  
  @Override
  public default SortableBindIntWrapperOperation sortableBindIntWrapper(final SortableBindIntWrapper it) {
    return new typesSort.revisitor.operations.impl.SortableBindIntWrapperOperationImpl(it, this);
  }
}
