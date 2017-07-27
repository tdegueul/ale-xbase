package execad.revisitor.operations;

import execad.revisitor.operations.ActivityNodeOperation;
import execad.revisitor.operations.ControlNodeOperation;

@SuppressWarnings("all")
public interface MergeNodeOperation extends ControlNodeOperation, ActivityNodeOperation {
  public abstract boolean hasOffers();
}
