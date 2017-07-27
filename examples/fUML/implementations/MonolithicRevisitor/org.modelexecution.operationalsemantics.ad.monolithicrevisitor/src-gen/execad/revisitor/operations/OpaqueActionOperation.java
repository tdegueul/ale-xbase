package execad.revisitor.operations;

import execad.revisitor.operations.ActionOperation;
import execad.revisitor.operations.ActivityNodeOperation;

@SuppressWarnings("all")
public interface OpaqueActionOperation extends ActionOperation, ActivityNodeOperation {
  public abstract void doAction();
}
