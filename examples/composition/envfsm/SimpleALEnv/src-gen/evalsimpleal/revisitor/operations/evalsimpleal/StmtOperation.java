package evalsimpleal.revisitor.operations.evalsimpleal;

import simpleALEnv.runtime.Env;

@SuppressWarnings("all")
public interface StmtOperation {
  public abstract void eval(final Env env);
}
