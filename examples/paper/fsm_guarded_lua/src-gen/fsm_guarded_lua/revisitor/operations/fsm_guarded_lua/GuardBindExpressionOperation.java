package fsm_guarded_lua.revisitor.operations.fsm_guarded_lua;

import basicFsmEnv.runtime.Context;
import evalbasicfsm.revisitor.operations.evalbasicfsm.GuardOperation;

@SuppressWarnings("all")
public interface GuardBindExpressionOperation extends GuardOperation {
  public abstract boolean eval(final Context ctx);
}
