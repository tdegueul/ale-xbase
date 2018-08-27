package tfsmprinting.revisitor.operations.tfsmprinting.impl;

import minifsm.State;
import tfsmprinting.revisitor.operations.tfsmprinting.FinalStateOperation;
import tfsmprinting.revisitor.operations.tfsmprinting.MachineOperation;
import tfsmprinting.revisitor.operations.tfsmprinting.StateOperation;
import tfsmprinting.revisitor.operations.tfsmprinting.TimedTransitionOperation;
import tfsmprinting.revisitor.operations.tfsmprinting.TransitionOperation;
import timedminifsm.revisitor.TimedminifsmRevisitor;

@SuppressWarnings("all")
public class StateOperationImpl extends fsmprinting.revisitor.operations.fsmprinting.impl.StateOperationImpl implements StateOperation {
  private State obj;
  
  private TimedminifsmRevisitor<? extends FinalStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TimedTransitionOperation, ? extends TransitionOperation> alg;
  
  public StateOperationImpl(final State obj, final TimedminifsmRevisitor<? extends FinalStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TimedTransitionOperation, ? extends TransitionOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
}
