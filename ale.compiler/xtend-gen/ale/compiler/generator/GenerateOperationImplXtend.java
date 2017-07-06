package ale.compiler.generator;

import ale.compiler.generator.GenerateMethodBodyXtend;
import ale.compiler.generator.Graph;
import ale.compiler.generator.GraphUtil;
import ale.compiler.generator.JavaPathUtil;
import ale.compiler.generator.TypeUtil;
import ale.compiler.generator.util.NameUtil;
import ale.xtext.ale.AbstractMethod;
import ale.xtext.ale.AleClass;
import ale.xtext.ale.ConcreteMethod;
import ale.xtext.ale.Method;
import ale.xtext.ale.Param;
import ale.xtext.ale.Root;
import ale.xtext.ale.Type;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
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
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class GenerateOperationImplXtend {
  @Extension
  private GraphUtil graphUtil;
  
  @Extension
  private TypeUtil typeUtil;
  
  @Extension
  private JavaPathUtil javaPathUtil = new JavaPathUtil();
  
  private GenerateMethodBodyXtend generateMethod;
  
  private ResourceSet resSet;
  
  @Extension
  private NameUtil nameUtil = new NameUtil();
  
  public GenerateOperationImplXtend(final ResourceSet resSet) {
    this.resSet = resSet;
    GraphUtil _graphUtil = new GraphUtil(resSet);
    this.graphUtil = _graphUtil;
    TypeUtil _typeUtil = new TypeUtil(resSet);
    this.typeUtil = _typeUtil;
    GenerateMethodBodyXtend _generateMethodBodyXtend = new GenerateMethodBodyXtend(resSet);
    this.generateMethod = _generateMethodBodyXtend;
  }
  
  public String generate(final EClass eClass, final AleClass aleClass, final List<EPackage> ePackages, final Root root) {
    String _xblockexpression = null;
    {
      final String aleName = this.nameUtil.rootNameOrDefault(aleClass);
      StringConcatenation _builder = new StringConcatenation();
      String _firstUpper = StringExtensions.toFirstUpper(aleName);
      _builder.append(_firstUpper, "");
      String _name = eClass.getName();
      _builder.append(_name, "");
      _builder.append("Operation");
      final String clazzName = _builder.toString();
      final Graph<EClass> graph = this.graphUtil.buildGraph(ePackages);
      final boolean abstract_ = ((aleClass != null) && (IterableExtensions.size(Iterables.<AbstractMethod>filter(aleClass.getMethods(), AbstractMethod.class)) > 0));
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package ");
      _builder_1.append(aleName, "");
      _builder_1.append(".revisitor.operation.impl;");
      _builder_1.newLineIfNotEmpty();
      _builder_1.newLine();
      _builder_1.append("public ");
      {
        if (abstract_) {
          _builder_1.append("abstract");
        }
      }
      _builder_1.append(" class ");
      _builder_1.append(clazzName, "");
      _builder_1.append("Impl implements ");
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
      {
        boolean _notEquals = (!Objects.equal(aleClass, null));
        if (_notEquals) {
          _builder_1.append("\t");
          _builder_1.append("private final ");
          _builder_1.append(aleName, "\t");
          _builder_1.append(".revisitor.");
          String _firstUpper_1 = StringExtensions.toFirstUpper(aleName);
          _builder_1.append(_firstUpper_1, "\t");
          _builder_1.append("Revisitor");
          {
            final Function1<Graph.GraphNode, EClass> _function = (Graph.GraphNode it) -> {
              return it.elem;
            };
            Iterable<EClass> _map = IterableExtensions.<Graph.GraphNode, EClass>map(graph.nodes, _function);
            final Function1<EClass, String> _function_1 = (EClass it) -> {
              return it.getName();
            };
            List<EClass> _sortBy = IterableExtensions.<EClass, String>sortBy(_map, _function_1);
            boolean _hasElements = false;
            for(final EClass clazzS : _sortBy) {
              if (!_hasElements) {
                _hasElements = true;
                _builder_1.append("<", "\t");
              } else {
                _builder_1.appendImmediate(", ", "\t");
              }
              _builder_1.append("? extends ");
              Root _matchingRoot = this.typeUtil.getMatchingRoot(clazzS, root);
              String _rootNameOrDefault = this.nameUtil.rootNameOrDefault(_matchingRoot);
              String _operationInterfacePath = this.graphUtil.operationInterfacePath(clazzS, _rootNameOrDefault);
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
      _builder_1.append("\t");
      _builder_1.newLine();
      {
        boolean _notEquals_1 = (!Objects.equal(aleClass, null));
        if (_notEquals_1) {
          {
            EList<AleClass> _superClass = aleClass.getSuperClass();
            for(final AleClass parent : _superClass) {
              _builder_1.append("\t");
              _builder_1.append("private final ");
              String _rootNameOrDefault_1 = this.nameUtil.rootNameOrDefault(parent);
              _builder_1.append(_rootNameOrDefault_1, "\t");
              _builder_1.append(".revisitor.operation.impl.");
              String _rootNameOrDefault_2 = this.nameUtil.rootNameOrDefault(parent);
              String _firstUpper_2 = StringExtensions.toFirstUpper(_rootNameOrDefault_2);
              _builder_1.append(_firstUpper_2, "\t");
              String _name_1 = parent.getName();
              String _firstUpper_3 = StringExtensions.toFirstUpper(_name_1);
              _builder_1.append(_firstUpper_3, "\t");
              _builder_1.append("OperationImpl ");
              String _rootNameOrDefault_3 = this.nameUtil.rootNameOrDefault(parent);
              _builder_1.append(_rootNameOrDefault_3, "\t");
              _builder_1.append("delegate;");
              _builder_1.newLineIfNotEmpty();
            }
          }
        }
      }
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public ");
      _builder_1.append(clazzName, "\t");
      _builder_1.append("Impl(");
      CharSequence _javaFullPath_1 = this.javaPathUtil.javaFullPath(eClass);
      _builder_1.append(_javaFullPath_1, "\t");
      _builder_1.append(" self, ");
      {
        boolean _notEquals_2 = (!Objects.equal(aleClass, null));
        if (_notEquals_2) {
          _builder_1.append(aleName, "\t");
          _builder_1.append(".revisitor.");
          String _firstUpper_4 = StringExtensions.toFirstUpper(aleName);
          _builder_1.append(_firstUpper_4, "\t");
          _builder_1.append("Revisitor");
          {
            final Function1<Graph.GraphNode, EClass> _function_2 = (Graph.GraphNode it) -> {
              return it.elem;
            };
            Iterable<EClass> _map_1 = IterableExtensions.<Graph.GraphNode, EClass>map(graph.nodes, _function_2);
            final Function1<EClass, String> _function_3 = (EClass it) -> {
              return it.getName();
            };
            List<EClass> _sortBy_1 = IterableExtensions.<EClass, String>sortBy(_map_1, _function_3);
            boolean _hasElements_1 = false;
            for(final EClass clazzS_1 : _sortBy_1) {
              if (!_hasElements_1) {
                _hasElements_1 = true;
                _builder_1.append("<", "\t");
              } else {
                _builder_1.appendImmediate(", ", "\t");
              }
              _builder_1.append("? extends ");
              Root _matchingRoot_1 = this.typeUtil.getMatchingRoot(clazzS_1, root);
              String _rootNameOrDefault_4 = this.nameUtil.rootNameOrDefault(_matchingRoot_1);
              String _operationInterfacePath_1 = this.graphUtil.operationInterfacePath(clazzS_1, _rootNameOrDefault_4);
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
      _builder_1.append("  alg) {");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t\t");
      _builder_1.append("this.self = self;");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.newLine();
      {
        boolean _notEquals_3 = (!Objects.equal(aleClass, null));
        if (_notEquals_3) {
          _builder_1.append("\t\t");
          _builder_1.append("this.alg = alg;");
          _builder_1.newLine();
          {
            EList<AleClass> _superClass_1 = aleClass.getSuperClass();
            for(final AleClass parent_1 : _superClass_1) {
              _builder_1.append("\t\t");
              _builder_1.append("this.");
              String _rootNameOrDefault_5 = this.nameUtil.rootNameOrDefault(parent_1);
              _builder_1.append(_rootNameOrDefault_5, "\t\t");
              _builder_1.append("delegate = new ");
              String _rootNameOrDefault_6 = this.nameUtil.rootNameOrDefault(parent_1);
              _builder_1.append(_rootNameOrDefault_6, "\t\t");
              _builder_1.append(".revisitor.operation.impl.");
              String _rootNameOrDefault_7 = this.nameUtil.rootNameOrDefault(parent_1);
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
      {
        boolean _notEquals_4 = (!Objects.equal(aleClass, null));
        if (_notEquals_4) {
          {
            List<Method> _methodsRec = this.graphUtil.methodsRec(aleClass, true);
            for(final Method method : _methodsRec) {
              {
                if ((method instanceof ConcreteMethod)) {
                  _builder_1.append("\t");
                  _builder_1.append("@Override");
                  _builder_1.newLine();
                  _builder_1.append("\t");
                  _builder_1.append("public ");
                  Type _type = ((ConcreteMethod)method).getType();
                  String _solveStaticType = this.typeUtil.solveStaticType(_type, ePackages);
                  _builder_1.append(_solveStaticType, "\t");
                  _builder_1.append(" ");
                  String _name_3 = ((ConcreteMethod)method).getName();
                  _builder_1.append(_name_3, "\t");
                  _builder_1.append("(");
                  {
                    EList<Param> _params = ((ConcreteMethod)method).getParams();
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
                    EObject _eContainer = ((ConcreteMethod)method).eContainer();
                    boolean _equals = Objects.equal(_eContainer, aleClass);
                    if (_equals) {
                      _builder_1.append("\t");
                      _builder_1.append("\t");
                      String _generate = this.generateMethod.generate(aleClass, ((ConcreteMethod)method), ePackages, root);
                      _builder_1.append(_generate, "\t\t");
                      _builder_1.newLineIfNotEmpty();
                    } else {
                      _builder_1.append("\t");
                      _builder_1.append("\t");
                      {
                        Type _type_2 = ((ConcreteMethod)method).getType();
                        String _solveStaticType_2 = this.typeUtil.solveStaticType(_type_2, ePackages);
                        boolean _notEquals_5 = (!Objects.equal(_solveStaticType_2, "void"));
                        if (_notEquals_5) {
                          _builder_1.append("return ");
                        }
                      }
                      _builder_1.append("this.");
                      EObject _eContainer_1 = ((ConcreteMethod)method).eContainer();
                      String _rootNameOrDefault_8 = this.nameUtil.rootNameOrDefault(((AleClass) _eContainer_1));
                      _builder_1.append(_rootNameOrDefault_8, "\t\t");
                      _builder_1.append("delegate.");
                      String _name_5 = ((ConcreteMethod)method).getName();
                      _builder_1.append(_name_5, "\t\t");
                      _builder_1.append("(");
                      {
                        EList<Param> _params_1 = ((ConcreteMethod)method).getParams();
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
                } else {
                  _builder_1.append("\t");
                  _builder_1.append("@Override");
                  _builder_1.newLine();
                  _builder_1.append("\t");
                  _builder_1.append("public abstract ");
                  Type _type_3 = method.getType();
                  String _solveStaticType_3 = this.typeUtil.solveStaticType(_type_3, ePackages);
                  _builder_1.append(_solveStaticType_3, "\t");
                  _builder_1.append(" ");
                  String _name_7 = method.getName();
                  _builder_1.append(_name_7, "\t");
                  _builder_1.append("(");
                  {
                    EList<Param> _params_2 = method.getParams();
                    for(final Param p_2 : _params_2) {
                      Type _type_4 = p_2.getType();
                      String _solveStaticType_4 = this.typeUtil.solveStaticType(_type_4, ePackages);
                      _builder_1.append(_solveStaticType_4, "\t");
                      _builder_1.append(" ");
                      String _name_8 = p_2.getName();
                      _builder_1.append(_name_8, "\t");
                    }
                  }
                  _builder_1.append(");");
                  _builder_1.newLineIfNotEmpty();
                }
              }
            }
          }
        } else {
          _builder_1.append("\t");
          _builder_1.newLine();
        }
      }
      _builder_1.append("}");
      _xblockexpression = _builder_1.toString();
    }
    return _xblockexpression;
  }
}
