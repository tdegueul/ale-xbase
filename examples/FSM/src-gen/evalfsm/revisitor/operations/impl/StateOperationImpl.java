package evalfsm.revisitor.operations.impl;

import com.google.common.base.Objects;
import evalfsm.revisitor.operations.MachineOperation;
import evalfsm.revisitor.operations.StateOperation;
import evalfsm.revisitor.operations.TransitionOperation;
import fsm.State;
import fsm.Transition;
import fsm.dyn.Context;
import fsm.revisitor.FsmRevisitor;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class StateOperationImpl implements StateOperation {
  private State self;
  
  private FsmRevisitor<StateOperation, StateOperation, MachineOperation, StateOperation, TransitionOperation> alg;
  
  public StateOperationImpl(final State self, final FsmRevisitor<StateOperation, StateOperation, MachineOperation, StateOperation, TransitionOperation> alg) {
    this.self = self;
    this.alg = alg;
  }
  
  @Override
  public void step(final String event, final Context ctx) {
    ctx.visit(this.self);
    final Function1<Transition, Boolean> _function = (Transition t) -> {
      String _event = t.getEvent();
      return Boolean.valueOf(Objects.equal(_event, event));
    };
    final Transition next = IterableExtensions.<Transition>head(IterableExtensions.<Transition>filter(this.self.getOutgoing(), _function));
    if ((next == null)) {
      String _name = this.self.getName();
      String _plus = ("Locked in " + _name);
      String _plus_1 = (_plus + " with ");
      String _plus_2 = (_plus_1 + event);
      throw new RuntimeException(_plus_2);
    }
    this.alg.$(next).fire(ctx);
  }
}
