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
import simpleALEnv.ArithOp;
import simpleALEnv.revisitor.SimpleALEnvRevisitor;

@SuppressWarnings("all")
public abstract class ArithOpOperationImpl implements ArithOpOperation {
  private ArithOp obj;
  
  private SimpleALEnvRevisitor<? extends ALVarRefOperation, ? extends ArithOperation, ? extends ArithLitOperation, ? extends ArithMinusOperation, ? extends ArithOpOperation, ? extends ArithPlusOperation, ? extends AssignOperation, ? extends BlockOperation, ? extends EqualityTestOperation, ? extends IfStmtOperation, ? extends PrintOperation, ? extends RandRangeOperation, ? extends StmtOperation> alg;
  
  public ArithOpOperationImpl(final ArithOp obj, final SimpleALEnvRevisitor<? extends ALVarRefOperation, ? extends ArithOperation, ? extends ArithLitOperation, ? extends ArithMinusOperation, ? extends ArithOpOperation, ? extends ArithPlusOperation, ? extends AssignOperation, ? extends BlockOperation, ? extends EqualityTestOperation, ? extends IfStmtOperation, ? extends PrintOperation, ? extends RandRangeOperation, ? extends StmtOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
}
