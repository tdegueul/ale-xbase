package evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm;

import basicFsmEnv.runtime.Context;
import evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.StateOperation;

@SuppressWarnings("all")
public interface CompositeStateOperation extends StateOperation, evalbasicfsm.revisitor.operations.evalbasicfsm.StateOperation {
  public abstract void step(final String event, final Context ctx);
}
