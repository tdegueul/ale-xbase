package evalbasicfsm.revisitor.operations;

import basicFsmEnv.runtime.Context;

@SuppressWarnings("all")
public interface MachineOperation {
  public abstract void exec(final String[] events, final Context ctx);
}
