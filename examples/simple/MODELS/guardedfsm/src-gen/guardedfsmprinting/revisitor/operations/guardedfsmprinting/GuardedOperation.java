package guardedfsmprinting.revisitor.operations.guardedfsmprinting;

import fsmprinting.revisitor.operations.fsmprinting.TransitionOperation;

@SuppressWarnings("all")
public interface GuardedOperation extends TransitionOperation, guardedfsmprinting.revisitor.operations.guardedfsmprinting.TransitionOperation {
  public abstract String print();
}
