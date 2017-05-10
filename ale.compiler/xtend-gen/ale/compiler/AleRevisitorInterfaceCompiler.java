package ale.compiler;

import ale.compiler.filesave.AleRevisitorInterfaceFilesave;
import ale.utils.EcoreUtils;
import ale.xtext.AleRuntimeModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class AleRevisitorInterfaceCompiler {
  private IFile file;
  
  private AleRevisitorInterfaceFilesave filesave = new AleRevisitorInterfaceFilesave();
  
  @Extension
  private EcoreUtils _ecoreUtils = new EcoreUtils();
  
  @Inject
  private XtextResourceSet rs;
  
  public AleRevisitorInterfaceCompiler(final IFile file) {
    this.file = file;
  }
  
  public void compile() {
    AleRuntimeModule _aleRuntimeModule = new AleRuntimeModule();
    final Injector injector = Guice.createInjector(_aleRuntimeModule);
    injector.injectMembers(this);
    IPath _fullPath = this.file.getFullPath();
    String _string = _fullPath.toString();
    final EPackage ePackage = this._ecoreUtils.loadEPackage(this.rs, _string);
    IPath _fullPath_1 = this.file.getFullPath();
    String _string_1 = _fullPath_1.toString();
    final GenModel genmodel = this._ecoreUtils.loadCorrespondingGenmodel(this.rs, _string_1);
    IProject _project = this.file.getProject();
    this.filesave.save(ePackage, genmodel, _project, this.rs);
  }
}
