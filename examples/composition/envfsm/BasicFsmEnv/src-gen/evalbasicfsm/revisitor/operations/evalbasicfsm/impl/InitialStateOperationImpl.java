package evalbasicfsm.revisitor.operations.evalbasicfsm.impl;

import basicFsmEnv.InitialState;
import basicFsmEnv.revisitor.BasicFsmEnvRevisitor;
import evalbasicfsm.revisitor.operations.evalbasicfsm.ActionOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.GuardOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.InitialStateOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.MachineOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.StateOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.TransOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.VarDeclOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.impl.StateOperationImpl;

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
