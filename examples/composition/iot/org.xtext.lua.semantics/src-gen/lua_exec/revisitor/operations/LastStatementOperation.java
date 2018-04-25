package lua_exec.revisitor.operations;

import org.xtext.lua.semantics.model.Environment;

@SuppressWarnings("all")
public interface LastStatementOperation {
  public abstract void execute(final Environment c);
}
