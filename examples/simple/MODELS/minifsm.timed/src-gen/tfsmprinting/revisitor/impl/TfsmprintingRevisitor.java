package tfsmprinting.revisitor.impl;

import minifsm.FinalState;
import minifsm.Machine;
import minifsm.State;
import minifsm.Transition;
import tfsmprinting.revisitor.operations.tfsmprinting.FinalStateOperation;
import tfsmprinting.revisitor.operations.tfsmprinting.MachineOperation;
import tfsmprinting.revisitor.operations.tfsmprinting.StateOperation;
import tfsmprinting.revisitor.operations.tfsmprinting.TimedTransitionOperation;
import tfsmprinting.revisitor.operations.tfsmprinting.TransitionOperation;
import timedminifsm.TimedTransition;
import timedminifsm.revisitor.TimedminifsmRevisitor;

@SuppressWarnings("all")
public interface TfsmprintingRevisitor extends TimedminifsmRevisitor<FinalStateOperation, MachineOperation, StateOperation, TimedTransitionOperation, TransitionOperation> {
  @Override
  public default FinalStateOperation minifsm__FinalState(final FinalState it) {
    return new tfsmprinting.revisitor.operations.tfsmprinting.impl.FinalStateOperationImpl(it, this);
  }
  
  @Override
  public default MachineOperation minifsm__Machine(final Machine it) {
    return new tfsmprinting.revisitor.operations.tfsmprinting.impl.MachineOperationImpl(it, this);
  }
  
  @Override
  public default StateOperation minifsm__State(final State it) {
    return new tfsmprinting.revisitor.operations.tfsmprinting.impl.StateOperationImpl(it, this);
  }
  
  @Override
  public default TimedTransitionOperation timedminifsm__TimedTransition(final TimedTransition it) {
    return new tfsmprinting.revisitor.operations.tfsmprinting.impl.TimedTransitionOperationImpl(it, this);
  }
  
  @Override
  public default TransitionOperation minifsm__Transition(final Transition it) {
    return new tfsmprinting.revisitor.operations.tfsmprinting.impl.TransitionOperationImpl(it, this);
  }
}
