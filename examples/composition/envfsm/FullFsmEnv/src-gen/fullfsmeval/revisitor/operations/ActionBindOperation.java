package fullfsmeval.revisitor.operations;

import basicFsmEnv.runtime.Context;
import evalbasicfsm.revisitor.operations.ActionOperation;

@SuppressWarnings("all")
public interface ActionBindOperation extends ActionOperation {
  public abstract void run(final Context ctx);
}
