package scenarios;

import java.util.ArrayList;

import sortingAlgorithm.Sortable;
import typesLib.IntWrapper;
import typesLib.TypesLibFactory;
import typesSort.SortableBindIntWrapper;
import typesSort.TypesSortFactory;
import typesSort.revisitor.impl.TypesSortRevisitor;

public class Scenario1 {
	public static void main(final String[] args) {
		final TypesSortRevisitor rev = new TypesSortRevisitor() {
		};

		final ArrayList<Sortable> arrayList = new ArrayList<>();

		final SortableBindIntWrapper createSortableBindIntWrapper = TypesSortFactory.eINSTANCE
				.createSortableBindIntWrapper();
		final IntWrapper createIntWrapper = TypesLibFactory.eINSTANCE.createIntWrapper();
		createIntWrapper.setValue(0);
		createSortableBindIntWrapper.setDelegate(createIntWrapper);
		arrayList.add(createSortableBindIntWrapper);

		SortableBindIntWrapper max = rev.$(createSortableBindIntWrapper).max(arrayList);
		System.out.println(max);

	}
}
