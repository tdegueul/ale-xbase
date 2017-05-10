package ale.compiler;

import ale.compiler.filesave.AleOperationImplFilesave;
import ale.compiler.filesave.AleOperationInterfaceFilesave;
import ale.compiler.filesave.AleRevisitorImplFilesave;
import ale.compiler.filesave.AleRevisitorInterfaceFilesave;
import ale.compiler.generator.GraphUtil;
import ale.compiler.generator.TypeUtil;
import ale.utils.AleEcoreUtil;
import ale.utils.Pair;
import ale.xtext.AleRuntimeModule;
import ale.xtext.ale.AleClass;
import ale.xtext.ale.ImportAle;
import ale.xtext.ale.ImportEcore;
import ale.xtext.ale.Root;
import com.google.common.base.Objects;
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
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class AleRevisitorImplCompiler {
  private IFile file;
  
  private AleEcoreUtil aleEcoreUtil = new AleEcoreUtil();
  
  @Inject
  private XtextResourceSet xtextResourceSet;
  
  private AleRevisitorInterfaceFilesave revisitorInterfaceFilesave = new AleRevisitorInterfaceFilesave();
  
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
    this.xtextResourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
    IPath _fullPath = this.file.getFullPath();
    String _string = _fullPath.toString();
    URI _createPlatformResourceURI = URI.createPlatformResourceURI(_string, true);
    final Resource resource = this.xtextResourceSet.getResource(_createPlatformResourceURI, true);
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    final Root root = ((Root) _head);
    final ResourceSetImpl rs = new ResourceSetImpl();
    final TypeUtil typeUtil = new TypeUtil(rs);
    EList<ImportEcore> _importsEcore = root.getImportsEcore();
    final Function1<ImportEcore, EPackage> _function = (ImportEcore it) -> {
      String _ref = it.getRef();
      return this.aleEcoreUtil.loadEPackageByEcorePath(_ref, rs);
    };
    final List<EPackage> ePackages = ListExtensions.<ImportEcore, EPackage>map(_importsEcore, _function);
    EList<ImportEcore> _importsEcore_1 = root.getImportsEcore();
    final Function1<ImportEcore, GenModel> _function_1 = (ImportEcore it) -> {
      String _ref = it.getRef();
      return this.aleEcoreUtil.loadGenmodelByEcorePath(_ref, rs);
    };
    final List<GenModel> genmodels = ListExtensions.<ImportEcore, GenModel>map(_importsEcore_1, _function_1);
    EList<ImportAle> _importsAle = root.getImportsAle();
    final Function1<ImportAle, Root> _function_2 = (ImportAle it) -> {
      return it.getRef();
    };
    final List<Root> parentRoots = ListExtensions.<ImportAle, Root>map(_importsAle, _function_2);
    IProject _project = this.file.getProject();
    this.revisitorInterfaceFilesave.save(root, ePackages, genmodels, _project, rs, parentRoots);
    IProject _project_1 = this.file.getProject();
    this.revisitorImplFilesave.save(root, _project_1, rs, ePackages, genmodels);
    GraphUtil _graphUtil = new GraphUtil(rs);
    final List<EClass> listAllClasses = _graphUtil.getListAllClasses(ePackages);
    final Function1<EClass, Pair<EClass, AleClass>> _function_3 = (EClass clazz) -> {
      String _name = clazz.getName();
      AleClass _aleClass = typeUtil.getAleClass(_name, root);
      return new Pair<EClass, AleClass>(clazz, _aleClass);
    };
    List<Pair<EClass, AleClass>> _map = ListExtensions.<EClass, Pair<EClass, AleClass>>map(listAllClasses, _function_3);
    final Function1<Pair<EClass, AleClass>, Boolean> _function_4 = (Pair<EClass, AleClass> p) -> {
      return Boolean.valueOf(((p.v == null) || Objects.equal(p.v.eContainer(), root)));
    };
    final Iterable<Pair<EClass, AleClass>> collect = IterableExtensions.<Pair<EClass, AleClass>>filter(_map, _function_4);
    final Consumer<Pair<EClass, AleClass>> _function_5 = (Pair<EClass, AleClass> pair) -> {
      IProject _project_2 = this.file.getProject();
      this.operationInterfaceFilesave.save(_project_2, pair.k, pair.v, rs, ePackages, root);
      IProject _project_3 = this.file.getProject();
      this.operationImplFilesave.save(_project_3, pair.k, pair.v, rs, ePackages, root);
    };
    collect.forEach(_function_5);
  }
}
