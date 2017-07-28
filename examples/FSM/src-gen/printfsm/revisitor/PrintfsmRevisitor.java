package printfsm.revisitor;

import fsm.FinalState;
import fsm.InitialState;
import fsm.Machine;
import fsm.State;
import fsm.Transition;
import fsm.revisitor.FsmRevisitor;
import printfsm.revisitor.operations.MachineOperation;
import printfsm.revisitor.operations.StateOperation;
import printfsm.revisitor.operations.TransitionOperation;

@SuppressWarnings("all")
public interface PrintfsmRevisitor extends FsmRevisitor<StateOperation, StateOperation, MachineOperation, StateOperation, TransitionOperation> {
  @Override
  public default StateOperation finalState(final FinalState it) {
    return new printfsm.revisitor.operations.impl.StateOperationImpl(it, this);
  }
  
  @Override
  public default StateOperation initialState(final InitialState it) {
    return new printfsm.revisitor.operations.impl.StateOperationImpl(it, this);
  }
  
  @Override
  public default MachineOperation machine(final Machine it) {
    return new printfsm.revisitor.operations.impl.MachineOperationImpl(it, this);
  }
  
  @Override
  public default StateOperation state(final State it) {
    return new printfsm.revisitor.operations.impl.StateOperationImpl(it, this);
  }
  
  @Override
  public default TransitionOperation transition(final Transition it) {
    return new printfsm.revisitor.operations.impl.TransitionOperationImpl(it, this);
  }
}
