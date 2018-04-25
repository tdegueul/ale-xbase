package activitydiagram_exec.revisitor.operations.impl;

import activitydiagram.BooleanValue;
import activitydiagram.IntegerComparisonExpression;
import activitydiagram.IntegerComparisonOperator;
import activitydiagram.IntegerValue;
import activitydiagram.Value;
import activitydiagram_exec.revisitor.operations.ActionOperation;
import activitydiagram_exec.revisitor.operations.ActivityEdgeOperation;
import activitydiagram_exec.revisitor.operations.ActivityFinalNodeOperation;
import activitydiagram_exec.revisitor.operations.ActivityNodeOperation;
import activitydiagram_exec.revisitor.operations.ActivityOperation;
import activitydiagram_exec.revisitor.operations.BooleanBinaryExpressionOperation;
import activitydiagram_exec.revisitor.operations.BooleanExpressionOperation;
import activitydiagram_exec.revisitor.operations.BooleanUnaryExpressionOperation;
import activitydiagram_exec.revisitor.operations.BooleanValueOperation;
import activitydiagram_exec.revisitor.operations.BooleanVariableOperation;
import activitydiagram_exec.revisitor.operations.ContextOperation;
import activitydiagram_exec.revisitor.operations.ControlFlowOperation;
import activitydiagram_exec.revisitor.operations.ControlNodeOperation;
import activitydiagram_exec.revisitor.operations.ControlTokenOperation;
import activitydiagram_exec.revisitor.operations.DecisionNodeOperation;
import activitydiagram_exec.revisitor.operations.ExecutableNodeOperation;
import activitydiagram_exec.revisitor.operations.ExpressionOperation;
import activitydiagram_exec.revisitor.operations.FinalNodeOperation;
import activitydiagram_exec.revisitor.operations.ForkNodeOperation;
import activitydiagram_exec.revisitor.operations.ForkedTokenOperation;
import activitydiagram_exec.revisitor.operations.InitialNodeOperation;
import activitydiagram_exec.revisitor.operations.InputOperation;
import activitydiagram_exec.revisitor.operations.InputValueOperation;
import activitydiagram_exec.revisitor.operations.IntegerCalculationExpressionOperation;
import activitydiagram_exec.revisitor.operations.IntegerComparisonExpressionOperation;
import activitydiagram_exec.revisitor.operations.IntegerExpressionOperation;
import activitydiagram_exec.revisitor.operations.IntegerValueOperation;
import activitydiagram_exec.revisitor.operations.IntegerVariableOperation;
import activitydiagram_exec.revisitor.operations.JoinNodeOperation;
import activitydiagram_exec.revisitor.operations.MergeNodeOperation;
import activitydiagram_exec.revisitor.operations.NamedElementOperation;
import activitydiagram_exec.revisitor.operations.OfferOperation;
import activitydiagram_exec.revisitor.operations.OpaqueActionOperation;
import activitydiagram_exec.revisitor.operations.TokenOperation;
import activitydiagram_exec.revisitor.operations.TraceOperation;
import activitydiagram_exec.revisitor.operations.ValueOperation;
import activitydiagram_exec.revisitor.operations.VariableOperation;
import activitydiagram_exec.revisitor.operations.impl.IntegerExpressionOperationImpl;
import activitydiagramruntime.Context;
import activitydiagramruntime.revisitor.ActivitydiagramruntimeRevisitor;

@SuppressWarnings("all")
public class IntegerComparisonExpressionOperationImpl extends IntegerExpressionOperationImpl implements IntegerComparisonExpressionOperation {
  private IntegerComparisonExpression obj;
  
  private ActivitydiagramruntimeRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, BooleanBinaryExpressionOperation, BooleanExpressionOperation, BooleanUnaryExpressionOperation, BooleanValueOperation, BooleanVariableOperation, ContextOperation, ControlFlowOperation, ControlNodeOperation, ControlTokenOperation, DecisionNodeOperation, ExecutableNodeOperation, ExpressionOperation, FinalNodeOperation, ForkNodeOperation, ForkedTokenOperation, InitialNodeOperation, InputOperation, InputValueOperation, IntegerCalculationExpressionOperation, IntegerComparisonExpressionOperation, IntegerExpressionOperation, IntegerValueOperation, IntegerVariableOperation, JoinNodeOperation, MergeNodeOperation, NamedElementOperation, OfferOperation, OpaqueActionOperation, TokenOperation, TraceOperation, ValueOperation, VariableOperation> alg;
  
  public IntegerComparisonExpressionOperationImpl(final IntegerComparisonExpression obj, final ActivitydiagramruntimeRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, BooleanBinaryExpressionOperation, BooleanExpressionOperation, BooleanUnaryExpressionOperation, BooleanValueOperation, BooleanVariableOperation, ContextOperation, ControlFlowOperation, ControlNodeOperation, ControlTokenOperation, DecisionNodeOperation, ExecutableNodeOperation, ExpressionOperation, FinalNodeOperation, ForkNodeOperation, ForkedTokenOperation, InitialNodeOperation, InputOperation, InputValueOperation, IntegerCalculationExpressionOperation, IntegerComparisonExpressionOperation, IntegerExpressionOperation, IntegerValueOperation, IntegerVariableOperation, JoinNodeOperation, MergeNodeOperation, NamedElementOperation, OfferOperation, OpaqueActionOperation, TokenOperation, TraceOperation, ValueOperation, VariableOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void execute(final Context c) {
    int _value = this.obj.getOperator().getValue();
    boolean _equals = (_value == IntegerComparisonOperator.EQUALS_VALUE);
    if (_equals) {
      Value _currentValue = this.obj.getAssignee().getCurrentValue();
      Value _currentValue_1 = this.obj.getOperand1().getCurrentValue();
      int _value_1 = ((IntegerValue) _currentValue_1).getValue();
      Value _currentValue_2 = this.obj.getOperand2().getCurrentValue();
      int _value_2 = ((IntegerValue) _currentValue_2).getValue();
      boolean _equals_1 = (_value_1 == _value_2);
      ((BooleanValue) _currentValue).setValue(_equals_1);
    } else {
      int _value_3 = this.obj.getOperator().getValue();
      boolean _equals_2 = (_value_3 == IntegerComparisonOperator.GREATER_EQUALS_VALUE);
      if (_equals_2) {
        Value _currentValue_3 = this.obj.getAssignee().getCurrentValue();
        Value _currentValue_4 = this.obj.getOperand1().getCurrentValue();
        int _value_4 = ((IntegerValue) _currentValue_4).getValue();
        Value _currentValue_5 = this.obj.getOperand2().getCurrentValue();
        int _value_5 = ((IntegerValue) _currentValue_5).getValue();
        boolean _greaterEqualsThan = (_value_4 >= _value_5);
        ((BooleanValue) _currentValue_3).setValue(_greaterEqualsThan);
      } else {
        int _value_6 = this.obj.getOperator().getValue();
        boolean _equals_3 = (_value_6 == IntegerComparisonOperator.GREATER_VALUE);
        if (_equals_3) {
          Value _currentValue_6 = this.obj.getAssignee().getCurrentValue();
          Value _currentValue_7 = this.obj.getOperand1().getCurrentValue();
          int _value_7 = ((IntegerValue) _currentValue_7).getValue();
          Value _currentValue_8 = this.obj.getOperand2().getCurrentValue();
          int _value_8 = ((IntegerValue) _currentValue_8).getValue();
          boolean _greaterThan = (_value_7 > _value_8);
          ((BooleanValue) _currentValue_6).setValue(_greaterThan);
        } else {
          int _value_9 = this.obj.getOperator().getValue();
          boolean _equals_4 = (_value_9 == IntegerComparisonOperator.SMALLER_EQUALS_VALUE);
          if (_equals_4) {
            Value _currentValue_9 = this.obj.getAssignee().getCurrentValue();
            Value _currentValue_10 = this.obj.getOperand1().getCurrentValue();
            int _value_10 = ((IntegerValue) _currentValue_10).getValue();
            Value _currentValue_11 = this.obj.getOperand2().getCurrentValue();
            int _value_11 = ((IntegerValue) _currentValue_11).getValue();
            boolean _lessEqualsThan = (_value_10 <= _value_11);
            ((BooleanValue) _currentValue_9).setValue(_lessEqualsThan);
          } else {
            int _value_12 = this.obj.getOperator().getValue();
            boolean _equals_5 = (_value_12 == IntegerComparisonOperator.SMALLER_VALUE);
            if (_equals_5) {
              Value _currentValue_12 = this.obj.getAssignee().getCurrentValue();
              Value _currentValue_13 = this.obj.getOperand1().getCurrentValue();
              int _value_13 = ((IntegerValue) _currentValue_13).getValue();
              Value _currentValue_14 = this.obj.getOperand2().getCurrentValue();
              int _value_14 = ((IntegerValue) _currentValue_14).getValue();
              boolean _lessThan = (_value_13 < _value_14);
              ((BooleanValue) _currentValue_12).setValue(_lessThan);
            }
          }
        }
      }
    }
  }
}
