package evalsimpleal.revisitor.operations.impl;

import evalsimpleal.revisitor.operations.ALVarRefOperation;
import evalsimpleal.revisitor.operations.ArithLitOperation;
import evalsimpleal.revisitor.operations.ArithMinusOperation;
import evalsimpleal.revisitor.operations.ArithOpOperation;
import evalsimpleal.revisitor.operations.ArithOperation;
import evalsimpleal.revisitor.operations.ArithPlusOperation;
import evalsimpleal.revisitor.operations.AssignOperation;
import evalsimpleal.revisitor.operations.BlockOperation;
import evalsimpleal.revisitor.operations.PrintOperation;
import evalsimpleal.revisitor.operations.StmtOperation;
import simpleALEnv.Arith;
import simpleALEnv.revisitor.SimpleALEnvRevisitor;

@SuppressWarnings("all")
public abstract class ArithOperationImpl implements ArithOperation {
  private Arith obj;
  
  private SimpleALEnvRevisitor<ALVarRefOperation, ArithOperation, ArithLitOperation, ArithMinusOperation, ArithOpOperation, ArithPlusOperation, AssignOperation, BlockOperation, PrintOperation, StmtOperation> alg;
  
  public ArithOperationImpl(final Arith obj, final SimpleALEnvRevisitor<ALVarRefOperation, ArithOperation, ArithLitOperation, ArithMinusOperation, ArithOpOperation, ArithPlusOperation, AssignOperation, BlockOperation, PrintOperation, StmtOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
}
