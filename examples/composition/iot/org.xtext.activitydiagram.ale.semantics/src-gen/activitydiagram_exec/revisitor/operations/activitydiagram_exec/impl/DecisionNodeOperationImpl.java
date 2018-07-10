package activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl;

import activitydiagram.ActivityEdge;
import activitydiagram.BooleanValue;
import activitydiagram.Context;
import activitydiagram.ControlFlow;
import activitydiagram.DecisionNode;
import activitydiagram.Token;
import activitydiagram.Value;
import activitydiagram.revisitor.ActivitydiagramRevisitor;
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
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ExpOperation;
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
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.NamedActivityOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.OfferOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.OpaqueActionOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.TokenOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.TraceOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ValueOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.VariableOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.ControlNodeOperationImpl;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class DecisionNodeOperationImpl extends ControlNodeOperationImpl implements DecisionNodeOperation {
  private DecisionNode obj;
  
  private ActivitydiagramRevisitor<? extends ActionOperation, ? extends ActivityOperation, ? extends ActivityEdgeOperation, ? extends ActivityFinalNodeOperation, ? extends ActivityNodeOperation, ? extends BooleanValueOperation, ? extends BooleanVariableOperation, ? extends ContextOperation, ? extends ControlFlowOperation, ? extends ControlNodeOperation, ? extends ControlTokenOperation, ? extends DecisionNodeOperation, ? extends ExecutableNodeOperation, ? extends ExpOperation, ? extends FinalNodeOperation, ? extends ForkNodeOperation, ? extends ForkedTokenOperation, ? extends InitialNodeOperation, ? extends InputOperation, ? extends InputValueOperation, ? extends IntegerValueOperation, ? extends IntegerVariableOperation, ? extends JoinNodeOperation, ? extends MergeNodeOperation, ? extends NamedActivityOperation, ? extends OfferOperation, ? extends OpaqueActionOperation, ? extends TokenOperation, ? extends TraceOperation, ? extends ValueOperation, ? extends VariableOperation> alg;
  
  public DecisionNodeOperationImpl(final DecisionNode obj, final ActivitydiagramRevisitor<? extends ActionOperation, ? extends ActivityOperation, ? extends ActivityEdgeOperation, ? extends ActivityFinalNodeOperation, ? extends ActivityNodeOperation, ? extends BooleanValueOperation, ? extends BooleanVariableOperation, ? extends ContextOperation, ? extends ControlFlowOperation, ? extends ControlNodeOperation, ? extends ControlTokenOperation, ? extends DecisionNodeOperation, ? extends ExecutableNodeOperation, ? extends ExpOperation, ? extends FinalNodeOperation, ? extends ForkNodeOperation, ? extends ForkedTokenOperation, ? extends InitialNodeOperation, ? extends InputOperation, ? extends InputValueOperation, ? extends IntegerValueOperation, ? extends IntegerVariableOperation, ? extends JoinNodeOperation, ? extends MergeNodeOperation, ? extends NamedActivityOperation, ? extends OfferOperation, ? extends OpaqueActionOperation, ? extends TokenOperation, ? extends TraceOperation, ? extends ValueOperation, ? extends VariableOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void execute(final Context c) {
    c.getOutput().getExecutedNodes().add(this.obj);
    this.alg.$(this.obj).sendOffers(this.alg.$(this.obj).takeOfferdTokens());
  }
  
  @Override
  public void sendOffers(final List<Token> tokens) {
    EList<ActivityEdge> _outgoing = this.obj.getOutgoing();
    for (final ActivityEdge edge : _outgoing) {
      if (((edge instanceof ControlFlow) && (((ControlFlow) edge).getGuard() != null))) {
        Value _currentValue = ((ControlFlow) edge).getGuard().getCurrentValue();
        String _plus = ("Guard " + _currentValue);
        InputOutput.<String>println(_plus);
        Value _currentValue_1 = ((ControlFlow) edge).getGuard().getCurrentValue();
        boolean _isValue = ((BooleanValue) _currentValue_1).isValue();
        if (_isValue) {
          this.alg.$(edge).sendOffer(tokens);
        }
      }
    }
  }
}
