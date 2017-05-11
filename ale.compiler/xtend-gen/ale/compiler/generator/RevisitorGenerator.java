package ale.compiler.generator;

import ale.compiler.generator.AleMethodBodyGenerator;
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
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
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
public class RevisitorGenerator {
  @Extension
  private TypeUtil typeUtil = new TypeUtil();
  
  @Extension
  private NamingUtils _namingUtils = new NamingUtils();
  
  @Extension
  private JavaPathUtil _javaPathUtil = new JavaPathUtil();
  
  @Extension
  private EcoreUtils _ecoreUtils = new EcoreUtils();
  
  @Extension
  private AleUtils _aleUtils = new AleUtils();
  
  @Extension
  private AleMethodBodyGenerator bodyGenerator;
  
  private ResourceSet rs;
  
  public RevisitorGenerator(final ResourceSet rs) {
    this.rs = rs;
  }
  
  public String generateInterface(final String rootName, final List<EPackage> ePackages, final List<GenModel> genmodels, final List<Root> parentRoots, final Boolean generateMethods) {
    final List<EClass> allClasses = this._ecoreUtils.getAllClasses(ePackages);
    final Function1<EClass, Boolean> _function = (EClass it) -> {
      boolean _isAbstract = it.isAbstract();
      return Boolean.valueOf((!_isAbstract));
    };
    Iterable<EClass> _filter = IterableExtensions.<EClass>filter(allClasses, _function);
    final List<EClass> allMethods = this._ecoreUtils.sortByName(_filter);
    final Function1<EClass, Pair<EClass, Iterable<EClass>>> _function_1 = (EClass c) -> {
      final Function1<EClass, Boolean> _function_2 = (EClass other) -> {
        return Boolean.valueOf(c.isSuperTypeOf(other));
      };
      Iterable<EClass> _filter_1 = IterableExtensions.<EClass>filter(allClasses, _function_2);
      return Pair.<EClass, Iterable<EClass>>of(c, _filter_1);
    };
    final List<Pair<EClass, Iterable<EClass>>> classPlusItsChildren = ListExtensions.<EClass, Pair<EClass, Iterable<EClass>>>map(allClasses, _function_1);
    final ArrayList<EPackage> directPkgs = CollectionLiterals.<EPackage>newArrayList();
    if ((generateMethods).booleanValue()) {
      List<EPackage> _directReferencedPkgs = this._ecoreUtils.getDirectReferencedPkgs(ePackages);
      Iterables.<EPackage>addAll(directPkgs, _directReferencedPkgs);
    } else {
      Iterables.<EPackage>addAll(directPkgs, ePackages);
    }
    String _xifexpression = null;
    boolean _isEmpty = directPkgs.isEmpty();
    if (_isEmpty) {
      _xifexpression = " extends ";
    } else {
      _xifexpression = ", \n\t\t";
    }
    final String sep = _xifexpression;
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(rootName, "");
    _builder.append(".revisitor;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public interface ");
    CharSequence _packageName = RevisitorGenerator.toPackageName(rootName);
    _builder.append(_packageName, "");
    String _generateTypeParams = this.generateTypeParams(allClasses, true);
    _builder.append(_generateTypeParams, "");
    {
      boolean _hasElements = false;
      for(final EPackage ePp : directPkgs) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("\n\textends ", "");
        } else {
          _builder.appendImmediate(",\n\t\t", "");
        }
        String _name = ePp.getName();
        CharSequence _revisitorInterfaceJavaPath = this.revisitorInterfaceJavaPath(_name);
        _builder.append(_revisitorInterfaceJavaPath, "");
        List<EClass> _allClasses = this._ecoreUtils.getAllClasses(ePp);
        String _generateTypeParams_1 = this.generateTypeParams(_allClasses, false);
        _builder.append(_generateTypeParams_1, "");
      }
    }
    {
      boolean _hasElements_1 = false;
      for(final Root ePp_1 : parentRoots) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
          _builder.append(sep, "");
        } else {
          _builder.appendImmediate(",\n\t\t", "");
        }
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _name_1 = ePp_1.getName();
        CharSequence _revisitorInterfaceJavaPath_1 = this.revisitorInterfaceJavaPath(_name_1);
        _builder.append(_revisitorInterfaceJavaPath_1, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        List<EClass> _allClasses_1 = this._aleUtils.allClasses(ePp_1, this.rs);
        String _generateTypeParams_2 = this.generateTypeParams(_allClasses_1, false);
        _builder.append(_generateTypeParams_2, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("»");
      }
    }
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      if ((generateMethods).booleanValue()) {
        {
          for(final EClass cls : allMethods) {
            _builder.append("\t");
            String _genericType = this.genericType(cls, false);
            _builder.append(_genericType, "\t");
            _builder.append(" ");
            String _name_2 = cls.getName();
            String _firstLower = StringExtensions.toFirstLower(_name_2);
            _builder.append(_firstLower, "\t");
            _builder.append("(final ");
            String _javaFullPath = this._javaPathUtil.javaFullPath(cls);
            _builder.append(_javaFullPath, "\t");
            _builder.append(" ");
            String _name_3 = cls.getName();
            String _firstLower_1 = StringExtensions.toFirstLower(_name_3);
            _builder.append(_firstLower_1, "\t");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
            {
              EList<EClass> _eAllSuperTypes = cls.getEAllSuperTypes();
              for(final EClass parent : _eAllSuperTypes) {
                _builder.append("\t");
                String _genericType_1 = this.genericType(parent, false);
                _builder.append(_genericType_1, "\t");
                _builder.append(" ");
                String _name_4 = parent.getName();
                String _firstLower_2 = StringExtensions.toFirstLower(_name_4);
                _builder.append(_firstLower_2, "\t");
                _builder.append("_");
                String _name_5 = cls.getName();
                String _firstLower_3 = StringExtensions.toFirstLower(_name_5);
                _builder.append(_firstLower_3, "\t");
                _builder.append("(final ");
                String _javaFullPath_1 = this._javaPathUtil.javaFullPath(cls);
                _builder.append(_javaFullPath_1, "\t");
                _builder.append(" ");
                String _name_6 = cls.getName();
                String _firstLower_4 = StringExtensions.toFirstLower(_name_6);
                _builder.append(_firstLower_4, "\t");
                _builder.append(");");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    _builder.newLine();
    {
      for(final Pair<EClass, Iterable<EClass>> dollarRoot : classPlusItsChildren) {
        _builder.append("\t");
        _builder.append("default ");
        EClass _key = dollarRoot.getKey();
        String _genericType_2 = this.genericType(_key, false);
        _builder.append(_genericType_2, "\t");
        _builder.append(" $(final ");
        EClass _key_1 = dollarRoot.getKey();
        String _javaFullPath_2 = this._javaPathUtil.javaFullPath(_key_1);
        _builder.append(_javaFullPath_2, "\t");
        _builder.append(" self) {");
        _builder.newLineIfNotEmpty();
        {
          Iterable<EClass> _value = dollarRoot.getValue();
          final Function1<EClass, Boolean> _function_2 = (EClass it) -> {
            EClass _key_2 = dollarRoot.getKey();
            return Boolean.valueOf((!Objects.equal(it, _key_2)));
          };
          Iterable<EClass> _filter_1 = IterableExtensions.<EClass>filter(_value, _function_2);
          final Function1<EClass, Boolean> _function_3 = (EClass it) -> {
            boolean _isAbstract = it.isAbstract();
            return Boolean.valueOf((!_isAbstract));
          };
          Iterable<EClass> _filter_2 = IterableExtensions.<EClass>filter(_filter_1, _function_3);
          for(final EClass subClass : _filter_2) {
            _builder.append("\t");
            _builder.append("\t");
            final GenClass genCls = this._ecoreUtils.getGenClass(subClass, genmodels);
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            GenPackage _genPackage = genCls.getGenPackage();
            String _qualifiedPackageInterfaceName = _genPackage.getQualifiedPackageInterfaceName();
            String _plus = (_qualifiedPackageInterfaceName + ".");
            String _classifierID = genCls.getClassifierID();
            final String genClsID = (_plus + _classifierID);
            _builder.newLineIfNotEmpty();
            {
              EList<EClass> _eSuperTypes = subClass.getESuperTypes();
              int _size = _eSuperTypes.size();
              boolean _lessEqualsThan = (_size <= 1);
              if (_lessEqualsThan) {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("if(self.eClass().getClassifierID() == ");
                _builder.append(genClsID, "\t\t");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("&& self.eClass().getEPackage() == ");
                EPackage _ePackage = subClass.getEPackage();
                String _name_7 = _ePackage.getName();
                _builder.append(_name_7, "\t\t\t");
                _builder.append(".");
                EPackage _ePackage_1 = subClass.getEPackage();
                String _name_8 = _ePackage_1.getName();
                String _firstUpper = StringExtensions.toFirstUpper(_name_8);
                _builder.append(_firstUpper, "\t\t\t");
                _builder.append("Package.eINSTANCE)");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("return ");
                String _name_9 = subClass.getName();
                String _firstLower_5 = StringExtensions.toFirstLower(_name_9);
                _builder.append(_firstLower_5, "\t\t\t");
                _builder.append("((");
                String _javaFullPath_3 = this._javaPathUtil.javaFullPath(subClass);
                _builder.append(_javaFullPath_3, "\t\t\t");
                _builder.append(") self);");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("if(self.eClass().getClassifierID() == ");
                _builder.append(genClsID, "\t\t");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("&& self.eClass().getEPackage() == ");
                EPackage _ePackage_2 = subClass.getEPackage();
                String _name_10 = _ePackage_2.getName();
                _builder.append(_name_10, "\t\t\t");
                _builder.append(".");
                EPackage _ePackage_3 = subClass.getEPackage();
                String _name_11 = _ePackage_3.getName();
                String _firstUpper_1 = StringExtensions.toFirstUpper(_name_11);
                _builder.append(_firstUpper_1, "\t\t\t");
                _builder.append("Package.eINSTANCE)");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("return ");
                EClass _key_2 = dollarRoot.getKey();
                String _name_12 = _key_2.getName();
                String _firstLower_6 = StringExtensions.toFirstLower(_name_12);
                _builder.append(_firstLower_6, "\t\t\t");
                _builder.append("_");
                String _name_13 = subClass.getName();
                String _firstLower_7 = StringExtensions.toFirstLower(_name_13);
                _builder.append(_firstLower_7, "\t\t\t");
                _builder.append("((");
                String _javaFullPath_4 = this._javaPathUtil.javaFullPath(subClass);
                _builder.append(_javaFullPath_4, "\t\t\t");
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
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String generateImpl(final Root root, final List<EPackage> ePackages, final List<GenModel> genmodels) {
    final List<EClass> allClasses = this._ecoreUtils.getAllClasses(ePackages);
    final String aleName = root.getName();
    EPackage _head = IterableExtensions.<EPackage>head(ePackages);
    final String pkgName = _head.getName();
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
    _builder.append(pkgName, "");
    _builder.append(".revisitor.");
    CharSequence _packageName = RevisitorGenerator.toPackageName(pkgName);
    _builder.append(_packageName, "");
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
        String _firstUpper_1 = StringExtensions.toFirstUpper(_rootNameOrDefault_3);
        _builder.append(_firstUpper_1, "\t\t");
        String _name_2 = cls_1.getName();
        String _firstUpper_2 = StringExtensions.toFirstUpper(_name_2);
        _builder.append(_firstUpper_2, "\t\t");
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
            String _firstUpper_3 = StringExtensions.toFirstUpper(_rootNameOrDefault_6);
            _builder.append(_firstUpper_3, "\t\t");
            String _name_7 = cls_1.getName();
            String _firstUpper_4 = StringExtensions.toFirstUpper(_name_7);
            _builder.append(_firstUpper_4, "\t\t");
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
  
  public String generateOperationInterface(final EClass eClass, final AleClass aleClass, final List<EPackage> ePackages, final Root root) {
    final String aleName = this._namingUtils.getRootNameOrDefault(aleClass);
    StringConcatenation _builder = new StringConcatenation();
    String _firstUpper = StringExtensions.toFirstUpper(aleName);
    _builder.append(_firstUpper, "");
    String _name = eClass.getName();
    _builder.append(_name, "");
    _builder.append("Operation");
    final String clazzName = _builder.toString();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package ");
    _builder_1.append(aleName, "");
    _builder_1.append(".revisitor.operation;");
    _builder_1.newLineIfNotEmpty();
    _builder_1.newLine();
    _builder_1.append("public interface ");
    _builder_1.append(clazzName, "");
    {
      EList<EClass> _eSuperTypes = eClass.getESuperTypes();
      boolean _hasElements = false;
      for(final EClass ext : _eSuperTypes) {
        if (!_hasElements) {
          _hasElements = true;
          _builder_1.append(" extends ", "");
        } else {
          _builder_1.appendImmediate(", ", "");
        }
        Root _matchingRoot = this.typeUtil.getMatchingRoot(ext, root);
        String _rootNameOrDefault = this._namingUtils.getRootNameOrDefault(_matchingRoot);
        String _operationInterfacePath = this._namingUtils.getOperationInterfacePath(ext, _rootNameOrDefault);
        _builder_1.append(_operationInterfacePath, "");
      }
    }
    _builder_1.append(" {");
    _builder_1.newLineIfNotEmpty();
    {
      if ((aleClass != null)) {
        {
          EList<Method> _methods = aleClass.getMethods();
          for(final Method method : _methods) {
            _builder_1.append("\t");
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
            _builder_1.append(");");
            _builder_1.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder_1.append("}");
    _builder_1.newLine();
    return _builder_1.toString();
  }
  
  public String generateOperationImpl(final EClass eClass, final AleClass aleClass, final List<EPackage> ePackages, final Root root) {
    final String aleName = this._namingUtils.getRootNameOrDefault(aleClass);
    EPackage _head = IterableExtensions.<EPackage>head(ePackages);
    final String pkgName = _head.getName();
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
        _builder_1.append(pkgName, "\t");
        _builder_1.append(".revisitor.");
        CharSequence _packageName = RevisitorGenerator.toPackageName(pkgName);
        _builder_1.append(_packageName, "\t");
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
            String _firstUpper_1 = StringExtensions.toFirstUpper(_rootNameOrDefault_2);
            _builder_1.append(_firstUpper_1, "\t");
            String _name_1 = parent.getName();
            String _firstUpper_2 = StringExtensions.toFirstUpper(_name_1);
            _builder_1.append(_firstUpper_2, "\t");
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
        _builder_1.append(pkgName, "\t");
        _builder_1.append(".revisitor.");
        CharSequence _packageName_1 = RevisitorGenerator.toPackageName(pkgName);
        _builder_1.append(_packageName_1, "\t");
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
            String _firstUpper_3 = StringExtensions.toFirstUpper(_rootNameOrDefault_7);
            _builder_1.append(_firstUpper_3, "\t\t");
            String _name_2 = parent_1.getName();
            String _firstUpper_4 = StringExtensions.toFirstUpper(_name_2);
            _builder_1.append(_firstUpper_4, "\t\t");
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
                String _generate = this.bodyGenerator.generate(aleClass, method, ePackages, root);
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
  
  public String generateInterface(final EPackage ePackage, final GenModel gm) {
    String _name = ePackage.getName();
    ArrayList<EPackage> _newArrayList = CollectionLiterals.<EPackage>newArrayList(ePackage);
    ArrayList<GenModel> _newArrayList_1 = CollectionLiterals.<GenModel>newArrayList(gm);
    ArrayList<Root> _newArrayList_2 = CollectionLiterals.<Root>newArrayList();
    return this.generateInterface(_name, _newArrayList, _newArrayList_1, _newArrayList_2, Boolean.valueOf(true));
  }
  
  public String generateTypeParams(final List<EClass> classes, final boolean withExtends) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<EClass> _sortByName = this._ecoreUtils.sortByName(classes);
      boolean _hasElements = false;
      for(final EClass cls : _sortByName) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("<", "");
        } else {
          _builder.appendImmediate(", ", "");
        }
        String _genericType = this.genericType(cls, withExtends);
        _builder.append(_genericType, "");
      }
      if (_hasElements) {
        _builder.append(">", "");
      }
    }
    return _builder.toString();
  }
  
  private CharSequence revisitorInterfaceJavaPath(final String name) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(name, "");
    _builder.append(".revisitor.");
    CharSequence _packageName = RevisitorGenerator.toPackageName(name);
    _builder.append(_packageName, "");
    return _builder;
  }
  
  private String genericType(final EClass cls, final boolean extend) {
    StringConcatenation _builder = new StringConcatenation();
    EPackage _ePackage = cls.getEPackage();
    String _name = _ePackage.getName();
    String _replaceAll = _name.replaceAll("\\.", "");
    String _firstUpper = StringExtensions.toFirstUpper(_replaceAll);
    _builder.append(_firstUpper, "");
    _builder.append("__");
    String _name_1 = cls.getName();
    _builder.append(_name_1, "");
    _builder.append("T");
    {
      if (((cls.getESuperTypes().size() == 1) && extend)) {
        _builder.append(" extends ");
        EList<EClass> _eSuperTypes = cls.getESuperTypes();
        EClass _head = IterableExtensions.<EClass>head(_eSuperTypes);
        String _genericType = this.genericType(_head, false);
        _builder.append(_genericType, "");
      }
    }
    return _builder.toString();
  }
  
  private static CharSequence toPackageName(final String name) {
    StringConcatenation _builder = new StringConcatenation();
    String _className = RevisitorGenerator.toClassName(name);
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
