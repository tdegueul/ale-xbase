package printfsm.revisitor.operations.printfsm.impl;

import fsm.Machine;
import fsm.State;
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
public class MachineOperationImpl implements MachineOperation {
  private Machine obj;
  
  private FsmRevisitor<? extends FinalStateOperation, ? extends InitialStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TransitionOperation> alg;
  
  public MachineOperationImpl(final Machine obj, final FsmRevisitor<? extends FinalStateOperation, ? extends InitialStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TransitionOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public String print() {
    String _name = this.obj.getName();
    String _plus = ("Machine " + _name);
    String _plus_1 = (_plus + "\n");
    final Function1<State, String> _function = (State s) -> {
      return this.alg.$(s).print();
    };
    String _join = IterableExtensions.join(ListExtensions.<State, String>map(this.obj.getStates(), _function), "\n");
    return (_plus_1 + _join);
  }
}
