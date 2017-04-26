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
    boolean _equals = Objects.equal(type, null);
    if (_equals) {
      return "void";
    }
    if ((type instanceof LiteralType)) {
      return ((LiteralType)type).getLit();
    }
    if ((type instanceof OrderedSetType)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("org.eclipse.emf.common.util.EList<");
      Type _subType = ((OrderedSetType)type).getSubType();
      String _solveStaticType = this.solveStaticType(_subType, ePackages);
      _builder.append(_solveStaticType, "");
      _builder.append(">");
      return _builder.toString();
    }
    if ((type instanceof SequenceType)) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("org.eclipse.emf.common.util.EList<");
      Type _subType_1 = ((SequenceType)type).getSubType();
      String _solveStaticType_1 = this.solveStaticType(_subType_1, ePackages);
      _builder_1.append(_solveStaticType_1, "");
      _builder_1.append(">");
      return _builder_1.toString();
    }
    if ((type instanceof OutOfScopeType)) {
      Graph<EClass> _buildGraph = this.graphUtil.buildGraph(ePackages);
      final Function1<Graph.GraphNode, EClass> _function = (Graph.GraphNode it) -> {
        return it.elem;
      };
      final Iterable<EClass> allClasses = IterableExtensions.<Graph.GraphNode, EClass>map(_buildGraph.nodes, _function);
      final Function1<EClass, Boolean> _function_1 = (EClass c) -> {
        String _name = c.getName();
        String _externalClass = ((OutOfScopeType)type).getExternalClass();
        return Boolean.valueOf(Objects.equal(_name, _externalClass));
      };
      Iterable<EClass> _filter = IterableExtensions.<EClass>filter(allClasses, _function_1);
      final EClass foundClazz = IterableExtensions.<EClass>head(_filter);
      CharSequence _javaFullPath = null;
      if (foundClazz!=null) {
        _javaFullPath=this.javaPathUtil.javaFullPath(foundClazz);
      }
      return _javaFullPath.toString();
    }
    return null;
  }
  
  public AleClass getAleClass(final String name, final Root root) {
    AleClass ret = null;
    EList<AleClass> _classes = root.getClasses();
    final Function1<AleClass, Boolean> _function = (AleClass aleClass) -> {
      String _name = aleClass.getName();
      return Boolean.valueOf(Objects.equal(_name, name));
    };
    Iterable<AleClass> _filter = IterableExtensions.<AleClass>filter(_classes, _function);
    final AleClass findFirst = IterableExtensions.<AleClass>head(_filter);
    boolean _notEquals = (!Objects.equal(findFirst, null));
    if (_notEquals) {
      ret = findFirst;
    } else {
      EList<ImportAle> _importsAle = root.getImportsAle();
      for (final ImportAle parentRoot : _importsAle) {
        boolean _equals = Objects.equal(ret, null);
        if (_equals) {
          Root _ref = parentRoot.getRef();
          final AleClass aleClass = this.getAleClass(name, _ref);
          boolean _notEquals_1 = (!Objects.equal(aleClass, null));
          if (_notEquals_1) {
            ret = aleClass;
          }
        }
      }
    }
    return ret;
  }
  
  public Root getMatchingRoot(final EClass eClass, final Root root) {
    String _name = eClass.getName();
    AleClass _aleClass = this.getAleClass(_name, root);
    EObject _eContainer = _aleClass.eContainer();
    return ((Root) _eContainer);
  }
}
