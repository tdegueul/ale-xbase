package ale.compiler;

import ale.compiler.filesave.AleOperationImplFilesave;
import ale.compiler.filesave.AleOperationInterfaceFilesave;
import ale.compiler.filesave.AleRevisitorImplFilesave;
import ale.compiler.generator.TypeUtil;
import ale.utils.EcoreUtils;
import ale.xtext.AleRuntimeModule;
import ale.xtext.ale.AleClass;
import ale.xtext.ale.ImportEcore;
import ale.xtext.ale.Root;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pair;

@SuppressWarnings("all")
public class AleRevisitorImplCompiler {
  private IFile file;
  
  @Inject
  private XtextResourceSet rs;
  
  @Extension
  private EcoreUtils _ecoreUtils = new EcoreUtils();
  
  private AleRevisitorImplFilesave revisitorImplFilesave = new AleRevisitorImplFilesave();
  
  private AleOperationInterfaceFilesave operationInterfaceFilesave = new AleOperationInterfaceFilesave();
  
  private AleOperationImplFilesave operationImplFilesave = new AleOperationImplFilesave();
  
  public AleRevisitorImplCompiler(final IFile file) {
    this.file = file;
  }
  
  public void compile() {
    AleRuntimeModule _aleRuntimeModule = new AleRuntimeModule();
    final Injector injector = Guice.createInjector(_aleRuntimeModule);
    injector.injectMembers(this);
    this.rs.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
    IPath _fullPath = this.file.getFullPath();
    String _string = _fullPath.toString();
    URI _createPlatformResourceURI = URI.createPlatformResourceURI(_string, true);
    final Resource resource = this.rs.getResource(_createPlatformResourceURI, true);
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    final Root root = ((Root) _head);
    final TypeUtil typeUtil = new TypeUtil(this.rs);
    EList<ImportEcore> _importsEcore = root.getImportsEcore();
    final Function1<ImportEcore, EPackage> _function = (ImportEcore it) -> {
      String _ref = it.getRef();
      return this._ecoreUtils.loadEPackage(this.rs, _ref);
    };
    final List<EPackage> ePackages = ListExtensions.<ImportEcore, EPackage>map(_importsEcore, _function);
    EList<ImportEcore> _importsEcore_1 = root.getImportsEcore();
    final Function1<ImportEcore, GenModel> _function_1 = (ImportEcore it) -> {
      String _ref = it.getRef();
      return this._ecoreUtils.loadCorrespondingGenmodel(this.rs, _ref);
    };
    final List<GenModel> genmodels = ListExtensions.<ImportEcore, GenModel>map(_importsEcore_1, _function_1);
    IProject _project = this.file.getProject();
    this.revisitorImplFilesave.save(root, _project, this.rs, ePackages, genmodels);
    final Function1<EPackage, List<EClass>> _function_2 = (EPackage it) -> {
      return this._ecoreUtils.getAllClasses(it);
    };
    List<List<EClass>> _map = ListExtensions.<EPackage, List<EClass>>map(ePackages, _function_2);
    Iterable<EClass> _flatten = Iterables.<EClass>concat(_map);
    final Function1<EClass, Pair<EClass, AleClass>> _function_3 = (EClass c) -> {
      String _name = c.getName();
      AleClass _aleClass = typeUtil.getAleClass(_name, root);
      return Pair.<EClass, AleClass>of(c, _aleClass);
    };
    Iterable<Pair<EClass, AleClass>> _map_1 = IterableExtensions.<EClass, Pair<EClass, AleClass>>map(_flatten, _function_3);
    final Function1<Pair<EClass, AleClass>, Boolean> _function_4 = (Pair<EClass, AleClass> it) -> {
      return Boolean.valueOf(((it.getValue() == null) || Objects.equal(it.getValue().eContainer(), root)));
    };
    final Iterable<Pair<EClass, AleClass>> collect = IterableExtensions.<Pair<EClass, AleClass>>filter(_map_1, _function_4);
    final Consumer<Pair<EClass, AleClass>> _function_5 = (Pair<EClass, AleClass> pair) -> {
      IProject _project_1 = this.file.getProject();
      EClass _key = pair.getKey();
      AleClass _value = pair.getValue();
      this.operationInterfaceFilesave.save(_project_1, _key, _value, this.rs, ePackages, root);
      IProject _project_2 = this.file.getProject();
      EClass _key_1 = pair.getKey();
      AleClass _value_1 = pair.getValue();
      this.operationImplFilesave.save(_project_2, _key_1, _value_1, this.rs, ePackages, root);
    };
    collect.forEach(_function_5);
  }
}
