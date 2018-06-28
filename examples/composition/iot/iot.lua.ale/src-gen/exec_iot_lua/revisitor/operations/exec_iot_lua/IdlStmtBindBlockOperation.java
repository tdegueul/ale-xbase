package exec_iot_lua.revisitor.operations.exec_iot_lua;

import exec_iot_lua.revisitor.operations.exec_iot_lua.IdlStmtOperation;
import org.xtext.lua.semantics.model.Environment;

@SuppressWarnings("all")
public interface IdlStmtBindBlockOperation extends IdlStmtOperation {
  public abstract void execute(final Environment e);
}
