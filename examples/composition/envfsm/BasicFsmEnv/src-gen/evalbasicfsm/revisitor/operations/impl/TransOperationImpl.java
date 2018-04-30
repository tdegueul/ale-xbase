package evalbasicfsm.revisitor.operations.impl;

import basicFsmEnv.Trans;
import basicFsmEnv.revisitor.BasicFsmEnvRevisitor;
import basicFsmEnv.runtime.Context;
import evalbasicfsm.revisitor.operations.ActionOperation;
import evalbasicfsm.revisitor.operations.GuardOperation;
import evalbasicfsm.revisitor.operations.InitialStateOperation;
import evalbasicfsm.revisitor.operations.MachineOperation;
import evalbasicfsm.revisitor.operations.StateOperation;
import evalbasicfsm.revisitor.operations.TransOperation;
import evalbasicfsm.revisitor.operations.VarDeclOperation;

@SuppressWarnings("all")
public class TransOperationImpl implements TransOperation {
  private Trans obj;
  
  private BasicFsmEnvRevisitor<ActionOperation, GuardOperation, InitialStateOperation, MachineOperation, StateOperation, TransOperation, VarDeclOperation> alg;
  
  public TransOperationImpl(final Trans obj, final BasicFsmEnvRevisitor<ActionOperation, GuardOperation, InitialStateOperation, MachineOperation, StateOperation, TransOperation, VarDeclOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void fire(final Context ctx) {
    boolean _eval = this.alg.$(this.obj.getGuard()).eval(ctx);
    boolean _not = (!_eval);
    if (_not) {
      throw new RuntimeException(("Unsatisfied guard for " + this.alg));
    }
    this.alg.$(this.obj.getAction()).run(ctx);
    ctx.setCurrent(this.obj.getTgt());
  }
}
