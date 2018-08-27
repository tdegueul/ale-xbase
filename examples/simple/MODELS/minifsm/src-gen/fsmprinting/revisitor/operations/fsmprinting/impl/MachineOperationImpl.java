package fsmprinting.revisitor.operations.fsmprinting.impl;

import fsmprinting.revisitor.operations.fsmprinting.FinalStateOperation;
import fsmprinting.revisitor.operations.fsmprinting.MachineOperation;
import fsmprinting.revisitor.operations.fsmprinting.StateOperation;
import fsmprinting.revisitor.operations.fsmprinting.TransitionOperation;
import minifsm.Machine;
import minifsm.State;
import minifsm.revisitor.MinifsmRevisitor;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class MachineOperationImpl implements MachineOperation {
  private Machine obj;
  
  private MinifsmRevisitor<? extends FinalStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TransitionOperation> alg;
  
  public MachineOperationImpl(final Machine obj, final MinifsmRevisitor<? extends FinalStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TransitionOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public String print() {
    final Function1<State, String> _function = (State s) -> {
      return this.alg.$(s).print();
    };
    return IterableExtensions.join(ListExtensions.<State, String>map(this.obj.getStates(), _function), "\n");
  }
}
