package ale.compiler.generator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class JavaPathUtil {
  public CharSequence javaFullPath(final EClass eClass) {
    StringConcatenation _builder = new StringConcatenation();
    EPackage _ePackage = eClass.getEPackage();
    String _name = _ePackage.getName();
    _builder.append(_name, "");
    _builder.append(".");
    String _name_1 = eClass.getName();
    _builder.append(_name_1, "");
    return _builder;
  }
}
