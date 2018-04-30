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
import evalboolexp.revisitor.operations.evalboolexp.impl.ExpOperationImpl;

@SuppressWarnings("all")
public abstract class LitOperationImpl extends ExpOperationImpl implements LitOperation {
  private Lit obj;
  
  private BoolExpEnvRevisitor<AndOperation, BinExpOperation, ExpOperation, FalsOperation, LitOperation, NotOperation, OrOperation, TruOperation, VarRefOperation> alg;
  
  public LitOperationImpl(final Lit obj, final BoolExpEnvRevisitor<AndOperation, BinExpOperation, ExpOperation, FalsOperation, LitOperation, NotOperation, OrOperation, TruOperation, VarRefOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
}
