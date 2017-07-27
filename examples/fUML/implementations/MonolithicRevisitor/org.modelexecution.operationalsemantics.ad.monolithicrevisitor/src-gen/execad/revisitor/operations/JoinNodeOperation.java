package execad.revisitor.operations;

import execad.revisitor.operations.ActivityNodeOperation;
import execad.revisitor.operations.ControlNodeOperation;

@SuppressWarnings("all")
public interface JoinNodeOperation extends ControlNodeOperation, ActivityNodeOperation {
  public abstract boolean isReady();
}
