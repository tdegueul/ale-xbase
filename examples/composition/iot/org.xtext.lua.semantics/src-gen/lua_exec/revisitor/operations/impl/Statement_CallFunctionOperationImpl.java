package lua_exec.revisitor.operations.impl;

import java.util.ArrayList;
import java.util.function.Consumer;
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
import lua_exec.revisitor.operations.impl.Statement_FunctioncallOrAssignmentOperationImpl;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.xtext.lua.lua.Expression;
import org.xtext.lua.lua.Expression_VariableName;
import org.xtext.lua.lua.Function;
import org.xtext.lua.lua.Statement_CallFunction;
import org.xtext.lua.semantics.model.Environment;

@SuppressWarnings("all")
public class Statement_CallFunctionOperationImpl extends Statement_FunctioncallOrAssignmentOperationImpl implements Statement_CallFunctionOperation {
  private Statement_CallFunction obj;
  
  private LuaRevisitor<BlockOperation, ChunkOperation, ExpressionOperation, Expression_AccessArrayOperation, Expression_AccessMemberOperation, Expression_AndOperation, Expression_CallFunctionOperation, Expression_CallMemberFunctionOperation, Expression_ConcatenationOperation, Expression_DivisionOperation, Expression_EqualOperation, Expression_ExponentiationOperation, Expression_FalseOperation, Expression_FunctionOperation, Expression_InvertOperation, Expression_LargerOperation, Expression_Larger_EqualOperation, Expression_LengthOperation, Expression_MinusOperation, Expression_ModuloOperation, Expression_MultiplicationOperation, Expression_NegateOperation, Expression_NilOperation, Expression_Not_EqualOperation, Expression_NumberOperation, Expression_OrOperation, Expression_PlusOperation, Expression_SmallerOperation, Expression_Smaller_EqualOperation, Expression_StringOperation, Expression_TableConstructorOperation, Expression_TrueOperation, Expression_VarArgsOperation, Expression_VariableNameOperation, FieldOperation, Field_AddEntryToTableOperation, Field_AddEntryToTable_BracketsOperation, Field_AppendEntryToTableOperation, FunctionOperation, Functioncall_ArgumentsOperation, LastStatementOperation, LastStatement_BreakOperation, LastStatement_ReturnOperation, LastStatement_ReturnWithValueOperation, StatementOperation, Statement_AssignmentOperation, Statement_BlockOperation, Statement_CallFunctionOperation, Statement_CallMemberFunctionOperation, Statement_For_GenericOperation, Statement_For_NumericOperation, Statement_FunctioncallOrAssignmentOperation, Statement_GlobalFunction_DeclarationOperation, Statement_If_Then_ElseOperation, Statement_If_Then_Else_ElseIfPartOperation, Statement_LocalFunction_DeclarationOperation, Statement_Local_Variable_DeclarationOperation, Statement_RepeatOperation, Statement_WhileOperation> alg;
  
  public Statement_CallFunctionOperationImpl(final Statement_CallFunction obj, final LuaRevisitor<BlockOperation, ChunkOperation, ExpressionOperation, Expression_AccessArrayOperation, Expression_AccessMemberOperation, Expression_AndOperation, Expression_CallFunctionOperation, Expression_CallMemberFunctionOperation, Expression_ConcatenationOperation, Expression_DivisionOperation, Expression_EqualOperation, Expression_ExponentiationOperation, Expression_FalseOperation, Expression_FunctionOperation, Expression_InvertOperation, Expression_LargerOperation, Expression_Larger_EqualOperation, Expression_LengthOperation, Expression_MinusOperation, Expression_ModuloOperation, Expression_MultiplicationOperation, Expression_NegateOperation, Expression_NilOperation, Expression_Not_EqualOperation, Expression_NumberOperation, Expression_OrOperation, Expression_PlusOperation, Expression_SmallerOperation, Expression_Smaller_EqualOperation, Expression_StringOperation, Expression_TableConstructorOperation, Expression_TrueOperation, Expression_VarArgsOperation, Expression_VariableNameOperation, FieldOperation, Field_AddEntryToTableOperation, Field_AddEntryToTable_BracketsOperation, Field_AppendEntryToTableOperation, FunctionOperation, Functioncall_ArgumentsOperation, LastStatementOperation, LastStatement_BreakOperation, LastStatement_ReturnOperation, LastStatement_ReturnWithValueOperation, StatementOperation, Statement_AssignmentOperation, Statement_BlockOperation, Statement_CallFunctionOperation, Statement_CallMemberFunctionOperation, Statement_For_GenericOperation, Statement_For_NumericOperation, Statement_FunctioncallOrAssignmentOperation, Statement_GlobalFunction_DeclarationOperation, Statement_If_Then_ElseOperation, Statement_If_Then_Else_ElseIfPartOperation, Statement_LocalFunction_DeclarationOperation, Statement_Local_Variable_DeclarationOperation, Statement_RepeatOperation, Statement_WhileOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void execute(final Environment c) {
    try {
      final Expression x = this.obj.getObject();
      boolean _matched = false;
      if (x instanceof Expression_VariableName) {
        boolean _equals = ((Expression_VariableName)x).getVariable().equals("print");
        if (_equals) {
          _matched=true;
          this.alg.$(this.obj.getArguments().getArguments().get(0)).execute(c);
          InputOutput.<Object>print(c.popValue());
          return;
        }
      }
      if (!_matched) {
        if (x instanceof Expression_VariableName) {
          boolean _equals = ((Expression_VariableName)x).getVariable().equals("println");
          if (_equals) {
            _matched=true;
            this.alg.$(this.obj.getArguments().getArguments().get(0)).execute(c);
            InputOutput.<Object>println(c.popValue());
            return;
          }
        }
      }
      if (!_matched) {
        if (x instanceof Expression_VariableName) {
          boolean _equals = ((Expression_VariableName)x).getVariable().equals("sleep");
          if (_equals) {
            _matched=true;
            this.alg.$(this.obj.getArguments().getArguments().get(0)).execute(c);
            final int sleep = Double.valueOf(Double.parseDouble(c.popValue().toString())).intValue();
            Thread.sleep(sleep);
            return;
          }
        }
      }
      Expression _object = this.obj.getObject();
      if ((_object instanceof Expression_VariableName)) {
        Expression _object_1 = this.obj.getObject();
        final Function function = c.getFunction(((Expression_VariableName) _object_1).getVariable());
        if ((function != null)) {
          final ArrayList<Object> params = CollectionLiterals.<Object>newArrayList();
          final Consumer<Expression> _function = (Expression args) -> {
            this.alg.$(args).execute(c);
            params.add(c.popValue());
          };
          this.obj.getArguments().getArguments().forEach(_function);
          final Environment newC = new Environment();
          newC.setParent(c);
          newC.putAllVariables(c.getVariables());
          newC.putAllFunctions(c.getFunctions());
          newC.pushAllValues(c.getValues());
          for (int i = 0; (i < function.getParameters().size()); i++) {
            newC.putVariable(function.getParameters().get(i), params.get(i));
          }
          this.alg.$(function.getBody()).execute(newC);
          c.pushValue(newC.popValue());
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
