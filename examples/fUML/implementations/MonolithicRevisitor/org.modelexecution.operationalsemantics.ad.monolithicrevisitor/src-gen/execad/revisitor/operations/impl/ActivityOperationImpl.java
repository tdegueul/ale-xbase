package execad.revisitor.operations.impl;

import activitydiagram.Activity;
import activitydiagram.ActivityNode;
import activitydiagram.ActivitydiagramFactory;
import activitydiagram.InitialNode;
import activitydiagram.InputValue;
import activitydiagram.Variable;
import activitydiagram.revisitor.ActivitydiagramRevisitor;
import com.google.common.collect.Iterables;
import execad.revisitor.operations.ActionOperation;
import execad.revisitor.operations.ActivityEdgeOperation;
import execad.revisitor.operations.ActivityFinalNodeOperation;
import execad.revisitor.operations.ActivityNodeOperation;
import execad.revisitor.operations.ActivityOperation;
import execad.revisitor.operations.BooleanBinaryExpressionOperation;
import execad.revisitor.operations.BooleanExpressionOperation;
import execad.revisitor.operations.BooleanUnaryExpressionOperation;
import execad.revisitor.operations.BooleanVariableOperation;
import execad.revisitor.operations.ControlNodeOperation;
import execad.revisitor.operations.DecisionNodeOperation;
import execad.revisitor.operations.ExpressionOperation;
import execad.revisitor.operations.ForkNodeOperation;
import execad.revisitor.operations.ForkedTokenOperation;
import execad.revisitor.operations.InitialNodeOperation;
import execad.revisitor.operations.IntegerCalculationExpressionOperation;
import execad.revisitor.operations.IntegerComparisonExpressionOperation;
import execad.revisitor.operations.IntegerExpressionOperation;
import execad.revisitor.operations.IntegerVariableOperation;
import execad.revisitor.operations.JoinNodeOperation;
import execad.revisitor.operations.MergeNodeOperation;
import execad.revisitor.operations.OfferOperation;
import execad.revisitor.operations.OpaqueActionOperation;
import execad.revisitor.operations.TokenOperation;
import execad.revisitor.operations.VariableOperation;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ActivityOperationImpl implements ActivityOperation {
  private Activity obj;
  
  private ActivitydiagramRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, BooleanBinaryExpressionOperation, BooleanExpressionOperation, BooleanUnaryExpressionOperation, Object, BooleanVariableOperation, ActivityEdgeOperation, ControlNodeOperation, TokenOperation, DecisionNodeOperation, ActivityNodeOperation, ExpressionOperation, ControlNodeOperation, ForkNodeOperation, ForkedTokenOperation, InitialNodeOperation, Object, Object, IntegerCalculationExpressionOperation, IntegerComparisonExpressionOperation, IntegerExpressionOperation, Object, IntegerVariableOperation, JoinNodeOperation, MergeNodeOperation, Object, OfferOperation, OpaqueActionOperation, TokenOperation, Object, Object, VariableOperation> alg;
  
  public ActivityOperationImpl(final Activity obj, final ActivitydiagramRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, BooleanBinaryExpressionOperation, BooleanExpressionOperation, BooleanUnaryExpressionOperation, Object, BooleanVariableOperation, ActivityEdgeOperation, ControlNodeOperation, TokenOperation, DecisionNodeOperation, ActivityNodeOperation, ExpressionOperation, ControlNodeOperation, ForkNodeOperation, ForkedTokenOperation, InitialNodeOperation, Object, Object, IntegerCalculationExpressionOperation, IntegerComparisonExpressionOperation, IntegerExpressionOperation, Object, IntegerVariableOperation, JoinNodeOperation, MergeNodeOperation, Object, OfferOperation, OpaqueActionOperation, TokenOperation, Object, Object, VariableOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void main(final List<InputValue> inputValues) {
    this.alg.$(this.obj).initialize(inputValues);
    this.alg.$(this.obj).run();
  }
  
  @Override
  public void initialize(final List<InputValue> inputValues) {
    final Consumer<Variable> _function = (Variable v) -> {
      v.setCurrentValue(v.getInitialValue());
    };
    this.obj.getLocals().forEach(_function);
    if (inputValues!=null) {
      final Consumer<InputValue> _function_1 = (InputValue v) -> {
        Variable _variable = v.getVariable();
        _variable.setCurrentValue(v.getValue());
      };
      inputValues.forEach(_function_1);
    }
    this.obj.setTrace(ActivitydiagramFactory.eINSTANCE.createTrace());
  }
  
  @Override
  public void run() {
    final Consumer<ActivityNode> _function = (ActivityNode n) -> {
      this.alg.$(n).run();
    };
    this.obj.getNodes().forEach(_function);
    this.alg.$(this.obj).fireInitialNode();
    List<ActivityNode> enabled = this.alg.$(this.obj).getEnabledNodes();
    while ((!enabled.isEmpty())) {
      {
        this.alg.$(this.obj).fireNode(IterableExtensions.<ActivityNode>head(enabled));
        enabled = this.alg.$(this.obj).getEnabledNodes();
      }
    }
  }
  
  @Override
  public List<ActivityNode> getEnabledNodes() {
    final Function1<ActivityNode, Boolean> _function = (ActivityNode n) -> {
      return Boolean.valueOf(this.alg.$(n).isReady());
    };
    return IterableExtensions.<ActivityNode>toList(IterableExtensions.<ActivityNode>filter(this.obj.getNodes(), _function));
  }
  
  @Override
  public void fireNode(final ActivityNode node) {
    this.alg.$(node).fire(this.alg.$(node).takeOfferedTokens());
    EList<ActivityNode> _executedNodes = this.obj.getTrace().getExecutedNodes();
    _executedNodes.add(node);
  }
  
  @Override
  public void fireInitialNode() {
    this.alg.$(this.obj).fireNode(this.alg.$(this.obj).getInitialNode());
  }
  
  @Override
  public InitialNode getInitialNode() {
    return IterableExtensions.<InitialNode>head(Iterables.<InitialNode>filter(this.obj.getNodes(), InitialNode.class));
  }
  
  @Override
  public void terminate() {
    final Consumer<ActivityNode> _function = (ActivityNode n) -> {
      this.alg.$(n).terminate();
    };
    this.obj.getNodes().forEach(_function);
  }
}
