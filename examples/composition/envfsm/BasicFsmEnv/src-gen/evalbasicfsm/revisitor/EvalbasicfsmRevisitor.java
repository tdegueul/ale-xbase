package evalbasicfsm.revisitor;

import basicFsmEnv.InitialState;
import basicFsmEnv.Machine;
import basicFsmEnv.State;
import basicFsmEnv.Trans;
import basicFsmEnv.VarDecl;
import basicFsmEnv.revisitor.BasicFsmEnvRevisitor;
import evalbasicfsm.revisitor.operations.ActionOperation;
import evalbasicfsm.revisitor.operations.GuardOperation;
import evalbasicfsm.revisitor.operations.MachineOperation;
import evalbasicfsm.revisitor.operations.StateOperation;
import evalbasicfsm.revisitor.operations.TransOperation;
import evalbasicfsm.revisitor.operations.VarDeclOperation;

@SuppressWarnings("all")
public interface EvalbasicfsmRevisitor extends BasicFsmEnvRevisitor<ActionOperation, GuardOperation, StateOperation, MachineOperation, StateOperation, TransOperation, VarDeclOperation> {
  @Override
  public default StateOperation initialState(final InitialState it) {
    return new evalbasicfsm.revisitor.operations.impl.StateOperationImpl(it, this);
  }
  
  @Override
  public default MachineOperation machine(final Machine it) {
    return new evalbasicfsm.revisitor.operations.impl.MachineOperationImpl(it, this);
  }
  
  @Override
  public default StateOperation state(final State it) {
    return new evalbasicfsm.revisitor.operations.impl.StateOperationImpl(it, this);
  }
  
  @Override
  public default TransOperation trans(final Trans it) {
    return new evalbasicfsm.revisitor.operations.impl.TransOperationImpl(it, this);
  }
  
  @Override
  public default VarDeclOperation varDecl(final VarDecl it) {
    return new evalbasicfsm.revisitor.operations.impl.VarDeclOperationImpl(it, this);
  }
}
