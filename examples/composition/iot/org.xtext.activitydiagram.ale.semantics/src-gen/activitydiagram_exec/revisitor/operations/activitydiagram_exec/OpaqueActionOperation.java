package activitydiagram_exec.revisitor.operations.activitydiagram_exec;

import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ActionOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ActivityNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ExecutableNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.NamedElementOperation;
import activitydiagramruntime.Context;

@SuppressWarnings("all")
public interface OpaqueActionOperation extends ActionOperation, ExecutableNodeOperation, ActivityNodeOperation, NamedElementOperation {
  public abstract void execute(final Context c);
}