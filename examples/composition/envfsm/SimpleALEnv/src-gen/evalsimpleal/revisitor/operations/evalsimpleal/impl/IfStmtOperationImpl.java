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
import simpleALEnv.Assign;
import simpleALEnv.IfStmt;
import simpleALEnv.revisitor.SimpleALEnvRevisitor;
import simpleALEnv.runtime.Env;

@SuppressWarnings("all")
public class IfStmtOperationImpl implements IfStmtOperation {
  private IfStmt obj;
  
  private SimpleALEnvRevisitor<? extends ALVarRefOperation, ? extends ArithOperation, ? extends ArithLitOperation, ? extends ArithMinusOperation, ? extends ArithOpOperation, ? extends ArithPlusOperation, ? extends AssignOperation, ? extends BlockOperation, ? extends EqualityTestOperation, ? extends IfStmtOperation, ? extends PrintOperation, ? extends RandRangeOperation, ? extends StmtOperation> alg;
  
  public IfStmtOperationImpl(final IfStmt obj, final SimpleALEnvRevisitor<? extends ALVarRefOperation, ? extends ArithOperation, ? extends ArithLitOperation, ? extends ArithMinusOperation, ? extends ArithOpOperation, ? extends ArithPlusOperation, ? extends AssignOperation, ? extends BlockOperation, ? extends EqualityTestOperation, ? extends IfStmtOperation, ? extends PrintOperation, ? extends RandRangeOperation, ? extends StmtOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void eval(final Env env) {
    boolean _test = this.alg.$(this.obj.getTest()).test(env);
    if (_test) {
      this.alg.$(this.obj.getIfBranch()).eval(env);
    } else {
      Assign _elseBranch = this.obj.getElseBranch();
      boolean _tripleNotEquals = (_elseBranch != null);
      if (_tripleNotEquals) {
        this.alg.$(this.obj.getElseBranch()).eval(env);
      }
    }
  }
}
