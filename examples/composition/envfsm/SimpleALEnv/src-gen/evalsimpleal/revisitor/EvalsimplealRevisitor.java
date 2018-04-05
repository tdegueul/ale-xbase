package evalsimpleal.revisitor;

import evalsimpleal.revisitor.operations.ALVarRefOperation;
import evalsimpleal.revisitor.operations.ArithLitOperation;
import evalsimpleal.revisitor.operations.ArithMinusOperation;
import evalsimpleal.revisitor.operations.ArithOperation;
import evalsimpleal.revisitor.operations.ArithPlusOperation;
import evalsimpleal.revisitor.operations.AssignOperation;
import evalsimpleal.revisitor.operations.BlockOperation;
import evalsimpleal.revisitor.operations.PrintOperation;
import evalsimpleal.revisitor.operations.StmtOperation;
import simpleALEnv.ALVarRef;
import simpleALEnv.ArithLit;
import simpleALEnv.ArithMinus;
import simpleALEnv.ArithPlus;
import simpleALEnv.Assign;
import simpleALEnv.Block;
import simpleALEnv.Print;
import simpleALEnv.revisitor.SimpleALEnvRevisitor;

@SuppressWarnings("all")
public interface EvalsimplealRevisitor extends SimpleALEnvRevisitor<ALVarRefOperation, ArithOperation, ArithLitOperation, ArithMinusOperation, ArithOperation, ArithPlusOperation, AssignOperation, BlockOperation, PrintOperation, StmtOperation> {
  @Override
  public default ALVarRefOperation aLVarRef(final ALVarRef it) {
    return new evalsimpleal.revisitor.operations.impl.ALVarRefOperationImpl(it, this);
  }
  
  @Override
  public default ArithLitOperation arithLit(final ArithLit it) {
    return new evalsimpleal.revisitor.operations.impl.ArithLitOperationImpl(it, this);
  }
  
  @Override
  public default ArithMinusOperation arithMinus(final ArithMinus it) {
    return new evalsimpleal.revisitor.operations.impl.ArithMinusOperationImpl(it, this);
  }
  
  @Override
  public default ArithPlusOperation arithPlus(final ArithPlus it) {
    return new evalsimpleal.revisitor.operations.impl.ArithPlusOperationImpl(it, this);
  }
  
  @Override
  public default AssignOperation assign(final Assign it) {
    return new evalsimpleal.revisitor.operations.impl.AssignOperationImpl(it, this);
  }
  
  @Override
  public default BlockOperation block(final Block it) {
    return new evalsimpleal.revisitor.operations.impl.BlockOperationImpl(it, this);
  }
  
  @Override
  public default PrintOperation print(final Print it) {
    return new evalsimpleal.revisitor.operations.impl.PrintOperationImpl(it, this);
  }
}
