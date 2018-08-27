package tfsmprinting.revisitor.operations.tfsmprinting.impl;

import minifsm.Machine;
import tfsmprinting.revisitor.operations.tfsmprinting.FinalStateOperation;
import tfsmprinting.revisitor.operations.tfsmprinting.MachineOperation;
import tfsmprinting.revisitor.operations.tfsmprinting.StateOperation;
import tfsmprinting.revisitor.operations.tfsmprinting.TimedTransitionOperation;
import tfsmprinting.revisitor.operations.tfsmprinting.TransitionOperation;
import timedminifsm.revisitor.TimedminifsmRevisitor;

@SuppressWarnings("all")
public class MachineOperationImpl extends fsmprinting.revisitor.operations.fsmprinting.impl.MachineOperationImpl implements MachineOperation {
  private Machine obj;
  
  private TimedminifsmRevisitor<? extends FinalStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TimedTransitionOperation, ? extends TransitionOperation> alg;
  
  public MachineOperationImpl(final Machine obj, final TimedminifsmRevisitor<? extends FinalStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TimedTransitionOperation, ? extends TransitionOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
}
