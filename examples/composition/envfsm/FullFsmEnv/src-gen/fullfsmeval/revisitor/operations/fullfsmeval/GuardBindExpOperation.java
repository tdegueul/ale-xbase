package fullfsmeval.revisitor.operations.fullfsmeval;

import basicFsmEnv.runtime.Context;
import evalbasicfsm.revisitor.operations.evalbasicfsm.GuardOperation;

@SuppressWarnings("all")
public interface GuardBindExpOperation extends GuardOperation {
  public abstract boolean eval(final Context ctx);
}
