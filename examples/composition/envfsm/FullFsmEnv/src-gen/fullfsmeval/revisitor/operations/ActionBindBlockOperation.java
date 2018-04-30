package fullfsmeval.revisitor.operations;

import basicFsmEnv.runtime.Context;
import evalbasicfsm.revisitor.operations.ActionOperation;

@SuppressWarnings("all")
public interface ActionBindBlockOperation extends ActionOperation {
  public abstract void run(final Context ctx);
}
