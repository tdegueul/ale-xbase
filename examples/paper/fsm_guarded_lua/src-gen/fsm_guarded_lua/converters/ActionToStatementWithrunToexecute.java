package fsm_guarded_lua.converters;

import basicFsmEnv.runtime.Context;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.lua.semantics.model.Environment;

@SuppressWarnings("all")
public class ActionToStatementWithrunToexecute {
  private final Context ctx;
  
  public ActionToStatementWithrunToexecute(final Context ctx) {
    this.ctx = ctx;
  }
  
  public void setCp(final Environment cp) {
    this.cp = cp;
  }
  
  private Environment cp;
  
  public Environment adaptc() {
    Environment _environment = new Environment();
    final Procedure1<Environment> _function = (Environment it) -> {
      it.getVariables().putAll(this.ctx.getEnv());
    };
    return ObjectExtensions.<Environment>operator_doubleArrow(_environment, _function);
  }
}
