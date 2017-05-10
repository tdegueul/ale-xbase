package ale.compiler.generator;

import ale.compiler.generator.JavaPathUtil;
import ale.compiler.generator.TypeUtil;
import ale.compiler.generator.util.NamingUtils;
import ale.utils.EcoreUtils;
import ale.xtext.ale.Root;
import java.util.List;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class GenerateRevisitorImplXtend {
  @Extension
  private TypeUtil typeUtil;
  
  @Extension
  private NamingUtils _namingUtils = new NamingUtils();
  
  @Extension
  private JavaPathUtil _javaPathUtil = new JavaPathUtil();
  
  @Extension
  private EcoreUtils _ecoreUtils = new EcoreUtils();
  
  public GenerateRevisitorImplXtend(final ResourceSet rs) {
    TypeUtil _typeUtil = new TypeUtil(rs);
    this.typeUtil = _typeUtil;
  }
  
  public String generate(final Root root, final List<EPackage> ePackages, final List<GenModel> genmodels) {
    final List<EClass> allClasses = this._ecoreUtils.getAllClasses(ePackages);
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
    {
      List<EClass> _sortByName = this._ecoreUtils.sortByName(allClasses);
      boolean _hasElements = false;
      for(final EClass cls : _sortByName) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("<", "");
        } else {
          _builder.appendImmediate(", ", "");
        }
        Root _matchingRoot = this.typeUtil.getMatchingRoot(cls, root);
        String _rootNameOrDefault = this._namingUtils.getRootNameOrDefault(_matchingRoot);
        String _operationInterfacePath = this._namingUtils.getOperationInterfacePath(cls, _rootNameOrDefault);
        _builder.append(_operationInterfacePath, "");
      }
      if (_hasElements) {
        _builder.append(">", "");
      }
    }
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      List<EClass> _sortByName_1 = this._ecoreUtils.sortByName(allClasses);
      final Function1<EClass, Boolean> _function = (EClass it) -> {
        boolean _isAbstract = it.isAbstract();
        return Boolean.valueOf((!_isAbstract));
      };
      Iterable<EClass> _filter = IterableExtensions.<EClass>filter(_sortByName_1, _function);
      for(final EClass cls_1 : _filter) {
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("default ");
        Root _matchingRoot_1 = this.typeUtil.getMatchingRoot(cls_1, root);
        String _rootNameOrDefault_1 = this._namingUtils.getRootNameOrDefault(_matchingRoot_1);
        String _operationInterfacePath_1 = this._namingUtils.getOperationInterfacePath(cls_1, _rootNameOrDefault_1);
        _builder.append(_operationInterfacePath_1, "\t");
        _builder.append(" ");
        String _name = cls_1.getName();
        String _firstLower = StringExtensions.toFirstLower(_name);
        _builder.append(_firstLower, "\t");
        _builder.append("(final ");
        String _javaFullPath = this._javaPathUtil.javaFullPath(cls_1);
        _builder.append(_javaFullPath, "\t");
        _builder.append(" ");
        String _name_1 = cls_1.getName();
        String _firstLower_1 = StringExtensions.toFirstLower(_name_1);
        _builder.append(_firstLower_1, "\t");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return new ");
        Root _matchingRoot_2 = this.typeUtil.getMatchingRoot(cls_1, root);
        String _rootNameOrDefault_2 = this._namingUtils.getRootNameOrDefault(_matchingRoot_2);
        _builder.append(_rootNameOrDefault_2, "\t\t");
        _builder.append(".revisitor.operation.impl.");
        Root _matchingRoot_3 = this.typeUtil.getMatchingRoot(cls_1, root);
        String _rootNameOrDefault_3 = this._namingUtils.getRootNameOrDefault(_matchingRoot_3);
        String _firstUpper_2 = StringExtensions.toFirstUpper(_rootNameOrDefault_3);
        _builder.append(_firstUpper_2, "\t\t");
        String _name_2 = cls_1.getName();
        String _firstUpper_3 = StringExtensions.toFirstUpper(_name_2);
        _builder.append(_firstUpper_3, "\t\t");
        _builder.append("OperationImpl(");
        String _name_3 = cls_1.getName();
        String _firstLower_2 = StringExtensions.toFirstLower(_name_3);
        _builder.append(_firstLower_2, "\t\t");
        _builder.append(", this);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        {
          EList<EClass> _eAllSuperTypes = cls_1.getEAllSuperTypes();
          for(final EClass parent : _eAllSuperTypes) {
            _builder.append("\t");
            _builder.append("@Override");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("default ");
            Root _matchingRoot_4 = this.typeUtil.getMatchingRoot(cls_1, root);
            String _rootNameOrDefault_4 = this._namingUtils.getRootNameOrDefault(_matchingRoot_4);
            String _operationInterfacePath_2 = this._namingUtils.getOperationInterfacePath(cls_1, _rootNameOrDefault_4);
            _builder.append(_operationInterfacePath_2, "\t");
            _builder.append(" ");
            String _name_4 = parent.getName();
            String _firstLower_3 = StringExtensions.toFirstLower(_name_4);
            _builder.append(_firstLower_3, "\t");
            _builder.append("_");
            String _name_5 = cls_1.getName();
            String _firstLower_4 = StringExtensions.toFirstLower(_name_5);
            _builder.append(_firstLower_4, "\t");
            _builder.append("(final ");
            String _javaFullPath_1 = this._javaPathUtil.javaFullPath(cls_1);
            _builder.append(_javaFullPath_1, "\t");
            _builder.append(" ");
            String _name_6 = cls_1.getName();
            String _firstLower_5 = StringExtensions.toFirstLower(_name_6);
            _builder.append(_firstLower_5, "\t");
            _builder.append(") {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("return new ");
            Root _matchingRoot_5 = this.typeUtil.getMatchingRoot(cls_1, root);
            String _rootNameOrDefault_5 = this._namingUtils.getRootNameOrDefault(_matchingRoot_5);
            _builder.append(_rootNameOrDefault_5, "\t\t");
            _builder.append(".revisitor.operation.impl.");
            Root _matchingRoot_6 = this.typeUtil.getMatchingRoot(cls_1, root);
            String _rootNameOrDefault_6 = this._namingUtils.getRootNameOrDefault(_matchingRoot_6);
            String _firstUpper_4 = StringExtensions.toFirstUpper(_rootNameOrDefault_6);
            _builder.append(_firstUpper_4, "\t\t");
            String _name_7 = cls_1.getName();
            String _firstUpper_5 = StringExtensions.toFirstUpper(_name_7);
            _builder.append(_firstUpper_5, "\t\t");
            _builder.append("OperationImpl(");
            String _name_8 = cls_1.getName();
            String _firstLower_6 = StringExtensions.toFirstLower(_name_8);
            _builder.append(_firstLower_6, "\t\t");
            _builder.append(", this);");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("}");
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
