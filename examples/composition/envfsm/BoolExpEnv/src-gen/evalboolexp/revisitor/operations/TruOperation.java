package evalboolexp.revisitor.operations;

import boolExpEnv.runtime.Env;
import evalboolexp.revisitor.operations.ExpOperation;
import evalboolexp.revisitor.operations.LitOperation;

@SuppressWarnings("all")
public interface TruOperation extends LitOperation, ExpOperation {
  public abstract boolean eval(final Env env);
}
