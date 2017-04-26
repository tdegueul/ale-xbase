package ale.compiler.generator;

import ale.compiler.generator.Graph;
import ale.compiler.generator.util.DollarGeneratorUtil;
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
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class GenerateRevisitorInterfaceXtend {
  private ResourceSet resSet;
  
  public GenerateRevisitorInterfaceXtend(final ResourceSet resSet) {
    this.resSet = resSet;
  }
  
  private Graph<EClass> buildGraph(final EPackage ePackage) {
    ArrayList<EPackage> _newArrayList = CollectionLiterals.<EPackage>newArrayList(ePackage);
    return this.buildGraph(_newArrayList);
  }
  
  private Graph<EClass> buildGraph(final List<EPackage> ePackages) {
    Graph<EClass> _xblockexpression = null;
    {
      final Graph<EClass> graph1 = new Graph<EClass>();
      final HashSet<EPackage> visitedPackages = CollectionLiterals.<EPackage>newHashSet();
      final Consumer<EPackage> _function = (EPackage it) -> {
        this.visitPackages(it, visitedPackages, graph1);
      };
      ePackages.forEach(_function);
      _xblockexpression = graph1;
    }
    return _xblockexpression;
  }
  
  private List<EClass> allEClasses(final EPackage ePackage) {
    List<EClass> _xblockexpression = null;
    {
      TreeIterator<EObject> _eAllContents = ePackage.eAllContents();
      final List<EObject> allContent = IteratorExtensions.<EObject>toList(_eAllContents);
      final Function1<EObject, Boolean> _function = (EObject it) -> {
        return Boolean.valueOf((it instanceof EClass));
      };
      Iterable<EObject> _filter = IterableExtensions.<EObject>filter(allContent, _function);
      final Function1<EObject, EObject> _function_1 = (EObject it) -> {
        return EcoreUtil.resolve(it, this.resSet);
      };
      Iterable<EObject> _map = IterableExtensions.<EObject, EObject>map(_filter, _function_1);
      final Function1<EObject, EClass> _function_2 = (EObject it) -> {
        return ((EClass) it);
      };
      Iterable<EClass> _map_1 = IterableExtensions.<EObject, EClass>map(_map, _function_2);
      _xblockexpression = IterableExtensions.<EClass>toList(_map_1);
    }
    return _xblockexpression;
  }
  
  private List<EClass> getDirectlyRelatedTypes(final EList<EReference> list) {
    final Function1<EReference, EClassifier> _function = (EReference f) -> {
      return f.getEType();
    };
    List<EClassifier> _map = ListExtensions.<EReference, EClassifier>map(list, _function);
    final Function1<EClassifier, Boolean> _function_1 = (EClassifier z) -> {
      return Boolean.valueOf((z instanceof EClass));
    };
    Iterable<EClassifier> _filter = IterableExtensions.<EClassifier>filter(_map, _function_1);
    final Function1<EClassifier, EClass> _function_2 = (EClassifier q) -> {
      return ((EClass) q);
    };
    Iterable<EClass> _map_1 = IterableExtensions.<EClassifier, EClass>map(_filter, _function_2);
    final Function1<EClass, Boolean> _function_3 = (EClass x) -> {
      EPackage _ePackage = x.getEPackage();
      String _name = _ePackage.getName();
      boolean _equals = _name.equals("ecore");
      return Boolean.valueOf((!_equals));
    };
    Iterable<EClass> _filter_1 = IterableExtensions.<EClass>filter(_map_1, _function_3);
    return IterableExtensions.<EClass>toList(_filter_1);
  }
  
  private void visitPackages(final EPackage ePackage, final HashSet<EPackage> visitedpackage, final Graph<EClass> graph1) {
    boolean _notEquals = (!Objects.equal(ePackage, null));
    if (_notEquals) {
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
    final Function1<Graph.GraphNode, String> _function_2 = (Graph.GraphNode e) -> {
      return e.elem.getName();
    };
    List<Graph.GraphNode> _sortBy = IterableExtensions.<Graph.GraphNode, String>sortBy(graph1.nodes, _function_2);
    final Function1<Graph.GraphNode, EPackage> _function_3 = (Graph.GraphNode e) -> {
      return e.elem.getEPackage();
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
  
  private List<EPackage> allDirectPackages(final Iterable<Graph.GraphNode> nodes, final List<EPackage> ePackages) {
    List<EPackage> _xblockexpression = null;
    {
      final Set<EPackage> allDirectPackagesByInheritance = this.getDirectPackageByInheritance(nodes, ePackages);
      final Set<EPackage> allDirectPackageByReference = this.getAllDirectPackagesByReference(nodes, ePackages);
      allDirectPackagesByInheritance.addAll(allDirectPackageByReference);
      Set<EPackage> _set = IterableExtensions.<EPackage>toSet(allDirectPackagesByInheritance);
      List<EPackage> _list = IterableExtensions.<EPackage>toList(_set);
      final Function1<EPackage, String> _function = (EPackage it) -> {
        return it.getName();
      };
      _xblockexpression = IterableExtensions.<EPackage, String>sortBy(_list, _function);
    }
    return _xblockexpression;
  }
  
  private List<EPackage> allDirectPackages(final Iterable<Graph.GraphNode> nodes, final EPackage ePackage) {
    ArrayList<EPackage> _newArrayList = CollectionLiterals.<EPackage>newArrayList(ePackage);
    return this.allDirectPackages(nodes, _newArrayList);
  }
  
  private Set<EPackage> getDirectPackageByInheritance(final Iterable<Graph.GraphNode> nodes, final List<EPackage> ePackages) {
    final Function1<Graph.GraphNode, Set<Graph.GraphNode>> _function = (Graph.GraphNode e) -> {
      return e.getOutgoing();
    };
    Iterable<Set<Graph.GraphNode>> _map = IterableExtensions.<Graph.GraphNode, Set<Graph.GraphNode>>map(nodes, _function);
    Iterable<Graph.GraphNode> _flatten = Iterables.<Graph.GraphNode>concat(_map);
    final Function1<Graph.GraphNode, EPackage> _function_1 = (Graph.GraphNode e) -> {
      return e.elem.getEPackage();
    };
    Iterable<EPackage> _map_1 = IterableExtensions.<Graph.GraphNode, EPackage>map(_flatten, _function_1);
    final Function1<EPackage, Boolean> _function_2 = (EPackage it) -> {
      boolean _contains = ePackages.contains(it);
      return Boolean.valueOf((!_contains));
    };
    Iterable<EPackage> _filter = IterableExtensions.<EPackage>filter(_map_1, _function_2);
    return IterableExtensions.<EPackage>toSet(_filter);
  }
  
  private Set<EPackage> getDirectPackageByInheritance(final Iterable<Graph.GraphNode> nodes, final EPackage ePackage) {
    ArrayList<EPackage> _newArrayList = CollectionLiterals.<EPackage>newArrayList(ePackage);
    return this.getDirectPackageByInheritance(nodes, _newArrayList);
  }
  
  private Set<EPackage> getAllDirectPackagesByReference(final Iterable<Graph.GraphNode> nodes, final List<EPackage> ePackages) {
    final Function1<Graph.GraphNode, EList<EReference>> _function = (Graph.GraphNode e) -> {
      return e.elem.getEReferences();
    };
    Iterable<EList<EReference>> _map = IterableExtensions.<Graph.GraphNode, EList<EReference>>map(nodes, _function);
    final Function1<EList<EReference>, List<EClass>> _function_1 = (EList<EReference> e) -> {
      return this.getDirectlyRelatedTypes(e);
    };
    Iterable<List<EClass>> _map_1 = IterableExtensions.<EList<EReference>, List<EClass>>map(_map, _function_1);
    Iterable<EClass> _flatten = Iterables.<EClass>concat(_map_1);
    final Function1<EClass, EPackage> _function_2 = (EClass e) -> {
      return e.getEPackage();
    };
    Iterable<EPackage> _map_2 = IterableExtensions.<EClass, EPackage>map(_flatten, _function_2);
    final Function1<EPackage, Boolean> _function_3 = (EPackage e) -> {
      boolean _contains = ePackages.contains(e);
      return Boolean.valueOf((!_contains));
    };
    Iterable<EPackage> _filter = IterableExtensions.<EPackage>filter(_map_2, _function_3);
    return IterableExtensions.<EPackage>toSet(_filter);
  }
  
  private Set<EPackage> getAllDirectPackagesByReference(final Iterable<Graph.GraphNode> nodes, final EPackage ePackage) {
    ArrayList<EPackage> _newArrayList = CollectionLiterals.<EPackage>newArrayList();
    return this.getAllDirectPackagesByReference(nodes, _newArrayList);
  }
  
  private List<EClass> allClassesRec(final EPackage e) {
    List<EClass> _xblockexpression = null;
    {
      final Graph<EClass> graph = this.buildGraph(e);
      final Function1<Graph.GraphNode, EClass> _function = (Graph.GraphNode it) -> {
        return it.elem;
      };
      Iterable<EClass> _map = IterableExtensions.<Graph.GraphNode, EClass>map(graph.nodes, _function);
      List<EClass> _list = IterableExtensions.<EClass>toList(_map);
      final Function1<EClass, String> _function_1 = (EClass it) -> {
        return it.getName();
      };
      _xblockexpression = IterableExtensions.<EClass, String>sortBy(_list, _function_1);
    }
    return _xblockexpression;
  }
  
  private List<EClass> getListAllClasses(final EPackage ePackage) {
    ArrayList<EPackage> _newArrayList = CollectionLiterals.<EPackage>newArrayList(ePackage);
    return this.getListAllClasses(_newArrayList);
  }
  
  private List<EClass> getListAllClasses(final List<EPackage> ePackages) {
    List<EClass> _xblockexpression = null;
    {
      final Graph<EClass> graph = this.buildGraph(ePackages);
      final Function1<Graph.GraphNode, EClass> _function = (Graph.GraphNode it) -> {
        return it.elem;
      };
      Iterable<EClass> _map = IterableExtensions.<Graph.GraphNode, EClass>map(graph.nodes, _function);
      _xblockexpression = IterableExtensions.<EClass>toList(_map);
    }
    return _xblockexpression;
  }
  
  public String generate(final String name, final List<EPackage> ePackages) {
    String _xblockexpression = null;
    {
      final Graph<EClass> graph = this.buildGraph(ePackages);
      final Function1<Graph.GraphNode, Boolean> _function = (Graph.GraphNode it) -> {
        EPackage _ePackage = it.elem.getEPackage();
        return Boolean.valueOf(ePackages.contains(_ePackage));
      };
      Iterable<Graph.GraphNode> _filter = IterableExtensions.<Graph.GraphNode>filter(graph.nodes, _function);
      final Function1<Graph.GraphNode, Boolean> _function_1 = (Graph.GraphNode it) -> {
        boolean _isAbstract = it.elem.isAbstract();
        return Boolean.valueOf((!_isAbstract));
      };
      Iterable<Graph.GraphNode> _filter_1 = IterableExtensions.<Graph.GraphNode>filter(_filter, _function_1);
      final Function1<Graph.GraphNode, String> _function_2 = (Graph.GraphNode it) -> {
        return it.elem.getName();
      };
      final List<Graph.GraphNode> allMethods = IterableExtensions.<Graph.GraphNode, String>sortBy(_filter_1, _function_2);
      final List<EPackage> allDirectPackages = this.allDirectPackages(allMethods, ePackages);
      final List<EClass> allClasses = this.getListAllClasses(ePackages);
      final Function1<EClass, Pair<EClass, List<EClass>>> _function_3 = (EClass currentParent) -> {
        List<EClass> _xblockexpression_1 = null;
        {
          final Function1<EClass, Boolean> _function_4 = (EClass ac) -> {
            return Boolean.valueOf(currentParent.isSuperTypeOf(ac));
          };
          Iterable<EClass> _filter_2 = IterableExtensions.<EClass>filter(allClasses, _function_4);
          final List<EClass> tmp = IterableExtensions.<EClass>toList(_filter_2);
          DollarGeneratorUtil _dollarGeneratorUtil = new DollarGeneratorUtil();
          _dollarGeneratorUtil.sortForDollars(tmp);
          _xblockexpression_1 = tmp;
        }
        return Pair.<EClass, List<EClass>>of(currentParent, _xblockexpression_1);
      };
      final List<Pair<EClass, List<EClass>>> classPlusItsChildren = ListExtensions.<EClass, Pair<EClass, List<EClass>>>map(allClasses, _function_3);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package ");
      _builder.append(name, "");
      _builder.append(".revisitor;");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("public interface ");
      CharSequence _packageName = GenerateRevisitorInterfaceXtend.toPackageName(name);
      _builder.append(_packageName, "");
      {
        final Function1<Graph.GraphNode, String> _function_4 = (Graph.GraphNode x) -> {
          return x.elem.getName();
        };
        List<Graph.GraphNode> _sortBy = IterableExtensions.<Graph.GraphNode, String>sortBy(graph.nodes, _function_4);
        boolean _hasElements = false;
        for(final Graph.GraphNode clazz : _sortBy) {
          if (!_hasElements) {
            _hasElements = true;
            _builder.append("<", "");
          } else {
            _builder.appendImmediate(",", "");
          }
          String _genericType = this.genericType(clazz.elem, true);
          _builder.append(_genericType, "");
        }
        if (_hasElements) {
          _builder.append(">", "");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      {
        final Function1<EPackage, String> _function_5 = (EPackage it) -> {
          return name;
        };
        List<EPackage> _sortBy_1 = IterableExtensions.<EPackage, String>sortBy(allDirectPackages, _function_5);
        boolean _hasElements_1 = false;
        for(final EPackage ePp : _sortBy_1) {
          if (!_hasElements_1) {
            _hasElements_1 = true;
            _builder.append(" extends ", "\t");
          } else {
            _builder.appendImmediate(", ", "\t");
          }
          String _name = ePp.getName();
          _builder.append(_name, "\t");
          _builder.append(".revisitor.");
          String _name_1 = ePp.getName();
          CharSequence _packageName_1 = GenerateRevisitorInterfaceXtend.toPackageName(_name_1);
          _builder.append(_packageName_1, "\t");
          {
            List<EClass> _allClassesRec = this.allClassesRec(ePp);
            boolean _hasElements_2 = false;
            for(final EClass x : _allClassesRec) {
              if (!_hasElements_2) {
                _hasElements_2 = true;
                _builder.append("<", "\t");
              } else {
                _builder.appendImmediate(", ", "\t");
              }
              String _genericType_1 = this.genericType(x, false);
              _builder.append(_genericType_1, "\t");
            }
            if (_hasElements_2) {
              _builder.append(">", "\t");
            }
          }
        }
      }
      _builder.append(" {");
      _builder.newLineIfNotEmpty();
      {
        for(final Graph.GraphNode clazzNode : allMethods) {
          _builder.append("\t");
          String _genericType_2 = this.genericType(clazzNode.elem, false);
          _builder.append(_genericType_2, "\t");
          _builder.append(" ");
          String _name_2 = clazzNode.elem.getName();
          String _firstLower = StringExtensions.toFirstLower(_name_2);
          _builder.append(_firstLower, "\t");
          _builder.append("(final ");
          CharSequence _javaFullPath = GenerateRevisitorInterfaceXtend.javaFullPath(clazzNode.elem);
          _builder.append(_javaFullPath, "\t");
          _builder.append(" ");
          String _name_3 = clazzNode.elem.getName();
          String _firstLower_1 = StringExtensions.toFirstLower(_name_3);
          _builder.append(_firstLower_1, "\t");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
          {
            Collection<EClass> _ancestors = this.ancestors(clazzNode.elem);
            for(final EClass parent : _ancestors) {
              _builder.append("\t");
              String _genericType_3 = this.genericType(parent, false);
              _builder.append(_genericType_3, "\t");
              _builder.append(" ");
              String _name_4 = parent.getName();
              String _firstLower_2 = StringExtensions.toFirstLower(_name_4);
              _builder.append(_firstLower_2, "\t");
              _builder.append("_");
              String _name_5 = clazzNode.elem.getName();
              String _firstLower_3 = StringExtensions.toFirstLower(_name_5);
              _builder.append(_firstLower_3, "\t");
              _builder.append("(final ");
              CharSequence _javaFullPath_1 = GenerateRevisitorInterfaceXtend.javaFullPath(clazzNode.elem);
              _builder.append(_javaFullPath_1, "\t");
              _builder.append(" ");
              String _name_6 = clazzNode.elem.getName();
              String _firstLower_4 = StringExtensions.toFirstLower(_name_6);
              _builder.append(_firstLower_4, "\t");
              _builder.append(");");
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.append("\t");
          _builder.newLine();
        }
      }
      _builder.append("\t");
      _builder.newLine();
      {
        for(final Pair<EClass, List<EClass>> dollarRoot : classPlusItsChildren) {
          _builder.append("\t");
          _builder.append("default ");
          EClass _key = dollarRoot.getKey();
          String _genericType_4 = this.genericType(_key, false);
          _builder.append(_genericType_4, "\t");
          _builder.append(" $(final ");
          EClass _key_1 = dollarRoot.getKey();
          CharSequence _javaFullPath_2 = GenerateRevisitorInterfaceXtend.javaFullPath(_key_1);
          _builder.append(_javaFullPath_2, "\t");
          _builder.append(" self) {");
          _builder.newLineIfNotEmpty();
          {
            List<EClass> _value = dollarRoot.getValue();
            final Function1<EClass, Boolean> _function_6 = (EClass it) -> {
              EClass _key_2 = dollarRoot.getKey();
              return Boolean.valueOf((!Objects.equal(it, _key_2)));
            };
            Iterable<EClass> _filter_2 = IterableExtensions.<EClass>filter(_value, _function_6);
            for(final EClass subClass : _filter_2) {
              {
                EList<EClass> _eSuperTypes = subClass.getESuperTypes();
                int _size = _eSuperTypes.size();
                boolean _lessEqualsThan = (_size <= 1);
                if (_lessEqualsThan) {
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("if(self instanceof ");
                  CharSequence _javaFullPath_3 = GenerateRevisitorInterfaceXtend.javaFullPath(subClass);
                  _builder.append(_javaFullPath_3, "\t\t");
                  _builder.append(") return ");
                  String _name_7 = subClass.getName();
                  String _firstLower_5 = StringExtensions.toFirstLower(_name_7);
                  _builder.append(_firstLower_5, "\t\t");
                  _builder.append("((");
                  CharSequence _javaFullPath_4 = GenerateRevisitorInterfaceXtend.javaFullPath(subClass);
                  _builder.append(_javaFullPath_4, "\t\t");
                  _builder.append(") self);");
                  _builder.newLineIfNotEmpty();
                } else {
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("if(self instanceof ");
                  CharSequence _javaFullPath_5 = GenerateRevisitorInterfaceXtend.javaFullPath(subClass);
                  _builder.append(_javaFullPath_5, "\t\t");
                  _builder.append(") return ");
                  EClass _key_2 = dollarRoot.getKey();
                  String _name_8 = _key_2.getName();
                  String _firstLower_6 = StringExtensions.toFirstLower(_name_8);
                  _builder.append(_firstLower_6, "\t\t");
                  _builder.append("_");
                  String _name_9 = subClass.getName();
                  String _firstLower_7 = StringExtensions.toFirstLower(_name_9);
                  _builder.append(_firstLower_7, "\t\t");
                  _builder.append("((");
                  CharSequence _javaFullPath_6 = GenerateRevisitorInterfaceXtend.javaFullPath(subClass);
                  _builder.append(_javaFullPath_6, "\t\t");
                  _builder.append(") self);");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
          {
            EClass _key_3 = dollarRoot.getKey();
            boolean _isAbstract = _key_3.isAbstract();
            if (_isAbstract) {
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("return null;");
              _builder.newLine();
            } else {
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("return ");
              EClass _key_4 = dollarRoot.getKey();
              String _name_10 = _key_4.getName();
              String _firstLower_8 = StringExtensions.toFirstLower(_name_10);
              _builder.append(_firstLower_8, "\t\t");
              _builder.append("(self);");
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
        }
      }
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  public String generate(final EPackage ePackage) {
    String _name = ePackage.getName();
    ArrayList<EPackage> _newArrayList = CollectionLiterals.<EPackage>newArrayList(ePackage);
    return this.generate(_name, _newArrayList);
  }
  
  private Collection<EClass> ancestors(final EClass clazz) {
    HashSet<EClass> _xblockexpression = null;
    {
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
      _xblockexpression = ret;
    }
    return _xblockexpression;
  }
  
  private String genericType(final EClass clazz, final boolean extend) {
    StringConcatenation _builder = new StringConcatenation();
    EPackage _ePackage = clazz.getEPackage();
    String _name = _ePackage.getName();
    String _replaceAll = _name.replaceAll("\\.", "");
    String _firstUpper = StringExtensions.toFirstUpper(_replaceAll);
    _builder.append(_firstUpper, "");
    _builder.append("__");
    String _name_1 = clazz.getName();
    _builder.append(_name_1, "");
    _builder.append("T");
    {
      if (((clazz.getESuperTypes().size() == 1) && extend)) {
        _builder.append(" extends ");
        EList<EClass> _eSuperTypes = clazz.getESuperTypes();
        EClass _head = IterableExtensions.<EClass>head(_eSuperTypes);
        String _genericType = this.genericType(_head, false);
        _builder.append(_genericType, "");
      }
    }
    return _builder.toString();
  }
  
  private static CharSequence toPackageName(final String name) {
    StringConcatenation _builder = new StringConcatenation();
    String _className = GenerateRevisitorInterfaceXtend.toClassName(name);
    _builder.append(_className, "");
    _builder.append("Revisitor");
    return _builder;
  }
  
  private static String toClassName(final String name) {
    String[] _split = name.split("\\.");
    final Function1<String, String> _function = (String e) -> {
      return StringExtensions.toFirstUpper(e);
    };
    List<String> _map = ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(_split)), _function);
    return IterableExtensions.join(_map);
  }
  
  private static CharSequence javaFullPath(final EClass eClass) {
    StringConcatenation _builder = new StringConcatenation();
    EPackage _ePackage = eClass.getEPackage();
    String _name = _ePackage.getName();
    _builder.append(_name, "");
    _builder.append(".");
    String _name_1 = eClass.getName();
    _builder.append(_name_1, "");
    return _builder;
  }
}
