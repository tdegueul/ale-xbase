package fsmprinting.revisitor.operations.fsmprinting.impl;

import fsmprinting.revisitor.operations.fsmprinting.FinalStateOperation;
import fsmprinting.revisitor.operations.fsmprinting.MachineOperation;
import fsmprinting.revisitor.operations.fsmprinting.StateOperation;
import fsmprinting.revisitor.operations.fsmprinting.TransitionOperation;
import minifsm.Transition;
import minifsm.revisitor.MinifsmRevisitor;

@SuppressWarnings("all")
public class TransitionOperationImpl implements TransitionOperation {
  private Transition obj;
  
  private MinifsmRevisitor<? extends FinalStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TransitionOperation> alg;
  
  public TransitionOperationImpl(final Transition obj, final MinifsmRevisitor<? extends FinalStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TransitionOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public String print() {
    char _event = this.obj.getEvent();
    String _plus = (Character.valueOf(_event) + " => ");
    String _name = this.obj.getTgt().getName();
    return (_plus + _name);
  }
}
