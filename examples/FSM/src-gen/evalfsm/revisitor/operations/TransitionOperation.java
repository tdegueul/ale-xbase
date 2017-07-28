package evalfsm.revisitor.operations;

import fsm.dyn.Context;

@SuppressWarnings("all")
public interface TransitionOperation {
  public abstract void fire(final Context ctx);
}
