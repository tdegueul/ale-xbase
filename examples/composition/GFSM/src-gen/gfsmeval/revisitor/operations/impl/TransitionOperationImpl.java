package gfsmeval.revisitor.operations.impl;

import gfsm.Transition;
import gfsm.dyn.Context;
import gfsm.revisitor.GfsmRevisitor;
import gfsmeval.revisitor.operations.GuardOperation;
import gfsmeval.revisitor.operations.MachineOperation;
import gfsmeval.revisitor.operations.StateOperation;
import gfsmeval.revisitor.operations.TransitionOperation;

@SuppressWarnings("all")
public class TransitionOperationImpl implements TransitionOperation {
  private Transition obj;
  
  private GfsmRevisitor<StateOperation, GuardOperation, StateOperation, MachineOperation, StateOperation, TransitionOperation> alg;
  
  public TransitionOperationImpl(final Transition obj, final GfsmRevisitor<StateOperation, GuardOperation, StateOperation, MachineOperation, StateOperation, TransitionOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void fire(final Context ctx) {
    ctx.setCurrent(this.obj.getTarget());
  }
}
