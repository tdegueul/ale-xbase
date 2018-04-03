package gfsmprint.revisitor.operations.impl;

import gfsm.State;
import gfsm.Transition;
import gfsm.revisitor.GfsmRevisitor;
import gfsmprint.revisitor.operations.GuardOperation;
import gfsmprint.revisitor.operations.InitialStateOperation;
import gfsmprint.revisitor.operations.MachineOperation;
import gfsmprint.revisitor.operations.StateOperation;
import gfsmprint.revisitor.operations.TransitionOperation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class StateOperationImpl implements StateOperation {
  private State obj;
  
  private GfsmRevisitor<StateOperation, GuardOperation, InitialStateOperation, MachineOperation, StateOperation, TransitionOperation> alg;
  
  public StateOperationImpl(final State obj, final GfsmRevisitor<StateOperation, GuardOperation, InitialStateOperation, MachineOperation, StateOperation, TransitionOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public String print() {
    String _name = this.obj.getName();
    String _plus = ("  State " + _name);
    String _plus_1 = (_plus + "\n");
    final Function1<Transition, String> _function = (Transition it) -> {
      return this.alg.$(it).print();
    };
    String _join = IterableExtensions.join(ListExtensions.<Transition, String>map(this.obj.getOutgoing(), _function), "\n");
    return (_plus_1 + _join);
  }
}
