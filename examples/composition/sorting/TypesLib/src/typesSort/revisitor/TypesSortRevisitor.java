package typesSort.revisitor;

public interface TypesSortRevisitor<TypesLib__IntWrapperT, SortingAlgorithm__SortableT, TypesSort__SortableBindIntWrapperT extends SortingAlgorithm__SortableT>
	extends sortingAlgorithm.revisitor.SortingAlgorithmRevisitor<SortingAlgorithm__SortableT>,
		typesLib.revisitor.TypesLibRevisitor<TypesLib__IntWrapperT> {
	TypesSort__SortableBindIntWrapperT sortableBindIntWrapper(final typesSort.SortableBindIntWrapper it);

	default TypesLib__IntWrapperT $(final typesLib.IntWrapper it) {
		return intWrapper(it);
	}
	default SortingAlgorithm__SortableT $(final sortingAlgorithm.Sortable it) {
		if (it.getClass() == typesSort.impl.SortableBindIntWrapperImpl.class)
			return sortableBindIntWrapper((typesSort.SortableBindIntWrapper) it);
		return null;
	}
	default TypesSort__SortableBindIntWrapperT $(final typesSort.SortableBindIntWrapper it) {
		return sortableBindIntWrapper(it);
	}
}
