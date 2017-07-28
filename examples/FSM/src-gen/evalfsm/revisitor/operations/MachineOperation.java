package evalfsm.revisitor.operations;

import fsm.dyn.Context;

@SuppressWarnings("all")
public interface MachineOperation {
  public abstract void execute(final String[] events, final Context ctx);
}
