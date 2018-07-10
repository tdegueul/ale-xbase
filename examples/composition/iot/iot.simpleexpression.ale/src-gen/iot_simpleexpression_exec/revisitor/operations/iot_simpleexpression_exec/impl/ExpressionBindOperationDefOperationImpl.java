package iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.impl;

import activitydiagram.Context;
import activitydiagram.OpaqueAction;
import activitydiagram.Variable;
import com.google.common.base.Objects;
import idlmm.ParameterDef;
import idlmm.ParameterMode;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ALVarRefOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ActionOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ActivityEdgeOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ActivityFinalNodeOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ActivityNodeOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ActivityOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ActuatorOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ArithLitOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ArithMinusOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ArithOpOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ArithOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ArithPlusOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.AssignOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.BlockOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.BoardOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.BooleanValueOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.BooleanVariableBindSEBooleanVariableOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.BooleanVariableOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ContainedOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ContainerOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ContextOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ControlFlowOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ControlNodeOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ControlTokenOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.DecisionNodeOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.EqualityTestOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ExceptionDefOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ExecutableNodeOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ExpOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ExpressionBindOperationDefOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ExpressionBindSEExpressionOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.FieldIOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.FinalNodeOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ForkNodeOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ForkedTokenOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.HWCompOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.IDLTypeOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.IdlStmtBindBlockOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.IdlStmtOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.IfStmtOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.InitialNodeOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.InputOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.InputValueOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.IntegerValueOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.IntegerVariableBindSEIntegerVariableOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.IntegerVariableOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.IoTActivityBindActivityOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.IotActivityOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.IotOperationDefBindOperationDefOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.IotOperationDefOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.JoinNodeOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.MergeNodeOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.NamedActivityOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.NamedElementOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.OfferOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.OpaqueActionOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.OperationDefOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ParameterDefOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.PrimitiveDefOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.PrintOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.RandRangeOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.SEBooleanBinaryExpressionOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.SEBooleanExpressionOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.SEBooleanUnaryExpressionOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.SEBooleanValueOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.SEBooleanVariableOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.SEExpressionOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.SEIntegerCalculationExpressionOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.SEIntegerComparisonExpressionOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.SEIntegerExpressionOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.SEIntegerValueOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.SEIntegerVariableOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.SEValueOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.SEVariableOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.SensorOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.SketchOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.StmtOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.SystemOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.TokenOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.TraceOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ValueOperation;
import iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.VariableOperation;
import java.util.Collections;
import java.util.function.Consumer;
import model.ExpressionBindOperationDef;
import model.revisitor.ModelRevisitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import simpleALEnv.runtime.Env;

@SuppressWarnings("all")
public class ExpressionBindOperationDefOperationImpl implements ExpressionBindOperationDefOperation {
  private ExpressionBindOperationDef obj;
  
  private ModelRevisitor<? extends ALVarRefOperation, ? extends ActionOperation, ? extends ActivityOperation, ? extends ActivityEdgeOperation, ? extends ActivityFinalNodeOperation, ? extends ActivityNodeOperation, ? extends ActuatorOperation, ? extends ArithOperation, ? extends ArithLitOperation, ? extends ArithMinusOperation, ? extends ArithOpOperation, ? extends ArithPlusOperation, ? extends AssignOperation, ? extends BlockOperation, ? extends BoardOperation, ? extends BooleanValueOperation, ? extends BooleanVariableOperation, ? extends BooleanVariableBindSEBooleanVariableOperation, ? extends ContainedOperation, ? extends ContainerOperation, ? extends ContextOperation, ? extends ControlFlowOperation, ? extends ControlNodeOperation, ? extends ControlTokenOperation, ? extends DecisionNodeOperation, ? extends EqualityTestOperation, ? extends ExceptionDefOperation, ? extends ExecutableNodeOperation, ? extends ExpOperation, ? extends ExpressionBindOperationDefOperation, ? extends ExpressionBindSEExpressionOperation, ? extends FieldIOperation, ? extends FinalNodeOperation, ? extends ForkNodeOperation, ? extends ForkedTokenOperation, ? extends HWCompOperation, ? extends IDLTypeOperation, ? extends IdlStmtOperation, ? extends IdlStmtBindBlockOperation, ? extends IfStmtOperation, ? extends InitialNodeOperation, ? extends InputOperation, ? extends InputValueOperation, ? extends IntegerValueOperation, ? extends IntegerVariableOperation, ? extends IntegerVariableBindSEIntegerVariableOperation, ? extends IoTActivityBindActivityOperation, ? extends IotActivityOperation, ? extends IotOperationDefOperation, ? extends IotOperationDefBindOperationDefOperation, ? extends JoinNodeOperation, ? extends MergeNodeOperation, ? extends NamedActivityOperation, ? extends NamedElementOperation, ? extends OfferOperation, ? extends OpaqueActionOperation, ? extends OperationDefOperation, ? extends ParameterDefOperation, ? extends PrimitiveDefOperation, ? extends PrintOperation, ? extends RandRangeOperation, ? extends SEBooleanBinaryExpressionOperation, ? extends SEBooleanExpressionOperation, ? extends SEBooleanUnaryExpressionOperation, ? extends SEBooleanValueOperation, ? extends SEBooleanVariableOperation, ? extends SEExpressionOperation, ? extends SEIntegerCalculationExpressionOperation, ? extends SEIntegerComparisonExpressionOperation, ? extends SEIntegerExpressionOperation, ? extends SEIntegerValueOperation, ? extends SEIntegerVariableOperation, ? extends SEValueOperation, ? extends SEVariableOperation, ? extends SensorOperation, ? extends SketchOperation, ? extends StmtOperation, ? extends SystemOperation, ? extends TokenOperation, ? extends TraceOperation, ? extends ValueOperation, ? extends VariableOperation> alg;
  
  public ExpressionBindOperationDefOperationImpl(final ExpressionBindOperationDef obj, final ModelRevisitor<? extends ALVarRefOperation, ? extends ActionOperation, ? extends ActivityOperation, ? extends ActivityEdgeOperation, ? extends ActivityFinalNodeOperation, ? extends ActivityNodeOperation, ? extends ActuatorOperation, ? extends ArithOperation, ? extends ArithLitOperation, ? extends ArithMinusOperation, ? extends ArithOpOperation, ? extends ArithPlusOperation, ? extends AssignOperation, ? extends BlockOperation, ? extends BoardOperation, ? extends BooleanValueOperation, ? extends BooleanVariableOperation, ? extends BooleanVariableBindSEBooleanVariableOperation, ? extends ContainedOperation, ? extends ContainerOperation, ? extends ContextOperation, ? extends ControlFlowOperation, ? extends ControlNodeOperation, ? extends ControlTokenOperation, ? extends DecisionNodeOperation, ? extends EqualityTestOperation, ? extends ExceptionDefOperation, ? extends ExecutableNodeOperation, ? extends ExpOperation, ? extends ExpressionBindOperationDefOperation, ? extends ExpressionBindSEExpressionOperation, ? extends FieldIOperation, ? extends FinalNodeOperation, ? extends ForkNodeOperation, ? extends ForkedTokenOperation, ? extends HWCompOperation, ? extends IDLTypeOperation, ? extends IdlStmtOperation, ? extends IdlStmtBindBlockOperation, ? extends IfStmtOperation, ? extends InitialNodeOperation, ? extends InputOperation, ? extends InputValueOperation, ? extends IntegerValueOperation, ? extends IntegerVariableOperation, ? extends IntegerVariableBindSEIntegerVariableOperation, ? extends IoTActivityBindActivityOperation, ? extends IotActivityOperation, ? extends IotOperationDefOperation, ? extends IotOperationDefBindOperationDefOperation, ? extends JoinNodeOperation, ? extends MergeNodeOperation, ? extends NamedActivityOperation, ? extends NamedElementOperation, ? extends OfferOperation, ? extends OpaqueActionOperation, ? extends OperationDefOperation, ? extends ParameterDefOperation, ? extends PrimitiveDefOperation, ? extends PrintOperation, ? extends RandRangeOperation, ? extends SEBooleanBinaryExpressionOperation, ? extends SEBooleanExpressionOperation, ? extends SEBooleanUnaryExpressionOperation, ? extends SEBooleanValueOperation, ? extends SEBooleanVariableOperation, ? extends SEExpressionOperation, ? extends SEIntegerCalculationExpressionOperation, ? extends SEIntegerComparisonExpressionOperation, ? extends SEIntegerExpressionOperation, ? extends SEIntegerValueOperation, ? extends SEIntegerVariableOperation, ? extends SEValueOperation, ? extends SEVariableOperation, ? extends SensorOperation, ? extends SketchOperation, ? extends StmtOperation, ? extends SystemOperation, ? extends TokenOperation, ? extends TraceOperation, ? extends ValueOperation, ? extends VariableOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void execute(final Context c) {
    final Env e = new Env();
    EObject _eContainer = this.obj.eContainer();
    final Consumer<Variable> _function = (Variable it) -> {
      final Object v = this.alg.$(it.getCurrentValue()).value();
      if ((v instanceof Integer)) {
        e.bind(this.alg.$(it).name(), ((Integer)v));
      } else {
        if ((v instanceof Double)) {
          e.bind(this.alg.$(it).name(), Integer.valueOf(((Double)v).intValue()));
        }
      }
    };
    ((OpaqueAction) _eContainer).getActivity().getLocals().forEach(_function);
    this.alg.$(this.obj.getDelegate().getStmt()).execute(e);
    final Function1<ParameterDef, Boolean> _function_1 = (ParameterDef it) -> {
      return Boolean.valueOf(Collections.<ParameterMode>unmodifiableList(CollectionLiterals.<ParameterMode>newArrayList(ParameterMode.PARAM_OUT, ParameterMode.PARAM_INOUT)).contains(it.getDirection()));
    };
    final Consumer<ParameterDef> _function_2 = (ParameterDef p) -> {
      final Function1<Variable, Boolean> _function_3 = (Variable it) -> {
        String _name = this.alg.$(it).name();
        String _identifier = p.getIdentifier();
        return Boolean.valueOf(Objects.equal(_name, _identifier));
      };
      final Consumer<Variable> _function_4 = (Variable it) -> {
        String _identifier = p.getIdentifier();
        String _plus = ("assign " + _identifier);
        String _plus_1 = (_plus + " = ");
        Integer _get = e.get(p.getIdentifier());
        String _plus_2 = (_plus_1 + _get);
        InputOutput.<String>println(_plus_2);
        this.alg.$(it.getCurrentValue()).setValue(e.get(p.getIdentifier()));
      };
      IterableExtensions.<Variable>filter(c.getActivity().getLocals(), _function_3).forEach(_function_4);
    };
    IterableExtensions.<ParameterDef>filter(this.obj.getDelegate().getParameters(), _function_1).forEach(_function_2);
  }
}
