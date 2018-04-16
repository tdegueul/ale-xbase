package evalboolexp.revisitor.operations.impl;

import boolExpEnv.Exp;
import boolExpEnv.revisitor.BoolExpEnvRevisitor;
import evalboolexp.revisitor.operations.AndOperation;
import evalboolexp.revisitor.operations.ExpOperation;
import evalboolexp.revisitor.operations.FalsOperation;
import evalboolexp.revisitor.operations.NotOperation;
import evalboolexp.revisitor.operations.OrOperation;
import evalboolexp.revisitor.operations.TruOperation;
import evalboolexp.revisitor.operations.VarRefOperation;

@SuppressWarnings("all")
public abstract class ExpOperationImpl implements ExpOperation {
  private Exp obj;
  
  private BoolExpEnvRevisitor<AndOperation, ExpOperation, ExpOperation, FalsOperation, ExpOperation, NotOperation, OrOperation, TruOperation, VarRefOperation> alg;
  
  public ExpOperationImpl(final Exp obj, final BoolExpEnvRevisitor<AndOperation, ExpOperation, ExpOperation, FalsOperation, ExpOperation, NotOperation, OrOperation, TruOperation, VarRefOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
}
