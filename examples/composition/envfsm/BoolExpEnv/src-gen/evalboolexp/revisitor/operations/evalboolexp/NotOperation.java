package evalboolexp.revisitor.operations.evalboolexp;

import boolExpEnv.runtime.Env;
import evalboolexp.revisitor.operations.evalboolexp.ExpOperation;

@SuppressWarnings("all")
public interface NotOperation extends ExpOperation {
  public abstract boolean eval(final Env env);
}
