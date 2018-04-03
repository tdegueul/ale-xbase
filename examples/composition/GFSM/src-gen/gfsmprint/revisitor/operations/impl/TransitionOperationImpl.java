package gfsmprint.revisitor.operations.impl;

import gfsm.Guard;
import gfsm.Transition;
import gfsm.revisitor.GfsmRevisitor;
import gfsmprint.revisitor.operations.GuardOperation;
import gfsmprint.revisitor.operations.InitialStateOperation;
import gfsmprint.revisitor.operations.MachineOperation;
import gfsmprint.revisitor.operations.StateOperation;
import gfsmprint.revisitor.operations.TransitionOperation;

@SuppressWarnings("all")
public class TransitionOperationImpl implements TransitionOperation {
  private Transition obj;
  
  private GfsmRevisitor<StateOperation, GuardOperation, InitialStateOperation, MachineOperation, StateOperation, TransitionOperation> alg;
  
  public TransitionOperationImpl(final Transition obj, final GfsmRevisitor<StateOperation, GuardOperation, InitialStateOperation, MachineOperation, StateOperation, TransitionOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public String print() {
    String _event = this.obj.getEvent();
    String _plus = ("    " + _event);
    String _plus_1 = (_plus + " -> ");
    String _name = this.obj.getTarget().getName();
    String _plus_2 = (_plus_1 + _name);
    String _xifexpression = null;
    Guard _guard = this.obj.getGuard();
    boolean _tripleNotEquals = (_guard != null);
    if (_tripleNotEquals) {
      String _evaluate = this.alg.$(this.obj.getGuard()).evaluate();
      String _plus_3 = (" (" + _evaluate);
      _xifexpression = (_plus_3 + ")");
    } else {
      _xifexpression = "";
    }
    return (_plus_2 + _xifexpression);
  }
}
