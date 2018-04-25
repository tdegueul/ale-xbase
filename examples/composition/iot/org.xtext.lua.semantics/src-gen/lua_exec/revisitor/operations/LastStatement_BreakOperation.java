package lua_exec.revisitor.operations;

import lua_exec.revisitor.operations.LastStatementOperation;
import org.xtext.lua.semantics.model.Environment;

@SuppressWarnings("all")
public interface LastStatement_BreakOperation extends LastStatementOperation {
  public abstract void execute(final Environment c);
}
