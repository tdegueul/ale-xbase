package evalsimpleal.revisitor.operations.impl;

import evalsimpleal.revisitor.operations.ALVarRefOperation;
import evalsimpleal.revisitor.operations.ArithLitOperation;
import evalsimpleal.revisitor.operations.ArithMinusOperation;
import evalsimpleal.revisitor.operations.ArithOperation;
import evalsimpleal.revisitor.operations.ArithPlusOperation;
import evalsimpleal.revisitor.operations.AssignOperation;
import evalsimpleal.revisitor.operations.BlockOperation;
import evalsimpleal.revisitor.operations.PrintOperation;
import evalsimpleal.revisitor.operations.StmtOperation;
import evalsimpleal.revisitor.operations.impl.ArithOperationImpl;
import simpleALEnv.ArithPlus;
import simpleALEnv.revisitor.SimpleALEnvRevisitor;
import simpleALEnv.runtime.Env;

@SuppressWarnings("all")
public class ArithPlusOperationImpl extends ArithOperationImpl implements ArithPlusOperation {
  private ArithPlus obj;
  
  private SimpleALEnvRevisitor<ALVarRefOperation, ArithOperation, ArithLitOperation, ArithMinusOperation, ArithOperation, ArithPlusOperation, AssignOperation, BlockOperation, PrintOperation, StmtOperation> alg;
  
  public ArithPlusOperationImpl(final ArithPlus obj, final SimpleALEnvRevisitor<ALVarRefOperation, ArithOperation, ArithLitOperation, ArithMinusOperation, ArithOperation, ArithPlusOperation, AssignOperation, BlockOperation, PrintOperation, StmtOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public int eval(final Env env) {
    int _eval = this.alg.$(this.obj.getLhs()).eval(env);
    int _eval_1 = this.alg.$(this.obj.getRhs()).eval(env);
    return (_eval + _eval_1);
  }
}
