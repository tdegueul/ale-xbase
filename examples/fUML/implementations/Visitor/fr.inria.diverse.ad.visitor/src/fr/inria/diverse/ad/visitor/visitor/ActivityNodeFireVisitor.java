package fr.inria.diverse.ad.visitor.visitor;

import java.util.ArrayList;
import java.util.List;

import activitydiagram.ActivityEdge;
import activitydiagram.ActivityFinalNode;
import activitydiagram.ActivityNode;
import activitydiagram.ActivitydiagramFactory;
import activitydiagram.BooleanValue;
import activitydiagram.ControlFlow;
import activitydiagram.DecisionNode;
import activitydiagram.Expression;
import activitydiagram.ForkNode;
import activitydiagram.ForkedToken;
import activitydiagram.InitialNode;
import activitydiagram.JoinNode;
import activitydiagram.MergeNode;
import activitydiagram.OpaqueAction;
import activitydiagram.Token;
import activitydiagram.Value;
import activitydiagram.visitor.ActivityDiagramVisitorDefault;

public class ActivityNodeFireVisitor extends ActivityDiagramVisitorDefault<Void> {

	private ActivityNodeFireVisitor() {

	}

	public final static ActivityNodeFireVisitor INSTANCE = new ActivityNodeFireVisitor();

	ActivityEdgeSendOfferVisitor activityEdgeSendOfferVisitor;

	private ActivityEdgeSendOfferVisitor getSendOffer() {
		if (this.activityEdgeSendOfferVisitor == null) {
			this.activityEdgeSendOfferVisitor = ActivityEdgeSendOfferVisitor.INSTANCE;
		}

		return activityEdgeSendOfferVisitor;
	}

	ActivityTerminalVisitor activityTerminalVisitor;

	private ActivityTerminalVisitor getTerminal() {
		if (activityTerminalVisitor == null) {
			this.activityTerminalVisitor = ActivityTerminalVisitor.INSTANCE;
		}

		return activityTerminalVisitor;
	}

	TokenTransfertVisitor tokenTransfertVisitor;

	private TokenTransfertVisitor getTokenTransfer() {
		if (tokenTransfertVisitor == null)
			tokenTransfertVisitor = TokenTransfertVisitor.INSTANCe;
		return tokenTransfertVisitor;
	}

	ExpressionExecutionVisitor expressionExecuteVisitor;

	private ExpressionExecutionVisitor getExpressionExecute() {
		if (expressionExecuteVisitor == null)
			expressionExecuteVisitor = ExpressionExecutionVisitor.INSTANCE;
		return expressionExecuteVisitor;
	}

	@Override
	public Void visitActivityFinalNode(final ActivityFinalNode activityFinalNode, Object ctx) {
		// List<Token> tokens = (List<Token>) ctx;d
		activityFinalNode.getActivity().accept(ActivityNodeFireVisitor.this.getTerminal(), ctx);
		return null;
	}

	@Override
	public Void visitDecisionNode(final DecisionNode decisionNode, Object ctx) {
		List<Token> tokens = (List<Token>) ctx;
		ActivityEdge selectedEdge = null;
		for (final ActivityEdge edge : decisionNode.getOutgoing()) {
			if (edge instanceof ControlFlow) {
				final ControlFlow controlFlow = (ControlFlow) edge;
				final Value guardValue = controlFlow.getGuard().getCurrentValue();
				if (guardValue instanceof BooleanValue) {
					final BooleanValue booleanValue = (BooleanValue) guardValue;
					if (booleanValue.isValue()) {
						selectedEdge = edge;
						break;
					}
				}
			}
		}

		if (selectedEdge != null) {
			this.addTokensDecisionNode(tokens, decisionNode);
			selectedEdge.accept(ActivityNodeFireVisitor.this.getSendOffer(), tokens);
		}

		return null;

	}

	private void addTokensDecisionNode(final List<Token> tokens, final ActivityNode activityNode) {
		for (final Token token : tokens) {
			final Token transferredToken = token.accept(ActivityNodeFireVisitor.this.getTokenTransfer(),
					activityNode);
			activityNode.getHeldTokens().add(transferredToken);
		}

	}

	@Override
	public Void visitInitialNode(final InitialNode initialNode, Object ctx) {
		List<Token> tokens = (List<Token>) ctx;
		final List<Token> producedTokens = new ArrayList<Token>();
		producedTokens.add(ActivitydiagramFactory.eINSTANCE.createControlToken());
		this.addTokensInitialNode(producedTokens, initialNode);
		this.sendOffersInitialNode(producedTokens, initialNode);
		return null;
	}

	private void sendOffersInitialNode(final List<Token> tokens, final InitialNode initialNode) {
		for (final ActivityEdge edge : initialNode.getOutgoing()) {
			edge.accept(ActivityNodeFireVisitor.this.getSendOffer(), tokens); // .sendOffer(tokens);
		}

	}

	private void addTokensInitialNode(final List<Token> tokens, final InitialNode initialNode) {
		for (final Token token : tokens) {
			final Token transferredToken = token.accept(ActivityNodeFireVisitor.this.getTokenTransfer(),
					initialNode);
			initialNode.getHeldTokens().add(transferredToken);
		}

	}

	@Override
	public Void visitOpaqueAction(final OpaqueAction opaqueAction, Object ctx) {
		List<Token> tokens = (List<Token>) ctx;
		this.doActionOpaqueAction(opaqueAction);
		this.sendOffersOpaqueAction(opaqueAction);
		return null;
	}

	private void sendOffersOpaqueAction(final OpaqueAction opaqueAction) {
		if (opaqueAction.getOutgoing().size() > 0) {
			final List<Token> tokens = new ArrayList<Token>();
			tokens.add(ActivitydiagramFactory.eINSTANCE.createControlToken());
			this.addTokensOpaqueAction(tokens, opaqueAction);
			final ActivityEdge activityEdge = opaqueAction.getOutgoing().get(0);
			activityEdge.accept(ActivityNodeFireVisitor.this.getSendOffer(), tokens);
		}

	}

	private void addTokensOpaqueAction(final List<Token> tokens, final ActivityNode activityNode) {
		for (final Token token : tokens) {
			final Token transferredToken = token.accept(ActivityNodeFireVisitor.this.getTokenTransfer(),
					activityNode);
			activityNode.getHeldTokens().add(transferredToken);
		}

	}

	private void doActionOpaqueAction(final OpaqueAction opaqueAction) {
		for (final Expression e : opaqueAction.getExpressions()) {
			e.accept(ActivityNodeFireVisitor.this.getExpressionExecute(), null);
		}

	}

	@Override
	public Void visitForkNode(final ForkNode forkNode, Object ctx) {
		List<Token> tokens = (List<Token>) ctx;
		final List<Token> forkedTokens = new ArrayList<Token>();
		for (final Token token : tokens) {
			final ForkedToken forkedToken = ActivitydiagramFactory.eINSTANCE.createForkedToken();
			forkedToken.setBaseToken(token);
			forkedToken.setRemainingOffersCount(forkNode.getOutgoing().size());
			forkedTokens.add(forkedToken);
		}
		this.addTokensForkNode(forkedTokens, forkNode);
		this.sendOffersForkNode(forkedTokens, forkNode);
		return null;
	}

	private void sendOffersForkNode(final List<Token> tokens, final ForkNode forkNode) {
		for (final ActivityEdge edge : forkNode.getOutgoing()) {
			edge.accept(ActivityNodeFireVisitor.this.getSendOffer(), tokens);
		}

	}

	private void addTokensForkNode(final List<Token> tokens, final ForkNode forkNode) {
		for (final Token token : tokens) {
			final Token transferredToken = token.accept(ActivityNodeFireVisitor.this.getTokenTransfer(), forkNode);
			forkNode.getHeldTokens().add(transferredToken);
		}

	}

	@Override
	public Void visitJoinNode(JoinNode joinNode, Object ctx) {
		List<Token> tokens = (List<Token>) ctx;
		this.addTokensJoinNode(tokens, joinNode);
		this.sendOffersJoinNode(tokens, joinNode);
		return null;
	}

	private void sendOffersJoinNode(List<Token> tokens, JoinNode joinNode) {
		for (final ActivityEdge edge : joinNode.getOutgoing()) {
			edge.accept(getSendOffer(), tokens);
		}

	}

	private void addTokensJoinNode(List<Token> tokens, ActivityNode activityNode) {
		for (final Token token : tokens) {
			final Token transferredToken = token.accept(getTokenTransfer(), activityNode);
			activityNode.getHeldTokens().add(transferredToken);
		}

	}

	@Override
	public Void visitMergeNode(MergeNode mergeNode, Object ctx) {

		List<Token> tokens = (List<Token>) ctx;
		this.addTokensMergeNode(tokens, mergeNode);
		this.sendOffersMergeNode(tokens, mergeNode);

		return null;
	}

	private void sendOffersMergeNode(List<Token> tokens, MergeNode mergeNode) {
		for (final ActivityEdge edge : mergeNode.getOutgoing()) {
			edge.accept(getSendOffer(), tokens);
		}

	}

	private void addTokensMergeNode(List<Token> tokens, MergeNode mergeNode) {
		for (final Token token : tokens) {
			final Token transferredToken = token.accept(getTokenTransfer(), mergeNode);
			mergeNode.getHeldTokens().add(transferredToken);
		}

	}

}
