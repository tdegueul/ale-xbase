package evalbasicfsm.revisitor.operations.impl;

import basicFsmEnv.VarDecl;
import basicFsmEnv.revisitor.BasicFsmEnvRevisitor;
import basicFsmEnv.runtime.Context;
import evalbasicfsm.revisitor.operations.ActionOperation;
import evalbasicfsm.revisitor.operations.GuardOperation;
import evalbasicfsm.revisitor.operations.InitialStateOperation;
import evalbasicfsm.revisitor.operations.MachineOperation;
import evalbasicfsm.revisitor.operations.StateOperation;
import evalbasicfsm.revisitor.operations.TransOperation;
import evalbasicfsm.revisitor.operations.VarDeclOperation;

@SuppressWarnings("all")
public class VarDeclOperationImpl implements VarDeclOperation {
  private VarDecl obj;
  
  private BasicFsmEnvRevisitor<ActionOperation, GuardOperation, InitialStateOperation, MachineOperation, StateOperation, TransOperation, VarDeclOperation> alg;
  
  public VarDeclOperationImpl(final VarDecl obj, final BasicFsmEnvRevisitor<ActionOperation, GuardOperation, InitialStateOperation, MachineOperation, StateOperation, TransOperation, VarDeclOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void eval(final Context ctx) {
    ctx.bind(this.obj.getName(), this.obj.getValue());
  }
}
