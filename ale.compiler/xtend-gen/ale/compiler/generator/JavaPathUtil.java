package ale.compiler.generator;

import com.google.common.base.Objects;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

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
  
  public CharSequence classifierFullPath(final EClass eClass) {
    StringConcatenation _builder = new StringConcatenation();
    EPackage _ePackage = eClass.getEPackage();
    String _name = _ePackage.getName();
    _builder.append(_name, "");
    _builder.append(".");
    EPackage _ePackage_1 = eClass.getEPackage();
    String _name_1 = _ePackage_1.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper, "");
    _builder.append("Package.");
    String _name_2 = eClass.getName();
    String _upperSnake = this.toUpperSnake(_name_2);
    _builder.append(_upperSnake, "");
    return _builder;
  }
  
  private String toUpperSnake(final String input) {
    String _xblockexpression = null;
    {
      String ret = "";
      int i = 0;
      char[] _charArray = input.toCharArray();
      for (final char c : _charArray) {
        {
          if ((i == 0)) {
            String _ret = ret;
            ret = (_ret + Character.valueOf(c));
          } else {
            String _string = Character.valueOf(c).toString();
            String _upperCase = _string.toUpperCase();
            String _string_1 = Character.valueOf(c).toString();
            boolean _equals = Objects.equal(_upperCase, _string_1);
            if (_equals) {
              String _ret_1 = ret;
              ret = (_ret_1 + ("_" + Character.valueOf(c)));
            } else {
              String _ret_2 = ret;
              ret = (_ret_2 + Character.valueOf(c));
            }
          }
          i++;
        }
      }
      _xblockexpression = ret.toUpperCase();
    }
    return _xblockexpression;
  }
}
