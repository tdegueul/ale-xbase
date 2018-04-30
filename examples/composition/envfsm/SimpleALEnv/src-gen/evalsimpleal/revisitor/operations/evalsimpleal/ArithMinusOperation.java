package evalsimpleal.revisitor.operations.evalsimpleal;

import evalsimpleal.revisitor.operations.evalsimpleal.ArithOpOperation;
import evalsimpleal.revisitor.operations.evalsimpleal.ArithOperation;
import simpleALEnv.runtime.Env;

@SuppressWarnings("all")
public interface ArithMinusOperation extends ArithOpOperation, ArithOperation {
  public abstract int eval(final Env env);
}
