package evalbasicfsm.revisitor.operations.evalbasicfsm.impl;

import basicFsmEnv.Action;
import basicFsmEnv.Trans;
import basicFsmEnv.revisitor.BasicFsmEnvRevisitor;
import basicFsmEnv.runtime.Context;
import evalbasicfsm.revisitor.operations.evalbasicfsm.ActionOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.GuardOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.InitialStateOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.MachineOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.StateOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.TransOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.VarDeclOperation;

@SuppressWarnings("all")
public class TransOperationImpl implements TransOperation {
  private Trans obj;
  
  private BasicFsmEnvRevisitor<? extends ActionOperation, ? extends GuardOperation, ? extends InitialStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TransOperation, ? extends VarDeclOperation> alg;
  
  public TransOperationImpl(final Trans obj, final BasicFsmEnvRevisitor<? extends ActionOperation, ? extends GuardOperation, ? extends InitialStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TransOperation, ? extends VarDeclOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void fire(final Context ctx) {
    if (((this.obj.getGuard() != null) && (!this.alg.$(this.obj.getGuard()).eval(ctx)))) {
      throw new RuntimeException(("Unsatisfied guard for " + this.alg));
    }
    Action _action = this.obj.getAction();
    boolean _tripleNotEquals = (_action != null);
    if (_tripleNotEquals) {
      this.alg.$(this.obj.getAction()).run(ctx);
    }
    ctx.setCurrent(this.obj.getTgt());
  }
}
