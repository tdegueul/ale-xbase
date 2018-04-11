package prodSysTokenHolder.revisitor.operations;

import java.util.List;
import tokenHolder.T;
import tokenholderexec.revisitor.operations.HOperation;

@SuppressWarnings("all")
public interface HBindConveyorOperation extends HOperation {
  public abstract List<T> getTokens();
}
