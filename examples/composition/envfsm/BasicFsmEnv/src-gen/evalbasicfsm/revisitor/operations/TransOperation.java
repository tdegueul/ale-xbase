package evalbasicfsm.revisitor.operations;

import basicFsmEnv.runtime.Context;

@SuppressWarnings("all")
public interface TransOperation {
  public abstract void fire(final Context ctx);
}
