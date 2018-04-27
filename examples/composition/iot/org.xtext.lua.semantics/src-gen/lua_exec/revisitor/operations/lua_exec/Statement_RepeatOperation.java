package lua_exec.revisitor.operations.lua_exec;

import lua_exec.revisitor.operations.lua_exec.StatementOperation;
import org.xtext.lua.semantics.model.Environment;

@SuppressWarnings("all")
public interface Statement_RepeatOperation extends StatementOperation {
  public abstract void execute(final Environment c);
}
