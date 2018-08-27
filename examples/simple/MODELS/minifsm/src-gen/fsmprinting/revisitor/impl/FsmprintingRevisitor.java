package fsmprinting.revisitor.impl;

import fsmprinting.revisitor.operations.fsmprinting.FinalStateOperation;
import fsmprinting.revisitor.operations.fsmprinting.MachineOperation;
import fsmprinting.revisitor.operations.fsmprinting.StateOperation;
import fsmprinting.revisitor.operations.fsmprinting.TransitionOperation;
import minifsm.FinalState;
import minifsm.Machine;
import minifsm.State;
import minifsm.Transition;
import minifsm.revisitor.MinifsmRevisitor;

@SuppressWarnings("all")
public interface FsmprintingRevisitor extends MinifsmRevisitor<FinalStateOperation, MachineOperation, StateOperation, TransitionOperation> {
  @Override
  public default FinalStateOperation minifsm__FinalState(final FinalState it) {
    return new fsmprinting.revisitor.operations.fsmprinting.impl.FinalStateOperationImpl(it, this);
  }
  
  @Override
  public default MachineOperation minifsm__Machine(final Machine it) {
    return new fsmprinting.revisitor.operations.fsmprinting.impl.MachineOperationImpl(it, this);
  }
  
  @Override
  public default StateOperation minifsm__State(final State it) {
    return new fsmprinting.revisitor.operations.fsmprinting.impl.StateOperationImpl(it, this);
  }
  
  @Override
  public default TransitionOperation minifsm__Transition(final Transition it) {
    return new fsmprinting.revisitor.operations.fsmprinting.impl.TransitionOperationImpl(it, this);
  }
}
