package evalgfsmboolexp.revisitor.operations;

import gfsmeval.revisitor.operations.GuardOperation;

@SuppressWarnings("all")
public interface GuardBindOperation extends GuardOperation {
  public abstract boolean evaluate();
}
