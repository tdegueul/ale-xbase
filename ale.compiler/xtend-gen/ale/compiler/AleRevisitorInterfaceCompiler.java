package ale.compiler;

import ale.compiler.filesave.AleRevisitorInterfaceFilesave;
import ale.utils.AleEcoreUtil;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

@SuppressWarnings("all")
public class AleRevisitorInterfaceCompiler {
  private IFile file;
  
  private AleRevisitorInterfaceFilesave filesave = new AleRevisitorInterfaceFilesave();
  
  private AleEcoreUtil ecoreLoadUtil = new AleEcoreUtil();
  
  public AleRevisitorInterfaceCompiler(final IFile file) {
    this.file = file;
  }
  
  public void compile() {
    final ResourceSetImpl rs = new ResourceSetImpl();
    final EPackage ePackage = this.ecoreLoadUtil.loadEPackage(this.file, rs);
    final GenModel genmodel = this.ecoreLoadUtil.loadGenmodel(this.file, rs);
    IProject _project = this.file.getProject();
    this.filesave.save(ePackage, genmodel, _project, rs);
  }
}
