package fr.inria.diverse.ad.visitor.visitor;

import java.util.ArrayList;
import java.util.List;

import activitydiagram.ActivityEdge;
import activitydiagram.ActivityFinalNode;
import activitydiagram.ActivityNode;
import activitydiagram.DecisionNode;
import activitydiagram.ForkNode;
import activitydiagram.InitialNode;
import activitydiagram.JoinNode;
import activitydiagram.MergeNode;
import activitydiagram.OpaqueAction;
import activitydiagram.Token;
import activitydiagram.visitor.ActivityDiagramVisitor;
import activitydiagram.visitor.ActivityDiagramVisitorDefault;

public class ActivityNodeTakeOfferdTokensVisitor extends ActivityDiagramVisitorDefault<List<Token>> {

	private ActivityNodeTakeOfferdTokensVisitor() {
		
	}
	
	public final static ActivityNodeTakeOfferdTokensVisitor INSTANCE = new ActivityNodeTakeOfferdTokensVisitor();
	
	ActivityDiagramVisitor<List<Token>> activityNodeActivityNodeTakeOfferdTokensVisitor2;
	
	private ActivityDiagramVisitor<List<Token>> activityNodeActivityNodeTakeOfferdTokensVisitor2() {
		if(activityNodeActivityNodeTakeOfferdTokensVisitor2 == null) activityNodeActivityNodeTakeOfferdTokensVisitor2 = TokenTakeOfferedTokensVisitor.INSTANCe;
		return activityNodeActivityNodeTakeOfferdTokensVisitor2;
	}

	
	
	TokenWithdrawVisitor tokenWithdrawVisitor2;
	
	private TokenWithdrawVisitor tokenWithdrawVisitor() {
		if(tokenWithdrawVisitor2 == null) tokenWithdrawVisitor2 = TokenWithdrawVisitor.INSTANCe;
		return tokenWithdrawVisitor2;
	}
	

	TokenTakeOfferedTokensVisitor tokenTakeOfferedTokensVisitor2;
	
	private TokenTakeOfferedTokensVisitor tokenTakeOfferedTokensVisitor() {
		if(tokenTakeOfferedTokensVisitor2==null) tokenTakeOfferedTokensVisitor2 = TokenTakeOfferedTokensVisitor.INSTANCe;
		return tokenTakeOfferedTokensVisitor2;
	}

	private List<Token> visitActivityNode(final ActivityNode activityNode) {
		final List<Token> allTokens = new ArrayList<Token>();
		for (final ActivityEdge edge : activityNode.getIncoming()) {
			final List<Token> tokens = edge.accept(activityNodeActivityNodeTakeOfferdTokensVisitor2(), null);
			for (final Token token : tokens) {
				token.accept(this.tokenWithdrawVisitor(), null);
			}
			allTokens.addAll(tokens);
		}
		return allTokens;
	}

	@Override
	public List<Token> visitInitialNode(final InitialNode initialNode, Object ctx) {
		return this.visitActivityNode(initialNode);
	}

	@Override
	public List<Token> visitOpaqueAction(final OpaqueAction opaqueAction, Object ctx) {
		final List<Token> allTokens = new ArrayList<Token>();
		for (final ActivityEdge edge : opaqueAction.getIncoming()) {
			final List<Token> tokens = edge.accept(this.tokenTakeOfferedTokensVisitor(), null);
			for (final Token token : tokens) {
				token.accept(this.tokenWithdrawVisitor(), null);
			}
			allTokens.addAll(tokens);
		}
		return allTokens;
	}

	@Override
	public List<Token> visitActivityFinalNode(final ActivityFinalNode activityFinalNode, Object ctx) {
		final List<Token> allTokens = new ArrayList<Token>();
		for (final ActivityEdge edge : activityFinalNode.getIncoming()) {
			final List<Token> tokens = edge.accept(this.tokenTakeOfferedTokensVisitor(), null);
			for (final Token token : tokens) {
				token.accept(this.tokenWithdrawVisitor(), null);
			}
			allTokens.addAll(tokens);
		}
		return allTokens;
	}

	@Override
	public List<Token> visitForkNode(ForkNode forkNode, Object ctx) {
		final List<Token> allTokens = new ArrayList<Token>();
		for (final ActivityEdge edge : forkNode.getIncoming()) {
			final List<Token> tokens = edge.accept(tokenTakeOfferedTokensVisitor(), null);
			for (final Token token : tokens) {
				token.accept(tokenWithdrawVisitor(), null);
			}
			allTokens.addAll(tokens);
		}
		return allTokens;
	}

	@Override
	public List<Token> visitJoinNode(JoinNode joinNode, Object ctx) {
		final List<Token> allTokens = new ArrayList<Token>();
		for (final ActivityEdge edge : joinNode.getIncoming()) {
			final List<Token> tokens = edge.accept(activityNodeActivityNodeTakeOfferdTokensVisitor2(), null);
			for (final Token token : tokens) {
				token.accept(tokenWithdrawVisitor(), null);
			}
			allTokens.addAll(tokens);
		}
		return allTokens;
	}

	@Override
	public List<Token> visitDecisionNode(DecisionNode decisionNode, Object ctx) {
		final List<Token> allTokens = new ArrayList<Token>();
		for (final ActivityEdge edge : decisionNode.getIncoming()) {
			final List<Token> tokens = edge.accept(activityNodeActivityNodeTakeOfferdTokensVisitor2(), null);
			for (final Token token : tokens) {
				token.accept(tokenWithdrawVisitor(), null);
			}
			allTokens.addAll(tokens);
		}
		return allTokens;
	}

	@Override
	public List<Token> visitMergeNode(MergeNode mergeNode, Object ctx) {
		final List<Token> allTokens = new ArrayList<Token>();
		for (final ActivityEdge edge : mergeNode.getIncoming()) {
			final List<Token> tokens = edge.accept(activityNodeActivityNodeTakeOfferdTokensVisitor2(), null);
			for (final Token token : tokens) {
				token.accept(tokenWithdrawVisitor(), null);
			}
			allTokens.addAll(tokens);
		}
		return allTokens;
	}

}
