package activitydiagram_exec.revisitor.operations;

import activitydiagram_exec.revisitor.operations.ActivityNodeOperation;
import activitydiagram_exec.revisitor.operations.ControlNodeOperation;
import activitydiagram_exec.revisitor.operations.NamedElementOperation;

@SuppressWarnings("all")
public interface FinalNodeOperation extends ControlNodeOperation, ActivityNodeOperation, NamedElementOperation {
}
