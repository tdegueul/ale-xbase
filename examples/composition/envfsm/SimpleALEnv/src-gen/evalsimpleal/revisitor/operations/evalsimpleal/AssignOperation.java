package evalsimpleal.revisitor.operations.evalsimpleal;

import evalsimpleal.revisitor.operations.evalsimpleal.StmtOperation;
import simpleALEnv.runtime.Env;

@SuppressWarnings("all")
public interface AssignOperation extends StmtOperation {
  public abstract void eval(final Env env);
}
