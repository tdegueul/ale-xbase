package fsm_hierarchical.revisitor.impl;

import basicFsmEnv.Action;
import basicFsmEnv.Guard;
import basicFsmEnv.InitialState;
import basicFsmEnv.Machine;
import basicFsmEnv.State;
import basicFsmEnv.Trans;
import basicFsmEnv.VarDecl;
import evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.ActionOperation;
import evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.CompositeStateOperation;
import evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.GuardOperation;
import evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.InitialStateOperation;
import evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.MachineOperation;
import evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.RegionOperation;
import evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.StateOperation;
import evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.TransOperation;
import evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.VarDeclOperation;
import hierarchicalFsmEnv.CompositeState;
import hierarchicalFsmEnv.Region;

@SuppressWarnings("all")
public interface Fsm_hierarchicalRevisitor extends fsm_hierarchical.revisitor.Fsm_hierarchicalRevisitor<ActionOperation, CompositeStateOperation, GuardOperation, InitialStateOperation, MachineOperation, RegionOperation, StateOperation, TransOperation, VarDeclOperation> {
  public default ActionOperation $(final Action it) {
    throw new java.lang.RuntimeException("Bound to nothing");
  }
  
  public default GuardOperation $(final Guard it) {
    throw new java.lang.RuntimeException("Bound to nothing");
  }
  
  @Override
  public default CompositeStateOperation hierarchicalFsmEnv__CompositeState(final CompositeState it) {
    return new evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.impl.CompositeStateOperationImpl(it, this);
  }
  
  @Override
  public default RegionOperation hierarchicalFsmEnv__Region(final Region it) {
    return new evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.impl.RegionOperationImpl(it, this);
  }
  
  @Override
  public default MachineOperation basicFsmEnv__Machine(final Machine it) {
    return new evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.impl.MachineOperationImpl(it, this);
  }
  
  @Override
  public default StateOperation basicFsmEnv__State(final State it) {
    return new evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.impl.StateOperationImpl(it, this);
  }
  
  @Override
  public default TransOperation basicFsmEnv__Trans(final Trans it) {
    return new evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.impl.TransOperationImpl(it, this);
  }
  
  @Override
  public default InitialStateOperation basicFsmEnv__InitialState(final InitialState it) {
    return new evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.impl.InitialStateOperationImpl(it, this);
  }
  
  @Override
  public default VarDeclOperation basicFsmEnv__VarDecl(final VarDecl it) {
    return new evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.impl.VarDeclOperationImpl(it, this);
  }
}
