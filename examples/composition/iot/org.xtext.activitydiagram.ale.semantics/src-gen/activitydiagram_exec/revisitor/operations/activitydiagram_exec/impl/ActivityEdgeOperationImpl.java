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
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.impl.NamedActivityOperationImpl;
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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class ActivityEdgeOperationImpl extends NamedActivityOperationImpl implements ActivityEdgeOperation {
  private ActivityEdge obj;
  
  private ActivitydiagramruntimeRevisitor<? extends ActionOperation, ? extends ActivityOperation, ? extends ActivityEdgeOperation, ? extends ActivityFinalNodeOperation, ? extends ActivityNodeOperation, ? extends BooleanValueOperation, ? extends BooleanVariableOperation, ? extends ContextOperation, ? extends ControlFlowOperation, ? extends ControlNodeOperation, ? extends ControlTokenOperation, ? extends DecisionNodeOperation, ? extends ExecutableNodeOperation, ? extends ExpOperation, ? extends FinalNodeOperation, ? extends ForkNodeOperation, ? extends ForkedTokenOperation, ? extends InitialNodeOperation, ? extends InputOperation, ? extends InputValueOperation, ? extends IntegerValueOperation, ? extends IntegerVariableOperation, ? extends JoinNodeOperation, ? extends MergeNodeOperation, ? extends NamedActivityOperation, ? extends OfferOperation, ? extends OpaqueActionOperation, ? extends TokenOperation, ? extends TraceOperation, ? extends ValueOperation, ? extends VariableOperation> alg;
  
  public ActivityEdgeOperationImpl(final ActivityEdge obj, final ActivitydiagramruntimeRevisitor<? extends ActionOperation, ? extends ActivityOperation, ? extends ActivityEdgeOperation, ? extends ActivityFinalNodeOperation, ? extends ActivityNodeOperation, ? extends BooleanValueOperation, ? extends BooleanVariableOperation, ? extends ContextOperation, ? extends ControlFlowOperation, ? extends ControlNodeOperation, ? extends ControlTokenOperation, ? extends DecisionNodeOperation, ? extends ExecutableNodeOperation, ? extends ExpOperation, ? extends FinalNodeOperation, ? extends ForkNodeOperation, ? extends ForkedTokenOperation, ? extends InitialNodeOperation, ? extends InputOperation, ? extends InputValueOperation, ? extends IntegerValueOperation, ? extends IntegerVariableOperation, ? extends JoinNodeOperation, ? extends MergeNodeOperation, ? extends NamedActivityOperation, ? extends OfferOperation, ? extends OpaqueActionOperation, ? extends TokenOperation, ? extends TraceOperation, ? extends ValueOperation, ? extends VariableOperation> alg) {
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
      _xblockexpression = IteratorExtensions.<Offer>toList(IteratorExtensions.<Offer>filter(offers, _function));
    }
    return _xblockexpression;
  }
  
  @Override
  public void sendOffer(final List<Token> tokens) {
    final Offer offer = ActivitydiagramruntimeFactory.eINSTANCE.createOffer();
    final Function1<Token, String> _function = (Token it) -> {
      String _plus = (it + " / ");
      ActivityNode _holder = it.getHolder();
      return (_plus + _holder);
    };
    List<String> _map = ListExtensions.<Token, String>map(tokens, _function);
    String _plus = ((((("Offer " + offer) + " created for ") + this.obj) + " with tokens ") + _map);
    InputOutput.<String>println(_plus);
    EList<EObject> _contents = this.obj.eResource().getContents();
    _contents.add(offer);
    final Consumer<Token> _function_1 = (Token it) -> {
      offer.getOfferedTokens().add(it);
    };
    tokens.forEach(_function_1);
    offer.setOwned(this.obj);
  }
  
  @Override
  public List<Token> takeOfferedTokens() {
    final ArrayList<Token> tokens = CollectionLiterals.<Token>newArrayList();
    final Consumer<Offer> _function = (Offer it) -> {
      tokens.addAll(it.getOfferedTokens());
    };
    this.alg.$(this.obj).offers().forEach(_function);
    final Consumer<Offer> _function_1 = (Offer it) -> {
      it.setOwned(null);
    };
    this.alg.$(this.obj).offers().forEach(_function_1);
    return tokens;
  }
  
  @Override
  public boolean hasOffer() {
    final Function1<Offer, Boolean> _function = (Offer it) -> {
      return Boolean.valueOf(this.alg.$(it).hasTokens());
    };
    return IterableExtensions.<Offer>exists(this.alg.$(this.obj).offers(), _function);
  }
}
