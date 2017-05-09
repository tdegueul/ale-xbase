package ale.compiler.generator;

import ale.compiler.generator.Graph;
import ale.utils.AleEcoreUtil;
import ale.xtext.ale.AleClass;
import ale.xtext.ale.ImportEcore;
import ale.xtext.ale.Method;
import ale.xtext.ale.Root;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class GraphUtil {
  private ResourceSet resSet;
  
  private AleEcoreUtil aleEcoreUtil = new AleEcoreUtil();
  
  public GraphUtil(final ResourceSet resSet) {
    this.resSet = resSet;
  }
  
  public Graph<EClass> buildGraph(final EPackage ePackage) {
    ArrayList<EPackage> _newArrayList = CollectionLiterals.<EPackage>newArrayList(ePackage);
    return this.buildGraph(_newArrayList);
  }
  
  public Graph<EClass> buildGraph(final List<EPackage> ePackages) {
    final Graph<EClass> graph1 = new Graph<EClass>();
    final HashSet<EPackage> visitedPackages = CollectionLiterals.<EPackage>newHashSet();
    final Consumer<EPackage> _function = (EPackage it) -> {
      this.visitPackages(it, visitedPackages, graph1);
    };
    ePackages.forEach(_function);
    return graph1;
  }
  
  private void visitPackages(final EPackage ePackage, final HashSet<EPackage> visitedpackage, final Graph<EClass> graph1) {
    if ((ePackage != null)) {
      visitedpackage.add(ePackage);
    }
    final List<EClass> allEClasses = this.allEClasses(ePackage);
    final Consumer<EClass> _function = (EClass e) -> {
      this.addParents(graph1, e);
    };
    allEClasses.forEach(_function);
    final Consumer<EClass> _function_1 = (EClass e) -> {
      EList<EReference> _eReferences = e.getEReferences();
      List<EClass> _directlyRelatedTypes = this.getDirectlyRelatedTypes(_eReferences);
      final Consumer<EClass> _function_2 = (EClass f) -> {
        this.addParents(graph1, f);
      };
      _directlyRelatedTypes.forEach(_function_2);
    };
    allEClasses.forEach(_function_1);
    final Function1<Graph.GraphNode, String> _function_2 = (Graph.GraphNode it) -> {
      return it.elem.getName();
    };
    List<Graph.GraphNode> _sortBy = IterableExtensions.<Graph.GraphNode, String>sortBy(graph1.nodes, _function_2);
    final Function1<Graph.GraphNode, EPackage> _function_3 = (Graph.GraphNode it) -> {
      return it.elem.getEPackage();
    };
    List<EPackage> _map = ListExtensions.<Graph.GraphNode, EPackage>map(_sortBy, _function_3);
    Set<EPackage> _set = IterableExtensions.<EPackage>toSet(_map);
    final Function1<EPackage, Boolean> _function_4 = (EPackage e) -> {
      boolean _contains = visitedpackage.contains(e);
      return Boolean.valueOf((!_contains));
    };
    final Iterable<EPackage> notYetVisited = IterableExtensions.<EPackage>filter(_set, _function_4);
    final Consumer<EPackage> _function_5 = (EPackage it) -> {
      this.visitPackages(it, visitedpackage, graph1);
    };
    notYetVisited.forEach(_function_5);
  }
  
  private List<EClass> allEClasses(final EPackage ePackage) {
    TreeIterator<EObject> _eAllContents = ePackage.eAllContents();
    final List<EObject> allContent = IteratorExtensions.<EObject>toList(_eAllContents);
    Iterable<EClass> _filter = Iterables.<EClass>filter(allContent, EClass.class);
    final Function1<EClass, EClass> _function = (EClass it) -> {
      EObject _resolve = EcoreUtil.resolve(it, this.resSet);
      return ((EClass) _resolve);
    };
    Iterable<EClass> _map = IterableExtensions.<EClass, EClass>map(_filter, _function);
    return IterableExtensions.<EClass>toList(_map);
  }
  
  private void addParents(final Graph<EClass> graph1, final EClass e) {
    final Graph.GraphNode node = graph1.addNode(e);
    EList<EClass> _eSuperTypes = e.getESuperTypes();
    final Consumer<EClass> _function = (EClass f) -> {
      final Graph.GraphNode node2 = graph1.addNode(f);
      graph1.addEdge(node, node2);
      this.addParents(graph1, f);
    };
    _eSuperTypes.forEach(_function);
  }
  
  private List<EClass> getDirectlyRelatedTypes(final EList<EReference> list) {
    final Function1<EReference, EClassifier> _function = (EReference it) -> {
      return it.getEType();
    };
    List<EClassifier> _map = ListExtensions.<EReference, EClassifier>map(list, _function);
    Iterable<EClass> _filter = Iterables.<EClass>filter(_map, EClass.class);
    final Function1<EClass, Boolean> _function_1 = (EClass it) -> {
      EPackage _ePackage = it.getEPackage();
      String _name = _ePackage.getName();
      boolean _equals = _name.equals("ecore");
      return Boolean.valueOf((!_equals));
    };
    Iterable<EClass> _filter_1 = IterableExtensions.<EClass>filter(_filter, _function_1);
    return IterableExtensions.<EClass>toList(_filter_1);
  }
  
  private Set<EPackage> getAllDirectPackagesByReference(final Iterable<Graph.GraphNode> nodes, final List<EPackage> ePackages) {
    final Function1<Graph.GraphNode, EList<EReference>> _function = (Graph.GraphNode it) -> {
      return it.elem.getEReferences();
    };
    Iterable<EList<EReference>> _map = IterableExtensions.<Graph.GraphNode, EList<EReference>>map(nodes, _function);
    final Function1<EList<EReference>, List<EClass>> _function_1 = (EList<EReference> it) -> {
      return this.getDirectlyRelatedTypes(it);
    };
    Iterable<List<EClass>> _map_1 = IterableExtensions.<EList<EReference>, List<EClass>>map(_map, _function_1);
    Iterable<EClass> _flatten = Iterables.<EClass>concat(_map_1);
    final Function1<EClass, EPackage> _function_2 = (EClass it) -> {
      return it.getEPackage();
    };
    Iterable<EPackage> _map_2 = IterableExtensions.<EClass, EPackage>map(_flatten, _function_2);
    return IterableExtensions.<EPackage>toSet(_map_2);
  }
  
  private Set<EPackage> getAllDirectPackagesByReference(final Iterable<Graph.GraphNode> nodes, final EPackage ePackage) {
    ArrayList<EPackage> _newArrayList = CollectionLiterals.<EPackage>newArrayList(ePackage);
    return this.getAllDirectPackagesByReference(nodes, _newArrayList);
  }
  
  public List<EPackage> allDirectPackages(final Iterable<Graph.GraphNode> nodes, final EPackage ePackage) {
    ArrayList<EPackage> _newArrayList = CollectionLiterals.<EPackage>newArrayList(ePackage);
    return this.allDirectPackages(nodes, _newArrayList);
  }
  
  public List<EPackage> allDirectPackages(final Iterable<Graph.GraphNode> nodes, final List<EPackage> ePackages) {
    final Set<EPackage> allDirectPackagesByInheritance = this.getDirectPackageByInheritance(nodes, ePackages);
    final Set<EPackage> allDirectPackageByReference = this.getAllDirectPackagesByReference(nodes, ePackages);
    allDirectPackagesByInheritance.addAll(allDirectPackageByReference);
    allDirectPackagesByInheritance.addAll(ePackages);
    Set<EPackage> _set = IterableExtensions.<EPackage>toSet(allDirectPackagesByInheritance);
    List<EPackage> _list = IterableExtensions.<EPackage>toList(_set);
    final Function1<EPackage, String> _function = (EPackage it) -> {
      return it.getName();
    };
    return IterableExtensions.<EPackage, String>sortBy(_list, _function);
  }
  
  private Set<EPackage> getDirectPackageByInheritance(final Iterable<Graph.GraphNode> nodes, final List<EPackage> ePackages) {
    final Function1<Graph.GraphNode, Set<Graph.GraphNode>> _function = (Graph.GraphNode it) -> {
      return it.getOutgoing();
    };
    Iterable<Set<Graph.GraphNode>> _map = IterableExtensions.<Graph.GraphNode, Set<Graph.GraphNode>>map(nodes, _function);
    Iterable<Graph.GraphNode> _flatten = Iterables.<Graph.GraphNode>concat(_map);
    final Function1<Graph.GraphNode, EPackage> _function_1 = (Graph.GraphNode it) -> {
      return it.elem.getEPackage();
    };
    Iterable<EPackage> _map_1 = IterableExtensions.<Graph.GraphNode, EPackage>map(_flatten, _function_1);
    return IterableExtensions.<EPackage>toSet(_map_1);
  }
  
  private Set<EPackage> getDirectPackageByInheritance(final Iterable<Graph.GraphNode> nodes, final EPackage ePackage) {
    ArrayList<EPackage> _newArrayList = CollectionLiterals.<EPackage>newArrayList(ePackage);
    return this.getDirectPackageByInheritance(nodes, _newArrayList);
  }
  
  public List<EClass> getListAllClasses(final List<EPackage> ePackages) {
    final Graph<EClass> graph = this.buildGraph(ePackages);
    final Function1<Graph.GraphNode, EClass> _function = (Graph.GraphNode it) -> {
      return it.elem;
    };
    Iterable<EClass> _map = IterableExtensions.<Graph.GraphNode, EClass>map(graph.nodes, _function);
    return IterableExtensions.<EClass>toList(_map);
  }
  
  private List<EClass> getListAllClasses(final EPackage ePackage) {
    ArrayList<EPackage> _newArrayList = CollectionLiterals.<EPackage>newArrayList(ePackage);
    return this.getListAllClasses(_newArrayList);
  }
  
  public List<EClass> allClassesRec(final EPackage e) {
    final Graph<EClass> graph = this.buildGraph(e);
    final Function1<Graph.GraphNode, EClass> _function = (Graph.GraphNode it) -> {
      return it.elem;
    };
    Iterable<EClass> _map = IterableExtensions.<Graph.GraphNode, EClass>map(graph.nodes, _function);
    List<EClass> _list = IterableExtensions.<EClass>toList(_map);
    final Function1<EClass, String> _function_1 = (EClass it) -> {
      return it.getName();
    };
    return IterableExtensions.<EClass, String>sortBy(_list, _function_1);
  }
  
  public List<EClass> allClassesRec(final Root root) {
    EList<ImportEcore> _importsEcore = root.getImportsEcore();
    final Function1<ImportEcore, EPackage> _function = (ImportEcore it) -> {
      String _ref = it.getRef();
      return this.aleEcoreUtil.loadEPackageByEcorePath(_ref, this.resSet);
    };
    List<EPackage> _map = ListExtensions.<ImportEcore, EPackage>map(_importsEcore, _function);
    final List<EPackage> ePackages = IterableExtensions.<EPackage>toList(_map);
    final Graph<EClass> graph = this.buildGraph(ePackages);
    final Function1<Graph.GraphNode, EClass> _function_1 = (Graph.GraphNode it) -> {
      return it.elem;
    };
    Iterable<EClass> _map_1 = IterableExtensions.<Graph.GraphNode, EClass>map(graph.nodes, _function_1);
    List<EClass> _list = IterableExtensions.<EClass>toList(_map_1);
    final Function1<EClass, String> _function_2 = (EClass it) -> {
      return it.getName();
    };
    return IterableExtensions.<EClass, String>sortBy(_list, _function_2);
  }
  
  public Collection<EClass> ancestors(final EClass clazz) {
    final HashSet<EClass> ret = CollectionLiterals.<EClass>newHashSet();
    EList<EClass> _eSuperTypes = clazz.getESuperTypes();
    boolean _isEmpty = _eSuperTypes.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      EList<EClass> _eSuperTypes_1 = clazz.getESuperTypes();
      final Consumer<EClass> _function = (EClass st) -> {
        ret.add(st);
        Collection<EClass> _ancestors = this.ancestors(st);
        ret.addAll(_ancestors);
      };
      _eSuperTypes_1.forEach(_function);
    }
    return ret;
  }
  
  public String operationInterfacePath(final EClass clazz, final String aleName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(aleName, "");
    _builder.append(".revisitor.operation.");
    String _firstUpper = StringExtensions.toFirstUpper(aleName);
    _builder.append(_firstUpper, "");
    String _name = clazz.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper_1, "");
    _builder.append("Operation");
    return _builder.toString();
  }
  
  public EClass getEClass(final AleClass aleClass, final List<EPackage> ePackages) {
    final List<EClass> classes = this.getListAllClasses(ePackages);
    final Function1<EClass, Boolean> _function = (EClass it) -> {
      String _name = it.getName();
      String _name_1 = aleClass.getName();
      return Boolean.valueOf(Objects.equal(_name, _name_1));
    };
    Iterable<EClass> _filter = IterableExtensions.<EClass>filter(classes, _function);
    return IterableExtensions.<EClass>head(_filter);
  }
  
  public List<Method> methodsRec(final AleClass aleClass, final boolean includeSelf) {
    ArrayList<Method> _xifexpression = null;
    if (includeSelf) {
      EList<Method> _methods = aleClass.getMethods();
      _xifexpression = CollectionLiterals.<Method>newArrayList(((Method[])Conversions.unwrapArray(_methods, Method.class)));
    } else {
      _xifexpression = CollectionLiterals.<Method>newArrayList();
    }
    final List<Method> ret = _xifexpression;
    EList<AleClass> _superClass = aleClass.getSuperClass();
    final Consumer<AleClass> _function = (AleClass parent) -> {
      final List<Method> tmp = this.methodsRec(parent, true);
      final Consumer<Method> _function_1 = (Method tmpM) -> {
        final Function1<Method, Boolean> _function_2 = (Method it) -> {
          return Boolean.valueOf((Objects.equal(it.getName(), tmpM.getName()) && (it.getParams().size() == tmpM.getParams().size())));
        };
        boolean _exists = IterableExtensions.<Method>exists(ret, _function_2);
        boolean _not = (!_exists);
        if (_not) {
          ret.add(tmpM);
        }
      };
      tmp.forEach(_function_1);
    };
    _superClass.forEach(_function);
    return ret;
  }
}
