package tfsmprinting.revisitor.operations.tfsmprinting;

import tfsmprinting.revisitor.operations.tfsmprinting.TransitionOperation;

@SuppressWarnings("all")
public interface TimedTransitionOperation extends TransitionOperation, fsmprinting.revisitor.operations.fsmprinting.TransitionOperation {
  public abstract String print();
}
