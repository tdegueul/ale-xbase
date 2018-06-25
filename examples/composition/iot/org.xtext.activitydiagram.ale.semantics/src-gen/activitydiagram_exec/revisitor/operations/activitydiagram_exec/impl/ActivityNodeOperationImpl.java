package activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl;

import activitydiagram.ActivityEdge;
import activitydiagram.ActivityNode;
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
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.NamedElementOperationImpl;
import activitydiagramruntime.Context;
import activitydiagramruntime.Token;
import activitydiagramruntime.revisitor.ActivitydiagramruntimeRevisitor;
import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class ActivityNodeOperationImpl extends NamedElementOperationImpl implements ActivityNodeOperation {
  private ActivityNode obj;
  
  private ActivitydiagramruntimeRevisitor<? extends ActionOperation, ? extends ActivityOperation, ? extends ActivityEdgeOperation, ? extends ActivityFinalNodeOperation, ? extends ActivityNodeOperation, ? extends BooleanValueOperation, ? extends BooleanVariableOperation, ? extends ContextOperation, ? extends ControlFlowOperation, ? extends ControlNodeOperation, ? extends ControlTokenOperation, ? extends DecisionNodeOperation, ? extends ExecutableNodeOperation, ? extends ExpressionOperation, ? extends FinalNodeOperation, ? extends ForkNodeOperation, ? extends ForkedTokenOperation, ? extends InitialNodeOperation, ? extends InputOperation, ? extends InputValueOperation, ? extends IntegerValueOperation, ? extends IntegerVariableOperation, ? extends JoinNodeOperation, ? extends MergeNodeOperation, ? extends NamedElementOperation, ? extends OfferOperation, ? extends OpaqueActionOperation, ? extends TokenOperation, ? extends TraceOperation, ? extends ValueOperation, ? extends VariableOperation> alg;
  
  public ActivityNodeOperationImpl(final ActivityNode obj, final ActivitydiagramruntimeRevisitor<? extends ActionOperation, ? extends ActivityOperation, ? extends ActivityEdgeOperation, ? extends ActivityFinalNodeOperation, ? extends ActivityNodeOperation, ? extends BooleanValueOperation, ? extends BooleanVariableOperation, ? extends ContextOperation, ? extends ControlFlowOperation, ? extends ControlNodeOperation, ? extends ControlTokenOperation, ? extends DecisionNodeOperation, ? extends ExecutableNodeOperation, ? extends ExpressionOperation, ? extends FinalNodeOperation, ? extends ForkNodeOperation, ? extends ForkedTokenOperation, ? extends InitialNodeOperation, ? extends InputOperation, ? extends InputValueOperation, ? extends IntegerValueOperation, ? extends IntegerVariableOperation, ? extends JoinNodeOperation, ? extends MergeNodeOperation, ? extends NamedElementOperation, ? extends OfferOperation, ? extends OpaqueActionOperation, ? extends TokenOperation, ? extends TraceOperation, ? extends ValueOperation, ? extends VariableOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public List<Token> heldTokens() {
    List<Token> _xblockexpression = null;
    {
      final Resource res = this.obj.eResource();
      final TreeIterator<Notifier> allContent = res.getResourceSet().getAllContents();
      final Iterator<Token> offers = Iterators.<Token>filter(allContent, Token.class);
      final Function1<Token, Boolean> _function = (Token it) -> {
        ActivityNode _holder = it.getHolder();
        return Boolean.valueOf(Objects.equal(_holder, this.obj));
      };
      final Iterator<Token> owneds = IteratorExtensions.<Token>filter(offers, _function);
      final List<Token> ret = IteratorExtensions.<Token>toList(owneds);
      _xblockexpression = ret;
    }
    return _xblockexpression;
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
