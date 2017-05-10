package ale.compiler;

import ale.compiler.filesave.AleRevisitorInterfaceFilesave;
import ale.utils.AleEcoreUtil;
import ale.xtext.AleRuntimeModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.resource.XtextResourceSet;

@SuppressWarnings("all")
public class AleRevisitorInterfaceCompiler {
  private IFile file;
  
  private AleRevisitorInterfaceFilesave filesave = new AleRevisitorInterfaceFilesave();
  
  private AleEcoreUtil ecoreLoadUtil = new AleEcoreUtil();
  
  @Inject
  private XtextResourceSet rs;
  
  public AleRevisitorInterfaceCompiler(final IFile file) {
    this.file = file;
  }
  
  public void compile() {
    AleRuntimeModule _aleRuntimeModule = new AleRuntimeModule();
    final Injector injector = Guice.createInjector(_aleRuntimeModule);
    injector.injectMembers(this);
    final EPackage ePackage = this.ecoreLoadUtil.loadEPackage(this.file, this.rs);
    final GenModel genmodel = this.ecoreLoadUtil.loadGenmodel(this.file, this.rs);
    IProject _project = this.file.getProject();
    this.filesave.save(ePackage, genmodel, _project, this.rs);
  }
}
