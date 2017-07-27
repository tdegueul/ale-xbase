package activitydiagram.visitor;

import activitydiagram.Activity;
import activitydiagram.ActivityFinalNode;
import activitydiagram.BooleanBinaryExpression;
import activitydiagram.BooleanUnaryExpression;
import activitydiagram.BooleanValue;
import activitydiagram.BooleanVariable;
import activitydiagram.ControlFlow;
import activitydiagram.ControlToken;
import activitydiagram.DecisionNode;
import activitydiagram.ForkNode;
import activitydiagram.ForkedToken;
import activitydiagram.InitialNode;
import activitydiagram.Input;
import activitydiagram.InputValue;
import activitydiagram.IntegerCalculationExpression;
import activitydiagram.IntegerComparisonExpression;
import activitydiagram.IntegerValue;
import activitydiagram.IntegerVariable;
import activitydiagram.JoinNode;
import activitydiagram.MergeNode;
import activitydiagram.Offer;
import activitydiagram.OpaqueAction;
import activitydiagram.Trace;

public abstract class ActivityDiagramVisitorDefault<T> implements ActivityDiagramVisitor<T> {

	@Override
	public T visitActivity(Activity activity, Object ctx) {

		throw new RuntimeException("not implemented");
	}

	@Override
	public T visitActivityFinalNode(ActivityFinalNode activityFinalNode, Object ctx) {

		throw new RuntimeException("not implemented");
	}

	@Override
	public T visitBooleanBinaryExpression(BooleanBinaryExpression booleanBinaryExpression, Object ctx) {

		throw new RuntimeException("not implemented");
	}

	@Override
	public T visitBooleanUnaryExpression(BooleanUnaryExpression booleanUnaryExpression, Object ctx) {

		throw new RuntimeException("not implemented");
	}

	@Override
	public T visitBooleanValue(BooleanValue booleanValue, Object ctx) {

		throw new RuntimeException("not implemented");
	}

	@Override
	public T visitBooleanVariable(BooleanVariable booleanVariable, Object ctx) {

		throw new RuntimeException("not implemented");
	}

	@Override
	public T visitControlFlow(ControlFlow controlFlow, Object ctx) {

		throw new RuntimeException("not implemented");
	}

	@Override
	public T visitControlToken(ControlToken controlToken, Object ctx) {

		throw new RuntimeException("not implemented");
	}

	@Override
	public T visitDecisionNode(DecisionNode decisionNode, Object ctx) {

		throw new RuntimeException("not implemented");
	}

	@Override
	public T visitForkedToken(ForkedToken forkedToken, Object ctx) {

		throw new RuntimeException("not implemented");
	}

	@Override
	public T visitForkNode(ForkNode forkNode, Object ctx) {

		throw new RuntimeException("not implemented");
	}

	@Override
	public T visitInitialNode(InitialNode initialNode, Object ctx) {

		throw new RuntimeException("not implemented");
	}

	@Override
	public T visitInput(Input input, Object ctx) {

		throw new RuntimeException("not implemented");
	}

	@Override
	public T visitInputValue(InputValue inputValue, Object ctx) {

		throw new RuntimeException("not implemented");
	}

	@Override
	public T visitIntegerCalculationExpression(IntegerCalculationExpression integerCalculationExpression, Object ctx) {

		throw new RuntimeException("not implemented");
	}

	@Override
	public T visitIntegerComparisonExpression(IntegerComparisonExpression integerComparisonExpression, Object ctx) {

		throw new RuntimeException("not implemented");
	}

	@Override
	public T visitIntegerValue(IntegerValue integerValue, Object ctx) {

		throw new RuntimeException("not implemented");
	}

	@Override
	public T visitIntegerVariable(IntegerVariable integerVariable, Object ctx) {

		throw new RuntimeException("not implemented");
	}

	@Override
	public T visitJoinNode(JoinNode joinNode, Object ctx) {

		throw new RuntimeException("not implemented");
	}

	@Override
	public T visitMergeNode(MergeNode mergeNode, Object ctx) {

		throw new RuntimeException("not implemented");
	}

	@Override
	public T visitOffer(Offer offer, Object ctx) {

		throw new RuntimeException("not implemented");
	}

	@Override
	public T visitOpaqueAction(OpaqueAction opaqueAction, Object ctx) {

		throw new RuntimeException("not implemented");
	}

	@Override
	public T visitTrace(Trace trace, Object ctx) {

		throw new RuntimeException("not implemented");
	}

}
