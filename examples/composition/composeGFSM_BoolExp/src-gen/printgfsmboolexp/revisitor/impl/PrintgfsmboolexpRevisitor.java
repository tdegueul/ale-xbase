package printgfsmboolexp.revisitor.impl;

import boolexp.And;
import boolexp.Fals;
import boolexp.Or;
import boolexp.Tru;
import gfsm.FinalState;
import gfsm.InitialState;
import gfsm.Machine;
import gfsm.State;
import gfsm.Transition;
import gfsmprint.revisitor.operations.GuardOperation;
import gfsmprint.revisitor.operations.InitialStateOperation;
import gfsmprint.revisitor.operations.MachineOperation;
import gfsmprint.revisitor.operations.StateOperation;
import gfsmprint.revisitor.operations.TransitionOperation;
import printexp.revisitor.operations.AndOperation;
import printexp.revisitor.operations.ExpOperation;
import printexp.revisitor.operations.FalsOperation;
import printexp.revisitor.operations.OrOperation;
import printexp.revisitor.operations.TruOperation;
import printgfsmboolexp.GuardBind;
import printgfsmboolexp.revisitor.operations.GuardBindOperation;

@SuppressWarnings("all")
public interface PrintgfsmboolexpRevisitor extends printgfsmboolexp.revisitor.PrintgfsmboolexpRevisitor<AndOperation, ExpOperation, ExpOperation, FalsOperation, StateOperation, GuardOperation, GuardBindOperation, InitialStateOperation, ExpOperation, MachineOperation, OrOperation, StateOperation, TransitionOperation, TruOperation> {
  @Override
  public default AndOperation and(final And it) {
    return new printexp.revisitor.operations.impl.AndOperationImpl(it, this);
  }
  
  @Override
  public default FalsOperation fals(final Fals it) {
    return new printexp.revisitor.operations.impl.FalsOperationImpl(it, this);
  }
  
  @Override
  public default StateOperation finalState(final FinalState it) {
    return new gfsmprint.revisitor.operations.impl.StateOperationImpl(it, this);
  }
  
  @Override
  public default GuardBindOperation guardBind(final GuardBind it) {
    return new printgfsmboolexp.revisitor.operations.impl.GuardBindOperationImpl(it, this);
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
  public default OrOperation or(final Or it) {
    return new printexp.revisitor.operations.impl.OrOperationImpl(it, this);
  }
  
  @Override
  public default StateOperation state(final State it) {
    return new gfsmprint.revisitor.operations.impl.StateOperationImpl(it, this);
  }
  
  @Override
  public default TransitionOperation transition(final Transition it) {
    return new gfsmprint.revisitor.operations.impl.TransitionOperationImpl(it, this);
  }
  
  @Override
  public default TruOperation tru(final Tru it) {
    return new printexp.revisitor.operations.impl.TruOperationImpl(it, this);
  }
}
