package printfsm.revisitor.operations.impl;

import fsm.Transition;
import fsm.revisitor.FsmRevisitor;
import printfsm.revisitor.operations.InitialStateOperation;
import printfsm.revisitor.operations.MachineOperation;
import printfsm.revisitor.operations.StateOperation;
import printfsm.revisitor.operations.TransitionOperation;

@SuppressWarnings("all")
public class TransitionOperationImpl implements TransitionOperation {
  private Transition obj;
  
  private FsmRevisitor<StateOperation, InitialStateOperation, MachineOperation, StateOperation, TransitionOperation> alg;
  
  public TransitionOperationImpl(final Transition obj, final FsmRevisitor<StateOperation, InitialStateOperation, MachineOperation, StateOperation, TransitionOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public String print() {
    String _event = this.obj.getEvent();
    String _plus = ("    " + _event);
    String _plus_1 = (_plus + " -> ");
    String _name = this.obj.getTarget().getName();
    return (_plus_1 + _name);
  }
}
