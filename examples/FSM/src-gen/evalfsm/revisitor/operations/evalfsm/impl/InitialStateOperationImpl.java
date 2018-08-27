package evalfsm.revisitor.operations.evalfsm.impl;

import evalfsm.revisitor.operations.evalfsm.FinalStateOperation;
import evalfsm.revisitor.operations.evalfsm.InitialStateOperation;
import evalfsm.revisitor.operations.evalfsm.MachineOperation;
import evalfsm.revisitor.operations.evalfsm.StateOperation;
import evalfsm.revisitor.operations.evalfsm.TransitionOperation;
import evalfsm.revisitor.operations.evalfsm.impl.StateOperationImpl;
import fsm.InitialState;
import fsm.revisitor.FsmRevisitor;

@SuppressWarnings("all")
public class InitialStateOperationImpl extends StateOperationImpl implements InitialStateOperation {
  private InitialState obj;
  
  private FsmRevisitor<? extends FinalStateOperation, ? extends InitialStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TransitionOperation> alg;
  
  public InitialStateOperationImpl(final InitialState obj, final FsmRevisitor<? extends FinalStateOperation, ? extends InitialStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TransitionOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
}
