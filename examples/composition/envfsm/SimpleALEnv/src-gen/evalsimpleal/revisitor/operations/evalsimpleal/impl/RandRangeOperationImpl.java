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
import simpleALEnv.RandRange;
import simpleALEnv.revisitor.SimpleALEnvRevisitor;
import simpleALEnv.runtime.Env;

@SuppressWarnings("all")
public class RandRangeOperationImpl implements RandRangeOperation {
  private RandRange obj;
  
  private SimpleALEnvRevisitor<? extends ALVarRefOperation, ? extends ArithOperation, ? extends ArithLitOperation, ? extends ArithMinusOperation, ? extends ArithOpOperation, ? extends ArithPlusOperation, ? extends AssignOperation, ? extends BlockOperation, ? extends EqualityTestOperation, ? extends IfStmtOperation, ? extends PrintOperation, ? extends RandRangeOperation, ? extends StmtOperation> alg;
  
  public RandRangeOperationImpl(final RandRange obj, final SimpleALEnvRevisitor<? extends ALVarRefOperation, ? extends ArithOperation, ? extends ArithLitOperation, ? extends ArithMinusOperation, ? extends ArithOpOperation, ? extends ArithPlusOperation, ? extends AssignOperation, ? extends BlockOperation, ? extends EqualityTestOperation, ? extends IfStmtOperation, ? extends PrintOperation, ? extends RandRangeOperation, ? extends StmtOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public int eval(final Env env) {
    int _min = this.obj.getMin();
    double _random = Math.random();
    int _max = this.obj.getMax();
    int _min_1 = this.obj.getMin();
    int _minus = (_max - _min_1);
    double _multiply = (_random * _minus);
    int _intValue = Long.valueOf(Math.round(_multiply)).intValue();
    return (_min + _intValue);
  }
}
