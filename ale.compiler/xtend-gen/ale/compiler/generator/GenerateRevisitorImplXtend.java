package ale.compiler.generator;

import ale.compiler.generator.Graph;
import ale.compiler.generator.GraphUtil;
import ale.compiler.generator.JavaPathUtil;
import ale.compiler.generator.TypeUtil;
import ale.xtext.ale.Root;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class GenerateRevisitorImplXtend {
  @Extension
  private GraphUtil graphUtil;
  
  @Extension
  private JavaPathUtil javaPathUtil = new JavaPathUtil();
  
  @Extension
  private TypeUtil typeUtil;
  
  public GenerateRevisitorImplXtend(final ResourceSet resSet) {
    GraphUtil _graphUtil = new GraphUtil(resSet);
    this.graphUtil = _graphUtil;
    TypeUtil _typeUtil = new TypeUtil(resSet);
    this.typeUtil = _typeUtil;
  }
  
  public String generate(final Root root, final List<EPackage> ePackages) {
    String _xblockexpression = null;
    {
      final Graph<EClass> graph = this.graphUtil.buildGraph(ePackages);
      final String aleName = root.getName();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package ");
      _builder.append(aleName, "");
      _builder.append(".revisitor.impl;");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("public interface ");
      String _firstUpper = StringExtensions.toFirstUpper(aleName);
      _builder.append(_firstUpper, "");
      _builder.append("RevisitorImpl extends ");
      _builder.append(aleName, "");
      _builder.append(".revisitor.");
      String _firstUpper_1 = StringExtensions.toFirstUpper(aleName);
      _builder.append(_firstUpper_1, "");
      _builder.append("Revisitor");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      {
        final Function1<Graph.GraphNode, String> _function = (Graph.GraphNode x) -> {
          return x.elem.getName();
        };
        List<Graph.GraphNode> _sortBy = IterableExtensions.<Graph.GraphNode, String>sortBy(graph.nodes, _function);
        final Function1<Graph.GraphNode, EClass> _function_1 = (Graph.GraphNode it) -> {
          return it.elem;
        };
        List<EClass> _map = ListExtensions.<Graph.GraphNode, EClass>map(_sortBy, _function_1);
        boolean _hasElements = false;
        for(final EClass clazz : _map) {
          if (!_hasElements) {
            _hasElements = true;
            _builder.append("<", "\t");
          } else {
            _builder.appendImmediate(",", "\t");
          }
          Root _matchingRoot = this.typeUtil.getMatchingRoot(clazz, root);
          String _name = _matchingRoot.getName();
          String _operationInterfacePath = this.graphUtil.operationInterfacePath(clazz, _name);
          _builder.append(_operationInterfacePath, "\t");
        }
        if (_hasElements) {
          _builder.append(">", "\t");
        }
      }
      _builder.append(" {");
      _builder.newLineIfNotEmpty();
      {
        final Function1<Graph.GraphNode, String> _function_2 = (Graph.GraphNode it) -> {
          return it.elem.getName();
        };
        List<Graph.GraphNode> _sortBy_1 = IterableExtensions.<Graph.GraphNode, String>sortBy(graph.nodes, _function_2);
        final Function1<Graph.GraphNode, Boolean> _function_3 = (Graph.GraphNode c) -> {
          boolean _isAbstract = c.elem.isAbstract();
          return Boolean.valueOf((!_isAbstract));
        };
        Iterable<Graph.GraphNode> _filter = IterableExtensions.<Graph.GraphNode>filter(_sortBy_1, _function_3);
        final Function1<Graph.GraphNode, EClass> _function_4 = (Graph.GraphNode it) -> {
          return it.elem;
        };
        Iterable<EClass> _map_1 = IterableExtensions.<Graph.GraphNode, EClass>map(_filter, _function_4);
        for(final EClass clazz_1 : _map_1) {
          _builder.append("\t");
          _builder.append("@Override");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("default ");
          Root _matchingRoot_1 = this.typeUtil.getMatchingRoot(clazz_1, root);
          String _name_1 = _matchingRoot_1.getName();
          String _operationInterfacePath_1 = this.graphUtil.operationInterfacePath(clazz_1, _name_1);
          _builder.append(_operationInterfacePath_1, "\t");
          _builder.append(" ");
          String _name_2 = clazz_1.getName();
          String _firstLower = StringExtensions.toFirstLower(_name_2);
          _builder.append(_firstLower, "\t");
          _builder.append("(final ");
          CharSequence _javaFullPath = this.javaPathUtil.javaFullPath(clazz_1);
          _builder.append(_javaFullPath, "\t");
          _builder.append(" ");
          String _name_3 = clazz_1.getName();
          String _firstLower_1 = StringExtensions.toFirstLower(_name_3);
          _builder.append(_firstLower_1, "\t");
          _builder.append(") {");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("return new ");
          EPackage _ePackage = clazz_1.getEPackage();
          String _name_4 = _ePackage.getName();
          _builder.append(_name_4, "\t\t");
          _builder.append(".");
          _builder.append(aleName, "\t\t");
          _builder.append(".revisitor.impl.operation.");
          EPackage _ePackage_1 = clazz_1.getEPackage();
          String _name_5 = _ePackage_1.getName();
          String _firstUpper_2 = StringExtensions.toFirstUpper(_name_5);
          _builder.append(_firstUpper_2, "\t\t");
          String _firstUpper_3 = StringExtensions.toFirstUpper(aleName);
          _builder.append(_firstUpper_3, "\t\t");
          String _name_6 = clazz_1.getName();
          String _firstUpper_4 = StringExtensions.toFirstUpper(_name_6);
          _builder.append(_firstUpper_4, "\t\t");
          _builder.append("OperationImpl(");
          String _name_7 = clazz_1.getName();
          String _firstLower_2 = StringExtensions.toFirstLower(_name_7);
          _builder.append(_firstLower_2, "\t\t");
          _builder.append(", this);");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("} ");
          _builder.newLine();
          {
            Collection<EClass> _ancestors = this.graphUtil.ancestors(clazz_1);
            for(final EClass parent : _ancestors) {
              _builder.append("\t");
              _builder.append("@Override");
              _builder.newLine();
              _builder.append("\t");
              _builder.append("default ");
              Root _matchingRoot_2 = this.typeUtil.getMatchingRoot(clazz_1, root);
              String _name_8 = _matchingRoot_2.getName();
              String _operationInterfacePath_2 = this.graphUtil.operationInterfacePath(clazz_1, _name_8);
              _builder.append(_operationInterfacePath_2, "\t");
              _builder.append(" ");
              String _name_9 = parent.getName();
              String _firstLower_3 = StringExtensions.toFirstLower(_name_9);
              _builder.append(_firstLower_3, "\t");
              _builder.append("_");
              String _name_10 = clazz_1.getName();
              String _firstLower_4 = StringExtensions.toFirstLower(_name_10);
              _builder.append(_firstLower_4, "\t");
              _builder.append("(final ");
              CharSequence _javaFullPath_1 = this.javaPathUtil.javaFullPath(clazz_1);
              _builder.append(_javaFullPath_1, "\t");
              _builder.append(" ");
              String _name_11 = clazz_1.getName();
              String _firstLower_5 = StringExtensions.toFirstLower(_name_11);
              _builder.append(_firstLower_5, "\t");
              _builder.append(") {");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("return new ");
              EPackage _ePackage_2 = clazz_1.getEPackage();
              String _name_12 = _ePackage_2.getName();
              _builder.append(_name_12, "\t\t");
              _builder.append(".");
              _builder.append(aleName, "\t\t");
              _builder.append(".revisitor.impl.operation.");
              EPackage _ePackage_3 = clazz_1.getEPackage();
              String _name_13 = _ePackage_3.getName();
              String _firstUpper_5 = StringExtensions.toFirstUpper(_name_13);
              _builder.append(_firstUpper_5, "\t\t");
              String _firstUpper_6 = StringExtensions.toFirstUpper(aleName);
              _builder.append(_firstUpper_6, "\t\t");
              String _name_14 = clazz_1.getName();
              String _firstUpper_7 = StringExtensions.toFirstUpper(_name_14);
              _builder.append(_firstUpper_7, "\t\t");
              _builder.append("OperationImpl(");
              String _name_15 = clazz_1.getName();
              String _firstLower_6 = StringExtensions.toFirstLower(_name_15);
              _builder.append(_firstLower_6, "\t\t");
              _builder.append(", this);");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("} ");
              _builder.newLine();
            }
          }
        }
      }
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
}
