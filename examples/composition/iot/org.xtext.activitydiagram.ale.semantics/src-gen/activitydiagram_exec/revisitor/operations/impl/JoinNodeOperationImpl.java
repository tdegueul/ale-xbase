package activitydiagram_exec.revisitor.operations.impl;

import activitydiagram.JoinNode;
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
import activitydiagram_exec.revisitor.operations.impl.ControlNodeOperationImpl;
import activitydiagramruntime.Context;
import activitydiagramruntime.ForkedToken;
import activitydiagramruntime.Token;
import activitydiagramruntime.revisitor.ActivitydiagramruntimeRevisitor;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class JoinNodeOperationImpl extends ControlNodeOperationImpl implements JoinNodeOperation {
  private JoinNode obj;
  
  private ActivitydiagramruntimeRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, BooleanBinaryExpressionOperation, BooleanExpressionOperation, BooleanUnaryExpressionOperation, BooleanValueOperation, BooleanVariableOperation, ContextOperation, ControlFlowOperation, ControlNodeOperation, ControlTokenOperation, DecisionNodeOperation, ExecutableNodeOperation, ExpressionOperation, FinalNodeOperation, ForkNodeOperation, ForkedTokenOperation, InitialNodeOperation, InputOperation, InputValueOperation, IntegerCalculationExpressionOperation, IntegerComparisonExpressionOperation, IntegerExpressionOperation, IntegerValueOperation, IntegerVariableOperation, JoinNodeOperation, MergeNodeOperation, NamedElementOperation, OfferOperation, OpaqueActionOperation, TokenOperation, TraceOperation, ValueOperation, VariableOperation> alg;
  
  public JoinNodeOperationImpl(final JoinNode obj, final ActivitydiagramruntimeRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, BooleanBinaryExpressionOperation, BooleanExpressionOperation, BooleanUnaryExpressionOperation, BooleanValueOperation, BooleanVariableOperation, ContextOperation, ControlFlowOperation, ControlNodeOperation, ControlTokenOperation, DecisionNodeOperation, ExecutableNodeOperation, ExpressionOperation, FinalNodeOperation, ForkNodeOperation, ForkedTokenOperation, InitialNodeOperation, InputOperation, InputValueOperation, IntegerCalculationExpressionOperation, IntegerComparisonExpressionOperation, IntegerExpressionOperation, IntegerValueOperation, IntegerVariableOperation, JoinNodeOperation, MergeNodeOperation, NamedElementOperation, OfferOperation, OpaqueActionOperation, TokenOperation, TraceOperation, ValueOperation, VariableOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void execute(final Context c) {
    c.getOutput().getExecutedNodes().add(this.obj);
    List<Token> tokens = this.alg.$(this.obj).takeOfferdTokens();
    final Consumer<Token> _function = (Token t) -> {
      int _remainingOffersCount = ((ForkedToken) t).getRemainingOffersCount();
      boolean _greaterThan = (_remainingOffersCount > 1);
      if (_greaterThan) {
        int _remainingOffersCount_1 = ((ForkedToken) t).getRemainingOffersCount();
        int _minus = (_remainingOffersCount_1 - 1);
        ((ForkedToken) t).setRemainingOffersCount(_minus);
      } else {
        ArrayList<Token> list = CollectionLiterals.<Token>newArrayList();
        list.add(t);
        this.alg.$(this.obj).sendOffers(list);
      }
    };
    tokens.forEach(_function);
  }
}
