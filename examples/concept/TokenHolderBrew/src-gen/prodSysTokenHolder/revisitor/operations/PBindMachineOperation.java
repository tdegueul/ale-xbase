package prodSysTokenHolder.revisitor.operations;

import java.util.List;
import tokenHolder.H;
import tokenHolder.T;
import tokenholderexec.revisitor.operations.POperation;

@SuppressWarnings("all")
public interface PBindMachineOperation extends POperation {
  public abstract List<H> outHolders();
  
  public abstract List<H> inHolders();
  
  public abstract T createToken();
  
  public abstract boolean enabled();
  
  public abstract boolean fire();
}