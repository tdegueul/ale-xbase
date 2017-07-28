package evalfsm.revisitor.operations.impl;

import evalfsm.revisitor.operations.MachineOperation;
import evalfsm.revisitor.operations.StateOperation;
import evalfsm.revisitor.operations.TransitionOperation;
import fsm.Transition;
import fsm.dyn.Context;
import fsm.revisitor.FsmRevisitor;

@SuppressWarnings("all")
public class TransitionOperationImpl implements TransitionOperation {
  private Transition obj;
  
  private FsmRevisitor<StateOperation, StateOperation, MachineOperation, StateOperation, TransitionOperation> alg;
  
  public TransitionOperationImpl(final Transition obj, final FsmRevisitor<StateOperation, StateOperation, MachineOperation, StateOperation, TransitionOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void fire(final Context ctx) {
    ctx.setCurrent(this.obj.getTarget());
  }
}
