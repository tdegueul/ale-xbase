package evalbasicfsm.revisitor.operations.evalbasicfsm.impl;

import basicFsmEnv.VarDecl;
import basicFsmEnv.revisitor.BasicFsmEnvRevisitor;
import basicFsmEnv.runtime.Context;
import evalbasicfsm.revisitor.operations.evalbasicfsm.ActionOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.GuardOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.InitialStateOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.MachineOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.StateOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.TransOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.VarDeclOperation;

@SuppressWarnings("all")
public class VarDeclOperationImpl implements VarDeclOperation {
  private VarDecl obj;
  
  private BasicFsmEnvRevisitor<? extends ActionOperation, ? extends GuardOperation, ? extends InitialStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TransOperation, ? extends VarDeclOperation> alg;
  
  public VarDeclOperationImpl(final VarDecl obj, final BasicFsmEnvRevisitor<? extends ActionOperation, ? extends GuardOperation, ? extends InitialStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TransOperation, ? extends VarDeclOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void eval(final Context ctx) {
    boolean _containsKey = ctx.getEnv().containsKey(this.obj.getName());
    boolean _not = (!_containsKey);
    if (_not) {
      ctx.bind(this.obj.getName(), this.obj.getValue());
    }
  }
}
