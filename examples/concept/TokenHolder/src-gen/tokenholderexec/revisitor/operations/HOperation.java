package tokenholderexec.revisitor.operations;

import java.util.List;
import tokenHolder.T;

@SuppressWarnings("all")
public interface HOperation {
  public abstract List<T> getTokens();
}
