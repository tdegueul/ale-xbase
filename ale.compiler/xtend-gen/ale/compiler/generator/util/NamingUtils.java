package ale.compiler.generator.util;

import ale.xtext.ale.AleClass;
import ale.xtext.ale.Root;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class NamingUtils {
  public String rootNameOrDefault(final Root root) {
    String _xifexpression = null;
    if ((root == null)) {
      _xifexpression = "common";
    } else {
      _xifexpression = root.getName();
    }
    return _xifexpression;
  }
  
  public String rootNameOrDefault(final AleClass root) {
    String _xifexpression = null;
    if ((root == null)) {
      return "common";
    } else {
      EObject _eContainer = root.eContainer();
      _xifexpression = ((Root) _eContainer).getName();
    }
    return _xifexpression;
  }
}
