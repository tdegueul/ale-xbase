package iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec;

import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.IdlStmtOperation;
import simpleALEnv.runtime.Env;

@SuppressWarnings("all")
public interface IdlStmtBindBlockOperation extends IdlStmtOperation {
  public abstract void execute(final Env e);
}
