package evalbasicfsm.revisitor.operations.evalbasicfsm;

import basicFsmEnv.runtime.Context;

@SuppressWarnings("all")
public interface GuardOperation {
  public abstract boolean eval(final Context ctx);
}
