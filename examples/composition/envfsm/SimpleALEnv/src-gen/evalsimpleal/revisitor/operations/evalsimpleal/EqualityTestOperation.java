package evalsimpleal.revisitor.operations.evalsimpleal;

import simpleALEnv.runtime.Env;

@SuppressWarnings("all")
public interface EqualityTestOperation {
  public abstract boolean test(final Env env);
}
