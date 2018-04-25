package lua.revisitor;

public interface LuaRevisitor<Lua__BlockT extends Lua__ChunkT, Lua__ChunkT, Lua__ExpressionT extends Lua__Statement_FunctioncallOrAssignmentT, Lua__Expression_AccessArrayT extends Lua__ExpressionT, Lua__Expression_AccessMemberT extends Lua__ExpressionT, Lua__Expression_AndT extends Lua__ExpressionT, Lua__Expression_CallFunctionT extends Lua__ExpressionT, Lua__Expression_CallMemberFunctionT extends Lua__ExpressionT, Lua__Expression_ConcatenationT extends Lua__ExpressionT, Lua__Expression_DivisionT extends Lua__ExpressionT, Lua__Expression_EqualT extends Lua__ExpressionT, Lua__Expression_ExponentiationT extends Lua__ExpressionT, Lua__Expression_FalseT extends Lua__ExpressionT, Lua__Expression_FunctionT extends Lua__ExpressionT, Lua__Expression_InvertT extends Lua__ExpressionT, Lua__Expression_LargerT extends Lua__ExpressionT, Lua__Expression_Larger_EqualT extends Lua__ExpressionT, Lua__Expression_LengthT extends Lua__ExpressionT, Lua__Expression_MinusT extends Lua__ExpressionT, Lua__Expression_ModuloT extends Lua__ExpressionT, Lua__Expression_MultiplicationT extends Lua__ExpressionT, Lua__Expression_NegateT extends Lua__ExpressionT, Lua__Expression_NilT extends Lua__ExpressionT, Lua__Expression_Not_EqualT extends Lua__ExpressionT, Lua__Expression_NumberT extends Lua__ExpressionT, Lua__Expression_OrT extends Lua__ExpressionT, Lua__Expression_PlusT extends Lua__ExpressionT, Lua__Expression_SmallerT extends Lua__ExpressionT, Lua__Expression_Smaller_EqualT extends Lua__ExpressionT, Lua__Expression_StringT extends Lua__ExpressionT, Lua__Expression_TableConstructorT extends Lua__ExpressionT, Lua__Expression_TrueT extends Lua__ExpressionT, Lua__Expression_VarArgsT extends Lua__ExpressionT, Lua__Expression_VariableNameT extends Lua__ExpressionT, Lua__FieldT, Lua__Field_AddEntryToTableT extends Lua__FieldT, Lua__Field_AddEntryToTable_BracketsT extends Lua__FieldT, Lua__Field_AppendEntryToTableT extends Lua__FieldT, Lua__FunctionT, Lua__Functioncall_ArgumentsT, Lua__LastStatementT, Lua__LastStatement_BreakT extends Lua__LastStatementT, Lua__LastStatement_ReturnT extends Lua__LastStatementT, Lua__LastStatement_ReturnWithValueT extends Lua__LastStatement_ReturnT, Lua__StatementT, Lua__Statement_AssignmentT extends Lua__Statement_FunctioncallOrAssignmentT, Lua__Statement_BlockT extends Lua__StatementT, Lua__Statement_CallFunctionT extends Lua__Statement_FunctioncallOrAssignmentT, Lua__Statement_CallMemberFunctionT extends Lua__Statement_FunctioncallOrAssignmentT, Lua__Statement_For_GenericT extends Lua__StatementT, Lua__Statement_For_NumericT extends Lua__StatementT, Lua__Statement_FunctioncallOrAssignmentT extends Lua__StatementT, Lua__Statement_GlobalFunction_DeclarationT extends Lua__StatementT, Lua__Statement_If_Then_ElseT extends Lua__StatementT, Lua__Statement_If_Then_Else_ElseIfPartT, Lua__Statement_LocalFunction_DeclarationT extends Lua__StatementT, Lua__Statement_Local_Variable_DeclarationT extends Lua__StatementT, Lua__Statement_RepeatT extends Lua__StatementT, Lua__Statement_WhileT extends Lua__StatementT> {
	Lua__BlockT block(final org.xtext.lua.lua.Block it);
	Lua__ChunkT chunk(final org.xtext.lua.lua.Chunk it);
	Lua__ExpressionT expression(final org.xtext.lua.lua.Expression it);
	Lua__Expression_AccessArrayT expression_AccessArray(final org.xtext.lua.lua.Expression_AccessArray it);
	Lua__Expression_AccessMemberT expression_AccessMember(final org.xtext.lua.lua.Expression_AccessMember it);
	Lua__Expression_AndT expression_And(final org.xtext.lua.lua.Expression_And it);
	Lua__Expression_CallFunctionT expression_CallFunction(final org.xtext.lua.lua.Expression_CallFunction it);
	Lua__Expression_CallMemberFunctionT expression_CallMemberFunction(final org.xtext.lua.lua.Expression_CallMemberFunction it);
	Lua__Expression_ConcatenationT expression_Concatenation(final org.xtext.lua.lua.Expression_Concatenation it);
	Lua__Expression_DivisionT expression_Division(final org.xtext.lua.lua.Expression_Division it);
	Lua__Expression_EqualT expression_Equal(final org.xtext.lua.lua.Expression_Equal it);
	Lua__Expression_ExponentiationT expression_Exponentiation(final org.xtext.lua.lua.Expression_Exponentiation it);
	Lua__Expression_FalseT expression_False(final org.xtext.lua.lua.Expression_False it);
	Lua__Expression_FunctionT expression_Function(final org.xtext.lua.lua.Expression_Function it);
	Lua__Expression_InvertT expression_Invert(final org.xtext.lua.lua.Expression_Invert it);
	Lua__Expression_LargerT expression_Larger(final org.xtext.lua.lua.Expression_Larger it);
	Lua__Expression_Larger_EqualT expression_Larger_Equal(final org.xtext.lua.lua.Expression_Larger_Equal it);
	Lua__Expression_LengthT expression_Length(final org.xtext.lua.lua.Expression_Length it);
	Lua__Expression_MinusT expression_Minus(final org.xtext.lua.lua.Expression_Minus it);
	Lua__Expression_ModuloT expression_Modulo(final org.xtext.lua.lua.Expression_Modulo it);
	Lua__Expression_MultiplicationT expression_Multiplication(final org.xtext.lua.lua.Expression_Multiplication it);
	Lua__Expression_NegateT expression_Negate(final org.xtext.lua.lua.Expression_Negate it);
	Lua__Expression_NilT expression_Nil(final org.xtext.lua.lua.Expression_Nil it);
	Lua__Expression_Not_EqualT expression_Not_Equal(final org.xtext.lua.lua.Expression_Not_Equal it);
	Lua__Expression_NumberT expression_Number(final org.xtext.lua.lua.Expression_Number it);
	Lua__Expression_OrT expression_Or(final org.xtext.lua.lua.Expression_Or it);
	Lua__Expression_PlusT expression_Plus(final org.xtext.lua.lua.Expression_Plus it);
	Lua__Expression_SmallerT expression_Smaller(final org.xtext.lua.lua.Expression_Smaller it);
	Lua__Expression_Smaller_EqualT expression_Smaller_Equal(final org.xtext.lua.lua.Expression_Smaller_Equal it);
	Lua__Expression_StringT expression_String(final org.xtext.lua.lua.Expression_String it);
	Lua__Expression_TableConstructorT expression_TableConstructor(final org.xtext.lua.lua.Expression_TableConstructor it);
	Lua__Expression_TrueT expression_True(final org.xtext.lua.lua.Expression_True it);
	Lua__Expression_VarArgsT expression_VarArgs(final org.xtext.lua.lua.Expression_VarArgs it);
	Lua__Expression_VariableNameT expression_VariableName(final org.xtext.lua.lua.Expression_VariableName it);
	Lua__FieldT field(final org.xtext.lua.lua.Field it);
	Lua__Field_AddEntryToTableT field_AddEntryToTable(final org.xtext.lua.lua.Field_AddEntryToTable it);
	Lua__Field_AddEntryToTable_BracketsT field_AddEntryToTable_Brackets(final org.xtext.lua.lua.Field_AddEntryToTable_Brackets it);
	Lua__Field_AppendEntryToTableT field_AppendEntryToTable(final org.xtext.lua.lua.Field_AppendEntryToTable it);
	Lua__FunctionT function(final org.xtext.lua.lua.Function it);
	Lua__Functioncall_ArgumentsT functioncall_Arguments(final org.xtext.lua.lua.Functioncall_Arguments it);
	Lua__LastStatementT lastStatement(final org.xtext.lua.lua.LastStatement it);
	Lua__LastStatement_BreakT lastStatement_Break(final org.xtext.lua.lua.LastStatement_Break it);
	Lua__LastStatement_ReturnT lastStatement_Return(final org.xtext.lua.lua.LastStatement_Return it);
	Lua__LastStatement_ReturnWithValueT lastStatement_ReturnWithValue(final org.xtext.lua.lua.LastStatement_ReturnWithValue it);
	Lua__StatementT statement(final org.xtext.lua.lua.Statement it);
	Lua__Statement_AssignmentT statement_Assignment(final org.xtext.lua.lua.Statement_Assignment it);
	Lua__Statement_BlockT statement_Block(final org.xtext.lua.lua.Statement_Block it);
	Lua__Statement_CallFunctionT statement_CallFunction(final org.xtext.lua.lua.Statement_CallFunction it);
	Lua__Statement_CallMemberFunctionT statement_CallMemberFunction(final org.xtext.lua.lua.Statement_CallMemberFunction it);
	Lua__Statement_For_GenericT statement_For_Generic(final org.xtext.lua.lua.Statement_For_Generic it);
	Lua__Statement_For_NumericT statement_For_Numeric(final org.xtext.lua.lua.Statement_For_Numeric it);
	Lua__Statement_FunctioncallOrAssignmentT statement_FunctioncallOrAssignment(final org.xtext.lua.lua.Statement_FunctioncallOrAssignment it);
	Lua__Statement_GlobalFunction_DeclarationT statement_GlobalFunction_Declaration(final org.xtext.lua.lua.Statement_GlobalFunction_Declaration it);
	Lua__Statement_If_Then_ElseT statement_If_Then_Else(final org.xtext.lua.lua.Statement_If_Then_Else it);
	Lua__Statement_If_Then_Else_ElseIfPartT statement_If_Then_Else_ElseIfPart(final org.xtext.lua.lua.Statement_If_Then_Else_ElseIfPart it);
	Lua__Statement_LocalFunction_DeclarationT statement_LocalFunction_Declaration(final org.xtext.lua.lua.Statement_LocalFunction_Declaration it);
	Lua__Statement_Local_Variable_DeclarationT statement_Local_Variable_Declaration(final org.xtext.lua.lua.Statement_Local_Variable_Declaration it);
	Lua__Statement_RepeatT statement_Repeat(final org.xtext.lua.lua.Statement_Repeat it);
	Lua__Statement_WhileT statement_While(final org.xtext.lua.lua.Statement_While it);

	default Lua__BlockT $(final org.xtext.lua.lua.Block it) {
		return block(it);
	}
	default Lua__ChunkT $(final org.xtext.lua.lua.Chunk it) {
		if (it.getClass() == org.xtext.lua.lua.impl.BlockImpl.class)
			return block((org.xtext.lua.lua.Block) it);
		return chunk(it);
	}
	default Lua__ExpressionT $(final org.xtext.lua.lua.Expression it) {
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_AccessArrayImpl.class)
			return expression_AccessArray((org.xtext.lua.lua.Expression_AccessArray) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_AccessMemberImpl.class)
			return expression_AccessMember((org.xtext.lua.lua.Expression_AccessMember) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_AndImpl.class)
			return expression_And((org.xtext.lua.lua.Expression_And) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_CallFunctionImpl.class)
			return expression_CallFunction((org.xtext.lua.lua.Expression_CallFunction) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_CallMemberFunctionImpl.class)
			return expression_CallMemberFunction((org.xtext.lua.lua.Expression_CallMemberFunction) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_ConcatenationImpl.class)
			return expression_Concatenation((org.xtext.lua.lua.Expression_Concatenation) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_DivisionImpl.class)
			return expression_Division((org.xtext.lua.lua.Expression_Division) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_EqualImpl.class)
			return expression_Equal((org.xtext.lua.lua.Expression_Equal) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_ExponentiationImpl.class)
			return expression_Exponentiation((org.xtext.lua.lua.Expression_Exponentiation) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_FalseImpl.class)
			return expression_False((org.xtext.lua.lua.Expression_False) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_FunctionImpl.class)
			return expression_Function((org.xtext.lua.lua.Expression_Function) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_InvertImpl.class)
			return expression_Invert((org.xtext.lua.lua.Expression_Invert) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_LargerImpl.class)
			return expression_Larger((org.xtext.lua.lua.Expression_Larger) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_Larger_EqualImpl.class)
			return expression_Larger_Equal((org.xtext.lua.lua.Expression_Larger_Equal) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_LengthImpl.class)
			return expression_Length((org.xtext.lua.lua.Expression_Length) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_MinusImpl.class)
			return expression_Minus((org.xtext.lua.lua.Expression_Minus) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_ModuloImpl.class)
			return expression_Modulo((org.xtext.lua.lua.Expression_Modulo) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_MultiplicationImpl.class)
			return expression_Multiplication((org.xtext.lua.lua.Expression_Multiplication) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_NegateImpl.class)
			return expression_Negate((org.xtext.lua.lua.Expression_Negate) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_NilImpl.class)
			return expression_Nil((org.xtext.lua.lua.Expression_Nil) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_Not_EqualImpl.class)
			return expression_Not_Equal((org.xtext.lua.lua.Expression_Not_Equal) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_NumberImpl.class)
			return expression_Number((org.xtext.lua.lua.Expression_Number) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_OrImpl.class)
			return expression_Or((org.xtext.lua.lua.Expression_Or) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_PlusImpl.class)
			return expression_Plus((org.xtext.lua.lua.Expression_Plus) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_SmallerImpl.class)
			return expression_Smaller((org.xtext.lua.lua.Expression_Smaller) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_Smaller_EqualImpl.class)
			return expression_Smaller_Equal((org.xtext.lua.lua.Expression_Smaller_Equal) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_StringImpl.class)
			return expression_String((org.xtext.lua.lua.Expression_String) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_TableConstructorImpl.class)
			return expression_TableConstructor((org.xtext.lua.lua.Expression_TableConstructor) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_TrueImpl.class)
			return expression_True((org.xtext.lua.lua.Expression_True) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_VarArgsImpl.class)
			return expression_VarArgs((org.xtext.lua.lua.Expression_VarArgs) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_VariableNameImpl.class)
			return expression_VariableName((org.xtext.lua.lua.Expression_VariableName) it);
		return expression(it);
	}
	default Lua__Expression_AccessArrayT $(final org.xtext.lua.lua.Expression_AccessArray it) {
		return expression_AccessArray(it);
	}
	default Lua__Expression_AccessMemberT $(final org.xtext.lua.lua.Expression_AccessMember it) {
		return expression_AccessMember(it);
	}
	default Lua__Expression_AndT $(final org.xtext.lua.lua.Expression_And it) {
		return expression_And(it);
	}
	default Lua__Expression_CallFunctionT $(final org.xtext.lua.lua.Expression_CallFunction it) {
		return expression_CallFunction(it);
	}
	default Lua__Expression_CallMemberFunctionT $(final org.xtext.lua.lua.Expression_CallMemberFunction it) {
		return expression_CallMemberFunction(it);
	}
	default Lua__Expression_ConcatenationT $(final org.xtext.lua.lua.Expression_Concatenation it) {
		return expression_Concatenation(it);
	}
	default Lua__Expression_DivisionT $(final org.xtext.lua.lua.Expression_Division it) {
		return expression_Division(it);
	}
	default Lua__Expression_EqualT $(final org.xtext.lua.lua.Expression_Equal it) {
		return expression_Equal(it);
	}
	default Lua__Expression_ExponentiationT $(final org.xtext.lua.lua.Expression_Exponentiation it) {
		return expression_Exponentiation(it);
	}
	default Lua__Expression_FalseT $(final org.xtext.lua.lua.Expression_False it) {
		return expression_False(it);
	}
	default Lua__Expression_FunctionT $(final org.xtext.lua.lua.Expression_Function it) {
		return expression_Function(it);
	}
	default Lua__Expression_InvertT $(final org.xtext.lua.lua.Expression_Invert it) {
		return expression_Invert(it);
	}
	default Lua__Expression_LargerT $(final org.xtext.lua.lua.Expression_Larger it) {
		return expression_Larger(it);
	}
	default Lua__Expression_Larger_EqualT $(final org.xtext.lua.lua.Expression_Larger_Equal it) {
		return expression_Larger_Equal(it);
	}
	default Lua__Expression_LengthT $(final org.xtext.lua.lua.Expression_Length it) {
		return expression_Length(it);
	}
	default Lua__Expression_MinusT $(final org.xtext.lua.lua.Expression_Minus it) {
		return expression_Minus(it);
	}
	default Lua__Expression_ModuloT $(final org.xtext.lua.lua.Expression_Modulo it) {
		return expression_Modulo(it);
	}
	default Lua__Expression_MultiplicationT $(final org.xtext.lua.lua.Expression_Multiplication it) {
		return expression_Multiplication(it);
	}
	default Lua__Expression_NegateT $(final org.xtext.lua.lua.Expression_Negate it) {
		return expression_Negate(it);
	}
	default Lua__Expression_NilT $(final org.xtext.lua.lua.Expression_Nil it) {
		return expression_Nil(it);
	}
	default Lua__Expression_Not_EqualT $(final org.xtext.lua.lua.Expression_Not_Equal it) {
		return expression_Not_Equal(it);
	}
	default Lua__Expression_NumberT $(final org.xtext.lua.lua.Expression_Number it) {
		return expression_Number(it);
	}
	default Lua__Expression_OrT $(final org.xtext.lua.lua.Expression_Or it) {
		return expression_Or(it);
	}
	default Lua__Expression_PlusT $(final org.xtext.lua.lua.Expression_Plus it) {
		return expression_Plus(it);
	}
	default Lua__Expression_SmallerT $(final org.xtext.lua.lua.Expression_Smaller it) {
		return expression_Smaller(it);
	}
	default Lua__Expression_Smaller_EqualT $(final org.xtext.lua.lua.Expression_Smaller_Equal it) {
		return expression_Smaller_Equal(it);
	}
	default Lua__Expression_StringT $(final org.xtext.lua.lua.Expression_String it) {
		return expression_String(it);
	}
	default Lua__Expression_TableConstructorT $(final org.xtext.lua.lua.Expression_TableConstructor it) {
		return expression_TableConstructor(it);
	}
	default Lua__Expression_TrueT $(final org.xtext.lua.lua.Expression_True it) {
		return expression_True(it);
	}
	default Lua__Expression_VarArgsT $(final org.xtext.lua.lua.Expression_VarArgs it) {
		return expression_VarArgs(it);
	}
	default Lua__Expression_VariableNameT $(final org.xtext.lua.lua.Expression_VariableName it) {
		return expression_VariableName(it);
	}
	default Lua__FieldT $(final org.xtext.lua.lua.Field it) {
		if (it.getClass() == org.xtext.lua.lua.impl.Field_AddEntryToTableImpl.class)
			return field_AddEntryToTable((org.xtext.lua.lua.Field_AddEntryToTable) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Field_AddEntryToTable_BracketsImpl.class)
			return field_AddEntryToTable_Brackets((org.xtext.lua.lua.Field_AddEntryToTable_Brackets) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Field_AppendEntryToTableImpl.class)
			return field_AppendEntryToTable((org.xtext.lua.lua.Field_AppendEntryToTable) it);
		return field(it);
	}
	default Lua__Field_AddEntryToTableT $(final org.xtext.lua.lua.Field_AddEntryToTable it) {
		return field_AddEntryToTable(it);
	}
	default Lua__Field_AddEntryToTable_BracketsT $(final org.xtext.lua.lua.Field_AddEntryToTable_Brackets it) {
		return field_AddEntryToTable_Brackets(it);
	}
	default Lua__Field_AppendEntryToTableT $(final org.xtext.lua.lua.Field_AppendEntryToTable it) {
		return field_AppendEntryToTable(it);
	}
	default Lua__FunctionT $(final org.xtext.lua.lua.Function it) {
		return function(it);
	}
	default Lua__Functioncall_ArgumentsT $(final org.xtext.lua.lua.Functioncall_Arguments it) {
		return functioncall_Arguments(it);
	}
	default Lua__LastStatementT $(final org.xtext.lua.lua.LastStatement it) {
		if (it.getClass() == org.xtext.lua.lua.impl.LastStatement_BreakImpl.class)
			return lastStatement_Break((org.xtext.lua.lua.LastStatement_Break) it);
		if (it.getClass() == org.xtext.lua.lua.impl.LastStatement_ReturnImpl.class)
			return lastStatement_Return((org.xtext.lua.lua.LastStatement_Return) it);
		if (it.getClass() == org.xtext.lua.lua.impl.LastStatement_ReturnWithValueImpl.class)
			return lastStatement_ReturnWithValue((org.xtext.lua.lua.LastStatement_ReturnWithValue) it);
		return lastStatement(it);
	}
	default Lua__LastStatement_BreakT $(final org.xtext.lua.lua.LastStatement_Break it) {
		return lastStatement_Break(it);
	}
	default Lua__LastStatement_ReturnT $(final org.xtext.lua.lua.LastStatement_Return it) {
		if (it.getClass() == org.xtext.lua.lua.impl.LastStatement_ReturnWithValueImpl.class)
			return lastStatement_ReturnWithValue((org.xtext.lua.lua.LastStatement_ReturnWithValue) it);
		return lastStatement_Return(it);
	}
	default Lua__LastStatement_ReturnWithValueT $(final org.xtext.lua.lua.LastStatement_ReturnWithValue it) {
		return lastStatement_ReturnWithValue(it);
	}
	default Lua__StatementT $(final org.xtext.lua.lua.Statement it) {
		if (it.getClass() == org.xtext.lua.lua.impl.ExpressionImpl.class)
			return expression((org.xtext.lua.lua.Expression) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_AccessArrayImpl.class)
			return expression_AccessArray((org.xtext.lua.lua.Expression_AccessArray) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_AccessMemberImpl.class)
			return expression_AccessMember((org.xtext.lua.lua.Expression_AccessMember) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_AndImpl.class)
			return expression_And((org.xtext.lua.lua.Expression_And) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_CallFunctionImpl.class)
			return expression_CallFunction((org.xtext.lua.lua.Expression_CallFunction) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_CallMemberFunctionImpl.class)
			return expression_CallMemberFunction((org.xtext.lua.lua.Expression_CallMemberFunction) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_ConcatenationImpl.class)
			return expression_Concatenation((org.xtext.lua.lua.Expression_Concatenation) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_DivisionImpl.class)
			return expression_Division((org.xtext.lua.lua.Expression_Division) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_EqualImpl.class)
			return expression_Equal((org.xtext.lua.lua.Expression_Equal) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_ExponentiationImpl.class)
			return expression_Exponentiation((org.xtext.lua.lua.Expression_Exponentiation) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_FalseImpl.class)
			return expression_False((org.xtext.lua.lua.Expression_False) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_FunctionImpl.class)
			return expression_Function((org.xtext.lua.lua.Expression_Function) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_InvertImpl.class)
			return expression_Invert((org.xtext.lua.lua.Expression_Invert) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_LargerImpl.class)
			return expression_Larger((org.xtext.lua.lua.Expression_Larger) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_Larger_EqualImpl.class)
			return expression_Larger_Equal((org.xtext.lua.lua.Expression_Larger_Equal) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_LengthImpl.class)
			return expression_Length((org.xtext.lua.lua.Expression_Length) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_MinusImpl.class)
			return expression_Minus((org.xtext.lua.lua.Expression_Minus) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_ModuloImpl.class)
			return expression_Modulo((org.xtext.lua.lua.Expression_Modulo) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_MultiplicationImpl.class)
			return expression_Multiplication((org.xtext.lua.lua.Expression_Multiplication) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_NegateImpl.class)
			return expression_Negate((org.xtext.lua.lua.Expression_Negate) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_NilImpl.class)
			return expression_Nil((org.xtext.lua.lua.Expression_Nil) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_Not_EqualImpl.class)
			return expression_Not_Equal((org.xtext.lua.lua.Expression_Not_Equal) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_NumberImpl.class)
			return expression_Number((org.xtext.lua.lua.Expression_Number) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_OrImpl.class)
			return expression_Or((org.xtext.lua.lua.Expression_Or) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_PlusImpl.class)
			return expression_Plus((org.xtext.lua.lua.Expression_Plus) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_SmallerImpl.class)
			return expression_Smaller((org.xtext.lua.lua.Expression_Smaller) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_Smaller_EqualImpl.class)
			return expression_Smaller_Equal((org.xtext.lua.lua.Expression_Smaller_Equal) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_StringImpl.class)
			return expression_String((org.xtext.lua.lua.Expression_String) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_TableConstructorImpl.class)
			return expression_TableConstructor((org.xtext.lua.lua.Expression_TableConstructor) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_TrueImpl.class)
			return expression_True((org.xtext.lua.lua.Expression_True) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_VarArgsImpl.class)
			return expression_VarArgs((org.xtext.lua.lua.Expression_VarArgs) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_VariableNameImpl.class)
			return expression_VariableName((org.xtext.lua.lua.Expression_VariableName) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Statement_AssignmentImpl.class)
			return statement_Assignment((org.xtext.lua.lua.Statement_Assignment) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Statement_BlockImpl.class)
			return statement_Block((org.xtext.lua.lua.Statement_Block) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Statement_CallFunctionImpl.class)
			return statement_CallFunction((org.xtext.lua.lua.Statement_CallFunction) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Statement_CallMemberFunctionImpl.class)
			return statement_CallMemberFunction((org.xtext.lua.lua.Statement_CallMemberFunction) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Statement_For_GenericImpl.class)
			return statement_For_Generic((org.xtext.lua.lua.Statement_For_Generic) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Statement_For_NumericImpl.class)
			return statement_For_Numeric((org.xtext.lua.lua.Statement_For_Numeric) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Statement_FunctioncallOrAssignmentImpl.class)
			return statement_FunctioncallOrAssignment((org.xtext.lua.lua.Statement_FunctioncallOrAssignment) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Statement_GlobalFunction_DeclarationImpl.class)
			return statement_GlobalFunction_Declaration((org.xtext.lua.lua.Statement_GlobalFunction_Declaration) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Statement_If_Then_ElseImpl.class)
			return statement_If_Then_Else((org.xtext.lua.lua.Statement_If_Then_Else) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Statement_LocalFunction_DeclarationImpl.class)
			return statement_LocalFunction_Declaration((org.xtext.lua.lua.Statement_LocalFunction_Declaration) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Statement_Local_Variable_DeclarationImpl.class)
			return statement_Local_Variable_Declaration((org.xtext.lua.lua.Statement_Local_Variable_Declaration) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Statement_RepeatImpl.class)
			return statement_Repeat((org.xtext.lua.lua.Statement_Repeat) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Statement_WhileImpl.class)
			return statement_While((org.xtext.lua.lua.Statement_While) it);
		return statement(it);
	}
	default Lua__Statement_AssignmentT $(final org.xtext.lua.lua.Statement_Assignment it) {
		return statement_Assignment(it);
	}
	default Lua__Statement_BlockT $(final org.xtext.lua.lua.Statement_Block it) {
		return statement_Block(it);
	}
	default Lua__Statement_CallFunctionT $(final org.xtext.lua.lua.Statement_CallFunction it) {
		return statement_CallFunction(it);
	}
	default Lua__Statement_CallMemberFunctionT $(final org.xtext.lua.lua.Statement_CallMemberFunction it) {
		return statement_CallMemberFunction(it);
	}
	default Lua__Statement_For_GenericT $(final org.xtext.lua.lua.Statement_For_Generic it) {
		return statement_For_Generic(it);
	}
	default Lua__Statement_For_NumericT $(final org.xtext.lua.lua.Statement_For_Numeric it) {
		return statement_For_Numeric(it);
	}
	default Lua__Statement_FunctioncallOrAssignmentT $(final org.xtext.lua.lua.Statement_FunctioncallOrAssignment it) {
		if (it.getClass() == org.xtext.lua.lua.impl.ExpressionImpl.class)
			return expression((org.xtext.lua.lua.Expression) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_AccessArrayImpl.class)
			return expression_AccessArray((org.xtext.lua.lua.Expression_AccessArray) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_AccessMemberImpl.class)
			return expression_AccessMember((org.xtext.lua.lua.Expression_AccessMember) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_AndImpl.class)
			return expression_And((org.xtext.lua.lua.Expression_And) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_CallFunctionImpl.class)
			return expression_CallFunction((org.xtext.lua.lua.Expression_CallFunction) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_CallMemberFunctionImpl.class)
			return expression_CallMemberFunction((org.xtext.lua.lua.Expression_CallMemberFunction) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_ConcatenationImpl.class)
			return expression_Concatenation((org.xtext.lua.lua.Expression_Concatenation) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_DivisionImpl.class)
			return expression_Division((org.xtext.lua.lua.Expression_Division) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_EqualImpl.class)
			return expression_Equal((org.xtext.lua.lua.Expression_Equal) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_ExponentiationImpl.class)
			return expression_Exponentiation((org.xtext.lua.lua.Expression_Exponentiation) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_FalseImpl.class)
			return expression_False((org.xtext.lua.lua.Expression_False) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_FunctionImpl.class)
			return expression_Function((org.xtext.lua.lua.Expression_Function) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_InvertImpl.class)
			return expression_Invert((org.xtext.lua.lua.Expression_Invert) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_LargerImpl.class)
			return expression_Larger((org.xtext.lua.lua.Expression_Larger) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_Larger_EqualImpl.class)
			return expression_Larger_Equal((org.xtext.lua.lua.Expression_Larger_Equal) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_LengthImpl.class)
			return expression_Length((org.xtext.lua.lua.Expression_Length) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_MinusImpl.class)
			return expression_Minus((org.xtext.lua.lua.Expression_Minus) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_ModuloImpl.class)
			return expression_Modulo((org.xtext.lua.lua.Expression_Modulo) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_MultiplicationImpl.class)
			return expression_Multiplication((org.xtext.lua.lua.Expression_Multiplication) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_NegateImpl.class)
			return expression_Negate((org.xtext.lua.lua.Expression_Negate) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_NilImpl.class)
			return expression_Nil((org.xtext.lua.lua.Expression_Nil) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_Not_EqualImpl.class)
			return expression_Not_Equal((org.xtext.lua.lua.Expression_Not_Equal) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_NumberImpl.class)
			return expression_Number((org.xtext.lua.lua.Expression_Number) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_OrImpl.class)
			return expression_Or((org.xtext.lua.lua.Expression_Or) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_PlusImpl.class)
			return expression_Plus((org.xtext.lua.lua.Expression_Plus) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_SmallerImpl.class)
			return expression_Smaller((org.xtext.lua.lua.Expression_Smaller) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_Smaller_EqualImpl.class)
			return expression_Smaller_Equal((org.xtext.lua.lua.Expression_Smaller_Equal) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_StringImpl.class)
			return expression_String((org.xtext.lua.lua.Expression_String) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_TableConstructorImpl.class)
			return expression_TableConstructor((org.xtext.lua.lua.Expression_TableConstructor) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_TrueImpl.class)
			return expression_True((org.xtext.lua.lua.Expression_True) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_VarArgsImpl.class)
			return expression_VarArgs((org.xtext.lua.lua.Expression_VarArgs) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_VariableNameImpl.class)
			return expression_VariableName((org.xtext.lua.lua.Expression_VariableName) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Statement_AssignmentImpl.class)
			return statement_Assignment((org.xtext.lua.lua.Statement_Assignment) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Statement_CallFunctionImpl.class)
			return statement_CallFunction((org.xtext.lua.lua.Statement_CallFunction) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Statement_CallMemberFunctionImpl.class)
			return statement_CallMemberFunction((org.xtext.lua.lua.Statement_CallMemberFunction) it);
		return statement_FunctioncallOrAssignment(it);
	}
	default Lua__Statement_GlobalFunction_DeclarationT $(final org.xtext.lua.lua.Statement_GlobalFunction_Declaration it) {
		return statement_GlobalFunction_Declaration(it);
	}
	default Lua__Statement_If_Then_ElseT $(final org.xtext.lua.lua.Statement_If_Then_Else it) {
		return statement_If_Then_Else(it);
	}
	default Lua__Statement_If_Then_Else_ElseIfPartT $(final org.xtext.lua.lua.Statement_If_Then_Else_ElseIfPart it) {
		return statement_If_Then_Else_ElseIfPart(it);
	}
	default Lua__Statement_LocalFunction_DeclarationT $(final org.xtext.lua.lua.Statement_LocalFunction_Declaration it) {
		return statement_LocalFunction_Declaration(it);
	}
	default Lua__Statement_Local_Variable_DeclarationT $(final org.xtext.lua.lua.Statement_Local_Variable_Declaration it) {
		return statement_Local_Variable_Declaration(it);
	}
	default Lua__Statement_RepeatT $(final org.xtext.lua.lua.Statement_Repeat it) {
		return statement_Repeat(it);
	}
	default Lua__Statement_WhileT $(final org.xtext.lua.lua.Statement_While it) {
		return statement_While(it);
	}
}
