package evalexp.revisitor;

import boolexp.And;
import boolexp.Fals;
import boolexp.Or;
import boolexp.Tru;
import boolexp.revisitor.BoolexpRevisitor;
import evalexp.revisitor.operations.AndOperation;
import evalexp.revisitor.operations.ExpOperation;
import evalexp.revisitor.operations.FalsOperation;
import evalexp.revisitor.operations.OrOperation;
import evalexp.revisitor.operations.TruOperation;

@SuppressWarnings("all")
public interface EvalexpRevisitor extends BoolexpRevisitor<AndOperation, ExpOperation, ExpOperation, FalsOperation, ExpOperation, OrOperation, TruOperation> {
  @Override
  public default AndOperation and(final And it) {
    return new evalexp.revisitor.operations.impl.AndOperationImpl(it, this);
  }
  
  @Override
  public default FalsOperation fals(final Fals it) {
    return new evalexp.revisitor.operations.impl.FalsOperationImpl(it, this);
  }
  
  @Override
  public default OrOperation or(final Or it) {
    return new evalexp.revisitor.operations.impl.OrOperationImpl(it, this);
  }
  
  @Override
  public default TruOperation tru(final Tru it) {
    return new evalexp.revisitor.operations.impl.TruOperationImpl(it, this);
  }
}
