package evalfsm.revisitor.operations.evalfsm;

import fsm.dyn.Context;

@SuppressWarnings("all")
public interface StateOperation {
  public abstract void step(final String event, final Context ctx);
}
