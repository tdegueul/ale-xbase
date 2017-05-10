package ale.compiler.generator.util;

import ale.utils.EcoreUtils;
import ale.xtext.ale.AleClass;
import ale.xtext.ale.ImportEcore;
import ale.xtext.ale.Method;
import ale.xtext.ale.Root;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class AleUtils {
  @Extension
  private EcoreUtils _ecoreUtils = new EcoreUtils();
  
  public List<Method> getAllMethods(final AleClass cls, final boolean includeSelf) {
    final ArrayList<Method> ret = CollectionLiterals.<Method>newArrayList();
    if (includeSelf) {
      EList<Method> _methods = cls.getMethods();
      Iterables.<Method>addAll(ret, _methods);
    }
    EList<AleClass> _superClass = cls.getSuperClass();
    final Consumer<AleClass> _function = (AleClass sup) -> {
      List<Method> _allMethods = this.getAllMethods(sup, true);
      final Function1<Method, Boolean> _function_1 = (Method m) -> {
        final Function1<Method, Boolean> _function_2 = (Method it) -> {
          return Boolean.valueOf((Objects.equal(it.getName(), m.getName()) && (it.getParams().size() == m.getParams().size())));
        };
        boolean _exists = IterableExtensions.<Method>exists(ret, _function_2);
        return Boolean.valueOf((!_exists));
      };
      Iterable<Method> _filter = IterableExtensions.<Method>filter(_allMethods, _function_1);
      Iterables.<Method>addAll(ret, _filter);
    };
    _superClass.forEach(_function);
    return ret;
  }
  
  public List<EClass> allClasses(final Root root, final ResourceSet rs) {
    EList<ImportEcore> _importsEcore = root.getImportsEcore();
    final Function1<ImportEcore, EPackage> _function = (ImportEcore it) -> {
      String _ref = it.getRef();
      return this._ecoreUtils.loadEPackage(rs, _ref);
    };
    final List<EPackage> ePackages = ListExtensions.<ImportEcore, EPackage>map(_importsEcore, _function);
    return this._ecoreUtils.getAllClasses(ePackages);
  }
}
