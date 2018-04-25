package activitydiagram_exec.revisitor.operations;

import activitydiagram_exec.revisitor.operations.ActivityNodeOperation;
import activitydiagram_exec.revisitor.operations.ExecutableNodeOperation;
import activitydiagram_exec.revisitor.operations.NamedElementOperation;

@SuppressWarnings("all")
public interface ActionOperation extends ExecutableNodeOperation, ActivityNodeOperation, NamedElementOperation {
}
