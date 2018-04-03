package printexp.revisitor;

import boolexp.And;
import boolexp.Fals;
import boolexp.Or;
import boolexp.Tru;
import boolexp.revisitor.BoolexpRevisitor;
import printexp.revisitor.operations.AndOperation;
import printexp.revisitor.operations.ExpOperation;
import printexp.revisitor.operations.FalsOperation;
import printexp.revisitor.operations.OrOperation;
import printexp.revisitor.operations.TruOperation;

@SuppressWarnings("all")
public interface PrintexpRevisitor extends BoolexpRevisitor<AndOperation, ExpOperation, ExpOperation, FalsOperation, ExpOperation, OrOperation, TruOperation> {
  @Override
  public default AndOperation and(final And it) {
    return new printexp.revisitor.operations.impl.AndOperationImpl(it, this);
  }
  
  @Override
  public default FalsOperation fals(final Fals it) {
    return new printexp.revisitor.operations.impl.FalsOperationImpl(it, this);
  }
  
  @Override
  public default OrOperation or(final Or it) {
    return new printexp.revisitor.operations.impl.OrOperationImpl(it, this);
  }
  
  @Override
  public default TruOperation tru(final Tru it) {
    return new printexp.revisitor.operations.impl.TruOperationImpl(it, this);
  }
}
