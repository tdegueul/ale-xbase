package execad.revisitor.operations;

import activitydiagram.ActivityNode;
import activitydiagram.Token;

@SuppressWarnings("all")
public interface TokenOperation {
  public abstract boolean isWithdrawn();
  
  public abstract void withdraw();
  
  public abstract Token transfer(final ActivityNode holder);
}
