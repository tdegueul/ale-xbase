package ale.compiler.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class Node<T extends Object> {
  private final List<Node<T>> childen = CollectionLiterals.<Node<T>>newArrayList();
  
  private final T value;
  
  private Node<T> parent;
  
  public Node(final T t) {
    this.value = t;
  }
  
  public boolean hasChilden() {
    boolean _isEmpty = this.childen.isEmpty();
    return (!_isEmpty);
  }
  
  public boolean isRoot() {
    return Objects.equal(this.parent, null);
  }
  
  public Node<T> addChild(final Node<T> t) {
    Node<T> _xblockexpression = null;
    {
      this.childen.add(t);
      _xblockexpression = t.parent = this;
    }
    return _xblockexpression;
  }
  
  public List<T> toList() {
    ArrayList<T> _xblockexpression = null;
    {
      final ArrayList<T> ret = CollectionLiterals.<T>newArrayList();
      final Function1<Node<T>, List<T>> _function = (Node<T> it) -> {
        return it.toList();
      };
      List<List<T>> _map = ListExtensions.<Node<T>, List<T>>map(this.childen, _function);
      Iterable<T> _flatten = Iterables.<T>concat(_map);
      Iterables.<T>addAll(ret, _flatten);
      ret.add(this.value);
      _xblockexpression = ret;
    }
    return _xblockexpression;
  }
}
