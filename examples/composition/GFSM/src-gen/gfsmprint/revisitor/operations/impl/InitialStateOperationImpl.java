package gfsmprint.revisitor.operations.impl;

import gfsm.InitialState;
import gfsm.revisitor.GfsmRevisitor;
import gfsmprint.revisitor.operations.GuardOperation;
import gfsmprint.revisitor.operations.InitialStateOperation;
import gfsmprint.revisitor.operations.MachineOperation;
import gfsmprint.revisitor.operations.StateOperation;
import gfsmprint.revisitor.operations.TransitionOperation;
import gfsmprint.revisitor.operations.impl.StateOperationImpl;

@SuppressWarnings("all")
public class InitialStateOperationImpl extends StateOperationImpl implements InitialStateOperation {
  private InitialState obj;
  
  private GfsmRevisitor<StateOperation, GuardOperation, InitialStateOperation, MachineOperation, StateOperation, TransitionOperation> alg;
  
  public InitialStateOperationImpl(final InitialState obj, final GfsmRevisitor<StateOperation, GuardOperation, InitialStateOperation, MachineOperation, StateOperation, TransitionOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public String print() {
    return "INITIAL";
  }
}
