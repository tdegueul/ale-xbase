package execad.revisitor.operations.impl;

import activitydiagram.ActivityEdge;
import activitydiagram.ActivitydiagramFactory;
import activitydiagram.Offer;
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
public class ActivityEdgeOperationImpl implements ActivityEdgeOperation {
  private ActivityEdge obj;
  
  private ActivitydiagramRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, BooleanBinaryExpressionOperation, BooleanExpressionOperation, BooleanUnaryExpressionOperation, Object, BooleanVariableOperation, ActivityEdgeOperation, ControlNodeOperation, TokenOperation, DecisionNodeOperation, ActivityNodeOperation, ExpressionOperation, ControlNodeOperation, ForkNodeOperation, ForkedTokenOperation, InitialNodeOperation, Object, Object, IntegerCalculationExpressionOperation, IntegerComparisonExpressionOperation, IntegerExpressionOperation, Object, IntegerVariableOperation, JoinNodeOperation, MergeNodeOperation, Object, OfferOperation, OpaqueActionOperation, TokenOperation, Object, Object, VariableOperation> alg;
  
  public ActivityEdgeOperationImpl(final ActivityEdge obj, final ActivitydiagramRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, BooleanBinaryExpressionOperation, BooleanExpressionOperation, BooleanUnaryExpressionOperation, Object, BooleanVariableOperation, ActivityEdgeOperation, ControlNodeOperation, TokenOperation, DecisionNodeOperation, ActivityNodeOperation, ExpressionOperation, ControlNodeOperation, ForkNodeOperation, ForkedTokenOperation, InitialNodeOperation, Object, Object, IntegerCalculationExpressionOperation, IntegerComparisonExpressionOperation, IntegerExpressionOperation, Object, IntegerVariableOperation, JoinNodeOperation, MergeNodeOperation, Object, OfferOperation, OpaqueActionOperation, TokenOperation, Object, Object, VariableOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void sendOffer(final List<Token> tokens) {
    final Offer offer = ActivitydiagramFactory.eINSTANCE.createOffer();
    final Consumer<Token> _function = (Token token) -> {
      EList<Token> _offeredTokens = offer.getOfferedTokens();
      _offeredTokens.add(token);
    };
    tokens.forEach(_function);
    EList<Offer> _offers = this.obj.getOffers();
    _offers.add(offer);
  }
  
  @Override
  public List<Token> takeOfferedTokens() {
    final ArrayList<Token> tokens = CollectionLiterals.<Token>newArrayList();
    final Consumer<Offer> _function = (Offer o) -> {
      EList<Token> _offeredTokens = o.getOfferedTokens();
      Iterables.<Token>addAll(tokens, _offeredTokens);
    };
    this.obj.getOffers().forEach(_function);
    this.obj.getOffers().clear();
    return tokens;
  }
  
  @Override
  public boolean hasOffer() {
    final Function1<Offer, Boolean> _function = (Offer o) -> {
      return Boolean.valueOf(this.alg.$(o).hasTokens());
    };
    return IterableExtensions.<Offer>exists(this.obj.getOffers(), _function);
  }
}
