package lua_exec.revisitor.operations;

import lua_exec.revisitor.operations.ExpressionOperation;
import lua_exec.revisitor.operations.StatementOperation;
import lua_exec.revisitor.operations.Statement_FunctioncallOrAssignmentOperation;
import org.xtext.lua.semantics.model.Environment;

@SuppressWarnings("all")
public interface Expression_CallMemberFunctionOperation extends ExpressionOperation, Statement_FunctioncallOrAssignmentOperation, StatementOperation {
  public abstract void execute(final Environment c);
}
