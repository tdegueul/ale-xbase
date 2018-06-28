package exec_iot_lua.revisitor.impl;

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
import activitydiagramruntime.Context;
import activitydiagramruntime.ControlToken;
import activitydiagramruntime.ForkedToken;
import activitydiagramruntime.Offer;
import activitydiagramruntime.Trace;
import exec_iot_lua.revisitor.operations.exec_iot_lua.ActionOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.ActivityEdgeOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.ActivityFinalNodeOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.ActivityNodeOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.ActivityOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.ActuatorOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.BlockOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.BoardOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.BooleanValueBindExpressionOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.BooleanValueOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.BooleanVariableBindStatement_AssignmentOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.BooleanVariableOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.ChunkOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.ContainedOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.ContainerOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.ContextOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.ControlFlowOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.ControlNodeOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.ControlTokenOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.DecisionNodeOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.ExceptionDefOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.ExecutableNodeOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.ExpOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.ExpressionBindOperationDefOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.ExpressionBindStatementOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.ExpressionOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Expression_AccessArrayOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Expression_AccessMemberOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Expression_AndOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Expression_CallFunctionOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Expression_CallMemberFunctionOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Expression_ConcatenationOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Expression_DivisionOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Expression_EqualOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Expression_ExponentiationOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Expression_FalseOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Expression_FunctionOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Expression_InvertOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Expression_LargerOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Expression_Larger_EqualOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Expression_LengthOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Expression_MinusOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Expression_ModuloOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Expression_MultiplicationOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Expression_NegateOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Expression_NilOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Expression_Not_EqualOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Expression_NumberOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Expression_OrOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Expression_PlusOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Expression_SmallerOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Expression_Smaller_EqualOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Expression_StringOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Expression_TableConstructorOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Expression_TrueOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Expression_VarArgsOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Expression_VariableNameOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.FieldIOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.FieldOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Field_AddEntryToTableOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Field_AddEntryToTable_BracketsOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Field_AppendEntryToTableOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.FinalNodeOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.ForkNodeOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.ForkedTokenOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.FunctionOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Functioncall_ArgumentsOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.HWCompOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.IDLTypeOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.IdlStmtBindBlockOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.IdlStmtOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.InitialNodeOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.InputOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.InputValueOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.IntegerValueBindExpression_NumberOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.IntegerValueOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.IntegerVariableBindStatement_AssignmentOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.IntegerVariableOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.IotActivityBindActivityOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.IotActivityOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.IotOperationDefBindOperationDefOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.IotOperationDefOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.JoinNodeOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.LastStatementOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.LastStatement_BreakOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.LastStatement_ReturnOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.LastStatement_ReturnWithValueOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.MergeNodeOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.NamedActivityOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.NamedElementOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.OfferOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.OpaqueActionOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.OperationDefOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.ParameterDefOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.PrimitiveDefOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.RuntimeDataOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.SensorOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.SketchOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.StatementOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Statement_AssignmentOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Statement_BlockOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Statement_CallFunctionOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Statement_CallMemberFunctionOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Statement_For_GenericOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Statement_For_NumericOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Statement_FunctioncallOrAssignmentOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Statement_GlobalFunction_DeclarationOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Statement_If_Then_ElseOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Statement_If_Then_Else_ElseIfPartOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Statement_LocalFunction_DeclarationOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Statement_Local_Variable_DeclarationOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Statement_RepeatOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.Statement_WhileOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.SystemOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.TokenOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.TraceOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.ValueBindExpressionOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.ValueOperation;
import exec_iot_lua.revisitor.operations.exec_iot_lua.VariableOperation;
import idlmm.ExceptionDef;
import idlmm.FieldI;
import idlmm.OperationDef;
import idlmm.ParameterDef;
import idlmm.PrimitiveDef;
import iot.Actuator;
import iot.Board;
import iot.Sensor;
import iot.Sketch;
import iot_lua.BooleanValueBindExpression;
import iot_lua.BooleanVariableBindStatement_Assignment;
import iot_lua.ExpressionBindOperationDef;
import iot_lua.ExpressionBindStatement;
import iot_lua.IdlStmtBindBlock;
import iot_lua.IntegerValueBindExpression_Number;
import iot_lua.IntegerVariableBindStatement_Assignment;
import iot_lua.IotActivityBindActivity;
import iot_lua.IotOperationDefBindOperationDef;
import iot_lua.RuntimeData;
import iot_lua.revisitor.Iot_luaRevisitor;
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
public interface Exec_iot_luaRevisitor extends Iot_luaRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, ActuatorOperation, BlockOperation, BoardOperation, BooleanValueOperation, BooleanValueBindExpressionOperation, BooleanVariableOperation, BooleanVariableBindStatement_AssignmentOperation, ChunkOperation, ContainedOperation, ContainerOperation, ContextOperation, ControlFlowOperation, ControlNodeOperation, ControlTokenOperation, DecisionNodeOperation, ExceptionDefOperation, ExecutableNodeOperation, ExpOperation, ExpressionOperation, ExpressionBindOperationDefOperation, ExpressionBindStatementOperation, Expression_AccessArrayOperation, Expression_AccessMemberOperation, Expression_AndOperation, Expression_CallFunctionOperation, Expression_CallMemberFunctionOperation, Expression_ConcatenationOperation, Expression_DivisionOperation, Expression_EqualOperation, Expression_ExponentiationOperation, Expression_FalseOperation, Expression_FunctionOperation, Expression_InvertOperation, Expression_LargerOperation, Expression_Larger_EqualOperation, Expression_LengthOperation, Expression_MinusOperation, Expression_ModuloOperation, Expression_MultiplicationOperation, Expression_NegateOperation, Expression_NilOperation, Expression_Not_EqualOperation, Expression_NumberOperation, Expression_OrOperation, Expression_PlusOperation, Expression_SmallerOperation, Expression_Smaller_EqualOperation, Expression_StringOperation, Expression_TableConstructorOperation, Expression_TrueOperation, Expression_VarArgsOperation, Expression_VariableNameOperation, FieldOperation, FieldIOperation, Field_AddEntryToTableOperation, Field_AddEntryToTable_BracketsOperation, Field_AppendEntryToTableOperation, FinalNodeOperation, ForkNodeOperation, ForkedTokenOperation, FunctionOperation, Functioncall_ArgumentsOperation, HWCompOperation, IDLTypeOperation, IdlStmtOperation, IdlStmtBindBlockOperation, InitialNodeOperation, InputOperation, InputValueOperation, IntegerValueOperation, IntegerValueBindExpression_NumberOperation, IntegerVariableOperation, IntegerVariableBindStatement_AssignmentOperation, IotActivityOperation, IotActivityBindActivityOperation, IotOperationDefOperation, IotOperationDefBindOperationDefOperation, JoinNodeOperation, LastStatementOperation, LastStatement_BreakOperation, LastStatement_ReturnOperation, LastStatement_ReturnWithValueOperation, MergeNodeOperation, NamedActivityOperation, NamedElementOperation, OfferOperation, OpaqueActionOperation, OperationDefOperation, ParameterDefOperation, PrimitiveDefOperation, RuntimeDataOperation, SensorOperation, SketchOperation, StatementOperation, Statement_AssignmentOperation, Statement_BlockOperation, Statement_CallFunctionOperation, Statement_CallMemberFunctionOperation, Statement_For_GenericOperation, Statement_For_NumericOperation, Statement_FunctioncallOrAssignmentOperation, Statement_GlobalFunction_DeclarationOperation, Statement_If_Then_ElseOperation, Statement_If_Then_Else_ElseIfPartOperation, Statement_LocalFunction_DeclarationOperation, Statement_Local_Variable_DeclarationOperation, Statement_RepeatOperation, Statement_WhileOperation, SystemOperation, TokenOperation, TraceOperation, ValueOperation, ValueBindExpressionOperation, VariableOperation> {
  @Override
  public default ActivityOperation activitydiagram__Activity(final Activity it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.ActivityOperationImpl(it, this);
  }
  
  @Override
  public default ActivityFinalNodeOperation activitydiagram__ActivityFinalNode(final ActivityFinalNode it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.ActivityFinalNodeOperationImpl(it, this);
  }
  
  @Override
  public default ActuatorOperation iot__Actuator(final Actuator it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.ActuatorOperationImpl(it, this);
  }
  
  @Override
  public default BlockOperation lua__Block(final Block it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.BlockOperationImpl(it, this);
  }
  
  @Override
  public default BoardOperation iot__Board(final Board it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.BoardOperationImpl(it, this);
  }
  
  @Override
  public default BooleanValueBindExpressionOperation iot_lua__BooleanValueBindExpression(final BooleanValueBindExpression it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.BooleanValueBindExpressionOperationImpl(it, this);
  }
  
  @Override
  public default BooleanVariableBindStatement_AssignmentOperation iot_lua__BooleanVariableBindStatement_Assignment(final BooleanVariableBindStatement_Assignment it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.BooleanVariableBindStatement_AssignmentOperationImpl(it, this);
  }
  
  @Override
  public default ChunkOperation lua__Chunk(final Chunk it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.ChunkOperationImpl(it, this);
  }
  
  @Override
  public default ContextOperation activitydiagramruntime__Context(final Context it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.ContextOperationImpl(it, this);
  }
  
  @Override
  public default ControlFlowOperation activitydiagram__ControlFlow(final ControlFlow it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.ControlFlowOperationImpl(it, this);
  }
  
  @Override
  public default ControlTokenOperation activitydiagramruntime__ControlToken(final ControlToken it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.ControlTokenOperationImpl(it, this);
  }
  
  @Override
  public default DecisionNodeOperation activitydiagram__DecisionNode(final DecisionNode it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.DecisionNodeOperationImpl(it, this);
  }
  
  @Override
  public default ExceptionDefOperation idlmm__ExceptionDef(final ExceptionDef it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.ExceptionDefOperationImpl(it, this);
  }
  
  @Override
  public default ExpressionOperation lua__Expression(final Expression it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.ExpressionOperationImpl(it, this);
  }
  
  @Override
  public default ExpressionBindOperationDefOperation iot_lua__ExpressionBindOperationDef(final ExpressionBindOperationDef it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.ExpressionBindOperationDefOperationImpl(it, this);
  }
  
  @Override
  public default ExpressionBindStatementOperation iot_lua__ExpressionBindStatement(final ExpressionBindStatement it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.ExpressionBindStatementOperationImpl(it, this);
  }
  
  @Override
  public default Expression_AccessArrayOperation lua__Expression_AccessArray(final Expression_AccessArray it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Expression_AccessArrayOperationImpl(it, this);
  }
  
  @Override
  public default Expression_AccessMemberOperation lua__Expression_AccessMember(final Expression_AccessMember it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Expression_AccessMemberOperationImpl(it, this);
  }
  
  @Override
  public default Expression_AndOperation lua__Expression_And(final Expression_And it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Expression_AndOperationImpl(it, this);
  }
  
  @Override
  public default Expression_CallFunctionOperation lua__Expression_CallFunction(final Expression_CallFunction it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Expression_CallFunctionOperationImpl(it, this);
  }
  
  @Override
  public default Expression_CallMemberFunctionOperation lua__Expression_CallMemberFunction(final Expression_CallMemberFunction it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Expression_CallMemberFunctionOperationImpl(it, this);
  }
  
  @Override
  public default Expression_ConcatenationOperation lua__Expression_Concatenation(final Expression_Concatenation it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Expression_ConcatenationOperationImpl(it, this);
  }
  
  @Override
  public default Expression_DivisionOperation lua__Expression_Division(final Expression_Division it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Expression_DivisionOperationImpl(it, this);
  }
  
  @Override
  public default Expression_EqualOperation lua__Expression_Equal(final Expression_Equal it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Expression_EqualOperationImpl(it, this);
  }
  
  @Override
  public default Expression_ExponentiationOperation lua__Expression_Exponentiation(final Expression_Exponentiation it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Expression_ExponentiationOperationImpl(it, this);
  }
  
  @Override
  public default Expression_FalseOperation lua__Expression_False(final Expression_False it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Expression_FalseOperationImpl(it, this);
  }
  
  @Override
  public default Expression_FunctionOperation lua__Expression_Function(final Expression_Function it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Expression_FunctionOperationImpl(it, this);
  }
  
  @Override
  public default Expression_InvertOperation lua__Expression_Invert(final Expression_Invert it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Expression_InvertOperationImpl(it, this);
  }
  
  @Override
  public default Expression_LargerOperation lua__Expression_Larger(final Expression_Larger it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Expression_LargerOperationImpl(it, this);
  }
  
  @Override
  public default Expression_Larger_EqualOperation lua__Expression_Larger_Equal(final Expression_Larger_Equal it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Expression_Larger_EqualOperationImpl(it, this);
  }
  
  @Override
  public default Expression_LengthOperation lua__Expression_Length(final Expression_Length it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Expression_LengthOperationImpl(it, this);
  }
  
  @Override
  public default Expression_MinusOperation lua__Expression_Minus(final Expression_Minus it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Expression_MinusOperationImpl(it, this);
  }
  
  @Override
  public default Expression_ModuloOperation lua__Expression_Modulo(final Expression_Modulo it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Expression_ModuloOperationImpl(it, this);
  }
  
  @Override
  public default Expression_MultiplicationOperation lua__Expression_Multiplication(final Expression_Multiplication it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Expression_MultiplicationOperationImpl(it, this);
  }
  
  @Override
  public default Expression_NegateOperation lua__Expression_Negate(final Expression_Negate it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Expression_NegateOperationImpl(it, this);
  }
  
  @Override
  public default Expression_NilOperation lua__Expression_Nil(final Expression_Nil it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Expression_NilOperationImpl(it, this);
  }
  
  @Override
  public default Expression_Not_EqualOperation lua__Expression_Not_Equal(final Expression_Not_Equal it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Expression_Not_EqualOperationImpl(it, this);
  }
  
  @Override
  public default Expression_NumberOperation lua__Expression_Number(final Expression_Number it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Expression_NumberOperationImpl(it, this);
  }
  
  @Override
  public default Expression_OrOperation lua__Expression_Or(final Expression_Or it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Expression_OrOperationImpl(it, this);
  }
  
  @Override
  public default Expression_PlusOperation lua__Expression_Plus(final Expression_Plus it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Expression_PlusOperationImpl(it, this);
  }
  
  @Override
  public default Expression_SmallerOperation lua__Expression_Smaller(final Expression_Smaller it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Expression_SmallerOperationImpl(it, this);
  }
  
  @Override
  public default Expression_Smaller_EqualOperation lua__Expression_Smaller_Equal(final Expression_Smaller_Equal it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Expression_Smaller_EqualOperationImpl(it, this);
  }
  
  @Override
  public default Expression_StringOperation lua__Expression_String(final Expression_String it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Expression_StringOperationImpl(it, this);
  }
  
  @Override
  public default Expression_TableConstructorOperation lua__Expression_TableConstructor(final Expression_TableConstructor it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Expression_TableConstructorOperationImpl(it, this);
  }
  
  @Override
  public default Expression_TrueOperation lua__Expression_True(final Expression_True it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Expression_TrueOperationImpl(it, this);
  }
  
  @Override
  public default Expression_VarArgsOperation lua__Expression_VarArgs(final Expression_VarArgs it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Expression_VarArgsOperationImpl(it, this);
  }
  
  @Override
  public default Expression_VariableNameOperation lua__Expression_VariableName(final Expression_VariableName it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Expression_VariableNameOperationImpl(it, this);
  }
  
  @Override
  public default FieldOperation lua__Field(final Field it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.FieldOperationImpl(it, this);
  }
  
  @Override
  public default FieldIOperation idlmm__FieldI(final FieldI it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.FieldIOperationImpl(it, this);
  }
  
  @Override
  public default Field_AddEntryToTableOperation lua__Field_AddEntryToTable(final Field_AddEntryToTable it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Field_AddEntryToTableOperationImpl(it, this);
  }
  
  @Override
  public default Field_AddEntryToTable_BracketsOperation lua__Field_AddEntryToTable_Brackets(final Field_AddEntryToTable_Brackets it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Field_AddEntryToTable_BracketsOperationImpl(it, this);
  }
  
  @Override
  public default Field_AppendEntryToTableOperation lua__Field_AppendEntryToTable(final Field_AppendEntryToTable it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Field_AppendEntryToTableOperationImpl(it, this);
  }
  
  @Override
  public default ForkNodeOperation activitydiagram__ForkNode(final ForkNode it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.ForkNodeOperationImpl(it, this);
  }
  
  @Override
  public default ForkedTokenOperation activitydiagramruntime__ForkedToken(final ForkedToken it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.ForkedTokenOperationImpl(it, this);
  }
  
  @Override
  public default FunctionOperation lua__Function(final Function it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.FunctionOperationImpl(it, this);
  }
  
  @Override
  public default Functioncall_ArgumentsOperation lua__Functioncall_Arguments(final Functioncall_Arguments it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Functioncall_ArgumentsOperationImpl(it, this);
  }
  
  @Override
  public default IdlStmtBindBlockOperation iot_lua__IdlStmtBindBlock(final IdlStmtBindBlock it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.IdlStmtBindBlockOperationImpl(it, this);
  }
  
  @Override
  public default InitialNodeOperation activitydiagram__InitialNode(final InitialNode it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.InitialNodeOperationImpl(it, this);
  }
  
  @Override
  public default InputOperation activitydiagram__Input(final Input it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.InputOperationImpl(it, this);
  }
  
  @Override
  public default InputValueOperation activitydiagram__InputValue(final InputValue it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.InputValueOperationImpl(it, this);
  }
  
  @Override
  public default IntegerValueBindExpression_NumberOperation iot_lua__IntegerValueBindExpression_Number(final IntegerValueBindExpression_Number it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.IntegerValueBindExpression_NumberOperationImpl(it, this);
  }
  
  @Override
  public default IntegerVariableBindStatement_AssignmentOperation iot_lua__IntegerVariableBindStatement_Assignment(final IntegerVariableBindStatement_Assignment it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.IntegerVariableBindStatement_AssignmentOperationImpl(it, this);
  }
  
  @Override
  public default IotActivityBindActivityOperation iot_lua__IotActivityBindActivity(final IotActivityBindActivity it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.IotActivityBindActivityOperationImpl(it, this);
  }
  
  @Override
  public default IotOperationDefBindOperationDefOperation iot_lua__IotOperationDefBindOperationDef(final IotOperationDefBindOperationDef it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.IotOperationDefBindOperationDefOperationImpl(it, this);
  }
  
  @Override
  public default JoinNodeOperation activitydiagram__JoinNode(final JoinNode it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.JoinNodeOperationImpl(it, this);
  }
  
  @Override
  public default LastStatementOperation lua__LastStatement(final LastStatement it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.LastStatementOperationImpl(it, this);
  }
  
  @Override
  public default LastStatement_BreakOperation lua__LastStatement_Break(final LastStatement_Break it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.LastStatement_BreakOperationImpl(it, this);
  }
  
  @Override
  public default LastStatement_ReturnOperation lua__LastStatement_Return(final LastStatement_Return it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.LastStatement_ReturnOperationImpl(it, this);
  }
  
  @Override
  public default LastStatement_ReturnWithValueOperation lua__LastStatement_ReturnWithValue(final LastStatement_ReturnWithValue it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.LastStatement_ReturnWithValueOperationImpl(it, this);
  }
  
  @Override
  public default MergeNodeOperation activitydiagram__MergeNode(final MergeNode it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.MergeNodeOperationImpl(it, this);
  }
  
  @Override
  public default OfferOperation activitydiagramruntime__Offer(final Offer it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.OfferOperationImpl(it, this);
  }
  
  @Override
  public default OpaqueActionOperation activitydiagram__OpaqueAction(final OpaqueAction it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.OpaqueActionOperationImpl(it, this);
  }
  
  @Override
  public default OperationDefOperation idlmm__OperationDef(final OperationDef it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.OperationDefOperationImpl(it, this);
  }
  
  @Override
  public default ParameterDefOperation idlmm__ParameterDef(final ParameterDef it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.ParameterDefOperationImpl(it, this);
  }
  
  @Override
  public default PrimitiveDefOperation idlmm__PrimitiveDef(final PrimitiveDef it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.PrimitiveDefOperationImpl(it, this);
  }
  
  @Override
  public default RuntimeDataOperation iot_lua__RuntimeData(final RuntimeData it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.RuntimeDataOperationImpl(it, this);
  }
  
  @Override
  public default SensorOperation iot__Sensor(final Sensor it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.SensorOperationImpl(it, this);
  }
  
  @Override
  public default SketchOperation iot__Sketch(final Sketch it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.SketchOperationImpl(it, this);
  }
  
  @Override
  public default StatementOperation lua__Statement(final Statement it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.StatementOperationImpl(it, this);
  }
  
  @Override
  public default Statement_AssignmentOperation lua__Statement_Assignment(final Statement_Assignment it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Statement_AssignmentOperationImpl(it, this);
  }
  
  @Override
  public default Statement_BlockOperation lua__Statement_Block(final Statement_Block it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Statement_BlockOperationImpl(it, this);
  }
  
  @Override
  public default Statement_CallFunctionOperation lua__Statement_CallFunction(final Statement_CallFunction it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Statement_CallFunctionOperationImpl(it, this);
  }
  
  @Override
  public default Statement_CallMemberFunctionOperation lua__Statement_CallMemberFunction(final Statement_CallMemberFunction it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Statement_CallMemberFunctionOperationImpl(it, this);
  }
  
  @Override
  public default Statement_For_GenericOperation lua__Statement_For_Generic(final Statement_For_Generic it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Statement_For_GenericOperationImpl(it, this);
  }
  
  @Override
  public default Statement_For_NumericOperation lua__Statement_For_Numeric(final Statement_For_Numeric it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Statement_For_NumericOperationImpl(it, this);
  }
  
  @Override
  public default Statement_FunctioncallOrAssignmentOperation lua__Statement_FunctioncallOrAssignment(final Statement_FunctioncallOrAssignment it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Statement_FunctioncallOrAssignmentOperationImpl(it, this);
  }
  
  @Override
  public default Statement_GlobalFunction_DeclarationOperation lua__Statement_GlobalFunction_Declaration(final Statement_GlobalFunction_Declaration it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Statement_GlobalFunction_DeclarationOperationImpl(it, this);
  }
  
  @Override
  public default Statement_If_Then_ElseOperation lua__Statement_If_Then_Else(final Statement_If_Then_Else it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Statement_If_Then_ElseOperationImpl(it, this);
  }
  
  @Override
  public default Statement_If_Then_Else_ElseIfPartOperation lua__Statement_If_Then_Else_ElseIfPart(final Statement_If_Then_Else_ElseIfPart it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Statement_If_Then_Else_ElseIfPartOperationImpl(it, this);
  }
  
  @Override
  public default Statement_LocalFunction_DeclarationOperation lua__Statement_LocalFunction_Declaration(final Statement_LocalFunction_Declaration it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Statement_LocalFunction_DeclarationOperationImpl(it, this);
  }
  
  @Override
  public default Statement_Local_Variable_DeclarationOperation lua__Statement_Local_Variable_Declaration(final Statement_Local_Variable_Declaration it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Statement_Local_Variable_DeclarationOperationImpl(it, this);
  }
  
  @Override
  public default Statement_RepeatOperation lua__Statement_Repeat(final Statement_Repeat it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Statement_RepeatOperationImpl(it, this);
  }
  
  @Override
  public default Statement_WhileOperation lua__Statement_While(final Statement_While it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.Statement_WhileOperationImpl(it, this);
  }
  
  @Override
  public default SystemOperation iot__System(final iot.System it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.SystemOperationImpl(it, this);
  }
  
  @Override
  public default TraceOperation activitydiagramruntime__Trace(final Trace it) {
    return new exec_iot_lua.revisitor.operations.exec_iot_lua.impl.TraceOperationImpl(it, this);
  }
}
