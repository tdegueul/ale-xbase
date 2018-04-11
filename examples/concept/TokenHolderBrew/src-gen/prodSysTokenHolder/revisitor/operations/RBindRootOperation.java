package prodSysTokenHolder.revisitor.operations;

import java.util.List;
import tokenHolder.H;
import tokenHolder.P;
import tokenholderexec.revisitor.operations.ROperation;

@SuppressWarnings("all")
public interface RBindRootOperation extends ROperation {
  public abstract List<H> getH();
  
  public abstract List<P> getP();
  
  public abstract void main();
}
