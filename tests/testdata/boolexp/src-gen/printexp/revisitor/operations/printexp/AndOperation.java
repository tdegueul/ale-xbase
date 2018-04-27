package printexp.revisitor.operations.printexp;

import printexp.revisitor.operations.printexp.BinaryExpOperation;
import printexp.revisitor.operations.printexp.ExpOperation;

@SuppressWarnings("all")
public interface AndOperation extends BinaryExpOperation, ExpOperation {
  public abstract String print();
}
