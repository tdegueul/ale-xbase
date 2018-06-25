package activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl;

import activitydiagram.ControlNode;
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
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.ActivityNodeOperationImpl;
import activitydiagramruntime.revisitor.ActivitydiagramruntimeRevisitor;

@SuppressWarnings("all")
public class ControlNodeOperationImpl extends ActivityNodeOperationImpl implements ControlNodeOperation {
  private ControlNode obj;
  
  private ActivitydiagramruntimeRevisitor<? extends ActionOperation, ? extends ActivityOperation, ? extends ActivityEdgeOperation, ? extends ActivityFinalNodeOperation, ? extends ActivityNodeOperation, ? extends BooleanValueOperation, ? extends BooleanVariableOperation, ? extends ContextOperation, ? extends ControlFlowOperation, ? extends ControlNodeOperation, ? extends ControlTokenOperation, ? extends DecisionNodeOperation, ? extends ExecutableNodeOperation, ? extends ExpressionOperation, ? extends FinalNodeOperation, ? extends ForkNodeOperation, ? extends ForkedTokenOperation, ? extends InitialNodeOperation, ? extends InputOperation, ? extends InputValueOperation, ? extends IntegerValueOperation, ? extends IntegerVariableOperation, ? extends JoinNodeOperation, ? extends MergeNodeOperation, ? extends NamedElementOperation, ? extends OfferOperation, ? extends OpaqueActionOperation, ? extends TokenOperation, ? extends TraceOperation, ? extends ValueOperation, ? extends VariableOperation> alg;
  
  public ControlNodeOperationImpl(final ControlNode obj, final ActivitydiagramruntimeRevisitor<? extends ActionOperation, ? extends ActivityOperation, ? extends ActivityEdgeOperation, ? extends ActivityFinalNodeOperation, ? extends ActivityNodeOperation, ? extends BooleanValueOperation, ? extends BooleanVariableOperation, ? extends ContextOperation, ? extends ControlFlowOperation, ? extends ControlNodeOperation, ? extends ControlTokenOperation, ? extends DecisionNodeOperation, ? extends ExecutableNodeOperation, ? extends ExpressionOperation, ? extends FinalNodeOperation, ? extends ForkNodeOperation, ? extends ForkedTokenOperation, ? extends InitialNodeOperation, ? extends InputOperation, ? extends InputValueOperation, ? extends IntegerValueOperation, ? extends IntegerVariableOperation, ? extends JoinNodeOperation, ? extends MergeNodeOperation, ? extends NamedElementOperation, ? extends OfferOperation, ? extends OpaqueActionOperation, ? extends TokenOperation, ? extends TraceOperation, ? extends ValueOperation, ? extends VariableOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
}
