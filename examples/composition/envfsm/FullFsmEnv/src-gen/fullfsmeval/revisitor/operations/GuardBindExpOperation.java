package fullfsmeval.revisitor.operations;

import basicFsmEnv.runtime.Context;
import evalbasicfsm.revisitor.operations.GuardOperation;

@SuppressWarnings("all")
public interface GuardBindExpOperation extends GuardOperation {
  public abstract boolean eval(final Context ctx);
}
