package ale.compiler.generator;

import ale.compiler.generator.Graph;
import ale.compiler.generator.GraphUtil;
import ale.compiler.generator.JavaPathUtil;
import ale.compiler.generator.util.DollarGeneratorUtil;
import ale.xtext.ale.Root;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class GenerateRevisitorInterfaceXtend {
  @Extension
  private GraphUtil graphUtil;
  
  @Extension
  private JavaPathUtil javaPathUtil = new JavaPathUtil();
  
  public GenerateRevisitorInterfaceXtend(final ResourceSet resSet) {
    GraphUtil _graphUtil = new GraphUtil(resSet);
    this.graphUtil = _graphUtil;
  }
  
  public String generate(final String name, final List<EPackage> ePackages, final List<Root> parentRoots, final Boolean generateMethods) {
    final Graph<EClass> graph = this.graphUtil.buildGraph(ePackages);
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
    Iterable<EPackage> _xifexpression = null;
    if ((generateMethods).booleanValue()) {
      List<EPackage> _allDirectPackages = this.graphUtil.allDirectPackages(allMethods, ePackages);
      final Function1<EPackage, Boolean> _function_3 = (EPackage it) -> {
        boolean _contains = ePackages.contains(it);
        return Boolean.valueOf((!_contains));
      };
      _xifexpression = IterableExtensions.<EPackage>filter(_allDirectPackages, _function_3);
    } else {
      _xifexpression = this.graphUtil.allDirectPackages(allMethods, ePackages);
    }
    final Iterable<EPackage> allDirectPackages = _xifexpression;
    final List<EClass> allClasses = this.graphUtil.getListAllClasses(ePackages);
    final Function1<EClass, Pair<EClass, List<EClass>>> _function_4 = (EClass currentParent) -> {
      List<EClass> _xblockexpression = null;
      {
        final Function1<EClass, Boolean> _function_5 = (EClass ac) -> {
          return Boolean.valueOf(currentParent.isSuperTypeOf(ac));
        };
        Iterable<EClass> _filter_2 = IterableExtensions.<EClass>filter(allClasses, _function_5);
        final List<EClass> tmp = IterableExtensions.<EClass>toList(_filter_2);
        DollarGeneratorUtil _dollarGeneratorUtil = new DollarGeneratorUtil();
        _dollarGeneratorUtil.sortForDollars(tmp);
        _xblockexpression = tmp;
      }
      return Pair.<EClass, List<EClass>>of(currentParent, _xblockexpression);
    };
    final List<Pair<EClass, List<EClass>>> classPlusItsChildren = ListExtensions.<EClass, Pair<EClass, List<EClass>>>map(allClasses, _function_4);
    String _xifexpression_1 = null;
    boolean _isEmpty = IterableExtensions.isEmpty(allDirectPackages);
    if (_isEmpty) {
      _xifexpression_1 = " extends ";
    } else {
      _xifexpression_1 = ", ";
    }
    final String sep = _xifexpression_1;
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
      final Function1<Graph.GraphNode, String> _function_5 = (Graph.GraphNode it) -> {
        return it.elem.getName();
      };
      List<Graph.GraphNode> _sortBy = IterableExtensions.<Graph.GraphNode, String>sortBy(graph.nodes, _function_5);
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
      final Function1<EPackage, String> _function_6 = (EPackage it) -> {
        return name;
      };
      List<EPackage> _sortBy_1 = IterableExtensions.<EPackage, String>sortBy(allDirectPackages, _function_6);
      boolean _hasElements_1 = false;
      for(final EPackage ePp : _sortBy_1) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
          _builder.append(" extends ", "\t");
        } else {
          _builder.appendImmediate(", ", "\t");
        }
        String _name = ePp.getName();
        CharSequence _revisitorInterfaceJavaPath = this.revisitorInterfaceJavaPath(_name);
        _builder.append(_revisitorInterfaceJavaPath, "\t");
        {
          List<EClass> _allClassesRec = this.graphUtil.allClassesRec(ePp);
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
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      boolean _hasElements_3 = false;
      for(final Root ePp_1 : parentRoots) {
        if (!_hasElements_3) {
          _hasElements_3 = true;
          _builder.append(sep, "\t");
        } else {
          _builder.appendImmediate(", ", "\t");
        }
        String _name_1 = ePp_1.getName();
        CharSequence _revisitorInterfaceJavaPath_1 = this.revisitorInterfaceJavaPath(_name_1);
        _builder.append(_revisitorInterfaceJavaPath_1, "\t");
        {
          List<EClass> _allClassesRec_1 = this.graphUtil.allClassesRec(ePp_1);
          boolean _hasElements_4 = false;
          for(final EClass x_1 : _allClassesRec_1) {
            if (!_hasElements_4) {
              _hasElements_4 = true;
              _builder.append("<", "\t");
            } else {
              _builder.appendImmediate(", ", "\t");
            }
            String _genericType_2 = this.genericType(x_1, false);
            _builder.append(_genericType_2, "\t");
          }
          if (_hasElements_4) {
            _builder.append(">", "\t");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("{");
    _builder.newLine();
    {
      if ((generateMethods).booleanValue()) {
        {
          final Function1<Graph.GraphNode, Boolean> _function_7 = (Graph.GraphNode it) -> {
            boolean _isAbstract = it.elem.isAbstract();
            return Boolean.valueOf((!_isAbstract));
          };
          Iterable<Graph.GraphNode> _filter_2 = IterableExtensions.<Graph.GraphNode>filter(allMethods, _function_7);
          for(final Graph.GraphNode clazzNode : _filter_2) {
            _builder.append("\t");
            String _genericType_3 = this.genericType(clazzNode.elem, false);
            _builder.append(_genericType_3, "\t");
            _builder.append(" ");
            String _name_2 = clazzNode.elem.getName();
            String _firstLower = StringExtensions.toFirstLower(_name_2);
            _builder.append(_firstLower, "\t");
            _builder.append("(final ");
            String _javaFullPath = this.javaPathUtil.javaFullPath(clazzNode.elem);
            _builder.append(_javaFullPath, "\t");
            _builder.append(" ");
            String _name_3 = clazzNode.elem.getName();
            String _firstLower_1 = StringExtensions.toFirstLower(_name_3);
            _builder.append(_firstLower_1, "\t");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
            {
              Collection<EClass> _ancestors = this.graphUtil.ancestors(clazzNode.elem);
              for(final EClass parent : _ancestors) {
                _builder.append("\t");
                String _genericType_4 = this.genericType(parent, false);
                _builder.append(_genericType_4, "\t");
                _builder.append(" ");
                String _name_4 = parent.getName();
                String _firstLower_2 = StringExtensions.toFirstLower(_name_4);
                _builder.append(_firstLower_2, "\t");
                _builder.append("_");
                String _name_5 = clazzNode.elem.getName();
                String _firstLower_3 = StringExtensions.toFirstLower(_name_5);
                _builder.append(_firstLower_3, "\t");
                _builder.append("(final ");
                String _javaFullPath_1 = this.javaPathUtil.javaFullPath(clazzNode.elem);
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
      }
    }
    _builder.append("\t");
    _builder.newLine();
    {
      for(final Pair<EClass, List<EClass>> dollarRoot : classPlusItsChildren) {
        _builder.append("\t");
        _builder.append("default ");
        EClass _key = dollarRoot.getKey();
        String _genericType_5 = this.genericType(_key, false);
        _builder.append(_genericType_5, "\t");
        _builder.append(" $(final ");
        EClass _key_1 = dollarRoot.getKey();
        String _javaFullPath_2 = this.javaPathUtil.javaFullPath(_key_1);
        _builder.append(_javaFullPath_2, "\t");
        _builder.append(" self) {");
        _builder.newLineIfNotEmpty();
        {
          List<EClass> _value = dollarRoot.getValue();
          final Function1<EClass, Boolean> _function_8 = (EClass it) -> {
            EClass _key_2 = dollarRoot.getKey();
            return Boolean.valueOf((!Objects.equal(it, _key_2)));
          };
          Iterable<EClass> _filter_3 = IterableExtensions.<EClass>filter(_value, _function_8);
          final Function1<EClass, Boolean> _function_9 = (EClass it) -> {
            boolean _isAbstract = it.isAbstract();
            return Boolean.valueOf((!_isAbstract));
          };
          Iterable<EClass> _filter_4 = IterableExtensions.<EClass>filter(_filter_3, _function_9);
          for(final EClass subClass : _filter_4) {
            {
              EList<EClass> _eSuperTypes = subClass.getESuperTypes();
              int _size = _eSuperTypes.size();
              boolean _lessEqualsThan = (_size <= 1);
              if (_lessEqualsThan) {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("if(self.eClass().getClassifierID() == ");
                String _classifierFullPath = this.javaPathUtil.classifierFullPath(subClass);
                _builder.append(_classifierFullPath, "\t\t");
                _builder.append(" && self.eClass().getEPackage() == ");
                EPackage _ePackage = subClass.getEPackage();
                String _name_7 = _ePackage.getName();
                _builder.append(_name_7, "\t\t");
                _builder.append(".");
                EPackage _ePackage_1 = subClass.getEPackage();
                String _name_8 = _ePackage_1.getName();
                String _firstUpper = StringExtensions.toFirstUpper(_name_8);
                _builder.append(_firstUpper, "\t\t");
                _builder.append("Package.eINSTANCE) return ");
                String _name_9 = subClass.getName();
                String _firstLower_5 = StringExtensions.toFirstLower(_name_9);
                _builder.append(_firstLower_5, "\t\t");
                _builder.append("((");
                String _javaFullPath_3 = this.javaPathUtil.javaFullPath(subClass);
                _builder.append(_javaFullPath_3, "\t\t");
                _builder.append(") self);");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("if(self.eClass().getClassifierID() == ");
                String _classifierFullPath_1 = this.javaPathUtil.classifierFullPath(subClass);
                _builder.append(_classifierFullPath_1, "\t\t");
                _builder.append(" && self.eClass().getEPackage() == ");
                EPackage _ePackage_2 = subClass.getEPackage();
                String _name_10 = _ePackage_2.getName();
                _builder.append(_name_10, "\t\t");
                _builder.append(".");
                EPackage _ePackage_3 = subClass.getEPackage();
                String _name_11 = _ePackage_3.getName();
                String _firstUpper_1 = StringExtensions.toFirstUpper(_name_11);
                _builder.append(_firstUpper_1, "\t\t");
                _builder.append("Package.eINSTANCE) return ");
                EClass _key_2 = dollarRoot.getKey();
                String _name_12 = _key_2.getName();
                String _firstLower_6 = StringExtensions.toFirstLower(_name_12);
                _builder.append(_firstLower_6, "\t\t");
                _builder.append("_");
                String _name_13 = subClass.getName();
                String _firstLower_7 = StringExtensions.toFirstLower(_name_13);
                _builder.append(_firstLower_7, "\t\t");
                _builder.append("((");
                String _javaFullPath_4 = this.javaPathUtil.javaFullPath(subClass);
                _builder.append(_javaFullPath_4, "\t\t");
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
            String _name_14 = _key_4.getName();
            String _firstLower_8 = StringExtensions.toFirstLower(_name_14);
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
    return _builder.toString();
  }
  
  public String generate(final EPackage ePackage) {
    String _name = ePackage.getName();
    ArrayList<EPackage> _newArrayList = CollectionLiterals.<EPackage>newArrayList(ePackage);
    ArrayList<Root> _newArrayList_1 = CollectionLiterals.<Root>newArrayList();
    return this.generate(_name, _newArrayList, _newArrayList_1, Boolean.valueOf(true));
  }
  
  private CharSequence revisitorInterfaceJavaPath(final String name) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(name, "");
    _builder.append(".revisitor.");
    CharSequence _packageName = GenerateRevisitorInterfaceXtend.toPackageName(name);
    _builder.append(_packageName, "");
    return _builder;
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
    final Function1<String, String> _function = (String it) -> {
      return StringExtensions.toFirstUpper(it);
    };
    List<String> _map = ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(_split)), _function);
    return IterableExtensions.join(_map);
  }
}
