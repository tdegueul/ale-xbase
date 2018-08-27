package fsmprinting.revisitor.operations.fsmprinting.impl;

import fsmprinting.revisitor.operations.fsmprinting.FinalStateOperation;
import fsmprinting.revisitor.operations.fsmprinting.MachineOperation;
import fsmprinting.revisitor.operations.fsmprinting.StateOperation;
import fsmprinting.revisitor.operations.fsmprinting.TransitionOperation;
import minifsm.State;
import minifsm.Transition;
import minifsm.revisitor.MinifsmRevisitor;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class StateOperationImpl implements StateOperation {
  private State obj;
  
  private MinifsmRevisitor<? extends FinalStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TransitionOperation> alg;
  
  public StateOperationImpl(final State obj, final MinifsmRevisitor<? extends FinalStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TransitionOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public String print() {
    String _name = this.obj.getName();
    String _plus = ("State " + _name);
    String _plus_1 = (_plus + "\n");
    final Function1<Transition, String> _function = (Transition t) -> {
      String _print = this.alg.$(t).print();
      return ("\t" + _print);
    };
    String _join = IterableExtensions.join(ListExtensions.<Transition, String>map(this.obj.getOut(), _function), "\n");
    return (_plus_1 + _join);
  }
}
