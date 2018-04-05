package evalsimpleal.revisitor.operations;

import evalsimpleal.revisitor.operations.StmtOperation;
import simpleALEnv.runtime.Env;

@SuppressWarnings("all")
public interface AssignOperation extends StmtOperation {
  public abstract void eval(final Env env);
}
