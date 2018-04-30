package fullfsmeval.converters;

import basicFsmEnv.runtime.Context;
import java.util.function.BiConsumer;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import simpleALEnv.runtime.Env;

@SuppressWarnings("all")
public class ActionToBlockWithrunToeval {
  private final Context ctx;
  
  public ActionToBlockWithrunToeval(final Context ctx) {
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
        if ((v instanceof Integer)) {
          it.bind(k, ((Integer)v));
        }
      };
      this.ctx.getEnv().forEach(_function_1);
    };
    return ObjectExtensions.<Env>operator_doubleArrow(_env, _function);
  }
  
  public void doInverse() {
    final BiConsumer<String, Integer> _function = (String k, Integer v) -> {
      this.ctx.bind(k, v);
    };
    this.nenv.getEnv().forEach(_function);
  }
  
  public Env conversionenv() {
    return null;
  }
}
