package evalfsm.revisitor;

import evalfsm.revisitor.operations.MachineOperation;
import evalfsm.revisitor.operations.StateOperation;
import evalfsm.revisitor.operations.TransitionOperation;
import fsm.FinalState;
import fsm.InitialState;
import fsm.Machine;
import fsm.State;
import fsm.Transition;
import fsm.revisitor.FsmRevisitor;

@SuppressWarnings("all")
public interface EvalfsmRevisitor extends FsmRevisitor<StateOperation, StateOperation, MachineOperation, StateOperation, TransitionOperation> {
  @Override
  public default StateOperation finalState(final FinalState it) {
    return new evalfsm.revisitor.operations.impl.StateOperationImpl(it, this);
  }
  
  @Override
  public default StateOperation initialState(final InitialState it) {
    return new evalfsm.revisitor.operations.impl.StateOperationImpl(it, this);
  }
  
  @Override
  public default MachineOperation machine(final Machine it) {
    return new evalfsm.revisitor.operations.impl.MachineOperationImpl(it, this);
  }
  
  @Override
  public default StateOperation state(final State it) {
    return new evalfsm.revisitor.operations.impl.StateOperationImpl(it, this);
  }
  
  @Override
  public default TransitionOperation transition(final Transition it) {
    return new evalfsm.revisitor.operations.impl.TransitionOperationImpl(it, this);
  }
}
