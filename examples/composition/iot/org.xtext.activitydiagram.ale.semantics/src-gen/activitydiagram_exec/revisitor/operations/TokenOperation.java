package activitydiagram_exec.revisitor.operations;

import activitydiagram.ActivityNode;
import activitydiagramruntime.Token;

@SuppressWarnings("all")
public interface TokenOperation {
  public abstract Token transfer(final ActivityNode holder);
  
  public abstract void withdraw();
  
  public abstract boolean isWithdrawn();
}
