package ale.compiler.generator;

import ale.compiler.generator.JavaPathUtil;
import ale.compiler.generator.util.AleUtils;
import ale.utils.EcoreUtils;
import ale.xtext.ale.Root;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
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
public class GenerateRevisitorInterfaceXtend {
  @Extension
  private JavaPathUtil _javaPathUtil = new JavaPathUtil();
  
  @Extension
  private EcoreUtils _ecoreUtils = new EcoreUtils();
  
  @Extension
  private AleUtils _aleUtils = new AleUtils();
  
  private ResourceSet rs;
  
  public GenerateRevisitorInterfaceXtend(final ResourceSet rs) {
    this.rs = rs;
  }
  
  public String generate(final String rootName, final List<EPackage> ePackages, final List<GenModel> genmodels, final List<Root> parentRoots, final Boolean generateMethods) {
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
    CharSequence _packageName = GenerateRevisitorInterfaceXtend.toPackageName(rootName);
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
        String _genericType = this.genericType(cls, true);
        _builder.append(_genericType, "");
      }
      if (_hasElements) {
        _builder.append(">", "");
      }
    }
    {
      boolean _hasElements_1 = false;
      for(final EPackage ePp : directPkgs) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
          _builder.append("\n\textends ", "");
        } else {
          _builder.appendImmediate(",\n\t\t", "");
        }
        String _name = ePp.getName();
        CharSequence _revisitorInterfaceJavaPath = this.revisitorInterfaceJavaPath(_name);
        _builder.append(_revisitorInterfaceJavaPath, "");
        {
          List<EClass> _allClasses = this._ecoreUtils.getAllClasses(ePp);
          List<EClass> _sortByName_1 = this._ecoreUtils.sortByName(_allClasses);
          boolean _hasElements_2 = false;
          for(final EClass x : _sortByName_1) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
              _builder.append("<", "");
            } else {
              _builder.appendImmediate(", ", "");
            }
            String _genericType_1 = this.genericType(x, false);
            _builder.append(_genericType_1, "");
          }
          if (_hasElements_2) {
            _builder.append(">", "");
          }
        }
      }
    }
    {
      boolean _hasElements_3 = false;
      for(final Root ePp_1 : parentRoots) {
        if (!_hasElements_3) {
          _hasElements_3 = true;
          _builder.append(sep, "");
        } else {
          _builder.appendImmediate(",\n\t\t", "");
        }
        _builder.newLineIfNotEmpty();
        String _name_1 = ePp_1.getName();
        CharSequence _revisitorInterfaceJavaPath_1 = this.revisitorInterfaceJavaPath(_name_1);
        _builder.append(_revisitorInterfaceJavaPath_1, "");
        {
          List<EClass> _allClasses_1 = this._aleUtils.allClasses(ePp_1, this.rs);
          List<EClass> _sortByName_2 = this._ecoreUtils.sortByName(_allClasses_1);
          boolean _hasElements_4 = false;
          for(final EClass x_1 : _sortByName_2) {
            if (!_hasElements_4) {
              _hasElements_4 = true;
              _builder.append("<", "");
            } else {
              _builder.appendImmediate(", ", "");
            }
            String _genericType_2 = this.genericType(x_1, false);
            _builder.append(_genericType_2, "");
          }
          if (_hasElements_4) {
            _builder.append(">", "");
          }
        }
      }
    }
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      if ((generateMethods).booleanValue()) {
        _builder.append("\t");
        _builder.append("// Concrete factory methods to be implemented in revisitor implementations");
        _builder.newLine();
        {
          for(final EClass cls_1 : allMethods) {
            _builder.append("\t");
            String _genericType_3 = this.genericType(cls_1, false);
            _builder.append(_genericType_3, "\t");
            _builder.append(" ");
            String _name_2 = cls_1.getName();
            String _firstLower = StringExtensions.toFirstLower(_name_2);
            _builder.append(_firstLower, "\t");
            _builder.append("(final ");
            String _javaFullPath = this._javaPathUtil.javaFullPath(cls_1);
            _builder.append(_javaFullPath, "\t");
            _builder.append(" ");
            String _name_3 = cls_1.getName();
            String _firstLower_1 = StringExtensions.toFirstLower(_name_3);
            _builder.append(_firstLower_1, "\t");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
            {
              EList<EClass> _eAllSuperTypes = cls_1.getEAllSuperTypes();
              for(final EClass parent : _eAllSuperTypes) {
                _builder.append("\t");
                String _genericType_4 = this.genericType(parent, false);
                _builder.append(_genericType_4, "\t");
                _builder.append(" ");
                String _name_4 = parent.getName();
                String _firstLower_2 = StringExtensions.toFirstLower(_name_4);
                _builder.append(_firstLower_2, "\t");
                _builder.append("_");
                String _name_5 = cls_1.getName();
                String _firstLower_3 = StringExtensions.toFirstLower(_name_5);
                _builder.append(_firstLower_3, "\t");
                _builder.append("(final ");
                String _javaFullPath_1 = this._javaPathUtil.javaFullPath(cls_1);
                _builder.append(_javaFullPath_1, "\t");
                _builder.append(" ");
                String _name_6 = cls_1.getName();
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
    _builder.append("\t");
    _builder.append("// Default dispatch methods");
    _builder.newLine();
    {
      for(final Pair<EClass, Iterable<EClass>> dollarRoot : classPlusItsChildren) {
        _builder.append("\t");
        _builder.append("default ");
        EClass _key = dollarRoot.getKey();
        String _genericType_5 = this.genericType(_key, false);
        _builder.append(_genericType_5, "\t");
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
  
  public String generate(final EPackage ePackage, final GenModel gm) {
    String _name = ePackage.getName();
    ArrayList<EPackage> _newArrayList = CollectionLiterals.<EPackage>newArrayList(ePackage);
    ArrayList<GenModel> _newArrayList_1 = CollectionLiterals.<GenModel>newArrayList(gm);
    ArrayList<Root> _newArrayList_2 = CollectionLiterals.<Root>newArrayList();
    return this.generate(_name, _newArrayList, _newArrayList_1, _newArrayList_2, Boolean.valueOf(true));
  }
  
  private CharSequence revisitorInterfaceJavaPath(final String name) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(name, "");
    _builder.append(".revisitor.");
    CharSequence _packageName = GenerateRevisitorInterfaceXtend.toPackageName(name);
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
    String _className = GenerateRevisitorInterfaceXtend.toClassName(name);
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
