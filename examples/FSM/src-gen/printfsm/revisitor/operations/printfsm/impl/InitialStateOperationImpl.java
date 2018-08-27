package printfsm.revisitor.operations.printfsm.impl;

import fsm.InitialState;
import fsm.revisitor.FsmRevisitor;
import printfsm.revisitor.operations.printfsm.FinalStateOperation;
import printfsm.revisitor.operations.printfsm.InitialStateOperation;
import printfsm.revisitor.operations.printfsm.MachineOperation;
import printfsm.revisitor.operations.printfsm.StateOperation;
import printfsm.revisitor.operations.printfsm.TransitionOperation;
import printfsm.revisitor.operations.printfsm.impl.StateOperationImpl;

@SuppressWarnings("all")
public class InitialStateOperationImpl extends StateOperationImpl implements InitialStateOperation {
  private InitialState obj;
  
  private FsmRevisitor<? extends FinalStateOperation, ? extends InitialStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TransitionOperation> alg;
  
  public InitialStateOperationImpl(final InitialState obj, final FsmRevisitor<? extends FinalStateOperation, ? extends InitialStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TransitionOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public String print() {
    return "INITIAL";
  }
}
