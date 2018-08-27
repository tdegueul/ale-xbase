package printfsm.revisitor.operations.printfsm.impl;

import fsm.Transition;
import fsm.revisitor.FsmRevisitor;
import printfsm.revisitor.operations.printfsm.FinalStateOperation;
import printfsm.revisitor.operations.printfsm.InitialStateOperation;
import printfsm.revisitor.operations.printfsm.MachineOperation;
import printfsm.revisitor.operations.printfsm.StateOperation;
import printfsm.revisitor.operations.printfsm.TransitionOperation;

@SuppressWarnings("all")
public class TransitionOperationImpl implements TransitionOperation {
  private Transition obj;
  
  private FsmRevisitor<? extends FinalStateOperation, ? extends InitialStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TransitionOperation> alg;
  
  public TransitionOperationImpl(final Transition obj, final FsmRevisitor<? extends FinalStateOperation, ? extends InitialStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TransitionOperation> alg) {
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
