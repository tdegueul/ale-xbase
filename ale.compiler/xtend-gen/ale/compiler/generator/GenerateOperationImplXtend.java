package ale.compiler.generator;

import ale.compiler.generator.GenerateMethodBodyXtend;
import ale.compiler.generator.JavaPathUtil;
import ale.compiler.generator.TypeUtil;
import ale.compiler.generator.util.AleUtils;
import ale.compiler.generator.util.NamingUtils;
import ale.utils.EcoreUtils;
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
  private GenerateMethodBodyXtend generateMethod;
  
  private ResourceSet rs;
  
  @Extension
  private NamingUtils _namingUtils = new NamingUtils();
  
  @Extension
  private JavaPathUtil _javaPathUtil = new JavaPathUtil();
  
  @Extension
  private AleUtils _aleUtils = new AleUtils();
  
  @Extension
  private EcoreUtils _ecoreUtils = new EcoreUtils();
  
  @Extension
  private TypeUtil typeUtil;
  
  public GenerateOperationImplXtend(final ResourceSet rs) {
    this.rs = rs;
    TypeUtil _typeUtil = new TypeUtil(rs);
    this.typeUtil = _typeUtil;
    GenerateMethodBodyXtend _generateMethodBodyXtend = new GenerateMethodBodyXtend(rs);
    this.generateMethod = _generateMethodBodyXtend;
  }
  
  public String generate(final EClass eClass, final AleClass aleClass, final List<EPackage> ePackages, final Root root) {
    final String aleName = this._namingUtils.getRootNameOrDefault(aleClass);
    StringConcatenation _builder = new StringConcatenation();
    String _firstUpper = StringExtensions.toFirstUpper(aleName);
    _builder.append(_firstUpper, "");
    String _name = eClass.getName();
    _builder.append(_name, "");
    _builder.append("Operation");
    final String clazzName = _builder.toString();
    final List<EClass> allClasses = this._ecoreUtils.getAllClasses(ePackages);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package ");
    _builder_1.append(aleName, "");
    _builder_1.append(".revisitor.operation.impl;");
    _builder_1.newLineIfNotEmpty();
    _builder_1.newLine();
    _builder_1.append("public class ");
    _builder_1.append(clazzName, "");
    _builder_1.append("Impl implements ");
    _builder_1.append(aleName, "");
    _builder_1.append(".revisitor.operation.");
    _builder_1.append(clazzName, "");
    _builder_1.append(" {");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("\t");
    _builder_1.append("private final ");
    String _javaFullPath = this._javaPathUtil.javaFullPath(eClass);
    _builder_1.append(_javaFullPath, "\t");
    _builder_1.append(" self;");
    _builder_1.newLineIfNotEmpty();
    {
      if ((aleClass != null)) {
        _builder_1.append("\t");
        _builder_1.append("private final ");
        _builder_1.append(aleName, "\t");
        _builder_1.append(".revisitor.");
        String _firstUpper_1 = StringExtensions.toFirstUpper(aleName);
        _builder_1.append(_firstUpper_1, "\t");
        _builder_1.append("Revisitor");
        {
          List<EClass> _sortByName = this._ecoreUtils.sortByName(allClasses);
          boolean _hasElements = false;
          for(final EClass clazzS : _sortByName) {
            if (!_hasElements) {
              _hasElements = true;
              _builder_1.append("<", "\t");
            } else {
              _builder_1.appendImmediate(", ", "\t");
            }
            _builder_1.append("? extends ");
            Root _matchingRoot = this.typeUtil.getMatchingRoot(clazzS, root);
            String _rootNameOrDefault = this._namingUtils.getRootNameOrDefault(_matchingRoot);
            String _operationInterfacePath = this._namingUtils.getOperationInterfacePath(clazzS, _rootNameOrDefault);
            _builder_1.append(_operationInterfacePath, "\t");
          }
          if (_hasElements) {
            _builder_1.append(">", "\t");
          }
        }
        _builder_1.append(" alg;");
        _builder_1.newLineIfNotEmpty();
      }
    }
    _builder_1.newLine();
    {
      if ((aleClass != null)) {
        {
          EList<AleClass> _superClass = aleClass.getSuperClass();
          for(final AleClass parent : _superClass) {
            _builder_1.append("\t");
            _builder_1.append("private final ");
            String _rootNameOrDefault_1 = this._namingUtils.getRootNameOrDefault(parent);
            _builder_1.append(_rootNameOrDefault_1, "\t");
            _builder_1.append(".revisitor.operation.impl.");
            String _rootNameOrDefault_2 = this._namingUtils.getRootNameOrDefault(parent);
            String _firstUpper_2 = StringExtensions.toFirstUpper(_rootNameOrDefault_2);
            _builder_1.append(_firstUpper_2, "\t");
            String _name_1 = parent.getName();
            String _firstUpper_3 = StringExtensions.toFirstUpper(_name_1);
            _builder_1.append(_firstUpper_3, "\t");
            _builder_1.append("OperationImpl ");
            String _rootNameOrDefault_3 = this._namingUtils.getRootNameOrDefault(parent);
            _builder_1.append(_rootNameOrDefault_3, "\t");
            _builder_1.append("delegate;");
            _builder_1.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("public ");
    _builder_1.append(clazzName, "\t");
    _builder_1.append("Impl(");
    String _javaFullPath_1 = this._javaPathUtil.javaFullPath(eClass);
    _builder_1.append(_javaFullPath_1, "\t");
    _builder_1.append(" self, ");
    {
      if ((aleClass != null)) {
        _builder_1.append(aleName, "\t");
        _builder_1.append(".revisitor.");
        String _firstUpper_4 = StringExtensions.toFirstUpper(aleName);
        _builder_1.append(_firstUpper_4, "\t");
        _builder_1.append("Revisitor");
        {
          List<EClass> _sortByName_1 = this._ecoreUtils.sortByName(allClasses);
          boolean _hasElements_1 = false;
          for(final EClass clazzS_1 : _sortByName_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
              _builder_1.append("<", "\t");
            } else {
              _builder_1.appendImmediate(", ", "\t");
            }
            _builder_1.append("? extends ");
            Root _matchingRoot_1 = this.typeUtil.getMatchingRoot(clazzS_1, root);
            String _rootNameOrDefault_4 = this._namingUtils.getRootNameOrDefault(_matchingRoot_1);
            String _operationInterfacePath_1 = this._namingUtils.getOperationInterfacePath(clazzS_1, _rootNameOrDefault_4);
            _builder_1.append(_operationInterfacePath_1, "\t");
          }
          if (_hasElements_1) {
            _builder_1.append(">", "\t");
          }
        }
      } else {
        _builder_1.append("Object");
      }
    }
    _builder_1.append(" alg) {");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("\t\t");
    _builder_1.append("this.self = self;");
    _builder_1.newLine();
    {
      if ((aleClass != null)) {
        _builder_1.append("\t\t");
        _builder_1.append("this.alg = alg;");
        _builder_1.newLine();
        {
          EList<AleClass> _superClass_1 = aleClass.getSuperClass();
          for(final AleClass parent_1 : _superClass_1) {
            _builder_1.append("\t\t");
            _builder_1.append("this.");
            String _rootNameOrDefault_5 = this._namingUtils.getRootNameOrDefault(parent_1);
            _builder_1.append(_rootNameOrDefault_5, "\t\t");
            _builder_1.append("delegate = new ");
            String _rootNameOrDefault_6 = this._namingUtils.getRootNameOrDefault(parent_1);
            _builder_1.append(_rootNameOrDefault_6, "\t\t");
            _builder_1.append(".revisitor.operation.impl.");
            String _rootNameOrDefault_7 = this._namingUtils.getRootNameOrDefault(parent_1);
            String _firstUpper_5 = StringExtensions.toFirstUpper(_rootNameOrDefault_7);
            _builder_1.append(_firstUpper_5, "\t\t");
            String _name_2 = parent_1.getName();
            String _firstUpper_6 = StringExtensions.toFirstUpper(_name_2);
            _builder_1.append(_firstUpper_6, "\t\t");
            _builder_1.append("OperationImpl(self, alg);");
            _builder_1.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder_1.append("\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.newLine();
    {
      if ((aleClass != null)) {
        {
          List<Method> _allMethods = this._aleUtils.getAllMethods(aleClass, true);
          for(final Method method : _allMethods) {
            _builder_1.append("\t");
            _builder_1.append("@Override");
            _builder_1.newLine();
            _builder_1.append("\t");
            _builder_1.append("public ");
            Type _type = method.getType();
            String _solveStaticType = this.typeUtil.solveStaticType(_type, ePackages);
            _builder_1.append(_solveStaticType, "\t");
            _builder_1.append(" ");
            String _name_3 = method.getName();
            _builder_1.append(_name_3, "\t");
            _builder_1.append("(");
            {
              EList<Param> _params = method.getParams();
              for(final Param p : _params) {
                Type _type_1 = p.getType();
                String _solveStaticType_1 = this.typeUtil.solveStaticType(_type_1, ePackages);
                _builder_1.append(_solveStaticType_1, "\t");
                _builder_1.append(" ");
                String _name_4 = p.getName();
                _builder_1.append(_name_4, "\t");
              }
            }
            _builder_1.append(") {");
            _builder_1.newLineIfNotEmpty();
            {
              EObject _eContainer = method.eContainer();
              boolean _equals = Objects.equal(_eContainer, aleClass);
              if (_equals) {
                _builder_1.append("\t");
                _builder_1.append("\t");
                String _generate = this.generateMethod.generate(aleClass, method, ePackages, root);
                _builder_1.append(_generate, "\t\t");
                _builder_1.newLineIfNotEmpty();
              } else {
                _builder_1.append("\t");
                _builder_1.append("\t");
                {
                  Type _type_2 = method.getType();
                  String _solveStaticType_2 = this.typeUtil.solveStaticType(_type_2, ePackages);
                  boolean _notEquals = (!Objects.equal(_solveStaticType_2, "void"));
                  if (_notEquals) {
                    _builder_1.append("return ");
                  }
                }
                _builder_1.append("this.");
                EObject _eContainer_1 = method.eContainer();
                String _rootNameOrDefault_8 = this._namingUtils.getRootNameOrDefault(((AleClass) _eContainer_1));
                _builder_1.append(_rootNameOrDefault_8, "\t\t");
                _builder_1.append("delegate.");
                String _name_5 = method.getName();
                _builder_1.append(_name_5, "\t\t");
                _builder_1.append("(");
                {
                  EList<Param> _params_1 = method.getParams();
                  for(final Param p_1 : _params_1) {
                    String _name_6 = p_1.getName();
                    _builder_1.append(_name_6, "\t\t");
                  }
                }
                _builder_1.append(");");
                _builder_1.newLineIfNotEmpty();
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
    _builder_1.newLine();
    return _builder_1.toString();
  }
}
