package gfsmprint.revisitor.operations;

import gfsmprint.revisitor.operations.StateOperation;

@SuppressWarnings("all")
public interface InitialStateOperation extends StateOperation {
  public abstract String print();
}
