package guardedfsmprinting.revisitor.impl;

import boolexp.And;
import boolexp.Fals;
import boolexp.Or;
import boolexp.Tru;
import guardedfsm.Guarded;
import guardedfsm.revisitor.GuardedfsmRevisitor;
import guardedfsmprinting.revisitor.operations.guardedfsmprinting.AndOperation;
import guardedfsmprinting.revisitor.operations.guardedfsmprinting.BinaryExpOperation;
import guardedfsmprinting.revisitor.operations.guardedfsmprinting.ExpOperation;
import guardedfsmprinting.revisitor.operations.guardedfsmprinting.FalsOperation;
import guardedfsmprinting.revisitor.operations.guardedfsmprinting.FinalStateOperation;
import guardedfsmprinting.revisitor.operations.guardedfsmprinting.GuardedOperation;
import guardedfsmprinting.revisitor.operations.guardedfsmprinting.LitOperation;
import guardedfsmprinting.revisitor.operations.guardedfsmprinting.MachineOperation;
import guardedfsmprinting.revisitor.operations.guardedfsmprinting.OrOperation;
import guardedfsmprinting.revisitor.operations.guardedfsmprinting.StateOperation;
import guardedfsmprinting.revisitor.operations.guardedfsmprinting.TransitionOperation;
import guardedfsmprinting.revisitor.operations.guardedfsmprinting.TruOperation;
import minifsm.FinalState;
import minifsm.Machine;
import minifsm.State;
import minifsm.Transition;

@SuppressWarnings("all")
public interface GuardedfsmprintingRevisitor extends GuardedfsmRevisitor<AndOperation, BinaryExpOperation, ExpOperation, FalsOperation, FinalStateOperation, GuardedOperation, LitOperation, MachineOperation, OrOperation, StateOperation, TransitionOperation, TruOperation> {
  @Override
  public default AndOperation boolexp__And(final And it) {
    return new guardedfsmprinting.revisitor.operations.guardedfsmprinting.impl.AndOperationImpl(it, this);
  }
  
  @Override
  public default FalsOperation boolexp__Fals(final Fals it) {
    return new guardedfsmprinting.revisitor.operations.guardedfsmprinting.impl.FalsOperationImpl(it, this);
  }
  
  @Override
  public default FinalStateOperation minifsm__FinalState(final FinalState it) {
    return new guardedfsmprinting.revisitor.operations.guardedfsmprinting.impl.FinalStateOperationImpl(it, this);
  }
  
  @Override
  public default GuardedOperation guardedfsm__Guarded(final Guarded it) {
    return new guardedfsmprinting.revisitor.operations.guardedfsmprinting.impl.GuardedOperationImpl(it, this);
  }
  
  @Override
  public default MachineOperation minifsm__Machine(final Machine it) {
    return new guardedfsmprinting.revisitor.operations.guardedfsmprinting.impl.MachineOperationImpl(it, this);
  }
  
  @Override
  public default OrOperation boolexp__Or(final Or it) {
    return new guardedfsmprinting.revisitor.operations.guardedfsmprinting.impl.OrOperationImpl(it, this);
  }
  
  @Override
  public default StateOperation minifsm__State(final State it) {
    return new guardedfsmprinting.revisitor.operations.guardedfsmprinting.impl.StateOperationImpl(it, this);
  }
  
  @Override
  public default TransitionOperation minifsm__Transition(final Transition it) {
    return new guardedfsmprinting.revisitor.operations.guardedfsmprinting.impl.TransitionOperationImpl(it, this);
  }
  
  @Override
  public default TruOperation boolexp__Tru(final Tru it) {
    return new guardedfsmprinting.revisitor.operations.guardedfsmprinting.impl.TruOperationImpl(it, this);
  }
}
