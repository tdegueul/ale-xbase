package ale.compiler.generator.util;

import java.util.Comparator;
import java.util.List;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class DollarGeneratorUtil {
  public void sortForDollars(final List<EClass> eclasses) {
    final Comparator<EClass> _function = (EClass c1, EClass c2) -> {
      int _xifexpression = (int) 0;
      boolean _isSuperTypeOf = c1.isSuperTypeOf(c2);
      if (_isSuperTypeOf) {
        _xifexpression = 1;
      } else {
        int _xifexpression_1 = (int) 0;
        boolean _isSuperTypeOf_1 = c2.isSuperTypeOf(c1);
        if (_isSuperTypeOf_1) {
          _xifexpression_1 = (-1);
        } else {
          _xifexpression_1 = 0;
        }
        _xifexpression = _xifexpression_1;
      }
      return _xifexpression;
    };
    eclasses.sort(_function);
  }
}
