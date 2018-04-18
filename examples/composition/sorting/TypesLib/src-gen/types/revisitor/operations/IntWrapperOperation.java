package types.revisitor.operations;

import sortingAlgorithm.Sortable;

@SuppressWarnings("all")
public interface IntWrapperOperation {
  public abstract int comparateTo(final Sortable a, final Sortable b);
}
