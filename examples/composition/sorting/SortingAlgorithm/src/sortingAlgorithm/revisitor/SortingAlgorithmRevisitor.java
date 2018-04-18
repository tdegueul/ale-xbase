package sortingAlgorithm.revisitor;

public interface SortingAlgorithmRevisitor<SortingAlgorithm__SortableT> {

	default SortingAlgorithm__SortableT $(final sortingAlgorithm.Sortable it) {
		return null;
	}
}
