package ale.compiler.generator;

import com.google.common.collect.Iterables;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class Graph<E extends Object> {
  public static class GraphNode<E extends Object> {
    public E elem;
    
    private Set<Graph.GraphNode<E>> incoming = CollectionLiterals.<Graph.GraphNode<E>>newHashSet();
    
    private Set<Graph.GraphNode<E>> outgoing = CollectionLiterals.<Graph.GraphNode<E>>newHashSet();
    
    public GraphNode(final E elem) {
      this.elem = elem;
    }
    
    private boolean addOutgoing(final Graph.GraphNode<E> x) {
      return this.outgoing.add(x);
    }
    
    private boolean addIncoming(final Graph.GraphNode<E> x) {
      return this.incoming.add(x);
    }
    
    public Set<Graph.GraphNode<E>> getOutgoing() {
      return this.outgoing;
    }
    
    public Set<Graph.GraphNode<E>> getIncoming() {
      return this.incoming;
    }
    
    public HashSet<Graph.GraphNode<E>> getIncomings() {
      HashSet<Graph.GraphNode<E>> _xblockexpression = null;
      {
        final HashSet<Graph.GraphNode<E>> elems = CollectionLiterals.<Graph.GraphNode<E>>newHashSet();
        this.getIncomings(this, elems);
        _xblockexpression = elems;
      }
      return _xblockexpression;
    }
    
    private void getIncomings(final Graph.GraphNode<E> current, final Set<Graph.GraphNode<E>> e) {
      final Consumer<Graph.GraphNode<E>> _function = (Graph.GraphNode<E> ci) -> {
        boolean _contains = e.contains(ci);
        boolean _not = (!_contains);
        if (_not) {
          this.getIncomings(ci, e);
          e.add(ci);
        }
      };
      current.incoming.forEach(_function);
    }
    
    public boolean isRoot() {
      return this.outgoing.isEmpty();
    }
    
    public Set<Graph.GraphNode<E>> getRoots() {
      Set<Graph.GraphNode<E>> _xifexpression = null;
      boolean _isRoot = this.isRoot();
      if (_isRoot) {
        _xifexpression = CollectionLiterals.<Graph.GraphNode<E>>newHashSet(this);
      } else {
        final Function1<Graph.GraphNode<E>, Set<Graph.GraphNode<E>>> _function = (Graph.GraphNode<E> it) -> {
          return it.getRoots();
        };
        Iterable<Set<Graph.GraphNode<E>>> _map = IterableExtensions.<Graph.GraphNode<E>, Set<Graph.GraphNode<E>>>map(this.outgoing, _function);
        Iterable<Graph.GraphNode<E>> _flatten = Iterables.<Graph.GraphNode<E>>concat(_map);
        _xifexpression = IterableExtensions.<Graph.GraphNode<E>>toSet(_flatten);
      }
      return _xifexpression;
    }
    
    @Override
    public boolean equals(final Object obj) {
      boolean _xifexpression = false;
      if ((obj instanceof Graph.GraphNode)) {
        _xifexpression = (((Graph.GraphNode)obj).elem == this.elem);
      } else {
        _xifexpression = false;
      }
      return _xifexpression;
    }
    
    @Override
    public String toString() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Node (");
      _builder.append(this.elem, "");
      _builder.append(")");
      return _builder.toString();
    }
    
    @Override
    public int hashCode() {
      return this.elem.hashCode();
    }
    
    private Set<Graph.GraphNode<E>> getParents() {
      HashSet<Graph.GraphNode<E>> _xblockexpression = null;
      {
        final HashSet<Graph.GraphNode<E>> ret = CollectionLiterals.<Graph.GraphNode<E>>newHashSet();
        ret.addAll(this.outgoing);
        final Consumer<Graph.GraphNode<E>> _function = (Graph.GraphNode<E> x) -> {
          Set<Graph.GraphNode<E>> _parents = x.getParents();
          ret.addAll(_parents);
        };
        this.outgoing.forEach(_function);
        _xblockexpression = ret;
      }
      return _xblockexpression;
    }
    
    public Set<Graph.GraphNode<E>> getChildren() {
      HashSet<Graph.GraphNode<E>> _xblockexpression = null;
      {
        final HashSet<Graph.GraphNode<E>> ret = CollectionLiterals.<Graph.GraphNode<E>>newHashSet();
        ret.addAll(this.incoming);
        final Consumer<Graph.GraphNode<E>> _function = (Graph.GraphNode<E> x) -> {
          Set<Graph.GraphNode<E>> _children = x.getChildren();
          ret.addAll(_children);
        };
        this.incoming.forEach(_function);
        _xblockexpression = ret;
      }
      return _xblockexpression;
    }
    
    public Integer distanceFromRoot(final EClass class1) {
      Integer _xifexpression = null;
      boolean _equals = class1.equals(this.elem);
      if (_equals) {
        _xifexpression = Integer.valueOf(0);
      } else {
        final Function1<Graph.GraphNode<E>, Integer> _function = (Graph.GraphNode<E> it) -> {
          Integer _distanceFromRoot = it.distanceFromRoot(class1);
          return Integer.valueOf(((_distanceFromRoot).intValue() + 1));
        };
        Iterable<Integer> _map = IterableExtensions.<Graph.GraphNode<E>, Integer>map(this.outgoing, _function);
        _xifexpression = IterableExtensions.<Integer>min(_map);
      }
      return _xifexpression;
    }
  }
  
  public Set<Graph.GraphNode<E>> nodes = CollectionLiterals.<Graph.GraphNode<E>>newHashSet();
  
  public Graph.GraphNode<E> addNode(final E elem) {
    Graph.GraphNode<E> _xblockexpression = null;
    {
      final Graph.GraphNode<E> nE = new Graph.GraphNode<E>(elem);
      this.nodes.add(nE);
      final Function1<Graph.GraphNode<E>, Boolean> _function = (Graph.GraphNode<E> x) -> {
        return Boolean.valueOf(x.equals(nE));
      };
      _xblockexpression = IterableExtensions.<Graph.GraphNode<E>>findFirst(this.nodes, _function);
    }
    return _xblockexpression;
  }
  
  public boolean addEdge(final Graph.GraphNode<E> elem1, final Graph.GraphNode<E> elem2) {
    boolean _xblockexpression = false;
    {
      elem1.addOutgoing(elem2);
      _xblockexpression = elem2.addIncoming(elem1);
    }
    return _xblockexpression;
  }
  
  public Iterable<Graph.GraphNode<E>> getRoots() {
    final Function1<Graph.GraphNode<E>, Boolean> _function = (Graph.GraphNode<E> it) -> {
      return Boolean.valueOf(it.isRoot());
    };
    return IterableExtensions.<Graph.GraphNode<E>>filter(this.nodes, _function);
  }
  
  @Override
  public String toString() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Graph (");
    {
      boolean _hasElements = false;
      for(final Graph.GraphNode<E> n : this.nodes) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        _builder.append(n, "");
      }
    }
    _builder.append(")");
    return _builder.toString();
  }
  
  public Set<Set<Graph.GraphNode<E>>> clusters() {
    HashSet<Set<Graph.GraphNode<E>>> _xblockexpression = null;
    {
      final HashSet<Set<Graph.GraphNode<E>>> ret = CollectionLiterals.<Set<Graph.GraphNode<E>>>newHashSet();
      final Consumer<Graph.GraphNode<E>> _function = (Graph.GraphNode<E> x) -> {
        final Function1<Set<Graph.GraphNode<E>>, Boolean> _function_1 = (Set<Graph.GraphNode<E>> y) -> {
          return Boolean.valueOf(((y.contains(x) || this.containsSome(y, x.getParents())) || this.containsSome(y, x.getChildren())));
        };
        boolean _exists = IterableExtensions.<Set<Graph.GraphNode<E>>>exists(ret, _function_1);
        boolean _not = (!_exists);
        if (_not) {
          final HashSet<Graph.GraphNode<E>> nhs = CollectionLiterals.<Graph.GraphNode<E>>newHashSet();
          nhs.add(x);
          Set<Graph.GraphNode<E>> _parents = x.getParents();
          nhs.addAll(_parents);
          Set<Graph.GraphNode<E>> _children = x.getChildren();
          nhs.addAll(_children);
          ret.add(nhs);
        } else {
          final Function1<Set<Graph.GraphNode<E>>, Boolean> _function_2 = (Set<Graph.GraphNode<E>> y) -> {
            return Boolean.valueOf(((y.contains(x) || this.containsSome(y, x.getParents())) || this.containsSome(y, x.getChildren())));
          };
          Iterable<Set<Graph.GraphNode<E>>> _filter = IterableExtensions.<Set<Graph.GraphNode<E>>>filter(ret, _function_2);
          final List<Set<Graph.GraphNode<E>>> set = IterableExtensions.<Set<Graph.GraphNode<E>>>toList(_filter);
          ret.removeAll(set);
          final HashSet<Graph.GraphNode<E>> newSet = CollectionLiterals.<Graph.GraphNode<E>>newHashSet();
          final Consumer<Set<Graph.GraphNode<E>>> _function_3 = (Set<Graph.GraphNode<E>> u) -> {
            newSet.addAll(u);
          };
          set.forEach(_function_3);
          Set<Graph.GraphNode<E>> _parents_1 = x.getParents();
          newSet.addAll(_parents_1);
          Set<Graph.GraphNode<E>> _children_1 = x.getChildren();
          newSet.addAll(_children_1);
          ret.add(newSet);
        }
      };
      this.nodes.forEach(_function);
      _xblockexpression = ret;
    }
    return _xblockexpression;
  }
  
  private boolean containsSome(final Set<?> nodes, final Set<?> nodes2) {
    final Function1<Object, Boolean> _function = (Object e) -> {
      return Boolean.valueOf(nodes2.contains(e));
    };
    return IterableExtensions.exists(nodes, _function);
  }
}
