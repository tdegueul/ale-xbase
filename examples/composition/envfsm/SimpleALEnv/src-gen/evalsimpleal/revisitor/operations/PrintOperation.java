package evalsimpleal.revisitor.operations;

import evalsimpleal.revisitor.operations.StmtOperation;
import simpleALEnv.runtime.Env;

@SuppressWarnings("all")
public interface PrintOperation extends StmtOperation {
  public abstract void eval(final Env env);
}
