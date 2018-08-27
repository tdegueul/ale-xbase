package evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.impl;

import basicFsmEnv.InitialState;
import basicFsmEnv.runtime.Context;
import com.google.common.collect.Iterables;
import evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.ActionOperation;
import evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.CompositeStateOperation;
import evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.GuardOperation;
import evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.InitialStateOperation;
import evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.MachineOperation;
import evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.RegionOperation;
import evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.StateOperation;
import evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.TransOperation;
import evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.VarDeclOperation;
import evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.impl.StateOperationImpl;
import hierarchicalFsmEnv.CompositeState;
import hierarchicalFsmEnv.Region;
import hierarchicalFsmEnv.revisitor.HierarchicalFsmEnvRevisitor;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class CompositeStateOperationImpl extends StateOperationImpl implements CompositeStateOperation {
  private CompositeState obj;
  
  private HierarchicalFsmEnvRevisitor<? extends ActionOperation, ? extends CompositeStateOperation, ? extends GuardOperation, ? extends InitialStateOperation, ? extends MachineOperation, ? extends RegionOperation, ? extends StateOperation, ? extends TransOperation, ? extends VarDeclOperation> alg;
  
  public CompositeStateOperationImpl(final CompositeState obj, final HierarchicalFsmEnvRevisitor<? extends ActionOperation, ? extends CompositeStateOperation, ? extends GuardOperation, ? extends InitialStateOperation, ? extends MachineOperation, ? extends RegionOperation, ? extends StateOperation, ? extends TransOperation, ? extends VarDeclOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void step(final String event, final Context ctx) {
    final Function1<Region, Iterable<InitialState>> _function = (Region it) -> {
      return Iterables.<InitialState>filter(it.getStates(), InitialState.class);
    };
    final InitialState initialState = IterableExtensions.<InitialState>head(Iterables.<InitialState>concat(ListExtensions.<Region, Iterable<InitialState>>map(this.obj.getRegions(), _function)));
    if ((initialState == null)) {
      throw new RuntimeException("No initial state");
    }
    ctx.setCurrent(initialState);
    this.alg.$(ctx.getCurrent()).step(event, ctx);
  }
}
