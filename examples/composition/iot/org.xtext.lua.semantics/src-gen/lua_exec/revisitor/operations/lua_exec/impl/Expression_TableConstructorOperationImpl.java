package lua_exec.revisitor.operations.lua_exec.impl;

import lua.revisitor.LuaRevisitor;
import lua_exec.revisitor.operations.lua_exec.BlockOperation;
import lua_exec.revisitor.operations.lua_exec.ChunkOperation;
import lua_exec.revisitor.operations.lua_exec.ExpressionOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_AccessArrayOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_AccessMemberOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_AndOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_CallFunctionOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_CallMemberFunctionOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_ConcatenationOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_DivisionOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_EqualOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_ExponentiationOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_FalseOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_FunctionOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_InvertOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_LargerOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_Larger_EqualOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_LengthOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_MinusOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_ModuloOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_MultiplicationOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_NegateOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_NilOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_Not_EqualOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_NumberOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_OrOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_PlusOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_SmallerOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_Smaller_EqualOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_StringOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_TableConstructorOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_TrueOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_VarArgsOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_VariableNameOperation;
import lua_exec.revisitor.operations.lua_exec.FieldOperation;
import lua_exec.revisitor.operations.lua_exec.Field_AddEntryToTableOperation;
import lua_exec.revisitor.operations.lua_exec.Field_AddEntryToTable_BracketsOperation;
import lua_exec.revisitor.operations.lua_exec.Field_AppendEntryToTableOperation;
import lua_exec.revisitor.operations.lua_exec.FunctionOperation;
import lua_exec.revisitor.operations.lua_exec.Functioncall_ArgumentsOperation;
import lua_exec.revisitor.operations.lua_exec.LastStatementOperation;
import lua_exec.revisitor.operations.lua_exec.LastStatement_BreakOperation;
import lua_exec.revisitor.operations.lua_exec.LastStatement_ReturnOperation;
import lua_exec.revisitor.operations.lua_exec.LastStatement_ReturnWithValueOperation;
import lua_exec.revisitor.operations.lua_exec.StatementOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_AssignmentOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_BlockOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_CallFunctionOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_CallMemberFunctionOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_For_GenericOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_For_NumericOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_FunctioncallOrAssignmentOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_GlobalFunction_DeclarationOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_If_Then_ElseOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_If_Then_Else_ElseIfPartOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_LocalFunction_DeclarationOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_Local_Variable_DeclarationOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_RepeatOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_WhileOperation;
import lua_exec.revisitor.operations.lua_exec.impl.ExpressionOperationImpl;
import org.xtext.lua.lua.Expression_TableConstructor;
import org.xtext.lua.semantics.model.Environment;

@SuppressWarnings("all")
public class Expression_TableConstructorOperationImpl extends ExpressionOperationImpl implements Expression_TableConstructorOperation {
  private Expression_TableConstructor obj;
  
  private LuaRevisitor<? extends BlockOperation, ? extends ChunkOperation, ? extends ExpressionOperation, ? extends Expression_AccessArrayOperation, ? extends Expression_AccessMemberOperation, ? extends Expression_AndOperation, ? extends Expression_CallFunctionOperation, ? extends Expression_CallMemberFunctionOperation, ? extends Expression_ConcatenationOperation, ? extends Expression_DivisionOperation, ? extends Expression_EqualOperation, ? extends Expression_ExponentiationOperation, ? extends Expression_FalseOperation, ? extends Expression_FunctionOperation, ? extends Expression_InvertOperation, ? extends Expression_LargerOperation, ? extends Expression_Larger_EqualOperation, ? extends Expression_LengthOperation, ? extends Expression_MinusOperation, ? extends Expression_ModuloOperation, ? extends Expression_MultiplicationOperation, ? extends Expression_NegateOperation, ? extends Expression_NilOperation, ? extends Expression_Not_EqualOperation, ? extends Expression_NumberOperation, ? extends Expression_OrOperation, ? extends Expression_PlusOperation, ? extends Expression_SmallerOperation, ? extends Expression_Smaller_EqualOperation, ? extends Expression_StringOperation, ? extends Expression_TableConstructorOperation, ? extends Expression_TrueOperation, ? extends Expression_VarArgsOperation, ? extends Expression_VariableNameOperation, ? extends FieldOperation, ? extends Field_AddEntryToTableOperation, ? extends Field_AddEntryToTable_BracketsOperation, ? extends Field_AppendEntryToTableOperation, ? extends FunctionOperation, ? extends Functioncall_ArgumentsOperation, ? extends LastStatementOperation, ? extends LastStatement_BreakOperation, ? extends LastStatement_ReturnOperation, ? extends LastStatement_ReturnWithValueOperation, ? extends StatementOperation, ? extends Statement_AssignmentOperation, ? extends Statement_BlockOperation, ? extends Statement_CallFunctionOperation, ? extends Statement_CallMemberFunctionOperation, ? extends Statement_For_GenericOperation, ? extends Statement_For_NumericOperation, ? extends Statement_FunctioncallOrAssignmentOperation, ? extends Statement_GlobalFunction_DeclarationOperation, ? extends Statement_If_Then_ElseOperation, ? extends Statement_If_Then_Else_ElseIfPartOperation, ? extends Statement_LocalFunction_DeclarationOperation, ? extends Statement_Local_Variable_DeclarationOperation, ? extends Statement_RepeatOperation, ? extends Statement_WhileOperation> alg;
  
  public Expression_TableConstructorOperationImpl(final Expression_TableConstructor obj, final LuaRevisitor<? extends BlockOperation, ? extends ChunkOperation, ? extends ExpressionOperation, ? extends Expression_AccessArrayOperation, ? extends Expression_AccessMemberOperation, ? extends Expression_AndOperation, ? extends Expression_CallFunctionOperation, ? extends Expression_CallMemberFunctionOperation, ? extends Expression_ConcatenationOperation, ? extends Expression_DivisionOperation, ? extends Expression_EqualOperation, ? extends Expression_ExponentiationOperation, ? extends Expression_FalseOperation, ? extends Expression_FunctionOperation, ? extends Expression_InvertOperation, ? extends Expression_LargerOperation, ? extends Expression_Larger_EqualOperation, ? extends Expression_LengthOperation, ? extends Expression_MinusOperation, ? extends Expression_ModuloOperation, ? extends Expression_MultiplicationOperation, ? extends Expression_NegateOperation, ? extends Expression_NilOperation, ? extends Expression_Not_EqualOperation, ? extends Expression_NumberOperation, ? extends Expression_OrOperation, ? extends Expression_PlusOperation, ? extends Expression_SmallerOperation, ? extends Expression_Smaller_EqualOperation, ? extends Expression_StringOperation, ? extends Expression_TableConstructorOperation, ? extends Expression_TrueOperation, ? extends Expression_VarArgsOperation, ? extends Expression_VariableNameOperation, ? extends FieldOperation, ? extends Field_AddEntryToTableOperation, ? extends Field_AddEntryToTable_BracketsOperation, ? extends Field_AppendEntryToTableOperation, ? extends FunctionOperation, ? extends Functioncall_ArgumentsOperation, ? extends LastStatementOperation, ? extends LastStatement_BreakOperation, ? extends LastStatement_ReturnOperation, ? extends LastStatement_ReturnWithValueOperation, ? extends StatementOperation, ? extends Statement_AssignmentOperation, ? extends Statement_BlockOperation, ? extends Statement_CallFunctionOperation, ? extends Statement_CallMemberFunctionOperation, ? extends Statement_For_GenericOperation, ? extends Statement_For_NumericOperation, ? extends Statement_FunctioncallOrAssignmentOperation, ? extends Statement_GlobalFunction_DeclarationOperation, ? extends Statement_If_Then_ElseOperation, ? extends Statement_If_Then_Else_ElseIfPartOperation, ? extends Statement_LocalFunction_DeclarationOperation, ? extends Statement_Local_Variable_DeclarationOperation, ? extends Statement_RepeatOperation, ? extends Statement_WhileOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void execute(final Environment c) {
  }
}
