package ale.compiler.filesave;

import ale.compiler.filesave.FilesaveUtils;
import ale.compiler.generator.GenerateRevisitorImplXtend;
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
public class AleRevisitorImplFilesave {
  private FilesaveUtils filesaveUtils = new FilesaveUtils();
  
  public void save(final Root root, final IProject project, final ResourceSet rs, final List<EPackage> ePackages, final List<GenModel> genmodels) {
    final String revisitorName = root.getName();
    IPath _location = project.getLocation();
    final IPath targetFile = this.initRevisitorImplFile(_location, revisitorName);
    GenerateRevisitorImplXtend _generateRevisitorImplXtend = new GenerateRevisitorImplXtend(rs);
    final String fileContent = _generateRevisitorImplXtend.generate(root, ePackages, genmodels);
    this.filesaveUtils.saveContent(targetFile, fileContent, project);
  }
  
  private IPath initRevisitorImplFile(final IPath location, final String name) {
    IPath _append = location.append("src");
    IPath _append_1 = _append.append(name);
    IPath _append_2 = _append_1.append("revisitor");
    final IPath file = _append_2.append("impl");
    File _file = file.toFile();
    _file.mkdirs();
    String _firstUpper = StringExtensions.toFirstUpper(name);
    String _plus = (_firstUpper + "RevisitorImpl");
    IPath _append_3 = file.append(_plus);
    return _append_3.addFileExtension("java");
  }
}
