package typesSort.revisitor.operations.impl;

import java.util.List;

import sorting.revisitor.operations.SortableOperation;
import sorting.revisitor.operations.impl.SortableOperationImpl;
import sortingAlgorithm.Sortable;
import types.revisitor.operations.IntWrapperOperation;
import typesSort.SortableBindIntWrapper;
import typesSort.revisitor.TypesSortRevisitor;
import typesSort.revisitor.operations.SortableBindIntWrapperOperation;

@SuppressWarnings("all")
public class SortableBindIntWrapperOperationImpl extends SortableOperationImpl
		implements SortableBindIntWrapperOperation {
	private SortableBindIntWrapper obj;

	private TypesSortRevisitor<IntWrapperOperation, SortableOperation, SortableBindIntWrapperOperation> alg;

	public SortableBindIntWrapperOperationImpl(final SortableBindIntWrapper obj,
			final TypesSortRevisitor<IntWrapperOperation, SortableOperation, SortableBindIntWrapperOperation> alg) {
		super(obj, alg);
		this.obj = obj;
		this.alg = alg;
	}

	@Override
	public int comparateTo(final Sortable a, final Sortable b) {
		return alg.$(obj.getDelegate()).comparateTo(a, b);
	}

	@Override
	public SortableBindIntWrapper max(List<Sortable> lst) {
		// TODO Auto-generated method stub
		return (SortableBindIntWrapper) super.max(lst);
	}

}
