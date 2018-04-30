package evalbasicfsm.revisitor.operations.evalbasicfsm;

import basicFsmEnv.runtime.Context;

@SuppressWarnings("all")
public interface TransOperation {
  public abstract void fire(final Context ctx);
}
