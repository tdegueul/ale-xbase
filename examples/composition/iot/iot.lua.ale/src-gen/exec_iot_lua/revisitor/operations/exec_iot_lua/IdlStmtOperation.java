package exec_iot_lua.revisitor.operations.exec_iot_lua;

import org.xtext.lua.semantics.model.Environment;

@SuppressWarnings("all")
public interface IdlStmtOperation {
  public abstract void execute(final Environment e);
}
