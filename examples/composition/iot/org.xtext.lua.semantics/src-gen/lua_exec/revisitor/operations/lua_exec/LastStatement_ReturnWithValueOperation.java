package lua_exec.revisitor.operations.lua_exec;

import lua_exec.revisitor.operations.lua_exec.LastStatementOperation;
import lua_exec.revisitor.operations.lua_exec.LastStatement_ReturnOperation;
import org.xtext.lua.semantics.model.Environment;

@SuppressWarnings("all")
public interface LastStatement_ReturnWithValueOperation extends LastStatement_ReturnOperation, LastStatementOperation {
  public abstract void execute(final Environment c);
}
