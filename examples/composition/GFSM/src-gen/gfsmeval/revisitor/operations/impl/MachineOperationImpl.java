package gfsmeval.revisitor.operations.impl;

import com.google.common.collect.Iterables;
import gfsm.InitialState;
import gfsm.Machine;
import gfsm.dyn.Context;
import gfsm.revisitor.GfsmRevisitor;
import gfsmeval.revisitor.operations.GuardOperation;
import gfsmeval.revisitor.operations.MachineOperation;
import gfsmeval.revisitor.operations.StateOperation;
import gfsmeval.revisitor.operations.TransitionOperation;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class MachineOperationImpl implements MachineOperation {
  private Machine obj;
  
  private GfsmRevisitor<StateOperation, GuardOperation, StateOperation, MachineOperation, StateOperation, TransitionOperation> alg;
  
  public MachineOperationImpl(final Machine obj, final GfsmRevisitor<StateOperation, GuardOperation, StateOperation, MachineOperation, StateOperation, TransitionOperation> alg) {
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
