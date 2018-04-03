package gfsmeval.revisitor;

import gfsm.FinalState;
import gfsm.InitialState;
import gfsm.Machine;
import gfsm.State;
import gfsm.Transition;
import gfsm.revisitor.GfsmRevisitor;
import gfsmeval.revisitor.operations.GuardOperation;
import gfsmeval.revisitor.operations.MachineOperation;
import gfsmeval.revisitor.operations.StateOperation;
import gfsmeval.revisitor.operations.TransitionOperation;

@SuppressWarnings("all")
public interface GfsmevalRevisitor extends GfsmRevisitor<StateOperation, GuardOperation, StateOperation, MachineOperation, StateOperation, TransitionOperation> {
  @Override
  public default StateOperation finalState(final FinalState it) {
    return new gfsmeval.revisitor.operations.impl.StateOperationImpl(it, this);
  }
  
  @Override
  public default StateOperation initialState(final InitialState it) {
    return new gfsmeval.revisitor.operations.impl.StateOperationImpl(it, this);
  }
  
  @Override
  public default MachineOperation machine(final Machine it) {
    return new gfsmeval.revisitor.operations.impl.MachineOperationImpl(it, this);
  }
  
  @Override
  public default StateOperation state(final State it) {
    return new gfsmeval.revisitor.operations.impl.StateOperationImpl(it, this);
  }
  
  @Override
  public default TransitionOperation transition(final Transition it) {
    return new gfsmeval.revisitor.operations.impl.TransitionOperationImpl(it, this);
  }
}
