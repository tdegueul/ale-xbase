package evalfsm.revisitor.operations.evalfsm.impl;

import evalfsm.revisitor.operations.evalfsm.FinalStateOperation;
import evalfsm.revisitor.operations.evalfsm.InitialStateOperation;
import evalfsm.revisitor.operations.evalfsm.MachineOperation;
import evalfsm.revisitor.operations.evalfsm.StateOperation;
import evalfsm.revisitor.operations.evalfsm.TransitionOperation;
import fsm.Transition;
import fsm.dyn.Context;
import fsm.revisitor.FsmRevisitor;

@SuppressWarnings("all")
public class TransitionOperationImpl implements TransitionOperation {
  private Transition obj;
  
  private FsmRevisitor<? extends FinalStateOperation, ? extends InitialStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TransitionOperation> alg;
  
  public TransitionOperationImpl(final Transition obj, final FsmRevisitor<? extends FinalStateOperation, ? extends InitialStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TransitionOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void fire(final Context ctx) {
    ctx.setCurrent(this.obj.getTarget());
  }
}
