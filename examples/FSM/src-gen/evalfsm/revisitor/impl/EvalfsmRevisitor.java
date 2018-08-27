package evalfsm.revisitor.impl;

import evalfsm.revisitor.operations.evalfsm.FinalStateOperation;
import evalfsm.revisitor.operations.evalfsm.InitialStateOperation;
import evalfsm.revisitor.operations.evalfsm.MachineOperation;
import evalfsm.revisitor.operations.evalfsm.StateOperation;
import evalfsm.revisitor.operations.evalfsm.TransitionOperation;
import fsm.FinalState;
import fsm.InitialState;
import fsm.Machine;
import fsm.State;
import fsm.Transition;
import fsm.revisitor.FsmRevisitor;

@SuppressWarnings("all")
public interface EvalfsmRevisitor extends FsmRevisitor<FinalStateOperation, InitialStateOperation, MachineOperation, StateOperation, TransitionOperation> {
  @Override
  public default FinalStateOperation fsm__FinalState(final FinalState it) {
    return new evalfsm.revisitor.operations.evalfsm.impl.FinalStateOperationImpl(it, this);
  }
  
  @Override
  public default InitialStateOperation fsm__InitialState(final InitialState it) {
    return new evalfsm.revisitor.operations.evalfsm.impl.InitialStateOperationImpl(it, this);
  }
  
  @Override
  public default MachineOperation fsm__Machine(final Machine it) {
    return new evalfsm.revisitor.operations.evalfsm.impl.MachineOperationImpl(it, this);
  }
  
  @Override
  public default StateOperation fsm__State(final State it) {
    return new evalfsm.revisitor.operations.evalfsm.impl.StateOperationImpl(it, this);
  }
  
  @Override
  public default TransitionOperation fsm__Transition(final Transition it) {
    return new evalfsm.revisitor.operations.evalfsm.impl.TransitionOperationImpl(it, this);
  }
}
