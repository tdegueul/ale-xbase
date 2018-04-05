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
import evalsimpleal.revisitor.operations.impl.StmtOperationImpl;
import simpleALEnv.Assign;
import simpleALEnv.revisitor.SimpleALEnvRevisitor;
import simpleALEnv.runtime.Env;

@SuppressWarnings("all")
public class AssignOperationImpl extends StmtOperationImpl implements AssignOperation {
  private Assign obj;
  
  private SimpleALEnvRevisitor<ALVarRefOperation, ArithOperation, ArithLitOperation, ArithMinusOperation, ArithOperation, ArithPlusOperation, AssignOperation, BlockOperation, PrintOperation, StmtOperation> alg;
  
  public AssignOperationImpl(final Assign obj, final SimpleALEnvRevisitor<ALVarRefOperation, ArithOperation, ArithLitOperation, ArithMinusOperation, ArithOperation, ArithPlusOperation, AssignOperation, BlockOperation, PrintOperation, StmtOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void eval(final Env env) {
    env.bind(this.obj.getName(), Integer.valueOf(this.alg.$(this.obj.getVal()).eval(env)));
  }
}
