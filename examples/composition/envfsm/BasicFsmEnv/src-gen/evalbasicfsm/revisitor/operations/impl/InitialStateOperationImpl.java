package evalbasicfsm.revisitor.operations.impl;

import basicFsmEnv.InitialState;
import basicFsmEnv.revisitor.BasicFsmEnvRevisitor;
import evalbasicfsm.revisitor.operations.ActionOperation;
import evalbasicfsm.revisitor.operations.GuardOperation;
import evalbasicfsm.revisitor.operations.InitialStateOperation;
import evalbasicfsm.revisitor.operations.MachineOperation;
import evalbasicfsm.revisitor.operations.StateOperation;
import evalbasicfsm.revisitor.operations.TransOperation;
import evalbasicfsm.revisitor.operations.VarDeclOperation;
import evalbasicfsm.revisitor.operations.impl.StateOperationImpl;

@SuppressWarnings("all")
public class InitialStateOperationImpl extends StateOperationImpl implements InitialStateOperation {
  private InitialState obj;
  
  private BasicFsmEnvRevisitor<ActionOperation, GuardOperation, InitialStateOperation, MachineOperation, StateOperation, TransOperation, VarDeclOperation> alg;
  
  public InitialStateOperationImpl(final InitialState obj, final BasicFsmEnvRevisitor<ActionOperation, GuardOperation, InitialStateOperation, MachineOperation, StateOperation, TransOperation, VarDeclOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
}
