package activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl;

import activitydiagram.ForkNode;
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
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.JoinNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.MergeNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.NamedElementOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.OfferOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.OpaqueActionOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.TokenOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.TraceOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ValueOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.VariableOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.ControlNodeOperationImpl;
import activitydiagramruntime.ActivitydiagramruntimeFactory;
import activitydiagramruntime.Context;
import activitydiagramruntime.ForkedToken;
import activitydiagramruntime.Token;
import activitydiagramruntime.revisitor.ActivitydiagramruntimeRevisitor;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class ForkNodeOperationImpl extends ControlNodeOperationImpl implements ForkNodeOperation {
  private ForkNode obj;
  
  private ActivitydiagramruntimeRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, BooleanValueOperation, BooleanVariableOperation, ContextOperation, ControlFlowOperation, ControlNodeOperation, ControlTokenOperation, DecisionNodeOperation, ExecutableNodeOperation, ExpressionOperation, FinalNodeOperation, ForkNodeOperation, ForkedTokenOperation, InitialNodeOperation, InputOperation, InputValueOperation, IntegerValueOperation, JoinNodeOperation, MergeNodeOperation, NamedElementOperation, OfferOperation, OpaqueActionOperation, TokenOperation, TraceOperation, ValueOperation, VariableOperation> alg;
  
  public ForkNodeOperationImpl(final ForkNode obj, final ActivitydiagramruntimeRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, BooleanValueOperation, BooleanVariableOperation, ContextOperation, ControlFlowOperation, ControlNodeOperation, ControlTokenOperation, DecisionNodeOperation, ExecutableNodeOperation, ExpressionOperation, FinalNodeOperation, ForkNodeOperation, ForkedTokenOperation, InitialNodeOperation, InputOperation, InputValueOperation, IntegerValueOperation, JoinNodeOperation, MergeNodeOperation, NamedElementOperation, OfferOperation, OpaqueActionOperation, TokenOperation, TraceOperation, ValueOperation, VariableOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void execute(final Context c) {
    c.getOutput().getExecutedNodes().add(this.obj);
    List<Token> tokens = this.alg.$(this.obj).takeOfferdTokens();
    ArrayList<Token> forkedTokens = CollectionLiterals.<Token>newArrayList();
    for (final Token token : tokens) {
      {
        ForkedToken forkedToken = ActivitydiagramruntimeFactory.eINSTANCE.createForkedToken();
        forkedToken.setBaseToken(token);
        forkedToken.setRemainingOffersCount(this.obj.getOutgoing().size());
        forkedTokens.add(forkedToken);
      }
    }
    this.alg.$(this.obj).addTokens(forkedTokens);
    this.alg.$(this.obj).sendOffers(forkedTokens);
  }
}