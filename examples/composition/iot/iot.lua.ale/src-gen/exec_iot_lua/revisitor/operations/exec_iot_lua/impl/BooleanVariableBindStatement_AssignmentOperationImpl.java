package exec_iot_lua.revisitor.operations.exec_iot_lua.impl;

import activitydiagram.Activity;
import activitydiagram.BooleanValue;
import activitydiagram.InputValue;
import activitydiagram.Value;
import activitydiagram.Variable;
import activitydiagramruntime.Context;
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
import iot_lua.BooleanVariableBindStatement_Assignment;
import iot_lua.revisitor.Iot_luaRevisitor;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;
import org.xtext.lua.lua.Expression;
import org.xtext.lua.lua.Expression_VariableName;
import org.xtext.lua.lua.Statement_Assignment;
import org.xtext.lua.lua.Statement_FunctioncallOrAssignment;
import org.xtext.lua.semantics.model.Environment;

@SuppressWarnings("all")
public class BooleanVariableBindStatement_AssignmentOperationImpl implements BooleanVariableBindStatement_AssignmentOperation {
  private BooleanVariableBindStatement_Assignment obj;
  
  private Iot_luaRevisitor<? extends ActionOperation, ? extends ActivityOperation, ? extends ActivityEdgeOperation, ? extends ActivityFinalNodeOperation, ? extends ActivityNodeOperation, ? extends ActuatorOperation, ? extends BlockOperation, ? extends BoardOperation, ? extends BooleanValueOperation, ? extends BooleanValueBindExpressionOperation, ? extends BooleanVariableOperation, ? extends BooleanVariableBindStatement_AssignmentOperation, ? extends ChunkOperation, ? extends ContainedOperation, ? extends ContainerOperation, ? extends ContextOperation, ? extends ControlFlowOperation, ? extends ControlNodeOperation, ? extends ControlTokenOperation, ? extends DecisionNodeOperation, ? extends ExceptionDefOperation, ? extends ExecutableNodeOperation, ? extends ExpOperation, ? extends ExpressionOperation, ? extends ExpressionBindOperationDefOperation, ? extends ExpressionBindStatementOperation, ? extends Expression_AccessArrayOperation, ? extends Expression_AccessMemberOperation, ? extends Expression_AndOperation, ? extends Expression_CallFunctionOperation, ? extends Expression_CallMemberFunctionOperation, ? extends Expression_ConcatenationOperation, ? extends Expression_DivisionOperation, ? extends Expression_EqualOperation, ? extends Expression_ExponentiationOperation, ? extends Expression_FalseOperation, ? extends Expression_FunctionOperation, ? extends Expression_InvertOperation, ? extends Expression_LargerOperation, ? extends Expression_Larger_EqualOperation, ? extends Expression_LengthOperation, ? extends Expression_MinusOperation, ? extends Expression_ModuloOperation, ? extends Expression_MultiplicationOperation, ? extends Expression_NegateOperation, ? extends Expression_NilOperation, ? extends Expression_Not_EqualOperation, ? extends Expression_NumberOperation, ? extends Expression_OrOperation, ? extends Expression_PlusOperation, ? extends Expression_SmallerOperation, ? extends Expression_Smaller_EqualOperation, ? extends Expression_StringOperation, ? extends Expression_TableConstructorOperation, ? extends Expression_TrueOperation, ? extends Expression_VarArgsOperation, ? extends Expression_VariableNameOperation, ? extends FieldOperation, ? extends FieldIOperation, ? extends Field_AddEntryToTableOperation, ? extends Field_AddEntryToTable_BracketsOperation, ? extends Field_AppendEntryToTableOperation, ? extends FinalNodeOperation, ? extends ForkNodeOperation, ? extends ForkedTokenOperation, ? extends FunctionOperation, ? extends Functioncall_ArgumentsOperation, ? extends HWCompOperation, ? extends IDLTypeOperation, ? extends IdlStmtOperation, ? extends IdlStmtBindBlockOperation, ? extends InitialNodeOperation, ? extends InputOperation, ? extends InputValueOperation, ? extends IntegerValueOperation, ? extends IntegerValueBindExpression_NumberOperation, ? extends IntegerVariableOperation, ? extends IntegerVariableBindStatement_AssignmentOperation, ? extends IotActivityOperation, ? extends IotActivityBindActivityOperation, ? extends IotOperationDefOperation, ? extends IotOperationDefBindOperationDefOperation, ? extends JoinNodeOperation, ? extends LastStatementOperation, ? extends LastStatement_BreakOperation, ? extends LastStatement_ReturnOperation, ? extends LastStatement_ReturnWithValueOperation, ? extends MergeNodeOperation, ? extends NamedActivityOperation, ? extends NamedElementOperation, ? extends OfferOperation, ? extends OpaqueActionOperation, ? extends OperationDefOperation, ? extends ParameterDefOperation, ? extends PrimitiveDefOperation, ? extends RuntimeDataOperation, ? extends SensorOperation, ? extends SketchOperation, ? extends StatementOperation, ? extends Statement_AssignmentOperation, ? extends Statement_BlockOperation, ? extends Statement_CallFunctionOperation, ? extends Statement_CallMemberFunctionOperation, ? extends Statement_For_GenericOperation, ? extends Statement_For_NumericOperation, ? extends Statement_FunctioncallOrAssignmentOperation, ? extends Statement_GlobalFunction_DeclarationOperation, ? extends Statement_If_Then_ElseOperation, ? extends Statement_If_Then_Else_ElseIfPartOperation, ? extends Statement_LocalFunction_DeclarationOperation, ? extends Statement_Local_Variable_DeclarationOperation, ? extends Statement_RepeatOperation, ? extends Statement_WhileOperation, ? extends SystemOperation, ? extends TokenOperation, ? extends TraceOperation, ? extends ValueOperation, ? extends ValueBindExpressionOperation, ? extends VariableOperation> alg;
  
  public BooleanVariableBindStatement_AssignmentOperationImpl(final BooleanVariableBindStatement_Assignment obj, final Iot_luaRevisitor<? extends ActionOperation, ? extends ActivityOperation, ? extends ActivityEdgeOperation, ? extends ActivityFinalNodeOperation, ? extends ActivityNodeOperation, ? extends ActuatorOperation, ? extends BlockOperation, ? extends BoardOperation, ? extends BooleanValueOperation, ? extends BooleanValueBindExpressionOperation, ? extends BooleanVariableOperation, ? extends BooleanVariableBindStatement_AssignmentOperation, ? extends ChunkOperation, ? extends ContainedOperation, ? extends ContainerOperation, ? extends ContextOperation, ? extends ControlFlowOperation, ? extends ControlNodeOperation, ? extends ControlTokenOperation, ? extends DecisionNodeOperation, ? extends ExceptionDefOperation, ? extends ExecutableNodeOperation, ? extends ExpOperation, ? extends ExpressionOperation, ? extends ExpressionBindOperationDefOperation, ? extends ExpressionBindStatementOperation, ? extends Expression_AccessArrayOperation, ? extends Expression_AccessMemberOperation, ? extends Expression_AndOperation, ? extends Expression_CallFunctionOperation, ? extends Expression_CallMemberFunctionOperation, ? extends Expression_ConcatenationOperation, ? extends Expression_DivisionOperation, ? extends Expression_EqualOperation, ? extends Expression_ExponentiationOperation, ? extends Expression_FalseOperation, ? extends Expression_FunctionOperation, ? extends Expression_InvertOperation, ? extends Expression_LargerOperation, ? extends Expression_Larger_EqualOperation, ? extends Expression_LengthOperation, ? extends Expression_MinusOperation, ? extends Expression_ModuloOperation, ? extends Expression_MultiplicationOperation, ? extends Expression_NegateOperation, ? extends Expression_NilOperation, ? extends Expression_Not_EqualOperation, ? extends Expression_NumberOperation, ? extends Expression_OrOperation, ? extends Expression_PlusOperation, ? extends Expression_SmallerOperation, ? extends Expression_Smaller_EqualOperation, ? extends Expression_StringOperation, ? extends Expression_TableConstructorOperation, ? extends Expression_TrueOperation, ? extends Expression_VarArgsOperation, ? extends Expression_VariableNameOperation, ? extends FieldOperation, ? extends FieldIOperation, ? extends Field_AddEntryToTableOperation, ? extends Field_AddEntryToTable_BracketsOperation, ? extends Field_AppendEntryToTableOperation, ? extends FinalNodeOperation, ? extends ForkNodeOperation, ? extends ForkedTokenOperation, ? extends FunctionOperation, ? extends Functioncall_ArgumentsOperation, ? extends HWCompOperation, ? extends IDLTypeOperation, ? extends IdlStmtOperation, ? extends IdlStmtBindBlockOperation, ? extends InitialNodeOperation, ? extends InputOperation, ? extends InputValueOperation, ? extends IntegerValueOperation, ? extends IntegerValueBindExpression_NumberOperation, ? extends IntegerVariableOperation, ? extends IntegerVariableBindStatement_AssignmentOperation, ? extends IotActivityOperation, ? extends IotActivityBindActivityOperation, ? extends IotOperationDefOperation, ? extends IotOperationDefBindOperationDefOperation, ? extends JoinNodeOperation, ? extends LastStatementOperation, ? extends LastStatement_BreakOperation, ? extends LastStatement_ReturnOperation, ? extends LastStatement_ReturnWithValueOperation, ? extends MergeNodeOperation, ? extends NamedActivityOperation, ? extends NamedElementOperation, ? extends OfferOperation, ? extends OpaqueActionOperation, ? extends OperationDefOperation, ? extends ParameterDefOperation, ? extends PrimitiveDefOperation, ? extends RuntimeDataOperation, ? extends SensorOperation, ? extends SketchOperation, ? extends StatementOperation, ? extends Statement_AssignmentOperation, ? extends Statement_BlockOperation, ? extends Statement_CallFunctionOperation, ? extends Statement_CallMemberFunctionOperation, ? extends Statement_For_GenericOperation, ? extends Statement_For_NumericOperation, ? extends Statement_FunctioncallOrAssignmentOperation, ? extends Statement_GlobalFunction_DeclarationOperation, ? extends Statement_If_Then_ElseOperation, ? extends Statement_If_Then_Else_ElseIfPartOperation, ? extends Statement_LocalFunction_DeclarationOperation, ? extends Statement_Local_Variable_DeclarationOperation, ? extends Statement_RepeatOperation, ? extends Statement_WhileOperation, ? extends SystemOperation, ? extends TokenOperation, ? extends TraceOperation, ? extends ValueOperation, ? extends ValueBindExpressionOperation, ? extends VariableOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public Value execute(final Context c) {
    Value _xblockexpression = null;
    {
      final Environment e = new Environment();
      final Consumer<InputValue> _function = (InputValue it) -> {
        e.putVariable(this.alg.$(it.getVariable()).name(), it.getValue());
      };
      c.getInputValues().forEach(_function);
      EObject _eContainer = this.obj.eContainer();
      final Consumer<Variable> _function_1 = (Variable it) -> {
        e.putVariable(this.alg.$(it).name(), it.getCurrentValue());
      };
      ((Activity) _eContainer).getLocals().forEach(_function_1);
      this.alg.$(this.obj.getDelegate()).execute(e);
      Value _currentValue = this.obj.getCurrentValue();
      Object _variable = e.getVariable(this.alg.$(this.obj).name());
      ((BooleanValue) _currentValue).setValue((((Boolean) _variable)).booleanValue());
      _xblockexpression = this.obj.getCurrentValue();
    }
    return _xblockexpression;
  }
  
  @Override
  public void init(final Context c) {
    this.alg.$(this.obj.getDelegate());
    this.obj.setCurrentValue(this.obj.getInitialValue());
  }
  
  @Override
  public String print() {
    return "TODO";
  }
  
  @Override
  public String name() {
    Statement_FunctioncallOrAssignment _delegate = this.obj.getDelegate();
    Expression _get = ((Statement_Assignment) _delegate).getVariable().get(0);
    return ((Expression_VariableName) _get).getVariable();
  }
}
