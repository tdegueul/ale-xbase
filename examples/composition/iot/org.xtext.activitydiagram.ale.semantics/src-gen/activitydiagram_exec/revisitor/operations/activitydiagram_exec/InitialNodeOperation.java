package activitydiagram_exec.revisitor.operations.activitydiagram_exec;

import activitydiagram.Context;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ActivityNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ControlNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.NamedActivityOperation;

@SuppressWarnings("all")
public interface InitialNodeOperation extends ControlNodeOperation, ActivityNodeOperation, NamedActivityOperation {
  public abstract void execute(final Context c);
  
  public abstract boolean hasOffers();
}
