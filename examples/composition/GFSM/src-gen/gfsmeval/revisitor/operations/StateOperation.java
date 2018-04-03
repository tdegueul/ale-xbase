package gfsmeval.revisitor.operations;

import gfsm.dyn.Context;

@SuppressWarnings("all")
public interface StateOperation {
  public abstract void step(final String event, final Context ctx);
}
