package evalfsm.revisitor.operations.evalfsm.impl;

import evalfsm.revisitor.operations.evalfsm.FinalStateOperation;
import evalfsm.revisitor.operations.evalfsm.InitialStateOperation;
import evalfsm.revisitor.operations.evalfsm.MachineOperation;
import evalfsm.revisitor.operations.evalfsm.StateOperation;
import evalfsm.revisitor.operations.evalfsm.TransitionOperation;
import evalfsm.revisitor.operations.evalfsm.impl.StateOperationImpl;
import fsm.FinalState;
import fsm.revisitor.FsmRevisitor;

@SuppressWarnings("all")
public class FinalStateOperationImpl extends StateOperationImpl implements FinalStateOperation {
  private FinalState obj;
  
  private FsmRevisitor<? extends FinalStateOperation, ? extends InitialStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TransitionOperation> alg;
  
  public FinalStateOperationImpl(final FinalState obj, final FsmRevisitor<? extends FinalStateOperation, ? extends InitialStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TransitionOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
}
