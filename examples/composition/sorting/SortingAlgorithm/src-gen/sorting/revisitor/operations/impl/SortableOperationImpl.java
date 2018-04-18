package sorting.revisitor.operations.impl;

import java.util.Comparator;
import java.util.List;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import sorting.revisitor.operations.SortableOperation;
import sortingAlgorithm.Sortable;
import sortingAlgorithm.revisitor.SortingAlgorithmRevisitor;

@SuppressWarnings("all")
public abstract class SortableOperationImpl implements SortableOperation {
  private Sortable obj;
  
  private SortingAlgorithmRevisitor<SortableOperation> alg;
  
  public SortableOperationImpl(final Sortable obj, final SortingAlgorithmRevisitor<SortableOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public Sortable max(final List<Sortable> lst) {
    return IterableExtensions.<Sortable>head(ListExtensions.<Sortable>reverse(this.sort(lst)));
  }
  
  @Override
  public Sortable min(final List<Sortable> lst) {
    return IterableExtensions.<Sortable>head(this.sort(lst));
  }
  
  @Override
  public List<Sortable> sort(final List<Sortable> lst) {
    final Comparator<Sortable> _function = (Sortable a, Sortable b) -> {
      return this.comparateTo(a, b);
    };
    return IterableExtensions.<Sortable>sortWith(lst, _function);
  }
  
  @Override
  public abstract int comparateTo(final Sortable a, final Sortable b);
}
