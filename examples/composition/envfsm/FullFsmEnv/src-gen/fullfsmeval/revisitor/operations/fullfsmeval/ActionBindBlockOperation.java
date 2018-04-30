package fullfsmeval.revisitor.operations.fullfsmeval;

import basicFsmEnv.runtime.Context;
import evalbasicfsm.revisitor.operations.evalbasicfsm.ActionOperation;

@SuppressWarnings("all")
public interface ActionBindBlockOperation extends ActionOperation {
  public abstract void run(final Context ctx);
}
