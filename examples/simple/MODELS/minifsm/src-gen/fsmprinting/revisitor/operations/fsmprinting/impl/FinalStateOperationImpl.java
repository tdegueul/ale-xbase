package fsmprinting.revisitor.operations.fsmprinting.impl;

import fsmprinting.revisitor.operations.fsmprinting.FinalStateOperation;
import fsmprinting.revisitor.operations.fsmprinting.MachineOperation;
import fsmprinting.revisitor.operations.fsmprinting.StateOperation;
import fsmprinting.revisitor.operations.fsmprinting.TransitionOperation;
import fsmprinting.revisitor.operations.fsmprinting.impl.StateOperationImpl;
import minifsm.FinalState;
import minifsm.revisitor.MinifsmRevisitor;

@SuppressWarnings("all")
public class FinalStateOperationImpl extends StateOperationImpl implements FinalStateOperation {
  private FinalState obj;
  
  private MinifsmRevisitor<? extends FinalStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TransitionOperation> alg;
  
  public FinalStateOperationImpl(final FinalState obj, final MinifsmRevisitor<? extends FinalStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TransitionOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public String print() {
    String _print = this.alg.minifsm__State(this.obj).print();
    return ("* " + _print);
  }
}
