package ale.compiler.filesave;

import ale.compiler.filesave.FilesaveUtils;
import ale.compiler.generator.RevisitorGenerator;
import ale.xtext.ale.Root;
import java.io.File;
import java.util.List;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class AleRevisitorInterfaceFilesave {
  private FilesaveUtils filesaveUtils = new FilesaveUtils();
  
  public void save(final EPackage ePackage, final GenModel genmodel, final IProject project, final ResourceSet rs) {
    final String revisitorName = ePackage.getName();
    IPath _location = project.getLocation();
    final IPath target = this.initRevisitorInterfaceFile(_location, revisitorName);
    RevisitorGenerator _revisitorGenerator = new RevisitorGenerator(rs);
    final String fileContent = _revisitorGenerator.generateInterface(ePackage, genmodel);
    this.filesaveUtils.saveContent(target, fileContent, project);
  }
  
  public void save(final Root root, final List<EPackage> ePackages, final List<GenModel> genmodels, final IProject project, final ResourceSet rs, final List<Root> parentRoots) {
    final String revisitorName = root.getName();
    IPath _location = project.getLocation();
    final IPath target = this.initRevisitorInterfaceFile(_location, revisitorName);
    RevisitorGenerator _revisitorGenerator = new RevisitorGenerator(rs);
    final String fileContent = _revisitorGenerator.generateInterface(revisitorName, ePackages, genmodels, parentRoots, Boolean.valueOf(false));
    this.filesaveUtils.saveContent(target, fileContent, project);
  }
  
  private IPath initRevisitorInterfaceFile(final IPath projectLocation, final String name) {
    IPath _append = projectLocation.append("src");
    IPath _append_1 = _append.append(name);
    final IPath file = _append_1.append("revisitor");
    File _file = file.toFile();
    _file.mkdirs();
    String _firstUpper = StringExtensions.toFirstUpper(name);
    String _plus = (_firstUpper + "Revisitor");
    IPath _append_2 = file.append(_plus);
    return _append_2.addFileExtension("java");
  }
}
