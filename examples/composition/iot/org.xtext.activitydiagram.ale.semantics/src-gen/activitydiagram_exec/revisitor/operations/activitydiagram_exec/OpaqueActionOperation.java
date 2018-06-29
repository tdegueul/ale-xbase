package activitydiagram_exec.revisitor.operations.activitydiagram_exec;

import activitydiagram.Context;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ActionOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ActivityNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ExecutableNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.NamedActivityOperation;

@SuppressWarnings("all")
public interface OpaqueActionOperation extends ActionOperation, ExecutableNodeOperation, ActivityNodeOperation, NamedActivityOperation {
  public abstract void execute(final Context c);
}
