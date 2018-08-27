package tfsmprinting.revisitor.operations.tfsmprinting.impl;

import minifsm.Transition;
import tfsmprinting.revisitor.operations.tfsmprinting.FinalStateOperation;
import tfsmprinting.revisitor.operations.tfsmprinting.MachineOperation;
import tfsmprinting.revisitor.operations.tfsmprinting.StateOperation;
import tfsmprinting.revisitor.operations.tfsmprinting.TimedTransitionOperation;
import tfsmprinting.revisitor.operations.tfsmprinting.TransitionOperation;
import timedminifsm.revisitor.TimedminifsmRevisitor;

@SuppressWarnings("all")
public class TransitionOperationImpl extends fsmprinting.revisitor.operations.fsmprinting.impl.TransitionOperationImpl implements TransitionOperation {
  private Transition obj;
  
  private TimedminifsmRevisitor<? extends FinalStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TimedTransitionOperation, ? extends TransitionOperation> alg;
  
  public TransitionOperationImpl(final Transition obj, final TimedminifsmRevisitor<? extends FinalStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TimedTransitionOperation, ? extends TransitionOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
}
