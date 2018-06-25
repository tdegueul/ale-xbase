package fullfsmeval.converters;

import basicFsmEnv.runtime.Context;
import boolExpEnv.runtime.Env;
import java.util.function.BiConsumer;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class GuardToExpWithevalToeval {
  private final Context ctx;
  
  public GuardToExpWithevalToeval(final Context ctx) {
    this.ctx = ctx;
  }
  
  public void setNenv(final Env nenv) {
    this.nenv = nenv;
  }
  
  private Env nenv;
  
  public Env adaptenv() {
    Env _env = new Env();
    final Procedure1<Env> _function = (Env it) -> {
      final BiConsumer<String, Object> _function_1 = (String k, Object v) -> {
        if ((v instanceof Boolean)) {
          it.bind(k, ((Boolean)v));
        }
      };
      this.ctx.getEnv().forEach(_function_1);
    };
    return ObjectExtensions.<Env>operator_doubleArrow(_env, _function);
  }
  
  public boolean convertReturn(final boolean value) {
    return value;
  }
}
