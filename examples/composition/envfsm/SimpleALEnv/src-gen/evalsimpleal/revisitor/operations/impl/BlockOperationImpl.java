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
import java.util.function.Consumer;
import simpleALEnv.Block;
import simpleALEnv.Stmt;
import simpleALEnv.revisitor.SimpleALEnvRevisitor;
import simpleALEnv.runtime.Env;

@SuppressWarnings("all")
public class BlockOperationImpl implements BlockOperation {
  private Block obj;
  
  private SimpleALEnvRevisitor<ALVarRefOperation, ArithOperation, ArithLitOperation, ArithMinusOperation, ArithOperation, ArithPlusOperation, AssignOperation, BlockOperation, PrintOperation, StmtOperation> alg;
  
  public BlockOperationImpl(final Block obj, final SimpleALEnvRevisitor<ALVarRefOperation, ArithOperation, ArithLitOperation, ArithMinusOperation, ArithOperation, ArithPlusOperation, AssignOperation, BlockOperation, PrintOperation, StmtOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void eval(final Env env) {
    final Consumer<Stmt> _function = (Stmt it) -> {
      this.alg.$(it).eval(env);
    };
    this.obj.getStmts().forEach(_function);
  }
}
