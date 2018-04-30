package evalbasicfsm.revisitor.operations.evalbasicfsm;

import basicFsmEnv.runtime.Context;

@SuppressWarnings("all")
public interface VarDeclOperation {
  public abstract void eval(final Context ctx);
}
