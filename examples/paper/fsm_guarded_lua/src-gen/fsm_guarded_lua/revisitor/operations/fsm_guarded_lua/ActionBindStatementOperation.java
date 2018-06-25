package fsm_guarded_lua.revisitor.operations.fsm_guarded_lua;

import basicFsmEnv.runtime.Context;
import evalbasicfsm.revisitor.operations.evalbasicfsm.ActionOperation;

@SuppressWarnings("all")
public interface ActionBindStatementOperation extends ActionOperation {
  public abstract void run(final Context ctx);
}
