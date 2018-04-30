package evalboolexp.revisitor.operations.impl;

import boolExpEnv.And;
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
import evalboolexp.revisitor.operations.impl.BinExpOperationImpl;

@SuppressWarnings("all")
public class AndOperationImpl extends BinExpOperationImpl implements AndOperation {
  private And obj;
  
  private BoolExpEnvRevisitor<AndOperation, BinExpOperation, ExpOperation, FalsOperation, LitOperation, NotOperation, OrOperation, TruOperation, VarRefOperation> alg;
  
  public AndOperationImpl(final And obj, final BoolExpEnvRevisitor<AndOperation, BinExpOperation, ExpOperation, FalsOperation, LitOperation, NotOperation, OrOperation, TruOperation, VarRefOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public boolean eval(final Env env) {
    return (this.alg.$(this.obj.getLhs()).eval(env) && this.alg.$(this.obj.getRhs()).eval(env));
  }
}
