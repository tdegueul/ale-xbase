package gfsmprint.revisitor;

import gfsm.FinalState;
import gfsm.InitialState;
import gfsm.Machine;
import gfsm.State;
import gfsm.Transition;
import gfsm.revisitor.GfsmRevisitor;
import gfsmprint.revisitor.operations.GuardOperation;
import gfsmprint.revisitor.operations.InitialStateOperation;
import gfsmprint.revisitor.operations.MachineOperation;
import gfsmprint.revisitor.operations.StateOperation;
import gfsmprint.revisitor.operations.TransitionOperation;

@SuppressWarnings("all")
public interface GfsmprintRevisitor extends GfsmRevisitor<StateOperation, GuardOperation, InitialStateOperation, MachineOperation, StateOperation, TransitionOperation> {
  @Override
  public default StateOperation finalState(final FinalState it) {
    return new gfsmprint.revisitor.operations.impl.StateOperationImpl(it, this);
  }
  
  @Override
  public default InitialStateOperation initialState(final InitialState it) {
    return new gfsmprint.revisitor.operations.impl.InitialStateOperationImpl(it, this);
  }
  
  @Override
  public default MachineOperation machine(final Machine it) {
    return new gfsmprint.revisitor.operations.impl.MachineOperationImpl(it, this);
  }
  
  @Override
  public default StateOperation state(final State it) {
    return new gfsmprint.revisitor.operations.impl.StateOperationImpl(it, this);
  }
  
  @Override
  public default TransitionOperation transition(final Transition it) {
    return new gfsmprint.revisitor.operations.impl.TransitionOperationImpl(it, this);
  }
}
