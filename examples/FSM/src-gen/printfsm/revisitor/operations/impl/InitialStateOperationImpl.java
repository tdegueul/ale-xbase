package printfsm.revisitor.operations.impl;

import fsm.InitialState;
import fsm.revisitor.FsmRevisitor;
import printfsm.revisitor.operations.InitialStateOperation;
import printfsm.revisitor.operations.MachineOperation;
import printfsm.revisitor.operations.StateOperation;
import printfsm.revisitor.operations.TransitionOperation;
import printfsm.revisitor.operations.impl.StateOperationImpl;

@SuppressWarnings("all")
public class InitialStateOperationImpl extends StateOperationImpl implements InitialStateOperation {
  private InitialState self;
  
  private FsmRevisitor<StateOperation, InitialStateOperation, MachineOperation, StateOperation, TransitionOperation> alg;
  
  public InitialStateOperationImpl(final InitialState self, final FsmRevisitor<StateOperation, InitialStateOperation, MachineOperation, StateOperation, TransitionOperation> alg) {
    super(self, alg);
    this.self = self;
    this.alg = alg;
  }
  
  @Override
  public String print() {
    return "INITIAL";
  }
}
