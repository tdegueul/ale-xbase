package evalbasicfsm.revisitor.operations;

import basicFsmEnv.runtime.Context;

@SuppressWarnings("all")
public interface VarDeclOperation {
  public abstract void eval(final Context ctx);
}
