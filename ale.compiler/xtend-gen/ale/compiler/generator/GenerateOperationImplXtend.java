package ale.compiler.generator;

import ale.compiler.generator.GraphUtil;
import ale.compiler.generator.JavaPathUtil;
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
public class GenerateOperationImplXtend {
  @Extension
  private GraphUtil graphUtil;
  
  @Extension
  private TypeUtil typeUtil;
  
  @Extension
  private JavaPathUtil javaPathUtil = new JavaPathUtil();
  
  private ResourceSet resSet;
  
  public GenerateOperationImplXtend(final ResourceSet resSet) {
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
      _builder_1.append(".revisitor.operation.impl;");
      _builder_1.newLineIfNotEmpty();
      _builder_1.newLine();
      _builder_1.append("public class ");
      _builder_1.append(clazzName, "");
      _builder_1.append("Impl implements ");
      _builder_1.append(packageName, "");
      _builder_1.append(".");
      _builder_1.append(aleName, "");
      _builder_1.append(".revisitor.operation.");
      _builder_1.append(clazzName, "");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("{");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("private final ");
      CharSequence _javaFullPath = this.javaPathUtil.javaFullPath(eClass);
      _builder_1.append(_javaFullPath, "\t");
      _builder_1.append(" self;");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t");
      _builder_1.append("private final ");
      _builder_1.append(aleName, "\t");
      _builder_1.append(".revisitor.");
      String _firstUpper_2 = StringExtensions.toFirstUpper(aleName);
      _builder_1.append(_firstUpper_2, "\t");
      _builder_1.append("Revisitor alg;");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t");
      _builder_1.append("public ");
      _builder_1.append(clazzName, "\t");
      _builder_1.append("Impl(");
      CharSequence _javaFullPath_1 = this.javaPathUtil.javaFullPath(eClass);
      _builder_1.append(_javaFullPath_1, "\t");
      _builder_1.append(" self, ");
      _builder_1.append(aleName, "\t");
      _builder_1.append(".revisitor.");
      String _firstUpper_3 = StringExtensions.toFirstUpper(aleName);
      _builder_1.append(_firstUpper_3, "\t");
      _builder_1.append("Revisitor alg) {");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t\t");
      _builder_1.append("this.self = self;");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("this.alg = alg;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      {
        boolean _notEquals_1 = (!Objects.equal(aleClass, null));
        if (_notEquals_1) {
          {
            EList<Method> _methods = aleClass.getMethods();
            for(final Method method : _methods) {
              _builder_1.append("\t");
              _builder_1.append("@Override");
              _builder_1.newLine();
              _builder_1.append("\t");
              _builder_1.append("public ");
              Type _type = method.getType();
              String _solveStaticType = this.typeUtil.solveStaticType(_type, ePackages);
              _builder_1.append(_solveStaticType, "\t");
              _builder_1.append(" ");
              String _name_1 = method.getName();
              _builder_1.append(_name_1, "\t");
              _builder_1.append("(");
              {
                EList<Param> _params = method.getParams();
                for(final Param p : _params) {
                  Type _type_1 = p.getType();
                  String _solveStaticType_1 = this.typeUtil.solveStaticType(_type_1, ePackages);
                  _builder_1.append(_solveStaticType_1, "\t");
                  _builder_1.append(" ");
                  String _name_2 = p.getName();
                  _builder_1.append(_name_2, "\t");
                }
              }
              _builder_1.append(") {");
              _builder_1.newLineIfNotEmpty();
              {
                Type _type_2 = method.getType();
                boolean _notEquals_2 = (!Objects.equal(_type_2, null));
                if (_notEquals_2) {
                  _builder_1.append("\t");
                  _builder_1.append("\t");
                  _builder_1.append("return null;");
                  _builder_1.newLine();
                }
              }
              _builder_1.append("\t");
              _builder_1.append("}");
              _builder_1.newLine();
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
