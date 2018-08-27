package evalboolexp.revisitor.operations.evalboolexp.impl;

import boolExpEnv.Lit;
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
public abstract class LitOperationImpl implements LitOperation {
  private Lit obj;
  
  private BoolExpEnvRevisitor<? extends AndOperation, ? extends BinExpOperation, ? extends ExpOperation, ? extends FalsOperation, ? extends LitOperation, ? extends NotOperation, ? extends OrOperation, ? extends TruOperation, ? extends VarRefOperation> alg;
  
  public LitOperationImpl(final Lit obj, final BoolExpEnvRevisitor<? extends AndOperation, ? extends BinExpOperation, ? extends ExpOperation, ? extends FalsOperation, ? extends LitOperation, ? extends NotOperation, ? extends OrOperation, ? extends TruOperation, ? extends VarRefOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
}
