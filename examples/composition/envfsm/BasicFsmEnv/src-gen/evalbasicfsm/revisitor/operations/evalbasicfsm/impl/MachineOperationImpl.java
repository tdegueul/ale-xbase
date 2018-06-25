package evalbasicfsm.revisitor.operations.evalbasicfsm.impl;

import basicFsmEnv.InitialState;
import basicFsmEnv.Machine;
import basicFsmEnv.revisitor.BasicFsmEnvRevisitor;
import basicFsmEnv.runtime.Context;
import com.google.common.collect.Iterables;
import evalbasicfsm.revisitor.operations.evalbasicfsm.ActionOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.GuardOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.InitialStateOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.MachineOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.StateOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.TransOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.VarDeclOperation;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class MachineOperationImpl implements MachineOperation {
  private Machine obj;
  
  private BasicFsmEnvRevisitor<? extends ActionOperation, ? extends GuardOperation, ? extends InitialStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TransOperation, ? extends VarDeclOperation> alg;
  
  public MachineOperationImpl(final Machine obj, final BasicFsmEnvRevisitor<? extends ActionOperation, ? extends GuardOperation, ? extends InitialStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TransOperation, ? extends VarDeclOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void exec(final String[] events, final Context ctx) {
    final InitialState initial = IterableExtensions.<InitialState>head(Iterables.<InitialState>filter(this.obj.getStates(), InitialState.class));
    if ((initial == null)) {
      throw new RuntimeException("No initial state");
    }
    ctx.setCurrent(initial);
    final Consumer<String> _function = (String it) -> {
      this.alg.$(ctx.getCurrent()).step(it, ctx);
    };
    ((List<String>)Conversions.doWrapArray(events)).forEach(_function);
  }
}
