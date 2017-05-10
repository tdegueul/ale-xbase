package ale.compiler.filesave;

import ale.compiler.filesave.FilesaveUtils;
import ale.compiler.generator.GenerateOperationImplXtend;
import ale.compiler.generator.util.NamingUtils;
import ale.xtext.ale.AleClass;
import ale.xtext.ale.Root;
import java.io.File;
import java.util.List;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class AleOperationImplFilesave {
  private FilesaveUtils filesaveUtils = new FilesaveUtils();
  
  @Extension
  private NamingUtils _namingUtils = new NamingUtils();
  
  public void save(final IProject project, final EClass eClass, final AleClass aleClass, final ResourceSet rs, final List<EPackage> ePackages, final Root root) {
    IPath _location = project.getLocation();
    final IPath targetFile = this.initOperationInterfaceFile(_location, eClass, aleClass);
    GenerateOperationImplXtend _generateOperationImplXtend = new GenerateOperationImplXtend(rs);
    final String fileContent = _generateOperationImplXtend.generate(eClass, aleClass, ePackages, root);
    this.filesaveUtils.saveContent(targetFile, fileContent, project);
  }
  
  private IPath initOperationInterfaceFile(final IPath location, final EClass eClass, final AleClass aleClass) {
    final String aleName = this._namingUtils.rootNameOrDefault(aleClass);
    IPath _append = location.append("src");
    IPath _append_1 = _append.append(aleName);
    IPath _append_2 = _append_1.append("revisitor");
    IPath _append_3 = _append_2.append("operation");
    final IPath directoryAlgebra = _append_3.append("impl");
    StringConcatenation _builder = new StringConcatenation();
    String _firstUpper = StringExtensions.toFirstUpper(aleName);
    _builder.append(_firstUpper, "");
    String _name = eClass.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper_1, "");
    _builder.append("OperationImpl");
    final String fileName = _builder.toString();
    File _file = directoryAlgebra.toFile();
    _file.mkdirs();
    IPath _append_4 = directoryAlgebra.append(fileName);
    return _append_4.addFileExtension("java");
  }
}
