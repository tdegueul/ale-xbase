package lua_exec.revisitor.operations;

import lua_exec.revisitor.operations.StatementOperation;
import org.xtext.lua.semantics.model.Environment;

@SuppressWarnings("all")
public interface Statement_Local_Variable_DeclarationOperation extends StatementOperation {
  public abstract void execute(final Environment c);
}
