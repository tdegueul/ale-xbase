package evalfsm.revisitor.operations.evalfsm.impl;

import com.google.common.collect.Iterables;
import evalfsm.revisitor.operations.evalfsm.FinalStateOperation;
import evalfsm.revisitor.operations.evalfsm.InitialStateOperation;
import evalfsm.revisitor.operations.evalfsm.MachineOperation;
import evalfsm.revisitor.operations.evalfsm.StateOperation;
import evalfsm.revisitor.operations.evalfsm.TransitionOperation;
import fsm.InitialState;
import fsm.Machine;
import fsm.dyn.Context;
import fsm.revisitor.FsmRevisitor;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class MachineOperationImpl implements MachineOperation {
  private Machine obj;
  
  private FsmRevisitor<? extends FinalStateOperation, ? extends InitialStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TransitionOperation> alg;
  
  public MachineOperationImpl(final Machine obj, final FsmRevisitor<? extends FinalStateOperation, ? extends InitialStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TransitionOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void execute(final String[] events, final Context ctx) {
    final InitialState initial = IterableExtensions.<InitialState>head(Iterables.<InitialState>filter(this.obj.getStates(), InitialState.class));
    if ((initial == null)) {
      throw new RuntimeException("No initial state");
    }
    ctx.setCurrent(initial);
    final Consumer<String> _function = (String e) -> {
      this.alg.$(ctx.getCurrent()).step(e, ctx);
    };
    ((List<String>)Conversions.doWrapArray(events)).forEach(_function);
  }
}
