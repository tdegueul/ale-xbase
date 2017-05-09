package ale.compiler.generator;

import ale.compiler.generator.Graph;
import ale.compiler.generator.GraphUtil;
import ale.compiler.generator.JavaPathUtil;
import ale.compiler.generator.TypeUtil;
import ale.compiler.generator.util.NameUtil;
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
  
  @Extension
  private NameUtil nameUtil = new NameUtil();
  
  public GenerateRevisitorImplXtend(final ResourceSet resSet) {
    GraphUtil _graphUtil = new GraphUtil(resSet);
    this.graphUtil = _graphUtil;
    TypeUtil _typeUtil = new TypeUtil(resSet);
    this.typeUtil = _typeUtil;
  }
  
  public String generate(final Root root, final List<EPackage> ePackages) {
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
      final Function1<Graph.GraphNode, String> _function = (Graph.GraphNode it) -> {
        return it.elem.getName();
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
        String _rootNameOrDefault = this.nameUtil.rootNameOrDefault(_matchingRoot);
        String _operationInterfacePath = this.graphUtil.operationInterfacePath(clazz, _rootNameOrDefault);
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
      final Function1<Graph.GraphNode, Boolean> _function_3 = (Graph.GraphNode it) -> {
        boolean _isAbstract = it.elem.isAbstract();
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
        String _rootNameOrDefault_1 = this.nameUtil.rootNameOrDefault(_matchingRoot_1);
        String _operationInterfacePath_1 = this.graphUtil.operationInterfacePath(clazz_1, _rootNameOrDefault_1);
        _builder.append(_operationInterfacePath_1, "\t");
        _builder.append(" ");
        String _name = clazz_1.getName();
        String _firstLower = StringExtensions.toFirstLower(_name);
        _builder.append(_firstLower, "\t");
        _builder.append("(final ");
        String _javaFullPath = this.javaPathUtil.javaFullPath(clazz_1);
        _builder.append(_javaFullPath, "\t");
        _builder.append(" ");
        String _name_1 = clazz_1.getName();
        String _firstLower_1 = StringExtensions.toFirstLower(_name_1);
        _builder.append(_firstLower_1, "\t");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return new ");
        Root _matchingRoot_2 = this.typeUtil.getMatchingRoot(clazz_1, root);
        String _rootNameOrDefault_2 = this.nameUtil.rootNameOrDefault(_matchingRoot_2);
        _builder.append(_rootNameOrDefault_2, "\t\t");
        _builder.append(".revisitor.operation.impl.");
        Root _matchingRoot_3 = this.typeUtil.getMatchingRoot(clazz_1, root);
        String _rootNameOrDefault_3 = this.nameUtil.rootNameOrDefault(_matchingRoot_3);
        String _firstUpper_2 = StringExtensions.toFirstUpper(_rootNameOrDefault_3);
        _builder.append(_firstUpper_2, "\t\t");
        String _name_2 = clazz_1.getName();
        String _firstUpper_3 = StringExtensions.toFirstUpper(_name_2);
        _builder.append(_firstUpper_3, "\t\t");
        _builder.append("OperationImpl(");
        String _name_3 = clazz_1.getName();
        String _firstLower_2 = StringExtensions.toFirstLower(_name_3);
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
            Root _matchingRoot_4 = this.typeUtil.getMatchingRoot(clazz_1, root);
            String _rootNameOrDefault_4 = this.nameUtil.rootNameOrDefault(_matchingRoot_4);
            String _operationInterfacePath_2 = this.graphUtil.operationInterfacePath(clazz_1, _rootNameOrDefault_4);
            _builder.append(_operationInterfacePath_2, "\t");
            _builder.append(" ");
            String _name_4 = parent.getName();
            String _firstLower_3 = StringExtensions.toFirstLower(_name_4);
            _builder.append(_firstLower_3, "\t");
            _builder.append("_");
            String _name_5 = clazz_1.getName();
            String _firstLower_4 = StringExtensions.toFirstLower(_name_5);
            _builder.append(_firstLower_4, "\t");
            _builder.append("(final ");
            String _javaFullPath_1 = this.javaPathUtil.javaFullPath(clazz_1);
            _builder.append(_javaFullPath_1, "\t");
            _builder.append(" ");
            String _name_6 = clazz_1.getName();
            String _firstLower_5 = StringExtensions.toFirstLower(_name_6);
            _builder.append(_firstLower_5, "\t");
            _builder.append(") {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("return new ");
            Root _matchingRoot_5 = this.typeUtil.getMatchingRoot(clazz_1, root);
            String _rootNameOrDefault_5 = this.nameUtil.rootNameOrDefault(_matchingRoot_5);
            _builder.append(_rootNameOrDefault_5, "\t\t");
            _builder.append(".revisitor.operation.impl.");
            Root _matchingRoot_6 = this.typeUtil.getMatchingRoot(clazz_1, root);
            String _rootNameOrDefault_6 = this.nameUtil.rootNameOrDefault(_matchingRoot_6);
            String _firstUpper_4 = StringExtensions.toFirstUpper(_rootNameOrDefault_6);
            _builder.append(_firstUpper_4, "\t\t");
            String _name_7 = clazz_1.getName();
            String _firstUpper_5 = StringExtensions.toFirstUpper(_name_7);
            _builder.append(_firstUpper_5, "\t\t");
            _builder.append("OperationImpl(");
            String _name_8 = clazz_1.getName();
            String _firstLower_6 = StringExtensions.toFirstLower(_name_8);
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
    return _builder.toString();
  }
}
