package evalbasicfsm.revisitor;

import basicFsmEnv.InitialState;
import basicFsmEnv.Machine;
import basicFsmEnv.State;
import basicFsmEnv.Trans;
import basicFsmEnv.VarDecl;
import basicFsmEnv.revisitor.BasicFsmEnvRevisitor;
import evalbasicfsm.revisitor.operations.evalbasicfsm.ActionOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.GuardOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.InitialStateOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.MachineOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.StateOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.TransOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.VarDeclOperation;

@SuppressWarnings("all")
public interface EvalbasicfsmRevisitor extends BasicFsmEnvRevisitor<ActionOperation, GuardOperation, InitialStateOperation, MachineOperation, StateOperation, TransOperation, VarDeclOperation> {
  @Override
  public default InitialStateOperation basicFsmEnv__InitialState(final InitialState it) {
    return new evalbasicfsm.revisitor.operations.evalbasicfsm.impl.InitialStateOperationImpl(it, this);
  }
  
  @Override
  public default MachineOperation basicFsmEnv__Machine(final Machine it) {
    return new evalbasicfsm.revisitor.operations.evalbasicfsm.impl.MachineOperationImpl(it, this);
  }
  
  @Override
  public default StateOperation basicFsmEnv__State(final State it) {
    return new evalbasicfsm.revisitor.operations.evalbasicfsm.impl.StateOperationImpl(it, this);
  }
  
  @Override
  public default TransOperation basicFsmEnv__Trans(final Trans it) {
    return new evalbasicfsm.revisitor.operations.evalbasicfsm.impl.TransOperationImpl(it, this);
  }
  
  @Override
  public default VarDeclOperation basicFsmEnv__VarDecl(final VarDecl it) {
    return new evalbasicfsm.revisitor.operations.evalbasicfsm.impl.VarDeclOperationImpl(it, this);
  }
}
