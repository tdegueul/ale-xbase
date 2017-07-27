package execad.revisitor.operations.impl;

import activitydiagram.ActivityEdge;
import activitydiagram.ActivityNode;
import activitydiagram.Token;
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
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public abstract class ActivityNodeOperationImpl implements ActivityNodeOperation {
  private ActivityNode obj;
  
  private ActivitydiagramRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, BooleanBinaryExpressionOperation, BooleanExpressionOperation, BooleanUnaryExpressionOperation, Object, BooleanVariableOperation, ActivityEdgeOperation, ControlNodeOperation, TokenOperation, DecisionNodeOperation, ActivityNodeOperation, ExpressionOperation, ControlNodeOperation, ForkNodeOperation, ForkedTokenOperation, InitialNodeOperation, Object, Object, IntegerCalculationExpressionOperation, IntegerComparisonExpressionOperation, IntegerExpressionOperation, Object, IntegerVariableOperation, JoinNodeOperation, MergeNodeOperation, Object, OfferOperation, OpaqueActionOperation, TokenOperation, Object, Object, VariableOperation> alg;
  
  public ActivityNodeOperationImpl(final ActivityNode obj, final ActivitydiagramRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, BooleanBinaryExpressionOperation, BooleanExpressionOperation, BooleanUnaryExpressionOperation, Object, BooleanVariableOperation, ActivityEdgeOperation, ControlNodeOperation, TokenOperation, DecisionNodeOperation, ActivityNodeOperation, ExpressionOperation, ControlNodeOperation, ForkNodeOperation, ForkedTokenOperation, InitialNodeOperation, Object, Object, IntegerCalculationExpressionOperation, IntegerComparisonExpressionOperation, IntegerExpressionOperation, Object, IntegerVariableOperation, JoinNodeOperation, MergeNodeOperation, Object, OfferOperation, OpaqueActionOperation, TokenOperation, Object, Object, VariableOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void run() {
    this.obj.setRunning(true);
  }
  
  @Override
  public boolean isReady() {
    return this.obj.isRunning();
  }
  
  @Override
  public void sendOffers(final List<Token> tokens) {
    final Consumer<ActivityEdge> _function = (ActivityEdge e) -> {
      this.alg.$(e).sendOffer(tokens);
    };
    this.obj.getOutgoing().forEach(_function);
  }
  
  @Override
  public List<Token> takeOfferedTokens() {
    final ArrayList<Token> allTokens = CollectionLiterals.<Token>newArrayList();
    final Consumer<ActivityEdge> _function = (ActivityEdge edge) -> {
      final List<Token> tokens = this.alg.$(edge).takeOfferedTokens();
      final Consumer<Token> _function_1 = (Token t) -> {
        this.alg.$(t).withdraw();
      };
      tokens.forEach(_function_1);
      Iterables.<Token>addAll(allTokens, tokens);
    };
    this.obj.getIncoming().forEach(_function);
    return allTokens;
  }
  
  @Override
  public void addTokens(final List<Token> tokens) {
    final Consumer<Token> _function = (Token t) -> {
      final Token transferred = this.alg.$(t).transfer(this.obj);
      EList<Token> _heldTokens = this.obj.getHeldTokens();
      _heldTokens.add(transferred);
    };
    tokens.forEach(_function);
  }
  
  @Override
  public void removeToken(final Token token) {
    this.obj.getHeldTokens().remove(token);
  }
  
  @Override
  public boolean hasOffers() {
    final Function1<ActivityEdge, Boolean> _function = (ActivityEdge e) -> {
      return Boolean.valueOf(this.alg.$(e).hasOffer());
    };
    return IterableExtensions.<ActivityEdge>forall(this.obj.getIncoming(), _function);
  }
  
  @Override
  public void terminate() {
    this.obj.setRunning(false);
  }
  
  @Override
  public abstract void fire(final List<Token> tokens);
}
