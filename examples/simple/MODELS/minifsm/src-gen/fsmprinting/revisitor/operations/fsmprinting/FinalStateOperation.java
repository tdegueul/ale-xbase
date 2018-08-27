package fsmprinting.revisitor.operations.fsmprinting;

import fsmprinting.revisitor.operations.fsmprinting.StateOperation;

@SuppressWarnings("all")
public interface FinalStateOperation extends StateOperation {
  public abstract String print();
}
