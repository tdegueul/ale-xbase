package printfsm.revisitor.impl;

import fsm.FinalState;
import fsm.InitialState;
import fsm.Machine;
import fsm.State;
import fsm.Transition;
import fsm.revisitor.FsmRevisitor;
import printfsm.revisitor.operations.printfsm.FinalStateOperation;
import printfsm.revisitor.operations.printfsm.InitialStateOperation;
import printfsm.revisitor.operations.printfsm.MachineOperation;
import printfsm.revisitor.operations.printfsm.StateOperation;
import printfsm.revisitor.operations.printfsm.TransitionOperation;

@SuppressWarnings("all")
public interface PrintfsmRevisitor extends FsmRevisitor<FinalStateOperation, InitialStateOperation, MachineOperation, StateOperation, TransitionOperation> {
  @Override
  public default FinalStateOperation fsm__FinalState(final FinalState it) {
    return new printfsm.revisitor.operations.printfsm.impl.FinalStateOperationImpl(it, this);
  }
  
  @Override
  public default InitialStateOperation fsm__InitialState(final InitialState it) {
    return new printfsm.revisitor.operations.printfsm.impl.InitialStateOperationImpl(it, this);
  }
  
  @Override
  public default MachineOperation fsm__Machine(final Machine it) {
    return new printfsm.revisitor.operations.printfsm.impl.MachineOperationImpl(it, this);
  }
  
  @Override
  public default StateOperation fsm__State(final State it) {
    return new printfsm.revisitor.operations.printfsm.impl.StateOperationImpl(it, this);
  }
  
  @Override
  public default TransitionOperation fsm__Transition(final Transition it) {
    return new printfsm.revisitor.operations.printfsm.impl.TransitionOperationImpl(it, this);
  }
}
