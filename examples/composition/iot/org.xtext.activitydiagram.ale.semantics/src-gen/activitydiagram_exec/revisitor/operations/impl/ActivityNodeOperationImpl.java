package activitydiagram_exec.revisitor.operations.impl;

import activitydiagram.ActivityEdge;
import activitydiagram.ActivityNode;
import activitydiagram_exec.revisitor.operations.ActionOperation;
import activitydiagram_exec.revisitor.operations.ActivityEdgeOperation;
import activitydiagram_exec.revisitor.operations.ActivityFinalNodeOperation;
import activitydiagram_exec.revisitor.operations.ActivityNodeOperation;
import activitydiagram_exec.revisitor.operations.ActivityOperation;
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
import activitydiagram_exec.revisitor.operations.IntegerValueOperation;
import activitydiagram_exec.revisitor.operations.JoinNodeOperation;
import activitydiagram_exec.revisitor.operations.MergeNodeOperation;
import activitydiagram_exec.revisitor.operations.NamedElementOperation;
import activitydiagram_exec.revisitor.operations.OfferOperation;
import activitydiagram_exec.revisitor.operations.OpaqueActionOperation;
import activitydiagram_exec.revisitor.operations.TokenOperation;
import activitydiagram_exec.revisitor.operations.TraceOperation;
import activitydiagram_exec.revisitor.operations.ValueOperation;
import activitydiagram_exec.revisitor.operations.VariableOperation;
import activitydiagram_exec.revisitor.operations.impl.NamedElementOperationImpl;
import activitydiagramruntime.Context;
import activitydiagramruntime.Token;
import activitydiagramruntime.revisitor.ActivitydiagramruntimeRevisitor;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ActivityNodeOperationImpl extends NamedElementOperationImpl implements ActivityNodeOperation {
  private ActivityNode obj;
  
  private ActivitydiagramruntimeRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, BooleanValueOperation, BooleanVariableOperation, ContextOperation, ControlFlowOperation, ControlNodeOperation, ControlTokenOperation, DecisionNodeOperation, ExecutableNodeOperation, ExpressionOperation, FinalNodeOperation, ForkNodeOperation, ForkedTokenOperation, InitialNodeOperation, InputOperation, InputValueOperation, IntegerValueOperation, JoinNodeOperation, MergeNodeOperation, NamedElementOperation, OfferOperation, OpaqueActionOperation, TokenOperation, TraceOperation, ValueOperation, VariableOperation> alg;
  
  public ActivityNodeOperationImpl(final ActivityNode obj, final ActivitydiagramruntimeRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, BooleanValueOperation, BooleanVariableOperation, ContextOperation, ControlFlowOperation, ControlNodeOperation, ControlTokenOperation, DecisionNodeOperation, ExecutableNodeOperation, ExpressionOperation, FinalNodeOperation, ForkNodeOperation, ForkedTokenOperation, InitialNodeOperation, InputOperation, InputValueOperation, IntegerValueOperation, JoinNodeOperation, MergeNodeOperation, NamedElementOperation, OfferOperation, OpaqueActionOperation, TokenOperation, TraceOperation, ValueOperation, VariableOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public List<Token> heldTokens() {
    return IterableExtensions.<Token>toList(Iterables.<Token>filter(this.obj.eCrossReferences(), Token.class));
  }
  
  @Override
  public void execute(final Context c) {
  }
  
  @Override
  public void terminate() {
    this.obj.setRunning(false);
  }
  
  @Override
  public boolean isReady() {
    return this.obj.isRunning();
  }
  
  @Override
  public void sendOffers(final List<Token> tokens) {
    final Consumer<ActivityEdge> _function = (ActivityEdge it) -> {
      this.alg.$(it).sendOffer(tokens);
    };
    this.obj.getOutgoing().forEach(_function);
  }
  
  @Override
  public List<Token> takeOfferdTokens() {
    final ArrayList<Token> allTokens = CollectionLiterals.<Token>newArrayList();
    final Consumer<ActivityEdge> _function = (ActivityEdge it) -> {
      final List<Token> tokens = this.alg.$(it).takeOfferedTokens();
      for (final Token token : tokens) {
        {
          this.alg.$(token).withdraw();
          token.setHolder(this.obj);
        }
      }
      allTokens.addAll(tokens);
    };
    this.obj.getIncoming().forEach(_function);
    return allTokens;
  }
  
  @Override
  public void addTokens(final List<Token> tokens) {
    for (final Token token : tokens) {
      {
        Token transferredToken = this.alg.$(token).transfer(this.obj);
        this.alg.$(this.obj).heldTokens().add(transferredToken);
      }
    }
  }
  
  @Override
  public boolean hasOffers() {
    boolean hasOffer = true;
    EList<ActivityEdge> _incoming = this.obj.getIncoming();
    for (final ActivityEdge edge : _incoming) {
      boolean _hasOffer = this.alg.$(edge).hasOffer();
      boolean _not = (!_hasOffer);
      if (_not) {
        hasOffer = false;
      }
    }
    return hasOffer;
  }
  
  @Override
  public void removeToken(final Token token) {
    this.alg.$(this.obj).heldTokens().remove(token);
  }
}
