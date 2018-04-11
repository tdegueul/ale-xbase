package tokenholderexec.revisitor.operations;

import java.util.List;
import tokenHolder.H;
import tokenHolder.P;

@SuppressWarnings("all")
public interface ROperation {
  public abstract List<H> getH();
  
  public abstract List<P> getP();
  
  public abstract void main();
}
