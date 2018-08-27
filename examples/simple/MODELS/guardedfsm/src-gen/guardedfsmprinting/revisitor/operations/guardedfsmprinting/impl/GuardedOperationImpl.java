package guardedfsmprinting.revisitor.operations.guardedfsmprinting.impl;

import fsmprinting.revisitor.operations.fsmprinting.impl.TransitionOperationImpl;
import guardedfsm.Guarded;
import guardedfsm.revisitor.GuardedfsmRevisitor;
import guardedfsmprinting.revisitor.operations.guardedfsmprinting.AndOperation;
import guardedfsmprinting.revisitor.operations.guardedfsmprinting.BinaryExpOperation;
import guardedfsmprinting.revisitor.operations.guardedfsmprinting.ExpOperation;
import guardedfsmprinting.revisitor.operations.guardedfsmprinting.FalsOperation;
import guardedfsmprinting.revisitor.operations.guardedfsmprinting.FinalStateOperation;
import guardedfsmprinting.revisitor.operations.guardedfsmprinting.GuardedOperation;
import guardedfsmprinting.revisitor.operations.guardedfsmprinting.LitOperation;
import guardedfsmprinting.revisitor.operations.guardedfsmprinting.MachineOperation;
import guardedfsmprinting.revisitor.operations.guardedfsmprinting.OrOperation;
import guardedfsmprinting.revisitor.operations.guardedfsmprinting.StateOperation;
import guardedfsmprinting.revisitor.operations.guardedfsmprinting.TransitionOperation;
import guardedfsmprinting.revisitor.operations.guardedfsmprinting.TruOperation;

@SuppressWarnings("all")
public class GuardedOperationImpl extends TransitionOperationImpl implements GuardedOperation {
  private Guarded obj;
  
  private GuardedfsmRevisitor<? extends AndOperation, ? extends BinaryExpOperation, ? extends ExpOperation, ? extends FalsOperation, ? extends FinalStateOperation, ? extends GuardedOperation, ? extends LitOperation, ? extends MachineOperation, ? extends OrOperation, ? extends StateOperation, ? extends TransitionOperation, ? extends TruOperation> alg;
  
  public GuardedOperationImpl(final Guarded obj, final GuardedfsmRevisitor<? extends AndOperation, ? extends BinaryExpOperation, ? extends ExpOperation, ? extends FalsOperation, ? extends FinalStateOperation, ? extends GuardedOperation, ? extends LitOperation, ? extends MachineOperation, ? extends OrOperation, ? extends StateOperation, ? extends TransitionOperation, ? extends TruOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public String print() {
    String _print = this.alg.minifsm__Transition(this.obj).print();
    String _plus = (_print + " [");
    String _print_1 = this.alg.$(this.obj.getGuard()).print();
    String _plus_1 = (_plus + _print_1);
    return (_plus_1 + "]");
  }
}
