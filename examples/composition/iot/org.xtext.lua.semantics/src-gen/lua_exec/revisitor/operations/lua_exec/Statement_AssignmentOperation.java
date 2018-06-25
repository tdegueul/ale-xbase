package lua_exec.revisitor.operations.lua_exec;

import lua_exec.revisitor.operations.lua_exec.StatementOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_FunctioncallOrAssignmentOperation;
import org.xtext.lua.semantics.model.Environment;

@SuppressWarnings("all")
public interface Statement_AssignmentOperation extends Statement_FunctioncallOrAssignmentOperation, StatementOperation {
  public abstract void execute(final Environment c);
  
  public abstract String print();
  
  public abstract void init();
}
