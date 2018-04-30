package evalboolexp.revisitor.operations.impl;

import boolExpEnv.Tru;
import boolExpEnv.revisitor.BoolExpEnvRevisitor;
import boolExpEnv.runtime.Env;
import evalboolexp.revisitor.operations.AndOperation;
import evalboolexp.revisitor.operations.BinExpOperation;
import evalboolexp.revisitor.operations.ExpOperation;
import evalboolexp.revisitor.operations.FalsOperation;
import evalboolexp.revisitor.operations.LitOperation;
import evalboolexp.revisitor.operations.NotOperation;
import evalboolexp.revisitor.operations.OrOperation;
import evalboolexp.revisitor.operations.TruOperation;
import evalboolexp.revisitor.operations.VarRefOperation;
import evalboolexp.revisitor.operations.impl.LitOperationImpl;

@SuppressWarnings("all")
public class TruOperationImpl extends LitOperationImpl implements TruOperation {
  private Tru obj;
  
  private BoolExpEnvRevisitor<AndOperation, BinExpOperation, ExpOperation, FalsOperation, LitOperation, NotOperation, OrOperation, TruOperation, VarRefOperation> alg;
  
  public TruOperationImpl(final Tru obj, final BoolExpEnvRevisitor<AndOperation, BinExpOperation, ExpOperation, FalsOperation, LitOperation, NotOperation, OrOperation, TruOperation, VarRefOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public boolean eval(final Env env) {
    return true;
  }
}
