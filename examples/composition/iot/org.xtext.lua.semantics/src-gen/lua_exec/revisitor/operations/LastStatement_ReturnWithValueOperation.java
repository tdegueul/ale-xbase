package lua_exec.revisitor.operations;

import lua_exec.revisitor.operations.LastStatementOperation;
import lua_exec.revisitor.operations.LastStatement_ReturnOperation;
import org.xtext.lua.semantics.model.Environment;

@SuppressWarnings("all")
public interface LastStatement_ReturnWithValueOperation extends LastStatement_ReturnOperation, LastStatementOperation {
  public abstract void execute(final Environment c);
}
