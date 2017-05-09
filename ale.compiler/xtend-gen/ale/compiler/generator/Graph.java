package ale.compiler.generator;

import com.google.common.base.Objects;
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
  public static class GraphNode {
    public EClass elem;
    
    private Set<Graph.GraphNode> incoming = CollectionLiterals.<Graph.GraphNode>newHashSet();
    
    private Set<Graph.GraphNode> outgoing = CollectionLiterals.<Graph.GraphNode>newHashSet();
    
    public GraphNode(final EClass elem) {
      this.elem = elem;
    }
    
    private void addOutgoing(final Graph.GraphNode x) {
      this.outgoing.add(x);
    }
    
    private void addIncoming(final Graph.GraphNode x) {
      this.incoming.add(x);
    }
    
    public Set<Graph.GraphNode> getOutgoing() {
      return this.outgoing;
    }
    
    public Set<Graph.GraphNode> getIncoming() {
      return this.incoming;
    }
    
    public Set<Graph.GraphNode> getIncomings() {
      final HashSet<Graph.GraphNode> elems = CollectionLiterals.<Graph.GraphNode>newHashSet();
      this.getIncomingsRec(this, elems);
      return elems;
    }
    
    private void getIncomingsRec(final Graph.GraphNode current, final Set<Graph.GraphNode> e) {
      final Consumer<Graph.GraphNode> _function = (Graph.GraphNode ci) -> {
        boolean _contains = e.contains(ci);
        boolean _not = (!_contains);
        if (_not) {
          this.getIncomingsRec(ci, e);
          e.add(ci);
        }
      };
      current.incoming.forEach(_function);
    }
    
    public boolean isRoot() {
      return this.outgoing.isEmpty();
    }
    
    public Set<Graph.GraphNode> getRoots() {
      Set<Graph.GraphNode> _xifexpression = null;
      boolean _isRoot = this.isRoot();
      if (_isRoot) {
        _xifexpression = CollectionLiterals.<Graph.GraphNode>newHashSet(this);
      } else {
        final Function1<Graph.GraphNode, Set<Graph.GraphNode>> _function = (Graph.GraphNode it) -> {
          return it.getRoots();
        };
        Iterable<Set<Graph.GraphNode>> _map = IterableExtensions.<Graph.GraphNode, Set<Graph.GraphNode>>map(this.outgoing, _function);
        Iterable<Graph.GraphNode> _flatten = Iterables.<Graph.GraphNode>concat(_map);
        _xifexpression = IterableExtensions.<Graph.GraphNode>toSet(_flatten);
      }
      return _xifexpression;
    }
    
    @Override
    public boolean equals(final Object obj) {
      boolean _xifexpression = false;
      if ((obj instanceof Graph.GraphNode)) {
        _xifexpression = Objects.equal(((Graph.GraphNode)obj).elem, this.elem);
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
    
    private Set<Graph.GraphNode> getParents() {
      final HashSet<Graph.GraphNode> ret = CollectionLiterals.<Graph.GraphNode>newHashSet();
      ret.addAll(this.outgoing);
      final Consumer<Graph.GraphNode> _function = (Graph.GraphNode it) -> {
        Set<Graph.GraphNode> _parents = it.getParents();
        ret.addAll(_parents);
      };
      this.outgoing.forEach(_function);
      return ret;
    }
    
    public Set<Graph.GraphNode> getChildren() {
      final HashSet<Graph.GraphNode> ret = CollectionLiterals.<Graph.GraphNode>newHashSet();
      ret.addAll(this.incoming);
      final Consumer<Graph.GraphNode> _function = (Graph.GraphNode it) -> {
        Set<Graph.GraphNode> _children = it.getChildren();
        ret.addAll(_children);
      };
      this.incoming.forEach(_function);
      return ret;
    }
    
    public Integer distanceFromRoot(final EClass class1) {
      Integer _xifexpression = null;
      boolean _equals = class1.equals(this.elem);
      if (_equals) {
        _xifexpression = Integer.valueOf(0);
      } else {
        final Function1<Graph.GraphNode, Integer> _function = (Graph.GraphNode it) -> {
          Integer _distanceFromRoot = it.distanceFromRoot(class1);
          return Integer.valueOf(((_distanceFromRoot).intValue() + 1));
        };
        Iterable<Integer> _map = IterableExtensions.<Graph.GraphNode, Integer>map(this.outgoing, _function);
        _xifexpression = IterableExtensions.<Integer>min(_map);
      }
      return _xifexpression;
    }
  }
  
  public Set<Graph.GraphNode> nodes = CollectionLiterals.<Graph.GraphNode>newHashSet();
  
  public Graph.GraphNode addNode(final EClass elem) {
    final Graph.GraphNode nE = new Graph.GraphNode(elem);
    this.nodes.add(nE);
    final Function1<Graph.GraphNode, Boolean> _function = (Graph.GraphNode it) -> {
      return Boolean.valueOf(Objects.equal(it, nE));
    };
    return IterableExtensions.<Graph.GraphNode>findFirst(this.nodes, _function);
  }
  
  public void addEdge(final Graph.GraphNode elem1, final Graph.GraphNode elem2) {
    elem1.addOutgoing(elem2);
    elem2.addIncoming(elem1);
  }
  
  public Iterable<Graph.GraphNode> getRoots() {
    final Function1<Graph.GraphNode, Boolean> _function = (Graph.GraphNode it) -> {
      return Boolean.valueOf(it.isRoot());
    };
    return IterableExtensions.<Graph.GraphNode>filter(this.nodes, _function);
  }
  
  @Override
  public String toString() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Graph (");
    {
      boolean _hasElements = false;
      for(final Graph.GraphNode n : this.nodes) {
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
  
  public Set<Set<Graph.GraphNode>> clusters() {
    final HashSet<Set<Graph.GraphNode>> ret = CollectionLiterals.<Set<Graph.GraphNode>>newHashSet();
    final Consumer<Graph.GraphNode> _function = (Graph.GraphNode x) -> {
      final Function1<Set<Graph.GraphNode>, Boolean> _function_1 = (Set<Graph.GraphNode> y) -> {
        return Boolean.valueOf(((y.contains(x) || this.containsSome(y, x.getParents())) || this.containsSome(y, x.getChildren())));
      };
      boolean _exists = IterableExtensions.<Set<Graph.GraphNode>>exists(ret, _function_1);
      boolean _not = (!_exists);
      if (_not) {
        final HashSet<Graph.GraphNode> nhs = CollectionLiterals.<Graph.GraphNode>newHashSet();
        nhs.add(x);
        Set<Graph.GraphNode> _parents = x.getParents();
        nhs.addAll(_parents);
        Set<Graph.GraphNode> _children = x.getChildren();
        nhs.addAll(_children);
        ret.add(nhs);
      } else {
        final Function1<Set<Graph.GraphNode>, Boolean> _function_2 = (Set<Graph.GraphNode> y) -> {
          return Boolean.valueOf(((y.contains(x) || this.containsSome(y, x.getParents())) || this.containsSome(y, x.getChildren())));
        };
        Iterable<Set<Graph.GraphNode>> _filter = IterableExtensions.<Set<Graph.GraphNode>>filter(ret, _function_2);
        final List<Set<Graph.GraphNode>> set = IterableExtensions.<Set<Graph.GraphNode>>toList(_filter);
        ret.removeAll(set);
        final HashSet<Graph.GraphNode> newSet = CollectionLiterals.<Graph.GraphNode>newHashSet();
        final Consumer<Set<Graph.GraphNode>> _function_3 = (Set<Graph.GraphNode> u) -> {
          newSet.addAll(u);
        };
        set.forEach(_function_3);
        Set<Graph.GraphNode> _parents_1 = x.getParents();
        newSet.addAll(_parents_1);
        Set<Graph.GraphNode> _children_1 = x.getChildren();
        newSet.addAll(_children_1);
        ret.add(newSet);
      }
    };
    this.nodes.forEach(_function);
    return ret;
  }
  
  private boolean containsSome(final Set<?> nodes, final Set<?> nodes2) {
    final Function1<Object, Boolean> _function = (Object it) -> {
      return Boolean.valueOf(nodes2.contains(it));
    };
    return IterableExtensions.exists(nodes, _function);
  }
}
