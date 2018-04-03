package gfsmeval.revisitor.operations;

import gfsm.dyn.Context;

@SuppressWarnings("all")
public interface TransitionOperation {
  public abstract void fire(final Context ctx);
}
