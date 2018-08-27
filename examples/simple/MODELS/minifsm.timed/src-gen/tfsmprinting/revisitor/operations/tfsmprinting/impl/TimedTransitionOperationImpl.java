package tfsmprinting.revisitor.operations.tfsmprinting.impl;

import tfsmprinting.revisitor.operations.tfsmprinting.FinalStateOperation;
import tfsmprinting.revisitor.operations.tfsmprinting.MachineOperation;
import tfsmprinting.revisitor.operations.tfsmprinting.StateOperation;
import tfsmprinting.revisitor.operations.tfsmprinting.TimedTransitionOperation;
import tfsmprinting.revisitor.operations.tfsmprinting.TransitionOperation;
import tfsmprinting.revisitor.operations.tfsmprinting.impl.TransitionOperationImpl;
import timedminifsm.TimedTransition;
import timedminifsm.revisitor.TimedminifsmRevisitor;

@SuppressWarnings("all")
public class TimedTransitionOperationImpl extends TransitionOperationImpl implements TimedTransitionOperation {
  private TimedTransition obj;
  
  private TimedminifsmRevisitor<? extends FinalStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TimedTransitionOperation, ? extends TransitionOperation> alg;
  
  public TimedTransitionOperationImpl(final TimedTransition obj, final TimedminifsmRevisitor<? extends FinalStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TimedTransitionOperation, ? extends TransitionOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public String print() {
    String _print = this.alg.minifsm__Transition(this.obj).print();
    String _plus = (_print + " @ ");
    int _time = this.obj.getTime();
    return (_plus + Integer.valueOf(_time));
  }
}
