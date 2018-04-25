package lua_exec.revisitor.operations;

import lua_exec.revisitor.operations.StatementOperation;
import lua_exec.revisitor.operations.Statement_FunctioncallOrAssignmentOperation;

@SuppressWarnings("all")
public interface ExpressionOperation extends Statement_FunctioncallOrAssignmentOperation, StatementOperation {
}
