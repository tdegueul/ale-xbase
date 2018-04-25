package lua_exec.revisitor;

import lua.revisitor.LuaRevisitor;
import lua_exec.revisitor.operations.BlockOperation;
import lua_exec.revisitor.operations.ChunkOperation;
import lua_exec.revisitor.operations.ExpressionOperation;
import lua_exec.revisitor.operations.Expression_AccessArrayOperation;
import lua_exec.revisitor.operations.Expression_AccessMemberOperation;
import lua_exec.revisitor.operations.Expression_AndOperation;
import lua_exec.revisitor.operations.Expression_CallFunctionOperation;
import lua_exec.revisitor.operations.Expression_CallMemberFunctionOperation;
import lua_exec.revisitor.operations.Expression_ConcatenationOperation;
import lua_exec.revisitor.operations.Expression_DivisionOperation;
import lua_exec.revisitor.operations.Expression_EqualOperation;
import lua_exec.revisitor.operations.Expression_ExponentiationOperation;
import lua_exec.revisitor.operations.Expression_FalseOperation;
import lua_exec.revisitor.operations.Expression_FunctionOperation;
import lua_exec.revisitor.operations.Expression_InvertOperation;
import lua_exec.revisitor.operations.Expression_LargerOperation;
import lua_exec.revisitor.operations.Expression_Larger_EqualOperation;
import lua_exec.revisitor.operations.Expression_LengthOperation;
import lua_exec.revisitor.operations.Expression_MinusOperation;
import lua_exec.revisitor.operations.Expression_ModuloOperation;
import lua_exec.revisitor.operations.Expression_MultiplicationOperation;
import lua_exec.revisitor.operations.Expression_NegateOperation;
import lua_exec.revisitor.operations.Expression_NilOperation;
import lua_exec.revisitor.operations.Expression_Not_EqualOperation;
import lua_exec.revisitor.operations.Expression_NumberOperation;
import lua_exec.revisitor.operations.Expression_OrOperation;
import lua_exec.revisitor.operations.Expression_PlusOperation;
import lua_exec.revisitor.operations.Expression_SmallerOperation;
import lua_exec.revisitor.operations.Expression_Smaller_EqualOperation;
import lua_exec.revisitor.operations.Expression_StringOperation;
import lua_exec.revisitor.operations.Expression_TableConstructorOperation;
import lua_exec.revisitor.operations.Expression_TrueOperation;
import lua_exec.revisitor.operations.Expression_VarArgsOperation;
import lua_exec.revisitor.operations.Expression_VariableNameOperation;
import lua_exec.revisitor.operations.FieldOperation;
import lua_exec.revisitor.operations.Field_AddEntryToTableOperation;
import lua_exec.revisitor.operations.Field_AddEntryToTable_BracketsOperation;
import lua_exec.revisitor.operations.Field_AppendEntryToTableOperation;
import lua_exec.revisitor.operations.FunctionOperation;
import lua_exec.revisitor.operations.Functioncall_ArgumentsOperation;
import lua_exec.revisitor.operations.LastStatementOperation;
import lua_exec.revisitor.operations.LastStatement_BreakOperation;
import lua_exec.revisitor.operations.LastStatement_ReturnOperation;
import lua_exec.revisitor.operations.LastStatement_ReturnWithValueOperation;
import lua_exec.revisitor.operations.StatementOperation;
import lua_exec.revisitor.operations.Statement_AssignmentOperation;
import lua_exec.revisitor.operations.Statement_BlockOperation;
import lua_exec.revisitor.operations.Statement_CallFunctionOperation;
import lua_exec.revisitor.operations.Statement_CallMemberFunctionOperation;
import lua_exec.revisitor.operations.Statement_For_GenericOperation;
import lua_exec.revisitor.operations.Statement_For_NumericOperation;
import lua_exec.revisitor.operations.Statement_FunctioncallOrAssignmentOperation;
import lua_exec.revisitor.operations.Statement_GlobalFunction_DeclarationOperation;
import lua_exec.revisitor.operations.Statement_If_Then_ElseOperation;
import lua_exec.revisitor.operations.Statement_If_Then_Else_ElseIfPartOperation;
import lua_exec.revisitor.operations.Statement_LocalFunction_DeclarationOperation;
import lua_exec.revisitor.operations.Statement_Local_Variable_DeclarationOperation;
import lua_exec.revisitor.operations.Statement_RepeatOperation;
import lua_exec.revisitor.operations.Statement_WhileOperation;
import org.xtext.lua.lua.Block;
import org.xtext.lua.lua.Chunk;
import org.xtext.lua.lua.Expression;
import org.xtext.lua.lua.Expression_AccessArray;
import org.xtext.lua.lua.Expression_AccessMember;
import org.xtext.lua.lua.Expression_And;
import org.xtext.lua.lua.Expression_CallFunction;
import org.xtext.lua.lua.Expression_CallMemberFunction;
import org.xtext.lua.lua.Expression_Concatenation;
import org.xtext.lua.lua.Expression_Division;
import org.xtext.lua.lua.Expression_Equal;
import org.xtext.lua.lua.Expression_Exponentiation;
import org.xtext.lua.lua.Expression_False;
import org.xtext.lua.lua.Expression_Function;
import org.xtext.lua.lua.Expression_Invert;
import org.xtext.lua.lua.Expression_Larger;
import org.xtext.lua.lua.Expression_Larger_Equal;
import org.xtext.lua.lua.Expression_Length;
import org.xtext.lua.lua.Expression_Minus;
import org.xtext.lua.lua.Expression_Modulo;
import org.xtext.lua.lua.Expression_Multiplication;
import org.xtext.lua.lua.Expression_Negate;
import org.xtext.lua.lua.Expression_Nil;
import org.xtext.lua.lua.Expression_Not_Equal;
import org.xtext.lua.lua.Expression_Number;
import org.xtext.lua.lua.Expression_Or;
import org.xtext.lua.lua.Expression_Plus;
import org.xtext.lua.lua.Expression_Smaller;
import org.xtext.lua.lua.Expression_Smaller_Equal;
import org.xtext.lua.lua.Expression_String;
import org.xtext.lua.lua.Expression_TableConstructor;
import org.xtext.lua.lua.Expression_True;
import org.xtext.lua.lua.Expression_VarArgs;
import org.xtext.lua.lua.Expression_VariableName;
import org.xtext.lua.lua.Field;
import org.xtext.lua.lua.Field_AddEntryToTable;
import org.xtext.lua.lua.Field_AddEntryToTable_Brackets;
import org.xtext.lua.lua.Field_AppendEntryToTable;
import org.xtext.lua.lua.Function;
import org.xtext.lua.lua.Functioncall_Arguments;
import org.xtext.lua.lua.LastStatement;
import org.xtext.lua.lua.LastStatement_Break;
import org.xtext.lua.lua.LastStatement_Return;
import org.xtext.lua.lua.LastStatement_ReturnWithValue;
import org.xtext.lua.lua.Statement;
import org.xtext.lua.lua.Statement_Assignment;
import org.xtext.lua.lua.Statement_Block;
import org.xtext.lua.lua.Statement_CallFunction;
import org.xtext.lua.lua.Statement_CallMemberFunction;
import org.xtext.lua.lua.Statement_For_Generic;
import org.xtext.lua.lua.Statement_For_Numeric;
import org.xtext.lua.lua.Statement_FunctioncallOrAssignment;
import org.xtext.lua.lua.Statement_GlobalFunction_Declaration;
import org.xtext.lua.lua.Statement_If_Then_Else;
import org.xtext.lua.lua.Statement_If_Then_Else_ElseIfPart;
import org.xtext.lua.lua.Statement_LocalFunction_Declaration;
import org.xtext.lua.lua.Statement_Local_Variable_Declaration;
import org.xtext.lua.lua.Statement_Repeat;
import org.xtext.lua.lua.Statement_While;

@SuppressWarnings("all")
public interface Lua_execRevisitor extends LuaRevisitor<BlockOperation, ChunkOperation, ExpressionOperation, Expression_AccessArrayOperation, Expression_AccessMemberOperation, Expression_AndOperation, Expression_CallFunctionOperation, Expression_CallMemberFunctionOperation, Expression_ConcatenationOperation, Expression_DivisionOperation, Expression_EqualOperation, Expression_ExponentiationOperation, Expression_FalseOperation, Expression_FunctionOperation, Expression_InvertOperation, Expression_LargerOperation, Expression_Larger_EqualOperation, Expression_LengthOperation, Expression_MinusOperation, Expression_ModuloOperation, Expression_MultiplicationOperation, Expression_NegateOperation, Expression_NilOperation, Expression_Not_EqualOperation, Expression_NumberOperation, Expression_OrOperation, Expression_PlusOperation, Expression_SmallerOperation, Expression_Smaller_EqualOperation, Expression_StringOperation, Expression_TableConstructorOperation, Expression_TrueOperation, Expression_VarArgsOperation, Expression_VariableNameOperation, FieldOperation, Field_AddEntryToTableOperation, Field_AddEntryToTable_BracketsOperation, Field_AppendEntryToTableOperation, FunctionOperation, Functioncall_ArgumentsOperation, LastStatementOperation, LastStatement_BreakOperation, LastStatement_ReturnOperation, LastStatement_ReturnWithValueOperation, StatementOperation, Statement_AssignmentOperation, Statement_BlockOperation, Statement_CallFunctionOperation, Statement_CallMemberFunctionOperation, Statement_For_GenericOperation, Statement_For_NumericOperation, Statement_FunctioncallOrAssignmentOperation, Statement_GlobalFunction_DeclarationOperation, Statement_If_Then_ElseOperation, Statement_If_Then_Else_ElseIfPartOperation, Statement_LocalFunction_DeclarationOperation, Statement_Local_Variable_DeclarationOperation, Statement_RepeatOperation, Statement_WhileOperation> {
  @Override
  public default BlockOperation block(final Block it) {
    return new lua_exec.revisitor.operations.impl.BlockOperationImpl(it, this);
  }
  
  @Override
  public default ChunkOperation chunk(final Chunk it) {
    return new lua_exec.revisitor.operations.impl.ChunkOperationImpl(it, this);
  }
  
  @Override
  public default ExpressionOperation expression(final Expression it) {
    return new lua_exec.revisitor.operations.impl.ExpressionOperationImpl(it, this);
  }
  
  @Override
  public default Expression_AccessArrayOperation expression_AccessArray(final Expression_AccessArray it) {
    return new lua_exec.revisitor.operations.impl.Expression_AccessArrayOperationImpl(it, this);
  }
  
  @Override
  public default Expression_AccessMemberOperation expression_AccessMember(final Expression_AccessMember it) {
    return new lua_exec.revisitor.operations.impl.Expression_AccessMemberOperationImpl(it, this);
  }
  
  @Override
  public default Expression_AndOperation expression_And(final Expression_And it) {
    return new lua_exec.revisitor.operations.impl.Expression_AndOperationImpl(it, this);
  }
  
  @Override
  public default Expression_CallFunctionOperation expression_CallFunction(final Expression_CallFunction it) {
    return new lua_exec.revisitor.operations.impl.Expression_CallFunctionOperationImpl(it, this);
  }
  
  @Override
  public default Expression_CallMemberFunctionOperation expression_CallMemberFunction(final Expression_CallMemberFunction it) {
    return new lua_exec.revisitor.operations.impl.Expression_CallMemberFunctionOperationImpl(it, this);
  }
  
  @Override
  public default Expression_ConcatenationOperation expression_Concatenation(final Expression_Concatenation it) {
    return new lua_exec.revisitor.operations.impl.Expression_ConcatenationOperationImpl(it, this);
  }
  
  @Override
  public default Expression_DivisionOperation expression_Division(final Expression_Division it) {
    return new lua_exec.revisitor.operations.impl.Expression_DivisionOperationImpl(it, this);
  }
  
  @Override
  public default Expression_EqualOperation expression_Equal(final Expression_Equal it) {
    return new lua_exec.revisitor.operations.impl.Expression_EqualOperationImpl(it, this);
  }
  
  @Override
  public default Expression_ExponentiationOperation expression_Exponentiation(final Expression_Exponentiation it) {
    return new lua_exec.revisitor.operations.impl.Expression_ExponentiationOperationImpl(it, this);
  }
  
  @Override
  public default Expression_FalseOperation expression_False(final Expression_False it) {
    return new lua_exec.revisitor.operations.impl.Expression_FalseOperationImpl(it, this);
  }
  
  @Override
  public default Expression_FunctionOperation expression_Function(final Expression_Function it) {
    return new lua_exec.revisitor.operations.impl.Expression_FunctionOperationImpl(it, this);
  }
  
  @Override
  public default Expression_InvertOperation expression_Invert(final Expression_Invert it) {
    return new lua_exec.revisitor.operations.impl.Expression_InvertOperationImpl(it, this);
  }
  
  @Override
  public default Expression_LargerOperation expression_Larger(final Expression_Larger it) {
    return new lua_exec.revisitor.operations.impl.Expression_LargerOperationImpl(it, this);
  }
  
  @Override
  public default Expression_Larger_EqualOperation expression_Larger_Equal(final Expression_Larger_Equal it) {
    return new lua_exec.revisitor.operations.impl.Expression_Larger_EqualOperationImpl(it, this);
  }
  
  @Override
  public default Expression_LengthOperation expression_Length(final Expression_Length it) {
    return new lua_exec.revisitor.operations.impl.Expression_LengthOperationImpl(it, this);
  }
  
  @Override
  public default Expression_MinusOperation expression_Minus(final Expression_Minus it) {
    return new lua_exec.revisitor.operations.impl.Expression_MinusOperationImpl(it, this);
  }
  
  @Override
  public default Expression_ModuloOperation expression_Modulo(final Expression_Modulo it) {
    return new lua_exec.revisitor.operations.impl.Expression_ModuloOperationImpl(it, this);
  }
  
  @Override
  public default Expression_MultiplicationOperation expression_Multiplication(final Expression_Multiplication it) {
    return new lua_exec.revisitor.operations.impl.Expression_MultiplicationOperationImpl(it, this);
  }
  
  @Override
  public default Expression_NegateOperation expression_Negate(final Expression_Negate it) {
    return new lua_exec.revisitor.operations.impl.Expression_NegateOperationImpl(it, this);
  }
  
  @Override
  public default Expression_NilOperation expression_Nil(final Expression_Nil it) {
    return new lua_exec.revisitor.operations.impl.Expression_NilOperationImpl(it, this);
  }
  
  @Override
  public default Expression_Not_EqualOperation expression_Not_Equal(final Expression_Not_Equal it) {
    return new lua_exec.revisitor.operations.impl.Expression_Not_EqualOperationImpl(it, this);
  }
  
  @Override
  public default Expression_NumberOperation expression_Number(final Expression_Number it) {
    return new lua_exec.revisitor.operations.impl.Expression_NumberOperationImpl(it, this);
  }
  
  @Override
  public default Expression_OrOperation expression_Or(final Expression_Or it) {
    return new lua_exec.revisitor.operations.impl.Expression_OrOperationImpl(it, this);
  }
  
  @Override
  public default Expression_PlusOperation expression_Plus(final Expression_Plus it) {
    return new lua_exec.revisitor.operations.impl.Expression_PlusOperationImpl(it, this);
  }
  
  @Override
  public default Expression_SmallerOperation expression_Smaller(final Expression_Smaller it) {
    return new lua_exec.revisitor.operations.impl.Expression_SmallerOperationImpl(it, this);
  }
  
  @Override
  public default Expression_Smaller_EqualOperation expression_Smaller_Equal(final Expression_Smaller_Equal it) {
    return new lua_exec.revisitor.operations.impl.Expression_Smaller_EqualOperationImpl(it, this);
  }
  
  @Override
  public default Expression_StringOperation expression_String(final Expression_String it) {
    return new lua_exec.revisitor.operations.impl.Expression_StringOperationImpl(it, this);
  }
  
  @Override
  public default Expression_TableConstructorOperation expression_TableConstructor(final Expression_TableConstructor it) {
    return new lua_exec.revisitor.operations.impl.Expression_TableConstructorOperationImpl(it, this);
  }
  
  @Override
  public default Expression_TrueOperation expression_True(final Expression_True it) {
    return new lua_exec.revisitor.operations.impl.Expression_TrueOperationImpl(it, this);
  }
  
  @Override
  public default Expression_VarArgsOperation expression_VarArgs(final Expression_VarArgs it) {
    return new lua_exec.revisitor.operations.impl.Expression_VarArgsOperationImpl(it, this);
  }
  
  @Override
  public default Expression_VariableNameOperation expression_VariableName(final Expression_VariableName it) {
    return new lua_exec.revisitor.operations.impl.Expression_VariableNameOperationImpl(it, this);
  }
  
  @Override
  public default FieldOperation field(final Field it) {
    return new lua_exec.revisitor.operations.impl.FieldOperationImpl(it, this);
  }
  
  @Override
  public default Field_AddEntryToTableOperation field_AddEntryToTable(final Field_AddEntryToTable it) {
    return new lua_exec.revisitor.operations.impl.Field_AddEntryToTableOperationImpl(it, this);
  }
  
  @Override
  public default Field_AddEntryToTable_BracketsOperation field_AddEntryToTable_Brackets(final Field_AddEntryToTable_Brackets it) {
    return new lua_exec.revisitor.operations.impl.Field_AddEntryToTable_BracketsOperationImpl(it, this);
  }
  
  @Override
  public default Field_AppendEntryToTableOperation field_AppendEntryToTable(final Field_AppendEntryToTable it) {
    return new lua_exec.revisitor.operations.impl.Field_AppendEntryToTableOperationImpl(it, this);
  }
  
  @Override
  public default FunctionOperation function(final Function it) {
    return new lua_exec.revisitor.operations.impl.FunctionOperationImpl(it, this);
  }
  
  @Override
  public default Functioncall_ArgumentsOperation functioncall_Arguments(final Functioncall_Arguments it) {
    return new lua_exec.revisitor.operations.impl.Functioncall_ArgumentsOperationImpl(it, this);
  }
  
  @Override
  public default LastStatementOperation lastStatement(final LastStatement it) {
    return new lua_exec.revisitor.operations.impl.LastStatementOperationImpl(it, this);
  }
  
  @Override
  public default LastStatement_BreakOperation lastStatement_Break(final LastStatement_Break it) {
    return new lua_exec.revisitor.operations.impl.LastStatement_BreakOperationImpl(it, this);
  }
  
  @Override
  public default LastStatement_ReturnOperation lastStatement_Return(final LastStatement_Return it) {
    return new lua_exec.revisitor.operations.impl.LastStatement_ReturnOperationImpl(it, this);
  }
  
  @Override
  public default LastStatement_ReturnWithValueOperation lastStatement_ReturnWithValue(final LastStatement_ReturnWithValue it) {
    return new lua_exec.revisitor.operations.impl.LastStatement_ReturnWithValueOperationImpl(it, this);
  }
  
  @Override
  public default StatementOperation statement(final Statement it) {
    return new lua_exec.revisitor.operations.impl.StatementOperationImpl(it, this);
  }
  
  @Override
  public default Statement_AssignmentOperation statement_Assignment(final Statement_Assignment it) {
    return new lua_exec.revisitor.operations.impl.Statement_AssignmentOperationImpl(it, this);
  }
  
  @Override
  public default Statement_BlockOperation statement_Block(final Statement_Block it) {
    return new lua_exec.revisitor.operations.impl.Statement_BlockOperationImpl(it, this);
  }
  
  @Override
  public default Statement_CallFunctionOperation statement_CallFunction(final Statement_CallFunction it) {
    return new lua_exec.revisitor.operations.impl.Statement_CallFunctionOperationImpl(it, this);
  }
  
  @Override
  public default Statement_CallMemberFunctionOperation statement_CallMemberFunction(final Statement_CallMemberFunction it) {
    return new lua_exec.revisitor.operations.impl.Statement_CallMemberFunctionOperationImpl(it, this);
  }
  
  @Override
  public default Statement_For_GenericOperation statement_For_Generic(final Statement_For_Generic it) {
    return new lua_exec.revisitor.operations.impl.Statement_For_GenericOperationImpl(it, this);
  }
  
  @Override
  public default Statement_For_NumericOperation statement_For_Numeric(final Statement_For_Numeric it) {
    return new lua_exec.revisitor.operations.impl.Statement_For_NumericOperationImpl(it, this);
  }
  
  @Override
  public default Statement_FunctioncallOrAssignmentOperation statement_FunctioncallOrAssignment(final Statement_FunctioncallOrAssignment it) {
    return new lua_exec.revisitor.operations.impl.Statement_FunctioncallOrAssignmentOperationImpl(it, this);
  }
  
  @Override
  public default Statement_GlobalFunction_DeclarationOperation statement_GlobalFunction_Declaration(final Statement_GlobalFunction_Declaration it) {
    return new lua_exec.revisitor.operations.impl.Statement_GlobalFunction_DeclarationOperationImpl(it, this);
  }
  
  @Override
  public default Statement_If_Then_ElseOperation statement_If_Then_Else(final Statement_If_Then_Else it) {
    return new lua_exec.revisitor.operations.impl.Statement_If_Then_ElseOperationImpl(it, this);
  }
  
  @Override
  public default Statement_If_Then_Else_ElseIfPartOperation statement_If_Then_Else_ElseIfPart(final Statement_If_Then_Else_ElseIfPart it) {
    return new lua_exec.revisitor.operations.impl.Statement_If_Then_Else_ElseIfPartOperationImpl(it, this);
  }
  
  @Override
  public default Statement_LocalFunction_DeclarationOperation statement_LocalFunction_Declaration(final Statement_LocalFunction_Declaration it) {
    return new lua_exec.revisitor.operations.impl.Statement_LocalFunction_DeclarationOperationImpl(it, this);
  }
  
  @Override
  public default Statement_Local_Variable_DeclarationOperation statement_Local_Variable_Declaration(final Statement_Local_Variable_Declaration it) {
    return new lua_exec.revisitor.operations.impl.Statement_Local_Variable_DeclarationOperationImpl(it, this);
  }
  
  @Override
  public default Statement_RepeatOperation statement_Repeat(final Statement_Repeat it) {
    return new lua_exec.revisitor.operations.impl.Statement_RepeatOperationImpl(it, this);
  }
  
  @Override
  public default Statement_WhileOperation statement_While(final Statement_While it) {
    return new lua_exec.revisitor.operations.impl.Statement_WhileOperationImpl(it, this);
  }
}
