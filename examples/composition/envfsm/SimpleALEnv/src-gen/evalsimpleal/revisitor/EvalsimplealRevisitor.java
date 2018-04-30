package evalsimpleal.revisitor;

import evalsimpleal.revisitor.operations.evalsimpleal.ALVarRefOperation;
import evalsimpleal.revisitor.operations.evalsimpleal.ArithLitOperation;
import evalsimpleal.revisitor.operations.evalsimpleal.ArithMinusOperation;
import evalsimpleal.revisitor.operations.evalsimpleal.ArithOpOperation;
import evalsimpleal.revisitor.operations.evalsimpleal.ArithOperation;
import evalsimpleal.revisitor.operations.evalsimpleal.ArithPlusOperation;
import evalsimpleal.revisitor.operations.evalsimpleal.AssignOperation;
import evalsimpleal.revisitor.operations.evalsimpleal.BlockOperation;
import evalsimpleal.revisitor.operations.evalsimpleal.PrintOperation;
import evalsimpleal.revisitor.operations.evalsimpleal.StmtOperation;
import simpleALEnv.ALVarRef;
import simpleALEnv.ArithLit;
import simpleALEnv.ArithMinus;
import simpleALEnv.ArithPlus;
import simpleALEnv.Assign;
import simpleALEnv.Block;
import simpleALEnv.Print;
import simpleALEnv.revisitor.SimpleALEnvRevisitor;

@SuppressWarnings("all")
public interface EvalsimplealRevisitor extends SimpleALEnvRevisitor<ALVarRefOperation, ArithOperation, ArithLitOperation, ArithMinusOperation, ArithOpOperation, ArithPlusOperation, AssignOperation, BlockOperation, PrintOperation, StmtOperation> {
  @Override
  public default ALVarRefOperation simpleALEnv__ALVarRef(final ALVarRef it) {
    return new evalsimpleal.revisitor.operations.evalsimpleal.impl.ALVarRefOperationImpl(it, this);
  }
  
  @Override
  public default ArithLitOperation simpleALEnv__ArithLit(final ArithLit it) {
    return new evalsimpleal.revisitor.operations.evalsimpleal.impl.ArithLitOperationImpl(it, this);
  }
  
  @Override
  public default ArithMinusOperation simpleALEnv__ArithMinus(final ArithMinus it) {
    return new evalsimpleal.revisitor.operations.evalsimpleal.impl.ArithMinusOperationImpl(it, this);
  }
  
  @Override
  public default ArithPlusOperation simpleALEnv__ArithPlus(final ArithPlus it) {
    return new evalsimpleal.revisitor.operations.evalsimpleal.impl.ArithPlusOperationImpl(it, this);
  }
  
  @Override
  public default AssignOperation simpleALEnv__Assign(final Assign it) {
    return new evalsimpleal.revisitor.operations.evalsimpleal.impl.AssignOperationImpl(it, this);
  }
  
  @Override
  public default BlockOperation simpleALEnv__Block(final Block it) {
    return new evalsimpleal.revisitor.operations.evalsimpleal.impl.BlockOperationImpl(it, this);
  }
  
  @Override
  public default PrintOperation simpleALEnv__Print(final Print it) {
    return new evalsimpleal.revisitor.operations.evalsimpleal.impl.PrintOperationImpl(it, this);
  }
}
