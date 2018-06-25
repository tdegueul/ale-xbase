package evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm;

import basicFsmEnv.runtime.Context;
import evalbasicfsm.revisitor.operations.evalbasicfsm.StateOperation;

@SuppressWarnings("all")
public interface CompositeStateOperation extends StateOperation, evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.StateOperation {
  public abstract void step(final String event, final Context ctx);
}
