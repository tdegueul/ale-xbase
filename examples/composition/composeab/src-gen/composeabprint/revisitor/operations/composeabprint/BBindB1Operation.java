package composeabprint.revisitor.operations.composeabprint;

import printsimplea.revisitor.operations.printsimplea.BOperation;

@SuppressWarnings("all")
public interface BBindB1Operation extends BOperation {
  public abstract void call();
  
  public abstract void callWithArg(final String value);
}
