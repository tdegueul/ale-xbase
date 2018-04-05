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
import simpleALEnv.ArithMinus;
import simpleALEnv.revisitor.SimpleALEnvRevisitor;
import simpleALEnv.runtime.Env;

@SuppressWarnings("all")
public class ArithMinusOperationImpl extends ArithOperationImpl implements ArithMinusOperation {
  private ArithMinus obj;
  
  private SimpleALEnvRevisitor<ALVarRefOperation, ArithOperation, ArithLitOperation, ArithMinusOperation, ArithOperation, ArithPlusOperation, AssignOperation, BlockOperation, PrintOperation, StmtOperation> alg;
  
  public ArithMinusOperationImpl(final ArithMinus obj, final SimpleALEnvRevisitor<ALVarRefOperation, ArithOperation, ArithLitOperation, ArithMinusOperation, ArithOperation, ArithPlusOperation, AssignOperation, BlockOperation, PrintOperation, StmtOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public int eval(final Env env) {
    int _eval = this.alg.$(this.obj.getLhs()).eval(env);
    int _eval_1 = this.alg.$(this.obj.getRhs()).eval(env);
    return (_eval - _eval_1);
  }
}
