package ale.compiler.generator.util;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class EcoreUtils {
  public GenClass getGenClass(final EClass cls, final List<GenModel> gms) {
    List<GenPackage> _allGenPkgs = this.getAllGenPkgs(gms);
    final Function1<GenPackage, Boolean> _function = (GenPackage it) -> {
      EPackage _ecorePackage = it.getEcorePackage();
      EPackage _ePackage = cls.getEPackage();
      return Boolean.valueOf(Objects.equal(_ecorePackage, _ePackage));
    };
    Iterable<GenPackage> _filter = IterableExtensions.<GenPackage>filter(_allGenPkgs, _function);
    GenPackage _head = IterableExtensions.<GenPackage>head(_filter);
    EList<GenClass> _genClasses = _head.getGenClasses();
    final Function1<GenClass, Boolean> _function_1 = (GenClass it) -> {
      String _name = it.getName();
      String _name_1 = cls.getName();
      return Boolean.valueOf(Objects.equal(_name, _name_1));
    };
    Iterable<GenClass> _filter_1 = IterableExtensions.<GenClass>filter(_genClasses, _function_1);
    return IterableExtensions.<GenClass>head(_filter_1);
  }
  
  public List<GenPackage> getAllGenPkgs(final List<GenModel> gms) {
    final Function1<GenModel, List<GenPackage>> _function = (GenModel it) -> {
      return this.getAllGenPkgs(it);
    };
    List<List<GenPackage>> _map = ListExtensions.<GenModel, List<GenPackage>>map(gms, _function);
    Iterable<GenPackage> _flatten = Iterables.<GenPackage>concat(_map);
    return IterableExtensions.<GenPackage>toList(_flatten);
  }
  
  public List<GenPackage> getAllGenPkgs(final GenModel gm) {
    final ArrayList<GenPackage> ret = CollectionLiterals.<GenPackage>newArrayList();
    this.getAllGenPkgsRec(gm, ret);
    return ret;
  }
  
  private void getAllGenPkgsRec(final GenModel gm, final List<GenPackage> ret) {
    EList<GenPackage> _genPackages = gm.getGenPackages();
    final Function1<GenPackage, Boolean> _function = (GenPackage gp) -> {
      final Function1<GenPackage, Boolean> _function_1 = (GenPackage it) -> {
        EPackage _ecorePackage = it.getEcorePackage();
        String _nsURI = _ecorePackage.getNsURI();
        EPackage _ecorePackage_1 = gp.getEcorePackage();
        String _nsURI_1 = _ecorePackage_1.getNsURI();
        return Boolean.valueOf(Objects.equal(_nsURI, _nsURI_1));
      };
      boolean _exists = IterableExtensions.<GenPackage>exists(ret, _function_1);
      return Boolean.valueOf((!_exists));
    };
    Iterable<GenPackage> _filter = IterableExtensions.<GenPackage>filter(_genPackages, _function);
    final Consumer<GenPackage> _function_1 = (GenPackage gp) -> {
      ret.add(gp);
      this.getAllGenPkgsRec(gp, ret);
    };
    _filter.forEach(_function_1);
    EList<GenPackage> _usedGenPackages = gm.getUsedGenPackages();
    final Function1<GenPackage, Boolean> _function_2 = (GenPackage gp) -> {
      return Boolean.valueOf((((gp != null) && (gp.getEcorePackage() != null)) && (!IterableExtensions.<GenPackage>exists(ret, ((Function1<GenPackage, Boolean>) (GenPackage it) -> {
        EPackage _ecorePackage = it.getEcorePackage();
        String _nsURI = _ecorePackage.getNsURI();
        EPackage _ecorePackage_1 = gp.getEcorePackage();
        String _nsURI_1 = _ecorePackage_1.getNsURI();
        return Boolean.valueOf(Objects.equal(_nsURI, _nsURI_1));
      })))));
    };
    Iterable<GenPackage> _filter_1 = IterableExtensions.<GenPackage>filter(_usedGenPackages, _function_2);
    final Consumer<GenPackage> _function_3 = (GenPackage gp) -> {
      ret.add(gp);
      GenModel _genModel = gp.getGenModel();
      this.getAllGenPkgsRec(_genModel, ret);
      this.getAllGenPkgsRec(gp, ret);
    };
    _filter_1.forEach(_function_3);
  }
  
  private void getAllGenPkgsRec(final GenPackage gp, final List<GenPackage> ret) {
    List<GenPackage> _subGenPackages = gp.getSubGenPackages();
    final Function1<GenPackage, Boolean> _function = (GenPackage gpp) -> {
      final Function1<GenPackage, Boolean> _function_1 = (GenPackage it) -> {
        EPackage _ecorePackage = it.getEcorePackage();
        String _nsURI = _ecorePackage.getNsURI();
        EPackage _ecorePackage_1 = gpp.getEcorePackage();
        String _nsURI_1 = _ecorePackage_1.getNsURI();
        return Boolean.valueOf(Objects.equal(_nsURI, _nsURI_1));
      };
      boolean _exists = IterableExtensions.<GenPackage>exists(ret, _function_1);
      return Boolean.valueOf((!_exists));
    };
    Iterable<GenPackage> _filter = IterableExtensions.<GenPackage>filter(_subGenPackages, _function);
    final Consumer<GenPackage> _function_1 = (GenPackage gpp) -> {
      ret.add(gpp);
      this.getAllGenPkgsRec(gpp, ret);
    };
    _filter.forEach(_function_1);
  }
}
