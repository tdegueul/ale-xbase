package ale.utils;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.MapExtensions;

@SuppressWarnings("all")
public class EcoreUtils {
  public List<EClass> sortByName(final Iterable<EClass> classes) {
    final Comparator<EClass> _function = (EClass c1, EClass c2) -> {
      int _xifexpression = (int) 0;
      String _name = c1.getName();
      String _name_1 = c2.getName();
      boolean _lessThan = (_name.compareTo(_name_1) < 0);
      if (_lessThan) {
        _xifexpression = (-1);
      } else {
        int _xifexpression_1 = (int) 0;
        String _name_2 = c1.getName();
        String _name_3 = c2.getName();
        boolean _greaterThan = (_name_2.compareTo(_name_3) > 0);
        if (_greaterThan) {
          _xifexpression_1 = 1;
        } else {
          _xifexpression_1 = 0;
        }
        _xifexpression = _xifexpression_1;
      }
      return _xifexpression;
    };
    return IterableExtensions.<EClass>sortWith(classes, _function);
  }
  
  public List<EClass> getAllClasses(final EPackage pkg) {
    final ArrayList<EClass> ret = CollectionLiterals.<EClass>newArrayList();
    EList<EClassifier> _eClassifiers = pkg.getEClassifiers();
    Iterable<EClass> _filter = Iterables.<EClass>filter(_eClassifiers, EClass.class);
    Iterables.<EClass>addAll(ret, _filter);
    List<EPackage> _allSubPkgs = this.getAllSubPkgs(pkg);
    List<EClass> _allClasses = this.getAllClasses(_allSubPkgs);
    Iterables.<EClass>addAll(ret, _allClasses);
    List<EPackage> _referencedPkgs = this.getReferencedPkgs(pkg);
    List<EClass> _allClasses_1 = this.getAllClasses(_referencedPkgs);
    Iterables.<EClass>addAll(ret, _allClasses_1);
    Set<EClass> _set = IterableExtensions.<EClass>toSet(ret);
    return IterableExtensions.<EClass>toList(_set);
  }
  
  public List<EClass> getAllClasses(final List<EPackage> pkgs) {
    final Function1<EPackage, List<EClass>> _function = (EPackage it) -> {
      return this.getAllClasses(it);
    };
    List<List<EClass>> _map = ListExtensions.<EPackage, List<EClass>>map(pkgs, _function);
    Iterable<EClass> _flatten = Iterables.<EClass>concat(_map);
    Set<EClass> _set = IterableExtensions.<EClass>toSet(_flatten);
    return IterableExtensions.<EClass>toList(_set);
  }
  
  public List<EPackage> getAllSubPkgs(final EPackage pkg) {
    final ArrayList<EPackage> ret = CollectionLiterals.<EPackage>newArrayList();
    this.getAllSubPkgsRec(pkg, ret);
    return ret;
  }
  
  private void getAllSubPkgsRec(final EPackage pkg, final List<EPackage> ret) {
    EList<EPackage> _eSubpackages = pkg.getESubpackages();
    final Consumer<EPackage> _function = (EPackage p) -> {
      this.getAllSubPkgsRec(p, ret);
      ret.add(p);
    };
    _eSubpackages.forEach(_function);
  }
  
  public List<EPackage> getDirectReferencedPkgs(final List<EPackage> pkgs) {
    final Function1<EPackage, List<EPackage>> _function = (EPackage it) -> {
      return this.getDirectReferencedPkgs(it);
    };
    List<List<EPackage>> _map = ListExtensions.<EPackage, List<EPackage>>map(pkgs, _function);
    Iterable<EPackage> _flatten = Iterables.<EPackage>concat(_map);
    return IterableExtensions.<EPackage>toList(_flatten);
  }
  
  public List<EPackage> getDirectReferencedPkgs(final EPackage pkg) {
    final ArrayList<EPackage> ret = CollectionLiterals.<EPackage>newArrayList();
    Map<EObject, Collection<EStructuralFeature.Setting>> _find = EcoreUtil.ExternalCrossReferencer.find(pkg);
    final Function2<EObject, Collection<EStructuralFeature.Setting>, Boolean> _function = (EObject o, Collection<EStructuralFeature.Setting> s) -> {
      return Boolean.valueOf((o instanceof EClass));
    };
    Map<EObject, Collection<EStructuralFeature.Setting>> _filter = MapExtensions.<EObject, Collection<EStructuralFeature.Setting>>filter(_find, _function);
    final BiConsumer<EObject, Collection<EStructuralFeature.Setting>> _function_1 = (EObject cls, Collection<EStructuralFeature.Setting> s) -> {
      EObject container = cls;
      while (((container != null) && (!(container instanceof EPackage)))) {
        EObject _eContainer = container.eContainer();
        container = _eContainer;
      }
      final EPackage referenced = ((EPackage) container);
      if ((((referenced != null) && (!IterableExtensions.<EPackage>exists(ret, ((Function1<EPackage, Boolean>) (EPackage it) -> {
        String _nsURI = it.getNsURI();
        String _nsURI_1 = referenced.getNsURI();
        return Boolean.valueOf(Objects.equal(_nsURI, _nsURI_1));
      })))) && (!this.isEcore(referenced)))) {
        ret.add(referenced);
      }
    };
    _filter.forEach(_function_1);
    return ret;
  }
  
  public List<EPackage> getReferencedPkgs(final EPackage pkg) {
    final ArrayList<EPackage> ret = CollectionLiterals.<EPackage>newArrayList();
    this.getReferencedPkgsRec(pkg, ret);
    return ret;
  }
  
  private void getReferencedPkgsRec(final EPackage pkg, final List<EPackage> ret) {
    Map<EObject, Collection<EStructuralFeature.Setting>> _find = EcoreUtil.ExternalCrossReferencer.find(pkg);
    final Function2<EObject, Collection<EStructuralFeature.Setting>, Boolean> _function = (EObject o, Collection<EStructuralFeature.Setting> s) -> {
      return Boolean.valueOf((o instanceof EClass));
    };
    Map<EObject, Collection<EStructuralFeature.Setting>> _filter = MapExtensions.<EObject, Collection<EStructuralFeature.Setting>>filter(_find, _function);
    final BiConsumer<EObject, Collection<EStructuralFeature.Setting>> _function_1 = (EObject cls, Collection<EStructuralFeature.Setting> s) -> {
      EObject container = cls;
      while (((container != null) && (!(container instanceof EPackage)))) {
        EObject _eContainer = container.eContainer();
        container = _eContainer;
      }
      final EPackage referenced = ((EPackage) container);
      if ((((referenced != null) && (!IterableExtensions.<EPackage>exists(ret, ((Function1<EPackage, Boolean>) (EPackage it) -> {
        String _nsURI = it.getNsURI();
        String _nsURI_1 = referenced.getNsURI();
        return Boolean.valueOf(Objects.equal(_nsURI, _nsURI_1));
      })))) && (!this.isEcore(referenced)))) {
        ret.add(referenced);
        this.getReferencedPkgsRec(referenced, ret);
      }
    };
    _filter.forEach(_function_1);
  }
  
  public boolean isEcore(final EPackage pkg) {
    String _nsURI = pkg.getNsURI();
    return Objects.equal(_nsURI, "http://www.eclipse.org/emf/2002/Ecore");
  }
  
  public GenClass getGenClass(final EClass cls, final List<GenModel> gms) {
    List<GenPackage> _allGenPkgs = this.getAllGenPkgs(gms);
    final Function1<GenPackage, Boolean> _function = (GenPackage it) -> {
      EPackage _ecorePackage = it.getEcorePackage();
      String _nsURI = _ecorePackage.getNsURI();
      EPackage _ePackage = cls.getEPackage();
      String _nsURI_1 = _ePackage.getNsURI();
      return Boolean.valueOf(Objects.equal(_nsURI, _nsURI_1));
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
      ret.add(gp);
      this.getAllGenPkgsRec(gpp, ret);
    };
    _filter.forEach(_function_1);
  }
}
