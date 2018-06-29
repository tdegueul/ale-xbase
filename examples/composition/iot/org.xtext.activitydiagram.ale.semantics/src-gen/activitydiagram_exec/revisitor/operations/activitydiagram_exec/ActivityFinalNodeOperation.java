package activitydiagram_exec.revisitor.operations.activitydiagram_exec;

import activitydiagram.Context;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ActivityNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ControlNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.FinalNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.NamedActivityOperation;

@SuppressWarnings("all")
public interface ActivityFinalNodeOperation extends FinalNodeOperation, ControlNodeOperation, ActivityNodeOperation, NamedActivityOperation {
  public abstract void execute(final Context c);
}
