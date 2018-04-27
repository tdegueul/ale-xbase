package lua_exec.revisitor.operations.lua_exec;

import lua_exec.revisitor.operations.lua_exec.ExpressionOperation;
import lua_exec.revisitor.operations.lua_exec.StatementOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_FunctioncallOrAssignmentOperation;
import org.xtext.lua.semantics.model.Environment;

@SuppressWarnings("all")
public interface Expression_EqualOperation extends ExpressionOperation, Statement_FunctioncallOrAssignmentOperation, StatementOperation {
  public abstract void execute(final Environment c);
}
