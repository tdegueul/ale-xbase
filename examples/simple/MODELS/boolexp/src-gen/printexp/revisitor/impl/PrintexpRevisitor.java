package printexp.revisitor.impl;

import boolexp.And;
import boolexp.Fals;
import boolexp.Or;
import boolexp.Tru;
import boolexp.revisitor.BoolexpRevisitor;
import printexp.revisitor.operations.printexp.AndOperation;
import printexp.revisitor.operations.printexp.BinaryExpOperation;
import printexp.revisitor.operations.printexp.ExpOperation;
import printexp.revisitor.operations.printexp.FalsOperation;
import printexp.revisitor.operations.printexp.LitOperation;
import printexp.revisitor.operations.printexp.OrOperation;
import printexp.revisitor.operations.printexp.TruOperation;

@SuppressWarnings("all")
public interface PrintexpRevisitor extends BoolexpRevisitor<AndOperation, BinaryExpOperation, ExpOperation, FalsOperation, LitOperation, OrOperation, TruOperation> {
  @Override
  public default AndOperation boolexp__And(final And it) {
    return new printexp.revisitor.operations.printexp.impl.AndOperationImpl(it, this);
  }
  
  @Override
  public default FalsOperation boolexp__Fals(final Fals it) {
    return new printexp.revisitor.operations.printexp.impl.FalsOperationImpl(it, this);
  }
  
  @Override
  public default OrOperation boolexp__Or(final Or it) {
    return new printexp.revisitor.operations.printexp.impl.OrOperationImpl(it, this);
  }
  
  @Override
  public default TruOperation boolexp__Tru(final Tru it) {
    return new printexp.revisitor.operations.printexp.impl.TruOperationImpl(it, this);
  }
}
