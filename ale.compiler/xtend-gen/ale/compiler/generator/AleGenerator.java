package ale.compiler.generator;

import ale.compiler.generator.RevisitorGenerator;
import ale.compiler.generator.util.NamingUtils;
import ale.xtext.ale.AleClass;
import ale.xtext.ale.Root;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class AleGenerator {
  private IProject project;
  
  private ResourceSet rs;
  
  private RevisitorGenerator generator;
  
  @Extension
  private NamingUtils _namingUtils = new NamingUtils();
  
  public AleGenerator(final IProject project, final ResourceSet rs) {
    this.project = project;
    this.rs = rs;
    RevisitorGenerator _revisitorGenerator = new RevisitorGenerator(rs);
    this.generator = _revisitorGenerator;
  }
  
  public void saveRevisitorInterface(final EPackage pkg, final GenModel gm, final ResourceSet rs) {
    String _name = pkg.getName();
    String _plus = ("src/" + _name);
    String _plus_1 = (_plus + "/revisitor");
    Path _path = new Path(_plus_1);
    String _name_1 = pkg.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name_1);
    String _plus_2 = (_firstUpper + "Revisitor");
    Path _path_1 = new Path(_plus_2);
    final IPath f = this.prepareFile(_path, _path_1);
    final String content = this.generator.generateInterface(pkg, gm);
    this.saveContent(f, content);
  }
  
  public void saveRevisitorImpl(final Root root, final List<EPackage> pkgs, final List<GenModel> gms) {
    String _name = root.getName();
    String _plus = ("src/" + _name);
    String _plus_1 = (_plus + "/revisitor/impl");
    Path _path = new Path(_plus_1);
    String _name_1 = root.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name_1);
    String _plus_2 = (_firstUpper + "RevisitorImpl");
    Path _path_1 = new Path(_plus_2);
    final IPath f = this.prepareFile(_path, _path_1);
    final String content = this.generator.generateImpl(root, pkgs, gms);
    this.saveContent(f, content);
  }
  
  public void saveOperationInterface(final EClass eClass, final AleClass cls, final List<EPackage> pkgs, final Root root) {
    final String aleName = this._namingUtils.getRootNameOrDefault(cls);
    Path _path = new Path((("src/" + aleName) + "/revisitor/operation"));
    String _firstUpper = StringExtensions.toFirstUpper(aleName);
    String _name = eClass.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name);
    String _plus = (_firstUpper + _firstUpper_1);
    String _plus_1 = (_plus + "Operation");
    Path _path_1 = new Path(_plus_1);
    final IPath f = this.prepareFile(_path, _path_1);
    final String content = this.generator.generateOperationInterface(eClass, cls, pkgs, root);
    this.saveContent(f, content);
  }
  
  public void saveOperationImpl(final EClass eClass, final AleClass aleClass, final List<EPackage> pkgs, final Root root) {
    final String aleName = this._namingUtils.getRootNameOrDefault(aleClass);
    Path _path = new Path((("src/" + aleName) + "/revisitor/operation/impl"));
    String _firstUpper = StringExtensions.toFirstUpper(aleName);
    String _name = eClass.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name);
    String _plus = (_firstUpper + _firstUpper_1);
    String _plus_1 = (_plus + "OperationImpl");
    Path _path_1 = new Path(_plus_1);
    final IPath f = this.prepareFile(_path, _path_1);
    final String content = this.generator.generateOperationImpl(eClass, aleClass, pkgs, root);
    this.saveContent(f, content);
  }
  
  private IPath prepareFile(final IPath path, final IPath filename) {
    IPath _location = this.project.getLocation();
    final IPath file = _location.append(path);
    File _file = file.toFile();
    _file.mkdirs();
    IPath _append = file.append(filename);
    return _append.addFileExtension("java");
  }
  
  private void saveContent(final IPath target, final String fileContent) {
    try {
      File _file = target.toFile();
      final FileWriter fileWriter = new FileWriter(_file);
      fileWriter.write(fileContent);
      fileWriter.close();
      NullProgressMonitor _nullProgressMonitor = new NullProgressMonitor();
      this.project.refreshLocal(IResource.DEPTH_INFINITE, _nullProgressMonitor);
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        e.printStackTrace();
      } else if (_t instanceof CoreException) {
        final CoreException e_1 = (CoreException)_t;
        e_1.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
