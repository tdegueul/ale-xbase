package printfsm.revisitor.operations.printfsm.impl;

import fsm.FinalState;
import fsm.revisitor.FsmRevisitor;
import printfsm.revisitor.operations.printfsm.FinalStateOperation;
import printfsm.revisitor.operations.printfsm.InitialStateOperation;
import printfsm.revisitor.operations.printfsm.MachineOperation;
import printfsm.revisitor.operations.printfsm.StateOperation;
import printfsm.revisitor.operations.printfsm.TransitionOperation;
import printfsm.revisitor.operations.printfsm.impl.StateOperationImpl;

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
