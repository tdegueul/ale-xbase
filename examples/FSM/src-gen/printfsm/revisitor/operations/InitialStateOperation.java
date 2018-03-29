package printfsm.revisitor.operations;

import printfsm.revisitor.operations.StateOperation;

@SuppressWarnings("all")
public interface InitialStateOperation extends StateOperation {
  public abstract String print();
}
