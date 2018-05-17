package iotlua.revisitor;

public interface IotluaRevisitor<Activitydiagram__ActionT extends Activitydiagram__ExecutableNodeT, Activitydiagram__ActivityT extends Activitydiagram__NamedElementT, Activitydiagram__ActivityEdgeT extends Activitydiagram__NamedElementT, Activitydiagram__ActivityFinalNodeT extends Activitydiagram__FinalNodeT, Activitydiagram__ActivityNodeT extends Activitydiagram__NamedElementT, Lua__BlockT extends Lua__ChunkT, Activitydiagram__BooleanValueT extends Activitydiagram__ValueT, Iotlua__BooleanValueBindExpressionT extends Activitydiagram__BooleanValueT, Activitydiagram__BooleanVariableT extends Activitydiagram__VariableT, Iotlua__BooleanVariableBindExpression_VariableNameT extends Activitydiagram__BooleanVariableT, Lua__ChunkT, Activitydiagramruntime__ContextT, Activitydiagram__ControlFlowT extends Activitydiagram__ActivityEdgeT, Activitydiagram__ControlNodeT extends Activitydiagram__ActivityNodeT, Activitydiagramruntime__ControlTokenT extends Activitydiagramruntime__TokenT, Activitydiagram__DecisionNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__ExecutableNodeT extends Activitydiagram__ActivityNodeT, Activitydiagram__ExpressionT, Lua__ExpressionT extends Lua__Statement_FunctioncallOrAssignmentT, Iotlua__ExpressionBindExpressionT extends Activitydiagram__ExpressionT, Lua__Expression_AccessArrayT extends Lua__ExpressionT, Lua__Expression_AccessMemberT extends Lua__ExpressionT, Lua__Expression_AndT extends Lua__ExpressionT, Lua__Expression_CallFunctionT extends Lua__ExpressionT, Lua__Expression_CallMemberFunctionT extends Lua__ExpressionT, Lua__Expression_ConcatenationT extends Lua__ExpressionT, Lua__Expression_DivisionT extends Lua__ExpressionT, Lua__Expression_EqualT extends Lua__ExpressionT, Lua__Expression_ExponentiationT extends Lua__ExpressionT, Lua__Expression_FalseT extends Lua__ExpressionT, Lua__Expression_FunctionT extends Lua__ExpressionT, Lua__Expression_InvertT extends Lua__ExpressionT, Lua__Expression_LargerT extends Lua__ExpressionT, Lua__Expression_Larger_EqualT extends Lua__ExpressionT, Lua__Expression_LengthT extends Lua__ExpressionT, Lua__Expression_MinusT extends Lua__ExpressionT, Lua__Expression_ModuloT extends Lua__ExpressionT, Lua__Expression_MultiplicationT extends Lua__ExpressionT, Lua__Expression_NegateT extends Lua__ExpressionT, Lua__Expression_NilT extends Lua__ExpressionT, Lua__Expression_Not_EqualT extends Lua__ExpressionT, Lua__Expression_NumberT extends Lua__ExpressionT, Lua__Expression_OrT extends Lua__ExpressionT, Lua__Expression_PlusT extends Lua__ExpressionT, Lua__Expression_SmallerT extends Lua__ExpressionT, Lua__Expression_Smaller_EqualT extends Lua__ExpressionT, Lua__Expression_StringT extends Lua__ExpressionT, Lua__Expression_TableConstructorT extends Lua__ExpressionT, Lua__Expression_TrueT extends Lua__ExpressionT, Lua__Expression_VarArgsT extends Lua__ExpressionT, Lua__Expression_VariableNameT extends Lua__ExpressionT, Lua__FieldT, Lua__Field_AddEntryToTableT extends Lua__FieldT, Lua__Field_AddEntryToTable_BracketsT extends Lua__FieldT, Lua__Field_AppendEntryToTableT extends Lua__FieldT, Activitydiagram__FinalNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__ForkNodeT extends Activitydiagram__ControlNodeT, Activitydiagramruntime__ForkedTokenT extends Activitydiagramruntime__TokenT, Lua__FunctionT, Lua__Functioncall_ArgumentsT, Activitydiagram__InitialNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__InputT, Activitydiagram__InputValueT, Activitydiagram__IntegerValueT extends Activitydiagram__ValueT, Iotlua__IntegerValueBindExpression_NumberT extends Activitydiagram__IntegerValueT, Activitydiagram__IntegerVariableT extends Activitydiagram__VariableT, Activitydiagram__JoinNodeT extends Activitydiagram__ControlNodeT, Lua__LastStatementT, Lua__LastStatement_BreakT extends Lua__LastStatementT, Lua__LastStatement_ReturnT extends Lua__LastStatementT, Lua__LastStatement_ReturnWithValueT extends Lua__LastStatement_ReturnT, Activitydiagram__MergeNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__NamedElementT, Activitydiagramruntime__OfferT, Activitydiagram__OpaqueActionT extends Activitydiagram__ActionT, Lua__StatementT, Lua__Statement_AssignmentT extends Lua__Statement_FunctioncallOrAssignmentT, Lua__Statement_BlockT extends Lua__StatementT, Lua__Statement_CallFunctionT extends Lua__Statement_FunctioncallOrAssignmentT, Lua__Statement_CallMemberFunctionT extends Lua__Statement_FunctioncallOrAssignmentT, Lua__Statement_For_GenericT extends Lua__StatementT, Lua__Statement_For_NumericT extends Lua__StatementT, Lua__Statement_FunctioncallOrAssignmentT extends Lua__StatementT, Lua__Statement_GlobalFunction_DeclarationT extends Lua__StatementT, Lua__Statement_If_Then_ElseT extends Lua__StatementT, Lua__Statement_If_Then_Else_ElseIfPartT, Lua__Statement_LocalFunction_DeclarationT extends Lua__StatementT, Lua__Statement_Local_Variable_DeclarationT extends Lua__StatementT, Lua__Statement_RepeatT extends Lua__StatementT, Lua__Statement_WhileT extends Lua__StatementT, Activitydiagramruntime__TokenT, Activitydiagramruntime__TraceT, Activitydiagram__ValueT, Iotlua__ValueBindExpressionT extends Activitydiagram__ValueT, Activitydiagram__VariableT>
	extends activitydiagram.revisitor.ActivitydiagramRevisitor<Activitydiagram__ActionT, Activitydiagram__ActivityT, Activitydiagram__ActivityEdgeT, Activitydiagram__ActivityFinalNodeT, Activitydiagram__ActivityNodeT, Activitydiagram__BooleanValueT, Activitydiagram__BooleanVariableT, Activitydiagram__ControlFlowT, Activitydiagram__ControlNodeT, Activitydiagram__DecisionNodeT, Activitydiagram__ExecutableNodeT, Activitydiagram__ExpressionT, Activitydiagram__FinalNodeT, Activitydiagram__ForkNodeT, Activitydiagram__InitialNodeT, Activitydiagram__InputT, Activitydiagram__InputValueT, Activitydiagram__IntegerValueT, Activitydiagram__IntegerVariableT, Activitydiagram__JoinNodeT, Activitydiagram__MergeNodeT, Activitydiagram__NamedElementT, Activitydiagram__OpaqueActionT, Activitydiagram__ValueT, Activitydiagram__VariableT>,
		lua.revisitor.LuaRevisitor<Lua__BlockT, Lua__ChunkT, Lua__ExpressionT, Lua__Expression_AccessArrayT, Lua__Expression_AccessMemberT, Lua__Expression_AndT, Lua__Expression_CallFunctionT, Lua__Expression_CallMemberFunctionT, Lua__Expression_ConcatenationT, Lua__Expression_DivisionT, Lua__Expression_EqualT, Lua__Expression_ExponentiationT, Lua__Expression_FalseT, Lua__Expression_FunctionT, Lua__Expression_InvertT, Lua__Expression_LargerT, Lua__Expression_Larger_EqualT, Lua__Expression_LengthT, Lua__Expression_MinusT, Lua__Expression_ModuloT, Lua__Expression_MultiplicationT, Lua__Expression_NegateT, Lua__Expression_NilT, Lua__Expression_Not_EqualT, Lua__Expression_NumberT, Lua__Expression_OrT, Lua__Expression_PlusT, Lua__Expression_SmallerT, Lua__Expression_Smaller_EqualT, Lua__Expression_StringT, Lua__Expression_TableConstructorT, Lua__Expression_TrueT, Lua__Expression_VarArgsT, Lua__Expression_VariableNameT, Lua__FieldT, Lua__Field_AddEntryToTableT, Lua__Field_AddEntryToTable_BracketsT, Lua__Field_AppendEntryToTableT, Lua__FunctionT, Lua__Functioncall_ArgumentsT, Lua__LastStatementT, Lua__LastStatement_BreakT, Lua__LastStatement_ReturnT, Lua__LastStatement_ReturnWithValueT, Lua__StatementT, Lua__Statement_AssignmentT, Lua__Statement_BlockT, Lua__Statement_CallFunctionT, Lua__Statement_CallMemberFunctionT, Lua__Statement_For_GenericT, Lua__Statement_For_NumericT, Lua__Statement_FunctioncallOrAssignmentT, Lua__Statement_GlobalFunction_DeclarationT, Lua__Statement_If_Then_ElseT, Lua__Statement_If_Then_Else_ElseIfPartT, Lua__Statement_LocalFunction_DeclarationT, Lua__Statement_Local_Variable_DeclarationT, Lua__Statement_RepeatT, Lua__Statement_WhileT>,
		activitydiagramruntime.revisitor.ActivitydiagramruntimeRevisitor<Activitydiagram__ActionT, Activitydiagram__ActivityT, Activitydiagram__ActivityEdgeT, Activitydiagram__ActivityFinalNodeT, Activitydiagram__ActivityNodeT, Activitydiagram__BooleanValueT, Activitydiagram__BooleanVariableT, Activitydiagramruntime__ContextT, Activitydiagram__ControlFlowT, Activitydiagram__ControlNodeT, Activitydiagramruntime__ControlTokenT, Activitydiagram__DecisionNodeT, Activitydiagram__ExecutableNodeT, Activitydiagram__ExpressionT, Activitydiagram__FinalNodeT, Activitydiagram__ForkNodeT, Activitydiagramruntime__ForkedTokenT, Activitydiagram__InitialNodeT, Activitydiagram__InputT, Activitydiagram__InputValueT, Activitydiagram__IntegerValueT, Activitydiagram__IntegerVariableT, Activitydiagram__JoinNodeT, Activitydiagram__MergeNodeT, Activitydiagram__NamedElementT, Activitydiagramruntime__OfferT, Activitydiagram__OpaqueActionT, Activitydiagramruntime__TokenT, Activitydiagramruntime__TraceT, Activitydiagram__ValueT, Activitydiagram__VariableT> {
	Lua__BlockT lua__Block(final org.xtext.lua.lua.Block it);
	Iotlua__BooleanValueBindExpressionT iotlua__BooleanValueBindExpression(final iotlua.BooleanValueBindExpression it);
	Iotlua__BooleanVariableBindExpression_VariableNameT iotlua__BooleanVariableBindExpression_VariableName(final iotlua.BooleanVariableBindExpression_VariableName it);
	Lua__ChunkT lua__Chunk(final org.xtext.lua.lua.Chunk it);
	Activitydiagramruntime__ContextT activitydiagramruntime__Context(final activitydiagramruntime.Context it);
	Activitydiagramruntime__ControlTokenT activitydiagramruntime__ControlToken(final activitydiagramruntime.ControlToken it);
	Lua__ExpressionT lua__Expression(final org.xtext.lua.lua.Expression it);
	Iotlua__ExpressionBindExpressionT iotlua__ExpressionBindExpression(final iotlua.ExpressionBindExpression it);
	Lua__Expression_AccessArrayT lua__Expression_AccessArray(final org.xtext.lua.lua.Expression_AccessArray it);
	Lua__Expression_AccessMemberT lua__Expression_AccessMember(final org.xtext.lua.lua.Expression_AccessMember it);
	Lua__Expression_AndT lua__Expression_And(final org.xtext.lua.lua.Expression_And it);
	Lua__Expression_CallFunctionT lua__Expression_CallFunction(final org.xtext.lua.lua.Expression_CallFunction it);
	Lua__Expression_CallMemberFunctionT lua__Expression_CallMemberFunction(final org.xtext.lua.lua.Expression_CallMemberFunction it);
	Lua__Expression_ConcatenationT lua__Expression_Concatenation(final org.xtext.lua.lua.Expression_Concatenation it);
	Lua__Expression_DivisionT lua__Expression_Division(final org.xtext.lua.lua.Expression_Division it);
	Lua__Expression_EqualT lua__Expression_Equal(final org.xtext.lua.lua.Expression_Equal it);
	Lua__Expression_ExponentiationT lua__Expression_Exponentiation(final org.xtext.lua.lua.Expression_Exponentiation it);
	Lua__Expression_FalseT lua__Expression_False(final org.xtext.lua.lua.Expression_False it);
	Lua__Expression_FunctionT lua__Expression_Function(final org.xtext.lua.lua.Expression_Function it);
	Lua__Expression_InvertT lua__Expression_Invert(final org.xtext.lua.lua.Expression_Invert it);
	Lua__Expression_LargerT lua__Expression_Larger(final org.xtext.lua.lua.Expression_Larger it);
	Lua__Expression_Larger_EqualT lua__Expression_Larger_Equal(final org.xtext.lua.lua.Expression_Larger_Equal it);
	Lua__Expression_LengthT lua__Expression_Length(final org.xtext.lua.lua.Expression_Length it);
	Lua__Expression_MinusT lua__Expression_Minus(final org.xtext.lua.lua.Expression_Minus it);
	Lua__Expression_ModuloT lua__Expression_Modulo(final org.xtext.lua.lua.Expression_Modulo it);
	Lua__Expression_MultiplicationT lua__Expression_Multiplication(final org.xtext.lua.lua.Expression_Multiplication it);
	Lua__Expression_NegateT lua__Expression_Negate(final org.xtext.lua.lua.Expression_Negate it);
	Lua__Expression_NilT lua__Expression_Nil(final org.xtext.lua.lua.Expression_Nil it);
	Lua__Expression_Not_EqualT lua__Expression_Not_Equal(final org.xtext.lua.lua.Expression_Not_Equal it);
	Lua__Expression_NumberT lua__Expression_Number(final org.xtext.lua.lua.Expression_Number it);
	Lua__Expression_OrT lua__Expression_Or(final org.xtext.lua.lua.Expression_Or it);
	Lua__Expression_PlusT lua__Expression_Plus(final org.xtext.lua.lua.Expression_Plus it);
	Lua__Expression_SmallerT lua__Expression_Smaller(final org.xtext.lua.lua.Expression_Smaller it);
	Lua__Expression_Smaller_EqualT lua__Expression_Smaller_Equal(final org.xtext.lua.lua.Expression_Smaller_Equal it);
	Lua__Expression_StringT lua__Expression_String(final org.xtext.lua.lua.Expression_String it);
	Lua__Expression_TableConstructorT lua__Expression_TableConstructor(final org.xtext.lua.lua.Expression_TableConstructor it);
	Lua__Expression_TrueT lua__Expression_True(final org.xtext.lua.lua.Expression_True it);
	Lua__Expression_VarArgsT lua__Expression_VarArgs(final org.xtext.lua.lua.Expression_VarArgs it);
	Lua__Expression_VariableNameT lua__Expression_VariableName(final org.xtext.lua.lua.Expression_VariableName it);
	Lua__FieldT lua__Field(final org.xtext.lua.lua.Field it);
	Lua__Field_AddEntryToTableT lua__Field_AddEntryToTable(final org.xtext.lua.lua.Field_AddEntryToTable it);
	Lua__Field_AddEntryToTable_BracketsT lua__Field_AddEntryToTable_Brackets(final org.xtext.lua.lua.Field_AddEntryToTable_Brackets it);
	Lua__Field_AppendEntryToTableT lua__Field_AppendEntryToTable(final org.xtext.lua.lua.Field_AppendEntryToTable it);
	Activitydiagramruntime__ForkedTokenT activitydiagramruntime__ForkedToken(final activitydiagramruntime.ForkedToken it);
	Lua__FunctionT lua__Function(final org.xtext.lua.lua.Function it);
	Lua__Functioncall_ArgumentsT lua__Functioncall_Arguments(final org.xtext.lua.lua.Functioncall_Arguments it);
	Iotlua__IntegerValueBindExpression_NumberT iotlua__IntegerValueBindExpression_Number(final iotlua.IntegerValueBindExpression_Number it);
	Lua__LastStatementT lua__LastStatement(final org.xtext.lua.lua.LastStatement it);
	Lua__LastStatement_BreakT lua__LastStatement_Break(final org.xtext.lua.lua.LastStatement_Break it);
	Lua__LastStatement_ReturnT lua__LastStatement_Return(final org.xtext.lua.lua.LastStatement_Return it);
	Lua__LastStatement_ReturnWithValueT lua__LastStatement_ReturnWithValue(final org.xtext.lua.lua.LastStatement_ReturnWithValue it);
	Activitydiagramruntime__OfferT activitydiagramruntime__Offer(final activitydiagramruntime.Offer it);
	Lua__StatementT lua__Statement(final org.xtext.lua.lua.Statement it);
	Lua__Statement_AssignmentT lua__Statement_Assignment(final org.xtext.lua.lua.Statement_Assignment it);
	Lua__Statement_BlockT lua__Statement_Block(final org.xtext.lua.lua.Statement_Block it);
	Lua__Statement_CallFunctionT lua__Statement_CallFunction(final org.xtext.lua.lua.Statement_CallFunction it);
	Lua__Statement_CallMemberFunctionT lua__Statement_CallMemberFunction(final org.xtext.lua.lua.Statement_CallMemberFunction it);
	Lua__Statement_For_GenericT lua__Statement_For_Generic(final org.xtext.lua.lua.Statement_For_Generic it);
	Lua__Statement_For_NumericT lua__Statement_For_Numeric(final org.xtext.lua.lua.Statement_For_Numeric it);
	Lua__Statement_FunctioncallOrAssignmentT lua__Statement_FunctioncallOrAssignment(final org.xtext.lua.lua.Statement_FunctioncallOrAssignment it);
	Lua__Statement_GlobalFunction_DeclarationT lua__Statement_GlobalFunction_Declaration(final org.xtext.lua.lua.Statement_GlobalFunction_Declaration it);
	Lua__Statement_If_Then_ElseT lua__Statement_If_Then_Else(final org.xtext.lua.lua.Statement_If_Then_Else it);
	Lua__Statement_If_Then_Else_ElseIfPartT lua__Statement_If_Then_Else_ElseIfPart(final org.xtext.lua.lua.Statement_If_Then_Else_ElseIfPart it);
	Lua__Statement_LocalFunction_DeclarationT lua__Statement_LocalFunction_Declaration(final org.xtext.lua.lua.Statement_LocalFunction_Declaration it);
	Lua__Statement_Local_Variable_DeclarationT lua__Statement_Local_Variable_Declaration(final org.xtext.lua.lua.Statement_Local_Variable_Declaration it);
	Lua__Statement_RepeatT lua__Statement_Repeat(final org.xtext.lua.lua.Statement_Repeat it);
	Lua__Statement_WhileT lua__Statement_While(final org.xtext.lua.lua.Statement_While it);
	Activitydiagramruntime__TraceT activitydiagramruntime__Trace(final activitydiagramruntime.Trace it);
	Iotlua__ValueBindExpressionT iotlua__ValueBindExpression(final iotlua.ValueBindExpression it);

	default Activitydiagram__ActionT $(final activitydiagram.Action it) {
		if (it.getClass() == activitydiagram.impl.OpaqueActionImpl.class)
			return activitydiagram__OpaqueAction((activitydiagram.OpaqueAction) it);
		return null;
	}
	default Activitydiagram__ActivityT $(final activitydiagram.Activity it) {
		return activitydiagram__Activity(it);
	}
	default Activitydiagram__ActivityEdgeT $(final activitydiagram.ActivityEdge it) {
		if (it.getClass() == activitydiagram.impl.ControlFlowImpl.class)
			return activitydiagram__ControlFlow((activitydiagram.ControlFlow) it);
		return null;
	}
	default Activitydiagram__ActivityFinalNodeT $(final activitydiagram.ActivityFinalNode it) {
		return activitydiagram__ActivityFinalNode(it);
	}
	default Activitydiagram__ActivityNodeT $(final activitydiagram.ActivityNode it) {
		if (it.getClass() == activitydiagram.impl.ActivityFinalNodeImpl.class)
			return activitydiagram__ActivityFinalNode((activitydiagram.ActivityFinalNode) it);
		if (it.getClass() == activitydiagram.impl.DecisionNodeImpl.class)
			return activitydiagram__DecisionNode((activitydiagram.DecisionNode) it);
		if (it.getClass() == activitydiagram.impl.ForkNodeImpl.class)
			return activitydiagram__ForkNode((activitydiagram.ForkNode) it);
		if (it.getClass() == activitydiagram.impl.InitialNodeImpl.class)
			return activitydiagram__InitialNode((activitydiagram.InitialNode) it);
		if (it.getClass() == activitydiagram.impl.JoinNodeImpl.class)
			return activitydiagram__JoinNode((activitydiagram.JoinNode) it);
		if (it.getClass() == activitydiagram.impl.MergeNodeImpl.class)
			return activitydiagram__MergeNode((activitydiagram.MergeNode) it);
		if (it.getClass() == activitydiagram.impl.OpaqueActionImpl.class)
			return activitydiagram__OpaqueAction((activitydiagram.OpaqueAction) it);
		return null;
	}
	default Lua__BlockT $(final org.xtext.lua.lua.Block it) {
		return lua__Block(it);
	}
	default Activitydiagram__BooleanValueT $(final activitydiagram.BooleanValue it) {
		if (it.getClass() == iotlua.impl.BooleanValueBindExpressionImpl.class)
			return iotlua__BooleanValueBindExpression((iotlua.BooleanValueBindExpression) it);
		return null;
	}
	default Iotlua__BooleanValueBindExpressionT $(final iotlua.BooleanValueBindExpression it) {
		return iotlua__BooleanValueBindExpression(it);
	}
	default Activitydiagram__BooleanVariableT $(final activitydiagram.BooleanVariable it) {
		if (it.getClass() == iotlua.impl.BooleanVariableBindExpression_VariableNameImpl.class)
			return iotlua__BooleanVariableBindExpression_VariableName((iotlua.BooleanVariableBindExpression_VariableName) it);
		return null;
	}
	default Iotlua__BooleanVariableBindExpression_VariableNameT $(final iotlua.BooleanVariableBindExpression_VariableName it) {
		return iotlua__BooleanVariableBindExpression_VariableName(it);
	}
	default Lua__ChunkT $(final org.xtext.lua.lua.Chunk it) {
		if (it.getClass() == org.xtext.lua.lua.impl.BlockImpl.class)
			return lua__Block((org.xtext.lua.lua.Block) it);
		return lua__Chunk(it);
	}
	default Activitydiagramruntime__ContextT $(final activitydiagramruntime.Context it) {
		return activitydiagramruntime__Context(it);
	}
	default Activitydiagram__ControlFlowT $(final activitydiagram.ControlFlow it) {
		return activitydiagram__ControlFlow(it);
	}
	default Activitydiagram__ControlNodeT $(final activitydiagram.ControlNode it) {
		if (it.getClass() == activitydiagram.impl.ActivityFinalNodeImpl.class)
			return activitydiagram__ActivityFinalNode((activitydiagram.ActivityFinalNode) it);
		if (it.getClass() == activitydiagram.impl.DecisionNodeImpl.class)
			return activitydiagram__DecisionNode((activitydiagram.DecisionNode) it);
		if (it.getClass() == activitydiagram.impl.ForkNodeImpl.class)
			return activitydiagram__ForkNode((activitydiagram.ForkNode) it);
		if (it.getClass() == activitydiagram.impl.InitialNodeImpl.class)
			return activitydiagram__InitialNode((activitydiagram.InitialNode) it);
		if (it.getClass() == activitydiagram.impl.JoinNodeImpl.class)
			return activitydiagram__JoinNode((activitydiagram.JoinNode) it);
		if (it.getClass() == activitydiagram.impl.MergeNodeImpl.class)
			return activitydiagram__MergeNode((activitydiagram.MergeNode) it);
		return null;
	}
	default Activitydiagramruntime__ControlTokenT $(final activitydiagramruntime.ControlToken it) {
		return activitydiagramruntime__ControlToken(it);
	}
	default Activitydiagram__DecisionNodeT $(final activitydiagram.DecisionNode it) {
		return activitydiagram__DecisionNode(it);
	}
	default Activitydiagram__ExecutableNodeT $(final activitydiagram.ExecutableNode it) {
		if (it.getClass() == activitydiagram.impl.OpaqueActionImpl.class)
			return activitydiagram__OpaqueAction((activitydiagram.OpaqueAction) it);
		return null;
	}
	default Activitydiagram__ExpressionT $(final activitydiagram.Expression it) {
		if (it.getClass() == iotlua.impl.ExpressionBindExpressionImpl.class)
			return iotlua__ExpressionBindExpression((iotlua.ExpressionBindExpression) it);
		return null;
	}
	default Lua__ExpressionT $(final org.xtext.lua.lua.Expression it) {
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_AccessArrayImpl.class)
			return lua__Expression_AccessArray((org.xtext.lua.lua.Expression_AccessArray) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_AccessMemberImpl.class)
			return lua__Expression_AccessMember((org.xtext.lua.lua.Expression_AccessMember) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_AndImpl.class)
			return lua__Expression_And((org.xtext.lua.lua.Expression_And) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_CallFunctionImpl.class)
			return lua__Expression_CallFunction((org.xtext.lua.lua.Expression_CallFunction) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_CallMemberFunctionImpl.class)
			return lua__Expression_CallMemberFunction((org.xtext.lua.lua.Expression_CallMemberFunction) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_ConcatenationImpl.class)
			return lua__Expression_Concatenation((org.xtext.lua.lua.Expression_Concatenation) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_DivisionImpl.class)
			return lua__Expression_Division((org.xtext.lua.lua.Expression_Division) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_EqualImpl.class)
			return lua__Expression_Equal((org.xtext.lua.lua.Expression_Equal) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_ExponentiationImpl.class)
			return lua__Expression_Exponentiation((org.xtext.lua.lua.Expression_Exponentiation) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_FalseImpl.class)
			return lua__Expression_False((org.xtext.lua.lua.Expression_False) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_FunctionImpl.class)
			return lua__Expression_Function((org.xtext.lua.lua.Expression_Function) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_InvertImpl.class)
			return lua__Expression_Invert((org.xtext.lua.lua.Expression_Invert) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_LargerImpl.class)
			return lua__Expression_Larger((org.xtext.lua.lua.Expression_Larger) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_Larger_EqualImpl.class)
			return lua__Expression_Larger_Equal((org.xtext.lua.lua.Expression_Larger_Equal) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_LengthImpl.class)
			return lua__Expression_Length((org.xtext.lua.lua.Expression_Length) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_MinusImpl.class)
			return lua__Expression_Minus((org.xtext.lua.lua.Expression_Minus) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_ModuloImpl.class)
			return lua__Expression_Modulo((org.xtext.lua.lua.Expression_Modulo) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_MultiplicationImpl.class)
			return lua__Expression_Multiplication((org.xtext.lua.lua.Expression_Multiplication) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_NegateImpl.class)
			return lua__Expression_Negate((org.xtext.lua.lua.Expression_Negate) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_NilImpl.class)
			return lua__Expression_Nil((org.xtext.lua.lua.Expression_Nil) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_Not_EqualImpl.class)
			return lua__Expression_Not_Equal((org.xtext.lua.lua.Expression_Not_Equal) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_NumberImpl.class)
			return lua__Expression_Number((org.xtext.lua.lua.Expression_Number) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_OrImpl.class)
			return lua__Expression_Or((org.xtext.lua.lua.Expression_Or) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_PlusImpl.class)
			return lua__Expression_Plus((org.xtext.lua.lua.Expression_Plus) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_SmallerImpl.class)
			return lua__Expression_Smaller((org.xtext.lua.lua.Expression_Smaller) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_Smaller_EqualImpl.class)
			return lua__Expression_Smaller_Equal((org.xtext.lua.lua.Expression_Smaller_Equal) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_StringImpl.class)
			return lua__Expression_String((org.xtext.lua.lua.Expression_String) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_TableConstructorImpl.class)
			return lua__Expression_TableConstructor((org.xtext.lua.lua.Expression_TableConstructor) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_TrueImpl.class)
			return lua__Expression_True((org.xtext.lua.lua.Expression_True) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_VarArgsImpl.class)
			return lua__Expression_VarArgs((org.xtext.lua.lua.Expression_VarArgs) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_VariableNameImpl.class)
			return lua__Expression_VariableName((org.xtext.lua.lua.Expression_VariableName) it);
		return lua__Expression(it);
	}
	default Iotlua__ExpressionBindExpressionT $(final iotlua.ExpressionBindExpression it) {
		return iotlua__ExpressionBindExpression(it);
	}
	default Lua__Expression_AccessArrayT $(final org.xtext.lua.lua.Expression_AccessArray it) {
		return lua__Expression_AccessArray(it);
	}
	default Lua__Expression_AccessMemberT $(final org.xtext.lua.lua.Expression_AccessMember it) {
		return lua__Expression_AccessMember(it);
	}
	default Lua__Expression_AndT $(final org.xtext.lua.lua.Expression_And it) {
		return lua__Expression_And(it);
	}
	default Lua__Expression_CallFunctionT $(final org.xtext.lua.lua.Expression_CallFunction it) {
		return lua__Expression_CallFunction(it);
	}
	default Lua__Expression_CallMemberFunctionT $(final org.xtext.lua.lua.Expression_CallMemberFunction it) {
		return lua__Expression_CallMemberFunction(it);
	}
	default Lua__Expression_ConcatenationT $(final org.xtext.lua.lua.Expression_Concatenation it) {
		return lua__Expression_Concatenation(it);
	}
	default Lua__Expression_DivisionT $(final org.xtext.lua.lua.Expression_Division it) {
		return lua__Expression_Division(it);
	}
	default Lua__Expression_EqualT $(final org.xtext.lua.lua.Expression_Equal it) {
		return lua__Expression_Equal(it);
	}
	default Lua__Expression_ExponentiationT $(final org.xtext.lua.lua.Expression_Exponentiation it) {
		return lua__Expression_Exponentiation(it);
	}
	default Lua__Expression_FalseT $(final org.xtext.lua.lua.Expression_False it) {
		return lua__Expression_False(it);
	}
	default Lua__Expression_FunctionT $(final org.xtext.lua.lua.Expression_Function it) {
		return lua__Expression_Function(it);
	}
	default Lua__Expression_InvertT $(final org.xtext.lua.lua.Expression_Invert it) {
		return lua__Expression_Invert(it);
	}
	default Lua__Expression_LargerT $(final org.xtext.lua.lua.Expression_Larger it) {
		return lua__Expression_Larger(it);
	}
	default Lua__Expression_Larger_EqualT $(final org.xtext.lua.lua.Expression_Larger_Equal it) {
		return lua__Expression_Larger_Equal(it);
	}
	default Lua__Expression_LengthT $(final org.xtext.lua.lua.Expression_Length it) {
		return lua__Expression_Length(it);
	}
	default Lua__Expression_MinusT $(final org.xtext.lua.lua.Expression_Minus it) {
		return lua__Expression_Minus(it);
	}
	default Lua__Expression_ModuloT $(final org.xtext.lua.lua.Expression_Modulo it) {
		return lua__Expression_Modulo(it);
	}
	default Lua__Expression_MultiplicationT $(final org.xtext.lua.lua.Expression_Multiplication it) {
		return lua__Expression_Multiplication(it);
	}
	default Lua__Expression_NegateT $(final org.xtext.lua.lua.Expression_Negate it) {
		return lua__Expression_Negate(it);
	}
	default Lua__Expression_NilT $(final org.xtext.lua.lua.Expression_Nil it) {
		return lua__Expression_Nil(it);
	}
	default Lua__Expression_Not_EqualT $(final org.xtext.lua.lua.Expression_Not_Equal it) {
		return lua__Expression_Not_Equal(it);
	}
	default Lua__Expression_NumberT $(final org.xtext.lua.lua.Expression_Number it) {
		return lua__Expression_Number(it);
	}
	default Lua__Expression_OrT $(final org.xtext.lua.lua.Expression_Or it) {
		return lua__Expression_Or(it);
	}
	default Lua__Expression_PlusT $(final org.xtext.lua.lua.Expression_Plus it) {
		return lua__Expression_Plus(it);
	}
	default Lua__Expression_SmallerT $(final org.xtext.lua.lua.Expression_Smaller it) {
		return lua__Expression_Smaller(it);
	}
	default Lua__Expression_Smaller_EqualT $(final org.xtext.lua.lua.Expression_Smaller_Equal it) {
		return lua__Expression_Smaller_Equal(it);
	}
	default Lua__Expression_StringT $(final org.xtext.lua.lua.Expression_String it) {
		return lua__Expression_String(it);
	}
	default Lua__Expression_TableConstructorT $(final org.xtext.lua.lua.Expression_TableConstructor it) {
		return lua__Expression_TableConstructor(it);
	}
	default Lua__Expression_TrueT $(final org.xtext.lua.lua.Expression_True it) {
		return lua__Expression_True(it);
	}
	default Lua__Expression_VarArgsT $(final org.xtext.lua.lua.Expression_VarArgs it) {
		return lua__Expression_VarArgs(it);
	}
	default Lua__Expression_VariableNameT $(final org.xtext.lua.lua.Expression_VariableName it) {
		return lua__Expression_VariableName(it);
	}
	default Lua__FieldT $(final org.xtext.lua.lua.Field it) {
		if (it.getClass() == org.xtext.lua.lua.impl.Field_AddEntryToTableImpl.class)
			return lua__Field_AddEntryToTable((org.xtext.lua.lua.Field_AddEntryToTable) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Field_AddEntryToTable_BracketsImpl.class)
			return lua__Field_AddEntryToTable_Brackets((org.xtext.lua.lua.Field_AddEntryToTable_Brackets) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Field_AppendEntryToTableImpl.class)
			return lua__Field_AppendEntryToTable((org.xtext.lua.lua.Field_AppendEntryToTable) it);
		return lua__Field(it);
	}
	default Lua__Field_AddEntryToTableT $(final org.xtext.lua.lua.Field_AddEntryToTable it) {
		return lua__Field_AddEntryToTable(it);
	}
	default Lua__Field_AddEntryToTable_BracketsT $(final org.xtext.lua.lua.Field_AddEntryToTable_Brackets it) {
		return lua__Field_AddEntryToTable_Brackets(it);
	}
	default Lua__Field_AppendEntryToTableT $(final org.xtext.lua.lua.Field_AppendEntryToTable it) {
		return lua__Field_AppendEntryToTable(it);
	}
	default Activitydiagram__FinalNodeT $(final activitydiagram.FinalNode it) {
		if (it.getClass() == activitydiagram.impl.ActivityFinalNodeImpl.class)
			return activitydiagram__ActivityFinalNode((activitydiagram.ActivityFinalNode) it);
		return null;
	}
	default Activitydiagram__ForkNodeT $(final activitydiagram.ForkNode it) {
		return activitydiagram__ForkNode(it);
	}
	default Activitydiagramruntime__ForkedTokenT $(final activitydiagramruntime.ForkedToken it) {
		return activitydiagramruntime__ForkedToken(it);
	}
	default Lua__FunctionT $(final org.xtext.lua.lua.Function it) {
		return lua__Function(it);
	}
	default Lua__Functioncall_ArgumentsT $(final org.xtext.lua.lua.Functioncall_Arguments it) {
		return lua__Functioncall_Arguments(it);
	}
	default Activitydiagram__InitialNodeT $(final activitydiagram.InitialNode it) {
		return activitydiagram__InitialNode(it);
	}
	default Activitydiagram__InputT $(final activitydiagram.Input it) {
		return activitydiagram__Input(it);
	}
	default Activitydiagram__InputValueT $(final activitydiagram.InputValue it) {
		return activitydiagram__InputValue(it);
	}
	default Activitydiagram__IntegerValueT $(final activitydiagram.IntegerValue it) {
		if (it.getClass() == iotlua.impl.IntegerValueBindExpression_NumberImpl.class)
			return iotlua__IntegerValueBindExpression_Number((iotlua.IntegerValueBindExpression_Number) it);
		return null;
	}
	default Iotlua__IntegerValueBindExpression_NumberT $(final iotlua.IntegerValueBindExpression_Number it) {
		return iotlua__IntegerValueBindExpression_Number(it);
	}
	Activitydiagram__IntegerVariableT $(final activitydiagram.IntegerVariable it);
	default Activitydiagram__JoinNodeT $(final activitydiagram.JoinNode it) {
		return activitydiagram__JoinNode(it);
	}
	default Lua__LastStatementT $(final org.xtext.lua.lua.LastStatement it) {
		if (it.getClass() == org.xtext.lua.lua.impl.LastStatement_BreakImpl.class)
			return lua__LastStatement_Break((org.xtext.lua.lua.LastStatement_Break) it);
		if (it.getClass() == org.xtext.lua.lua.impl.LastStatement_ReturnImpl.class)
			return lua__LastStatement_Return((org.xtext.lua.lua.LastStatement_Return) it);
		if (it.getClass() == org.xtext.lua.lua.impl.LastStatement_ReturnWithValueImpl.class)
			return lua__LastStatement_ReturnWithValue((org.xtext.lua.lua.LastStatement_ReturnWithValue) it);
		return lua__LastStatement(it);
	}
	default Lua__LastStatement_BreakT $(final org.xtext.lua.lua.LastStatement_Break it) {
		return lua__LastStatement_Break(it);
	}
	default Lua__LastStatement_ReturnT $(final org.xtext.lua.lua.LastStatement_Return it) {
		if (it.getClass() == org.xtext.lua.lua.impl.LastStatement_ReturnWithValueImpl.class)
			return lua__LastStatement_ReturnWithValue((org.xtext.lua.lua.LastStatement_ReturnWithValue) it);
		return lua__LastStatement_Return(it);
	}
	default Lua__LastStatement_ReturnWithValueT $(final org.xtext.lua.lua.LastStatement_ReturnWithValue it) {
		return lua__LastStatement_ReturnWithValue(it);
	}
	default Activitydiagram__MergeNodeT $(final activitydiagram.MergeNode it) {
		return activitydiagram__MergeNode(it);
	}
	default Activitydiagram__NamedElementT $(final activitydiagram.NamedElement it) {
		if (it.getClass() == activitydiagram.impl.ActivityImpl.class)
			return activitydiagram__Activity((activitydiagram.Activity) it);
		if (it.getClass() == activitydiagram.impl.ActivityFinalNodeImpl.class)
			return activitydiagram__ActivityFinalNode((activitydiagram.ActivityFinalNode) it);
		if (it.getClass() == activitydiagram.impl.ControlFlowImpl.class)
			return activitydiagram__ControlFlow((activitydiagram.ControlFlow) it);
		if (it.getClass() == activitydiagram.impl.DecisionNodeImpl.class)
			return activitydiagram__DecisionNode((activitydiagram.DecisionNode) it);
		if (it.getClass() == activitydiagram.impl.ForkNodeImpl.class)
			return activitydiagram__ForkNode((activitydiagram.ForkNode) it);
		if (it.getClass() == activitydiagram.impl.InitialNodeImpl.class)
			return activitydiagram__InitialNode((activitydiagram.InitialNode) it);
		if (it.getClass() == activitydiagram.impl.JoinNodeImpl.class)
			return activitydiagram__JoinNode((activitydiagram.JoinNode) it);
		if (it.getClass() == activitydiagram.impl.MergeNodeImpl.class)
			return activitydiagram__MergeNode((activitydiagram.MergeNode) it);
		if (it.getClass() == activitydiagram.impl.OpaqueActionImpl.class)
			return activitydiagram__OpaqueAction((activitydiagram.OpaqueAction) it);
		return null;
	}
	default Activitydiagramruntime__OfferT $(final activitydiagramruntime.Offer it) {
		return activitydiagramruntime__Offer(it);
	}
	default Activitydiagram__OpaqueActionT $(final activitydiagram.OpaqueAction it) {
		return activitydiagram__OpaqueAction(it);
	}
	default Lua__StatementT $(final org.xtext.lua.lua.Statement it) {
		if (it.getClass() == org.xtext.lua.lua.impl.ExpressionImpl.class)
			return lua__Expression((org.xtext.lua.lua.Expression) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_AccessArrayImpl.class)
			return lua__Expression_AccessArray((org.xtext.lua.lua.Expression_AccessArray) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_AccessMemberImpl.class)
			return lua__Expression_AccessMember((org.xtext.lua.lua.Expression_AccessMember) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_AndImpl.class)
			return lua__Expression_And((org.xtext.lua.lua.Expression_And) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_CallFunctionImpl.class)
			return lua__Expression_CallFunction((org.xtext.lua.lua.Expression_CallFunction) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_CallMemberFunctionImpl.class)
			return lua__Expression_CallMemberFunction((org.xtext.lua.lua.Expression_CallMemberFunction) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_ConcatenationImpl.class)
			return lua__Expression_Concatenation((org.xtext.lua.lua.Expression_Concatenation) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_DivisionImpl.class)
			return lua__Expression_Division((org.xtext.lua.lua.Expression_Division) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_EqualImpl.class)
			return lua__Expression_Equal((org.xtext.lua.lua.Expression_Equal) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_ExponentiationImpl.class)
			return lua__Expression_Exponentiation((org.xtext.lua.lua.Expression_Exponentiation) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_FalseImpl.class)
			return lua__Expression_False((org.xtext.lua.lua.Expression_False) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_FunctionImpl.class)
			return lua__Expression_Function((org.xtext.lua.lua.Expression_Function) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_InvertImpl.class)
			return lua__Expression_Invert((org.xtext.lua.lua.Expression_Invert) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_LargerImpl.class)
			return lua__Expression_Larger((org.xtext.lua.lua.Expression_Larger) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_Larger_EqualImpl.class)
			return lua__Expression_Larger_Equal((org.xtext.lua.lua.Expression_Larger_Equal) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_LengthImpl.class)
			return lua__Expression_Length((org.xtext.lua.lua.Expression_Length) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_MinusImpl.class)
			return lua__Expression_Minus((org.xtext.lua.lua.Expression_Minus) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_ModuloImpl.class)
			return lua__Expression_Modulo((org.xtext.lua.lua.Expression_Modulo) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_MultiplicationImpl.class)
			return lua__Expression_Multiplication((org.xtext.lua.lua.Expression_Multiplication) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_NegateImpl.class)
			return lua__Expression_Negate((org.xtext.lua.lua.Expression_Negate) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_NilImpl.class)
			return lua__Expression_Nil((org.xtext.lua.lua.Expression_Nil) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_Not_EqualImpl.class)
			return lua__Expression_Not_Equal((org.xtext.lua.lua.Expression_Not_Equal) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_NumberImpl.class)
			return lua__Expression_Number((org.xtext.lua.lua.Expression_Number) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_OrImpl.class)
			return lua__Expression_Or((org.xtext.lua.lua.Expression_Or) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_PlusImpl.class)
			return lua__Expression_Plus((org.xtext.lua.lua.Expression_Plus) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_SmallerImpl.class)
			return lua__Expression_Smaller((org.xtext.lua.lua.Expression_Smaller) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_Smaller_EqualImpl.class)
			return lua__Expression_Smaller_Equal((org.xtext.lua.lua.Expression_Smaller_Equal) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_StringImpl.class)
			return lua__Expression_String((org.xtext.lua.lua.Expression_String) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_TableConstructorImpl.class)
			return lua__Expression_TableConstructor((org.xtext.lua.lua.Expression_TableConstructor) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_TrueImpl.class)
			return lua__Expression_True((org.xtext.lua.lua.Expression_True) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_VarArgsImpl.class)
			return lua__Expression_VarArgs((org.xtext.lua.lua.Expression_VarArgs) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_VariableNameImpl.class)
			return lua__Expression_VariableName((org.xtext.lua.lua.Expression_VariableName) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Statement_AssignmentImpl.class)
			return lua__Statement_Assignment((org.xtext.lua.lua.Statement_Assignment) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Statement_BlockImpl.class)
			return lua__Statement_Block((org.xtext.lua.lua.Statement_Block) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Statement_CallFunctionImpl.class)
			return lua__Statement_CallFunction((org.xtext.lua.lua.Statement_CallFunction) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Statement_CallMemberFunctionImpl.class)
			return lua__Statement_CallMemberFunction((org.xtext.lua.lua.Statement_CallMemberFunction) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Statement_For_GenericImpl.class)
			return lua__Statement_For_Generic((org.xtext.lua.lua.Statement_For_Generic) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Statement_For_NumericImpl.class)
			return lua__Statement_For_Numeric((org.xtext.lua.lua.Statement_For_Numeric) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Statement_FunctioncallOrAssignmentImpl.class)
			return lua__Statement_FunctioncallOrAssignment((org.xtext.lua.lua.Statement_FunctioncallOrAssignment) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Statement_GlobalFunction_DeclarationImpl.class)
			return lua__Statement_GlobalFunction_Declaration((org.xtext.lua.lua.Statement_GlobalFunction_Declaration) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Statement_If_Then_ElseImpl.class)
			return lua__Statement_If_Then_Else((org.xtext.lua.lua.Statement_If_Then_Else) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Statement_LocalFunction_DeclarationImpl.class)
			return lua__Statement_LocalFunction_Declaration((org.xtext.lua.lua.Statement_LocalFunction_Declaration) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Statement_Local_Variable_DeclarationImpl.class)
			return lua__Statement_Local_Variable_Declaration((org.xtext.lua.lua.Statement_Local_Variable_Declaration) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Statement_RepeatImpl.class)
			return lua__Statement_Repeat((org.xtext.lua.lua.Statement_Repeat) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Statement_WhileImpl.class)
			return lua__Statement_While((org.xtext.lua.lua.Statement_While) it);
		return lua__Statement(it);
	}
	default Lua__Statement_AssignmentT $(final org.xtext.lua.lua.Statement_Assignment it) {
		return lua__Statement_Assignment(it);
	}
	default Lua__Statement_BlockT $(final org.xtext.lua.lua.Statement_Block it) {
		return lua__Statement_Block(it);
	}
	default Lua__Statement_CallFunctionT $(final org.xtext.lua.lua.Statement_CallFunction it) {
		return lua__Statement_CallFunction(it);
	}
	default Lua__Statement_CallMemberFunctionT $(final org.xtext.lua.lua.Statement_CallMemberFunction it) {
		return lua__Statement_CallMemberFunction(it);
	}
	default Lua__Statement_For_GenericT $(final org.xtext.lua.lua.Statement_For_Generic it) {
		return lua__Statement_For_Generic(it);
	}
	default Lua__Statement_For_NumericT $(final org.xtext.lua.lua.Statement_For_Numeric it) {
		return lua__Statement_For_Numeric(it);
	}
	default Lua__Statement_FunctioncallOrAssignmentT $(final org.xtext.lua.lua.Statement_FunctioncallOrAssignment it) {
		if (it.getClass() == org.xtext.lua.lua.impl.ExpressionImpl.class)
			return lua__Expression((org.xtext.lua.lua.Expression) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_AccessArrayImpl.class)
			return lua__Expression_AccessArray((org.xtext.lua.lua.Expression_AccessArray) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_AccessMemberImpl.class)
			return lua__Expression_AccessMember((org.xtext.lua.lua.Expression_AccessMember) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_AndImpl.class)
			return lua__Expression_And((org.xtext.lua.lua.Expression_And) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_CallFunctionImpl.class)
			return lua__Expression_CallFunction((org.xtext.lua.lua.Expression_CallFunction) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_CallMemberFunctionImpl.class)
			return lua__Expression_CallMemberFunction((org.xtext.lua.lua.Expression_CallMemberFunction) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_ConcatenationImpl.class)
			return lua__Expression_Concatenation((org.xtext.lua.lua.Expression_Concatenation) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_DivisionImpl.class)
			return lua__Expression_Division((org.xtext.lua.lua.Expression_Division) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_EqualImpl.class)
			return lua__Expression_Equal((org.xtext.lua.lua.Expression_Equal) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_ExponentiationImpl.class)
			return lua__Expression_Exponentiation((org.xtext.lua.lua.Expression_Exponentiation) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_FalseImpl.class)
			return lua__Expression_False((org.xtext.lua.lua.Expression_False) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_FunctionImpl.class)
			return lua__Expression_Function((org.xtext.lua.lua.Expression_Function) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_InvertImpl.class)
			return lua__Expression_Invert((org.xtext.lua.lua.Expression_Invert) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_LargerImpl.class)
			return lua__Expression_Larger((org.xtext.lua.lua.Expression_Larger) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_Larger_EqualImpl.class)
			return lua__Expression_Larger_Equal((org.xtext.lua.lua.Expression_Larger_Equal) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_LengthImpl.class)
			return lua__Expression_Length((org.xtext.lua.lua.Expression_Length) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_MinusImpl.class)
			return lua__Expression_Minus((org.xtext.lua.lua.Expression_Minus) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_ModuloImpl.class)
			return lua__Expression_Modulo((org.xtext.lua.lua.Expression_Modulo) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_MultiplicationImpl.class)
			return lua__Expression_Multiplication((org.xtext.lua.lua.Expression_Multiplication) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_NegateImpl.class)
			return lua__Expression_Negate((org.xtext.lua.lua.Expression_Negate) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_NilImpl.class)
			return lua__Expression_Nil((org.xtext.lua.lua.Expression_Nil) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_Not_EqualImpl.class)
			return lua__Expression_Not_Equal((org.xtext.lua.lua.Expression_Not_Equal) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_NumberImpl.class)
			return lua__Expression_Number((org.xtext.lua.lua.Expression_Number) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_OrImpl.class)
			return lua__Expression_Or((org.xtext.lua.lua.Expression_Or) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_PlusImpl.class)
			return lua__Expression_Plus((org.xtext.lua.lua.Expression_Plus) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_SmallerImpl.class)
			return lua__Expression_Smaller((org.xtext.lua.lua.Expression_Smaller) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_Smaller_EqualImpl.class)
			return lua__Expression_Smaller_Equal((org.xtext.lua.lua.Expression_Smaller_Equal) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_StringImpl.class)
			return lua__Expression_String((org.xtext.lua.lua.Expression_String) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_TableConstructorImpl.class)
			return lua__Expression_TableConstructor((org.xtext.lua.lua.Expression_TableConstructor) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_TrueImpl.class)
			return lua__Expression_True((org.xtext.lua.lua.Expression_True) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_VarArgsImpl.class)
			return lua__Expression_VarArgs((org.xtext.lua.lua.Expression_VarArgs) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Expression_VariableNameImpl.class)
			return lua__Expression_VariableName((org.xtext.lua.lua.Expression_VariableName) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Statement_AssignmentImpl.class)
			return lua__Statement_Assignment((org.xtext.lua.lua.Statement_Assignment) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Statement_CallFunctionImpl.class)
			return lua__Statement_CallFunction((org.xtext.lua.lua.Statement_CallFunction) it);
		if (it.getClass() == org.xtext.lua.lua.impl.Statement_CallMemberFunctionImpl.class)
			return lua__Statement_CallMemberFunction((org.xtext.lua.lua.Statement_CallMemberFunction) it);
		return lua__Statement_FunctioncallOrAssignment(it);
	}
	default Lua__Statement_GlobalFunction_DeclarationT $(final org.xtext.lua.lua.Statement_GlobalFunction_Declaration it) {
		return lua__Statement_GlobalFunction_Declaration(it);
	}
	default Lua__Statement_If_Then_ElseT $(final org.xtext.lua.lua.Statement_If_Then_Else it) {
		return lua__Statement_If_Then_Else(it);
	}
	default Lua__Statement_If_Then_Else_ElseIfPartT $(final org.xtext.lua.lua.Statement_If_Then_Else_ElseIfPart it) {
		return lua__Statement_If_Then_Else_ElseIfPart(it);
	}
	default Lua__Statement_LocalFunction_DeclarationT $(final org.xtext.lua.lua.Statement_LocalFunction_Declaration it) {
		return lua__Statement_LocalFunction_Declaration(it);
	}
	default Lua__Statement_Local_Variable_DeclarationT $(final org.xtext.lua.lua.Statement_Local_Variable_Declaration it) {
		return lua__Statement_Local_Variable_Declaration(it);
	}
	default Lua__Statement_RepeatT $(final org.xtext.lua.lua.Statement_Repeat it) {
		return lua__Statement_Repeat(it);
	}
	default Lua__Statement_WhileT $(final org.xtext.lua.lua.Statement_While it) {
		return lua__Statement_While(it);
	}
	default Activitydiagramruntime__TokenT $(final activitydiagramruntime.Token it) {
		if (it.getClass() == activitydiagramruntime.impl.ControlTokenImpl.class)
			return activitydiagramruntime__ControlToken((activitydiagramruntime.ControlToken) it);
		if (it.getClass() == activitydiagramruntime.impl.ForkedTokenImpl.class)
			return activitydiagramruntime__ForkedToken((activitydiagramruntime.ForkedToken) it);
		return null;
	}
	default Activitydiagramruntime__TraceT $(final activitydiagramruntime.Trace it) {
		return activitydiagramruntime__Trace(it);
	}
	default Activitydiagram__ValueT $(final activitydiagram.Value it) {
		if (it.getClass() == iotlua.impl.BooleanValueBindExpressionImpl.class)
			return iotlua__BooleanValueBindExpression((iotlua.BooleanValueBindExpression) it);
		if (it.getClass() == iotlua.impl.IntegerValueBindExpression_NumberImpl.class)
			return iotlua__IntegerValueBindExpression_Number((iotlua.IntegerValueBindExpression_Number) it);
		if (it.getClass() == iotlua.impl.ValueBindExpressionImpl.class)
			return iotlua__ValueBindExpression((iotlua.ValueBindExpression) it);
		return null;
	}
	default Iotlua__ValueBindExpressionT $(final iotlua.ValueBindExpression it) {
		return iotlua__ValueBindExpression(it);
	}
	default Activitydiagram__VariableT $(final activitydiagram.Variable it) {
		if (it.getClass() == iotlua.impl.BooleanVariableBindExpression_VariableNameImpl.class)
			return iotlua__BooleanVariableBindExpression_VariableName((iotlua.BooleanVariableBindExpression_VariableName) it);
		return null;
	}
}
