package evalsimpleal.revisitor.operations;

import evalsimpleal.revisitor.operations.ArithOpOperation;
import evalsimpleal.revisitor.operations.ArithOperation;
import simpleALEnv.runtime.Env;

@SuppressWarnings("all")
public interface ArithMinusOperation extends ArithOpOperation, ArithOperation {
  public abstract int eval(final Env env);
}
