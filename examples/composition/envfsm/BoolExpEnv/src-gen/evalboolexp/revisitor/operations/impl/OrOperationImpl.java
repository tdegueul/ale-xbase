package evalboolexp.revisitor.operations.impl;

import boolExpEnv.Or;
import boolExpEnv.revisitor.BoolExpEnvRevisitor;
import boolExpEnv.runtime.Env;
import evalboolexp.revisitor.operations.AndOperation;
import evalboolexp.revisitor.operations.ExpOperation;
import evalboolexp.revisitor.operations.FalsOperation;
import evalboolexp.revisitor.operations.NotOperation;
import evalboolexp.revisitor.operations.OrOperation;
import evalboolexp.revisitor.operations.TruOperation;
import evalboolexp.revisitor.operations.VarRefOperation;
import evalboolexp.revisitor.operations.impl.ExpOperationImpl;

@SuppressWarnings("all")
public class OrOperationImpl extends ExpOperationImpl implements OrOperation {
  private Or obj;
  
  private BoolExpEnvRevisitor<AndOperation, ExpOperation, ExpOperation, FalsOperation, ExpOperation, NotOperation, OrOperation, TruOperation, VarRefOperation> alg;
  
  public OrOperationImpl(final Or obj, final BoolExpEnvRevisitor<AndOperation, ExpOperation, ExpOperation, FalsOperation, ExpOperation, NotOperation, OrOperation, TruOperation, VarRefOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public boolean eval(final Env env) {
    return (this.alg.$(this.obj.getLhs()).eval(env) || this.alg.$(this.obj.getRhs()).eval(env));
  }
}
