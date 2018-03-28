package printfsm.revisitor.operations.impl;

import fsm.Transition;
import fsm.revisitor.FsmRevisitor;
import printfsm.revisitor.operations.MachineOperation;
import printfsm.revisitor.operations.StateOperation;
import printfsm.revisitor.operations.TransitionOperation;

@SuppressWarnings("all")
public class TransitionOperationImpl implements TransitionOperation {
  private Transition self;
  
  private FsmRevisitor<StateOperation, StateOperation, MachineOperation, StateOperation, TransitionOperation> alg;
  
  public TransitionOperationImpl(final Transition self, final FsmRevisitor<StateOperation, StateOperation, MachineOperation, StateOperation, TransitionOperation> alg) {
    this.self = self;
    this.alg = alg;
  }
  
  @Override
  public String print() {
    String _event = this.self.getEvent();
    String _plus = ("    " + _event);
    String _plus_1 = (_plus + " -> ");
    String _name = this.self.getTarget().getName();
    return (_plus_1 + _name);
  }
}
