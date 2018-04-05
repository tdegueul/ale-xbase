package evalboolexp.revisitor;

import boolExpEnv.And;
import boolExpEnv.Fals;
import boolExpEnv.Not;
import boolExpEnv.Or;
import boolExpEnv.Tru;
import boolExpEnv.VarRef;
import boolExpEnv.revisitor.BoolExpEnvRevisitor;
import evalboolexp.revisitor.operations.AndOperation;
import evalboolexp.revisitor.operations.ExpOperation;
import evalboolexp.revisitor.operations.FalsOperation;
import evalboolexp.revisitor.operations.NotOperation;
import evalboolexp.revisitor.operations.OrOperation;
import evalboolexp.revisitor.operations.TruOperation;
import evalboolexp.revisitor.operations.VarRefOperation;

@SuppressWarnings("all")
public interface EvalboolexpRevisitor extends BoolExpEnvRevisitor<AndOperation, ExpOperation, ExpOperation, FalsOperation, ExpOperation, NotOperation, OrOperation, TruOperation, VarRefOperation> {
  @Override
  public default AndOperation and(final And it) {
    return new evalboolexp.revisitor.operations.impl.AndOperationImpl(it, this);
  }
  
  @Override
  public default FalsOperation fals(final Fals it) {
    return new evalboolexp.revisitor.operations.impl.FalsOperationImpl(it, this);
  }
  
  @Override
  public default NotOperation not(final Not it) {
    return new evalboolexp.revisitor.operations.impl.NotOperationImpl(it, this);
  }
  
  @Override
  public default OrOperation or(final Or it) {
    return new evalboolexp.revisitor.operations.impl.OrOperationImpl(it, this);
  }
  
  @Override
  public default TruOperation tru(final Tru it) {
    return new evalboolexp.revisitor.operations.impl.TruOperationImpl(it, this);
  }
  
  @Override
  public default VarRefOperation varRef(final VarRef it) {
    return new evalboolexp.revisitor.operations.impl.VarRefOperationImpl(it, this);
  }
}
