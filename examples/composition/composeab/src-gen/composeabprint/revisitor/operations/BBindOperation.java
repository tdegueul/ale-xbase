package composeabprint.revisitor.operations;

import printsimplea.revisitor.operations.BOperation;

@SuppressWarnings("all")
public interface BBindOperation extends BOperation {
  public abstract void call();
  
  public abstract void callWithArg(final String value);
}
