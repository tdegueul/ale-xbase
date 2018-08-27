package evalfsm.revisitor.operations.evalfsm.impl;

import com.google.common.base.Objects;
import evalfsm.revisitor.operations.evalfsm.FinalStateOperation;
import evalfsm.revisitor.operations.evalfsm.InitialStateOperation;
import evalfsm.revisitor.operations.evalfsm.MachineOperation;
import evalfsm.revisitor.operations.evalfsm.StateOperation;
import evalfsm.revisitor.operations.evalfsm.TransitionOperation;
import fsm.State;
import fsm.Transition;
import fsm.dyn.Context;
import fsm.revisitor.FsmRevisitor;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class StateOperationImpl implements StateOperation {
  private State obj;
  
  private FsmRevisitor<? extends FinalStateOperation, ? extends InitialStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TransitionOperation> alg;
  
  public StateOperationImpl(final State obj, final FsmRevisitor<? extends FinalStateOperation, ? extends InitialStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TransitionOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void step(final String event, final Context ctx) {
    ctx.visit(this.obj);
    final Function1<Transition, Boolean> _function = (Transition t) -> {
      String _event = t.getEvent();
      return Boolean.valueOf(Objects.equal(_event, event));
    };
    final Transition next = IterableExtensions.<Transition>head(IterableExtensions.<Transition>filter(this.obj.getOutgoing(), _function));
    if ((next == null)) {
      String _name = this.obj.getName();
      String _plus = ("Locked in " + _name);
      String _plus_1 = (_plus + " with ");
      String _plus_2 = (_plus_1 + event);
      throw new RuntimeException(_plus_2);
    }
    this.alg.$(next).fire(ctx);
  }
}
