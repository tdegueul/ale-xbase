package lua_exec.revisitor.operations.lua_exec;

import org.xtext.lua.semantics.model.Environment;

@SuppressWarnings("all")
public interface LastStatementOperation {
  public abstract void execute(final Environment c);
}
