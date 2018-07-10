package evalsimpleal.revisitor.operations.evalsimpleal.impl;

import evalsimpleal.revisitor.operations.evalsimpleal.ALVarRefOperation;
import evalsimpleal.revisitor.operations.evalsimpleal.ArithLitOperation;
import evalsimpleal.revisitor.operations.evalsimpleal.ArithMinusOperation;
import evalsimpleal.revisitor.operations.evalsimpleal.ArithOpOperation;
import evalsimpleal.revisitor.operations.evalsimpleal.ArithOperation;
import evalsimpleal.revisitor.operations.evalsimpleal.ArithPlusOperation;
import evalsimpleal.revisitor.operations.evalsimpleal.AssignOperation;
import evalsimpleal.revisitor.operations.evalsimpleal.BlockOperation;
import evalsimpleal.revisitor.operations.evalsimpleal.EqualityTestOperation;
import evalsimpleal.revisitor.operations.evalsimpleal.IfStmtOperation;
import evalsimpleal.revisitor.operations.evalsimpleal.PrintOperation;
import evalsimpleal.revisitor.operations.evalsimpleal.RandRangeOperation;
import evalsimpleal.revisitor.operations.evalsimpleal.StmtOperation;
import java.util.function.Consumer;
import simpleALEnv.Block;
import simpleALEnv.Stmt;
import simpleALEnv.revisitor.SimpleALEnvRevisitor;
import simpleALEnv.runtime.Env;

@SuppressWarnings("all")
public class BlockOperationImpl implements BlockOperation {
  private Block obj;
  
  private SimpleALEnvRevisitor<? extends ALVarRefOperation, ? extends ArithOperation, ? extends ArithLitOperation, ? extends ArithMinusOperation, ? extends ArithOpOperation, ? extends ArithPlusOperation, ? extends AssignOperation, ? extends BlockOperation, ? extends EqualityTestOperation, ? extends IfStmtOperation, ? extends PrintOperation, ? extends RandRangeOperation, ? extends StmtOperation> alg;
  
  public BlockOperationImpl(final Block obj, final SimpleALEnvRevisitor<? extends ALVarRefOperation, ? extends ArithOperation, ? extends ArithLitOperation, ? extends ArithMinusOperation, ? extends ArithOpOperation, ? extends ArithPlusOperation, ? extends AssignOperation, ? extends BlockOperation, ? extends EqualityTestOperation, ? extends IfStmtOperation, ? extends PrintOperation, ? extends RandRangeOperation, ? extends StmtOperation> alg) {
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
