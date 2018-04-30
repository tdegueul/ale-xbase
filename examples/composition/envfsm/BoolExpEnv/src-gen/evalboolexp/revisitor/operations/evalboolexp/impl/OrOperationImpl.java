package evalboolexp.revisitor.operations.evalboolexp.impl;

import boolExpEnv.Or;
import boolExpEnv.revisitor.BoolExpEnvRevisitor;
import boolExpEnv.runtime.Env;
import evalboolexp.revisitor.operations.evalboolexp.AndOperation;
import evalboolexp.revisitor.operations.evalboolexp.BinExpOperation;
import evalboolexp.revisitor.operations.evalboolexp.ExpOperation;
import evalboolexp.revisitor.operations.evalboolexp.FalsOperation;
import evalboolexp.revisitor.operations.evalboolexp.LitOperation;
import evalboolexp.revisitor.operations.evalboolexp.NotOperation;
import evalboolexp.revisitor.operations.evalboolexp.OrOperation;
import evalboolexp.revisitor.operations.evalboolexp.TruOperation;
import evalboolexp.revisitor.operations.evalboolexp.VarRefOperation;
import evalboolexp.revisitor.operations.evalboolexp.impl.BinExpOperationImpl;

@SuppressWarnings("all")
public class OrOperationImpl extends BinExpOperationImpl implements OrOperation {
  private Or obj;
  
  private BoolExpEnvRevisitor<AndOperation, BinExpOperation, ExpOperation, FalsOperation, LitOperation, NotOperation, OrOperation, TruOperation, VarRefOperation> alg;
  
  public OrOperationImpl(final Or obj, final BoolExpEnvRevisitor<AndOperation, BinExpOperation, ExpOperation, FalsOperation, LitOperation, NotOperation, OrOperation, TruOperation, VarRefOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public boolean eval(final Env env) {
    return (this.alg.$(this.obj.getLhs()).eval(env) || this.alg.$(this.obj.getRhs()).eval(env));
  }
}
