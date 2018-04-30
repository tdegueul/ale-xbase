package evalboolexp.revisitor.operations.evalboolexp;

import boolExpEnv.runtime.Env;
import evalboolexp.revisitor.operations.evalboolexp.BinExpOperation;
import evalboolexp.revisitor.operations.evalboolexp.ExpOperation;

@SuppressWarnings("all")
public interface OrOperation extends BinExpOperation, ExpOperation {
  public abstract boolean eval(final Env env);
}
