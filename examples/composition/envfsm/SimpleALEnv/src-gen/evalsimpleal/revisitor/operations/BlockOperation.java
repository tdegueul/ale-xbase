package evalsimpleal.revisitor.operations;

import simpleALEnv.runtime.Env;

@SuppressWarnings("all")
public interface BlockOperation {
  public abstract void eval(final Env env);
}
