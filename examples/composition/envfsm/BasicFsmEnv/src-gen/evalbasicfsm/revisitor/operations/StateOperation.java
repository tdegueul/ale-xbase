package evalbasicfsm.revisitor.operations;

import basicFsmEnv.runtime.Context;

@SuppressWarnings("all")
public interface StateOperation {
  public abstract void step(final String event, final Context ctx);
}
