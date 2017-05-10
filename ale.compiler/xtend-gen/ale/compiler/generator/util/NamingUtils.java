package ale.compiler.generator.util;

import ale.xtext.ale.AleClass;
import ale.xtext.ale.Root;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class NamingUtils {
  public String getRootNameOrDefault(final Root root) {
    String _xifexpression = null;
    if ((root == null)) {
      _xifexpression = "common";
    } else {
      _xifexpression = root.getName();
    }
    return _xifexpression;
  }
  
  public String getRootNameOrDefault(final AleClass root) {
    String _xifexpression = null;
    if ((root == null)) {
      return "common";
    } else {
      EObject _eContainer = root.eContainer();
      _xifexpression = ((Root) _eContainer).getName();
    }
    return _xifexpression;
  }
  
  public String getOperationInterfacePath(final EClass clazz, final String aleName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(aleName, "");
    _builder.append(".revisitor.operation.");
    String _firstUpper = StringExtensions.toFirstUpper(aleName);
    _builder.append(_firstUpper, "");
    String _name = clazz.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper_1, "");
    _builder.append("Operation");
    return _builder.toString();
  }
}
