package activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl;

import activitydiagram.ActivityEdge;
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
import activitydiagramruntime.ActivitydiagramruntimeFactory;
import activitydiagramruntime.Offer;
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
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class ActivityEdgeOperationImpl extends NamedElementOperationImpl implements ActivityEdgeOperation {
  private ActivityEdge obj;
  
  private ActivitydiagramruntimeRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, BooleanValueOperation, BooleanVariableOperation, ContextOperation, ControlFlowOperation, ControlNodeOperation, ControlTokenOperation, DecisionNodeOperation, ExecutableNodeOperation, ExpressionOperation, FinalNodeOperation, ForkNodeOperation, ForkedTokenOperation, InitialNodeOperation, InputOperation, InputValueOperation, IntegerValueOperation, IntegerVariableOperation, JoinNodeOperation, MergeNodeOperation, NamedElementOperation, OfferOperation, OpaqueActionOperation, TokenOperation, TraceOperation, ValueOperation, VariableOperation> alg;
  
  public ActivityEdgeOperationImpl(final ActivityEdge obj, final ActivitydiagramruntimeRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, BooleanValueOperation, BooleanVariableOperation, ContextOperation, ControlFlowOperation, ControlNodeOperation, ControlTokenOperation, DecisionNodeOperation, ExecutableNodeOperation, ExpressionOperation, FinalNodeOperation, ForkNodeOperation, ForkedTokenOperation, InitialNodeOperation, InputOperation, InputValueOperation, IntegerValueOperation, IntegerVariableOperation, JoinNodeOperation, MergeNodeOperation, NamedElementOperation, OfferOperation, OpaqueActionOperation, TokenOperation, TraceOperation, ValueOperation, VariableOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public List<Offer> offers() {
    List<Offer> _xblockexpression = null;
    {
      final Resource res = this.obj.eResource();
      final TreeIterator<Notifier> allContent = res.getResourceSet().getAllContents();
      final Iterator<Offer> offers = Iterators.<Offer>filter(allContent, Offer.class);
      final Function1<Offer, Boolean> _function = (Offer it) -> {
        ActivityEdge _owned = it.getOwned();
        return Boolean.valueOf(Objects.equal(_owned, this.obj));
      };
      final Iterator<Offer> owneds = IteratorExtensions.<Offer>filter(offers, _function);
      final List<Offer> ret = IteratorExtensions.<Offer>toList(owneds);
      _xblockexpression = ret;
    }
    return _xblockexpression;
  }
  
  @Override
  public void sendOffer(final List<Token> tokens) {
    final Offer offer = ActivitydiagramruntimeFactory.eINSTANCE.createOffer();
    final Consumer<Token> _function = (Token it) -> {
      offer.getOfferedTokens().add(it);
    };
    tokens.forEach(_function);
    int _hashCode = offer.hashCode();
    String _plus = ("offer" + Integer.valueOf(_hashCode));
    String _plus_1 = (_plus + ".xml");
    final Resource res = this.obj.eResource().getResourceSet().createResource(URI.createURI(_plus_1));
    offer.setOwned(this.obj);
    EList<EObject> _contents = res.getContents();
    _contents.add(offer);
  }
  
  @Override
  public List<Token> takeOfferedTokens() {
    final ArrayList<Token> tokens = CollectionLiterals.<Token>newArrayList();
    final Consumer<Offer> _function = (Offer it) -> {
      tokens.addAll(it.getOfferedTokens());
    };
    this.alg.$(this.obj).offers().forEach(_function);
    this.alg.$(this.obj).offers().clear();
    return tokens;
  }
  
  @Override
  public boolean hasOffer() {
    boolean _xblockexpression = false;
    {
      final Function1<Offer, Boolean> _function = (Offer it) -> {
        return Boolean.valueOf(this.alg.$(it).hasTokens());
      };
      final boolean ret = IterableExtensions.<Offer>exists(this.alg.$(this.obj).offers(), _function);
      _xblockexpression = ret;
    }
    return _xblockexpression;
  }
}
