package evalgfsmboolexp.revisitor.impl;

import boolexp.And;
import boolexp.Fals;
import boolexp.Or;
import boolexp.Tru;
import evalexp.revisitor.operations.AndOperation;
import evalexp.revisitor.operations.ExpOperation;
import evalexp.revisitor.operations.FalsOperation;
import evalexp.revisitor.operations.OrOperation;
import evalexp.revisitor.operations.TruOperation;
import evalgfsmboolexp.GuardBind;
import evalgfsmboolexp.revisitor.operations.GuardBindOperation;
import gfsm.FinalState;
import gfsm.InitialState;
import gfsm.Machine;
import gfsm.State;
import gfsm.Transition;
import gfsmeval.revisitor.operations.GuardOperation;
import gfsmeval.revisitor.operations.MachineOperation;
import gfsmeval.revisitor.operations.StateOperation;
import gfsmeval.revisitor.operations.TransitionOperation;

@SuppressWarnings("all")
public interface EvalgfsmboolexpRevisitor extends evalgfsmboolexp.revisitor.EvalgfsmboolexpRevisitor<AndOperation, ExpOperation, ExpOperation, FalsOperation, StateOperation, GuardOperation, GuardBindOperation, StateOperation, ExpOperation, MachineOperation, OrOperation, StateOperation, TransitionOperation, TruOperation> {
  @Override
  public default AndOperation and(final And it) {
    return new evalexp.revisitor.operations.impl.AndOperationImpl(it, this);
  }
  
  @Override
  public default FalsOperation fals(final Fals it) {
    return new evalexp.revisitor.operations.impl.FalsOperationImpl(it, this);
  }
  
  @Override
  public default StateOperation finalState(final FinalState it) {
    return new gfsmeval.revisitor.operations.impl.StateOperationImpl(it, this);
  }
  
  @Override
  public default GuardBindOperation guardBind(final GuardBind it) {
    return new evalgfsmboolexp.revisitor.operations.impl.GuardBindOperationImpl(it, this);
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
  public default OrOperation or(final Or it) {
    return new evalexp.revisitor.operations.impl.OrOperationImpl(it, this);
  }
  
  @Override
  public default StateOperation state(final State it) {
    return new gfsmeval.revisitor.operations.impl.StateOperationImpl(it, this);
  }
  
  @Override
  public default TransitionOperation transition(final Transition it) {
    return new gfsmeval.revisitor.operations.impl.TransitionOperationImpl(it, this);
  }
  
  @Override
  public default TruOperation tru(final Tru it) {
    return new evalexp.revisitor.operations.impl.TruOperationImpl(it, this);
  }
}
