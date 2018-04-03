package printgfsmboolexp.revisitor.operations.impl;

import gfsmprint.revisitor.operations.GuardOperation;
import gfsmprint.revisitor.operations.InitialStateOperation;
import gfsmprint.revisitor.operations.MachineOperation;
import gfsmprint.revisitor.operations.StateOperation;
import gfsmprint.revisitor.operations.TransitionOperation;
import printexp.revisitor.operations.AndOperation;
import printexp.revisitor.operations.ExpOperation;
import printexp.revisitor.operations.FalsOperation;
import printexp.revisitor.operations.OrOperation;
import printexp.revisitor.operations.TruOperation;
import printgfsmboolexp.GuardBind;
import printgfsmboolexp.revisitor.PrintgfsmboolexpRevisitor;
import printgfsmboolexp.revisitor.operations.GuardBindOperation;

@SuppressWarnings("all")
public class GuardBindOperationImpl implements GuardBindOperation {
  private GuardBind obj;
  
  private PrintgfsmboolexpRevisitor<AndOperation, ExpOperation, ExpOperation, FalsOperation, StateOperation, GuardOperation, GuardBindOperation, InitialStateOperation, ExpOperation, MachineOperation, OrOperation, StateOperation, TransitionOperation, TruOperation> alg;
  
  public GuardBindOperationImpl(final GuardBind obj, final PrintgfsmboolexpRevisitor<AndOperation, ExpOperation, ExpOperation, FalsOperation, StateOperation, GuardOperation, GuardBindOperation, InitialStateOperation, ExpOperation, MachineOperation, OrOperation, StateOperation, TransitionOperation, TruOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public String evaluate() {
    return alg.$(obj.getDelegate()).print();
  }
}
