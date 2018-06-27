package lua_exec.revisitor.operations.lua_exec.impl;

import java.util.ArrayList;
import java.util.function.Consumer;
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
import lua_exec.revisitor.operations.lua_exec.impl.Statement_FunctioncallOrAssignmentOperationImpl;
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
  
  private LuaRevisitor<? extends BlockOperation, ? extends ChunkOperation, ? extends ExpressionOperation, ? extends Expression_AccessArrayOperation, ? extends Expression_AccessMemberOperation, ? extends Expression_AndOperation, ? extends Expression_CallFunctionOperation, ? extends Expression_CallMemberFunctionOperation, ? extends Expression_ConcatenationOperation, ? extends Expression_DivisionOperation, ? extends Expression_EqualOperation, ? extends Expression_ExponentiationOperation, ? extends Expression_FalseOperation, ? extends Expression_FunctionOperation, ? extends Expression_InvertOperation, ? extends Expression_LargerOperation, ? extends Expression_Larger_EqualOperation, ? extends Expression_LengthOperation, ? extends Expression_MinusOperation, ? extends Expression_ModuloOperation, ? extends Expression_MultiplicationOperation, ? extends Expression_NegateOperation, ? extends Expression_NilOperation, ? extends Expression_Not_EqualOperation, ? extends Expression_NumberOperation, ? extends Expression_OrOperation, ? extends Expression_PlusOperation, ? extends Expression_SmallerOperation, ? extends Expression_Smaller_EqualOperation, ? extends Expression_StringOperation, ? extends Expression_TableConstructorOperation, ? extends Expression_TrueOperation, ? extends Expression_VarArgsOperation, ? extends Expression_VariableNameOperation, ? extends FieldOperation, ? extends Field_AddEntryToTableOperation, ? extends Field_AddEntryToTable_BracketsOperation, ? extends Field_AppendEntryToTableOperation, ? extends FunctionOperation, ? extends Functioncall_ArgumentsOperation, ? extends LastStatementOperation, ? extends LastStatement_BreakOperation, ? extends LastStatement_ReturnOperation, ? extends LastStatement_ReturnWithValueOperation, ? extends StatementOperation, ? extends Statement_AssignmentOperation, ? extends Statement_BlockOperation, ? extends Statement_CallFunctionOperation, ? extends Statement_CallMemberFunctionOperation, ? extends Statement_For_GenericOperation, ? extends Statement_For_NumericOperation, ? extends Statement_FunctioncallOrAssignmentOperation, ? extends Statement_GlobalFunction_DeclarationOperation, ? extends Statement_If_Then_ElseOperation, ? extends Statement_If_Then_Else_ElseIfPartOperation, ? extends Statement_LocalFunction_DeclarationOperation, ? extends Statement_Local_Variable_DeclarationOperation, ? extends Statement_RepeatOperation, ? extends Statement_WhileOperation> alg;
  
  public Statement_CallFunctionOperationImpl(final Statement_CallFunction obj, final LuaRevisitor<? extends BlockOperation, ? extends ChunkOperation, ? extends ExpressionOperation, ? extends Expression_AccessArrayOperation, ? extends Expression_AccessMemberOperation, ? extends Expression_AndOperation, ? extends Expression_CallFunctionOperation, ? extends Expression_CallMemberFunctionOperation, ? extends Expression_ConcatenationOperation, ? extends Expression_DivisionOperation, ? extends Expression_EqualOperation, ? extends Expression_ExponentiationOperation, ? extends Expression_FalseOperation, ? extends Expression_FunctionOperation, ? extends Expression_InvertOperation, ? extends Expression_LargerOperation, ? extends Expression_Larger_EqualOperation, ? extends Expression_LengthOperation, ? extends Expression_MinusOperation, ? extends Expression_ModuloOperation, ? extends Expression_MultiplicationOperation, ? extends Expression_NegateOperation, ? extends Expression_NilOperation, ? extends Expression_Not_EqualOperation, ? extends Expression_NumberOperation, ? extends Expression_OrOperation, ? extends Expression_PlusOperation, ? extends Expression_SmallerOperation, ? extends Expression_Smaller_EqualOperation, ? extends Expression_StringOperation, ? extends Expression_TableConstructorOperation, ? extends Expression_TrueOperation, ? extends Expression_VarArgsOperation, ? extends Expression_VariableNameOperation, ? extends FieldOperation, ? extends Field_AddEntryToTableOperation, ? extends Field_AddEntryToTable_BracketsOperation, ? extends Field_AppendEntryToTableOperation, ? extends FunctionOperation, ? extends Functioncall_ArgumentsOperation, ? extends LastStatementOperation, ? extends LastStatement_BreakOperation, ? extends LastStatement_ReturnOperation, ? extends LastStatement_ReturnWithValueOperation, ? extends StatementOperation, ? extends Statement_AssignmentOperation, ? extends Statement_BlockOperation, ? extends Statement_CallFunctionOperation, ? extends Statement_CallMemberFunctionOperation, ? extends Statement_For_GenericOperation, ? extends Statement_For_NumericOperation, ? extends Statement_FunctioncallOrAssignmentOperation, ? extends Statement_GlobalFunction_DeclarationOperation, ? extends Statement_If_Then_ElseOperation, ? extends Statement_If_Then_Else_ElseIfPartOperation, ? extends Statement_LocalFunction_DeclarationOperation, ? extends Statement_Local_Variable_DeclarationOperation, ? extends Statement_RepeatOperation, ? extends Statement_WhileOperation> alg) {
    super(obj, null);
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
