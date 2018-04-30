package evalboolexp.revisitor.operations.evalboolexp;

import boolExpEnv.runtime.Env;
import evalboolexp.revisitor.operations.evalboolexp.ExpOperation;
import evalboolexp.revisitor.operations.evalboolexp.LitOperation;

@SuppressWarnings("all")
public interface FalsOperation extends LitOperation, ExpOperation {
  public abstract boolean eval(final Env env);
}
