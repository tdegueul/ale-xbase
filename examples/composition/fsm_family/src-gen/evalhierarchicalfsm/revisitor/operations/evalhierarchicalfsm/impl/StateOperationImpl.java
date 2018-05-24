package evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.impl;

import basicFsmEnv.State;
import evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.ActionOperation;
import evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.CompositeStateOperation;
import evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.GuardOperation;
import evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.InitialStateOperation;
import evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.MachineOperation;
import evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.RegionOperation;
import evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.StateOperation;
import evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.TransOperation;
import evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.VarDeclOperation;
import hierarchicalFsmEnv.revisitor.HierarchicalFsmEnvRevisitor;

@SuppressWarnings("all")
public class StateOperationImpl extends evalbasicfsm.revisitor.operations.evalbasicfsm.impl.StateOperationImpl implements StateOperation {
  private State obj;
  
  private HierarchicalFsmEnvRevisitor<? extends ActionOperation, ? extends CompositeStateOperation, ? extends GuardOperation, ? extends InitialStateOperation, ? extends MachineOperation, ? extends RegionOperation, ? extends StateOperation, ? extends TransOperation, ? extends VarDeclOperation> alg;
  
  public StateOperationImpl(final State obj, final HierarchicalFsmEnvRevisitor<? extends ActionOperation, ? extends CompositeStateOperation, ? extends GuardOperation, ? extends InitialStateOperation, ? extends MachineOperation, ? extends RegionOperation, ? extends StateOperation, ? extends TransOperation, ? extends VarDeclOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
}
