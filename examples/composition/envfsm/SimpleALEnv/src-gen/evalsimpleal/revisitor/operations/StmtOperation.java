package evalsimpleal.revisitor.operations;

import simpleALEnv.runtime.Env;

@SuppressWarnings("all")
public interface StmtOperation {
  public abstract void eval(final Env env);
}
