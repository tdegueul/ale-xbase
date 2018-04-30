package evalboolexp.revisitor;

import boolExpEnv.And;
import boolExpEnv.Fals;
import boolExpEnv.Not;
import boolExpEnv.Or;
import boolExpEnv.Tru;
import boolExpEnv.VarRef;
import boolExpEnv.revisitor.BoolExpEnvRevisitor;
import evalboolexp.revisitor.operations.evalboolexp.AndOperation;
import evalboolexp.revisitor.operations.evalboolexp.BinExpOperation;
import evalboolexp.revisitor.operations.evalboolexp.ExpOperation;
import evalboolexp.revisitor.operations.evalboolexp.FalsOperation;
import evalboolexp.revisitor.operations.evalboolexp.LitOperation;
import evalboolexp.revisitor.operations.evalboolexp.NotOperation;
import evalboolexp.revisitor.operations.evalboolexp.OrOperation;
import evalboolexp.revisitor.operations.evalboolexp.TruOperation;
import evalboolexp.revisitor.operations.evalboolexp.VarRefOperation;

@SuppressWarnings("all")
public interface EvalboolexpRevisitor extends BoolExpEnvRevisitor<AndOperation, BinExpOperation, ExpOperation, FalsOperation, LitOperation, NotOperation, OrOperation, TruOperation, VarRefOperation> {
  @Override
  public default AndOperation boolExpEnv__And(final And it) {
    return new evalboolexp.revisitor.operations.evalboolexp.impl.AndOperationImpl(it, this);
  }
  
  @Override
  public default FalsOperation boolExpEnv__Fals(final Fals it) {
    return new evalboolexp.revisitor.operations.evalboolexp.impl.FalsOperationImpl(it, this);
  }
  
  @Override
  public default NotOperation boolExpEnv__Not(final Not it) {
    return new evalboolexp.revisitor.operations.evalboolexp.impl.NotOperationImpl(it, this);
  }
  
  @Override
  public default OrOperation boolExpEnv__Or(final Or it) {
    return new evalboolexp.revisitor.operations.evalboolexp.impl.OrOperationImpl(it, this);
  }
  
  @Override
  public default TruOperation boolExpEnv__Tru(final Tru it) {
    return new evalboolexp.revisitor.operations.evalboolexp.impl.TruOperationImpl(it, this);
  }
  
  @Override
  public default VarRefOperation boolExpEnv__VarRef(final VarRef it) {
    return new evalboolexp.revisitor.operations.evalboolexp.impl.VarRefOperationImpl(it, this);
  }
}
