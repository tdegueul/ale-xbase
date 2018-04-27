package evalexp.revisitor;

import boolexp.And;
import boolexp.Fals;
import boolexp.Or;
import boolexp.Tru;
import boolexp.revisitor.BoolexpRevisitor;
import evalexp.revisitor.operations.evalexp.AndOperation;
import evalexp.revisitor.operations.evalexp.BinaryExpOperation;
import evalexp.revisitor.operations.evalexp.ExpOperation;
import evalexp.revisitor.operations.evalexp.FalsOperation;
import evalexp.revisitor.operations.evalexp.LitOperation;
import evalexp.revisitor.operations.evalexp.OrOperation;
import evalexp.revisitor.operations.evalexp.TruOperation;

@SuppressWarnings("all")
public interface EvalexpRevisitor extends BoolexpRevisitor<AndOperation, BinaryExpOperation, ExpOperation, FalsOperation, LitOperation, OrOperation, TruOperation> {
  @Override
  public default AndOperation boolexp__And(final And it) {
    return new evalexp.revisitor.operations.evalexp.impl.AndOperationImpl(it, this);
  }
  
  @Override
  public default FalsOperation boolexp__Fals(final Fals it) {
    return new evalexp.revisitor.operations.evalexp.impl.FalsOperationImpl(it, this);
  }
  
  @Override
  public default OrOperation boolexp__Or(final Or it) {
    return new evalexp.revisitor.operations.evalexp.impl.OrOperationImpl(it, this);
  }
  
  @Override
  public default TruOperation boolexp__Tru(final Tru it) {
    return new evalexp.revisitor.operations.evalexp.impl.TruOperationImpl(it, this);
  }
}
