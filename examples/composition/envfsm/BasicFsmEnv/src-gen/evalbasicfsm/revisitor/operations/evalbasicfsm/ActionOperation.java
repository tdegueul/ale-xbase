package evalbasicfsm.revisitor.operations.evalbasicfsm;

import basicFsmEnv.runtime.Context;

@SuppressWarnings("all")
public interface ActionOperation {
  public abstract void run(final Context ctx);
}
