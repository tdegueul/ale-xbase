package ale.compiler.generator;

import ale.compiler.generator.GraphUtil;
import ale.compiler.generator.TypeUtil;
import ale.xtext.ale.AleClass;
import ale.xtext.ale.Method;
import ale.xtext.ale.Param;
import ale.xtext.ale.Root;
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
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class GenerateOperationInterfaceXtend {
  @Extension
  private GraphUtil graphUtil;
  
  @Extension
  private TypeUtil typeUtil;
  
  private ResourceSet resSet;
  
  public GenerateOperationInterfaceXtend(final ResourceSet resSet) {
    this.resSet = resSet;
    GraphUtil _graphUtil = new GraphUtil(resSet);
    this.graphUtil = _graphUtil;
    TypeUtil _typeUtil = new TypeUtil(resSet);
    this.typeUtil = _typeUtil;
  }
  
  public String generate(final EClass eClass, final AleClass aleClass, final List<EPackage> ePackages, final Root root) {
    String _xblockexpression = null;
    {
      EPackage _ePackage = eClass.getEPackage();
      final String packageName = _ePackage.getName();
      String _xifexpression = null;
      boolean _notEquals = (!Objects.equal(aleClass, null));
      if (_notEquals) {
        EObject _eContainer = aleClass.eContainer();
        _xifexpression = ((Root) _eContainer).getName();
      } else {
        _xifexpression = "void";
      }
      final String aleName = _xifexpression;
      StringConcatenation _builder = new StringConcatenation();
      String _firstUpper = StringExtensions.toFirstUpper(packageName);
      _builder.append(_firstUpper, "");
      String _firstUpper_1 = StringExtensions.toFirstUpper(aleName);
      _builder.append(_firstUpper_1, "");
      String _name = eClass.getName();
      _builder.append(_name, "");
      _builder.append("Operation");
      final String clazzName = _builder.toString();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package ");
      _builder_1.append(packageName, "");
      _builder_1.append(".");
      _builder_1.append(aleName, "");
      _builder_1.append(".revisitor.operation;");
      _builder_1.newLineIfNotEmpty();
      _builder_1.newLine();
      _builder_1.append("public interface ");
      _builder_1.append(clazzName, "");
      _builder_1.newLineIfNotEmpty();
      {
        EList<EClass> _eSuperTypes = eClass.getESuperTypes();
        boolean _hasElements = false;
        for(final EClass ext : _eSuperTypes) {
          if (!_hasElements) {
            _hasElements = true;
            _builder_1.append("extends ", "");
          } else {
            _builder_1.appendImmediate(", ", "");
          }
          Root _matchingRoot = this.typeUtil.getMatchingRoot(ext, root);
          String _name_1 = _matchingRoot.getName();
          String _operationInterfacePath = this.graphUtil.operationInterfacePath(ext, _name_1);
          _builder_1.append(_operationInterfacePath, "");
        }
      }
      _builder_1.append(" ");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("{");
      _builder_1.newLine();
      {
        boolean _notEquals_1 = (!Objects.equal(aleClass, null));
        if (_notEquals_1) {
          {
            EList<Method> _methods = aleClass.getMethods();
            for(final Method method : _methods) {
              _builder_1.append("\t");
              Type _type = method.getType();
              String _solveStaticType = this.typeUtil.solveStaticType(_type, ePackages);
              _builder_1.append(_solveStaticType, "\t");
              _builder_1.append(" ");
              String _name_2 = method.getName();
              _builder_1.append(_name_2, "\t");
              _builder_1.append("(");
              {
                EList<Param> _params = method.getParams();
                for(final Param p : _params) {
                  Type _type_1 = p.getType();
                  String _solveStaticType_1 = this.typeUtil.solveStaticType(_type_1, ePackages);
                  _builder_1.append(_solveStaticType_1, "\t");
                  _builder_1.append(" ");
                  String _name_3 = p.getName();
                  _builder_1.append(_name_3, "\t");
                }
              }
              _builder_1.append(");");
              _builder_1.newLineIfNotEmpty();
            }
          }
        }
      }
      _builder_1.append("}");
      _xblockexpression = _builder_1.toString();
    }
    return _xblockexpression;
  }
}
