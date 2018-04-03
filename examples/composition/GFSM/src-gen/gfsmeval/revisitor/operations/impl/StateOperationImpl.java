package gfsmeval.revisitor.operations.impl;

import com.google.common.base.Objects;
import gfsm.State;
import gfsm.Transition;
import gfsm.dyn.Context;
import gfsm.revisitor.GfsmRevisitor;
import gfsmeval.revisitor.operations.GuardOperation;
import gfsmeval.revisitor.operations.MachineOperation;
import gfsmeval.revisitor.operations.StateOperation;
import gfsmeval.revisitor.operations.TransitionOperation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class StateOperationImpl implements StateOperation {
  private State obj;
  
  private GfsmRevisitor<StateOperation, GuardOperation, StateOperation, MachineOperation, StateOperation, TransitionOperation> alg;
  
  public StateOperationImpl(final State obj, final GfsmRevisitor<StateOperation, GuardOperation, StateOperation, MachineOperation, StateOperation, TransitionOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void step(final String event, final Context ctx) {
    ctx.visit(this.obj);
    String _name = this.obj.getName();
    String _plus = ("step into " + _name);
    InputOutput.<String>println(_plus);
    final Function1<Transition, Boolean> _function = (Transition t) -> {
      String _event = t.getEvent();
      return Boolean.valueOf(Objects.equal(_event, event));
    };
    final Transition next = IterableExtensions.<Transition>head(IterableExtensions.<Transition>filter(this.obj.getOutgoing(), _function));
    if ((next == null)) {
      String _name_1 = this.obj.getName();
      String _plus_1 = ("Locked in " + _name_1);
      String _plus_2 = (_plus_1 + " with ");
      String _plus_3 = (_plus_2 + event);
      throw new RuntimeException(_plus_3);
    }
    this.alg.$(next).fire(ctx);
  }
}
