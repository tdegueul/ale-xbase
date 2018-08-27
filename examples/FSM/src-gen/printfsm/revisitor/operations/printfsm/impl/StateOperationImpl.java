package printfsm.revisitor.operations.printfsm.impl;

import fsm.State;
import fsm.Transition;
import fsm.revisitor.FsmRevisitor;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import printfsm.revisitor.operations.printfsm.FinalStateOperation;
import printfsm.revisitor.operations.printfsm.InitialStateOperation;
import printfsm.revisitor.operations.printfsm.MachineOperation;
import printfsm.revisitor.operations.printfsm.StateOperation;
import printfsm.revisitor.operations.printfsm.TransitionOperation;

@SuppressWarnings("all")
public class StateOperationImpl implements StateOperation {
  private State obj;
  
  private FsmRevisitor<? extends FinalStateOperation, ? extends InitialStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TransitionOperation> alg;
  
  public StateOperationImpl(final State obj, final FsmRevisitor<? extends FinalStateOperation, ? extends InitialStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TransitionOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public String print() {
    String _name = this.obj.getName();
    String _plus = ("  State " + _name);
    String _plus_1 = (_plus + "\n");
    final Function1<Transition, String> _function = (Transition t) -> {
      return this.alg.$(t).print();
    };
    String _join = IterableExtensions.join(ListExtensions.<Transition, String>map(this.obj.getOutgoing(), _function), "\n");
    return (_plus_1 + _join);
  }
}
