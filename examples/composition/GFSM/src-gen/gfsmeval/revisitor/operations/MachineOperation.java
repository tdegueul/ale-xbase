package gfsmeval.revisitor.operations;

import gfsm.dyn.Context;

@SuppressWarnings("all")
public interface MachineOperation {
  public abstract void execute(final String[] events, final Context ctx);
}
