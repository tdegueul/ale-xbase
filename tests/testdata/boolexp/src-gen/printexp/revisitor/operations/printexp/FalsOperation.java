package printexp.revisitor.operations.printexp;

import printexp.revisitor.operations.printexp.ExpOperation;
import printexp.revisitor.operations.printexp.LitOperation;

@SuppressWarnings("all")
public interface FalsOperation extends LitOperation, ExpOperation {
  public abstract String print();
}
