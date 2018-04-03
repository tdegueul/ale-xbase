package printgfsmboolexp.revisitor.operations;

import gfsmprint.revisitor.operations.GuardOperation;

@SuppressWarnings("all")
public interface GuardBindOperation extends GuardOperation {
  public abstract String evaluate();
}
