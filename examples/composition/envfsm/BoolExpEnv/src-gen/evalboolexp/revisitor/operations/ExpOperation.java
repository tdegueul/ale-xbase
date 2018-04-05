package evalboolexp.revisitor.operations;

import boolExpEnv.runtime.Env;

@SuppressWarnings("all")
public interface ExpOperation {
  public abstract boolean eval(final Env env);
}
