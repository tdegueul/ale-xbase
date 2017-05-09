package ale.compiler.generator;

import ale.compiler.generator.Graph;
import ale.compiler.generator.GraphUtil;
import ale.compiler.generator.JavaPathUtil;
import ale.xtext.ale.AleClass;
import ale.xtext.ale.ImportAle;
import ale.xtext.ale.LiteralType;
import ale.xtext.ale.OrderedSetType;
import ale.xtext.ale.OutOfScopeType;
import ale.xtext.ale.Root;
import ale.xtext.ale.SequenceType;
import ale.xtext.ale.Type;
import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class TypeUtil {
  @Extension
  private GraphUtil graphUtil;
  
  @Extension
  private JavaPathUtil javaPathUtil = new JavaPathUtil();
  
  private ResourceSet resSet;
  
  public TypeUtil(final ResourceSet resSet) {
    this.resSet = resSet;
    GraphUtil _graphUtil = new GraphUtil(resSet);
    this.graphUtil = _graphUtil;
  }
  
  public String solveStaticType(final Type type, final List<EPackage> ePackages) {
    String _switchResult = null;
    boolean _matched = false;
    if (Objects.equal(type, null)) {
      _matched=true;
      _switchResult = "void";
    }
    if (!_matched) {
      if (type instanceof LiteralType) {
        _matched=true;
        _switchResult = ((LiteralType)type).getLit();
      }
    }
    if (!_matched) {
      if (type instanceof OrderedSetType) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("org.eclipse.emf.common.util.EList<");
        Type _subType = ((OrderedSetType)type).getSubType();
        String _solveStaticType = this.solveStaticType(_subType, ePackages);
        _builder.append(_solveStaticType, "");
        _builder.append(">");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (type instanceof SequenceType) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("org.eclipse.emf.common.util.EList<");
        Type _subType = ((SequenceType)type).getSubType();
        String _solveStaticType = this.solveStaticType(_subType, ePackages);
        _builder.append(_solveStaticType, "");
        _builder.append(">");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (type instanceof OutOfScopeType) {
        _matched=true;
        String _xblockexpression = null;
        {
          Graph<EClass> _buildGraph = this.graphUtil.buildGraph(ePackages);
          final Function1<Graph.GraphNode, EClass> _function = (Graph.GraphNode it) -> {
            return it.elem;
          };
          final Iterable<EClass> allClasses = IterableExtensions.<Graph.GraphNode, EClass>map(_buildGraph.nodes, _function);
          final Function1<EClass, Boolean> _function_1 = (EClass it) -> {
            String _name = it.getName();
            String _externalClass = ((OutOfScopeType)type).getExternalClass();
            return Boolean.valueOf(Objects.equal(_name, _externalClass));
          };
          Iterable<EClass> _filter = IterableExtensions.<EClass>filter(allClasses, _function_1);
          final EClass foundClazz = IterableExtensions.<EClass>head(_filter);
          String _javaFullPath = null;
          if (foundClazz!=null) {
            _javaFullPath=this.javaPathUtil.javaFullPath(foundClazz);
          }
          _xblockexpression = _javaFullPath.toString();
        }
        _switchResult = _xblockexpression;
      }
    }
    return _switchResult;
  }
  
  /**
   * TODO: if not found in ale first ale clazz, try the parents
   */
  public AleClass getAleClass(final String name, final Root root) {
    AleClass ret = null;
    EList<AleClass> _classes = root.getClasses();
    final Function1<AleClass, Boolean> _function = (AleClass aleClass) -> {
      String _name = aleClass.getName();
      return Boolean.valueOf(Objects.equal(_name, name));
    };
    Iterable<AleClass> _filter = IterableExtensions.<AleClass>filter(_classes, _function);
    final AleClass findFirst = IterableExtensions.<AleClass>head(_filter);
    if ((findFirst != null)) {
      ret = findFirst;
    } else {
      EList<ImportAle> _importsAle = root.getImportsAle();
      for (final ImportAle parentRoot : _importsAle) {
        if ((ret == null)) {
          Root _ref = parentRoot.getRef();
          final AleClass aleClass = this.getAleClass(name, _ref);
          if ((aleClass != null)) {
            ret = aleClass;
          }
        }
      }
    }
    return ret;
  }
  
  public Root getMatchingRoot(final EClass eClass, final Root root) {
    String _name = eClass.getName();
    final AleClass newRoot = this.getAleClass(_name, root);
    Root _xifexpression = null;
    if ((newRoot != null)) {
      EObject _eContainer = newRoot.eContainer();
      _xifexpression = ((Root) _eContainer);
    } else {
      _xifexpression = null;
    }
    return _xifexpression;
  }
}
