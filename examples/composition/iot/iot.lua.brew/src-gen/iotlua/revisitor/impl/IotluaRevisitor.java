package iotlua.revisitor.impl;

import activitydiagram.Activity;
import activitydiagram.ActivityFinalNode;
import activitydiagram.ControlFlow;
import activitydiagram.DecisionNode;
import activitydiagram.ForkNode;
import activitydiagram.InitialNode;
import activitydiagram.Input;
import activitydiagram.InputValue;
import activitydiagram.JoinNode;
import activitydiagram.MergeNode;
import activitydiagram.OpaqueAction;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ActionOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ActivityEdgeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ActivityFinalNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ActivityNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ActivityOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.BooleanValueOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.BooleanVariableOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ContextOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ControlFlowOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ControlNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ControlTokenOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.DecisionNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ExecutableNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ExpressionOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.FinalNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ForkNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ForkedTokenOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.InitialNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.InputOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.InputValueOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.IntegerValueOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.IntegerVariableOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.JoinNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.MergeNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.NamedElementOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.OfferOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.OpaqueActionOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.TokenOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.TraceOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ValueOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.VariableOperation;
import activitydiagramruntime.Context;
import activitydiagramruntime.ControlToken;
import activitydiagramruntime.ForkedToken;
import activitydiagramruntime.Offer;
import activitydiagramruntime.Trace;
import iotlua.BooleanValueBindExpression;
import iotlua.BooleanVariableBindStatement_Assignment;
import iotlua.ExpressionBindStatement;
import iotlua.IntegerValueBindExpression_Number;
import iotlua.IntegerVariableBindStatement_Assignment;
import iotlua.ValueBindExpression;
import iotlua.revisitor.operations.iotlua.BooleanValueBindExpressionOperation;
import iotlua.revisitor.operations.iotlua.BooleanVariableBindStatement_AssignmentOperation;
import iotlua.revisitor.operations.iotlua.ExpressionBindStatementOperation;
import iotlua.revisitor.operations.iotlua.IntegerValueBindExpression_NumberOperation;
import iotlua.revisitor.operations.iotlua.IntegerVariableBindStatement_AssignmentOperation;
import iotlua.revisitor.operations.iotlua.ValueBindExpressionOperation;
import lua_exec.revisitor.operations.lua_exec.BlockOperation;
import lua_exec.revisitor.operations.lua_exec.ChunkOperation;
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
public interface IotluaRevisitor extends iotlua.revisitor.IotluaRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, BlockOperation, BooleanValueOperation, BooleanValueBindExpressionOperation, BooleanVariableOperation, BooleanVariableBindStatement_AssignmentOperation, ChunkOperation, ContextOperation, ControlFlowOperation, ControlNodeOperation, ControlTokenOperation, DecisionNodeOperation, ExecutableNodeOperation, ExpressionOperation, lua_exec.revisitor.operations.lua_exec.ExpressionOperation, ExpressionBindStatementOperation, Expression_AccessArrayOperation, Expression_AccessMemberOperation, Expression_AndOperation, Expression_CallFunctionOperation, Expression_CallMemberFunctionOperation, Expression_ConcatenationOperation, Expression_DivisionOperation, Expression_EqualOperation, Expression_ExponentiationOperation, Expression_FalseOperation, Expression_FunctionOperation, Expression_InvertOperation, Expression_LargerOperation, Expression_Larger_EqualOperation, Expression_LengthOperation, Expression_MinusOperation, Expression_ModuloOperation, Expression_MultiplicationOperation, Expression_NegateOperation, Expression_NilOperation, Expression_Not_EqualOperation, Expression_NumberOperation, Expression_OrOperation, Expression_PlusOperation, Expression_SmallerOperation, Expression_Smaller_EqualOperation, Expression_StringOperation, Expression_TableConstructorOperation, Expression_TrueOperation, Expression_VarArgsOperation, Expression_VariableNameOperation, FieldOperation, Field_AddEntryToTableOperation, Field_AddEntryToTable_BracketsOperation, Field_AppendEntryToTableOperation, FinalNodeOperation, ForkNodeOperation, ForkedTokenOperation, FunctionOperation, Functioncall_ArgumentsOperation, InitialNodeOperation, InputOperation, InputValueOperation, IntegerValueOperation, IntegerValueBindExpression_NumberOperation, IntegerVariableOperation, IntegerVariableBindStatement_AssignmentOperation, JoinNodeOperation, LastStatementOperation, LastStatement_BreakOperation, LastStatement_ReturnOperation, LastStatement_ReturnWithValueOperation, MergeNodeOperation, NamedElementOperation, OfferOperation, OpaqueActionOperation, StatementOperation, Statement_AssignmentOperation, Statement_BlockOperation, Statement_CallFunctionOperation, Statement_CallMemberFunctionOperation, Statement_For_GenericOperation, Statement_For_NumericOperation, Statement_FunctioncallOrAssignmentOperation, Statement_GlobalFunction_DeclarationOperation, Statement_If_Then_ElseOperation, Statement_If_Then_Else_ElseIfPartOperation, Statement_LocalFunction_DeclarationOperation, Statement_Local_Variable_DeclarationOperation, Statement_RepeatOperation, Statement_WhileOperation, TokenOperation, TraceOperation, ValueOperation, ValueBindExpressionOperation, VariableOperation> {
  @Override
  public default ExpressionBindStatementOperation iotlua__ExpressionBindStatement(final ExpressionBindStatement it) {
    return new iotlua.revisitor.operations.iotlua.impl.ExpressionBindStatementOperationImpl(it, this);
  }
  
  @Override
  public default ValueBindExpressionOperation iotlua__ValueBindExpression(final ValueBindExpression it) {
    return new iotlua.revisitor.operations.iotlua.impl.ValueBindExpressionOperationImpl(it, this);
  }
  
  @Override
  public default BooleanValueBindExpressionOperation iotlua__BooleanValueBindExpression(final BooleanValueBindExpression it) {
    return new iotlua.revisitor.operations.iotlua.impl.BooleanValueBindExpressionOperationImpl(it, this);
  }
  
  @Override
  public default BooleanVariableBindStatement_AssignmentOperation iotlua__BooleanVariableBindStatement_Assignment(final BooleanVariableBindStatement_Assignment it) {
    return new iotlua.revisitor.operations.iotlua.impl.BooleanVariableBindStatement_AssignmentOperationImpl(it, this);
  }
  
  @Override
  public default IntegerVariableBindStatement_AssignmentOperation iotlua__IntegerVariableBindStatement_Assignment(final IntegerVariableBindStatement_Assignment it) {
    return new iotlua.revisitor.operations.iotlua.impl.IntegerVariableBindStatement_AssignmentOperationImpl(it, this);
  }
  
  @Override
  public default IntegerValueBindExpression_NumberOperation iotlua__IntegerValueBindExpression_Number(final IntegerValueBindExpression_Number it) {
    return new iotlua.revisitor.operations.iotlua.impl.IntegerValueBindExpression_NumberOperationImpl(it, this);
  }
  
  @Override
  public default ActivityOperation activitydiagram__Activity(final Activity it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.ActivityOperationImpl(it, this);
  }
  
  @Override
  public default ControlFlowOperation activitydiagram__ControlFlow(final ControlFlow it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.ControlFlowOperationImpl(it, this);
  }
  
  @Override
  public default OpaqueActionOperation activitydiagram__OpaqueAction(final OpaqueAction it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.OpaqueActionOperationImpl(it, this);
  }
  
  @Override
  public default InitialNodeOperation activitydiagram__InitialNode(final InitialNode it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.InitialNodeOperationImpl(it, this);
  }
  
  @Override
  public default ActivityFinalNodeOperation activitydiagram__ActivityFinalNode(final ActivityFinalNode it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.ActivityFinalNodeOperationImpl(it, this);
  }
  
  @Override
  public default ForkNodeOperation activitydiagram__ForkNode(final ForkNode it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.ForkNodeOperationImpl(it, this);
  }
  
  @Override
  public default JoinNodeOperation activitydiagram__JoinNode(final JoinNode it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.JoinNodeOperationImpl(it, this);
  }
  
  @Override
  public default MergeNodeOperation activitydiagram__MergeNode(final MergeNode it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.MergeNodeOperationImpl(it, this);
  }
  
  @Override
  public default DecisionNodeOperation activitydiagram__DecisionNode(final DecisionNode it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.DecisionNodeOperationImpl(it, this);
  }
  
  @Override
  public default InputValueOperation activitydiagram__InputValue(final InputValue it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.InputValueOperationImpl(it, this);
  }
  
  @Override
  public default InputOperation activitydiagram__Input(final Input it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.InputOperationImpl(it, this);
  }
  
  @Override
  public default ChunkOperation lua__Chunk(final Chunk it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.ChunkOperationImpl(it, this);
  }
  
  @Override
  public default BlockOperation lua__Block(final Block it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.BlockOperationImpl(it, this);
  }
  
  @Override
  public default LastStatementOperation lua__LastStatement(final LastStatement it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.LastStatementOperationImpl(it, this);
  }
  
  @Override
  public default LastStatement_ReturnOperation lua__LastStatement_Return(final LastStatement_Return it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.LastStatement_ReturnOperationImpl(it, this);
  }
  
  @Override
  public default LastStatement_BreakOperation lua__LastStatement_Break(final LastStatement_Break it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.LastStatement_BreakOperationImpl(it, this);
  }
  
  @Override
  public default StatementOperation lua__Statement(final Statement it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.StatementOperationImpl(it, this);
  }
  
  @Override
  public default Statement_BlockOperation lua__Statement_Block(final Statement_Block it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Statement_BlockOperationImpl(it, this);
  }
  
  @Override
  public default Statement_WhileOperation lua__Statement_While(final Statement_While it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Statement_WhileOperationImpl(it, this);
  }
  
  @Override
  public default Statement_RepeatOperation lua__Statement_Repeat(final Statement_Repeat it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Statement_RepeatOperationImpl(it, this);
  }
  
  @Override
  public default Statement_If_Then_ElseOperation lua__Statement_If_Then_Else(final Statement_If_Then_Else it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Statement_If_Then_ElseOperationImpl(it, this);
  }
  
  @Override
  public default Statement_If_Then_Else_ElseIfPartOperation lua__Statement_If_Then_Else_ElseIfPart(final Statement_If_Then_Else_ElseIfPart it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Statement_If_Then_Else_ElseIfPartOperationImpl(it, this);
  }
  
  @Override
  public default Statement_For_NumericOperation lua__Statement_For_Numeric(final Statement_For_Numeric it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Statement_For_NumericOperationImpl(it, this);
  }
  
  @Override
  public default Statement_For_GenericOperation lua__Statement_For_Generic(final Statement_For_Generic it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Statement_For_GenericOperationImpl(it, this);
  }
  
  @Override
  public default Statement_GlobalFunction_DeclarationOperation lua__Statement_GlobalFunction_Declaration(final Statement_GlobalFunction_Declaration it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Statement_GlobalFunction_DeclarationOperationImpl(it, this);
  }
  
  @Override
  public default Statement_LocalFunction_DeclarationOperation lua__Statement_LocalFunction_Declaration(final Statement_LocalFunction_Declaration it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Statement_LocalFunction_DeclarationOperationImpl(it, this);
  }
  
  @Override
  public default Statement_Local_Variable_DeclarationOperation lua__Statement_Local_Variable_Declaration(final Statement_Local_Variable_Declaration it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Statement_Local_Variable_DeclarationOperationImpl(it, this);
  }
  
  @Override
  public default Statement_FunctioncallOrAssignmentOperation lua__Statement_FunctioncallOrAssignment(final Statement_FunctioncallOrAssignment it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Statement_FunctioncallOrAssignmentOperationImpl(it, this);
  }
  
  @Override
  public default lua_exec.revisitor.operations.lua_exec.ExpressionOperation lua__Expression(final Expression it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.ExpressionOperationImpl(it, this);
  }
  
  @Override
  public default Expression_NilOperation lua__Expression_Nil(final Expression_Nil it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Expression_NilOperationImpl(it, this);
  }
  
  @Override
  public default Expression_TrueOperation lua__Expression_True(final Expression_True it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Expression_TrueOperationImpl(it, this);
  }
  
  @Override
  public default Expression_FalseOperation lua__Expression_False(final Expression_False it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Expression_FalseOperationImpl(it, this);
  }
  
  @Override
  public default Expression_NumberOperation lua__Expression_Number(final Expression_Number it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Expression_NumberOperationImpl(it, this);
  }
  
  @Override
  public default Expression_VarArgsOperation lua__Expression_VarArgs(final Expression_VarArgs it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Expression_VarArgsOperationImpl(it, this);
  }
  
  @Override
  public default Expression_StringOperation lua__Expression_String(final Expression_String it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Expression_StringOperationImpl(it, this);
  }
  
  @Override
  public default Expression_FunctionOperation lua__Expression_Function(final Expression_Function it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Expression_FunctionOperationImpl(it, this);
  }
  
  @Override
  public default Expression_TableConstructorOperation lua__Expression_TableConstructor(final Expression_TableConstructor it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Expression_TableConstructorOperationImpl(it, this);
  }
  
  @Override
  public default FunctionOperation lua__Function(final Function it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.FunctionOperationImpl(it, this);
  }
  
  @Override
  public default Functioncall_ArgumentsOperation lua__Functioncall_Arguments(final Functioncall_Arguments it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Functioncall_ArgumentsOperationImpl(it, this);
  }
  
  @Override
  public default FieldOperation lua__Field(final Field it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.FieldOperationImpl(it, this);
  }
  
  @Override
  public default Field_AddEntryToTable_BracketsOperation lua__Field_AddEntryToTable_Brackets(final Field_AddEntryToTable_Brackets it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Field_AddEntryToTable_BracketsOperationImpl(it, this);
  }
  
  @Override
  public default Field_AddEntryToTableOperation lua__Field_AddEntryToTable(final Field_AddEntryToTable it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Field_AddEntryToTableOperationImpl(it, this);
  }
  
  @Override
  public default Field_AppendEntryToTableOperation lua__Field_AppendEntryToTable(final Field_AppendEntryToTable it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Field_AppendEntryToTableOperationImpl(it, this);
  }
  
  @Override
  public default LastStatement_ReturnWithValueOperation lua__LastStatement_ReturnWithValue(final LastStatement_ReturnWithValue it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.LastStatement_ReturnWithValueOperationImpl(it, this);
  }
  
  @Override
  public default Statement_AssignmentOperation lua__Statement_Assignment(final Statement_Assignment it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Statement_AssignmentOperationImpl(it, this);
  }
  
  @Override
  public default Statement_CallMemberFunctionOperation lua__Statement_CallMemberFunction(final Statement_CallMemberFunction it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Statement_CallMemberFunctionOperationImpl(it, this);
  }
  
  @Override
  public default Statement_CallFunctionOperation lua__Statement_CallFunction(final Statement_CallFunction it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Statement_CallFunctionOperationImpl(it, this);
  }
  
  @Override
  public default Expression_OrOperation lua__Expression_Or(final Expression_Or it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Expression_OrOperationImpl(it, this);
  }
  
  @Override
  public default Expression_AndOperation lua__Expression_And(final Expression_And it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Expression_AndOperationImpl(it, this);
  }
  
  @Override
  public default Expression_LargerOperation lua__Expression_Larger(final Expression_Larger it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Expression_LargerOperationImpl(it, this);
  }
  
  @Override
  public default Expression_Larger_EqualOperation lua__Expression_Larger_Equal(final Expression_Larger_Equal it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Expression_Larger_EqualOperationImpl(it, this);
  }
  
  @Override
  public default Expression_SmallerOperation lua__Expression_Smaller(final Expression_Smaller it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Expression_SmallerOperationImpl(it, this);
  }
  
  @Override
  public default Expression_Smaller_EqualOperation lua__Expression_Smaller_Equal(final Expression_Smaller_Equal it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Expression_Smaller_EqualOperationImpl(it, this);
  }
  
  @Override
  public default Expression_EqualOperation lua__Expression_Equal(final Expression_Equal it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Expression_EqualOperationImpl(it, this);
  }
  
  @Override
  public default Expression_Not_EqualOperation lua__Expression_Not_Equal(final Expression_Not_Equal it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Expression_Not_EqualOperationImpl(it, this);
  }
  
  @Override
  public default Expression_ConcatenationOperation lua__Expression_Concatenation(final Expression_Concatenation it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Expression_ConcatenationOperationImpl(it, this);
  }
  
  @Override
  public default Expression_PlusOperation lua__Expression_Plus(final Expression_Plus it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Expression_PlusOperationImpl(it, this);
  }
  
  @Override
  public default Expression_MinusOperation lua__Expression_Minus(final Expression_Minus it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Expression_MinusOperationImpl(it, this);
  }
  
  @Override
  public default Expression_MultiplicationOperation lua__Expression_Multiplication(final Expression_Multiplication it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Expression_MultiplicationOperationImpl(it, this);
  }
  
  @Override
  public default Expression_DivisionOperation lua__Expression_Division(final Expression_Division it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Expression_DivisionOperationImpl(it, this);
  }
  
  @Override
  public default Expression_ModuloOperation lua__Expression_Modulo(final Expression_Modulo it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Expression_ModuloOperationImpl(it, this);
  }
  
  @Override
  public default Expression_NegateOperation lua__Expression_Negate(final Expression_Negate it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Expression_NegateOperationImpl(it, this);
  }
  
  @Override
  public default Expression_LengthOperation lua__Expression_Length(final Expression_Length it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Expression_LengthOperationImpl(it, this);
  }
  
  @Override
  public default Expression_InvertOperation lua__Expression_Invert(final Expression_Invert it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Expression_InvertOperationImpl(it, this);
  }
  
  @Override
  public default Expression_ExponentiationOperation lua__Expression_Exponentiation(final Expression_Exponentiation it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Expression_ExponentiationOperationImpl(it, this);
  }
  
  @Override
  public default Expression_CallMemberFunctionOperation lua__Expression_CallMemberFunction(final Expression_CallMemberFunction it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Expression_CallMemberFunctionOperationImpl(it, this);
  }
  
  @Override
  public default Expression_CallFunctionOperation lua__Expression_CallFunction(final Expression_CallFunction it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Expression_CallFunctionOperationImpl(it, this);
  }
  
  @Override
  public default Expression_AccessArrayOperation lua__Expression_AccessArray(final Expression_AccessArray it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Expression_AccessArrayOperationImpl(it, this);
  }
  
  @Override
  public default Expression_AccessMemberOperation lua__Expression_AccessMember(final Expression_AccessMember it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Expression_AccessMemberOperationImpl(it, this);
  }
  
  @Override
  public default Expression_VariableNameOperation lua__Expression_VariableName(final Expression_VariableName it) {
    return new lua_exec.revisitor.operations.lua_exec.impl.Expression_VariableNameOperationImpl(it, this);
  }
  
  @Override
  public default OfferOperation activitydiagramruntime__Offer(final Offer it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.OfferOperationImpl(it, this);
  }
  
  @Override
  public default ContextOperation activitydiagramruntime__Context(final Context it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.ContextOperationImpl(it, this);
  }
  
  @Override
  public default TraceOperation activitydiagramruntime__Trace(final Trace it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.TraceOperationImpl(it, this);
  }
  
  @Override
  public default ControlTokenOperation activitydiagramruntime__ControlToken(final ControlToken it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.ControlTokenOperationImpl(it, this);
  }
  
  @Override
  public default ForkedTokenOperation activitydiagramruntime__ForkedToken(final ForkedToken it) {
    return new activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.ForkedTokenOperationImpl(it, this);
  }
}
