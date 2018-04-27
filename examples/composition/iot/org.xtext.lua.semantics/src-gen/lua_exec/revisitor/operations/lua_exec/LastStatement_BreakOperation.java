package lua_exec.revisitor.operations.lua_exec;

import lua_exec.revisitor.operations.lua_exec.LastStatementOperation;
import org.xtext.lua.semantics.model.Environment;

@SuppressWarnings("all")
public interface LastStatement_BreakOperation extends LastStatementOperation {
  public abstract void execute(final Environment c);
}
