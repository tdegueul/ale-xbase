package printsimplea.revisitor.operations;

@SuppressWarnings("all")
public interface BOperation {
  public abstract void call();
  
  public abstract void callWithArg(final String value);
}
