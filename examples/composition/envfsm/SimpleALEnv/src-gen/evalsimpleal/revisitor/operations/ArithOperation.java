package evalsimpleal.revisitor.operations;

import simpleALEnv.runtime.Env;

@SuppressWarnings("all")
public interface ArithOperation {
  public abstract int eval(final Env env);
}
