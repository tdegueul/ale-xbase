package tokenholderexec.revisitor.operations;

import java.util.List;
import tokenHolder.H;
import tokenHolder.T;

@SuppressWarnings("all")
public interface POperation {
  public abstract List<H> outHolders();
  
  public abstract List<H> inHolders();
  
  public abstract T createToken();
  
  public abstract boolean enabled();
  
  public abstract boolean fire();
}
