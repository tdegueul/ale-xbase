package evalgfsmboolexp.revisitor.operations.impl;

import evalexp.revisitor.operations.AndOperation;
import evalexp.revisitor.operations.ExpOperation;
import evalexp.revisitor.operations.FalsOperation;
import evalexp.revisitor.operations.OrOperation;
import evalexp.revisitor.operations.TruOperation;
import evalgfsmboolexp.GuardBind;
import evalgfsmboolexp.revisitor.EvalgfsmboolexpRevisitor;
import evalgfsmboolexp.revisitor.operations.GuardBindOperation;
import gfsmeval.revisitor.operations.GuardOperation;
import gfsmeval.revisitor.operations.MachineOperation;
import gfsmeval.revisitor.operations.StateOperation;
import gfsmeval.revisitor.operations.TransitionOperation;

@SuppressWarnings("all")
public class GuardBindOperationImpl implements GuardBindOperation {
  private GuardBind obj;
  
  private EvalgfsmboolexpRevisitor<AndOperation, ExpOperation, ExpOperation, FalsOperation, StateOperation, GuardOperation, GuardBindOperation, StateOperation, ExpOperation, MachineOperation, OrOperation, StateOperation, TransitionOperation, TruOperation> alg;
  
  public GuardBindOperationImpl(final GuardBind obj, final EvalgfsmboolexpRevisitor<AndOperation, ExpOperation, ExpOperation, FalsOperation, StateOperation, GuardOperation, GuardBindOperation, StateOperation, ExpOperation, MachineOperation, OrOperation, StateOperation, TransitionOperation, TruOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public boolean evaluate() {
    return alg.$(obj.getDelegate()).eval();
  }
}
